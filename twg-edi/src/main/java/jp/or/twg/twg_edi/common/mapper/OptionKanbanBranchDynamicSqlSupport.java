package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionKanbanBranchDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	public static final OptionKanbanBranch optionKanbanBranch = new OptionKanbanBranch();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.oid")
	public static final SqlColumn<Long> oid = optionKanbanBranch.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.place_st_oid")
	public static final SqlColumn<Long> placeStOid = optionKanbanBranch.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.item_part_oid")
	public static final SqlColumn<Long> itemPartOid = optionKanbanBranch.itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.delivery_date_string_date")
	public static final SqlColumn<String> deliveryDateStringDate = optionKanbanBranch.deliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.shipment_no")
	public static final SqlColumn<Integer> shipmentNo = optionKanbanBranch.shipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.item_a04_desc")
	public static final SqlColumn<String> itemA04Desc = optionKanbanBranch.itemA04Desc;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.doc_ref_id_aau")
	public static final SqlColumn<String> docRefIdAau = optionKanbanBranch.docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.branch_no")
	public static final SqlColumn<Long> branchNo = optionKanbanBranch.branchNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.branch_status")
	public static final SqlColumn<Integer> branchStatus = optionKanbanBranch.branchStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.read_date_time")
	public static final SqlColumn<Date> readDateTime = optionKanbanBranch.readDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.read_count")
	public static final SqlColumn<Integer> readCount = optionKanbanBranch.readCount;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.processing_date_time")
	public static final SqlColumn<Date> processingDateTime = optionKanbanBranch.processingDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.processing_shipment_no")
	public static final SqlColumn<Integer> processingShipmentNo = optionKanbanBranch.processingShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.print_type")
	public static final SqlColumn<Integer> printType = optionKanbanBranch.printType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionKanbanBranch.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionKanbanBranch.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionKanbanBranch.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionKanbanBranch.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionKanbanBranch.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source field: public.option_kanban_branch.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionKanbanBranch.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	public static final class OptionKanbanBranch extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> itemPartOid = column("item_part_oid", JDBCType.BIGINT);
		public final SqlColumn<String> deliveryDateStringDate = column("delivery_date_string_date", JDBCType.VARCHAR);
		public final SqlColumn<Integer> shipmentNo = column("shipment_no", JDBCType.INTEGER);
		public final SqlColumn<String> itemA04Desc = column("item_a04_desc", JDBCType.VARCHAR);
		public final SqlColumn<String> docRefIdAau = column("doc_ref_id_aau", JDBCType.VARCHAR);
		public final SqlColumn<Long> branchNo = column("branch_no", JDBCType.BIGINT);
		public final SqlColumn<Integer> branchStatus = column("branch_status", JDBCType.INTEGER);
		public final SqlColumn<Date> readDateTime = column("read_date_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Integer> readCount = column("read_count", JDBCType.INTEGER);
		public final SqlColumn<Date> processingDateTime = column("processing_date_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Integer> processingShipmentNo = column("processing_shipment_no", JDBCType.INTEGER);
		public final SqlColumn<Integer> printType = column("print_type", JDBCType.INTEGER);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionKanbanBranch() {
			super("public.option_kanban_branch");
		}
	}
}