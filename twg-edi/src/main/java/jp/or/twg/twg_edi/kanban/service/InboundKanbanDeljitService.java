package jp.or.twg.twg_edi.kanban.service;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.common.entity.OptionCalendar;
import jp.or.twg.twg_edi.common.entity.OptionCalendarSetting;
import jp.or.twg.twg_edi.common.entity.OptionKanbanCycle;
import jp.or.twg.twg_edi.common.entity.OptionShipment;
import jp.or.twg.twg_edi.common.entity.OptionShipmentSetting;
import jp.or.twg.twg_edi.common.entity.OptionThreadManager;
import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.mapper.OptionCalendarMapper;
import jp.or.twg.twg_edi.common.mapper.OptionKanbanCycleDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionShipmentDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionShipmentMapper;
import jp.or.twg.twg_edi.common.mapper.OptionShipmentSettingDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionShipmentSettingMapper;
import jp.or.twg.twg_edi.common.mapper.OptionThreadManagerMapper;
import jp.or.twg.twg_edi.common.mapper.PartyDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.PlaceDynamicSqlSupport;
import jp.or.twg.twg_edi.common.model.FixDate;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.resource.Message;
import jp.or.twg.twg_edi.common.service.OptionCalendarService;
import jp.or.twg.twg_edi.common.service.OptionThreadManagerMapperParam;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import jp.or.twg.twg_edi.common.service.ShipmentDateNo;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.kanban.mapper.InboundKanbanDeljitMapper;
import jp.or.twg.twg_edi.kanban.model.InboundKanbanDeljitCalendarSettingForm;
import jp.or.twg.twg_edi.kanban.model.InboundKanbanDeljitKanbanCycleForm;
import jp.or.twg.twg_edi.kanban.model.OpCalendarForm;
import lombok.RequiredArgsConstructor;

/**
 * かんばん納入指示 サービスクラス
 *
 * @author nishidat
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class InboundKanbanDeljitService {

	private final String DELIMITER = ",";

	/** 画面メッセージ文字列 */
	static interface MESSAGE_RESULT_STRING {
		// ラベル
		/** 当日 */
		public static final String COMMON_SEARCH0 = new Message("twg_edi.option.common.kanban.search0").toString();
		/** 翌日 */
		public static final String COMMON_SEARCH1 = new Message("twg_edi.option.common.kanban.search1").toString();
		// 検索結果メッセージ
		/** 正常終了 */
		public static final String COMMON_RESULT0 = new Message("twg_edi.option.common.kanban.result0").toString();
		/** 異常終了 */
		public static final String COMMON_RESULT1 = new Message("twg_edi.option.common.kanban.result1").toString();
		/** 例外発生 */
		public static final String INBOUND_SEARCH2 = new Message("twg_edi.option.common.kanban.result2").toString();
	}

	private final InboundKanbanDeljitMapper inboundKanbanDeljitMapper;
	private final OptionThreadManagerMapper optionThreadManagerMapper;

	private final OptionShipmentMapper optionShipmentMapper;
	private final OptionShipmentSettingMapper optionShipmentSettingMapper;
	// private final OptionKanbanCycleMapper optionKanbanCycleMapper;
	private final OptionCalendarMapper optionCalendarMapper;

	private final PartyPlaceService partyPlaceService;
	private final OptionCalendarService optionCalendarService;
	private final KanbanOrderService kanbanOrderService;
	private final CommonInboundService service;

	private final OpCalendar opCalendar;

	/**
	 * かんばん納入指示送信履歴一覧リストの取得
	 *
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
		for (OptionThreadManager target : optionThreadManagerList) {
			// IDでデータの再取得
			optionThreadManager = this.optionThreadManagerMapper.selectByPrimaryKey(target.getId());

			// リストデータ作成
			bean = new OptionThreadManagerBean();
			if (!optionThreadManager.isEmpty()) {
				entity = optionThreadManager.get();
				bean.setThreadManager(entity);

				bean.setParty(this.partyPlaceService.getParty(entity.getPartyOid()));
				bean.setPlace(this.partyPlaceService.getPlace(entity.getPlaceOid()));
				if (bean.getParty() != null) {
					bean.setPartySetting(this.partyPlaceService.getPartySetting(bean.getParty().getTdbPartyCode()));
					if (bean.getPlace() != null) {
						bean.setPlaceSetting(this.partyPlaceService.getPlaceSetting(bean.getParty().getTdbPartyCode(),
																					bean.getPlace().getTdbPlaceCode()));
					}
				}
			}
			list.add(bean);
		}

		return list;
	}

	/**
	 * 納入指示送信実行状況の取得
	 *
	 * @param userSession
	 * @return 納入指示送信の実行有無
	 */
	public Boolean isRunKanbanOrder(UserSession userSession) {

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
	 *
	 * @param userSession
	 * @return
	 */
	public Map<String, String> getItemTypeHtmlList(UserSession userSession) {
		Map<String, String> tableNoMap = new LinkedHashMap<String, String>();
		List<OptionShipment> optionShipmentList = this.getOptionShipment(userSession);

		// 初期表示用の文言をセット TODO：どこかで共通化？
		tableNoMap.put(null, "--- 選択");

		for (OptionShipment optionShipment : optionShipmentList) {
			tableNoMap.put(Integer.toString(optionShipment.getTableNo()),
						   Integer.toString(optionShipment.getTableNo()));
		}
		return tableNoMap;
	}

	/**
	 * 納入指示テーブル取得
	 *
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
		builder.orderBy(SqlBuilder.sortColumn(OptionShipmentDynamicSqlSupport.tableNo.name()),
						SqlBuilder.sortColumn(OptionShipmentDynamicSqlSupport.oid.name()));
		SelectStatementProvider statement = builder.build().render(RenderingStrategies.MYBATIS3);
		List<OptionShipment> optionShipmentList = this.optionShipmentMapper.selectMany(statement);
		return optionShipmentList;
	}

	/**
	 * テーブルNoの備考を取得
	 *
	 * @param userSession
	 * @param tableNo
	 * @return
	 */
	public String getDeliveryMemo(UserSession userSession, Integer tableNo) {
		if (tableNo == null)
			return "";

		Place userPlace = userSession.getMyPlace();

		SelectStatementProvider selectStatement =
				SqlBuilder.select(OptionShipmentMapper.selectList)
						  .from(OptionShipmentDynamicSqlSupport.optionShipment)
						  .where(OptionShipmentDynamicSqlSupport.placeStOid, SqlBuilder.isEqualTo(userPlace.getOid()))
						  .and(OptionShipmentDynamicSqlSupport.tableNo, SqlBuilder.isEqualTo(tableNo)).build()
						  .render(RenderingStrategies.MYBATIS3);
		Optional<OptionShipment> optionShipment = this.optionShipmentMapper.selectOne(selectStatement);
		return !optionShipment.isEmpty() ? optionShipment.get().getMemo() : null;
	}

	/**
	 * 検索処理
	 *
	 * @param userSession   ログイン情報
	 * @param tableNo       テーブルNo
	 * @param operationDate 処理日
	 * @return Beanのリスト
	 */
	public Page<InboundKanbanDeljitBean> getPageInfo(Pageable pageable,
													 UserSession userSession,
													 Integer tableNo,
													 String strOperationDate,
													 Boolean isNotOrder) {
		Place userPlace = userSession.getMyPlace();
		// 処理日の設定
		Date operationDate = null;
		try {
			operationDate = DateUtility.getDateFromString(strOperationDate);
		} catch (ParseException e) {
			// 処理しない
		}

		// 納入指示テーブル（親）.テーブルNoを検索キーとして、納入指示テーブル（子）を検索
		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder =
				SqlBuilder.select(OptionShipmentSettingMapper.selectList)
						  .from(OptionShipmentSettingDynamicSqlSupport.optionShipmentSetting)
						  // 納入指示テーブル
						  .join(OptionShipmentDynamicSqlSupport.optionShipment)
						  .on(OptionShipmentSettingDynamicSqlSupport.optionShipmentOid, SqlBuilder.equalTo(OptionShipmentDynamicSqlSupport.oid))
						  // かんばんサイクル情報
						  .join(OptionKanbanCycleDynamicSqlSupport.optionKanbanCycle)
						  .on(OptionShipmentDynamicSqlSupport.placeStOid, SqlBuilder.equalTo(OptionKanbanCycleDynamicSqlSupport.placeStOid))
						  .and(OptionShipmentSettingDynamicSqlSupport.placeSfOid, SqlBuilder.equalTo(OptionKanbanCycleDynamicSqlSupport.placeSfOid))
						  // 事業所情報
						  .join(PlaceDynamicSqlSupport.place)
						  .on(OptionShipmentSettingDynamicSqlSupport.placeSfOid, SqlBuilder.equalTo(PlaceDynamicSqlSupport.oid))
						  // 企業情報
						  .join(PartyDynamicSqlSupport.party)
						  .on(PlaceDynamicSqlSupport.partyOid, SqlBuilder.equalTo(PartyDynamicSqlSupport.oid))
						  // 納入先を自拠点に指定
						  .where(OptionShipmentDynamicSqlSupport.placeStOid, SqlBuilder.isEqualTo(userPlace.getOid()))
						  // テーブルNoの指定
						  .and(OptionShipmentDynamicSqlSupport.tableNo, SqlBuilder.isEqualTo(tableNo));

		// 並び順の指定
		builder.orderBy(SqlBuilder.sortColumn(PartyDynamicSqlSupport.tdbPartyCode.name()),
						SqlBuilder.sortColumn(PlaceDynamicSqlSupport.tdbPlaceCode.name()));
		SelectStatementProvider statement = builder.build().render(RenderingStrategies.MYBATIS3);
		List<OptionShipmentSetting> optionShipmentSettingList = this.optionShipmentSettingMapper.selectMany(statement);

		// 取得データ変換
		List<InboundKanbanDeljitBean> convList = this.convertEntityToBeanList(optionShipmentSettingList,
																			  userPlace,
																			  operationDate,
																			  isNotOrder);

		List<InboundKanbanDeljitBean> beanList = new ArrayList<InboundKanbanDeljitBean>();
		for(int i = (int) pageable.getOffset(); i < pageable.getOffset() + pageable.getPageSize(); i++) {
			try {
				beanList.add(convList.get(i));
			} catch(IndexOutOfBoundsException e) {
				break;
			}
		}
		return new PageImpl<>(beanList, pageable, convList.size());
	}

	/**
	 * 取得したEntity情報をBeanリストに変換して返却する
	 *
	 * @param entityList Entityのリスト
	 * @return Beanのリスト
	 */
	private List<InboundKanbanDeljitBean> convertEntityToBeanList(List<OptionShipmentSetting> entityList,
																  Place userPlace,
																  Date operationDate,
																  Boolean isNotOrder) {
		List<InboundKanbanDeljitBean> beanList = new ArrayList<InboundKanbanDeljitBean>();
		// List<InboundKanbanDeljitBean> beanList = new ArrayList<InboundKanbanDeljitBean>(entityList.size());

		InboundKanbanDeljitBean bean;
		Optional<OptionShipment> optionShipment;
		Optional<OptionCalendar> optionCalendarOptional;
		OptionCalendar optionCalendar;
		OptionCalendarSetting optionCalendarSetting;
		Integer appendShipmentNo; // 発注便
		for (OptionShipmentSetting optionShipmentSetting : entityList) {
			bean = new InboundKanbanDeljitBean();

			// 処理日(暫定日)を設定する
			bean.setOperationDate(operationDate);

			// 納入指示テーブル(子)を保持
			bean.setOptionShipmentSetting(optionShipmentSetting);

			// 納入指示テーブル（親）を保持
			optionShipment = this.optionShipmentMapper.selectByPrimaryKey(optionShipmentSetting.getOptionShipmentOid());
			bean.setOptionShipment(optionShipment != null ? optionShipment.get() : null);

			// 納入指示テーブル(子)の処理便を設定する
			appendShipmentNo = optionShipmentSetting.getProcessingNo();

			InboundKanbanDeljitKanbanCycleForm cycleForm = new InboundKanbanDeljitKanbanCycleForm();
			cycleForm.setPlaceStOid(userPlace.getOid());
			cycleForm.setPlaceOfDischargeId(optionShipmentSetting.getPlaceOfDischargeId());
			cycleForm.setPlaceSfOid(optionShipmentSetting.getPlaceSfOid());
			cycleForm.setIsNotOrder(isNotOrder);
			cycleForm.setLastProcessingDate_yyyymmdd(DateUtility.getStringFromDateYYYYMMDD(operationDate));
			cycleForm.setLastProcessingNo(appendShipmentNo);

			// データ（かんばんサイクル情報）の検索
			List<OptionKanbanCycle> OptionKanbanCycleList = this.inboundKanbanDeljitMapper.getOptionKanbanCycle(cycleForm);

			// 画面表示対象外
			if (OptionKanbanCycleList.isEmpty() || OptionKanbanCycleList.get(0) == null)
				continue;

			OptionKanbanCycle optionKanbanCycle = OptionKanbanCycleList.get(0);

			// エンティティの情報(かんばんサイクル情報)を保持
			bean.setOptionKanbanCycle(optionKanbanCycle);

			// エンティティの情報(カレンダマスタ（親）)を保持
			optionCalendarOptional = optionCalendarMapper.selectByPrimaryKey(optionKanbanCycle.getOptionCalendarOid());

			if (optionCalendarOptional == null)
				continue;

			optionCalendar = optionCalendarOptional.get();
			bean.setOptionCalendar(optionCalendar);

			// エンティティ情報の取得
			Place placeSf = this.partyPlaceService.getPlace(optionKanbanCycle.getPlaceSfOid());
			// optionKanbanCycle.getPlaceSf();
			Party partySf = this.partyPlaceService.getParty(placeSf.getPartyOid());
			// placeSf.getParty();

			// デフォルトカレンダー検索(月初にジョブにて作成されるため、無いことはありえない)
			OptionCalendar optionCalendarDefault = this.optionCalendarService.getEntityByCalendarNo(placeSf,
																									OptionCalendar.DEFAULT_CALENDAR_NO);

			// データ（カレンダーマスタ情報（子））の検索
			InboundKanbanDeljitCalendarSettingForm formCalendarSettingForm = new InboundKanbanDeljitCalendarSettingForm();
			formCalendarSettingForm.setOptionCalendarOid(optionCalendar.getOid());
			formCalendarSettingForm.setOptionCalendarOidDefault(optionCalendarDefault != null ? optionCalendarDefault.getOid() : null);
			formCalendarSettingForm.setOperationDate(operationDate);
			List<OptionCalendarSetting> optionCalendarSettingList = this.inboundKanbanDeljitMapper.getOptionCalendarSetting(formCalendarSettingForm);

			if (optionCalendarSettingList == null
			 || optionCalendarSettingList.size() != 1)
				continue;

			optionCalendarSetting = optionCalendarSettingList.get(0);

//				for (OptionCalendarSetting optionCalendarSetting : fr3.list) {

			// エンティティの情報(カレンダマスタ（子）)を保持
			bean.setOptionCalendarSetting(optionCalendarSetting);

			// 画面表示項目の設定
			// 納入場所
			bean.setPlaceOfDischargeId(optionKanbanCycle.getPlaceOfDischargeId());
			// 事業所情報を保持
			bean.setPlace(placeSf);
			// 企業情報を保持
			bean.setParty(partySf);

			if (bean.getParty() != null) {
				bean.setPartySetting(this.partyPlaceService.getPartySetting(bean.getParty().getTdbPartyCode()));
				if (bean.getPlace() != null) {
					bean.setPlaceSetting(this.partyPlaceService.getPlaceSetting(bean.getParty().getTdbPartyCode(),
																				bean.getPlace().getTdbPlaceCode()));
				}
			}

			// 納入指示テーブル(子)の処理便を設定する
			bean.setAppendShipmentNo(optionShipmentSetting.getProcessingNo());

			/**
			 * 発注日種別の計算ロジック<BR>
			 * 指定した処理日・便より納入指示日を計算する。<BR>
			 * 当日：指定した処理日＋発注便から、納入指示日を計算する。<BR>
			 * 翌日：指定した処理日の翌日＋発注便から、納入指示日を計算する。
			 */
			// 発注日種別
			bean.setIptOrderDateType(optionShipmentSetting.getProcessingDateType());

			// 前回処理日が設定されていない場合は、初期値として「""」を設定する。
			String lastProcessingDate;
			if (optionKanbanCycle.getLastProcessingDate() == null) {
				lastProcessingDate = "";
			} else {
				lastProcessingDate = new SimpleDateFormat("yyyy/MM/dd").format(optionKanbanCycle.getLastProcessingDate());
			}
			// 前回処理日を設定する
			bean.setLastOperationDate(lastProcessingDate);

			// 前回処理便
			// 前回処理便が設定されていない場合は、初期値として「0」を設定する。
			int lastProcessingNo;
			if (optionKanbanCycle.getLastProcessingNo() == null) {
				lastProcessingNo = 0;
			} else {
				lastProcessingNo = optionKanbanCycle.getLastProcessingNo();
			}
			// 前回処理便を設定する
			bean.setLastOperationNo(String.valueOf(lastProcessingNo));

			/**
			 * 発注日種別のラベル表示
			 */
			if (bean.getIptOrderDateType() == 0) {
				// 当日の場合
				// 発注日種別のラベル表示
				bean.setSearchResult(MESSAGE_RESULT_STRING.COMMON_SEARCH0);
			} else {
				// 翌日の場合
				// 発注日種別のラベル表示
				bean.setSearchResult(MESSAGE_RESULT_STRING.COMMON_SEARCH1);
			}

			// カレンダマスタ（親）の備考を設定する
//			bean.setCalendarMemo(optionKanbanCycle.getOptionCalendar().getMemo());

			// カレンダマスタ（子）の稼動情報をを設定する
			bean.setOperationType(optionCalendarSetting.getOperatingInfo());

			// 画面表示制御の設定
			displayControll(bean, userPlace, operationDate, appendShipmentNo);
			// 画面表示対象
			beanList.add(bean);
//				}
//			}
		}
		return beanList;
	}

	/**
	 * (2) 納入指示対象一覧表示制御
	 *
	 * @param bean
	 */
	private void displayControll(InboundKanbanDeljitBean bean,
								 Place userPlace,
								 Date operationDate,
								 Integer appendShipmentNo) {
		// 納入指示テーブル(子)を取得
		OptionShipmentSetting optionShipmentSetting = bean.getOptionShipmentSetting();

		// かんばんサイクル情報を取得
		OptionKanbanCycle optionKanbanCycle = bean.getOptionKanbanCycle();

		// サイクルA-Dを連結して文字列として保持(A-B-C.DDの形式:一覧表示の時のみ使用)
		DecimalFormat format = new DecimalFormat("00");

		bean.setCycleInfo(String.valueOf(optionKanbanCycle.getCycleA()) + "-" +
						  String.valueOf(optionKanbanCycle.getCycleB()) + "-" +
						  String.valueOf(optionKanbanCycle.getCycleC()) + "." +
						  format.format(optionKanbanCycle.getCycleD()));

		// 処理日
		FixDate fixOperationDate = new FixDate(operationDate);

		// 前回処理日
		// 前回処理日が設定されていない場合は、初期値として「""」を設定する。
		FixDate lastProcessingDate;
		if (optionKanbanCycle.getLastProcessingDate() == null) {
			lastProcessingDate = null;
		} else {
			lastProcessingDate = new FixDate(optionKanbanCycle.getLastProcessingDate());
		}

		// 前回処理便
		// 前回処理便が設定されていない場合は、初期値として「0」を設定する。
		int lastProcessingNo;
		if (optionKanbanCycle.getLastProcessingNo() == null) {
			lastProcessingNo = 0;
		} else {
			lastProcessingNo = optionKanbanCycle.getLastProcessingNo();
		}

		// →サイクルB÷2の切り上げた便数
		Double cycleBedit = bean.getOptionKanbanCycle().getCycleB().doubleValue() / 2;
		int shipmentNum = (int) Math.ceil(cycleBedit);

		// 「1.」画面表示対象外とするデータ
		if (lastProcessingDate != null
		 && lastProcessingNo != 0
		 && fixOperationDate.getStringDate().equals(lastProcessingDate.getStringDate())
		 && optionShipmentSetting.getProcessingNo() == lastProcessingNo) {
			// 前回処理日、便と同じ処理日、便になるもの。（発注済のもの）
			// 前回と同じ処理日、便
			bean.setViewStatus("SAME");
			// チェックボックスを表示する。
			bean.setForceDeljit(true);
			// 備考メッセージ設定
			bean.setCalendarMemo(new Message("twg_edi.option.kanban.not.execute.same.last.time").toString());
			return;
		}

		// 「2.」画面表示するが、チェックボックスにチェックをデフォルトで入れないもの
		if (bean.getOptionKanbanCycle().getCycleA() >= 2) {
			/**
			 * 隔日発注(かんばんサイクルAが2以上のもの)で、今回発注タイミングでないもの。（ 隔日発注のタイミングを変更する場合にチェックして納入指示を行う）
			 */
			if (bean.getOptionKanbanCycle().getLastProcessingDate() != null) {
				// 計算する処理日
				Date forwardDate;

				Date resultDate = lastProcessingDate.getDate();
				Place placeSf = this.partyPlaceService.getPlace(bean.getOptionKanbanCycle().getPlaceSfOid());

				if (bean.getOptionShipmentSetting().getProcessingDateType() == 1) {
					// 処理日種別が翌日だったら、1日進める
					OpCalendarForm routeCalender = this.opCalendar.makeOpCalender(userPlace,
																				  placeSf,
																				  lastProcessingDate.getDate(),
																				  null,
																				  bean.getOptionCalendar());
					resultDate = this.kanbanOrderService.getNextWorkingDay(resultDate, routeCalender);
				}

				ShipmentDateNo shipmentDateNo = null;
				try {
					shipmentDateNo =
							this.kanbanOrderService.getNextOperationDateByCycle(userPlace,
																				resultDate,
																				bean.getOptionShipmentSetting(),
																				bean.getOptionKanbanCycle(),
																				bean.getOptionCalendar());
				} catch (Exception e) {
					// 以降の判定を行う
				}

				// NULLの場合はチェックしない（非稼働日だとnullになる）
				if (shipmentDateNo != null) {
					forwardDate = shipmentDateNo.getShipmentDate();

					// サイクルA分進めた日付と入力した処理日の比較判定
					if (forwardDate.compareTo(operationDate) != 0) {
						/**
						 * カレンダー非稼働の仕入先（処理日が非稼働）<BR>
						 * または、 // サイクルA分進めた日付が処理日でなかった場合はチェックを入れない
						 */
						// 背景色グレー
						bean.setViewStatus("OVER");
						// チェックボックスを表示する。
						bean.setForceDeljit(true);
						// 備考メッセージ設定
						bean.setCalendarMemo(new Message("twg_edi.option.kanban.not.execute",
								new Message("twg_edi.option.kanban.not.execute.every.other.day").toString())
										.toString());
						return;
					}
				}
			}
		}

		if (appendShipmentNo > bean.getOptionKanbanCycle().getCycleB()) {
			// 「3.」画面表示するが、チェックボックスを表示しないもの。
			// カレンダー稼働の仕入先
			// サイクルA-B-CのBを越える便は対象外。
			// チェックボックスを非表示にする。
			bean.setForceDeljit(false);
			// 備考メッセージ設定
			bean.setCalendarMemo(new Message("twg_edi.error.validate.startIsOverEnd", "発注便", "サイクルB").toString());
			return;
		}

		if (bean.getOperationType() == 1) {
			/**
			 * カレンダー非稼働の仕入先（処理日が非稼働）<BR>
			 * →サイクル情報に登録されているカレンダーNoでカレンダマスタを参照。
			 * 処理日が非稼働ならば発注させない。(発注日種別が翌日ならば、処理日の翌"稼働日"で稼働をチェックする。
			 */
			// 背景色グレー
			bean.setViewStatus("NORUN");

			// チェックボックスを非表示にする。
			bean.setForceDeljit(false);
			// 備考メッセージ設定
			bean.setCalendarMemo(new Message("twg_edi.option.kanban.not.execute",
					new Message("twg_edi.option.kanban.not.execute.non.work.day").toString()).toString());
			return;
		}

		if (bean.getOperationType() == 2 && appendShipmentNo > shipmentNum) {
			/**
			 * カレンダー半日稼働で、発注対象外の便 <BR>
			 * →サイクルB÷2の切り上げた便数を越えるもの。(サイクルBが２ならば、２便が対象外。サイクルBが3ならば3便が対象外）
			 */
			// 背景色グレー
			bean.setViewStatus("NODERIVERY");
			// チェックボックスを非表示にする。
			bean.setForceDeljit(false);
			// 備考メッセージ設定
			bean.setCalendarMemo(new Message("twg_edi.option.kanban.not.execute",
					new Message("twg_edi.option.kanban.not.execute.half.work.day").toString()).toString());
			return;
		}

		// チェックボックスを表示する。
		bean.setForceDeljit(true);

		// 初回実行の場合に外れかつ取引終了の品番を確認する。
		List<Item> itemList = new ArrayList<Item>();
		itemList = this.getOutOfRengeItem(bean, userPlace);

		if (itemList.isEmpty()) {
			// チェックボックスをデフォルトで選択する。
			bean.setCheckboxValue(true);
			//bean.setCheckboxValue(String.valueOf(bean.getOptionCalendarSetting().getOid()));
		} else {
			// 終了品番が存在する場合

			// 備考メッセージ設定
			bean.setCalendarMemo(new Message("twg_edi.option.kanban.not.execute.out.of.range.item").toString());

			StringBuffer sb = new StringBuffer("");
			for (Item item : itemList) {
				if (!CommonDataUtil.isNullOrEmpty(sb.toString())) {
					sb.append(DELIMITER);
				}
				sb.append(item.getOid());
			}

			// 取引終了品番設定
			bean.setOutOfRangeItemList(sb.toString());
		}
	}

	/**
	 * 取引終了品番取得
	 *
	 * @param bean
	 * @return 取引終了品番List
	 */
	private List<Item> getOutOfRengeItem(InboundKanbanDeljitBean bean, Place userPlace) {

		List<Item> itemList = new ArrayList<Item>();

		// TIPS:スレッド処理は行わないが、納入指示日取得処理について
		// 下記クラスが必要のため実装した。方法はよろしくないが指示日取得処理を2元管理したくないため現状の方法をとった。

		// 計算する処理日
		Date resultDate = bean.getOperationDate();
		Place placeSf = this.partyPlaceService.getPlace(bean.getOptionKanbanCycle().getPlaceSfOid());
		// 処理日種別判定
		if (bean.getOptionShipmentSetting().getProcessingDateType() == 1) {
			// 処理日種別が翌日だったら、1日進める
			OpCalendarForm routeCalender =
					this.opCalendar.makeOpCalender(userPlace,
												   placeSf,
												   bean.getOperationDate(),
												   null,
												   bean.getOptionCalendar());
			resultDate = this.kanbanOrderService.getNextWorkingDay(resultDate, routeCalender);
		}
		ShipmentDateNo shipmentDateNo = null;
		try {
			shipmentDateNo =
					this.kanbanOrderService.getNextOperationDateByCycle(userPlace,
																		resultDate,
																		bean.getOptionShipmentSetting(),
																		bean.getOptionKanbanCycle(),
																		bean.getOptionCalendar());
		} catch (Exception e) {
			return itemList;
		}

		// NULLの場合はチェックしない
		if (shipmentDateNo == null)
			return itemList;

		// 納入指示日
		String strDeliveryDate = DateUtility.getStringFromDateYYYYMMDD(shipmentDateNo.getShipmentDate());

		// 品番取得
		List<Item> itemSpecList = null;
		try {
			itemSpecList = this.service.getAllItem(bean, userPlace);
		} catch (Exception e) {
			return itemList;
		}

		if (itemSpecList == null
		 || itemSpecList.isEmpty())
			return itemList;

		// 外れかんばん突合せ
		List<Item> itemRollList = new ArrayList<Item>();
		try {
			itemRollList = this.service.getRollKanban(itemSpecList);
		} catch (Exception e) {
			return itemList;
		}

		if (itemRollList == null || itemRollList.isEmpty())
			return itemList;

		//ここまでitemListはsize：0

		// 指示日と開始日を突合せ
		String endPeriod;
		for (Item item : itemRollList) {
			endPeriod = item.getValidEndStringDate();
			// endPeriod = DateUtility.getStringFromDateYYYYMMDD(item.getValidEnd().getDate());
			if (CommonDataUtil.isNullOrEmpty(endPeriod))
				endPeriod = FixDate.STRING_DATE_RANGE.MAX;

			if (endPeriod.compareTo(strDeliveryDate) < 0) { // 納入指示日 ＜ 取引開始日は表示しない
				itemList.add(item); // 取扱期限外の品番を取得
			}
		}
		return itemList;
	}

	public Boolean threadStart(List<InboundKanbanDeljitBean> beanList, UserSession userSession) {
		// とりあえず
//		SelectStatementProvider selectStatement =
//				SqlBuilder.select(OptionThreadManagerMapper.selectList)
//						  .from(OptionThreadManagerDynamicSqlSupport.optionThreadManager)
//						  .build()
//						  .render(RenderingStrategies.MYBATIS3);
//		long cnt = this.optionThreadManagerMapper.count(selectStatement);
//		Date nowDate = new Date();
//
//		OptionThreadManager entity;
//		for(InboundKanbanDeljitBean bean : beanList) {
//			cnt++;
//			Place placeSf = this.partyPlaceService.getPlace(bean.getOptionKanbanCycle().getPlaceSfOid());
//			//Party partySf = this.partyPlaceService.getParty(placeSf.getPartyOid());
//			entity = new OptionThreadManager();
//			entity.setId(DateUtility.getYear(nowDate).toString() + "-" +
//						 DateUtility.getStringFromDateMMDD(nowDate) + "-" +
//						 String.format("%04d", cnt)
//					 	 );
//			entity.setThreadStatus(OptionThreadStatus.RUNNING.getName());
//			entity.setThreadCategory(OptionThreadCategory.MakeKanbanOrderService.getName());
//			entity.setUsersOid(userSession.getMyUsers().getOid());
//			entity.setUserPlaceOid(userSession.getMyPlace().getOid());
//			entity.setPlaceOfDischargeId(bean.getPlaceOfDischargeId());
//			entity.setStartUpTime(new Date());
//			entity.setCloseOutTime(null);
//			entity.setPartyOid(placeSf.getParty().getOid());
//			entity.setPlaceOid(placeSf.getOid());
//			entity.setMemo("DEBUG MESSAGE");
//			this.optionThreadManagerMapper.insert(entity);
//		}

		return true;
	}

//	public synchronized static String generateNewThreadId() throws VersionUnmuchException, MessagesIncludingException{
//		Date nowDate = new Date();
//		String yearString = DateUtility.getYear(nowDate).toString();
//		String monthDateString = DateUtility.getStringFromDateMMDD(nowDate);
//		//String numberingKey = KazuraJamaOptionBaseThread.class.getName() + "." + yearString;
//		String numberingKey = "KazuraJamaOptionBaseThread" + "." + yearString;
//
//		NumberingService numberservice = NumberingService.getService();
////		Long id = numberservice.getNumber(numberingKey);
//		// kazura専用のNumberingServiceを使用 2020/09/08
//		Long id = numberservice.getNumber(numberingKey, 9999L);
//
////		BasicService service = BasicService.getService();
////		if (id > 9999L) {
////			id = 1L;
////			Numbering numbering = service.findByPK(Numbering.class, numberingKey);
////			numbering.setNextNumber(id);
////			service.update(numbering);
////		}
//
//		return yearString + "-" + monthDateString + "-" + String.format("%04d", id);
//	}
}