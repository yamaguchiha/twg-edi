package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class OptionOrderStop {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.item_part_oid")
	private Long itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.order_stop_id")
	private String orderStopId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.order_stop_status")
	private Integer orderStopStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.start_delivery_date_string_date")
	private String startDeliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.start_shipment_no")
	private Integer startShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.quantity")
	private Long quantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.total_quantity")
	private Long totalQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.remainder_quantity")
	private Long remainderQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.fraction_quantity")
	private Long fractionQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_start_delivery_date_string_date")
	private String lastStartDeliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_start_shipment_no")
	private Integer lastStartShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_slip_no")
	private String lastSlipNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_delivery_quantity")
	private Long lastDeliveryQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.item_part_oid")
	public Long getItemPartOid() {
		return itemPartOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.item_part_oid")
	public void setItemPartOid(Long itemPartOid) {
		this.itemPartOid = itemPartOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.order_stop_id")
	public String getOrderStopId() {
		return orderStopId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.order_stop_id")
	public void setOrderStopId(String orderStopId) {
		this.orderStopId = orderStopId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.order_stop_status")
	public Integer getOrderStopStatus() {
		return orderStopStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.order_stop_status")
	public void setOrderStopStatus(Integer orderStopStatus) {
		this.orderStopStatus = orderStopStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.start_delivery_date_string_date")
	public String getStartDeliveryDateStringDate() {
		return startDeliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.start_delivery_date_string_date")
	public void setStartDeliveryDateStringDate(String startDeliveryDateStringDate) {
		this.startDeliveryDateStringDate = startDeliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.start_shipment_no")
	public Integer getStartShipmentNo() {
		return startShipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.start_shipment_no")
	public void setStartShipmentNo(Integer startShipmentNo) {
		this.startShipmentNo = startShipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.quantity")
	public Long getQuantity() {
		return quantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.quantity")
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.total_quantity")
	public Long getTotalQuantity() {
		return totalQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.total_quantity")
	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.remainder_quantity")
	public Long getRemainderQuantity() {
		return remainderQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.remainder_quantity")
	public void setRemainderQuantity(Long remainderQuantity) {
		this.remainderQuantity = remainderQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.fraction_quantity")
	public Long getFractionQuantity() {
		return fractionQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.fraction_quantity")
	public void setFractionQuantity(Long fractionQuantity) {
		this.fractionQuantity = fractionQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_start_delivery_date_string_date")
	public String getLastStartDeliveryDateStringDate() {
		return lastStartDeliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_start_delivery_date_string_date")
	public void setLastStartDeliveryDateStringDate(String lastStartDeliveryDateStringDate) {
		this.lastStartDeliveryDateStringDate = lastStartDeliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_start_shipment_no")
	public Integer getLastStartShipmentNo() {
		return lastStartShipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_start_shipment_no")
	public void setLastStartShipmentNo(Integer lastStartShipmentNo) {
		this.lastStartShipmentNo = lastStartShipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_slip_no")
	public String getLastSlipNo() {
		return lastSlipNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_slip_no")
	public void setLastSlipNo(String lastSlipNo) {
		this.lastSlipNo = lastSlipNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_delivery_quantity")
	public Long getLastDeliveryQuantity() {
		return lastDeliveryQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.last_delivery_quantity")
	public void setLastDeliveryQuantity(Long lastDeliveryQuantity) {
		this.lastDeliveryQuantity = lastDeliveryQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source field: public.option_order_stop.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}
}