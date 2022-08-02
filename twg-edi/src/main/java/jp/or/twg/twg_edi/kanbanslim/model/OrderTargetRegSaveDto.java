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
public class OrderTargetRegSaveDto {

    // 発注対象管理テーブル
    private long ootmOid;
    private long placeStOid;
    private long itemPartOid;
    private Integer orderTargetType;
    private long userOid;
    private long userPlaceOid;
    // 対象選択（入力）
    private Integer iptOrderTargetType;

}
