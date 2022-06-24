package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TransportProcess {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_data_type")
	private String transportDataType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_by_oid")
	private Long placeByOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_se_oid")
	private Long placeSeOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_ob_oid")
	private Long placeObOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_st_oid")
	private Long placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_sf_oid")
	private Long placeSfOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_by")
	private String partyIdBy;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_by")
	private String placeIdBy;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_se")
	private String partyIdSe;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_se")
	private String placeIdSe;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_ob")
	private String partyIdOb;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_ob")
	private String placeIdOb;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_ob")
	private String partyNameOb;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_ob")
	private String placeNameOb;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_st")
	private String partyIdSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_st")
	private String placeIdSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_st")
	private String partyNameSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_st")
	private String placeNameSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_sf")
	private String partyIdSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_sf")
	private String placeIdSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_sf")
	private String partyNameSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_sf")
	private String placeNameSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_discharge_id")
	private String placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_loading_id")
	private String placeOfLoadingId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_loading_name")
	private String placeOfLoadingName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.contact_name")
	private String contactName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.delivery_date_string_date")
	private String deliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.date_time_period_2_deljit")
	private String dateTimePeriod2Deljit;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_aaj")
	private String docRefIdAaj;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_aau")
	private String docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_a04_desc")
	private String itemA04Desc;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_a04_note")
	private String itemA04Note;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_means_ident_name")
	private String transportMeansIdentName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l01")
	private String itemP04L01;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l02")
	private String itemP04L02;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l03")
	private String itemP04L03;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l04")
	private String itemP04L04;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_p02")
	private String docRefIdP02;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p07")
	private String itemP07;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.zero_receive")
	private String zeroReceive;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_separate_supply_type")
	private String transportSeparateSupplyType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.memo")
	private String memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.message_type_code5")
	private String messageTypeCode5;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_data_type")
	public String getTransportDataType() {
		return transportDataType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_data_type")
	public void setTransportDataType(String transportDataType) {
		this.transportDataType = transportDataType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_by_oid")
	public Long getPlaceByOid() {
		return placeByOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_by_oid")
	public void setPlaceByOid(Long placeByOid) {
		this.placeByOid = placeByOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_se_oid")
	public Long getPlaceSeOid() {
		return placeSeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_se_oid")
	public void setPlaceSeOid(Long placeSeOid) {
		this.placeSeOid = placeSeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_ob_oid")
	public Long getPlaceObOid() {
		return placeObOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_ob_oid")
	public void setPlaceObOid(Long placeObOid) {
		this.placeObOid = placeObOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_st_oid")
	public Long getPlaceStOid() {
		return placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_st_oid")
	public void setPlaceStOid(Long placeStOid) {
		this.placeStOid = placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_sf_oid")
	public Long getPlaceSfOid() {
		return placeSfOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_sf_oid")
	public void setPlaceSfOid(Long placeSfOid) {
		this.placeSfOid = placeSfOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_by")
	public String getPartyIdBy() {
		return partyIdBy;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_by")
	public void setPartyIdBy(String partyIdBy) {
		this.partyIdBy = partyIdBy;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_by")
	public String getPlaceIdBy() {
		return placeIdBy;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_by")
	public void setPlaceIdBy(String placeIdBy) {
		this.placeIdBy = placeIdBy;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_se")
	public String getPartyIdSe() {
		return partyIdSe;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_se")
	public void setPartyIdSe(String partyIdSe) {
		this.partyIdSe = partyIdSe;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_se")
	public String getPlaceIdSe() {
		return placeIdSe;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_se")
	public void setPlaceIdSe(String placeIdSe) {
		this.placeIdSe = placeIdSe;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_ob")
	public String getPartyIdOb() {
		return partyIdOb;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_ob")
	public void setPartyIdOb(String partyIdOb) {
		this.partyIdOb = partyIdOb;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_ob")
	public String getPlaceIdOb() {
		return placeIdOb;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_ob")
	public void setPlaceIdOb(String placeIdOb) {
		this.placeIdOb = placeIdOb;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_ob")
	public String getPartyNameOb() {
		return partyNameOb;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_ob")
	public void setPartyNameOb(String partyNameOb) {
		this.partyNameOb = partyNameOb;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_ob")
	public String getPlaceNameOb() {
		return placeNameOb;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_ob")
	public void setPlaceNameOb(String placeNameOb) {
		this.placeNameOb = placeNameOb;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_st")
	public String getPartyIdSt() {
		return partyIdSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_st")
	public void setPartyIdSt(String partyIdSt) {
		this.partyIdSt = partyIdSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_st")
	public String getPlaceIdSt() {
		return placeIdSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_st")
	public void setPlaceIdSt(String placeIdSt) {
		this.placeIdSt = placeIdSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_st")
	public String getPartyNameSt() {
		return partyNameSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_st")
	public void setPartyNameSt(String partyNameSt) {
		this.partyNameSt = partyNameSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_st")
	public String getPlaceNameSt() {
		return placeNameSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_st")
	public void setPlaceNameSt(String placeNameSt) {
		this.placeNameSt = placeNameSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_sf")
	public String getPartyIdSf() {
		return partyIdSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_sf")
	public void setPartyIdSf(String partyIdSf) {
		this.partyIdSf = partyIdSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_sf")
	public String getPlaceIdSf() {
		return placeIdSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_sf")
	public void setPlaceIdSf(String placeIdSf) {
		this.placeIdSf = placeIdSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_sf")
	public String getPartyNameSf() {
		return partyNameSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_sf")
	public void setPartyNameSf(String partyNameSf) {
		this.partyNameSf = partyNameSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_sf")
	public String getPlaceNameSf() {
		return placeNameSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_sf")
	public void setPlaceNameSf(String placeNameSf) {
		this.placeNameSf = placeNameSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_discharge_id")
	public String getPlaceOfDischargeId() {
		return placeOfDischargeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_discharge_id")
	public void setPlaceOfDischargeId(String placeOfDischargeId) {
		this.placeOfDischargeId = placeOfDischargeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_loading_id")
	public String getPlaceOfLoadingId() {
		return placeOfLoadingId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_loading_id")
	public void setPlaceOfLoadingId(String placeOfLoadingId) {
		this.placeOfLoadingId = placeOfLoadingId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_loading_name")
	public String getPlaceOfLoadingName() {
		return placeOfLoadingName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_loading_name")
	public void setPlaceOfLoadingName(String placeOfLoadingName) {
		this.placeOfLoadingName = placeOfLoadingName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.contact_name")
	public String getContactName() {
		return contactName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.contact_name")
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.delivery_date_string_date")
	public String getDeliveryDateStringDate() {
		return deliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.delivery_date_string_date")
	public void setDeliveryDateStringDate(String deliveryDateStringDate) {
		this.deliveryDateStringDate = deliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.date_time_period_2_deljit")
	public String getDateTimePeriod2Deljit() {
		return dateTimePeriod2Deljit;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.date_time_period_2_deljit")
	public void setDateTimePeriod2Deljit(String dateTimePeriod2Deljit) {
		this.dateTimePeriod2Deljit = dateTimePeriod2Deljit;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_aaj")
	public String getDocRefIdAaj() {
		return docRefIdAaj;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_aaj")
	public void setDocRefIdAaj(String docRefIdAaj) {
		this.docRefIdAaj = docRefIdAaj;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_aau")
	public String getDocRefIdAau() {
		return docRefIdAau;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_aau")
	public void setDocRefIdAau(String docRefIdAau) {
		this.docRefIdAau = docRefIdAau;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_a04_desc")
	public String getItemA04Desc() {
		return itemA04Desc;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_a04_desc")
	public void setItemA04Desc(String itemA04Desc) {
		this.itemA04Desc = itemA04Desc;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_a04_note")
	public String getItemA04Note() {
		return itemA04Note;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_a04_note")
	public void setItemA04Note(String itemA04Note) {
		this.itemA04Note = itemA04Note;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_means_ident_name")
	public String getTransportMeansIdentName() {
		return transportMeansIdentName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_means_ident_name")
	public void setTransportMeansIdentName(String transportMeansIdentName) {
		this.transportMeansIdentName = transportMeansIdentName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l01")
	public String getItemP04L01() {
		return itemP04L01;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l01")
	public void setItemP04L01(String itemP04L01) {
		this.itemP04L01 = itemP04L01;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l02")
	public String getItemP04L02() {
		return itemP04L02;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l02")
	public void setItemP04L02(String itemP04L02) {
		this.itemP04L02 = itemP04L02;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l03")
	public String getItemP04L03() {
		return itemP04L03;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l03")
	public void setItemP04L03(String itemP04L03) {
		this.itemP04L03 = itemP04L03;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l04")
	public String getItemP04L04() {
		return itemP04L04;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l04")
	public void setItemP04L04(String itemP04L04) {
		this.itemP04L04 = itemP04L04;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_p02")
	public String getDocRefIdP02() {
		return docRefIdP02;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_p02")
	public void setDocRefIdP02(String docRefIdP02) {
		this.docRefIdP02 = docRefIdP02;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p07")
	public String getItemP07() {
		return itemP07;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p07")
	public void setItemP07(String itemP07) {
		this.itemP07 = itemP07;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.zero_receive")
	public String getZeroReceive() {
		return zeroReceive;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.zero_receive")
	public void setZeroReceive(String zeroReceive) {
		this.zeroReceive = zeroReceive;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_separate_supply_type")
	public String getTransportSeparateSupplyType() {
		return transportSeparateSupplyType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_separate_supply_type")
	public void setTransportSeparateSupplyType(String transportSeparateSupplyType) {
		this.transportSeparateSupplyType = transportSeparateSupplyType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.memo")
	public String getMemo() {
		return memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.memo")
	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.message_type_code5")
	public String getMessageTypeCode5() {
		return messageTypeCode5;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.message_type_code5")
	public void setMessageTypeCode5(String messageTypeCode5) {
		this.messageTypeCode5 = messageTypeCode5;
	}
}