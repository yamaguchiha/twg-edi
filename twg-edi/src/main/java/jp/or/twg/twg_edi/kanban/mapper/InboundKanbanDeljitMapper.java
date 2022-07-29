package jp.or.twg.twg_edi.kanban.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.or.twg.twg_edi.common.entity.OptionCalendarSetting;
import jp.or.twg.twg_edi.common.entity.OptionKanbanCycle;
import jp.or.twg.twg_edi.kanban.model.InboundKanbanDeljitCalendarSettingForm;
import jp.or.twg.twg_edi.kanban.model.InboundKanbanDeljitKanbanCycleForm;


/**
 * かんばん納入指示オプション　かんばん納入指示
 * @author nishidat
 */
@Mapper
public interface InboundKanbanDeljitMapper {

	/**
	 * かんばんサイクル情報取得
	 * @param 
	 * @return かんばんサイクル ※Listで取得するがFKで取得条件絞るので必ず1件（or 0件）
	 */
	public List<OptionKanbanCycle> getOptionKanbanCycle(InboundKanbanDeljitKanbanCycleForm form);

	/**
	 * カレンダーマスタ（子）情報取得
	 * @param optionCalendarOidDefault デフォルトカレンダーOID
	 * @return カレンダーマスタ（子） ※Listで取得するがlimitで取得するため、1件（or 0件）
	 */
	public List<OptionCalendarSetting> getOptionCalendarSetting(InboundKanbanDeljitCalendarSettingForm form);
}
