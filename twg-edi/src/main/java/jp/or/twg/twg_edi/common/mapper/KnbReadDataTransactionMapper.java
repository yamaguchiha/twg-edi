package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.KnbReadDataTransactionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.KnbReadDataTransaction;
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
public interface KnbReadDataTransactionMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	BasicColumn[] selectList = BasicColumn.columnList(oid, kanbanReadDataType, headerOid, partyIdSender, placeIdSender,
			partyIdReceiver, placeIdReceiver, partyIdOb, placeIdOb, partyIdSt, placeIdSt, partyIdSf, placeIdSf,
			placeOfLoadingId, placeOfDischargeId, itemIdPd, itemA02, itemA04Desc, itemP08, item67, itemE04, itemP05A4,
			perPackageQuantity, docRefIdAau, deliveryDate, deliveryNumber, pickupDateStringDate, pickupNumber,
			dateTimePeriod257, kanbanQrData);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<KnbReadDataTransaction> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<KnbReadDataTransaction> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("KnbReadDataTransactionResult")
	Optional<KnbReadDataTransaction> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "KnbReadDataTransactionResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "kanban_read_data_type", property = "kanbanReadDataType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "header_oid", property = "headerOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "party_id_sender", property = "partyIdSender", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_sender", property = "placeIdSender", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_receiver", property = "partyIdReceiver", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_receiver", property = "placeIdReceiver", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_ob", property = "partyIdOb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_ob", property = "placeIdOb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_st", property = "partyIdSt", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_st", property = "placeIdSt", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_sf", property = "partyIdSf", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_sf", property = "placeIdSf", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_loading_id", property = "placeOfLoadingId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_discharge_id", property = "placeOfDischargeId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_id_pd", property = "itemIdPd", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_a02", property = "itemA02", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_a04_desc", property = "itemA04Desc", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p08", property = "itemP08", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_67", property = "item67", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_e04", property = "itemE04", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a4", property = "itemP05A4", jdbcType = JdbcType.VARCHAR),
			@Result(column = "per_package_quantity", property = "perPackageQuantity", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_id_aau", property = "docRefIdAau", jdbcType = JdbcType.VARCHAR),
			@Result(column = "delivery_date", property = "deliveryDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "delivery_number", property = "deliveryNumber", jdbcType = JdbcType.VARCHAR),
			@Result(column = "pickup_date_string_date", property = "pickupDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "pickup_number", property = "pickupNumber", jdbcType = JdbcType.VARCHAR),
			@Result(column = "date_time_period_257", property = "dateTimePeriod257", jdbcType = JdbcType.VARCHAR),
			@Result(column = "kanban_qr_data", property = "kanbanQrData", jdbcType = JdbcType.VARCHAR) })
	List<KnbReadDataTransaction> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, knbReadDataTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, knbReadDataTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default int insert(KnbReadDataTransaction record) {
		return MyBatis3Utils.insert(this::insert, record, knbReadDataTransaction, c -> c.map(oid).toProperty("oid")
				.map(kanbanReadDataType).toProperty("kanbanReadDataType").map(headerOid).toProperty("headerOid")
				.map(partyIdSender).toProperty("partyIdSender").map(placeIdSender).toProperty("placeIdSender")
				.map(partyIdReceiver).toProperty("partyIdReceiver").map(placeIdReceiver).toProperty("placeIdReceiver")
				.map(partyIdOb).toProperty("partyIdOb").map(placeIdOb).toProperty("placeIdOb").map(partyIdSt)
				.toProperty("partyIdSt").map(placeIdSt).toProperty("placeIdSt").map(partyIdSf).toProperty("partyIdSf")
				.map(placeIdSf).toProperty("placeIdSf").map(placeOfLoadingId).toProperty("placeOfLoadingId")
				.map(placeOfDischargeId).toProperty("placeOfDischargeId").map(itemIdPd).toProperty("itemIdPd")
				.map(itemA02).toProperty("itemA02").map(itemA04Desc).toProperty("itemA04Desc").map(itemP08)
				.toProperty("itemP08").map(item67).toProperty("item67").map(itemE04).toProperty("itemE04")
				.map(itemP05A4).toProperty("itemP05A4").map(perPackageQuantity).toProperty("perPackageQuantity")
				.map(docRefIdAau).toProperty("docRefIdAau").map(deliveryDate).toProperty("deliveryDate")
				.map(deliveryNumber).toProperty("deliveryNumber").map(pickupDateStringDate)
				.toProperty("pickupDateStringDate").map(pickupNumber).toProperty("pickupNumber").map(dateTimePeriod257)
				.toProperty("dateTimePeriod257").map(kanbanQrData).toProperty("kanbanQrData"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default int insertMultiple(Collection<KnbReadDataTransaction> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, knbReadDataTransaction, c -> c.map(oid)
				.toProperty("oid").map(kanbanReadDataType).toProperty("kanbanReadDataType").map(headerOid)
				.toProperty("headerOid").map(partyIdSender).toProperty("partyIdSender").map(placeIdSender)
				.toProperty("placeIdSender").map(partyIdReceiver).toProperty("partyIdReceiver").map(placeIdReceiver)
				.toProperty("placeIdReceiver").map(partyIdOb).toProperty("partyIdOb").map(placeIdOb)
				.toProperty("placeIdOb").map(partyIdSt).toProperty("partyIdSt").map(placeIdSt).toProperty("placeIdSt")
				.map(partyIdSf).toProperty("partyIdSf").map(placeIdSf).toProperty("placeIdSf").map(placeOfLoadingId)
				.toProperty("placeOfLoadingId").map(placeOfDischargeId).toProperty("placeOfDischargeId").map(itemIdPd)
				.toProperty("itemIdPd").map(itemA02).toProperty("itemA02").map(itemA04Desc).toProperty("itemA04Desc")
				.map(itemP08).toProperty("itemP08").map(item67).toProperty("item67").map(itemE04).toProperty("itemE04")
				.map(itemP05A4).toProperty("itemP05A4").map(perPackageQuantity).toProperty("perPackageQuantity")
				.map(docRefIdAau).toProperty("docRefIdAau").map(deliveryDate).toProperty("deliveryDate")
				.map(deliveryNumber).toProperty("deliveryNumber").map(pickupDateStringDate)
				.toProperty("pickupDateStringDate").map(pickupNumber).toProperty("pickupNumber").map(dateTimePeriod257)
				.toProperty("dateTimePeriod257").map(kanbanQrData).toProperty("kanbanQrData"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default int insertSelective(KnbReadDataTransaction record) {
		return MyBatis3Utils.insert(this::insert, record, knbReadDataTransaction,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(kanbanReadDataType)
						.toPropertyWhenPresent("kanbanReadDataType", record::getKanbanReadDataType).map(headerOid)
						.toPropertyWhenPresent("headerOid", record::getHeaderOid).map(partyIdSender)
						.toPropertyWhenPresent("partyIdSender", record::getPartyIdSender).map(placeIdSender)
						.toPropertyWhenPresent("placeIdSender", record::getPlaceIdSender).map(partyIdReceiver)
						.toPropertyWhenPresent("partyIdReceiver", record::getPartyIdReceiver).map(placeIdReceiver)
						.toPropertyWhenPresent("placeIdReceiver", record::getPlaceIdReceiver).map(partyIdOb)
						.toPropertyWhenPresent("partyIdOb", record::getPartyIdOb).map(placeIdOb)
						.toPropertyWhenPresent("placeIdOb", record::getPlaceIdOb).map(partyIdSt)
						.toPropertyWhenPresent("partyIdSt", record::getPartyIdSt).map(placeIdSt)
						.toPropertyWhenPresent("placeIdSt", record::getPlaceIdSt).map(partyIdSf)
						.toPropertyWhenPresent("partyIdSf", record::getPartyIdSf).map(placeIdSf)
						.toPropertyWhenPresent("placeIdSf", record::getPlaceIdSf).map(placeOfLoadingId)
						.toPropertyWhenPresent("placeOfLoadingId", record::getPlaceOfLoadingId).map(placeOfDischargeId)
						.toPropertyWhenPresent("placeOfDischargeId", record::getPlaceOfDischargeId).map(itemIdPd)
						.toPropertyWhenPresent("itemIdPd", record::getItemIdPd).map(itemA02)
						.toPropertyWhenPresent("itemA02", record::getItemA02).map(itemA04Desc)
						.toPropertyWhenPresent("itemA04Desc", record::getItemA04Desc).map(itemP08)
						.toPropertyWhenPresent("itemP08", record::getItemP08).map(item67)
						.toPropertyWhenPresent("item67", record::getItem67).map(itemE04)
						.toPropertyWhenPresent("itemE04", record::getItemE04).map(itemP05A4)
						.toPropertyWhenPresent("itemP05A4", record::getItemP05A4).map(perPackageQuantity)
						.toPropertyWhenPresent("perPackageQuantity", record::getPerPackageQuantity).map(docRefIdAau)
						.toPropertyWhenPresent("docRefIdAau", record::getDocRefIdAau).map(deliveryDate)
						.toPropertyWhenPresent("deliveryDate", record::getDeliveryDate).map(deliveryNumber)
						.toPropertyWhenPresent("deliveryNumber", record::getDeliveryNumber).map(pickupDateStringDate)
						.toPropertyWhenPresent("pickupDateStringDate", record::getPickupDateStringDate)
						.map(pickupNumber).toPropertyWhenPresent("pickupNumber", record::getPickupNumber)
						.map(dateTimePeriod257).toPropertyWhenPresent("dateTimePeriod257", record::getDateTimePeriod257)
						.map(kanbanQrData).toPropertyWhenPresent("kanbanQrData", record::getKanbanQrData));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default Optional<KnbReadDataTransaction> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, knbReadDataTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default List<KnbReadDataTransaction> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, knbReadDataTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default List<KnbReadDataTransaction> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, knbReadDataTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default Optional<KnbReadDataTransaction> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, knbReadDataTransaction, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	static UpdateDSL<UpdateModel> updateAllColumns(KnbReadDataTransaction record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(kanbanReadDataType).equalTo(record::getKanbanReadDataType)
				.set(headerOid).equalTo(record::getHeaderOid).set(partyIdSender).equalTo(record::getPartyIdSender)
				.set(placeIdSender).equalTo(record::getPlaceIdSender).set(partyIdReceiver)
				.equalTo(record::getPartyIdReceiver).set(placeIdReceiver).equalTo(record::getPlaceIdReceiver)
				.set(partyIdOb).equalTo(record::getPartyIdOb).set(placeIdOb).equalTo(record::getPlaceIdOb)
				.set(partyIdSt).equalTo(record::getPartyIdSt).set(placeIdSt).equalTo(record::getPlaceIdSt)
				.set(partyIdSf).equalTo(record::getPartyIdSf).set(placeIdSf).equalTo(record::getPlaceIdSf)
				.set(placeOfLoadingId).equalTo(record::getPlaceOfLoadingId).set(placeOfDischargeId)
				.equalTo(record::getPlaceOfDischargeId).set(itemIdPd).equalTo(record::getItemIdPd).set(itemA02)
				.equalTo(record::getItemA02).set(itemA04Desc).equalTo(record::getItemA04Desc).set(itemP08)
				.equalTo(record::getItemP08).set(item67).equalTo(record::getItem67).set(itemE04)
				.equalTo(record::getItemE04).set(itemP05A4).equalTo(record::getItemP05A4).set(perPackageQuantity)
				.equalTo(record::getPerPackageQuantity).set(docRefIdAau).equalTo(record::getDocRefIdAau)
				.set(deliveryDate).equalTo(record::getDeliveryDate).set(deliveryNumber)
				.equalTo(record::getDeliveryNumber).set(pickupDateStringDate).equalTo(record::getPickupDateStringDate)
				.set(pickupNumber).equalTo(record::getPickupNumber).set(dateTimePeriod257)
				.equalTo(record::getDateTimePeriod257).set(kanbanQrData).equalTo(record::getKanbanQrData);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(KnbReadDataTransaction record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(kanbanReadDataType)
				.equalToWhenPresent(record::getKanbanReadDataType).set(headerOid)
				.equalToWhenPresent(record::getHeaderOid).set(partyIdSender)
				.equalToWhenPresent(record::getPartyIdSender).set(placeIdSender)
				.equalToWhenPresent(record::getPlaceIdSender).set(partyIdReceiver)
				.equalToWhenPresent(record::getPartyIdReceiver).set(placeIdReceiver)
				.equalToWhenPresent(record::getPlaceIdReceiver).set(partyIdOb).equalToWhenPresent(record::getPartyIdOb)
				.set(placeIdOb).equalToWhenPresent(record::getPlaceIdOb).set(partyIdSt)
				.equalToWhenPresent(record::getPartyIdSt).set(placeIdSt).equalToWhenPresent(record::getPlaceIdSt)
				.set(partyIdSf).equalToWhenPresent(record::getPartyIdSf).set(placeIdSf)
				.equalToWhenPresent(record::getPlaceIdSf).set(placeOfLoadingId)
				.equalToWhenPresent(record::getPlaceOfLoadingId).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(itemIdPd).equalToWhenPresent(record::getItemIdPd)
				.set(itemA02).equalToWhenPresent(record::getItemA02).set(itemA04Desc)
				.equalToWhenPresent(record::getItemA04Desc).set(itemP08).equalToWhenPresent(record::getItemP08)
				.set(item67).equalToWhenPresent(record::getItem67).set(itemE04).equalToWhenPresent(record::getItemE04)
				.set(itemP05A4).equalToWhenPresent(record::getItemP05A4).set(perPackageQuantity)
				.equalToWhenPresent(record::getPerPackageQuantity).set(docRefIdAau)
				.equalToWhenPresent(record::getDocRefIdAau).set(deliveryDate)
				.equalToWhenPresent(record::getDeliveryDate).set(deliveryNumber)
				.equalToWhenPresent(record::getDeliveryNumber).set(pickupDateStringDate)
				.equalToWhenPresent(record::getPickupDateStringDate).set(pickupNumber)
				.equalToWhenPresent(record::getPickupNumber).set(dateTimePeriod257)
				.equalToWhenPresent(record::getDateTimePeriod257).set(kanbanQrData)
				.equalToWhenPresent(record::getKanbanQrData);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default int updateByPrimaryKey(KnbReadDataTransaction record) {
		return update(c -> c.set(kanbanReadDataType).equalTo(record::getKanbanReadDataType).set(headerOid)
				.equalTo(record::getHeaderOid).set(partyIdSender).equalTo(record::getPartyIdSender).set(placeIdSender)
				.equalTo(record::getPlaceIdSender).set(partyIdReceiver).equalTo(record::getPartyIdReceiver)
				.set(placeIdReceiver).equalTo(record::getPlaceIdReceiver).set(partyIdOb).equalTo(record::getPartyIdOb)
				.set(placeIdOb).equalTo(record::getPlaceIdOb).set(partyIdSt).equalTo(record::getPartyIdSt)
				.set(placeIdSt).equalTo(record::getPlaceIdSt).set(partyIdSf).equalTo(record::getPartyIdSf)
				.set(placeIdSf).equalTo(record::getPlaceIdSf).set(placeOfLoadingId).equalTo(record::getPlaceOfLoadingId)
				.set(placeOfDischargeId).equalTo(record::getPlaceOfDischargeId).set(itemIdPd)
				.equalTo(record::getItemIdPd).set(itemA02).equalTo(record::getItemA02).set(itemA04Desc)
				.equalTo(record::getItemA04Desc).set(itemP08).equalTo(record::getItemP08).set(item67)
				.equalTo(record::getItem67).set(itemE04).equalTo(record::getItemE04).set(itemP05A4)
				.equalTo(record::getItemP05A4).set(perPackageQuantity).equalTo(record::getPerPackageQuantity)
				.set(docRefIdAau).equalTo(record::getDocRefIdAau).set(deliveryDate).equalTo(record::getDeliveryDate)
				.set(deliveryNumber).equalTo(record::getDeliveryNumber).set(pickupDateStringDate)
				.equalTo(record::getPickupDateStringDate).set(pickupNumber).equalTo(record::getPickupNumber)
				.set(dateTimePeriod257).equalTo(record::getDateTimePeriod257).set(kanbanQrData)
				.equalTo(record::getKanbanQrData).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.knb_read_data_transaction")
	default int updateByPrimaryKeySelective(KnbReadDataTransaction record) {
		return update(c -> c.set(kanbanReadDataType).equalToWhenPresent(record::getKanbanReadDataType).set(headerOid)
				.equalToWhenPresent(record::getHeaderOid).set(partyIdSender)
				.equalToWhenPresent(record::getPartyIdSender).set(placeIdSender)
				.equalToWhenPresent(record::getPlaceIdSender).set(partyIdReceiver)
				.equalToWhenPresent(record::getPartyIdReceiver).set(placeIdReceiver)
				.equalToWhenPresent(record::getPlaceIdReceiver).set(partyIdOb).equalToWhenPresent(record::getPartyIdOb)
				.set(placeIdOb).equalToWhenPresent(record::getPlaceIdOb).set(partyIdSt)
				.equalToWhenPresent(record::getPartyIdSt).set(placeIdSt).equalToWhenPresent(record::getPlaceIdSt)
				.set(partyIdSf).equalToWhenPresent(record::getPartyIdSf).set(placeIdSf)
				.equalToWhenPresent(record::getPlaceIdSf).set(placeOfLoadingId)
				.equalToWhenPresent(record::getPlaceOfLoadingId).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(itemIdPd).equalToWhenPresent(record::getItemIdPd)
				.set(itemA02).equalToWhenPresent(record::getItemA02).set(itemA04Desc)
				.equalToWhenPresent(record::getItemA04Desc).set(itemP08).equalToWhenPresent(record::getItemP08)
				.set(item67).equalToWhenPresent(record::getItem67).set(itemE04).equalToWhenPresent(record::getItemE04)
				.set(itemP05A4).equalToWhenPresent(record::getItemP05A4).set(perPackageQuantity)
				.equalToWhenPresent(record::getPerPackageQuantity).set(docRefIdAau)
				.equalToWhenPresent(record::getDocRefIdAau).set(deliveryDate)
				.equalToWhenPresent(record::getDeliveryDate).set(deliveryNumber)
				.equalToWhenPresent(record::getDeliveryNumber).set(pickupDateStringDate)
				.equalToWhenPresent(record::getPickupDateStringDate).set(pickupNumber)
				.equalToWhenPresent(record::getPickupNumber).set(dateTimePeriod257)
				.equalToWhenPresent(record::getDateTimePeriod257).set(kanbanQrData)
				.equalToWhenPresent(record::getKanbanQrData).where(oid, isEqualTo(record::getOid)));
	}
}