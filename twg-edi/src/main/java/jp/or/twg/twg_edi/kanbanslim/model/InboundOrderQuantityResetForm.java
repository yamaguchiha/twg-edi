package jp.or.twg.twg_edi.kanbanslim.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * 発注枚数リセット処理form
 *
 * @author kawadet
 *
 */
@Setter
@Getter
public class InboundOrderQuantityResetForm {

    /** 出荷場セキュリティ使用 */
    private boolean userDischargePlaceCode;

    /** 実行権限(運用者、管理者、システム) */
    private boolean authorized;

    /** 1ページに表示する件数 */
    private Long pageSize;

    /** ページ番号 */
    private int pageNumber;

    /** 検索条件 */
    private InboundOrderQuantityResetSrhCond condition;

    /** 一覧 */
    // 一覧（更新用）
    List<InboundOrderQuantityResetSaveDto> saveList;

}