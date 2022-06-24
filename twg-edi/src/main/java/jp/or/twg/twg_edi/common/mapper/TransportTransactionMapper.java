package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.TransportTransactionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.TransportTransaction;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface TransportTransactionMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5312163+09:00", comments = "Source Table: public.transport_transaction")
	BasicColumn[] selectList = BasicColumn.columnList(oid, transactionStatus, cancelStatus, processOid, headerOid,
			optionOid, docRefIdPs, docRefLineNumberPs, docRefIdXsi, itemIdIn, itemIdCl, item8, itemE18,
			perPackageQuantity, numberOfPackagesQuantity, docRefIdAan, docRefIdAakPage, docRefIdAakLine, quantity113,
			quantity12, quantityUnitCode, placeOfDischargeId, placeOfLoadingId, placeOfLoadingName,
			deliveryDateStringDate, docRefIdAaj, docRefIdAau, transportMeansIdentName, memo, tsRegistererDate,
			tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId,
			tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<TransportTransaction> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<TransportTransaction> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("TransportTransactionResult")
	Optional<TransportTransaction> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "TransportTransactionResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "transaction_status", property = "transactionStatus", jdbcType = JdbcType.VARCHAR),
			@Result(column = "cancel_status", property = "cancelStatus", jdbcType = JdbcType.VARCHAR),
			@Result(column = "process_oid", property = "processOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "header_oid", property = "headerOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "option_oid", property = "optionOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "doc_ref_id_ps", property = "docRefIdPs", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_line_number_ps", property = "docRefLineNumberPs", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_id_xsi", property = "docRefIdXsi", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_id_in", property = "itemIdIn", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_id_cl", property = "itemIdCl", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_8", property = "item8", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_e18", property = "itemE18", jdbcType = JdbcType.VARCHAR),
			@Result(column = "per_package_quantity", property = "perPackageQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "number_of_packages_quantity", property = "numberOfPackagesQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "doc_ref_id_aan", property = "docRefIdAan", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_id_aak_page", property = "docRefIdAakPage", jdbcType = JdbcType.INTEGER),
			@Result(column = "doc_ref_id_aak_line", property = "docRefIdAakLine", jdbcType = JdbcType.INTEGER),
			@Result(column = "quantity_113", property = "quantity113", jdbcType = JdbcType.BIGINT),
			@Result(column = "quantity_12", property = "quantity12", jdbcType = JdbcType.BIGINT),
			@Result(column = "quantity_unit_code", property = "quantityUnitCode", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_discharge_id", property = "placeOfDischargeId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_loading_id", property = "placeOfLoadingId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_loading_name", property = "placeOfLoadingName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "delivery_date_string_date", property = "deliveryDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_id_aaj", property = "docRefIdAaj", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_id_aau", property = "docRefIdAau", jdbcType = JdbcType.VARCHAR),
			@Result(column = "transport_means_ident_name", property = "transportMeansIdentName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "memo", property = "memo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<TransportTransaction> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, transportTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, transportTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	default int insert(TransportTransaction record) {
		return MyBatis3Utils.insert(this::insert, record, transportTransaction, c -> c.map(oid).toProperty("oid")
				.map(transactionStatus).toProperty("transactionStatus").map(cancelStatus).toProperty("cancelStatus")
				.map(processOid).toProperty("processOid").map(headerOid).toProperty("headerOid").map(optionOid)
				.toProperty("optionOid").map(docRefIdPs).toProperty("docRefIdPs").map(docRefLineNumberPs)
				.toProperty("docRefLineNumberPs").map(docRefIdXsi).toProperty("docRefIdXsi").map(itemIdIn)
				.toProperty("itemIdIn").map(itemIdCl).toProperty("itemIdCl").map(item8).toProperty("item8").map(itemE18)
				.toProperty("itemE18").map(perPackageQuantity).toProperty("perPackageQuantity")
				.map(numberOfPackagesQuantity).toProperty("numberOfPackagesQuantity").map(docRefIdAan)
				.toProperty("docRefIdAan").map(docRefIdAakPage).toProperty("docRefIdAakPage").map(docRefIdAakLine)
				.toProperty("docRefIdAakLine").map(quantity113).toProperty("quantity113").map(quantity12)
				.toProperty("quantity12").map(quantityUnitCode).toProperty("quantityUnitCode").map(placeOfDischargeId)
				.toProperty("placeOfDischargeId").map(placeOfLoadingId).toProperty("placeOfLoadingId")
				.map(placeOfLoadingName).toProperty("placeOfLoadingName").map(deliveryDateStringDate)
				.toProperty("deliveryDateStringDate").map(docRefIdAaj).toProperty("docRefIdAaj").map(docRefIdAau)
				.toProperty("docRefIdAau").map(transportMeansIdentName).toProperty("transportMeansIdentName").map(memo)
				.toProperty("memo").map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
				.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId")
				.map(tsLastModifiedDate).toProperty("tsLastModifiedDate").map(tsLastModifiedUserId)
				.toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
				.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	default int insertMultiple(Collection<TransportTransaction> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, transportTransaction, c -> c.map(oid)
				.toProperty("oid").map(transactionStatus).toProperty("transactionStatus").map(cancelStatus)
				.toProperty("cancelStatus").map(processOid).toProperty("processOid").map(headerOid)
				.toProperty("headerOid").map(optionOid).toProperty("optionOid").map(docRefIdPs).toProperty("docRefIdPs")
				.map(docRefLineNumberPs).toProperty("docRefLineNumberPs").map(docRefIdXsi).toProperty("docRefIdXsi")
				.map(itemIdIn).toProperty("itemIdIn").map(itemIdCl).toProperty("itemIdCl").map(item8)
				.toProperty("item8").map(itemE18).toProperty("itemE18").map(perPackageQuantity)
				.toProperty("perPackageQuantity").map(numberOfPackagesQuantity).toProperty("numberOfPackagesQuantity")
				.map(docRefIdAan).toProperty("docRefIdAan").map(docRefIdAakPage).toProperty("docRefIdAakPage")
				.map(docRefIdAakLine).toProperty("docRefIdAakLine").map(quantity113).toProperty("quantity113")
				.map(quantity12).toProperty("quantity12").map(quantityUnitCode).toProperty("quantityUnitCode")
				.map(placeOfDischargeId).toProperty("placeOfDischargeId").map(placeOfLoadingId)
				.toProperty("placeOfLoadingId").map(placeOfLoadingName).toProperty("placeOfLoadingName")
				.map(deliveryDateStringDate).toProperty("deliveryDateStringDate").map(docRefIdAaj)
				.toProperty("docRefIdAaj").map(docRefIdAau).toProperty("docRefIdAau").map(transportMeansIdentName)
				.toProperty("transportMeansIdentName").map(memo).toProperty("memo").map(tsRegistererDate)
				.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
				.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
				.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
				.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5302184+09:00", comments = "Source Table: public.transport_transaction")
	default int insertSelective(TransportTransaction record) {
		return MyBatis3Utils.insert(this::insert, record, transportTransaction, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(transactionStatus)
				.toPropertyWhenPresent("transactionStatus", record::getTransactionStatus).map(cancelStatus)
				.toPropertyWhenPresent("cancelStatus", record::getCancelStatus).map(processOid)
				.toPropertyWhenPresent("processOid", record::getProcessOid).map(headerOid)
				.toPropertyWhenPresent("headerOid", record::getHeaderOid).map(optionOid)
				.toPropertyWhenPresent("optionOid", record::getOptionOid).map(docRefIdPs)
				.toPropertyWhenPresent("docRefIdPs", record::getDocRefIdPs).map(docRefLineNumberPs)
				.toPropertyWhenPresent("docRefLineNumberPs", record::getDocRefLineNumberPs).map(docRefIdXsi)
				.toPropertyWhenPresent("docRefIdXsi", record::getDocRefIdXsi).map(itemIdIn)
				.toPropertyWhenPresent("itemIdIn", record::getItemIdIn).map(itemIdCl)
				.toPropertyWhenPresent("itemIdCl", record::getItemIdCl).map(item8)
				.toPropertyWhenPresent("item8", record::getItem8).map(itemE18)
				.toPropertyWhenPresent("itemE18", record::getItemE18).map(perPackageQuantity)
				.toPropertyWhenPresent("perPackageQuantity", record::getPerPackageQuantity)
				.map(numberOfPackagesQuantity)
				.toPropertyWhenPresent("numberOfPackagesQuantity", record::getNumberOfPackagesQuantity).map(docRefIdAan)
				.toPropertyWhenPresent("docRefIdAan", record::getDocRefIdAan).map(docRefIdAakPage)
				.toPropertyWhenPresent("docRefIdAakPage", record::getDocRefIdAakPage).map(docRefIdAakLine)
				.toPropertyWhenPresent("docRefIdAakLine", record::getDocRefIdAakLine).map(quantity113)
				.toPropertyWhenPresent("quantity113", record::getQuantity113).map(quantity12)
				.toPropertyWhenPresent("quantity12", record::getQuantity12).map(quantityUnitCode)
				.toPropertyWhenPresent("quantityUnitCode", record::getQuantityUnitCode).map(placeOfDischargeId)
				.toPropertyWhenPresent("placeOfDischargeId", record::getPlaceOfDischargeId).map(placeOfLoadingId)
				.toPropertyWhenPresent("placeOfLoadingId", record::getPlaceOfLoadingId).map(placeOfLoadingName)
				.toPropertyWhenPresent("placeOfLoadingName", record::getPlaceOfLoadingName).map(deliveryDateStringDate)
				.toPropertyWhenPresent("deliveryDateStringDate", record::getDeliveryDateStringDate).map(docRefIdAaj)
				.toPropertyWhenPresent("docRefIdAaj", record::getDocRefIdAaj).map(docRefIdAau)
				.toPropertyWhenPresent("docRefIdAau", record::getDocRefIdAau).map(transportMeansIdentName)
				.toPropertyWhenPresent("transportMeansIdentName", record::getTransportMeansIdentName).map(memo)
				.toPropertyWhenPresent("memo", record::getMemo).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5312163+09:00", comments = "Source Table: public.transport_transaction")
	default Optional<TransportTransaction> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, transportTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5312163+09:00", comments = "Source Table: public.transport_transaction")
	default List<TransportTransaction> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, transportTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5312163+09:00", comments = "Source Table: public.transport_transaction")
	default List<TransportTransaction> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, transportTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5312163+09:00", comments = "Source Table: public.transport_transaction")
	default Optional<TransportTransaction> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5312163+09:00", comments = "Source Table: public.transport_transaction")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, transportTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5312163+09:00", comments = "Source Table: public.transport_transaction")
	static UpdateDSL<UpdateModel> updateAllColumns(TransportTransaction record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(transactionStatus).equalTo(record::getTransactionStatus)
				.set(cancelStatus).equalTo(record::getCancelStatus).set(processOid).equalTo(record::getProcessOid)
				.set(headerOid).equalTo(record::getHeaderOid).set(optionOid).equalTo(record::getOptionOid)
				.set(docRefIdPs).equalTo(record::getDocRefIdPs).set(docRefLineNumberPs)
				.equalTo(record::getDocRefLineNumberPs).set(docRefIdXsi).equalTo(record::getDocRefIdXsi).set(itemIdIn)
				.equalTo(record::getItemIdIn).set(itemIdCl).equalTo(record::getItemIdCl).set(item8)
				.equalTo(record::getItem8).set(itemE18).equalTo(record::getItemE18).set(perPackageQuantity)
				.equalTo(record::getPerPackageQuantity).set(numberOfPackagesQuantity)
				.equalTo(record::getNumberOfPackagesQuantity).set(docRefIdAan).equalTo(record::getDocRefIdAan)
				.set(docRefIdAakPage).equalTo(record::getDocRefIdAakPage).set(docRefIdAakLine)
				.equalTo(record::getDocRefIdAakLine).set(quantity113).equalTo(record::getQuantity113).set(quantity12)
				.equalTo(record::getQuantity12).set(quantityUnitCode).equalTo(record::getQuantityUnitCode)
				.set(placeOfDischargeId).equalTo(record::getPlaceOfDischargeId).set(placeOfLoadingId)
				.equalTo(record::getPlaceOfLoadingId).set(placeOfLoadingName).equalTo(record::getPlaceOfLoadingName)
				.set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate).set(docRefIdAaj)
				.equalTo(record::getDocRefIdAaj).set(docRefIdAau).equalTo(record::getDocRefIdAau)
				.set(transportMeansIdentName).equalTo(record::getTransportMeansIdentName).set(memo)
				.equalTo(record::getMemo).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5312163+09:00", comments = "Source Table: public.transport_transaction")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(TransportTransaction record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(transactionStatus)
				.equalToWhenPresent(record::getTransactionStatus).set(cancelStatus)
				.equalToWhenPresent(record::getCancelStatus).set(processOid).equalToWhenPresent(record::getProcessOid)
				.set(headerOid).equalToWhenPresent(record::getHeaderOid).set(optionOid)
				.equalToWhenPresent(record::getOptionOid).set(docRefIdPs).equalToWhenPresent(record::getDocRefIdPs)
				.set(docRefLineNumberPs).equalToWhenPresent(record::getDocRefLineNumberPs).set(docRefIdXsi)
				.equalToWhenPresent(record::getDocRefIdXsi).set(itemIdIn).equalToWhenPresent(record::getItemIdIn)
				.set(itemIdCl).equalToWhenPresent(record::getItemIdCl).set(item8).equalToWhenPresent(record::getItem8)
				.set(itemE18).equalToWhenPresent(record::getItemE18).set(perPackageQuantity)
				.equalToWhenPresent(record::getPerPackageQuantity).set(numberOfPackagesQuantity)
				.equalToWhenPresent(record::getNumberOfPackagesQuantity).set(docRefIdAan)
				.equalToWhenPresent(record::getDocRefIdAan).set(docRefIdAakPage)
				.equalToWhenPresent(record::getDocRefIdAakPage).set(docRefIdAakLine)
				.equalToWhenPresent(record::getDocRefIdAakLine).set(quantity113)
				.equalToWhenPresent(record::getQuantity113).set(quantity12).equalToWhenPresent(record::getQuantity12)
				.set(quantityUnitCode).equalToWhenPresent(record::getQuantityUnitCode).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(placeOfLoadingId)
				.equalToWhenPresent(record::getPlaceOfLoadingId).set(placeOfLoadingName)
				.equalToWhenPresent(record::getPlaceOfLoadingName).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(docRefIdAaj)
				.equalToWhenPresent(record::getDocRefIdAaj).set(docRefIdAau).equalToWhenPresent(record::getDocRefIdAau)
				.set(transportMeansIdentName).equalToWhenPresent(record::getTransportMeansIdentName).set(memo)
				.equalToWhenPresent(record::getMemo).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5312163+09:00", comments = "Source Table: public.transport_transaction")
	default int updateByPrimaryKey(TransportTransaction record) {
		return update(c -> c.set(transactionStatus).equalTo(record::getTransactionStatus).set(cancelStatus)
				.equalTo(record::getCancelStatus).set(processOid).equalTo(record::getProcessOid).set(headerOid)
				.equalTo(record::getHeaderOid).set(optionOid).equalTo(record::getOptionOid).set(docRefIdPs)
				.equalTo(record::getDocRefIdPs).set(docRefLineNumberPs).equalTo(record::getDocRefLineNumberPs)
				.set(docRefIdXsi).equalTo(record::getDocRefIdXsi).set(itemIdIn).equalTo(record::getItemIdIn)
				.set(itemIdCl).equalTo(record::getItemIdCl).set(item8).equalTo(record::getItem8).set(itemE18)
				.equalTo(record::getItemE18).set(perPackageQuantity).equalTo(record::getPerPackageQuantity)
				.set(numberOfPackagesQuantity).equalTo(record::getNumberOfPackagesQuantity).set(docRefIdAan)
				.equalTo(record::getDocRefIdAan).set(docRefIdAakPage).equalTo(record::getDocRefIdAakPage)
				.set(docRefIdAakLine).equalTo(record::getDocRefIdAakLine).set(quantity113)
				.equalTo(record::getQuantity113).set(quantity12).equalTo(record::getQuantity12).set(quantityUnitCode)
				.equalTo(record::getQuantityUnitCode).set(placeOfDischargeId).equalTo(record::getPlaceOfDischargeId)
				.set(placeOfLoadingId).equalTo(record::getPlaceOfLoadingId).set(placeOfLoadingName)
				.equalTo(record::getPlaceOfLoadingName).set(deliveryDateStringDate)
				.equalTo(record::getDeliveryDateStringDate).set(docRefIdAaj).equalTo(record::getDocRefIdAaj)
				.set(docRefIdAau).equalTo(record::getDocRefIdAau).set(transportMeansIdentName)
				.equalTo(record::getTransportMeansIdentName).set(memo).equalTo(record::getMemo).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5312163+09:00", comments = "Source Table: public.transport_transaction")
	default int updateByPrimaryKeySelective(TransportTransaction record) {
		return update(c -> c.set(transactionStatus).equalToWhenPresent(record::getTransactionStatus).set(cancelStatus)
				.equalToWhenPresent(record::getCancelStatus).set(processOid).equalToWhenPresent(record::getProcessOid)
				.set(headerOid).equalToWhenPresent(record::getHeaderOid).set(optionOid)
				.equalToWhenPresent(record::getOptionOid).set(docRefIdPs).equalToWhenPresent(record::getDocRefIdPs)
				.set(docRefLineNumberPs).equalToWhenPresent(record::getDocRefLineNumberPs).set(docRefIdXsi)
				.equalToWhenPresent(record::getDocRefIdXsi).set(itemIdIn).equalToWhenPresent(record::getItemIdIn)
				.set(itemIdCl).equalToWhenPresent(record::getItemIdCl).set(item8).equalToWhenPresent(record::getItem8)
				.set(itemE18).equalToWhenPresent(record::getItemE18).set(perPackageQuantity)
				.equalToWhenPresent(record::getPerPackageQuantity).set(numberOfPackagesQuantity)
				.equalToWhenPresent(record::getNumberOfPackagesQuantity).set(docRefIdAan)
				.equalToWhenPresent(record::getDocRefIdAan).set(docRefIdAakPage)
				.equalToWhenPresent(record::getDocRefIdAakPage).set(docRefIdAakLine)
				.equalToWhenPresent(record::getDocRefIdAakLine).set(quantity113)
				.equalToWhenPresent(record::getQuantity113).set(quantity12).equalToWhenPresent(record::getQuantity12)
				.set(quantityUnitCode).equalToWhenPresent(record::getQuantityUnitCode).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(placeOfLoadingId)
				.equalToWhenPresent(record::getPlaceOfLoadingId).set(placeOfLoadingName)
				.equalToWhenPresent(record::getPlaceOfLoadingName).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(docRefIdAaj)
				.equalToWhenPresent(record::getDocRefIdAaj).set(docRefIdAau).equalToWhenPresent(record::getDocRefIdAau)
				.set(transportMeansIdentName).equalToWhenPresent(record::getTransportMeansIdentName).set(memo)
				.equalToWhenPresent(record::getMemo).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}