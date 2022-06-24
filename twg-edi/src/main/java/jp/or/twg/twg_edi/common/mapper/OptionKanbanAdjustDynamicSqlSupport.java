package jp.or.twg.twg_edi.common.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionKanbanAdjustDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	public static final OptionKanbanAdjust optionKanbanAdjust = new OptionKanbanAdjust();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.oid")
	public static final SqlColumn<Long> oid = optionKanbanAdjust.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.item_part_oid")
	public static final SqlColumn<Long> itemPartOid = optionKanbanAdjust.itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.plan_date_string_date")
	public static final SqlColumn<String> planDateStringDate = optionKanbanAdjust.planDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.start_delivery_date_string_date")
	public static final SqlColumn<String> startDeliveryDateStringDate = optionKanbanAdjust.startDeliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.start_shipment_no")
	public static final SqlColumn<Integer> startShipmentNo = optionKanbanAdjust.startShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.adjust_status")
	public static final SqlColumn<Integer> adjustStatus = optionKanbanAdjust.adjustStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.adjust_type")
	public static final SqlColumn<Integer> adjustType = optionKanbanAdjust.adjustType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.quantity")
	public static final SqlColumn<Long> quantity = optionKanbanAdjust.quantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.par_quantity")
	public static final SqlColumn<BigDecimal> parQuantity = optionKanbanAdjust.parQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.total_quantity")
	public static final SqlColumn<Long> totalQuantity = optionKanbanAdjust.totalQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.carry_forward_fraction_quantity")
	public static final SqlColumn<BigDecimal> carryForwardFractionQuantity = optionKanbanAdjust.carryForwardFractionQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionKanbanAdjust.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionKanbanAdjust.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionKanbanAdjust.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionKanbanAdjust.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionKanbanAdjust.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionKanbanAdjust.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	public static final class OptionKanbanAdjust extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> itemPartOid = column("item_part_oid", JDBCType.BIGINT);
		public final SqlColumn<String> planDateStringDate = column("plan_date_string_date", JDBCType.VARCHAR);
		public final SqlColumn<String> startDeliveryDateStringDate = column("start_delivery_date_string_date",
				JDBCType.VARCHAR);
		public final SqlColumn<Integer> startShipmentNo = column("start_shipment_no", JDBCType.INTEGER);
		public final SqlColumn<Integer> adjustStatus = column("adjust_status", JDBCType.INTEGER);
		public final SqlColumn<Integer> adjustType = column("adjust_type", JDBCType.INTEGER);
		public final SqlColumn<Long> quantity = column("quantity", JDBCType.BIGINT);
		public final SqlColumn<BigDecimal> parQuantity = column("par_quantity", JDBCType.NUMERIC);
		public final SqlColumn<Long> totalQuantity = column("total_quantity", JDBCType.BIGINT);
		public final SqlColumn<BigDecimal> carryForwardFractionQuantity = column("carry_forward_fraction_quantity",
				JDBCType.NUMERIC);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionKanbanAdjust() {
			super("public.option_kanban_adjust");
		}
	}
}