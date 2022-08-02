package jp.or.twg.twg_edi.master.model;

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
public class KanbanAdjustForm {

    /** 出荷場セキュリティ使用 */
    private boolean userDischargePlaceCode;

    /** 実行権限(運用者、管理者、システム) */
    private boolean authorized;

    /** 1ページに表示する件数 */
    private Long pageSize;

    /** ページ番号 */
    private int pageNumber;

    /** 検索条件 */
    private KanbanAdjustSearchCondition condition;

}
