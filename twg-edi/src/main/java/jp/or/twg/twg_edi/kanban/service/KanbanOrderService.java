package jp.or.twg.twg_edi.kanban.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.entity.OptionCalendar;
import jp.or.twg.twg_edi.common.entity.OptionKanbanCycle;
import jp.or.twg.twg_edi.common.entity.OptionShipmentSetting;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import jp.or.twg.twg_edi.common.service.ShipmentDateNo;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.kanban.model.OpCalendarForm;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class KanbanOrderService {

	private final PartyPlaceService partyPlaceService;
	private final OpCalendar opCalendar;

//	/**
//	 * コンストラクタ。
//	 * @param ifOptionThread オプションスレッド用インターフェース
//	 */
//	public KanbanOrderService() {
//	}

	/**
	 * 指定日付からリードタイム（サイクル）分進めた日付・便算出
	 * @param userPlace 事工区
	 * @param targetDate 指定日付
	 * @param ship 納入指示情報
	 * @return route かんばんサイクル情報
	 * @return optionCalendar　カレンダマスタ
	 * @throws Exception
	 */
	public ShipmentDateNo getNextOperationDateByCycle(Place userPlace,
													  Date targetDate,
													  OptionShipmentSetting ship, 
													  OptionKanbanCycle route,
													  OptionCalendar optionCalendar) throws Exception {
		return getNextOperationDateByCycle(userPlace, targetDate, ship.getProcessingNo(), route, optionCalendar);
	}

	/**
	 * 指定日付・便からリードタイム（サイクル）分進めた日付・便算出
	 * @param targetDate 指定日付
	 * @param targetNo 指定便
	 * @param optionKanbanCycle 便ルート情報
	 * @return ShipmentDateNo 納入日・便
	 * @throws Exception
	 */
	public ShipmentDateNo getNextOperationDateByCycle(Place userPlace,
													  Date targetDate,
													  int targetNo, 
													  OptionKanbanCycle optionKanbanCycle,
													  OptionCalendar optionCalendar) throws Exception {
		Date retDate = targetDate;
		int retNo = targetNo;
		Place placeSf = partyPlaceService.getPlace(optionKanbanCycle.getPlaceSfOid());
		OpCalendarForm routeCalender = opCalendar.makeOpCalender(userPlace,
																 placeSf,
																 targetDate,
																 null,
																 optionCalendar);

		// リードタイム便数取得
		int remainsCount = optionKanbanCycle.getRemainsCount();

		// 指定日・便からサイクルA*サイクルC分進める
		for (int i = 0; i < remainsCount; i++) {
			OperatingKbn OpKbn = getOperatingKbn(retDate, routeCalender);
			if (!OpKbn.isOmitTmpOperating()) {
				// 納入先カレンダor便ルートカレンダが非稼動or臨時稼動の場合
				return null;
			}

			// int limitNo = getLimitNo(OpKbn, cycle);
			// サイクルＢの有効便数を返す
			int limitNo = getLimitNo(OpKbn, optionKanbanCycle);
			if (limitNo <= 0) {
				return null;
			}
			if (retNo + 1 > limitNo) {
				// 便がサイクルBを超える場合、翌日の1便をセット ※ 半日稼動の場合は、(サイクルB + 1) / 2
				retDate = getNextWorkingDay(retDate, routeCalender);
				retNo = 1;
			} else {
				retNo++;
			}
		}

		return new ShipmentDateNo(retDate, retNo);
	}

	/**
	 * 二つのカレンダの内指定日の稼動が短い稼動区分を返す
	 *  ※ 優先順位 非稼動>臨時>半日>便なし>通常 ※便なしはかんばん分は稼動と同義
	 *
	 * @param targetDate 指定日付
	 * @param calender1 カレンダー
	 * @param calender2 カレンダー
	 * @return 稼動区分
	 * @throws Exception
	 */
	public OperatingKbn getOperatingKbn(Date targetDate, OpCalendarForm calendar) throws Exception {
		OperatingKbn retKbn;
		OperatingKbn cal2Kbn = this.opCalendar.getOperatingKbnForEnum(calendar, targetDate);

		if(OperatingKbn.NON_OPERATION.equals(cal2Kbn)) {
			// カレンダ２に非稼働日が含まれる場合
			retKbn = OperatingKbn.NON_OPERATION;
		}
		else if(OperatingKbn.HALF_OPERATION.equals(cal2Kbn)) {
			// カレンダ２に半日が含まれる場合
			retKbn = OperatingKbn.HALF_OPERATION;
		}
		else {
			// カレンダ１＆２が稼動の場合
			retKbn = OperatingKbn.OPERATION;
		}
		return retKbn;
	}

	/**
	 * サイクルＢの有効便数を返す
	 * @param kbn 稼動区分
	 * @param cycle 便マスタ
	 * @return 有効便数
	 */
	public int getLimitNo(OperatingKbn kbn, OptionKanbanCycle cycle) {
		int result = 0;
		if(cycle == null || cycle.getCycleB() == null || kbn == null) {
			return result;
		}

		if(kbn.equals(OperatingKbn.HALF_OPERATION)) {
			// 半日稼動の場合
			result = (cycle.getCycleB() + 1) / 2 ;
		}

		if(kbn.isKanbanAllOperating()) {
			// 稼動or便無しの場合
			result = cycle.getCycleB();
		}

		return result;
	}

	/**
	 * 二つのカレンダーが指定日付の翌稼働日を返す（半日or通常稼動or便なし）
	 * @param date 指定日付
	 * @param calender1 カレンダー
	 * @param calender2 カレンダー
	 * @return 日付
	 */
	public Date getNextWorkingDay(Date date, OpCalendarForm calendar) {
		Date retDate = date;
// TODO 20110601 yamamoto 永久ループとなってるが、脱出できないケースはない絶対に無いのか？
		for(;;) {
			retDate = this.opCalendar.getNextOmitTmpWorkingDay(calendar, DateUtility.getDateForward(retDate, 1));
			if(retDate == this.opCalendar.getNextOmitTmpWorkingDay(calendar, retDate)) {
				// カレンダー1とカレンダー2が稼動or半日稼動or便なしの場合
				break;
			}
		}
		return retDate;
	}

	/**
	 * ２つのカレンダーが指定日付からリードタイムの稼働日分進める（半日or通常稼動or便なし）
	 * @param targetDate 指定日付
	 * @param leadTime リードタイム
	 * @param calender1 カレンダ
	 * @param calender2 カレンダ
	 * @return 日付
	 */
	public Date getNextOperationDay(Date targetDate, int leadTime, OpCalendarForm calendar) {
		Date retDate = targetDate;
		for(int i = 0; i < leadTime; i++){
			retDate = getNextWorkingDay(retDate, calendar);
		}
		return retDate;
	}
}
