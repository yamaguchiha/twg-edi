package jp.or.twg.twg_edi.master.model;

import lombok.Getter;
import lombok.Setter;

/**
 * かんばん増減情報 CSV Dto
 *
 * @author koukit
 *
 */
@Setter
@Getter
public class KanbanAdjustCsvDto {

private String no;                  // No.
private String partyIdBy;           // 発注者
private String placeIdBy;           // 発注者事業所
private String partyIdSe;           // 受注者
private String placeIdSe;           // 受注者事業所
private String itemIdIn;            // 品番
private String itemE18;             // 部品取扱識別
private String partyIdOb;           // 発注元
private String placeIdOb;           // 発注元工区
private String partyIdSf;           // 出荷元
private String placeIdSf;           // 出荷元工区
private String partyIdSt;           // 納入先
private String placeIdSt;           // 納入先工区
private String planDate;            // 計画日
private String startDeliveryDate;   // 増減開始納入指示日
private String startShipmentNo;     // 増減開始便
private String adjustType;          // 増減区分
private String quantity;            // 増減枚数
private String parQuantity;         // 便当増減枚数

}
