package jp.or.twg.twg_edi.kanbanslim.model;

import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.common.entity.OptionOrderTargetManager;
import lombok.Getter;
import lombok.Setter;

/**
 * かんばんSlim用画面Bean
 *
 * @author yamaguchiha
 *
 */
@Getter
@Setter
public class KanbanSlimDeljitBean {

    /**
     * 納入指示候補の全品番リスト
    **/
    private  java.util.List<Item>   allItemList;

    /**
     * EDI送信ステータス
    **/
    private  String   ediSendStatus;

    /**
     * 納入指示実行可
    **/
    private  Boolean   forceDeljit;

    /**
     * 納入指示日
    **/
    private  String   iptDeliveryDate;

    /**
     * 納入指示便
    **/
    private  String   iptShipmentNo;

    /**
     * 最終納入指示日
    **/
    private  String   lastDeliveryDate;

    /**
     * 最終処理日
    **/
    private  String   lastProcessDate;

    /**
     * 最終納入指示便
    **/
    private  String   lastShipmentNo;

    /**
     * 備考
    **/
    private  String   memo;

    /**
     * 処理時間
    **/
    private  String   operationTime;

    /**
     * 基本情報設定の納入方式リスト
    **/
    private  java.util.List<String>   optionItemTypeM01List;

    /**
     * 発注対象情報
    **/
    private OptionOrderTargetManager   optionOrderTargetManager;


}
