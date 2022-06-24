package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionOrderStopDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	public static final OptionOrderStop optionOrderStop = new OptionOrderStop();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.oid")
	public static final SqlColumn<Long> oid = optionOrderStop.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.item_part_oid")
	public static final SqlColumn<Long> itemPartOid = optionOrderStop.itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.order_stop_id")
	public static final SqlColumn<String> orderStopId = optionOrderStop.orderStopId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.order_stop_status")
	public static final SqlColumn<Integer> orderStopStatus = optionOrderStop.orderStopStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.start_delivery_date_string_date")
	public static final SqlColumn<String> startDeliveryDateStringDate = optionOrderStop.startDeliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.start_shipment_no")
	public static final SqlColumn<Integer> startShipmentNo = optionOrderStop.startShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.quantity")
	public static final SqlColumn<Long> quantity = optionOrderStop.quantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.total_quantity")
	public static final SqlColumn<Long> totalQuantity = optionOrderStop.totalQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.remainder_quantity")
	public static final SqlColumn<Long> remainderQuantity = optionOrderStop.remainderQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.fraction_quantity")
	public static final SqlColumn<Long> fractionQuantity = optionOrderStop.fractionQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.last_start_delivery_date_string_date")
	public static final SqlColumn<String> lastStartDeliveryDateStringDate = optionOrderStop.lastStartDeliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.last_start_shipment_no")
	public static final SqlColumn<Integer> lastStartShipmentNo = optionOrderStop.lastStartShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.last_slip_no")
	public static final SqlColumn<String> lastSlipNo = optionOrderStop.lastSlipNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.last_delivery_quantity")
	public static final SqlColumn<Long> lastDeliveryQuantity = optionOrderStop.lastDeliveryQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionOrderStop.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionOrderStop.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionOrderStop.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionOrderStop.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionOrderStop.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionOrderStop.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	public static final class OptionOrderStop extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> itemPartOid = column("item_part_oid", JDBCType.BIGINT);
		public final SqlColumn<String> orderStopId = column("order_stop_id", JDBCType.VARCHAR);
		public final SqlColumn<Integer> orderStopStatus = column("order_stop_status", JDBCType.INTEGER);
		public final SqlColumn<String> startDeliveryDateStringDate = column("start_delivery_date_string_date",
				JDBCType.VARCHAR);
		public final SqlColumn<Integer> startShipmentNo = column("start_shipment_no", JDBCType.INTEGER);
		public final SqlColumn<Long> quantity = column("quantity", JDBCType.BIGINT);
		public final SqlColumn<Long> totalQuantity = column("total_quantity", JDBCType.BIGINT);
		public final SqlColumn<Long> remainderQuantity = column("remainder_quantity", JDBCType.BIGINT);
		public final SqlColumn<Long> fractionQuantity = column("fraction_quantity", JDBCType.BIGINT);
		public final SqlColumn<String> lastStartDeliveryDateStringDate = column("last_start_delivery_date_string_date",
				JDBCType.VARCHAR);
		public final SqlColumn<Integer> lastStartShipmentNo = column("last_start_shipment_no", JDBCType.INTEGER);
		public final SqlColumn<String> lastSlipNo = column("last_slip_no", JDBCType.VARCHAR);
		public final SqlColumn<Long> lastDeliveryQuantity = column("last_delivery_quantity", JDBCType.BIGINT);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionOrderStop() {
			super("public.option_order_stop");
		}
	}
}