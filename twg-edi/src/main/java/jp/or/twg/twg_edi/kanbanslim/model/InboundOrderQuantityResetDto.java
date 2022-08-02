package jp.or.twg.twg_edi.kanbanslim.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 発注枚数リセット処理 Dto
 *
 * @author kawadet
 *
 */
@Setter
@Getter
public class InboundOrderQuantityResetDto {

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
    private long perPackageQuantity;

    // 読取・発注枚数管理テーブル
    private long oroqmOid;
    private long placeStOid;
    private long itemPartOid;
    private Integer orderQuantity;


}
