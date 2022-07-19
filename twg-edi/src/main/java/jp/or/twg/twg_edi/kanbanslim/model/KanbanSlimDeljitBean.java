package jp.or.twg.twg_edi.kanbanslim.model;

import java.util.Date;

import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.PartySetting;
import jp.or.twg.twg_edi.common.entity.Place;
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
     * 納入場所
    **/
    private  String   placeOfDischargeId;

    /**
     * 出荷場所
    **/
    private  String   placeOfLoadingId;

    /**
     * 出荷場所名称
    **/
    private  String   placeOfLoadingName;

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
     */
    private String    memo;

    /**
     * 前回処理日
    **/
    private  String   lastOperationDate;

    /**
     * 前回処理便
    **/
    private  String   lastOperationNo;

    /**
     * 納入指示日
    **/
    private  String   iptDeliveryDate;

    /**
     * 納入指示便
    **/
    private  String   iptShipmentNo;

    /**
     * 処理日
    **/
    private  Date   operationDate;

    /**
     * 出荷元Party
     */
    private Party partySf;

    /**
     * 出荷元PartySetting
     */
    private PartySetting partySfSetting;

    /**
     * 出荷元Place
     */
    private Place placeSf;
}
