package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class OptionOrderTargetManager {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.place_st_oid")
	private Long placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.item_part_oid")
	private Long itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.order_target_type")
	private Integer orderTargetType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_processing_date")
	private String lastProcessingDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_delivery_date")
	private String lastDeliveryDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_shipment_no")
	private Integer lastShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.place_st_oid")
	public Long getPlaceStOid() {
		return placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.place_st_oid")
	public void setPlaceStOid(Long placeStOid) {
		this.placeStOid = placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.item_part_oid")
	public Long getItemPartOid() {
		return itemPartOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.item_part_oid")
	public void setItemPartOid(Long itemPartOid) {
		this.itemPartOid = itemPartOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.order_target_type")
	public Integer getOrderTargetType() {
		return orderTargetType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.order_target_type")
	public void setOrderTargetType(Integer orderTargetType) {
		this.orderTargetType = orderTargetType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_processing_date")
	public String getLastProcessingDate() {
		return lastProcessingDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_processing_date")
	public void setLastProcessingDate(String lastProcessingDate) {
		this.lastProcessingDate = lastProcessingDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_delivery_date")
	public String getLastDeliveryDate() {
		return lastDeliveryDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_delivery_date")
	public void setLastDeliveryDate(String lastDeliveryDate) {
		this.lastDeliveryDate = lastDeliveryDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_shipment_no")
	public Integer getLastShipmentNo() {
		return lastShipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.last_shipment_no")
	public void setLastShipmentNo(Integer lastShipmentNo) {
		this.lastShipmentNo = lastShipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source field: public.option_order_target_manager.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}
}