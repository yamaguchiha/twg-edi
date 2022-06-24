package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TransportTransactionDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	public static final TransportTransaction transportTransaction = new TransportTransaction();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.oid")
	public static final SqlColumn<Long> oid = transportTransaction.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.transaction_status")
	public static final SqlColumn<String> transactionStatus = transportTransaction.transactionStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.cancel_status")
	public static final SqlColumn<String> cancelStatus = transportTransaction.cancelStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.process_oid")
	public static final SqlColumn<Long> processOid = transportTransaction.processOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.header_oid")
	public static final SqlColumn<Long> headerOid = transportTransaction.headerOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.option_oid")
	public static final SqlColumn<Long> optionOid = transportTransaction.optionOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_ps")
	public static final SqlColumn<String> docRefIdPs = transportTransaction.docRefIdPs;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_line_number_ps")
	public static final SqlColumn<String> docRefLineNumberPs = transportTransaction.docRefLineNumberPs;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_xsi")
	public static final SqlColumn<String> docRefIdXsi = transportTransaction.docRefIdXsi;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.item_id_in")
	public static final SqlColumn<String> itemIdIn = transportTransaction.itemIdIn;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.item_id_cl")
	public static final SqlColumn<String> itemIdCl = transportTransaction.itemIdCl;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.item_8")
	public static final SqlColumn<String> item8 = transportTransaction.item8;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.item_e18")
	public static final SqlColumn<String> itemE18 = transportTransaction.itemE18;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.per_package_quantity")
	public static final SqlColumn<Long> perPackageQuantity = transportTransaction.perPackageQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.number_of_packages_quantity")
	public static final SqlColumn<Long> numberOfPackagesQuantity = transportTransaction.numberOfPackagesQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aan")
	public static final SqlColumn<String> docRefIdAan = transportTransaction.docRefIdAan;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aak_page")
	public static final SqlColumn<Integer> docRefIdAakPage = transportTransaction.docRefIdAakPage;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aak_line")
	public static final SqlColumn<Integer> docRefIdAakLine = transportTransaction.docRefIdAakLine;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_113")
	public static final SqlColumn<Long> quantity113 = transportTransaction.quantity113;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_12")
	public static final SqlColumn<Long> quantity12 = transportTransaction.quantity12;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_unit_code")
	public static final SqlColumn<String> quantityUnitCode = transportTransaction.quantityUnitCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_discharge_id")
	public static final SqlColumn<String> placeOfDischargeId = transportTransaction.placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_loading_id")
	public static final SqlColumn<String> placeOfLoadingId = transportTransaction.placeOfLoadingId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_loading_name")
	public static final SqlColumn<String> placeOfLoadingName = transportTransaction.placeOfLoadingName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.delivery_date_string_date")
	public static final SqlColumn<String> deliveryDateStringDate = transportTransaction.deliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aaj")
	public static final SqlColumn<String> docRefIdAaj = transportTransaction.docRefIdAaj;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aau")
	public static final SqlColumn<String> docRefIdAau = transportTransaction.docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.transport_means_ident_name")
	public static final SqlColumn<String> transportMeansIdentName = transportTransaction.transportMeansIdentName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.memo")
	public static final SqlColumn<String> memo = transportTransaction.memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = transportTransaction.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = transportTransaction.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = transportTransaction.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = transportTransaction.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = transportTransaction.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = transportTransaction.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	public static final class TransportTransaction extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> transactionStatus = column("transaction_status", JDBCType.VARCHAR);
		public final SqlColumn<String> cancelStatus = column("cancel_status", JDBCType.VARCHAR);
		public final SqlColumn<Long> processOid = column("process_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> headerOid = column("header_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> optionOid = column("option_oid", JDBCType.BIGINT);
		public final SqlColumn<String> docRefIdPs = column("doc_ref_id_ps", JDBCType.VARCHAR);
		public final SqlColumn<String> docRefLineNumberPs = column("doc_ref_line_number_ps", JDBCType.VARCHAR);
		public final SqlColumn<String> docRefIdXsi = column("doc_ref_id_xsi", JDBCType.VARCHAR);
		public final SqlColumn<String> itemIdIn = column("item_id_in", JDBCType.VARCHAR);
		public final SqlColumn<String> itemIdCl = column("item_id_cl", JDBCType.VARCHAR);
		public final SqlColumn<String> item8 = column("item_8", JDBCType.VARCHAR);
		public final SqlColumn<String> itemE18 = column("item_e18", JDBCType.VARCHAR);
		public final SqlColumn<Long> perPackageQuantity = column("per_package_quantity", JDBCType.BIGINT);
		public final SqlColumn<Long> numberOfPackagesQuantity = column("number_of_packages_quantity", JDBCType.BIGINT);
		public final SqlColumn<String> docRefIdAan = column("doc_ref_id_aan", JDBCType.VARCHAR);
		public final SqlColumn<Integer> docRefIdAakPage = column("doc_ref_id_aak_page", JDBCType.INTEGER);
		public final SqlColumn<Integer> docRefIdAakLine = column("doc_ref_id_aak_line", JDBCType.INTEGER);
		public final SqlColumn<Long> quantity113 = column("quantity_113", JDBCType.BIGINT);
		public final SqlColumn<Long> quantity12 = column("quantity_12", JDBCType.BIGINT);
		public final SqlColumn<String> quantityUnitCode = column("quantity_unit_code", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfDischargeId = column("place_of_discharge_id", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfLoadingId = column("place_of_loading_id", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfLoadingName = column("place_of_loading_name", JDBCType.VARCHAR);
		public final SqlColumn<String> deliveryDateStringDate = column("delivery_date_string_date", JDBCType.VARCHAR);
		public final SqlColumn<String> docRefIdAaj = column("doc_ref_id_aaj", JDBCType.VARCHAR);
		public final SqlColumn<String> docRefIdAau = column("doc_ref_id_aau", JDBCType.VARCHAR);
		public final SqlColumn<String> transportMeansIdentName = column("transport_means_ident_name", JDBCType.VARCHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public TransportTransaction() {
			super("public.transport_transaction");
		}
	}
}