package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class OptionKanbanDeliveryHistory {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.place_st_oid")
	private Long placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.item_part_oid")
	private Long itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_date_string_date")
	private String deliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.shipment_no")
	private Integer shipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_processing_date_string_date")
	private String deliveryProcessingDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.processing_date_time")
	private Date processingDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.processing_shipment_no")
	private Integer processingShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.item_a04_desc")
	private String itemA04Desc;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.doc_ref_id_aau")
	private String docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_box")
	private Integer deliveryBox;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_quantity")
	private Integer deliveryQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.roll_quantity")
	private Integer rollQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.read_quantity")
	private Integer readQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.adjust_quantity")
	private Integer adjustQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.order_stop_quantity")
	private Integer orderStopQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.place_st_oid")
	public Long getPlaceStOid() {
		return placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.place_st_oid")
	public void setPlaceStOid(Long placeStOid) {
		this.placeStOid = placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.item_part_oid")
	public Long getItemPartOid() {
		return itemPartOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.item_part_oid")
	public void setItemPartOid(Long itemPartOid) {
		this.itemPartOid = itemPartOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_date_string_date")
	public String getDeliveryDateStringDate() {
		return deliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_date_string_date")
	public void setDeliveryDateStringDate(String deliveryDateStringDate) {
		this.deliveryDateStringDate = deliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.shipment_no")
	public Integer getShipmentNo() {
		return shipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.shipment_no")
	public void setShipmentNo(Integer shipmentNo) {
		this.shipmentNo = shipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_processing_date_string_date")
	public String getDeliveryProcessingDateStringDate() {
		return deliveryProcessingDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_processing_date_string_date")
	public void setDeliveryProcessingDateStringDate(String deliveryProcessingDateStringDate) {
		this.deliveryProcessingDateStringDate = deliveryProcessingDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.processing_date_time")
	public Date getProcessingDateTime() {
		return processingDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.processing_date_time")
	public void setProcessingDateTime(Date processingDateTime) {
		this.processingDateTime = processingDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.processing_shipment_no")
	public Integer getProcessingShipmentNo() {
		return processingShipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.processing_shipment_no")
	public void setProcessingShipmentNo(Integer processingShipmentNo) {
		this.processingShipmentNo = processingShipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.item_a04_desc")
	public String getItemA04Desc() {
		return itemA04Desc;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.item_a04_desc")
	public void setItemA04Desc(String itemA04Desc) {
		this.itemA04Desc = itemA04Desc;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.doc_ref_id_aau")
	public String getDocRefIdAau() {
		return docRefIdAau;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.doc_ref_id_aau")
	public void setDocRefIdAau(String docRefIdAau) {
		this.docRefIdAau = docRefIdAau;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_box")
	public Integer getDeliveryBox() {
		return deliveryBox;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_box")
	public void setDeliveryBox(Integer deliveryBox) {
		this.deliveryBox = deliveryBox;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_quantity")
	public Integer getDeliveryQuantity() {
		return deliveryQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_quantity")
	public void setDeliveryQuantity(Integer deliveryQuantity) {
		this.deliveryQuantity = deliveryQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.roll_quantity")
	public Integer getRollQuantity() {
		return rollQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.roll_quantity")
	public void setRollQuantity(Integer rollQuantity) {
		this.rollQuantity = rollQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.read_quantity")
	public Integer getReadQuantity() {
		return readQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.read_quantity")
	public void setReadQuantity(Integer readQuantity) {
		this.readQuantity = readQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.adjust_quantity")
	public Integer getAdjustQuantity() {
		return adjustQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.adjust_quantity")
	public void setAdjustQuantity(Integer adjustQuantity) {
		this.adjustQuantity = adjustQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.order_stop_quantity")
	public Integer getOrderStopQuantity() {
		return orderStopQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.order_stop_quantity")
	public void setOrderStopQuantity(Integer orderStopQuantity) {
		this.orderStopQuantity = orderStopQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}
}