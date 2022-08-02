package jp.or.twg.twg_edi.kanbanslim.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 発注枚数リセット　検索条件
 *
 * @author kawadet
 *
 */
@Setter
@Getter
public class InboundOrderQuantityResetSrhCond {
    // 発注者事業所工区OID
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

    // 出荷元工区OID
    private long srhPlaceSfOid;

    // 部品取扱識別
    private String srhItemE18;

    // 出荷場所
    private String srhPlaceOfLoadingId;


    // 検索件数
    private int srhLimit;

    // 検索開始位置
    private Long srhOffset;

    // ページサイズ
    private Long pageSize;
}
