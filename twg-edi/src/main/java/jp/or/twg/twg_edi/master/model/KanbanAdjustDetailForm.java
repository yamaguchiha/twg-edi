package jp.or.twg.twg_edi.master.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * かんばん増減情報form
 *
 * @author koukit
 *
 */
@Setter
@Getter
public class KanbanAdjustDetailForm {

    private String mode;
    // modeがNEWの時に品番検索済か確認するためのsubmode（NEW:品番未検索 EDIT:品番検索済）
    private String subMode;

    // かんばん増減情報Oid hidden項目
    private Long oid;

    // 納入場所
    private String placeOfDischargeId;

    // 出荷元
    // 出荷元工区
    private String partySf;
    private String partySfCode;
    private String partySfName;

    private String placeSf;
    private String placeSfCode;
    private String placeSfName;

    private String placeSfOid;

    // 出荷場所
    private String placeOfLoadingId;
    private String placeOfLoadingName;

    // 発注元
    // 発注元工区
    private String partyOb;
    private String partyObCode;
    private String partyObName;

    private String placeOb;
    private String placeObCode;
    private String placeObName;

    private String placeObOid;

    // 背番号
    private String itemE04;

    // 品番　表示用品番
    private String itemIdIn;
    private String itemIdPd;

    // 部品取扱識別
    private String itemE18;

    // 収容数
    private String perPackageQuantity;

    // 所番地
    private String manufacturingDepartmentId;




    // かんばん増減情報OID
    private Long okaOid;

    // 受入品番マスタOID
    private Long itemPartOid;

    // 計画日 固定長日付
    private String planDateStringDate;

    // 増減開始納入指示日 固定長日付
    private String startDeliveryDateStringDate;

    // 増減開始納入指示便
    private Integer startShipmentNo;

    // 増減状況
    private List<Integer> adjustStatusList;

    // 選択した増減状況 confirmで使用
    private Integer adjustStatus;
    private String  adjustStatusName;

    // 増減区分
    private List<Integer> adjustTypeList;

    // 選択した増減状況 confirmで使用
    private Integer adjustType;
    private String adjustTypeName;

    // 増減枚数
    private Long quantity;

    // 便当増減枚数
    private BigDecimal parQuantity;

    // 増減累計枚数
    private Long totalQuantity;

    // 増減繰越端数
    private BigDecimal carryForwardFractionQuantity;

    private long userOid;
    private long userPlaceOid;

}
