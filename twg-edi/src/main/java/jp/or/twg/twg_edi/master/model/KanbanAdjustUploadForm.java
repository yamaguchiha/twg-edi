package jp.or.twg.twg_edi.master.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * かんばん増減情報 Upload form
 *
 * @author koukit
 *
 */
@Setter
@Getter
public class KanbanAdjustUploadForm {

    /** 1ページに表示する件数 */
    private Long pageSize;

    /** ページ番号 */
    private int pageNumber;

    /** アップロードしたcsvリスト */
    List<KanbanAdjustCsvDto> csvList;
}
