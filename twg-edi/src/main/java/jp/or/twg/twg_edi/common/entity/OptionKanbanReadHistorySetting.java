package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class OptionKanbanReadHistorySetting {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.kanban_read_history_oid")
	private Long kanbanReadHistoryOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.delivery_date_string_date")
	private String deliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.shipment_no")
	private Integer shipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.doc_ref_id_aau")
	private String docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.party_id_st")
	private String partyIdSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_id_st")
	private String placeIdSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_of_discharge_id")
	private String placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.party_id_sf")
	private String partyIdSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_id_sf")
	private String placeIdSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.item_id_pd")
	private String itemIdPd;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.item_e18")
	private String itemE18;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.branch_no")
	private Long branchNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.read_status")
	private Integer readStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.read_date_time")
	private Date readDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.kanban_read_history_oid")
	public Long getKanbanReadHistoryOid() {
		return kanbanReadHistoryOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.kanban_read_history_oid")
	public void setKanbanReadHistoryOid(Long kanbanReadHistoryOid) {
		this.kanbanReadHistoryOid = kanbanReadHistoryOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.delivery_date_string_date")
	public String getDeliveryDateStringDate() {
		return deliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.delivery_date_string_date")
	public void setDeliveryDateStringDate(String deliveryDateStringDate) {
		this.deliveryDateStringDate = deliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.shipment_no")
	public Integer getShipmentNo() {
		return shipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.shipment_no")
	public void setShipmentNo(Integer shipmentNo) {
		this.shipmentNo = shipmentNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.doc_ref_id_aau")
	public String getDocRefIdAau() {
		return docRefIdAau;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.doc_ref_id_aau")
	public void setDocRefIdAau(String docRefIdAau) {
		this.docRefIdAau = docRefIdAau;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.party_id_st")
	public String getPartyIdSt() {
		return partyIdSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.party_id_st")
	public void setPartyIdSt(String partyIdSt) {
		this.partyIdSt = partyIdSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_id_st")
	public String getPlaceIdSt() {
		return placeIdSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_id_st")
	public void setPlaceIdSt(String placeIdSt) {
		this.placeIdSt = placeIdSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_of_discharge_id")
	public String getPlaceOfDischargeId() {
		return placeOfDischargeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_of_discharge_id")
	public void setPlaceOfDischargeId(String placeOfDischargeId) {
		this.placeOfDischargeId = placeOfDischargeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.party_id_sf")
	public String getPartyIdSf() {
		return partyIdSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.party_id_sf")
	public void setPartyIdSf(String partyIdSf) {
		this.partyIdSf = partyIdSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_id_sf")
	public String getPlaceIdSf() {
		return placeIdSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.place_id_sf")
	public void setPlaceIdSf(String placeIdSf) {
		this.placeIdSf = placeIdSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.item_id_pd")
	public String getItemIdPd() {
		return itemIdPd;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.item_id_pd")
	public void setItemIdPd(String itemIdPd) {
		this.itemIdPd = itemIdPd;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source field: public.option_kanban_read_history_setting.item_e18")
	public String getItemE18() {
		return itemE18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.item_e18")
	public void setItemE18(String itemE18) {
		this.itemE18 = itemE18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.branch_no")
	public Long getBranchNo() {
		return branchNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.branch_no")
	public void setBranchNo(Long branchNo) {
		this.branchNo = branchNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.read_status")
	public Integer getReadStatus() {
		return readStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.read_status")
	public void setReadStatus(Integer readStatus) {
		this.readStatus = readStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.read_date_time")
	public Date getReadDateTime() {
		return readDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.read_date_time")
	public void setReadDateTime(Date readDateTime) {
		this.readDateTime = readDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source field: public.option_kanban_read_history_setting.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}
}