package jp.or.twg.twg_edi.kanbanslim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.kanbanslim.model.KanbanSlimDeljitCondition;

/**
 * かんばん納入指示Slimオプション　かんばん納入指示
 *
 * @author yamaguchiha
 *
 */
@Mapper
public interface KanbanSlimDeljitMapper {

	/**
	 * 対象一覧用の品番取得
	 *
	 * @param cond
	 * @return
	 */
	public List<Item> getSelectItemList(KanbanSlimDeljitCondition cond);
}
