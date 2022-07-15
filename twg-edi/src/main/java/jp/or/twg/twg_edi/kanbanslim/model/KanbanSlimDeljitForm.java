package jp.or.twg.twg_edi.kanbanslim.model;

import org.springframework.data.domain.Page;

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

	/** 一覧 */
	Page<KanbanSlimDeljitBean> pageList;

}
