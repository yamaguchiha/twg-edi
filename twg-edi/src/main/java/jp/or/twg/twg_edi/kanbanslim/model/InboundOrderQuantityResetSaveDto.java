package jp.or.twg.twg_edi.kanbanslim.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 発注枚数リセット Dto
 *
 * @author kawadet
 *
 */
@Setter
@Getter
public class InboundOrderQuantityResetSaveDto {

    // 読取・発注枚数管理テーブル
    private long oroqmOid;
    private Integer orderQuantity;
    private long userOid;
    private long userPlaceOid;

    //発注枚数リセット選択
    private boolean resetOrderQuantity;

}
