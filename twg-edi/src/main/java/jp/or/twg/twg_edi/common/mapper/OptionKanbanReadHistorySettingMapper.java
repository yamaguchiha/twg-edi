package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionKanbanReadHistorySettingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionKanbanReadHistorySetting;
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
public interface OptionKanbanReadHistorySettingMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	BasicColumn[] selectList = BasicColumn.columnList(oid, kanbanReadHistoryOid, deliveryDateStringDate, shipmentNo,
			docRefIdAau, partyIdSt, placeIdSt, placeOfDischargeId, partyIdSf, placeIdSf, itemIdPd, itemE18, branchNo,
			readStatus, readDateTime, tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate,
			tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionKanbanReadHistorySetting> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionKanbanReadHistorySetting> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionKanbanReadHistorySettingResult")
	Optional<OptionKanbanReadHistorySetting> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionKanbanReadHistorySettingResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "kanban_read_history_oid", property = "kanbanReadHistoryOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "delivery_date_string_date", property = "deliveryDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "shipment_no", property = "shipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "doc_ref_id_aau", property = "docRefIdAau", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_st", property = "partyIdSt", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_st", property = "placeIdSt", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_discharge_id", property = "placeOfDischargeId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_sf", property = "partyIdSf", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_sf", property = "placeIdSf", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_id_pd", property = "itemIdPd", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_e18", property = "itemE18", jdbcType = JdbcType.VARCHAR),
			@Result(column = "branch_no", property = "branchNo", jdbcType = JdbcType.BIGINT),
			@Result(column = "read_status", property = "readStatus", jdbcType = JdbcType.INTEGER),
			@Result(column = "read_date_time", property = "readDateTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionKanbanReadHistorySetting> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionKanbanReadHistorySetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionKanbanReadHistorySetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default int insert(OptionKanbanReadHistorySetting record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanReadHistorySetting,
				c -> c.map(oid).toProperty("oid").map(kanbanReadHistoryOid).toProperty("kanbanReadHistoryOid")
						.map(deliveryDateStringDate).toProperty("deliveryDateStringDate").map(shipmentNo)
						.toProperty("shipmentNo").map(docRefIdAau).toProperty("docRefIdAau").map(partyIdSt)
						.toProperty("partyIdSt").map(placeIdSt).toProperty("placeIdSt").map(placeOfDischargeId)
						.toProperty("placeOfDischargeId").map(partyIdSf).toProperty("partyIdSf").map(placeIdSf)
						.toProperty("placeIdSf").map(itemIdPd).toProperty("itemIdPd").map(itemE18).toProperty("itemE18")
						.map(branchNo).toProperty("branchNo").map(readStatus).toProperty("readStatus").map(readDateTime)
						.toProperty("readDateTime").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default int insertMultiple(Collection<OptionKanbanReadHistorySetting> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionKanbanReadHistorySetting,
				c -> c.map(oid).toProperty("oid").map(kanbanReadHistoryOid).toProperty("kanbanReadHistoryOid")
						.map(deliveryDateStringDate).toProperty("deliveryDateStringDate").map(shipmentNo)
						.toProperty("shipmentNo").map(docRefIdAau).toProperty("docRefIdAau").map(partyIdSt)
						.toProperty("partyIdSt").map(placeIdSt).toProperty("placeIdSt").map(placeOfDischargeId)
						.toProperty("placeOfDischargeId").map(partyIdSf).toProperty("partyIdSf").map(placeIdSf)
						.toProperty("placeIdSf").map(itemIdPd).toProperty("itemIdPd").map(itemE18).toProperty("itemE18")
						.map(branchNo).toProperty("branchNo").map(readStatus).toProperty("readStatus").map(readDateTime)
						.toProperty("readDateTime").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default int insertSelective(OptionKanbanReadHistorySetting record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanReadHistorySetting, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(kanbanReadHistoryOid)
				.toPropertyWhenPresent("kanbanReadHistoryOid", record::getKanbanReadHistoryOid)
				.map(deliveryDateStringDate)
				.toPropertyWhenPresent("deliveryDateStringDate", record::getDeliveryDateStringDate).map(shipmentNo)
				.toPropertyWhenPresent("shipmentNo", record::getShipmentNo).map(docRefIdAau)
				.toPropertyWhenPresent("docRefIdAau", record::getDocRefIdAau).map(partyIdSt)
				.toPropertyWhenPresent("partyIdSt", record::getPartyIdSt).map(placeIdSt)
				.toPropertyWhenPresent("placeIdSt", record::getPlaceIdSt).map(placeOfDischargeId)
				.toPropertyWhenPresent("placeOfDischargeId", record::getPlaceOfDischargeId).map(partyIdSf)
				.toPropertyWhenPresent("partyIdSf", record::getPartyIdSf).map(placeIdSf)
				.toPropertyWhenPresent("placeIdSf", record::getPlaceIdSf).map(itemIdPd)
				.toPropertyWhenPresent("itemIdPd", record::getItemIdPd).map(itemE18)
				.toPropertyWhenPresent("itemE18", record::getItemE18).map(branchNo)
				.toPropertyWhenPresent("branchNo", record::getBranchNo).map(readStatus)
				.toPropertyWhenPresent("readStatus", record::getReadStatus).map(readDateTime)
				.toPropertyWhenPresent("readDateTime", record::getReadDateTime).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default Optional<OptionKanbanReadHistorySetting> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionKanbanReadHistorySetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default List<OptionKanbanReadHistorySetting> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionKanbanReadHistorySetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default List<OptionKanbanReadHistorySetting> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionKanbanReadHistorySetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default Optional<OptionKanbanReadHistorySetting> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionKanbanReadHistorySetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionKanbanReadHistorySetting record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(kanbanReadHistoryOid).equalTo(record::getKanbanReadHistoryOid)
				.set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate).set(shipmentNo)
				.equalTo(record::getShipmentNo).set(docRefIdAau).equalTo(record::getDocRefIdAau).set(partyIdSt)
				.equalTo(record::getPartyIdSt).set(placeIdSt).equalTo(record::getPlaceIdSt).set(placeOfDischargeId)
				.equalTo(record::getPlaceOfDischargeId).set(partyIdSf).equalTo(record::getPartyIdSf).set(placeIdSf)
				.equalTo(record::getPlaceIdSf).set(itemIdPd).equalTo(record::getItemIdPd).set(itemE18)
				.equalTo(record::getItemE18).set(branchNo).equalTo(record::getBranchNo).set(readStatus)
				.equalTo(record::getReadStatus).set(readDateTime).equalTo(record::getReadDateTime).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionKanbanReadHistorySetting record,
			UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(kanbanReadHistoryOid)
				.equalToWhenPresent(record::getKanbanReadHistoryOid).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(shipmentNo)
				.equalToWhenPresent(record::getShipmentNo).set(docRefIdAau).equalToWhenPresent(record::getDocRefIdAau)
				.set(partyIdSt).equalToWhenPresent(record::getPartyIdSt).set(placeIdSt)
				.equalToWhenPresent(record::getPlaceIdSt).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(partyIdSf)
				.equalToWhenPresent(record::getPartyIdSf).set(placeIdSf).equalToWhenPresent(record::getPlaceIdSf)
				.set(itemIdPd).equalToWhenPresent(record::getItemIdPd).set(itemE18)
				.equalToWhenPresent(record::getItemE18).set(branchNo).equalToWhenPresent(record::getBranchNo)
				.set(readStatus).equalToWhenPresent(record::getReadStatus).set(readDateTime)
				.equalToWhenPresent(record::getReadDateTime).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default int updateByPrimaryKey(OptionKanbanReadHistorySetting record) {
		return update(c -> c.set(kanbanReadHistoryOid).equalTo(record::getKanbanReadHistoryOid)
				.set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate).set(shipmentNo)
				.equalTo(record::getShipmentNo).set(docRefIdAau).equalTo(record::getDocRefIdAau).set(partyIdSt)
				.equalTo(record::getPartyIdSt).set(placeIdSt).equalTo(record::getPlaceIdSt).set(placeOfDischargeId)
				.equalTo(record::getPlaceOfDischargeId).set(partyIdSf).equalTo(record::getPartyIdSf).set(placeIdSf)
				.equalTo(record::getPlaceIdSf).set(itemIdPd).equalTo(record::getItemIdPd).set(itemE18)
				.equalTo(record::getItemE18).set(branchNo).equalTo(record::getBranchNo).set(readStatus)
				.equalTo(record::getReadStatus).set(readDateTime).equalTo(record::getReadDateTime).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5232372+09:00", comments = "Source Table: public.option_kanban_read_history_setting")
	default int updateByPrimaryKeySelective(OptionKanbanReadHistorySetting record) {
		return update(c -> c.set(kanbanReadHistoryOid).equalToWhenPresent(record::getKanbanReadHistoryOid)
				.set(deliveryDateStringDate).equalToWhenPresent(record::getDeliveryDateStringDate).set(shipmentNo)
				.equalToWhenPresent(record::getShipmentNo).set(docRefIdAau).equalToWhenPresent(record::getDocRefIdAau)
				.set(partyIdSt).equalToWhenPresent(record::getPartyIdSt).set(placeIdSt)
				.equalToWhenPresent(record::getPlaceIdSt).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(partyIdSf)
				.equalToWhenPresent(record::getPartyIdSf).set(placeIdSf).equalToWhenPresent(record::getPlaceIdSf)
				.set(itemIdPd).equalToWhenPresent(record::getItemIdPd).set(itemE18)
				.equalToWhenPresent(record::getItemE18).set(branchNo).equalToWhenPresent(record::getBranchNo)
				.set(readStatus).equalToWhenPresent(record::getReadStatus).set(readDateTime)
				.equalToWhenPresent(record::getReadDateTime).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}