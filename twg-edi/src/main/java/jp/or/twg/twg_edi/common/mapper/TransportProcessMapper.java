package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.TransportProcessDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.TransportProcess;
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
public interface TransportProcessMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	BasicColumn[] selectList = BasicColumn.columnList(oid, transportDataType, placeByOid, placeSeOid, placeObOid,
			placeStOid, placeSfOid, partyIdBy, placeIdBy, partyIdSe, placeIdSe, partyIdOb, placeIdOb, partyNameOb,
			placeNameOb, partyIdSt, placeIdSt, partyNameSt, placeNameSt, partyIdSf, placeIdSf, partyNameSf, placeNameSf,
			placeOfDischargeId, placeOfLoadingId, placeOfLoadingName, contactName, deliveryDateStringDate,
			dateTimePeriod2Deljit, docRefIdAaj, docRefIdAau, itemA04Desc, itemA04Note, transportMeansIdentName,
			itemP04L01, itemP04L02, itemP04L03, itemP04L04, docRefIdP02, itemP07, zeroReceive,
			transportSeparateSupplyType, memo, tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId,
			tsLastModifiedDate, tsLastModifiedUserId, tsLastModifiedUserPlaceId, messageTypeCode5);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source Table: public.transport_process")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source Table: public.transport_process")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source Table: public.transport_process")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<TransportProcess> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source Table: public.transport_process")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<TransportProcess> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source Table: public.transport_process")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("TransportProcessResult")
	Optional<TransportProcess> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.525233+09:00", comments = "Source Table: public.transport_process")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "TransportProcessResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "transport_data_type", property = "transportDataType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_by_oid", property = "placeByOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_se_oid", property = "placeSeOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_ob_oid", property = "placeObOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_sf_oid", property = "placeSfOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "party_id_by", property = "partyIdBy", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_by", property = "placeIdBy", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_se", property = "partyIdSe", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_se", property = "placeIdSe", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_ob", property = "partyIdOb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_ob", property = "placeIdOb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_name_ob", property = "partyNameOb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_name_ob", property = "placeNameOb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_st", property = "partyIdSt", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_st", property = "placeIdSt", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_name_st", property = "partyNameSt", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_name_st", property = "placeNameSt", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_sf", property = "partyIdSf", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_sf", property = "placeIdSf", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_name_sf", property = "partyNameSf", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_name_sf", property = "placeNameSf", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_discharge_id", property = "placeOfDischargeId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_loading_id", property = "placeOfLoadingId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_loading_name", property = "placeOfLoadingName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "contact_name", property = "contactName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "delivery_date_string_date", property = "deliveryDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "date_time_period_2_deljit", property = "dateTimePeriod2Deljit", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_id_aaj", property = "docRefIdAaj", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_id_aau", property = "docRefIdAau", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_a04_desc", property = "itemA04Desc", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_a04_note", property = "itemA04Note", jdbcType = JdbcType.VARCHAR),
			@Result(column = "transport_means_ident_name", property = "transportMeansIdentName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p04_l01", property = "itemP04L01", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p04_l02", property = "itemP04L02", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p04_l03", property = "itemP04L03", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p04_l04", property = "itemP04L04", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_id_p02", property = "docRefIdP02", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p07", property = "itemP07", jdbcType = JdbcType.VARCHAR),
			@Result(column = "zero_receive", property = "zeroReceive", jdbcType = JdbcType.CHAR),
			@Result(column = "transport_separate_supply_type", property = "transportSeparateSupplyType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "memo", property = "memo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "message_type_code5", property = "messageTypeCode5", jdbcType = JdbcType.CHAR) })
	List<TransportProcess> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, transportProcess, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, transportProcess, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default int insert(TransportProcess record) {
		return MyBatis3Utils.insert(this::insert, record, transportProcess, c -> c.map(oid).toProperty("oid")
				.map(transportDataType).toProperty("transportDataType").map(placeByOid).toProperty("placeByOid")
				.map(placeSeOid).toProperty("placeSeOid").map(placeObOid).toProperty("placeObOid").map(placeStOid)
				.toProperty("placeStOid").map(placeSfOid).toProperty("placeSfOid").map(partyIdBy)
				.toProperty("partyIdBy").map(placeIdBy).toProperty("placeIdBy").map(partyIdSe).toProperty("partyIdSe")
				.map(placeIdSe).toProperty("placeIdSe").map(partyIdOb).toProperty("partyIdOb").map(placeIdOb)
				.toProperty("placeIdOb").map(partyNameOb).toProperty("partyNameOb").map(placeNameOb)
				.toProperty("placeNameOb").map(partyIdSt).toProperty("partyIdSt").map(placeIdSt).toProperty("placeIdSt")
				.map(partyNameSt).toProperty("partyNameSt").map(placeNameSt).toProperty("placeNameSt").map(partyIdSf)
				.toProperty("partyIdSf").map(placeIdSf).toProperty("placeIdSf").map(partyNameSf)
				.toProperty("partyNameSf").map(placeNameSf).toProperty("placeNameSf").map(placeOfDischargeId)
				.toProperty("placeOfDischargeId").map(placeOfLoadingId).toProperty("placeOfLoadingId")
				.map(placeOfLoadingName).toProperty("placeOfLoadingName").map(contactName).toProperty("contactName")
				.map(deliveryDateStringDate).toProperty("deliveryDateStringDate").map(dateTimePeriod2Deljit)
				.toProperty("dateTimePeriod2Deljit").map(docRefIdAaj).toProperty("docRefIdAaj").map(docRefIdAau)
				.toProperty("docRefIdAau").map(itemA04Desc).toProperty("itemA04Desc").map(itemA04Note)
				.toProperty("itemA04Note").map(transportMeansIdentName).toProperty("transportMeansIdentName")
				.map(itemP04L01).toProperty("itemP04L01").map(itemP04L02).toProperty("itemP04L02").map(itemP04L03)
				.toProperty("itemP04L03").map(itemP04L04).toProperty("itemP04L04").map(docRefIdP02)
				.toProperty("docRefIdP02").map(itemP07).toProperty("itemP07").map(zeroReceive).toProperty("zeroReceive")
				.map(transportSeparateSupplyType).toProperty("transportSeparateSupplyType").map(memo).toProperty("memo")
				.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
				.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId")
				.map(tsLastModifiedDate).toProperty("tsLastModifiedDate").map(tsLastModifiedUserId)
				.toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
				.toProperty("tsLastModifiedUserPlaceId").map(messageTypeCode5).toProperty("messageTypeCode5"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default int insertMultiple(Collection<TransportProcess> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, transportProcess, c -> c.map(oid)
				.toProperty("oid").map(transportDataType).toProperty("transportDataType").map(placeByOid)
				.toProperty("placeByOid").map(placeSeOid).toProperty("placeSeOid").map(placeObOid)
				.toProperty("placeObOid").map(placeStOid).toProperty("placeStOid").map(placeSfOid)
				.toProperty("placeSfOid").map(partyIdBy).toProperty("partyIdBy").map(placeIdBy).toProperty("placeIdBy")
				.map(partyIdSe).toProperty("partyIdSe").map(placeIdSe).toProperty("placeIdSe").map(partyIdOb)
				.toProperty("partyIdOb").map(placeIdOb).toProperty("placeIdOb").map(partyNameOb)
				.toProperty("partyNameOb").map(placeNameOb).toProperty("placeNameOb").map(partyIdSt)
				.toProperty("partyIdSt").map(placeIdSt).toProperty("placeIdSt").map(partyNameSt)
				.toProperty("partyNameSt").map(placeNameSt).toProperty("placeNameSt").map(partyIdSf)
				.toProperty("partyIdSf").map(placeIdSf).toProperty("placeIdSf").map(partyNameSf)
				.toProperty("partyNameSf").map(placeNameSf).toProperty("placeNameSf").map(placeOfDischargeId)
				.toProperty("placeOfDischargeId").map(placeOfLoadingId).toProperty("placeOfLoadingId")
				.map(placeOfLoadingName).toProperty("placeOfLoadingName").map(contactName).toProperty("contactName")
				.map(deliveryDateStringDate).toProperty("deliveryDateStringDate").map(dateTimePeriod2Deljit)
				.toProperty("dateTimePeriod2Deljit").map(docRefIdAaj).toProperty("docRefIdAaj").map(docRefIdAau)
				.toProperty("docRefIdAau").map(itemA04Desc).toProperty("itemA04Desc").map(itemA04Note)
				.toProperty("itemA04Note").map(transportMeansIdentName).toProperty("transportMeansIdentName")
				.map(itemP04L01).toProperty("itemP04L01").map(itemP04L02).toProperty("itemP04L02").map(itemP04L03)
				.toProperty("itemP04L03").map(itemP04L04).toProperty("itemP04L04").map(docRefIdP02)
				.toProperty("docRefIdP02").map(itemP07).toProperty("itemP07").map(zeroReceive).toProperty("zeroReceive")
				.map(transportSeparateSupplyType).toProperty("transportSeparateSupplyType").map(memo).toProperty("memo")
				.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
				.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId")
				.map(tsLastModifiedDate).toProperty("tsLastModifiedDate").map(tsLastModifiedUserId)
				.toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
				.toProperty("tsLastModifiedUserPlaceId").map(messageTypeCode5).toProperty("messageTypeCode5"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default int insertSelective(TransportProcess record) {
		return MyBatis3Utils.insert(this::insert, record, transportProcess, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(transportDataType)
				.toPropertyWhenPresent("transportDataType", record::getTransportDataType).map(placeByOid)
				.toPropertyWhenPresent("placeByOid", record::getPlaceByOid).map(placeSeOid)
				.toPropertyWhenPresent("placeSeOid", record::getPlaceSeOid).map(placeObOid)
				.toPropertyWhenPresent("placeObOid", record::getPlaceObOid).map(placeStOid)
				.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(placeSfOid)
				.toPropertyWhenPresent("placeSfOid", record::getPlaceSfOid).map(partyIdBy)
				.toPropertyWhenPresent("partyIdBy", record::getPartyIdBy).map(placeIdBy)
				.toPropertyWhenPresent("placeIdBy", record::getPlaceIdBy).map(partyIdSe)
				.toPropertyWhenPresent("partyIdSe", record::getPartyIdSe).map(placeIdSe)
				.toPropertyWhenPresent("placeIdSe", record::getPlaceIdSe).map(partyIdOb)
				.toPropertyWhenPresent("partyIdOb", record::getPartyIdOb).map(placeIdOb)
				.toPropertyWhenPresent("placeIdOb", record::getPlaceIdOb).map(partyNameOb)
				.toPropertyWhenPresent("partyNameOb", record::getPartyNameOb).map(placeNameOb)
				.toPropertyWhenPresent("placeNameOb", record::getPlaceNameOb).map(partyIdSt)
				.toPropertyWhenPresent("partyIdSt", record::getPartyIdSt).map(placeIdSt)
				.toPropertyWhenPresent("placeIdSt", record::getPlaceIdSt).map(partyNameSt)
				.toPropertyWhenPresent("partyNameSt", record::getPartyNameSt).map(placeNameSt)
				.toPropertyWhenPresent("placeNameSt", record::getPlaceNameSt).map(partyIdSf)
				.toPropertyWhenPresent("partyIdSf", record::getPartyIdSf).map(placeIdSf)
				.toPropertyWhenPresent("placeIdSf", record::getPlaceIdSf).map(partyNameSf)
				.toPropertyWhenPresent("partyNameSf", record::getPartyNameSf).map(placeNameSf)
				.toPropertyWhenPresent("placeNameSf", record::getPlaceNameSf).map(placeOfDischargeId)
				.toPropertyWhenPresent("placeOfDischargeId", record::getPlaceOfDischargeId).map(placeOfLoadingId)
				.toPropertyWhenPresent("placeOfLoadingId", record::getPlaceOfLoadingId).map(placeOfLoadingName)
				.toPropertyWhenPresent("placeOfLoadingName", record::getPlaceOfLoadingName).map(contactName)
				.toPropertyWhenPresent("contactName", record::getContactName).map(deliveryDateStringDate)
				.toPropertyWhenPresent("deliveryDateStringDate", record::getDeliveryDateStringDate)
				.map(dateTimePeriod2Deljit)
				.toPropertyWhenPresent("dateTimePeriod2Deljit", record::getDateTimePeriod2Deljit).map(docRefIdAaj)
				.toPropertyWhenPresent("docRefIdAaj", record::getDocRefIdAaj).map(docRefIdAau)
				.toPropertyWhenPresent("docRefIdAau", record::getDocRefIdAau).map(itemA04Desc)
				.toPropertyWhenPresent("itemA04Desc", record::getItemA04Desc).map(itemA04Note)
				.toPropertyWhenPresent("itemA04Note", record::getItemA04Note).map(transportMeansIdentName)
				.toPropertyWhenPresent("transportMeansIdentName", record::getTransportMeansIdentName).map(itemP04L01)
				.toPropertyWhenPresent("itemP04L01", record::getItemP04L01).map(itemP04L02)
				.toPropertyWhenPresent("itemP04L02", record::getItemP04L02).map(itemP04L03)
				.toPropertyWhenPresent("itemP04L03", record::getItemP04L03).map(itemP04L04)
				.toPropertyWhenPresent("itemP04L04", record::getItemP04L04).map(docRefIdP02)
				.toPropertyWhenPresent("docRefIdP02", record::getDocRefIdP02).map(itemP07)
				.toPropertyWhenPresent("itemP07", record::getItemP07).map(zeroReceive)
				.toPropertyWhenPresent("zeroReceive", record::getZeroReceive).map(transportSeparateSupplyType)
				.toPropertyWhenPresent("transportSeparateSupplyType", record::getTransportSeparateSupplyType).map(memo)
				.toPropertyWhenPresent("memo", record::getMemo).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId)
				.map(messageTypeCode5).toPropertyWhenPresent("messageTypeCode5", record::getMessageTypeCode5));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default Optional<TransportProcess> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, transportProcess, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default List<TransportProcess> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, transportProcess, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default List<TransportProcess> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, transportProcess, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default Optional<TransportProcess> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, transportProcess, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	static UpdateDSL<UpdateModel> updateAllColumns(TransportProcess record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(transportDataType).equalTo(record::getTransportDataType)
				.set(placeByOid).equalTo(record::getPlaceByOid).set(placeSeOid).equalTo(record::getPlaceSeOid)
				.set(placeObOid).equalTo(record::getPlaceObOid).set(placeStOid).equalTo(record::getPlaceStOid)
				.set(placeSfOid).equalTo(record::getPlaceSfOid).set(partyIdBy).equalTo(record::getPartyIdBy)
				.set(placeIdBy).equalTo(record::getPlaceIdBy).set(partyIdSe).equalTo(record::getPartyIdSe)
				.set(placeIdSe).equalTo(record::getPlaceIdSe).set(partyIdOb).equalTo(record::getPartyIdOb)
				.set(placeIdOb).equalTo(record::getPlaceIdOb).set(partyNameOb).equalTo(record::getPartyNameOb)
				.set(placeNameOb).equalTo(record::getPlaceNameOb).set(partyIdSt).equalTo(record::getPartyIdSt)
				.set(placeIdSt).equalTo(record::getPlaceIdSt).set(partyNameSt).equalTo(record::getPartyNameSt)
				.set(placeNameSt).equalTo(record::getPlaceNameSt).set(partyIdSf).equalTo(record::getPartyIdSf)
				.set(placeIdSf).equalTo(record::getPlaceIdSf).set(partyNameSf).equalTo(record::getPartyNameSf)
				.set(placeNameSf).equalTo(record::getPlaceNameSf).set(placeOfDischargeId)
				.equalTo(record::getPlaceOfDischargeId).set(placeOfLoadingId).equalTo(record::getPlaceOfLoadingId)
				.set(placeOfLoadingName).equalTo(record::getPlaceOfLoadingName).set(contactName)
				.equalTo(record::getContactName).set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate)
				.set(dateTimePeriod2Deljit).equalTo(record::getDateTimePeriod2Deljit).set(docRefIdAaj)
				.equalTo(record::getDocRefIdAaj).set(docRefIdAau).equalTo(record::getDocRefIdAau).set(itemA04Desc)
				.equalTo(record::getItemA04Desc).set(itemA04Note).equalTo(record::getItemA04Note)
				.set(transportMeansIdentName).equalTo(record::getTransportMeansIdentName).set(itemP04L01)
				.equalTo(record::getItemP04L01).set(itemP04L02).equalTo(record::getItemP04L02).set(itemP04L03)
				.equalTo(record::getItemP04L03).set(itemP04L04).equalTo(record::getItemP04L04).set(docRefIdP02)
				.equalTo(record::getDocRefIdP02).set(itemP07).equalTo(record::getItemP07).set(zeroReceive)
				.equalTo(record::getZeroReceive).set(transportSeparateSupplyType)
				.equalTo(record::getTransportSeparateSupplyType).set(memo).equalTo(record::getMemo)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).set(messageTypeCode5)
				.equalTo(record::getMessageTypeCode5);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(TransportProcess record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(transportDataType)
				.equalToWhenPresent(record::getTransportDataType).set(placeByOid)
				.equalToWhenPresent(record::getPlaceByOid).set(placeSeOid).equalToWhenPresent(record::getPlaceSeOid)
				.set(placeObOid).equalToWhenPresent(record::getPlaceObOid).set(placeStOid)
				.equalToWhenPresent(record::getPlaceStOid).set(placeSfOid).equalToWhenPresent(record::getPlaceSfOid)
				.set(partyIdBy).equalToWhenPresent(record::getPartyIdBy).set(placeIdBy)
				.equalToWhenPresent(record::getPlaceIdBy).set(partyIdSe).equalToWhenPresent(record::getPartyIdSe)
				.set(placeIdSe).equalToWhenPresent(record::getPlaceIdSe).set(partyIdOb)
				.equalToWhenPresent(record::getPartyIdOb).set(placeIdOb).equalToWhenPresent(record::getPlaceIdOb)
				.set(partyNameOb).equalToWhenPresent(record::getPartyNameOb).set(placeNameOb)
				.equalToWhenPresent(record::getPlaceNameOb).set(partyIdSt).equalToWhenPresent(record::getPartyIdSt)
				.set(placeIdSt).equalToWhenPresent(record::getPlaceIdSt).set(partyNameSt)
				.equalToWhenPresent(record::getPartyNameSt).set(placeNameSt).equalToWhenPresent(record::getPlaceNameSt)
				.set(partyIdSf).equalToWhenPresent(record::getPartyIdSf).set(placeIdSf)
				.equalToWhenPresent(record::getPlaceIdSf).set(partyNameSf).equalToWhenPresent(record::getPartyNameSf)
				.set(placeNameSf).equalToWhenPresent(record::getPlaceNameSf).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(placeOfLoadingId)
				.equalToWhenPresent(record::getPlaceOfLoadingId).set(placeOfLoadingName)
				.equalToWhenPresent(record::getPlaceOfLoadingName).set(contactName)
				.equalToWhenPresent(record::getContactName).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(dateTimePeriod2Deljit)
				.equalToWhenPresent(record::getDateTimePeriod2Deljit).set(docRefIdAaj)
				.equalToWhenPresent(record::getDocRefIdAaj).set(docRefIdAau).equalToWhenPresent(record::getDocRefIdAau)
				.set(itemA04Desc).equalToWhenPresent(record::getItemA04Desc).set(itemA04Note)
				.equalToWhenPresent(record::getItemA04Note).set(transportMeansIdentName)
				.equalToWhenPresent(record::getTransportMeansIdentName).set(itemP04L01)
				.equalToWhenPresent(record::getItemP04L01).set(itemP04L02).equalToWhenPresent(record::getItemP04L02)
				.set(itemP04L03).equalToWhenPresent(record::getItemP04L03).set(itemP04L04)
				.equalToWhenPresent(record::getItemP04L04).set(docRefIdP02).equalToWhenPresent(record::getDocRefIdP02)
				.set(itemP07).equalToWhenPresent(record::getItemP07).set(zeroReceive)
				.equalToWhenPresent(record::getZeroReceive).set(transportSeparateSupplyType)
				.equalToWhenPresent(record::getTransportSeparateSupplyType).set(memo)
				.equalToWhenPresent(record::getMemo).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).set(messageTypeCode5)
				.equalToWhenPresent(record::getMessageTypeCode5);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default int updateByPrimaryKey(TransportProcess record) {
		return update(c -> c.set(transportDataType).equalTo(record::getTransportDataType).set(placeByOid)
				.equalTo(record::getPlaceByOid).set(placeSeOid).equalTo(record::getPlaceSeOid).set(placeObOid)
				.equalTo(record::getPlaceObOid).set(placeStOid).equalTo(record::getPlaceStOid).set(placeSfOid)
				.equalTo(record::getPlaceSfOid).set(partyIdBy).equalTo(record::getPartyIdBy).set(placeIdBy)
				.equalTo(record::getPlaceIdBy).set(partyIdSe).equalTo(record::getPartyIdSe).set(placeIdSe)
				.equalTo(record::getPlaceIdSe).set(partyIdOb).equalTo(record::getPartyIdOb).set(placeIdOb)
				.equalTo(record::getPlaceIdOb).set(partyNameOb).equalTo(record::getPartyNameOb).set(placeNameOb)
				.equalTo(record::getPlaceNameOb).set(partyIdSt).equalTo(record::getPartyIdSt).set(placeIdSt)
				.equalTo(record::getPlaceIdSt).set(partyNameSt).equalTo(record::getPartyNameSt).set(placeNameSt)
				.equalTo(record::getPlaceNameSt).set(partyIdSf).equalTo(record::getPartyIdSf).set(placeIdSf)
				.equalTo(record::getPlaceIdSf).set(partyNameSf).equalTo(record::getPartyNameSf).set(placeNameSf)
				.equalTo(record::getPlaceNameSf).set(placeOfDischargeId).equalTo(record::getPlaceOfDischargeId)
				.set(placeOfLoadingId).equalTo(record::getPlaceOfLoadingId).set(placeOfLoadingName)
				.equalTo(record::getPlaceOfLoadingName).set(contactName).equalTo(record::getContactName)
				.set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate).set(dateTimePeriod2Deljit)
				.equalTo(record::getDateTimePeriod2Deljit).set(docRefIdAaj).equalTo(record::getDocRefIdAaj)
				.set(docRefIdAau).equalTo(record::getDocRefIdAau).set(itemA04Desc).equalTo(record::getItemA04Desc)
				.set(itemA04Note).equalTo(record::getItemA04Note).set(transportMeansIdentName)
				.equalTo(record::getTransportMeansIdentName).set(itemP04L01).equalTo(record::getItemP04L01)
				.set(itemP04L02).equalTo(record::getItemP04L02).set(itemP04L03).equalTo(record::getItemP04L03)
				.set(itemP04L04).equalTo(record::getItemP04L04).set(docRefIdP02).equalTo(record::getDocRefIdP02)
				.set(itemP07).equalTo(record::getItemP07).set(zeroReceive).equalTo(record::getZeroReceive)
				.set(transportSeparateSupplyType).equalTo(record::getTransportSeparateSupplyType).set(memo)
				.equalTo(record::getMemo).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).set(messageTypeCode5)
				.equalTo(record::getMessageTypeCode5).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5262296+09:00", comments = "Source Table: public.transport_process")
	default int updateByPrimaryKeySelective(TransportProcess record) {
		return update(c -> c.set(transportDataType).equalToWhenPresent(record::getTransportDataType).set(placeByOid)
				.equalToWhenPresent(record::getPlaceByOid).set(placeSeOid).equalToWhenPresent(record::getPlaceSeOid)
				.set(placeObOid).equalToWhenPresent(record::getPlaceObOid).set(placeStOid)
				.equalToWhenPresent(record::getPlaceStOid).set(placeSfOid).equalToWhenPresent(record::getPlaceSfOid)
				.set(partyIdBy).equalToWhenPresent(record::getPartyIdBy).set(placeIdBy)
				.equalToWhenPresent(record::getPlaceIdBy).set(partyIdSe).equalToWhenPresent(record::getPartyIdSe)
				.set(placeIdSe).equalToWhenPresent(record::getPlaceIdSe).set(partyIdOb)
				.equalToWhenPresent(record::getPartyIdOb).set(placeIdOb).equalToWhenPresent(record::getPlaceIdOb)
				.set(partyNameOb).equalToWhenPresent(record::getPartyNameOb).set(placeNameOb)
				.equalToWhenPresent(record::getPlaceNameOb).set(partyIdSt).equalToWhenPresent(record::getPartyIdSt)
				.set(placeIdSt).equalToWhenPresent(record::getPlaceIdSt).set(partyNameSt)
				.equalToWhenPresent(record::getPartyNameSt).set(placeNameSt).equalToWhenPresent(record::getPlaceNameSt)
				.set(partyIdSf).equalToWhenPresent(record::getPartyIdSf).set(placeIdSf)
				.equalToWhenPresent(record::getPlaceIdSf).set(partyNameSf).equalToWhenPresent(record::getPartyNameSf)
				.set(placeNameSf).equalToWhenPresent(record::getPlaceNameSf).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(placeOfLoadingId)
				.equalToWhenPresent(record::getPlaceOfLoadingId).set(placeOfLoadingName)
				.equalToWhenPresent(record::getPlaceOfLoadingName).set(contactName)
				.equalToWhenPresent(record::getContactName).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(dateTimePeriod2Deljit)
				.equalToWhenPresent(record::getDateTimePeriod2Deljit).set(docRefIdAaj)
				.equalToWhenPresent(record::getDocRefIdAaj).set(docRefIdAau).equalToWhenPresent(record::getDocRefIdAau)
				.set(itemA04Desc).equalToWhenPresent(record::getItemA04Desc).set(itemA04Note)
				.equalToWhenPresent(record::getItemA04Note).set(transportMeansIdentName)
				.equalToWhenPresent(record::getTransportMeansIdentName).set(itemP04L01)
				.equalToWhenPresent(record::getItemP04L01).set(itemP04L02).equalToWhenPresent(record::getItemP04L02)
				.set(itemP04L03).equalToWhenPresent(record::getItemP04L03).set(itemP04L04)
				.equalToWhenPresent(record::getItemP04L04).set(docRefIdP02).equalToWhenPresent(record::getDocRefIdP02)
				.set(itemP07).equalToWhenPresent(record::getItemP07).set(zeroReceive)
				.equalToWhenPresent(record::getZeroReceive).set(transportSeparateSupplyType)
				.equalToWhenPresent(record::getTransportSeparateSupplyType).set(memo)
				.equalToWhenPresent(record::getMemo).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).set(messageTypeCode5)
				.equalToWhenPresent(record::getMessageTypeCode5).where(oid, isEqualTo(record::getOid)));
	}
}