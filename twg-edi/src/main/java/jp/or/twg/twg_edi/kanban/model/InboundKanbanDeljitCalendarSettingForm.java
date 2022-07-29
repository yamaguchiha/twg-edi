package jp.or.twg.twg_edi.kanban.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InboundKanbanDeljitCalendarSettingForm {
	private Long optionCalendarOid;
	private Long optionCalendarOidDefault;
	private Date operationDate;
}
