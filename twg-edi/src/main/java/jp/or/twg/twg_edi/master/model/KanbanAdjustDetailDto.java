package jp.or.twg.twg_edi.master.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

/**
 * かんばん増減情報 詳細 Dto
 *
 * @author koukit
 *
 */
@Setter
@Getter
public class KanbanAdjustDetailDto {

    // 品番マスタ
    private long oid;
    private String placeOfDischargeId;
    private long placeSfOid;
    private String placeOfLoadingId;
    private String placeOfloadingName;
    private long placeObOid;
    private String itemE04;
    private String itemIdIn;
    private String itemIdPd;
    private String itemE18;
    private long perPackageQuantity;
    private String manufacturingDepartmentId;

    // かんばん増減情報
    private long okaOid;
    private long itemPartOid;
    private Integer adjustStatus;
    private String planDateStringDate;
    private String startDeliveryDateStringDate;
    private Integer startShipmentNo;
    private Integer adjustType;
    private long quantity;
    private BigDecimal parQuantity;
    private long totalQuantity;
    private BigDecimal carryForwardFractionQuantity;
}
