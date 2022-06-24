package jp.or.twg.twg_edi.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class OptionKanbanAdjust {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.item_part_oid")
	private Long itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.plan_date_string_date")
	private String planDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.start_delivery_date_string_date")
	private String startDeliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.start_shipment_no")
	private Integer startShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.adjust_status")
	private Integer adjustStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.adjust_type")
	private Integer adjustType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.quantity")
	private Long quantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.par_quantity")
	private BigDecimal parQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.total_quantity")
	private Long totalQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.carry_forward_fraction_quantity")
	private BigDecimal carryForwardFractionQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.item_part_oid")
	public Long getItemPartOid() {
		return itemPartOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.item_part_oid")
	public void setItemPartOid(Long itemPartOid) {
		this.itemPartOid = itemPartOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.plan_date_string_date")
	public String getPlanDateStringDate() {
		return planDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.plan_date_string_date")
	public void setPlanDateStringDate(String planDateStringDate) {
		this.planDateStringDate = planDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.start_delivery_date_string_date")
	public String getStartDeliveryDateStringDate() {
		return startDeliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.start_delivery_date_string_date")
	public void setStartDeliveryDateStringDate(String startDeliveryDateStringDate) {
		this.startDeliveryDateStringDate = startDeliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.start_shipment_no")
	public Integer getStartShipmentNo() {
		return startShipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.start_shipment_no")
	public void setStartShipmentNo(Integer startShipmentNo) {
		this.startShipmentNo = startShipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.adjust_status")
	public Integer getAdjustStatus() {
		return adjustStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.adjust_status")
	public void setAdjustStatus(Integer adjustStatus) {
		this.adjustStatus = adjustStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.adjust_type")
	public Integer getAdjustType() {
		return adjustType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.adjust_type")
	public void setAdjustType(Integer adjustType) {
		this.adjustType = adjustType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.quantity")
	public Long getQuantity() {
		return quantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.quantity")
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.par_quantity")
	public BigDecimal getParQuantity() {
		return parQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.par_quantity")
	public void setParQuantity(BigDecimal parQuantity) {
		this.parQuantity = parQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.total_quantity")
	public Long getTotalQuantity() {
		return totalQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.total_quantity")
	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.carry_forward_fraction_quantity")
	public BigDecimal getCarryForwardFractionQuantity() {
		return carryForwardFractionQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.carry_forward_fraction_quantity")
	public void setCarryForwardFractionQuantity(BigDecimal carryForwardFractionQuantity) {
		this.carryForwardFractionQuantity = carryForwardFractionQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source field: public.option_kanban_adjust.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}
}