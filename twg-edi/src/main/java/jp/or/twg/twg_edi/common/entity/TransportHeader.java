package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TransportHeader {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.transport_data_type")
	private String transportDataType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_sender_id")
	private String aaSenderId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_interchange_date_time")
	private String aaInterchangeDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_bodid")
	private String aaBodid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_receiver_id")
	private String aaReceiverId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_message_direction")
	private String aaMessageDirection;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.sync_code")
	private String syncCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.message_type")
	private String messageType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.message_type_code")
	private String messageTypeCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.message_type_code_name")
	private String messageTypeCodeName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.document_date_time")
	private String documentDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.date_time_period_257")
	private String dateTimePeriod257;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.party_name_st")
	private String partyNameSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.place_name_st")
	private String placeNameSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.party_name_sf")
	private String partyNameSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.place_name_sf")
	private String placeNameSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.memo")
	private String memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.transport_data_type")
	public String getTransportDataType() {
		return transportDataType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.transport_data_type")
	public void setTransportDataType(String transportDataType) {
		this.transportDataType = transportDataType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_sender_id")
	public String getAaSenderId() {
		return aaSenderId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_sender_id")
	public void setAaSenderId(String aaSenderId) {
		this.aaSenderId = aaSenderId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_interchange_date_time")
	public String getAaInterchangeDateTime() {
		return aaInterchangeDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_interchange_date_time")
	public void setAaInterchangeDateTime(String aaInterchangeDateTime) {
		this.aaInterchangeDateTime = aaInterchangeDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_bodid")
	public String getAaBodid() {
		return aaBodid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_bodid")
	public void setAaBodid(String aaBodid) {
		this.aaBodid = aaBodid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_receiver_id")
	public String getAaReceiverId() {
		return aaReceiverId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_receiver_id")
	public void setAaReceiverId(String aaReceiverId) {
		this.aaReceiverId = aaReceiverId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_message_direction")
	public String getAaMessageDirection() {
		return aaMessageDirection;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.aa_message_direction")
	public void setAaMessageDirection(String aaMessageDirection) {
		this.aaMessageDirection = aaMessageDirection;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.sync_code")
	public String getSyncCode() {
		return syncCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.sync_code")
	public void setSyncCode(String syncCode) {
		this.syncCode = syncCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.message_type")
	public String getMessageType() {
		return messageType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.message_type")
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.message_type_code")
	public String getMessageTypeCode() {
		return messageTypeCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.message_type_code")
	public void setMessageTypeCode(String messageTypeCode) {
		this.messageTypeCode = messageTypeCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.message_type_code_name")
	public String getMessageTypeCodeName() {
		return messageTypeCodeName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.message_type_code_name")
	public void setMessageTypeCodeName(String messageTypeCodeName) {
		this.messageTypeCodeName = messageTypeCodeName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.document_date_time")
	public String getDocumentDateTime() {
		return documentDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.document_date_time")
	public void setDocumentDateTime(String documentDateTime) {
		this.documentDateTime = documentDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.date_time_period_257")
	public String getDateTimePeriod257() {
		return dateTimePeriod257;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.date_time_period_257")
	public void setDateTimePeriod257(String dateTimePeriod257) {
		this.dateTimePeriod257 = dateTimePeriod257;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.party_name_st")
	public String getPartyNameSt() {
		return partyNameSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.party_name_st")
	public void setPartyNameSt(String partyNameSt) {
		this.partyNameSt = partyNameSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.place_name_st")
	public String getPlaceNameSt() {
		return placeNameSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source field: public.transport_header.place_name_st")
	public void setPlaceNameSt(String placeNameSt) {
		this.placeNameSt = placeNameSt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.party_name_sf")
	public String getPartyNameSf() {
		return partyNameSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.party_name_sf")
	public void setPartyNameSf(String partyNameSf) {
		this.partyNameSf = partyNameSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.place_name_sf")
	public String getPlaceNameSf() {
		return placeNameSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.place_name_sf")
	public void setPlaceNameSf(String placeNameSf) {
		this.placeNameSf = placeNameSf;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.memo")
	public String getMemo() {
		return memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.memo")
	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}
}