package jp.or.twg.twg_edi.kanbanslim.model;

import java.util.List;

import jp.or.twg.twg_edi.kanban.service.OptionThreadManagerBean;
import lombok.Getter;
import lombok.Setter;

/**
 * かんばん納入指示Slim　かんばん納入指示form
 *
 * @author yamaguchiha
 *
 */
@Setter
@Getter
public class KanbanSlimDeljitForm {

	/** 出荷場セキュリティ使用 */
	private boolean userDischargePlaceCode;

	/** 検索条件：納入場所 */
	private String shipToReciveCode;

	/** 実行権限(運用者、管理者、システム) */
	private boolean authorized;

	/** 納入指示実行条件：処理日 */
	private String iptOperationDate;

	/** 納入指示実行条件：納入指示日 */
	private String iptShipmentDate;

	/** 納入指示実行条件：納入指示便 */
	private String iptShipmentNo;

	/** 1ページに表示する件数 */
	private Long pageSize;

	//Form（publicメソッド）
	// 納入指示送信履歴リスト
	private List<OptionThreadManagerBean> unissuedDownloadList;

	// 納入指示送信実行状況の取得(isRunKanbanOrder)
	private boolean isKanbanOrder;

	/** 一覧 */
//	Page<KanbanSlimDeljitBean> pageList;
	List<KanbanSlimDeljitBean> beanList;

}
