package jp.or.twg.twg_edi.kanban.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InboundKanbanDeljitKanbanCycleForm {
	private Long placeStOid;
	private Long placeSfOid;
	private String placeOfDischargeId;
	private Boolean isNotOrder;
	private String lastProcessingDate_yyyymmdd;
	private Integer lastProcessingNo;
}
