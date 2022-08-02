package jp.or.twg.twg_edi.master.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import jp.or.twg.twg_edi.common.entity.OptionKanbanAdjust;
import jp.or.twg.twg_edi.master.model.KanbanAdjustDetailDto;
import jp.or.twg.twg_edi.master.model.KanbanAdjustDetailForm;
import jp.or.twg.twg_edi.master.model.KanbanAdjustDto;
import jp.or.twg.twg_edi.master.model.KanbanAdjustSearchCondition;

@Mapper
public interface KanbanAdjustMapper {
/**
 * かんばん増減一覧xml用
 *
 * @param condition
 * @return
 */
public List<KanbanAdjustDto> selectKanbanAdjustList(KanbanAdjustSearchCondition condition);

/**
 * かんばん増減一覧count xml用
 *
 * @param condition
 * @return
 */
public long selectKanbanAdjustListCount(KanbanAdjustSearchCondition condition);

/**
 * かんばん増減編集用
 *
 * @param srhOid
 * @return
 */
public KanbanAdjustDetailDto selectKanbanAdjustDetail(long srhOid);

/**
 * かんばん増減取得
 *
 * @param itemPartOid
 * @return
 */
public OptionKanbanAdjust selectKanbanAdjustOne(long itemPartOid);

/**
 * 品番検索用
 *
 * @param itemIdIn
 * @param itemE18
 * @return
 */
public KanbanAdjustDetailDto selectItemDetail(Map<String, Object> param);

/**
 * かんばん増減削除
 *
 * @param srhOid
 * @return none
 */
public void delete(long srhOid);

/**
 * かんばん増減新規
 *
 * @param form
 * @return none
 */
public void insert(KanbanAdjustDetailForm form);

/**
 * かんばん増減更新
 *
 * @param form
 * @return none
 */
public void update(KanbanAdjustDetailForm form);
}