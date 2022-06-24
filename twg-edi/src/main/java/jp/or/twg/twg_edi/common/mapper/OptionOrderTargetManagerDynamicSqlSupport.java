package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionOrderTargetManagerDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	public static final OptionOrderTargetManager optionOrderTargetManager = new OptionOrderTargetManager();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.oid")
	public static final SqlColumn<Long> oid = optionOrderTargetManager.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.place_st_oid")
	public static final SqlColumn<Long> placeStOid = optionOrderTargetManager.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.item_part_oid")
	public static final SqlColumn<Long> itemPartOid = optionOrderTargetManager.itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.order_target_type")
	public static final SqlColumn<Integer> orderTargetType = optionOrderTargetManager.orderTargetType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_processing_date")
	public static final SqlColumn<String> lastProcessingDate = optionOrderTargetManager.lastProcessingDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_delivery_date")
	public static final SqlColumn<String> lastDeliveryDate = optionOrderTargetManager.lastDeliveryDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_shipment_no")
	public static final SqlColumn<Integer> lastShipmentNo = optionOrderTargetManager.lastShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionOrderTargetManager.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionOrderTargetManager.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionOrderTargetManager.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionOrderTargetManager.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionOrderTargetManager.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionOrderTargetManager.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	public static final class OptionOrderTargetManager extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> itemPartOid = column("item_part_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> orderTargetType = column("order_target_type", JDBCType.INTEGER);
		public final SqlColumn<String> lastProcessingDate = column("last_processing_date", JDBCType.VARCHAR);
		public final SqlColumn<String> lastDeliveryDate = column("last_delivery_date", JDBCType.VARCHAR);
		public final SqlColumn<Integer> lastShipmentNo = column("last_shipment_no", JDBCType.INTEGER);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionOrderTargetManager() {
			super("public.option_order_target_manager");
		}
	}
}