package jp.or.twg.twg_edi.master.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.CountDSL;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import jp.or.twg.twg_edi.common.difinition.OptPlaceType;
import jp.or.twg.twg_edi.common.difinition.RoleType;
import jp.or.twg.twg_edi.common.difinition.SqlStatement;
import jp.or.twg.twg_edi.common.entity.OptPlace;
import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.mapper.OptPlaceDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptPlaceMapper;
import jp.or.twg.twg_edi.common.mapper.PlaceMapper;
import jp.or.twg.twg_edi.common.mapper.UsersDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.UsersMapper;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.service.NumberingService;
import jp.or.twg.twg_edi.common.utility.CipherUtil;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.master.model.UserForm;
import jp.or.twg.twg_edi.master.model.UserSearchCondition;
import lombok.RequiredArgsConstructor;

/**
 * ユーザ登録　サービスクラス
 *
 * @author yamaguchiha
 *
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class MasterUserService {

	private final UsersMapper usersMapper;
	private final PlaceMapper placeMapper;
	private final OptPlaceMapper optPlaceMapper;
	private final NumberingService numberingService;

	/** 暗号化パラメータ */
	public static interface CIPHER_PARAM {
		/** アルゴリズム */
		public static final String ALGORITHM = "AES";

		/** キー 16文字 */
		public static final String KEY = "Kazura Jama User";
	}

	/**
	 * 暗号化
	 *
	 * @param clearText 平文
	 * @return 暗号文
	 */
	public static String encrypt(String clearText) {
		return new CipherUtil(CIPHER_PARAM.ALGORITHM, CIPHER_PARAM.KEY).encrypt(clearText);
	}

	/**
	 * 復号化
	 *
	 * @param cipherText 暗号文
	 * @return 平文
	 */
	public static String decrypt(String cipherText) {
		return new CipherUtil(CIPHER_PARAM.ALGORITHM, CIPHER_PARAM.KEY).decrypt(cipherText);
	}

	/**
	 * ユーザ一覧を取得する
	 *   セッションからログイン情報を取得して企業を特定し、その企業の事業所一覧を取得
	 *   その事業所に所属するユーザ情報を取得する
	 *
	 * @return
	 */
	public List<Users> getList() {
		// ログインユーザから企業を取得
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	UserSession session = (UserSession)obj;
    	Party myParty = session.getMyParty();

    	// 企業に属する事業所を取得する
		List<Long> placeOidList = placeMapper.selectByPartyOid(myParty.getOid());

		// Usersテーブルからユーザ情報取得
		SelectStatementProvider selectStatementUsers = SqlBuilder.select(UsersMapper.selectList)
				.from(UsersDynamicSqlSupport.users)
				.where(UsersDynamicSqlSupport.defaultPlaceOid, SqlBuilder.isIn(placeOidList))
				.orderBy(SqlBuilder.sortColumn(UsersDynamicSqlSupport.userId.name()))
				.build()
				.render(RenderingStrategies.MYBATIS3);

		List<Users> users = usersMapper.selectMany(selectStatementUsers);
		if(!users.isEmpty()) {
			return users;
		} else {
			return new ArrayList<Users>();
		}
	}

	/**
	 * 条件に一致するユーザ一覧を取得する
	 *   セッションからログイン情報を取得して企業を特定し、その企業の事業所一覧を取得
	 *   その事業所に所属するユーザ情報を取得する
	 *
	 * @return
	 */
	public List<Users> getListByCondition(UserSearchCondition condition) {

		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = SqlBuilder.select(UsersMapper.selectList)
				.from(UsersDynamicSqlSupport.users)
				.where();

		if(condition.getSrhInMaintenance().equals(SqlStatement.USERS_ONLY)) {
			// 管理者、運用者、検索者、出荷場担当者
			builder.where(UsersDynamicSqlSupport.roleType, SqlBuilder.isIn(RoleType.ADMINISTRATOR.getId(),RoleType.OPERATOR.getId(),RoleType.SEARCHER.getId(),RoleType.OPTUSER.getId()));
		} else {
			// システム除く全て
			builder.where(UsersDynamicSqlSupport.roleType, SqlBuilder.isNotIn(RoleType.WORKER.getId()));
		}

		if(!CommonDataUtil.isNullOrEmpty(condition.getSrhUserId())) {
			String condUserId = condition.getSrhUserIdType().equals(SqlStatement.PREFIX_MATCH) ? condition.getSrhUserId().concat(SqlStatement.WILDCARD) : SqlStatement.WILDCARD.concat(condition.getSrhUserId()).concat(SqlStatement.WILDCARD);
			builder.and(UsersDynamicSqlSupport.userId, SqlBuilder.isLike(condUserId));
		}

		if(!CommonDataUtil.isNullOrEmpty(condition.getSrhName())) {
			String condName = condition.getSrhNameType().equals(SqlStatement.PREFIX_MATCH) ? condition.getSrhName().concat(SqlStatement.WILDCARD) : SqlStatement.WILDCARD.concat(condition.getSrhName()).concat(SqlStatement.WILDCARD);
			builder.and(UsersDynamicSqlSupport.name, SqlBuilder.isLike(condName));
		}
		builder.orderBy(SqlBuilder.sortColumn(UsersDynamicSqlSupport.userId.name()));


		SelectStatementProvider selectStatementUsers = builder.build().render(RenderingStrategies.MYBATIS3);
		List<Users> users = usersMapper.selectMany(selectStatementUsers);
		if(!users.isEmpty()) {
			return users;
		} else {
			return new ArrayList<Users>();
		}
	}

	/**
	 * 条件に一致するユーザ一覧を取得する(Pageer版)
	 *   セッションからログイン情報を取得して企業を特定し、その企業の事業所一覧を取得
	 *   その事業所に所属するユーザ情報を取得する
	 *
	 * @return
	 */
	public Page<Users> getListByCondition(Pageable pageable, UserSearchCondition condition) {

		CountDSL<SelectModel>.CountWhereBuilder builderCount = SqlBuilder.countFrom(UsersDynamicSqlSupport.users)
				.where();
		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = SqlBuilder.select(UsersMapper.selectList)
				.from(UsersDynamicSqlSupport.users)
				.where();

		if(condition.getSrhInMaintenance().equals(SqlStatement.USERS_ONLY)) {
			// 管理者、運用者、検索者、出荷場担当者
			builderCount.where(UsersDynamicSqlSupport.roleType, SqlBuilder.isIn(RoleType.ADMINISTRATOR.getId(),RoleType.OPERATOR.getId(),RoleType.SEARCHER.getId(),RoleType.OPTUSER.getId()));
			builder.where(UsersDynamicSqlSupport.roleType, SqlBuilder.isIn(RoleType.ADMINISTRATOR.getId(),RoleType.OPERATOR.getId(),RoleType.SEARCHER.getId(),RoleType.OPTUSER.getId()));
		} else {
			// システム除く全て
			builderCount.where(UsersDynamicSqlSupport.roleType, SqlBuilder.isNotIn(RoleType.WORKER.getId()));
			builder.where(UsersDynamicSqlSupport.roleType, SqlBuilder.isNotIn(RoleType.WORKER.getId()));
		}

		if(!CommonDataUtil.isNullOrEmpty(condition.getSrhUserId())) {
			String condUserId = condition.getSrhUserIdType().equals(SqlStatement.PREFIX_MATCH) ? condition.getSrhUserId().concat(SqlStatement.WILDCARD) : SqlStatement.WILDCARD.concat(condition.getSrhUserId()).concat(SqlStatement.WILDCARD);
			builderCount.and(UsersDynamicSqlSupport.userId, SqlBuilder.isLike(condUserId));
			builder.and(UsersDynamicSqlSupport.userId, SqlBuilder.isLike(condUserId));
		}

		if(!CommonDataUtil.isNullOrEmpty(condition.getSrhName())) {
			String condName = condition.getSrhNameType().equals(SqlStatement.PREFIX_MATCH) ? condition.getSrhName().concat(SqlStatement.WILDCARD) : SqlStatement.WILDCARD.concat(condition.getSrhName()).concat(SqlStatement.WILDCARD);
			builderCount.and(UsersDynamicSqlSupport.name, SqlBuilder.isLike(condName));
			builder.and(UsersDynamicSqlSupport.name, SqlBuilder.isLike(condName));
		}
		builder.orderBy(SqlBuilder.sortColumn(UsersDynamicSqlSupport.userId.name()));


		SelectStatementProvider countStatementUsers = builderCount.build().render(RenderingStrategies.MYBATIS3);
		long count = usersMapper.count(countStatementUsers);

		// pager用
//		builder.limit(pageable.getPageSize());
		// pageSizeはpageableではなく検索条件から取得
		builder.limit(condition.getPageSize());
		builder.offset(pageable.getOffset());

		SelectStatementProvider selectStatementUsers = builder.build().render(RenderingStrategies.MYBATIS3);
		List<Users> users = usersMapper.selectMany(selectStatementUsers);

		return new PageImpl<>(users, pageable, count);
	}

	/**
	 * 自工区OIDから出荷場所のプルダウンリスト取得
	 * @return
	 */
	public Map<String, String> getShipmentHTMLList(Long placeOid) {
		Map<String, String> shipmentMap = new LinkedHashMap<String, String>();
		shipmentMap.put(OptPlaceType.ALL.getName(), OptPlaceType.ALL.getName());
		shipmentMap.put(OptPlaceType.DISABLE.getName(), OptPlaceType.DISABLE.getName());

		// OptPlaceテーブルから指定した出荷場所を取得(すべてと使用不可は取得しない）
		SelectStatementProvider selectStatementOptPlace = SqlBuilder.select(OptPlaceMapper.selectList)
				.from(OptPlaceDynamicSqlSupport.optPlace)
				.where(OptPlaceDynamicSqlSupport.ownPlaceOid, SqlBuilder.isEqualTo(placeOid))
				.and(OptPlaceDynamicSqlSupport.discharge, SqlBuilder.isEqualTo(SqlStatement.VALUE_N))
				.and(OptPlaceDynamicSqlSupport.optPlaceType, SqlBuilder.isEqualTo(OptPlaceType.NORMAL.getId()))
				.orderBy(SqlBuilder.sortColumn(OptPlaceDynamicSqlSupport.code.name()))
				.build()
				.render(RenderingStrategies.MYBATIS3);

		List<OptPlace> optPlaces = optPlaceMapper.selectMany(selectStatementOptPlace);
		if(!optPlaces.isEmpty()) {
			for(OptPlace optPlace :optPlaces) {
				shipmentMap.put(optPlace.getCode(), optPlace.getName());
			}
			return shipmentMap;
		} else {
			return shipmentMap;
		}
	}

	/**
	 * 自工区OIDから納入場所のプルダウンリスト取得
	 * @return
	 */
	public Map<String, String> getDeliveryHTMLList(Long placeOid) {
		Map<String, String> deliverryMap = new LinkedHashMap<String, String>();
		deliverryMap.put(OptPlaceType.ALL.getName(), OptPlaceType.ALL.getName());
		deliverryMap.put(OptPlaceType.DISABLE.getName(), OptPlaceType.DISABLE.getName());

		// OptPlaceテーブルから指定した納入場所を取得(すべてと使用不可は取得しない）
		SelectStatementProvider selectStatementOptPlace = SqlBuilder.select(OptPlaceMapper.selectList)
				.from(OptPlaceDynamicSqlSupport.optPlace)
				.where(OptPlaceDynamicSqlSupport.ownPlaceOid, SqlBuilder.isEqualTo(placeOid))
				.and(OptPlaceDynamicSqlSupport.discharge, SqlBuilder.isEqualTo(SqlStatement.VALUE_Y))
				.and(OptPlaceDynamicSqlSupport.optPlaceType, SqlBuilder.isEqualTo(OptPlaceType.NORMAL.getId()))
				.orderBy(SqlBuilder.sortColumn(OptPlaceDynamicSqlSupport.code.name()))
				.build()
				.render(RenderingStrategies.MYBATIS3);

		List<OptPlace> optPlaces = optPlaceMapper.selectMany(selectStatementOptPlace);
		if(!optPlaces.isEmpty()) {
			for(OptPlace optPlace :optPlaces) {
				deliverryMap.put(optPlace.getCode(), optPlace.getName());
			}
			return deliverryMap;
		} else {
			return deliverryMap;
		}
	}

	/**
	 * 指定したOIDでOPT_PLACEのCODEを返す
	 * @param deliveryOid
	 * @return
	 */
	public String getOptPlaceCode(Long oid) {
		Optional<OptPlace> obj = optPlaceMapper.selectByPrimaryKey(oid);
		if(obj.isEmpty()) {
			return null;
		} else {
			return obj.get().getCode();
		}
	}

	/**
	 * ユーザOIDでUsersを返す
	 *
	 * @param userOid
	 * @return
	 */
	public Users getUserInfo(Long userOid) {
		Users result = null;

		Optional<Users> obj = usersMapper.selectByPrimaryKey(userOid);
		if(!obj.isEmpty()) {
			result = obj.get();
			String clearTextPassword = decrypt(result.getPassword());
			result.setPassword(clearTextPassword);
		}
		return result;
	}

	/**
	 * ユーザ情報をDBに保存
	 *
	 * @param userForm
	 */
	public void saveUsers(UserForm userForm) {
		SelectStatementProvider selectStatementOptPlace = null;
		Optional<OptPlace> optPlace = null;

		Users user = new Users();

		user.setUserId(userForm.getIptUserId());
		user.setDefaultPlaceOid(Long.valueOf(userForm.getDefaultPlaceOid()));
		user.setName(userForm.getIptName());
		user.setPassword(encrypt(userForm.getIptPassword()));
		user.setRoleType(userForm.getRoleTypeId());

		userForm.getSelectPlaces();
		StringJoiner sj = new StringJoiner(",");
		Arrays.stream(userForm.getSelectPlaces()).forEach(i -> sj.add(String.valueOf(i)));
		user.setEnabledPlaceOidValues(sj.toString());

		if(!CommonDataUtil.isNullOrEmpty(userForm.getSelectDelivery())) {
			// OptPlaceテーブルから指定した納入場所を取得
			selectStatementOptPlace = SqlBuilder.select(OptPlaceMapper.selectList)
					.from(OptPlaceDynamicSqlSupport.optPlace)
					.where(OptPlaceDynamicSqlSupport.ownPlaceOid, SqlBuilder.isEqualTo(Long.valueOf(userForm.getDefaultPlaceOid())))
					.and(OptPlaceDynamicSqlSupport.discharge, SqlBuilder.isEqualTo(SqlStatement.VALUE_Y))
					.and(OptPlaceDynamicSqlSupport.code, SqlBuilder.isEqualTo(userForm.getSelectDelivery()))
					.orderBy(SqlBuilder.sortColumn(OptPlaceDynamicSqlSupport.code.name()))
					.build()
					.render(RenderingStrategies.MYBATIS3);
			optPlace = optPlaceMapper.selectOne(selectStatementOptPlace);
			user.setDischargeOid(optPlace.get().getOid());
		}

		if(!CommonDataUtil.isNullOrEmpty(userForm.getSelectShipment())) {
			// OptPlaceテーブルから指定した納入場所を取得
			selectStatementOptPlace = SqlBuilder.select(OptPlaceMapper.selectList)
					.from(OptPlaceDynamicSqlSupport.optPlace)
					.where(OptPlaceDynamicSqlSupport.ownPlaceOid, SqlBuilder.isEqualTo(Long.valueOf(userForm.getDefaultPlaceOid())))
					.and(OptPlaceDynamicSqlSupport.discharge, SqlBuilder.isEqualTo(SqlStatement.VALUE_N))
					.and(OptPlaceDynamicSqlSupport.code, SqlBuilder.isEqualTo(userForm.getSelectShipment()))
					.orderBy(SqlBuilder.sortColumn(OptPlaceDynamicSqlSupport.code.name()))
					.build()
					.render(RenderingStrategies.MYBATIS3);
			optPlace = optPlaceMapper.selectOne(selectStatementOptPlace);
			user.setLoadingOid(optPlace.get().getOid());
		}

		if(CommonDataUtil.isNullOrEmpty(userForm.getUserOid())) {
			user.setOid(numberingService.getOid(Users.class.getName()));

			// INSERT
			usersMapper.insert(user);
		} else {
			user.setOid(Long.valueOf(userForm.getUserOid()));

			// UPDATE
			usersMapper.updateByPrimaryKey(user);
		}
	}

	/**
	 * ユーザ情報をDBに保存
	 *
	 * @param userForm
	 */
	public void deleteUsers(UserForm userForm) {

		// DELETE
		usersMapper.deleteByPrimaryKey(Long.valueOf(userForm.getUserOid()));
	}

	/**
	 * ユーザID重複確認(存在しないならtrue、存在するならfalse）
	 *
	 * @param userForm
	 */
	public boolean checkUserId(String userId) {
		SelectStatementProvider selectStatementUsers = SqlBuilder.select(UsersMapper.selectList)
				.from(UsersDynamicSqlSupport.users)
				.where(UsersDynamicSqlSupport.userId, SqlBuilder.isEqualTo(userId))
				.build()
				.render(RenderingStrategies.MYBATIS3);
		Optional<Users> obj = usersMapper.selectOne(selectStatementUsers);
		return obj.isEmpty();
	}
}
