package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class KnbReadDataHeaderDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	public static final KnbReadDataHeader knbReadDataHeader = new KnbReadDataHeader();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.oid")
	public static final SqlColumn<Long> oid = knbReadDataHeader.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.kanban_read_data_type")
	public static final SqlColumn<String> kanbanReadDataType = knbReadDataHeader.kanbanReadDataType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_sender_id")
	public static final SqlColumn<String> aaSenderId = knbReadDataHeader.aaSenderId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_interchange_date_time")
	public static final SqlColumn<String> aaInterchangeDateTime = knbReadDataHeader.aaInterchangeDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_bodid")
	public static final SqlColumn<String> aaBodid = knbReadDataHeader.aaBodid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_receiver_id")
	public static final SqlColumn<String> aaReceiverId = knbReadDataHeader.aaReceiverId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_message_id")
	public static final SqlColumn<String> aaMessageId = knbReadDataHeader.aaMessageId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.aa_message_direction")
	public static final SqlColumn<String> aaMessageDirection = knbReadDataHeader.aaMessageDirection;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.edi_message_sent")
	public static final SqlColumn<String> ediMessageSent = knbReadDataHeader.ediMessageSent;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.edi_message_ack_received")
	public static final SqlColumn<String> ediMessageAckReceived = knbReadDataHeader.ediMessageAckReceived;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.knb_read_data_header.document_date_time")
	public static final SqlColumn<String> documentDateTime = knbReadDataHeader.documentDateTime;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	public static final class KnbReadDataHeader extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> kanbanReadDataType = column("kanban_read_data_type", JDBCType.VARCHAR);
		public final SqlColumn<String> aaSenderId = column("aa_sender_id", JDBCType.VARCHAR);
		public final SqlColumn<String> aaInterchangeDateTime = column("aa_interchange_date_time", JDBCType.VARCHAR);
		public final SqlColumn<String> aaBodid = column("aa_bodid", JDBCType.VARCHAR);
		public final SqlColumn<String> aaReceiverId = column("aa_receiver_id", JDBCType.VARCHAR);
		public final SqlColumn<String> aaMessageId = column("aa_message_id", JDBCType.VARCHAR);
		public final SqlColumn<String> aaMessageDirection = column("aa_message_direction", JDBCType.VARCHAR);
		public final SqlColumn<String> ediMessageSent = column("edi_message_sent", JDBCType.CHAR);
		public final SqlColumn<String> ediMessageAckReceived = column("edi_message_ack_received", JDBCType.CHAR);
		public final SqlColumn<String> documentDateTime = column("document_date_time", JDBCType.VARCHAR);

		public KnbReadDataHeader() {
			super("public.knb_read_data_header");
		}
	}
}