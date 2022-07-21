package jp.or.twg.twg_edi.kanban.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.difinition.OptionThreadCategory;
import jp.or.twg.twg_edi.common.difinition.OptionThreadStatus;
import jp.or.twg.twg_edi.common.entity.OptionShipment;
import jp.or.twg.twg_edi.common.entity.OptionShipmentSetting;
import jp.or.twg.twg_edi.common.entity.OptionThreadManager;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.mapper.OptionKanbanCycleDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionShipmentDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionShipmentMapper;
import jp.or.twg.twg_edi.common.mapper.OptionShipmentSettingDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionShipmentSettingMapper;
import jp.or.twg.twg_edi.common.mapper.OptionThreadManagerMapper;
import jp.or.twg.twg_edi.common.mapper.PartyDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.PlaceDynamicSqlSupport;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.service.OptionThreadManagerMapperParam;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import lombok.RequiredArgsConstructor;

/**
 * かんばん納入指示　サービスクラス
 * @author nishidat
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class InboundKanbanDeljitService {

	private final OptionThreadManagerMapper optionThreadManagerMapper; 
	
	private final OptionShipmentMapper optionShipmentMapper;
	private final OptionShipmentSettingMapper optionShipmentSettingMapper;

	private final PartyPlaceService partyPlaceService;
	/**
	 * かんばん納入指示送信履歴一覧リストの取得
	 * @param userSession ログイン情報
	 * @return 納入指示送信履歴リストの取得
	 */
	public List<OptionThreadManagerBean> getUnissuedDownloadList(UserSession userSession) {

		Users users = userSession.getMyUsers();
		Place userPlace = userSession.getMyPlace();

		Date today = DateUtility.getDateWith0Oclock(new Date());

		OptionThreadManagerMapperParam param = new OptionThreadManagerMapperParam();
		param.setSrhUsersOid(users.getOid());
		param.setSrhUserPlaceOid(userPlace.getOid());
		param.setSrhThreadCategory(OptionThreadCategory.MakeKanbanOrderService.name());
		param.setSrhCloseOutTimeToday(today);
		param.setSrhCloseOutTimeNext(DateUtility.getDateForward(today, 1));
		List<OptionThreadManager> optionThreadManagerList = this.optionThreadManagerMapper.selectUnissuedDownloadList(param);

		// 企業・事業所サービスの初期化
		this.partyPlaceService.initialize(userSession.getMyParty().getTdbPartyCode(), userPlace.getTdbPlaceCode());

		List<OptionThreadManagerBean> list = new ArrayList<OptionThreadManagerBean>();
		OptionThreadManagerBean bean;
		Optional<OptionThreadManager> optionThreadManager;
		OptionThreadManager entity;
		for(OptionThreadManager target : optionThreadManagerList) {
			//IDでデータの再取得
			optionThreadManager = this.optionThreadManagerMapper.selectByPrimaryKey(target.getId());

			// リストデータ作成
			bean = new OptionThreadManagerBean();
			if(!optionThreadManager.isEmpty()) {
				entity = optionThreadManager.get();
				bean.setThreadManager(entity);

				bean.setParty(this.partyPlaceService.getParty(entity.getPartyOid()));
				bean.setPlace(this.partyPlaceService.getPlace(entity.getPlaceOid()));
				if(bean.getParty() != null) {
					bean.setPartySetting(this.partyPlaceService.getPartySetting(bean.getParty().getTdbPartyCode()));
					if(bean.getPlace() != null) {
						bean.setPlaceSetting(this.partyPlaceService.getPlaceSetting(bean.getParty().getTdbPartyCode()
																		  		  , bean.getPlace().getTdbPlaceCode()));
					}
				}
			}
			list.add(bean);
		}

		return list;
	}

	/**
	 * 納入指示送信実行状況の取得
	 * @param userSession
	 * @return 納入指示送信の実行有無
	 */
	public boolean isRunKanbanOrder(UserSession userSession) {

		Users users = userSession.getMyUsers();
		Place userPlace = userSession.getMyPlace();

		Date today = DateUtility.getDateWith0Oclock(new Date());

		OptionThreadManagerMapperParam param = new OptionThreadManagerMapperParam();
		param.setSrhUsersOid(users.getOid());
		param.setSrhUserPlaceOid(userPlace.getOid());
		param.setSrhThreadCategory(OptionThreadCategory.MakeKanbanOrderService.name());
		param.setSrhThreadStatus(OptionThreadStatus.RUNNING.name());
		param.setSrhCloseOutTimeToday(today);
		param.setSrhCloseOutTimeNext(DateUtility.getDateForward(today, 1));
		int count = this.optionThreadManagerMapper.selectRunKanbanOrder(param);

		return count != 0;
	}

	/**
	 * 納入指示テーブル指定
	 * @param userSession
	 * @return
	 */
	public Map<String, String> getItemTypeHtmlList(UserSession userSession) {
		Map<String, String> tableNoMap = new LinkedHashMap<String, String>();
		List<OptionShipment> optionShipmentList = this.getOptionShipment(userSession);

		// 初期表示用の文言をセット	TODO：どこかで共通化？
		tableNoMap.put(null, "--- 選択");

		for(OptionShipment optionShipment : optionShipmentList) {
			tableNoMap.put(Integer.toString(optionShipment.getTableNo())
						 , Integer.toString(optionShipment.getTableNo()));
		}
		return tableNoMap;
	}

	/**
	 * 納入指示テーブル取得
	 * @param userSession
	 * @return
	 */
	public List<OptionShipment> getOptionShipment(UserSession userSession) {
		Place userPlace = userSession.getMyPlace();
		
		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = 
			SqlBuilder.select(OptionShipmentMapper.selectList)
					  .from(OptionShipmentDynamicSqlSupport.optionShipment)
					  .where(OptionShipmentDynamicSqlSupport.placeStOid, SqlBuilder.isEqualTo(userPlace.getOid()));

		// 並び順の指定
		builder.orderBy(SqlBuilder.sortColumn(OptionShipmentDynamicSqlSupport.tableNo.name())
					  , SqlBuilder.sortColumn(OptionShipmentDynamicSqlSupport.oid.name()));
		SelectStatementProvider statement = builder.build().render(RenderingStrategies.MYBATIS3);
		List<OptionShipment> optionShipmentList = this.optionShipmentMapper.selectMany(statement);
		return optionShipmentList;
	}

	/**
	 * テーブルNoの備考を取得
	 * @param userSession
	 * @param tableNo
	 * @return
	 */
	public String getDeliveryMemo(UserSession userSession, Integer tableNo) {
		if(tableNo == null) return "";

		Place userPlace = userSession.getMyPlace();
		
		SelectStatementProvider selectStatement = 
			SqlBuilder.select(OptionShipmentMapper.selectList)
					  .from(OptionShipmentDynamicSqlSupport.optionShipment)
					  .where(OptionShipmentDynamicSqlSupport.placeStOid, SqlBuilder.isEqualTo(userPlace.getOid()))
					  .and(OptionShipmentDynamicSqlSupport.tableNo, SqlBuilder.isEqualTo(tableNo))
					  .build()
					  .render(RenderingStrategies.MYBATIS3);
		Optional<OptionShipment> optionShipment = this.optionShipmentMapper.selectOne(selectStatement);
		return optionShipment.isEmpty() ? "" : optionShipment.get().getMemo();
	}

	/**
	 * 検索処理
	 * @param userSession ログイン情報
	 * @param tableNo テーブルNo
	 * @param operationDate 処理日
	 * @return Beanのリスト
	 */
	public Page<InboundKanbanDeljitBean> getPageInfo(Pageable pageable, UserSession userSession, Integer tableNo, Date operationDate) {
		Place userPlace = userSession.getMyPlace();

		// 納入指示テーブル（親）.テーブルNoを検索キーとして、納入指示テーブル（子）を検索
		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = 
			SqlBuilder.select(OptionShipmentSettingMapper.selectList)
					  .from(OptionShipmentSettingDynamicSqlSupport.optionShipmentSetting)
					  // 納入指示テーブル
					  .join(OptionShipmentDynamicSqlSupport.optionShipment).on(OptionShipmentSettingDynamicSqlSupport.optionShipmentOid, SqlBuilder.equalTo(OptionShipmentDynamicSqlSupport.oid))
					  // かんばんサイクル情報
					  .join(OptionKanbanCycleDynamicSqlSupport.optionKanbanCycle)
					  .on(OptionShipmentDynamicSqlSupport.placeStOid, SqlBuilder.equalTo(OptionKanbanCycleDynamicSqlSupport.placeStOid))
					  .and(OptionShipmentSettingDynamicSqlSupport.placeSfOid, SqlBuilder.equalTo(OptionKanbanCycleDynamicSqlSupport.placeSfOid))
					  // 事業所情報
					  .join(PlaceDynamicSqlSupport.place).on(OptionShipmentSettingDynamicSqlSupport.placeSfOid, SqlBuilder.equalTo(PlaceDynamicSqlSupport.oid))
					  // 企業情報
					  .join(PartyDynamicSqlSupport.party).on(PlaceDynamicSqlSupport.partyOid, SqlBuilder.equalTo(PartyDynamicSqlSupport.oid))
					  // 納入先を自拠点に指定
					  .where(OptionShipmentDynamicSqlSupport.placeStOid, SqlBuilder.isEqualTo(userPlace.getOid()))
					  // テーブルNoの指定
					  .and(OptionShipmentDynamicSqlSupport.tableNo, SqlBuilder.isEqualTo(tableNo));

		// 並び順の指定
		builder.orderBy(SqlBuilder.sortColumn(PartyDynamicSqlSupport.tdbPartyCode.name())
					  , SqlBuilder.sortColumn(PlaceDynamicSqlSupport.tdbPlaceCode.name()));
		SelectStatementProvider statement = builder.build().render(RenderingStrategies.MYBATIS3);
		List<OptionShipmentSetting> optionShipmentSettingList = this.optionShipmentSettingMapper.selectMany(statement);

		// 取得データ変換
		List<InboundKanbanDeljitBean> beanList = this.convertEntityToBeanList(optionShipmentSettingList);
		
		return new PageImpl<>(beanList, pageable, beanList.size());
	}

	/**
	 * 取得したEntity情報をBeanリストに変換して返却する
	 * @param entityList Entityのリスト
	 * @return Beanのリスト
	 */
	private List<InboundKanbanDeljitBean> convertEntityToBeanList(List<OptionShipmentSetting> entityList) {
		List<InboundKanbanDeljitBean> beanList = new ArrayList<InboundKanbanDeljitBean>();		//TODO:DEBUG
		//List<InboundKanbanDeljitBean> beanList = new ArrayList<InboundKanbanDeljitBean>(entityList.size());
		return beanList;
	}
}