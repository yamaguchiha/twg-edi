package jp.or.twg.twg_edi.common.entity;

import javax.annotation.Generated;

public class Shipment {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.own_place_oid")
	private Long ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.place_sf_oid")
	private Long placeSfOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.place_st_oid")
	private Long placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.shipment_no")
	private Integer shipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.shipment_time")
	private String shipmentTime;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.own_place_oid")
	public Long getOwnPlaceOid() {
		return ownPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.own_place_oid")
	public void setOwnPlaceOid(Long ownPlaceOid) {
		this.ownPlaceOid = ownPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.place_sf_oid")
	public Long getPlaceSfOid() {
		return placeSfOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.place_sf_oid")
	public void setPlaceSfOid(Long placeSfOid) {
		this.placeSfOid = placeSfOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.place_st_oid")
	public Long getPlaceStOid() {
		return placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.place_st_oid")
	public void setPlaceStOid(Long placeStOid) {
		this.placeStOid = placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.shipment_no")
	public Integer getShipmentNo() {
		return shipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.shipment_no")
	public void setShipmentNo(Integer shipmentNo) {
		this.shipmentNo = shipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.shipment_time")
	public String getShipmentTime() {
		return shipmentTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.shipment.shipment_time")
	public void setShipmentTime(String shipmentTime) {
		this.shipmentTime = shipmentTime;
	}
}