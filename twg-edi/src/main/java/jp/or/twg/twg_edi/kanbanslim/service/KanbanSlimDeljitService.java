package jp.or.twg.twg_edi.kanbanslim.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import jp.or.twg.twg_edi.common.difinition.MaterialsType;
import jp.or.twg.twg_edi.common.difinition.OptionThreadCategory;
import jp.or.twg.twg_edi.common.difinition.OptionThreadStatus;
import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.common.entity.OptionThreadManager;
import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.mapper.OptionThreadManagerMapper;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.service.OptionThreadManagerMapperParam;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.kanban.service.OptionThreadManagerBean;
import jp.or.twg.twg_edi.kanbanslim.mapper.KanbanSlimDeljitMapper;
import jp.or.twg.twg_edi.kanbanslim.model.KanbanSlimDeljitBean;
import jp.or.twg.twg_edi.kanbanslim.model.KanbanSlimDeljitCondition;
import lombok.RequiredArgsConstructor;

/**
 * Slim用かんばん納入指示サービスクラス
 *
 * @author yamaguchiha
 *
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class KanbanSlimDeljitService {

	private final KanbanSlimDeljitMapper kanbanSlimDeljitMapper;
	private final PartyPlaceService ppService;

	private final OptionThreadManagerMapper optionThreadManagerMapper;

	/**
	 *
	 * @param pageable
	 * @param shipToReciveCode 納入場所
	 * @return
	 */
	public Page<KanbanSlimDeljitBean> getListByShipToReciveCode(Pageable pageable, String shipToReciveCode) {
		// ログインユーザから企業を取得
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	UserSession session = (UserSession)obj;
    	Party myParty = session.getMyParty();
    	Place myPlace = session.getMyPlace();
    	ppService.initialize(myParty.getTdbPartyCode(), myPlace.getTdbPlaceCode());

		// 出荷数変更オプションの利用有無を取得（自工区から取得）
		boolean materialsOptionFlag = true;

		// 出荷場セキュリテを利用時は画面側でshipToReciveCodeに入っているので特に気にしない

		// 下記条件で該当する品番を全て検索する
		// 自拠点が発注者、品番は発注対象として登録済み
		// 出荷数変更オプションが「N」の場合は出荷数変更区分が「なし」の品番のみの条件を追加
		KanbanSlimDeljitCondition cond = new KanbanSlimDeljitCondition();
		cond.setPlaceByOid(myPlace.getOid());
		if(!CommonDataUtil.isNullOrEmpty(shipToReciveCode)) {
			cond.setShipToReciveCode(shipToReciveCode);
		}
		if(materialsOptionFlag) {
			cond.setMaterialsTypeCode(MaterialsType.CommonType.getId());
		}
		List<Item> itemList= kanbanSlimDeljitMapper.getSelectItemList(cond);


		// 画面表示用にサマリする
		List<KanbanSlimDeljitBean> totalBeaneanList = convertEntityToBeanList(itemList);

		// offsetとlimitをサマリに対して手動でコントロールする
		List<KanbanSlimDeljitBean> beanList = new ArrayList<KanbanSlimDeljitBean>();
    	for (int i = (int) pageable.getOffset(); i < pageable.getOffset() + pageable.getPageSize(); i++) {
    		// 取得できなかったらループから抜ける
    		try{
        		beanList.add(totalBeaneanList.get(i));
    		}catch (IndexOutOfBoundsException ioe) {
    			break;
    		}
    	}
		return new PageImpl<>(beanList, pageable, totalBeaneanList.size());
	}

    /**
	 * 取得したEntity情報をBeanリストに変換して返却する
	 *
	 * @param entityList
	 *            Entityのリスト
	 * @return Beanのリスト
	 */
    private List<KanbanSlimDeljitBean> convertEntityToBeanList(List<Item> entityList) {
    	List<KanbanSlimDeljitBean> beanList = new ArrayList<KanbanSlimDeljitBean>(entityList.size());

    	KanbanSlimDeljitBean bean = null;

    	// 前回条件
    	String condDischargeId = "";
    	String condPartyCodeSf = "";
    	String condPlaceCodeSf = "";
    	String condLoadingId = "";

    	boolean dischargeId = false;
    	boolean loadingId = false;

		for (Item item : entityList) {

			dischargeId = checkCond(condDischargeId, item.getPlaceOfDischargeId());
			loadingId = checkCond(condLoadingId, item.getPlaceOfLoadingId());

			if(dischargeId
					&& condPartyCodeSf.equals(item.getParty().getTdbPartyCode())
					&& condPlaceCodeSf.equals(item.getPlace().getTdbPlaceCode())
					&& loadingId) {

				// 条件が一致している間はサマリ
				// 最終処理日と最終納入指示日・便は更新する

				// 最終処理日
				if(!CommonDataUtil.isNullOrEmpty(item.getOptionOrderTargetManager().getLastProcessingDate())) {
					Date dateProcess = null;
					try {
						dateProcess = DateUtility.getDateFromStringYYYYMMDD(item.getOptionOrderTargetManager().getLastProcessingDate());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					if(dateProcess != null) {
						bean.setLastProcessDate(DateUtility.getStringFromDate(dateProcess, "yyyy/MM/dd"));
					}
				}
				// 最終納入指示日
				if(!CommonDataUtil.isNullOrEmpty(item.getOptionOrderTargetManager().getLastDeliveryDate())) {
					Date dateDelivery = null;
					try {
						dateDelivery = DateUtility.getDateFromStringYYYYMMDD(item.getOptionOrderTargetManager().getLastDeliveryDate());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					if(dateDelivery != null) {
						bean.setLastDeliveryDate(DateUtility.getStringFromDate(dateDelivery, "yyyy/MM/dd"));
					}
				}
				// 最終納入指示便
				if(item.getOptionOrderTargetManager().getLastShipmentNo() != null) {
					bean.setLastShipmentNo(item.getOptionOrderTargetManager().getLastShipmentNo().toString());
				}

			} else {
				if(bean != null) {
					// 初回はnullなのでListに追加しない
					beanList.add(bean);
				}
				// 新しいくるサマリする（初回と条件が変わった場合）
				bean = new KanbanSlimDeljitBean();

				// 前回条件に設定
				condDischargeId = item.getPlaceOfDischargeId();
				condPartyCodeSf = item.getParty().getTdbPartyCode();
				condPlaceCodeSf = item.getPlace().getTdbPlaceCode();
				condLoadingId = item.getPlaceOfLoadingId();

				// 処理日(暫定日)を設定する
//				bean.setOperationDate(operationDate);

				// 納入場所
				bean.setPlaceOfDischargeId(condDischargeId);

				// 出荷元
				bean.setPartySf(ppService.getPartyByTdbCode(condPartyCodeSf));
				bean.setPartySfSetting(ppService.getPartySetting(condPartyCodeSf));
				bean.setPlaceSf(ppService.getPlaceByTdbCodeAndPlaceCode(condPartyCodeSf, condPlaceCodeSf));

				// 出荷場所
				bean.setPlaceOfLoadingId(condLoadingId);
				bean.setPlaceOfLoadingName(item.getPlaceOfLoadingName());
//				bean.setCheckboxValue("1");

				// 最終処理日
				if(!CommonDataUtil.isNullOrEmpty(item.getOptionOrderTargetManager().getLastProcessingDate())) {
					Date dateProcess = null;
					try {
						dateProcess = DateUtility.getDateFromStringYYYYMMDD(item.getOptionOrderTargetManager().getLastProcessingDate());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					if(dateProcess != null) {
						bean.setLastProcessDate(DateUtility.getStringFromDate(dateProcess, "yyyy/MM/dd"));
					}
				}
				// 最終納入指示日
				if(!CommonDataUtil.isNullOrEmpty(item.getOptionOrderTargetManager().getLastDeliveryDate())) {
					Date dateDelivery = null;
					try {
						dateDelivery = DateUtility.getDateFromStringYYYYMMDD(item.getOptionOrderTargetManager().getLastDeliveryDate());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					if(dateDelivery != null) {
						bean.setLastDeliveryDate(DateUtility.getStringFromDate(dateDelivery, "yyyy/MM/dd"));
					}
				}
				// 最終納入指示便
				if(item.getOptionOrderTargetManager().getLastShipmentNo() != null) {
					bean.setLastShipmentNo(item.getOptionOrderTargetManager().getLastShipmentNo().toString());
				}
			}
			// 品番
			if(bean.getAllItemList() == null) {
				bean.setAllItemList(new ArrayList<Item>());
			}
			bean.getAllItemList().add(item);
//			bean.setCheckboxValue("start");
		}
		// 抜けた時点でのbeanはListに追加されてないので追加
		// 0件の時にもリストに追加されてしまうのでnullチェックを行う
		if(bean != null) {
			beanList.add(bean);
		}

    	return beanList;
    }

    /**
     * 前回条件の納入場所と出荷場所にnullが入る可能性があるため
     * 判定用の処理を用意
     * @param cond
     * @param value
     * @return
     */
    boolean checkCond(String cond, String value){
    	if(cond == null) {
    		if (cond == value) return true;
    	} else {
    		if (cond.equals(value)) return true;
    	}
    	return false;
    }

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
		param.setSrhThreadCategory(OptionThreadCategory.MakeSimpleKanbanOrderService.name());
		param.setSrhCloseOutTimeToday(today);
		param.setSrhCloseOutTimeNext(DateUtility.getDateForward(today, 1));
		List<OptionThreadManager> optionThreadManagerList = optionThreadManagerMapper.selectUnissuedDownloadList(param);

		// 企業・事業所サービスの初期化
		ppService.initialize(userSession.getMyParty().getTdbPartyCode(), userPlace.getTdbPlaceCode());

		List<OptionThreadManagerBean> list = new ArrayList<OptionThreadManagerBean>();
		OptionThreadManagerBean bean;
		Optional<OptionThreadManager> optionThreadManager;
		OptionThreadManager entity;
		for(OptionThreadManager target : optionThreadManagerList) {
			//IDでデータの再取得
			optionThreadManager = optionThreadManagerMapper.selectByPrimaryKey(target.getId());

			// リストデータ作成
			bean = new OptionThreadManagerBean();
			if(!optionThreadManager.isEmpty()) {
				entity = optionThreadManager.get();
				bean.setThreadManager(entity);

				bean.setParty(ppService.getParty(entity.getPartyOid()));
				bean.setPlace(ppService.getPlace(entity.getPlaceOid()));
				if(bean.getParty() != null) {
					bean.setPartySetting(ppService.getPartySetting(bean.getParty().getTdbPartyCode()));
					if(bean.getPlace() != null) {
						bean.setPlaceSetting(ppService.getPlaceSetting(bean.getParty().getTdbPartyCode()
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
		param.setSrhThreadCategory(OptionThreadCategory.MakeSimpleKanbanOrderService.name());
		param.setSrhThreadStatus(OptionThreadStatus.RUNNING.name());
		param.setSrhCloseOutTimeToday(today);
		param.setSrhCloseOutTimeNext(DateUtility.getDateForward(today, 1));
		int count = optionThreadManagerMapper.selectRunKanbanOrder(param);

		return count != 0;
	}

}
