package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionReadOrderQuantityManagerDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	public static final OptionReadOrderQuantityManager optionReadOrderQuantityManager = new OptionReadOrderQuantityManager();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.oid")
	public static final SqlColumn<Long> oid = optionReadOrderQuantityManager.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.place_st_oid")
	public static final SqlColumn<Long> placeStOid = optionReadOrderQuantityManager.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.item_part_oid")
	public static final SqlColumn<Long> itemPartOid = optionReadOrderQuantityManager.itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.order_quantity")
	public static final SqlColumn<Integer> orderQuantity = optionReadOrderQuantityManager.orderQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.read_quantity")
	public static final SqlColumn<Integer> readQuantity = optionReadOrderQuantityManager.readQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionReadOrderQuantityManager.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionReadOrderQuantityManager.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionReadOrderQuantityManager.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionReadOrderQuantityManager.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionReadOrderQuantityManager.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source field: public.option_read_order_quantity_manager.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionReadOrderQuantityManager.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	public static final class OptionReadOrderQuantityManager extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> itemPartOid = column("item_part_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> orderQuantity = column("order_quantity", JDBCType.INTEGER);
		public final SqlColumn<Integer> readQuantity = column("read_quantity", JDBCType.INTEGER);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionReadOrderQuantityManager() {
			super("public.option_read_order_quantity_manager");
		}
	}
}