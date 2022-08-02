package jp.or.twg.twg_edi.master.model;

import lombok.Getter;
import lombok.Setter;

/**
 * かんばん増減情報 Dto
 *
 * @author koukit
 *
 */
@Setter
@Getter
public class KanbanAdjustDto {

    // 品番マスタ
    private long oid;
    private String placeOfDischargeId;

    //出荷元工区
    private long placeSfOid;
    private String placeSfCode;
    private String placeSfName;

    //出荷元
    private String partySfCode;
    private String partySfName;

    private String placeOfLoadingId;
    private String placeOfLoadingName;
    private String itemE04;
    private String itemIdIn;
    private String itemIdPd;
    private String itemE18;

    // かんばん増減情報
    private long okaOid;
    private long itemPartOid;
    private String startDeliveryDateStringDate;
    private int startShipmentNo;

    // 増減区分
    private int adjustType;
    private String adjustTypeName;

    private long quantity;
    private long totalQuantity;

    // 増減状況
    private int adjustStatus;
    private String adjustStatusName;

    // ページサイズ
    private Long pageSize;
}
