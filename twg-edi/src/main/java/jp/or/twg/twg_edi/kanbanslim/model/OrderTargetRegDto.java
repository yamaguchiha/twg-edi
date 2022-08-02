package jp.or.twg.twg_edi.kanbanslim.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 発注対象登録処理 Dto
 *
 * @author kawadet
 *
 */
@Setter
@Getter
public class OrderTargetRegDto {

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


    // 発注対象管理テーブル
    private long ootmOid;
    private long placeStOid;
    private long itemPartOid;
    private String lastProcessingDate;
    private String lastDeliveryDate;
    private Integer lastShipmentNo;

    // 対象選択（入力）
    private Integer orderTargetType;

}
