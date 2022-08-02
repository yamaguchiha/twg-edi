package jp.or.twg.twg_edi.master.model;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * かんばん増減情報　検索条件
 *
 * @author koukit
 *
 */
@Setter
@Getter
public class KanbanAdjustSearchCondition {

    // 納入先事業所情報OID
    private long srhPlaceByOid;

    // 背番号
    private String srhItemE04;

    // 背番号（一致条件）
    private String srhItemE04Type;

    // 納入場所
    private String srhPlaceOfDischargeId;

    // 品番
    private String srhItemIdIn;

    // 品番（一致条件）
    private String srhItemIdInType;

    // 出荷元
    private String srhPartyAbbrCode;

    // 出荷元工区
    private String srhPlaceCode;

    // 出荷元工区
    private Long srhPlaceSfOid;

    // 部品取扱識別
    private String srhItemE18;

    // 出荷場所
    private String srhPlaceOfLoadingId;

    // 増減開始日（範囲指定開始）
    @Size(max = 10)
    private String srhStartDate;

    // 増減開始日（範囲指定終了）
    @Size(max = 10)
    private String srhEndDate;

    // 区分（選択したチェックボックスリスト）
    private Integer[] srhAdjustTypes;

    // 増減状況（選択したチェックボックスリスト）
    private Integer[] srhAdjustStatus;


    // 検索件数
    private int srhLimit;

    // 検索開始位置
    private Long srhOffset;

    // ページサイズ
    private Long pageSize;
}
