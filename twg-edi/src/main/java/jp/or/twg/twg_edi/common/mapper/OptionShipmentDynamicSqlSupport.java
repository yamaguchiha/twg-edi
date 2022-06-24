package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionShipmentDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_shipment")
	public static final OptionShipment optionShipment = new OptionShipment();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source field: public.option_shipment.oid")
	public static final SqlColumn<Long> oid = optionShipment.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source field: public.option_shipment.place_st_oid")
	public static final SqlColumn<Long> placeStOid = optionShipment.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source field: public.option_shipment.table_no")
	public static final SqlColumn<Integer> tableNo = optionShipment.tableNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source field: public.option_shipment.memo")
	public static final SqlColumn<String> memo = optionShipment.memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source field: public.option_shipment.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionShipment.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.option_shipment.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionShipment.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.option_shipment.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionShipment.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.option_shipment.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionShipment.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.option_shipment.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionShipment.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.option_shipment.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionShipment.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_shipment")
	public static final class OptionShipment extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> tableNo = column("table_no", JDBCType.INTEGER);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionShipment() {
			super("public.option_shipment");
		}
	}
}