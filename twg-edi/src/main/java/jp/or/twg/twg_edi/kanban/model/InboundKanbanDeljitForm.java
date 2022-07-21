package jp.or.twg.twg_edi.kanban.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import jp.or.twg.twg_edi.kanban.service.OptionThreadManagerBean;
import lombok.Getter;
import lombok.Setter;

/**
 * かんばん納入指示form
 *
 * @author nishidat
 */
@Setter
@Getter
public class InboundKanbanDeljitForm {

	//BaseForm
	// テーブルNo
	private Integer inputTableNo;

	// 処理日
	private String inputOperationDate;

//	// 処理時刻	TODO:要否切り分け
//	private String inputOperationTime;

	// 未発注分のみ("Y" or "N")
	private Boolean notOrder;

	// 処理日
	private Date operationDate;

	// ログインユーザーの出荷元
    private String ownTdbPartyCode;

	// ログインユーザーの出荷元工区
	private String ownTdbPlaceCode;

	// 検索処理実行判定
	private Boolean runSearch;

	// 納品書番号の自動採番フラグ（true：自動採番する）
	private  Boolean autoSetDocRefIdAau;
	//BaseForm

	//Form（publicメソッド）
	// 納入指示送信履歴リスト
	private List<OptionThreadManagerBean> unissuedDownloadList;

	// 納入指示送信実行状況の取得(isRunKanbanOrder)
	private boolean isKanbanOrder;

	// テーブルNoList
	private Map<String, String> itemTypeHtmlList;

	// 備考コメント
	private String deliveryMemo;
	//Form（publicメソッド）

	/** 1ページに表示する件数 */
	private Long pageSize;
}
