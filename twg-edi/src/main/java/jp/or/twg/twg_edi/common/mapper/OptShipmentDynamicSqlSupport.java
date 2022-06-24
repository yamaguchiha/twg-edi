package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptShipmentDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	public static final OptShipment optShipment = new OptShipment();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.opt_shipment.oid")
	public static final SqlColumn<Long> oid = optShipment.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.opt_shipment.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = optShipment.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.opt_shipment.place_sf_oid")
	public static final SqlColumn<Long> placeSfOid = optShipment.placeSfOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.opt_shipment.opt_place_st_oid")
	public static final SqlColumn<Long> optPlaceStOid = optShipment.optPlaceStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.opt_shipment.shipment_no")
	public static final SqlColumn<Integer> shipmentNo = optShipment.shipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.opt_shipment.shipment_time")
	public static final SqlColumn<String> shipmentTime = optShipment.shipmentTime;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	public static final class OptShipment extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeSfOid = column("place_sf_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> optPlaceStOid = column("opt_place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> shipmentNo = column("shipment_no", JDBCType.INTEGER);
		public final SqlColumn<String> shipmentTime = column("shipment_time", JDBCType.VARCHAR);

		public OptShipment() {
			super("public.opt_shipment");
		}
	}
}