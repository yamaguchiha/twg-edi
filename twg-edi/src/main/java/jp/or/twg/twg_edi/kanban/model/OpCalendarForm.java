package jp.or.twg.twg_edi.kanban.model;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import jp.or.twg.twg_edi.common.entity.OptionCalendarSetting;
import jp.or.twg.twg_edi.common.entity.Place;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author nishidat
 */
@Setter
@Getter
public class OpCalendarForm{
	/** 処理とEntityを分けた **/

	private Map<Date, OptionCalendarSetting> calendarMap;
	private Place fromPlace;
	private Place toPlace;

	public OpCalendarForm(Place toPlace, Place fromPlace){
		setCalendarMap(new HashMap<Date, OptionCalendarSetting>());
		setToPlace(toPlace);
		setFromPlace(fromPlace);
	}
}