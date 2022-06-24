package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionKanbanCycleDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	public static final OptionKanbanCycle optionKanbanCycle = new OptionKanbanCycle();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.oid")
	public static final SqlColumn<Long> oid = optionKanbanCycle.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.place_st_oid")
	public static final SqlColumn<Long> placeStOid = optionKanbanCycle.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.place_of_discharge_id")
	public static final SqlColumn<String> placeOfDischargeId = optionKanbanCycle.placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.place_sf_oid")
	public static final SqlColumn<Long> placeSfOid = optionKanbanCycle.placeSfOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.cycle_a")
	public static final SqlColumn<Integer> cycleA = optionKanbanCycle.cycleA;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.cycle_b")
	public static final SqlColumn<Integer> cycleB = optionKanbanCycle.cycleB;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.cycle_c")
	public static final SqlColumn<Integer> cycleC = optionKanbanCycle.cycleC;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.cycle_d")
	public static final SqlColumn<Integer> cycleD = optionKanbanCycle.cycleD;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.option_calendar_oid")
	public static final SqlColumn<Long> optionCalendarOid = optionKanbanCycle.optionCalendarOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.last_processing_date")
	public static final SqlColumn<Date> lastProcessingDate = optionKanbanCycle.lastProcessingDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.last_processing_no")
	public static final SqlColumn<Integer> lastProcessingNo = optionKanbanCycle.lastProcessingNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.last_delivery_date_string_date")
	public static final SqlColumn<String> lastDeliveryDateStringDate = optionKanbanCycle.lastDeliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.last_shipment_no")
	public static final SqlColumn<Integer> lastShipmentNo = optionKanbanCycle.lastShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionKanbanCycle.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionKanbanCycle.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionKanbanCycle.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionKanbanCycle.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionKanbanCycle.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source field: public.option_kanban_cycle.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionKanbanCycle.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	public static final class OptionKanbanCycle extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<String> placeOfDischargeId = column("place_of_discharge_id", JDBCType.VARCHAR);
		public final SqlColumn<Long> placeSfOid = column("place_sf_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> cycleA = column("cycle_a", JDBCType.INTEGER);
		public final SqlColumn<Integer> cycleB = column("cycle_b", JDBCType.INTEGER);
		public final SqlColumn<Integer> cycleC = column("cycle_c", JDBCType.INTEGER);
		public final SqlColumn<Integer> cycleD = column("cycle_d", JDBCType.INTEGER);
		public final SqlColumn<Long> optionCalendarOid = column("option_calendar_oid", JDBCType.BIGINT);
		public final SqlColumn<Date> lastProcessingDate = column("last_processing_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Integer> lastProcessingNo = column("last_processing_no", JDBCType.INTEGER);
		public final SqlColumn<String> lastDeliveryDateStringDate = column("last_delivery_date_string_date",
				JDBCType.VARCHAR);
		public final SqlColumn<Integer> lastShipmentNo = column("last_shipment_no", JDBCType.INTEGER);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionKanbanCycle() {
			super("public.option_kanban_cycle");
		}
	}
}