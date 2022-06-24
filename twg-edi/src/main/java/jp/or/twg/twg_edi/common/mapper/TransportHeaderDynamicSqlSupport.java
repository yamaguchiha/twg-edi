package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TransportHeaderDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	public static final TransportHeader transportHeader = new TransportHeader();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.oid")
	public static final SqlColumn<Long> oid = transportHeader.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.transport_data_type")
	public static final SqlColumn<String> transportDataType = transportHeader.transportDataType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.aa_sender_id")
	public static final SqlColumn<String> aaSenderId = transportHeader.aaSenderId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.aa_interchange_date_time")
	public static final SqlColumn<String> aaInterchangeDateTime = transportHeader.aaInterchangeDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.aa_bodid")
	public static final SqlColumn<String> aaBodid = transportHeader.aaBodid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.aa_receiver_id")
	public static final SqlColumn<String> aaReceiverId = transportHeader.aaReceiverId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.aa_message_direction")
	public static final SqlColumn<String> aaMessageDirection = transportHeader.aaMessageDirection;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.sync_code")
	public static final SqlColumn<String> syncCode = transportHeader.syncCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.message_type")
	public static final SqlColumn<String> messageType = transportHeader.messageType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.message_type_code")
	public static final SqlColumn<String> messageTypeCode = transportHeader.messageTypeCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.message_type_code_name")
	public static final SqlColumn<String> messageTypeCodeName = transportHeader.messageTypeCodeName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.document_date_time")
	public static final SqlColumn<String> documentDateTime = transportHeader.documentDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.date_time_period_257")
	public static final SqlColumn<String> dateTimePeriod257 = transportHeader.dateTimePeriod257;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.party_name_st")
	public static final SqlColumn<String> partyNameSt = transportHeader.partyNameSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.place_name_st")
	public static final SqlColumn<String> placeNameSt = transportHeader.placeNameSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.party_name_sf")
	public static final SqlColumn<String> partyNameSf = transportHeader.partyNameSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.place_name_sf")
	public static final SqlColumn<String> placeNameSf = transportHeader.placeNameSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.memo")
	public static final SqlColumn<String> memo = transportHeader.memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = transportHeader.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = transportHeader.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = transportHeader.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = transportHeader.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = transportHeader.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.transport_header.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = transportHeader.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	public static final class TransportHeader extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> transportDataType = column("transport_data_type", JDBCType.VARCHAR);
		public final SqlColumn<String> aaSenderId = column("aa_sender_id", JDBCType.VARCHAR);
		public final SqlColumn<String> aaInterchangeDateTime = column("aa_interchange_date_time", JDBCType.VARCHAR);
		public final SqlColumn<String> aaBodid = column("aa_bodid", JDBCType.VARCHAR);
		public final SqlColumn<String> aaReceiverId = column("aa_receiver_id", JDBCType.VARCHAR);
		public final SqlColumn<String> aaMessageDirection = column("aa_message_direction", JDBCType.VARCHAR);
		public final SqlColumn<String> syncCode = column("sync_code", JDBCType.VARCHAR);
		public final SqlColumn<String> messageType = column("message_type", JDBCType.VARCHAR);
		public final SqlColumn<String> messageTypeCode = column("message_type_code", JDBCType.VARCHAR);
		public final SqlColumn<String> messageTypeCodeName = column("message_type_code_name", JDBCType.VARCHAR);
		public final SqlColumn<String> documentDateTime = column("document_date_time", JDBCType.VARCHAR);
		public final SqlColumn<String> dateTimePeriod257 = column("date_time_period_257", JDBCType.VARCHAR);
		public final SqlColumn<String> partyNameSt = column("party_name_st", JDBCType.VARCHAR);
		public final SqlColumn<String> placeNameSt = column("place_name_st", JDBCType.VARCHAR);
		public final SqlColumn<String> partyNameSf = column("party_name_sf", JDBCType.VARCHAR);
		public final SqlColumn<String> placeNameSf = column("place_name_sf", JDBCType.VARCHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public TransportHeader() {
			super("public.transport_header");
		}
	}
}