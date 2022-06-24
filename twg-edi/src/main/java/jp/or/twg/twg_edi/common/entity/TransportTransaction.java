package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TransportTransaction {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.transaction_status")
	private String transactionStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.cancel_status")
	private String cancelStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.process_oid")
	private Long processOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.header_oid")
	private Long headerOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.option_oid")
	private Long optionOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_ps")
	private String docRefIdPs;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_line_number_ps")
	private String docRefLineNumberPs;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_xsi")
	private String docRefIdXsi;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_id_in")
	private String itemIdIn;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_id_cl")
	private String itemIdCl;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_8")
	private String item8;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_e18")
	private String itemE18;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.per_package_quantity")
	private Long perPackageQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.number_of_packages_quantity")
	private Long numberOfPackagesQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aan")
	private String docRefIdAan;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aak_page")
	private Integer docRefIdAakPage;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aak_line")
	private Integer docRefIdAakLine;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_113")
	private Long quantity113;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_12")
	private Long quantity12;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_unit_code")
	private String quantityUnitCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_discharge_id")
	private String placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_loading_id")
	private String placeOfLoadingId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_loading_name")
	private String placeOfLoadingName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.delivery_date_string_date")
	private String deliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aaj")
	private String docRefIdAaj;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aau")
	private String docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.transport_means_ident_name")
	private String transportMeansIdentName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.memo")
	private String memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.transaction_status")
	public String getTransactionStatus() {
		return transactionStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.transaction_status")
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.cancel_status")
	public String getCancelStatus() {
		return cancelStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.cancel_status")
	public void setCancelStatus(String cancelStatus) {
		this.cancelStatus = cancelStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.process_oid")
	public Long getProcessOid() {
		return processOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.process_oid")
	public void setProcessOid(Long processOid) {
		this.processOid = processOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.header_oid")
	public Long getHeaderOid() {
		return headerOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.header_oid")
	public void setHeaderOid(Long headerOid) {
		this.headerOid = headerOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.option_oid")
	public Long getOptionOid() {
		return optionOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.option_oid")
	public void setOptionOid(Long optionOid) {
		this.optionOid = optionOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_ps")
	public String getDocRefIdPs() {
		return docRefIdPs;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_ps")
	public void setDocRefIdPs(String docRefIdPs) {
		this.docRefIdPs = docRefIdPs;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_line_number_ps")
	public String getDocRefLineNumberPs() {
		return docRefLineNumberPs;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_line_number_ps")
	public void setDocRefLineNumberPs(String docRefLineNumberPs) {
		this.docRefLineNumberPs = docRefLineNumberPs;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_xsi")
	public String getDocRefIdXsi() {
		return docRefIdXsi;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_xsi")
	public void setDocRefIdXsi(String docRefIdXsi) {
		this.docRefIdXsi = docRefIdXsi;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_id_in")
	public String getItemIdIn() {
		return itemIdIn;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_id_in")
	public void setItemIdIn(String itemIdIn) {
		this.itemIdIn = itemIdIn;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_id_cl")
	public String getItemIdCl() {
		return itemIdCl;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_id_cl")
	public void setItemIdCl(String itemIdCl) {
		this.itemIdCl = itemIdCl;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_8")
	public String getItem8() {
		return item8;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_8")
	public void setItem8(String item8) {
		this.item8 = item8;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_e18")
	public String getItemE18() {
		return itemE18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.item_e18")
	public void setItemE18(String itemE18) {
		this.itemE18 = itemE18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.per_package_quantity")
	public Long getPerPackageQuantity() {
		return perPackageQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.per_package_quantity")
	public void setPerPackageQuantity(Long perPackageQuantity) {
		this.perPackageQuantity = perPackageQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.number_of_packages_quantity")
	public Long getNumberOfPackagesQuantity() {
		return numberOfPackagesQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.number_of_packages_quantity")
	public void setNumberOfPackagesQuantity(Long numberOfPackagesQuantity) {
		this.numberOfPackagesQuantity = numberOfPackagesQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aan")
	public String getDocRefIdAan() {
		return docRefIdAan;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aan")
	public void setDocRefIdAan(String docRefIdAan) {
		this.docRefIdAan = docRefIdAan;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aak_page")
	public Integer getDocRefIdAakPage() {
		return docRefIdAakPage;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aak_page")
	public void setDocRefIdAakPage(Integer docRefIdAakPage) {
		this.docRefIdAakPage = docRefIdAakPage;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aak_line")
	public Integer getDocRefIdAakLine() {
		return docRefIdAakLine;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aak_line")
	public void setDocRefIdAakLine(Integer docRefIdAakLine) {
		this.docRefIdAakLine = docRefIdAakLine;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_113")
	public Long getQuantity113() {
		return quantity113;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_113")
	public void setQuantity113(Long quantity113) {
		this.quantity113 = quantity113;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_12")
	public Long getQuantity12() {
		return quantity12;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_12")
	public void setQuantity12(Long quantity12) {
		this.quantity12 = quantity12;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_unit_code")
	public String getQuantityUnitCode() {
		return quantityUnitCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.quantity_unit_code")
	public void setQuantityUnitCode(String quantityUnitCode) {
		this.quantityUnitCode = quantityUnitCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_discharge_id")
	public String getPlaceOfDischargeId() {
		return placeOfDischargeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_discharge_id")
	public void setPlaceOfDischargeId(String placeOfDischargeId) {
		this.placeOfDischargeId = placeOfDischargeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_loading_id")
	public String getPlaceOfLoadingId() {
		return placeOfLoadingId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_loading_id")
	public void setPlaceOfLoadingId(String placeOfLoadingId) {
		this.placeOfLoadingId = placeOfLoadingId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_loading_name")
	public String getPlaceOfLoadingName() {
		return placeOfLoadingName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.place_of_loading_name")
	public void setPlaceOfLoadingName(String placeOfLoadingName) {
		this.placeOfLoadingName = placeOfLoadingName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.delivery_date_string_date")
	public String getDeliveryDateStringDate() {
		return deliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.delivery_date_string_date")
	public void setDeliveryDateStringDate(String deliveryDateStringDate) {
		this.deliveryDateStringDate = deliveryDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aaj")
	public String getDocRefIdAaj() {
		return docRefIdAaj;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aaj")
	public void setDocRefIdAaj(String docRefIdAaj) {
		this.docRefIdAaj = docRefIdAaj;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aau")
	public String getDocRefIdAau() {
		return docRefIdAau;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.doc_ref_id_aau")
	public void setDocRefIdAau(String docRefIdAau) {
		this.docRefIdAau = docRefIdAau;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.transport_means_ident_name")
	public String getTransportMeansIdentName() {
		return transportMeansIdentName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.transport_means_ident_name")
	public void setTransportMeansIdentName(String transportMeansIdentName) {
		this.transportMeansIdentName = transportMeansIdentName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.memo")
	public String getMemo() {
		return memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.memo")
	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source field: public.transport_transaction.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}
}