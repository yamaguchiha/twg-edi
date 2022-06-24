package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class KnbReadDataTransactionDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.knb_read_data_transaction")
	public static final KnbReadDataTransaction knbReadDataTransaction = new KnbReadDataTransaction();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.oid")
	public static final SqlColumn<Long> oid = knbReadDataTransaction.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.kanban_read_data_type")
	public static final SqlColumn<String> kanbanReadDataType = knbReadDataTransaction.kanbanReadDataType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.header_oid")
	public static final SqlColumn<Long> headerOid = knbReadDataTransaction.headerOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.party_id_sender")
	public static final SqlColumn<String> partyIdSender = knbReadDataTransaction.partyIdSender;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.place_id_sender")
	public static final SqlColumn<String> placeIdSender = knbReadDataTransaction.placeIdSender;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.party_id_receiver")
	public static final SqlColumn<String> partyIdReceiver = knbReadDataTransaction.partyIdReceiver;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.place_id_receiver")
	public static final SqlColumn<String> placeIdReceiver = knbReadDataTransaction.placeIdReceiver;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.party_id_ob")
	public static final SqlColumn<String> partyIdOb = knbReadDataTransaction.partyIdOb;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.place_id_ob")
	public static final SqlColumn<String> placeIdOb = knbReadDataTransaction.placeIdOb;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.party_id_st")
	public static final SqlColumn<String> partyIdSt = knbReadDataTransaction.partyIdSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.place_id_st")
	public static final SqlColumn<String> placeIdSt = knbReadDataTransaction.placeIdSt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.party_id_sf")
	public static final SqlColumn<String> partyIdSf = knbReadDataTransaction.partyIdSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.place_id_sf")
	public static final SqlColumn<String> placeIdSf = knbReadDataTransaction.placeIdSf;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.place_of_loading_id")
	public static final SqlColumn<String> placeOfLoadingId = knbReadDataTransaction.placeOfLoadingId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.place_of_discharge_id")
	public static final SqlColumn<String> placeOfDischargeId = knbReadDataTransaction.placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.item_id_pd")
	public static final SqlColumn<String> itemIdPd = knbReadDataTransaction.itemIdPd;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.item_a02")
	public static final SqlColumn<String> itemA02 = knbReadDataTransaction.itemA02;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.item_a04_desc")
	public static final SqlColumn<String> itemA04Desc = knbReadDataTransaction.itemA04Desc;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.item_p08")
	public static final SqlColumn<String> itemP08 = knbReadDataTransaction.itemP08;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.item_67")
	public static final SqlColumn<String> item67 = knbReadDataTransaction.item67;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.item_e04")
	public static final SqlColumn<String> itemE04 = knbReadDataTransaction.itemE04;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.item_p05_a4")
	public static final SqlColumn<String> itemP05A4 = knbReadDataTransaction.itemP05A4;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.per_package_quantity")
	public static final SqlColumn<String> perPackageQuantity = knbReadDataTransaction.perPackageQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source field: public.knb_read_data_transaction.doc_ref_id_aau")
	public static final SqlColumn<String> docRefIdAau = knbReadDataTransaction.docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.knb_read_data_transaction.delivery_date")
	public static final SqlColumn<String> deliveryDate = knbReadDataTransaction.deliveryDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.knb_read_data_transaction.delivery_number")
	public static final SqlColumn<String> deliveryNumber = knbReadDataTransaction.deliveryNumber;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.knb_read_data_transaction.pickup_date_string_date")
	public static final SqlColumn<String> pickupDateStringDate = knbReadDataTransaction.pickupDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.knb_read_data_transaction.pickup_number")
	public static final SqlColumn<String> pickupNumber = knbReadDataTransaction.pickupNumber;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.knb_read_data_transaction.date_time_period_257")
	public static final SqlColumn<String> dateTimePeriod257 = knbReadDataTransaction.dateTimePeriod257;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.knb_read_data_transaction.kanban_qr_data")
	public static final SqlColumn<String> kanbanQrData = knbReadDataTransaction.kanbanQrData;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.knb_read_data_transaction")
	public static final class KnbReadDataTransaction extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> kanbanReadDataType = column("kanban_read_data_type", JDBCType.VARCHAR);
		public final SqlColumn<Long> headerOid = column("header_oid", JDBCType.BIGINT);
		public final SqlColumn<String> partyIdSender = column("party_id_sender", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdSender = column("place_id_sender", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdReceiver = column("party_id_receiver", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdReceiver = column("place_id_receiver", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdOb = column("party_id_ob", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdOb = column("place_id_ob", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdSt = column("party_id_st", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdSt = column("place_id_st", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdSf = column("party_id_sf", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdSf = column("place_id_sf", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfLoadingId = column("place_of_loading_id", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfDischargeId = column("place_of_discharge_id", JDBCType.VARCHAR);
		public final SqlColumn<String> itemIdPd = column("item_id_pd", JDBCType.VARCHAR);
		public final SqlColumn<String> itemA02 = column("item_a02", JDBCType.VARCHAR);
		public final SqlColumn<String> itemA04Desc = column("item_a04_desc", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP08 = column("item_p08", JDBCType.VARCHAR);
		public final SqlColumn<String> item67 = column("item_67", JDBCType.VARCHAR);
		public final SqlColumn<String> itemE04 = column("item_e04", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A4 = column("item_p05_a4", JDBCType.VARCHAR);
		public final SqlColumn<String> perPackageQuantity = column("per_package_quantity", JDBCType.VARCHAR);
		public final SqlColumn<String> docRefIdAau = column("doc_ref_id_aau", JDBCType.VARCHAR);
		public final SqlColumn<String> deliveryDate = column("delivery_date", JDBCType.VARCHAR);
		public final SqlColumn<String> deliveryNumber = column("delivery_number", JDBCType.VARCHAR);
		public final SqlColumn<String> pickupDateStringDate = column("pickup_date_string_date", JDBCType.VARCHAR);
		public final SqlColumn<String> pickupNumber = column("pickup_number", JDBCType.VARCHAR);
		public final SqlColumn<String> dateTimePeriod257 = column("date_time_period_257", JDBCType.VARCHAR);
		public final SqlColumn<String> kanbanQrData = column("kanban_qr_data", JDBCType.VARCHAR);

		public KnbReadDataTransaction() {
			super("public.knb_read_data_transaction");
		}
	}
}