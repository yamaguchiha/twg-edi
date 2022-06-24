package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TransportProcessDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source Table: public.transport_process")
	public static final TransportProcess transportProcess = new TransportProcess();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.oid")
	public static final SqlColumn<Long> oid = transportProcess.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_data_type")
	public static final SqlColumn<String> transportDataType = transportProcess.transportDataType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_by_oid")
	public static final SqlColumn<Long> placeByOid = transportProcess.placeByOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_se_oid")
	public static final SqlColumn<Long> placeSeOid = transportProcess.placeSeOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_ob_oid")
	public static final SqlColumn<Long> placeObOid = transportProcess.placeObOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_st_oid")
	public static final SqlColumn<Long> placeStOid = transportProcess.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_sf_oid")
	public static final SqlColumn<Long> placeSfOid = transportProcess.placeSfOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_by")
	public static final SqlColumn<String> partyIdBy = transportProcess.partyIdBy;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_by")
	public static final SqlColumn<String> placeIdBy = transportProcess.placeIdBy;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_se")
	public static final SqlColumn<String> partyIdSe = transportProcess.partyIdSe;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_se")
	public static final SqlColumn<String> placeIdSe = transportProcess.placeIdSe;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_ob")
	public static final SqlColumn<String> partyIdOb = transportProcess.partyIdOb;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_ob")
	public static final SqlColumn<String> placeIdOb = transportProcess.placeIdOb;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_ob")
	public static final SqlColumn<String> partyNameOb = transportProcess.partyNameOb;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_ob")
	public static final SqlColumn<String> placeNameOb = transportProcess.placeNameOb;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_st")
	public static final SqlColumn<String> partyIdSt = transportProcess.partyIdSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_st")
	public static final SqlColumn<String> placeIdSt = transportProcess.placeIdSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_st")
	public static final SqlColumn<String> partyNameSt = transportProcess.partyNameSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_st")
	public static final SqlColumn<String> placeNameSt = transportProcess.placeNameSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_id_sf")
	public static final SqlColumn<String> partyIdSf = transportProcess.partyIdSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_id_sf")
	public static final SqlColumn<String> placeIdSf = transportProcess.placeIdSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.party_name_sf")
	public static final SqlColumn<String> partyNameSf = transportProcess.partyNameSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_name_sf")
	public static final SqlColumn<String> placeNameSf = transportProcess.placeNameSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_discharge_id")
	public static final SqlColumn<String> placeOfDischargeId = transportProcess.placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_loading_id")
	public static final SqlColumn<String> placeOfLoadingId = transportProcess.placeOfLoadingId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.place_of_loading_name")
	public static final SqlColumn<String> placeOfLoadingName = transportProcess.placeOfLoadingName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.contact_name")
	public static final SqlColumn<String> contactName = transportProcess.contactName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.delivery_date_string_date")
	public static final SqlColumn<String> deliveryDateStringDate = transportProcess.deliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.date_time_period_2_deljit")
	public static final SqlColumn<String> dateTimePeriod2Deljit = transportProcess.dateTimePeriod2Deljit;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_aaj")
	public static final SqlColumn<String> docRefIdAaj = transportProcess.docRefIdAaj;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_aau")
	public static final SqlColumn<String> docRefIdAau = transportProcess.docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_a04_desc")
	public static final SqlColumn<String> itemA04Desc = transportProcess.itemA04Desc;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_a04_note")
	public static final SqlColumn<String> itemA04Note = transportProcess.itemA04Note;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_means_ident_name")
	public static final SqlColumn<String> transportMeansIdentName = transportProcess.transportMeansIdentName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l01")
	public static final SqlColumn<String> itemP04L01 = transportProcess.itemP04L01;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l02")
	public static final SqlColumn<String> itemP04L02 = transportProcess.itemP04L02;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l03")
	public static final SqlColumn<String> itemP04L03 = transportProcess.itemP04L03;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p04_l04")
	public static final SqlColumn<String> itemP04L04 = transportProcess.itemP04L04;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.doc_ref_id_p02")
	public static final SqlColumn<String> docRefIdP02 = transportProcess.docRefIdP02;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.item_p07")
	public static final SqlColumn<String> itemP07 = transportProcess.itemP07;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.zero_receive")
	public static final SqlColumn<String> zeroReceive = transportProcess.zeroReceive;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.transport_separate_supply_type")
	public static final SqlColumn<String> transportSeparateSupplyType = transportProcess.transportSeparateSupplyType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.memo")
	public static final SqlColumn<String> memo = transportProcess.memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = transportProcess.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = transportProcess.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = transportProcess.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = transportProcess.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = transportProcess.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = transportProcess.tsLastModifiedUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source field: public.transport_process.message_type_code5")
	public static final SqlColumn<String> messageTypeCode5 = transportProcess.messageTypeCode5;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source Table: public.transport_process")
	public static final class TransportProcess extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> transportDataType = column("transport_data_type", JDBCType.VARCHAR);
		public final SqlColumn<Long> placeByOid = column("place_by_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeSeOid = column("place_se_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeObOid = column("place_ob_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeSfOid = column("place_sf_oid", JDBCType.BIGINT);
		public final SqlColumn<String> partyIdBy = column("party_id_by", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdBy = column("place_id_by", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdSe = column("party_id_se", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdSe = column("place_id_se", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdOb = column("party_id_ob", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdOb = column("place_id_ob", JDBCType.VARCHAR);
		public final SqlColumn<String> partyNameOb = column("party_name_ob", JDBCType.VARCHAR);
		public final SqlColumn<String> placeNameOb = column("place_name_ob", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdSt = column("party_id_st", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdSt = column("place_id_st", JDBCType.VARCHAR);
		public final SqlColumn<String> partyNameSt = column("party_name_st", JDBCType.VARCHAR);
		public final SqlColumn<String> placeNameSt = column("place_name_st", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdSf = column("party_id_sf", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdSf = column("place_id_sf", JDBCType.VARCHAR);
		public final SqlColumn<String> partyNameSf = column("party_name_sf", JDBCType.VARCHAR);
		public final SqlColumn<String> placeNameSf = column("place_name_sf", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfDischargeId = column("place_of_discharge_id", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfLoadingId = column("place_of_loading_id", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfLoadingName = column("place_of_loading_name", JDBCType.VARCHAR);
		public final SqlColumn<String> contactName = column("contact_name", JDBCType.VARCHAR);
		public final SqlColumn<String> deliveryDateStringDate = column("delivery_date_string_date", JDBCType.VARCHAR);
		public final SqlColumn<String> dateTimePeriod2Deljit = column("date_time_period_2_deljit", JDBCType.VARCHAR);
		public final SqlColumn<String> docRefIdAaj = column("doc_ref_id_aaj", JDBCType.VARCHAR);
		public final SqlColumn<String> docRefIdAau = column("doc_ref_id_aau", JDBCType.VARCHAR);
		public final SqlColumn<String> itemA04Desc = column("item_a04_desc", JDBCType.VARCHAR);
		public final SqlColumn<String> itemA04Note = column("item_a04_note", JDBCType.VARCHAR);
		public final SqlColumn<String> transportMeansIdentName = column("transport_means_ident_name", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP04L01 = column("item_p04_l01", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP04L02 = column("item_p04_l02", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP04L03 = column("item_p04_l03", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP04L04 = column("item_p04_l04", JDBCType.VARCHAR);
		public final SqlColumn<String> docRefIdP02 = column("doc_ref_id_p02", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP07 = column("item_p07", JDBCType.VARCHAR);
		public final SqlColumn<String> zeroReceive = column("zero_receive", JDBCType.CHAR);
		public final SqlColumn<String> transportSeparateSupplyType = column("transport_separate_supply_type",
				JDBCType.VARCHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);
		public final SqlColumn<String> messageTypeCode5 = column("message_type_code5", JDBCType.CHAR);

		public TransportProcess() {
			super("public.transport_process");
		}
	}
}