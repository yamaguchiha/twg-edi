package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ShipmentDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	public static final Shipment shipment = new Shipment();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.oid")
	public static final SqlColumn<Long> oid = shipment.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = shipment.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.place_sf_oid")
	public static final SqlColumn<Long> placeSfOid = shipment.placeSfOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.place_st_oid")
	public static final SqlColumn<Long> placeStOid = shipment.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.shipment_no")
	public static final SqlColumn<Integer> shipmentNo = shipment.shipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.shipment_time")
	public static final SqlColumn<String> shipmentTime = shipment.shipmentTime;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	public static final class Shipment extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeSfOid = column("place_sf_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> shipmentNo = column("shipment_no", JDBCType.INTEGER);
		public final SqlColumn<String> shipmentTime = column("shipment_time", JDBCType.VARCHAR);

		public Shipment() {
			super("public.shipment");
		}
	}
}