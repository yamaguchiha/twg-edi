package jp.or.twg.twg_edi.common.entity;

import javax.annotation.Generated;

public class KnbReadDataHeader {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.kanban_read_data_type")
	private String kanbanReadDataType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_sender_id")
	private String aaSenderId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_interchange_date_time")
	private String aaInterchangeDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_bodid")
	private String aaBodid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_receiver_id")
	private String aaReceiverId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_message_id")
	private String aaMessageId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_message_direction")
	private String aaMessageDirection;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.edi_message_sent")
	private String ediMessageSent;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.edi_message_ack_received")
	private String ediMessageAckReceived;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.document_date_time")
	private String documentDateTime;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.kanban_read_data_type")
	public String getKanbanReadDataType() {
		return kanbanReadDataType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.kanban_read_data_type")
	public void setKanbanReadDataType(String kanbanReadDataType) {
		this.kanbanReadDataType = kanbanReadDataType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_sender_id")
	public String getAaSenderId() {
		return aaSenderId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_sender_id")
	public void setAaSenderId(String aaSenderId) {
		this.aaSenderId = aaSenderId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_interchange_date_time")
	public String getAaInterchangeDateTime() {
		return aaInterchangeDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_interchange_date_time")
	public void setAaInterchangeDateTime(String aaInterchangeDateTime) {
		this.aaInterchangeDateTime = aaInterchangeDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_bodid")
	public String getAaBodid() {
		return aaBodid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_bodid")
	public void setAaBodid(String aaBodid) {
		this.aaBodid = aaBodid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_receiver_id")
	public String getAaReceiverId() {
		return aaReceiverId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_receiver_id")
	public void setAaReceiverId(String aaReceiverId) {
		this.aaReceiverId = aaReceiverId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_message_id")
	public String getAaMessageId() {
		return aaMessageId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_message_id")
	public void setAaMessageId(String aaMessageId) {
		this.aaMessageId = aaMessageId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_message_direction")
	public String getAaMessageDirection() {
		return aaMessageDirection;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_message_direction")
	public void setAaMessageDirection(String aaMessageDirection) {
		this.aaMessageDirection = aaMessageDirection;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.edi_message_sent")
	public String getEdiMessageSent() {
		return ediMessageSent;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.edi_message_sent")
	public void setEdiMessageSent(String ediMessageSent) {
		this.ediMessageSent = ediMessageSent;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.edi_message_ack_received")
	public String getEdiMessageAckReceived() {
		return ediMessageAckReceived;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.edi_message_ack_received")
	public void setEdiMessageAckReceived(String ediMessageAckReceived) {
		this.ediMessageAckReceived = ediMessageAckReceived;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.document_date_time")
	public String getDocumentDateTime() {
		return documentDateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.document_date_time")
	public void setDocumentDateTime(String documentDateTime) {
		this.documentDateTime = documentDateTime;
	}
}