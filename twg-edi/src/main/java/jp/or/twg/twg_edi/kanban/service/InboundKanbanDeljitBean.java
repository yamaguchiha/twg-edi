package jp.or.twg.twg_edi.kanban.service;

import java.util.Date;
import java.util.List;

import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.common.entity.OptionCalendar;
import jp.or.twg.twg_edi.common.entity.OptionCalendarSetting;
import jp.or.twg.twg_edi.common.entity.OptionKanbanCycle;
import jp.or.twg.twg_edi.common.entity.OptionShipment;
import jp.or.twg.twg_edi.common.entity.OptionShipmentSetting;
import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.TransportHeader;
import jp.or.twg.twg_edi.common.service.ShipmentDateNo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InboundKanbanDeljitBean extends OptionBaseBean {

    //TODO:要否は切り分けること
	/** BaseIfOptionBean(interface) */
	/** 納品書フリーヘッダー 開始インデックス */
	public static final int ITEM_P04L_FIRST_INDEX = 1;

	/** 納品書フリーヘッダー 終了インデックス */
	public static final int ITEM_P04L_LAST_INDEX = 4;

	/** 後工程情報 エリア１ インデックス */
	public static final int ITEM_P05_AREA_FIRST_INDEX = 1;

	/** 後工程情報 エリア２ インデックス */
	public static final int ITEM_P05_AREA_SECOND_INDEX = 2;

	/** 後工程情報 エリア３ インデックス */
	public static final int ITEM_P05_AREA_THIRD_INDEX = 3;

	/** 後工程情報 エリア 終了インデックス */
	public static final int ITEM_P05_AREA_LAST_INDEX = ITEM_P05_AREA_THIRD_INDEX;

	/** 後工程情報 行 開始インデックス */
	public static final int ITEM_P05_LINE_FIRST_INDEX = 1;

	/** 後工程情報 行 終了インデックス */
	public static final int ITEM_P05_LINE_LAST_INDEX = 20;

	/** 0件受注の注文明細番号ID */
	public static final String DOC_REF_ID_PS_ZERO_RECEIVE ="DOC_REF_ID_PS_ZERO_RECEIVE";

	/** 0件受注の納品指示ID */
	public static final String DOC_REF_ID_XSI_ZERO_RECEIVE ="DOC_REF_ID_XSI_ZERO_RECEIVE";

    /** BaseshipmentBean */

    /** 処理番号(各Beanから昇格) **/
    //private  String   aaBodid;

    /** 送信日時刻 **/
    //private  String   aaInterchangeDateTime;

    /** 受信者 **/
    private  String   aaReceiverId;

    /** 送信者 **/
    private  String   aaSenderId;

    /** 発注便 **/
    private  Integer  appendShipmentNo;

    /** カレンダー備考コメント **/
    private  String   calendarMemo;

    /** サイクル **/
    private  Integer  cycle;

    /** 納入指示備考コメント **/
    private  String   deliveryMemo;

    /** 発行日 **/
    private  String   documentDateTime;

    /** 発注日種別 **/
    private  Integer  iptOrderDateType;

    /** 前回処理日 **/
    private  String   lastOperationDate;

    /** 前回処理便 **/
    private  String   lastOperationNo;

    /** 業務要件でのメッセージの識別 **/
    private  String   messageTypeCode;

    /** * 業務要件でのメッセージの識別情報区分コード **/
    private  String   messageTypeCodeName;

    /** 外れ枚数 **/
    private  Long     offKanbanCount;

    /** 処理日 **/
    private  Date     operationDate;

    /** 稼動情報 **/
    private  Integer  operationType;

    /** カレンダマスタ（親） **/
    private  OptionCalendar   optionCalendar;

    /** カレンダーマスタ情報（子） **/
    private  OptionCalendarSetting   optionCalendarSetting;

    /** かんばんサイクル情報 **/
    private  OptionKanbanCycle   optionKanbanCycle;

    /** 納入指示テーブル(親) **/
    private  OptionShipment   optionShipment;

    /** 納入指示テーブル(子) **/
    private  OptionShipmentSetting   optionShipmentSetting;

    /** 取引終了品番リスト(「,」で連結) **/
    private  String   outOfRangeItemList;

    /** 企業情報 **/
    private  Party    party;

    /** 発注者 **/
    private  String   partyIdBy;

    /** 発注元 **/
    private  String   partyIdOb;

    /** 受注者 **/
    private  String   partyIdSe;

    /** 出荷元 **/
    private  String   partyIdSf;

    /** 納入先 **/
    private  String   partyIdSt;

    /** 発注者名称 **/
    private  String   partyNameBy;

    /** 発注元名称 **/
    private  String   partyNameOb;

    /** 受注者名称 **/
    private  String   partyNameSe;

    /** 出荷元名称 **/
    private  String   partyNameSf;

    /** 納入先名称 **/
    private  String   partyNameSt;

    /** 事業所情報 **/
    private  Place    place;

    /** 発注者事業所 **/
    private  String   placeIdBy;

    /** 発注元工区 **/
    private  String   placeIdOb;

    /** 受注者事業所 **/
    private  String   placeIdSe;

    /** 出荷元工区 **/
    private  String   placeIdSf;

    /** 納入先工区 **/
    private  String   placeIdSt;

    /** 発注者事業所名称 **/
    private  String   placeNameBy;

    /** 発注元工場名 **/
    private  String   placeNameOb;

    /** 受注者事業所名称 **/
    private  String   placeNameSe;

    /** 出荷元工場名 **/
    private  String   placeNameSf;

    /** 納入先工場名 **/
    private  String   placeNameSt;

    /** 納入場所 **/
    private  String   placeOfDischargeId;

    /** 出荷場所 **/
    private  String   placeOfLoadingId;

    /** 出荷場所名称 **/
    private  String   placeOfLoadingName;

    /** 上限保留枚数 **/
    private  Long     reservesKanbanCount;

    /** 検索結果 **/
    private  String   searchResult;

    /** 計算後の納入日・便 **/
    private  ShipmentDateNo   shipmentDateNo;

    /** 変更情報提供識別 **/
    //private  String   syncCode;

    /** 便 **/
    private  String   transportMeansIdentName;

    /** 表示用トランザクションステータス */
    private  String   viewStatus;

    /** BaseInboundKanbanDeljitBean */
    /** 納入指示候補の全品番リスト **/
    private  List<Item>   allItemList;

    /** データNo **/
    private  Integer   dataNo;

    /** データ件数(品番件数) **/
    private  Integer   dataNum;

    /** データ件数(総箱数) **/
    private  Integer   dataNum2;

    /** EDI送信ステータス **/
    //private  String    ediSendStatus;

    /** 納入指示実行可 **/
    private  Boolean   forceDeljit;

    /** 輸送ヘッダー **/
    private  TransportHeader   header;

    /** 処理日 **/
    //private  Date   operationDate;

    /** 処理時間 **/
    private  String   operationTime;

    /** カレンダーマスタ情報（親） **/
    //private  OptionCalendar   optionCalendar;

    /** 基本情報設定の納入方式リスト **/
    private  List<String>   optionItemTypeM01List;

    /** かんばんサイクル情報 **/
    //private  OptionKanbanCycle   optionKanbanCycle;

    /** 納入指示テーブル情報 **/
    //private  OptionShipmentSetting   optionShipmentSetting;

    /** 企業情報 **/
    //private  Party   party;

    /** 事業所情報 **/
    //private  Place   place;

    /** 納入日・便 **/
    //private  ShipmentDateNo   shipmentDateNo;

    /** BaseInboundKanbanDeljitBean */
    /** サイクルA~Dを連結した文字列 **/
    private  String   cycleInfo;

//    /**
//     * Bean格納情報の出力
//     * @return
//     */
//	public String outputContents(SummaryKanban.LogicType logicType) {
//		StringBuffer buf = new StringBuffer();
//
//		if (logicType.equals(SummaryKanban.LogicType.getDeljit)) {
//			buf.append("[処理日/時間:");
//			buf.append(getOperationDate() + "]");
//			buf.append("[出荷元:");
//			buf.append(this.getParty().getCodeName() + "]");
//			buf.append("[出荷元工区:");
//			buf.append(this.getOptionKanbanCycle().getPlaceSf().getCodeName()
//					+ "]");
//			buf.append("[発注便:");
//			buf.append(this.getAppendShipmentNo() + "]");
//			buf.append("[発注日種別:");
//			buf.append(this.getSearchResult() + "]");
//			buf.append("[サイクル:");
//			buf.append(this.getCycleInfo() + "]");
//			buf.append("[前回処理日:");
//			buf.append(getLastOperationDate() + "]");
//			buf.append("[前回処理便:");
//			buf.append(getLastOperationNo() + "]");
//			buf.append("[稼動情報:");
//			buf.append(this.getOptionCalendarSetting().getOperatingInfo() + "]");
//			if (this.getOptionItemTypeM01List() != null) {
//				buf.append("\n");
//				buf.append("[基本情報設定の納入方式:");
//				buf.append(this.getOptionItemTypeM01List().toString() + "]");
//			} else {
//				buf.append("\n");
//				buf.append("[基本情報設定の納入方式:なし" + "]");
//			}
//		} else {
//			int counter = 0;
//			// 納入指示候補の全品番リストを出力する
//			for (Item itemSpec : this.getAllItemList()) {
//				buf.append("[品番:" + itemSpec.getItemIdIn() + "]");
//				buf.append("[部品取扱識別:" + itemSpec.getItemE18() + "]");
//				buf.append("[納入方式:" + itemSpec.getItemM01Desc() + "]");
//				buf.append("[有効期限開始日:"
//						+ itemSpec.getValidStart().getStringDate() + "]");
//				buf.append("[有効期限終了日:" + itemSpec.getValidEnd().getStringDate()
//						+ "]");
//				buf.append("[収容数:" + itemSpec.getPerPackageQuantity()+ "]");
//				buf.append("[出荷場所:" + itemSpec.getPlaceOfLoadingId()+ "]");
//				buf.append("[納入場所:" + itemSpec.getPlaceOfDischargeId()+ "]");
//
//				counter++;
//
//				if (getAllItemList().size() != counter) {
//					buf.append("\n");
//				}
//			}
//			
//
//			if (getAllItemList() == null || getAllItemList().size() == 0) {
//				buf.append("対象なし");
//			}
//		}
//		return buf.toString();
//	}
}
