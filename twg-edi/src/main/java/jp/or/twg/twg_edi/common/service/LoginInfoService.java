package jp.or.twg.twg_edi.common.service;

import java.util.Optional;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.PartySetting;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.PlaceSetting;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.mapper.PartyDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.PartyMapper;
import jp.or.twg.twg_edi.common.mapper.PartySettingDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.PartySettingMapper;
import jp.or.twg.twg_edi.common.mapper.PlaceDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.PlaceMapper;
import jp.or.twg.twg_edi.common.mapper.PlaceSettingDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.PlaceSettingMapper;
import jp.or.twg.twg_edi.common.mapper.UsersDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.UsersMapper;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.master.service.MasterUserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class LoginInfoService {

	//------------Added yamaguchiha ------------------

	private final UsersMapper usersMapper;
	private final PartyMapper partyMapper;
	private final PartySettingMapper partySettingMapper;
	private final PlaceMapper placeMapper;
	private final PlaceSettingMapper placeSettingMapper;

	private Users myUsers = null;
	private Party myParty = null;
	private PartySetting myPartySetting = null;
	private Place myPlace = null;
	private PlaceSetting myPlaceSetting = null;

	/**
	 * ユーザ情報取得
	 * @return
	 */
	public Users getMyUsers() {
		return myUsers;
	}

	/**
	 * 自企業取得
	 * @return
	 */
	public Party getMyParty() {
		return myParty;
	}

	/**
	 * 自工区取得
	 * @return
	 */
	public Place getMyPlace() {
		return myPlace;
	}

	/**
	 * 自企業設定の取得
	 * @return
	 */
	public PartySetting getMyPartySetting() {
		return myPartySetting;
	}

	/**
	 * 自工区設定の取得
	 * @return
	 */
	public PlaceSetting getMyPlaceSetting() {
		return myPlaceSetting;
	}

	/**
	 * ユーザ、パスワードチェック
	 * 保守ユーザの場合はユーザID＋"_"＋TDBコードをuserIdに指定する
	 * パスワードは平文
	 *
	 * @param userId
	 * @param password
	 * @return
	 */
	public boolean chkUserPasswd(String userId, String password) {
		String cipherTextPassword = MasterUserService.encrypt(password);

		// Usersテーブルからユーザ情報取得
		SelectStatementProvider selectStatementUsers = SqlBuilder.select(UsersMapper.selectList)
				.from(UsersDynamicSqlSupport.users)
				.where(UsersDynamicSqlSupport.userId, SqlBuilder.isEqualTo(userId))
				.and(UsersDynamicSqlSupport.password, SqlBuilder.isEqualTo(cipherTextPassword))
				.build()
				.render(RenderingStrategies.MYBATIS3);
		Optional<Users> users = usersMapper.selectOne(selectStatementUsers);
		if(users.isEmpty()) {
			return false;
		}
		return true;
	}

	/**
	 * OTからの遷移情報からUsersを作成
	 *
	 * @param userid
	 * @param partyCd
	 * @param placeCd
	 */
	public boolean initialize(String userId, String partyCd, String placeCd) {
		if(CommonDataUtil.isNullOrEmpty(userId) || CommonDataUtil.isNullOrEmpty(partyCd) || CommonDataUtil.isNullOrEmpty(placeCd)) {
			// エラーメッセージが必要？
			return false;
		}

		// Usersテーブルからユーザ情報取得
		SelectStatementProvider selectStatementUsers = SqlBuilder.select(UsersMapper.selectList)
				.from(UsersDynamicSqlSupport.users)
				.where(UsersDynamicSqlSupport.userId, SqlBuilder.isEqualTo(userId))
				.build()
				.render(RenderingStrategies.MYBATIS3);
		Optional<Users> users = usersMapper.selectOne(selectStatementUsers);
		if(!users.isEmpty()) {
			myUsers = users.get();
		} else {
			return false;
		}

		// Partyテーブルから自企業取得
		SelectStatementProvider selectStatementParty = SqlBuilder.select(PartyMapper.selectList)
				.from(PartyDynamicSqlSupport.party)
				.where(PartyDynamicSqlSupport.tdbPartyCode, SqlBuilder.isEqualTo(partyCd))
				.build()
				.render(RenderingStrategies.MYBATIS3);
		Optional<Party> party = partyMapper.selectOne(selectStatementParty);
		if(!party.isEmpty()) {
			myParty = party.get();
		} else {
			return false;
		}

		// Placeテーブルから自工区取得
		SelectStatementProvider selectStatementPlace = SqlBuilder.select(PlaceMapper.selectList)
				.from(PlaceDynamicSqlSupport.place)
				.where(PlaceDynamicSqlSupport.tdbPlaceCode, SqlBuilder.isEqualTo(placeCd))
				.and(PlaceDynamicSqlSupport.partyOid, SqlBuilder.isEqualTo(myParty.getOid()))
				.build()
				.render(RenderingStrategies.MYBATIS3);
		Optional<Place> place = placeMapper.selectOne(selectStatementPlace);
		if(!place.isEmpty()) {
			myPlace = place.get();
		} else {
			return false;
		}

		// myPlaceの自工区OIDを取得して自企業の設定情報を取得
		SelectStatementProvider selectStatementPartySetting = SqlBuilder.select(PartySettingMapper.selectList)
				.from(PartySettingDynamicSqlSupport.partySetting)
				.where(PartySettingDynamicSqlSupport.ownPlaceOid, SqlBuilder.isEqualTo(myPlace.getOid()))
				.and(PartySettingDynamicSqlSupport.partyOid, SqlBuilder.isEqualTo(myParty.getOid()))
				.build()
				.render(RenderingStrategies.MYBATIS3);
		Optional<PartySetting> partySetting = partySettingMapper.selectOne(selectStatementPartySetting);
		if(!partySetting.isEmpty()) {
			myPartySetting = partySetting.get();
		} else {
			myPartySetting = new PartySetting();
			myPartySetting.setAbbrCode(myParty.getTdbPartyCode());
		}

		// myPlaceの自工区OIDを取得して自工区の設定情報を取得
		SelectStatementProvider selectStatementPlaceSetting = SqlBuilder.select(PlaceSettingMapper.selectList)
				.from(PlaceSettingDynamicSqlSupport.placeSetting)
				.where(PlaceSettingDynamicSqlSupport.ownPlaceOid, SqlBuilder.isEqualTo(myPlace.getOid()))
				.and(PlaceSettingDynamicSqlSupport.placeOid, SqlBuilder.isEqualTo(myPlace.getOid()))
				.build()
				.render(RenderingStrategies.MYBATIS3);
		Optional<PlaceSetting> placeSetting = placeSettingMapper.selectOne(selectStatementPlaceSetting);
		if(!placeSetting.isEmpty()) {
			myPlaceSetting = placeSetting.get();
		} else {
			myPlaceSetting = null;
		}

		// セッションに格納
		UserSession userSession = new UserSession();
		userSession.setMyParty(myParty);
		userSession.setMyPlace(myPlace);
		userSession.setMyUsers(myUsers);
		userSession.setMyPartySetting(myPartySetting);
		userSession.setMyPlaceSetting(myPlaceSetting);
		userSession.setFunctionLimited(true);
		userSession.setSupplyfuncLimited(true);
		userSession.setNotOperatorOrSearcher(true);				// マスタ管理
		userSession.setNotOperatorOrSearcherOrOptUser(true);	// システム管理
		userSession.setKanbanDeljitContracted(true);
		userSession.setKanbanDeljitSlimContracted(true);
		RequestContextHolder.getRequestAttributes().setAttribute("session", userSession, RequestAttributes.SCOPE_SESSION);

		return true;
	}



}
