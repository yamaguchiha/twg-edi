package jp.or.twg.twg_edi.kanbanslim.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 検索条件用クラス
 *
 * @author yamaguchiha
 *
 */
@Getter
@Setter
public class KanbanSlimDeljitCondition {

	private Long placeByOid;

	private String materialsTypeCode;

	private String shipToReciveCode;

	private Long pageSize;
}
