package jp.or.twg.twg_edi.system.model;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * 処理一覧情報　検索条件
 *
 * @author kawadet
 *
 */
@Setter
@Getter
public class OptionThreadManagerSrhCond {

    // 処理番号
    private String srhId;

    // 処理種別
    private String srhThreadCategory;

    // 開始日（範囲指定開始）
    @Size(max = 10)
    private String srhStartUpTime;

    // 開始日（範囲指定終了）
    @Size(max = 10)
    private String srhCloseOutTime;

    // 状態（選択したチェックボックスリスト）
    private String[] srhThreadStatus;

    // 検索件数
    private int srhLimit;

    // 検索開始位置
    private Long srhOffset;


    // ページサイズ
    private Long pageSize;
}
