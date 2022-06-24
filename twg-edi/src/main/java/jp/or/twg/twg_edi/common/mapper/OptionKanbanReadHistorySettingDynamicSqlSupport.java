package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionKanbanReadHistorySettingDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	public static final OptionKanbanReadHistorySetting optionKanbanReadHistorySetting = new OptionKanbanReadHistorySetting();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.oid")
	public static final SqlColumn<Long> oid = optionKanbanReadHistorySetting.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.kanban_read_history_oid")
	public static final SqlColumn<Long> kanbanReadHistoryOid = optionKanbanReadHistorySetting.kanbanReadHistoryOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.delivery_date_string_date")
	public static final SqlColumn<String> deliveryDateStringDate = optionKanbanReadHistorySetting.deliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.shipment_no")
	public static final SqlColumn<Integer> shipmentNo = optionKanbanReadHistorySetting.shipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.doc_ref_id_aau")
	public static final SqlColumn<String> docRefIdAau = optionKanbanReadHistorySetting.docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.party_id_st")
	public static final SqlColumn<String> partyIdSt = optionKanbanReadHistorySetting.partyIdSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_id_st")
	public static final SqlColumn<String> placeIdSt = optionKanbanReadHistorySetting.placeIdSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_of_discharge_id")
	public static final SqlColumn<String> placeOfDischargeId = optionKanbanReadHistorySetting.placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.party_id_sf")
	public static final SqlColumn<String> partyIdSf = optionKanbanReadHistorySetting.partyIdSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_id_sf")
	public static final SqlColumn<String> placeIdSf = optionKanbanReadHistorySetting.placeIdSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.item_id_pd")
	public static final SqlColumn<String> itemIdPd = optionKanbanReadHistorySetting.itemIdPd;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.item_e18")
	public static final SqlColumn<String> itemE18 = optionKanbanReadHistorySetting.itemE18;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.branch_no")
	public static final SqlColumn<Long> branchNo = optionKanbanReadHistorySetting.branchNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.read_status")
	public static final SqlColumn<Integer> readStatus = optionKanbanReadHistorySetting.readStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.read_date_time")
	public static final SqlColumn<Date> readDateTime = optionKanbanReadHistorySetting.readDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionKanbanReadHistorySetting.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionKanbanReadHistorySetting.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionKanbanReadHistorySetting.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionKanbanReadHistorySetting.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionKanbanReadHistorySetting.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionKanbanReadHistorySetting.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	public static final class OptionKanbanReadHistorySetting extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> kanbanReadHistoryOid = column("kanban_read_history_oid", JDBCType.BIGINT);
		public final SqlColumn<String> deliveryDateStringDate = column("delivery_date_string_date", JDBCType.VARCHAR);
		public final SqlColumn<Integer> shipmentNo = column("shipment_no", JDBCType.INTEGER);
		public final SqlColumn<String> docRefIdAau = column("doc_ref_id_aau", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdSt = column("party_id_st", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdSt = column("place_id_st", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfDischargeId = column("place_of_discharge_id", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdSf = column("party_id_sf", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdSf = column("place_id_sf", JDBCType.VARCHAR);
		public final SqlColumn<String> itemIdPd = column("item_id_pd", JDBCType.VARCHAR);
		public final SqlColumn<String> itemE18 = column("item_e18", JDBCType.VARCHAR);
		public final SqlColumn<Long> branchNo = column("branch_no", JDBCType.BIGINT);
		public final SqlColumn<Integer> readStatus = column("read_status", JDBCType.INTEGER);
		public final SqlColumn<Date> readDateTime = column("read_date_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionKanbanReadHistorySetting() {
			super("public.option_kanban_read_history_setting");
		}
	}
}