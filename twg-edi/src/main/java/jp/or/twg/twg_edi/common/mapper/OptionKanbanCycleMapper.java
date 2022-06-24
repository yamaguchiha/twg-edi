package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionKanbanCycleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionKanbanCycle;
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
public interface OptionKanbanCycleMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	BasicColumn[] selectList = BasicColumn.columnList(oid, placeStOid, placeOfDischargeId, placeSfOid, cycleA, cycleB,
			cycleC, cycleD, optionCalendarOid, lastProcessingDate, lastProcessingNo, lastDeliveryDateStringDate,
			lastShipmentNo, tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate,
			tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionKanbanCycle> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionKanbanCycle> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionKanbanCycleResult")
	Optional<OptionKanbanCycle> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionKanbanCycleResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_of_discharge_id", property = "placeOfDischargeId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_sf_oid", property = "placeSfOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "cycle_a", property = "cycleA", jdbcType = JdbcType.INTEGER),
			@Result(column = "cycle_b", property = "cycleB", jdbcType = JdbcType.INTEGER),
			@Result(column = "cycle_c", property = "cycleC", jdbcType = JdbcType.INTEGER),
			@Result(column = "cycle_d", property = "cycleD", jdbcType = JdbcType.INTEGER),
			@Result(column = "option_calendar_oid", property = "optionCalendarOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "last_processing_date", property = "lastProcessingDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "last_processing_no", property = "lastProcessingNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "last_delivery_date_string_date", property = "lastDeliveryDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "last_shipment_no", property = "lastShipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionKanbanCycle> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionKanbanCycle, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionKanbanCycle, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	default int insert(OptionKanbanCycle record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanCycle,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(placeOfDischargeId)
						.toProperty("placeOfDischargeId").map(placeSfOid).toProperty("placeSfOid").map(cycleA)
						.toProperty("cycleA").map(cycleB).toProperty("cycleB").map(cycleC).toProperty("cycleC")
						.map(cycleD).toProperty("cycleD").map(optionCalendarOid).toProperty("optionCalendarOid")
						.map(lastProcessingDate).toProperty("lastProcessingDate").map(lastProcessingNo)
						.toProperty("lastProcessingNo").map(lastDeliveryDateStringDate)
						.toProperty("lastDeliveryDateStringDate").map(lastShipmentNo).toProperty("lastShipmentNo")
						.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
						.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_kanban_cycle")
	default int insertMultiple(Collection<OptionKanbanCycle> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionKanbanCycle,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(placeOfDischargeId)
						.toProperty("placeOfDischargeId").map(placeSfOid).toProperty("placeSfOid").map(cycleA)
						.toProperty("cycleA").map(cycleB).toProperty("cycleB").map(cycleC).toProperty("cycleC")
						.map(cycleD).toProperty("cycleD").map(optionCalendarOid).toProperty("optionCalendarOid")
						.map(lastProcessingDate).toProperty("lastProcessingDate").map(lastProcessingNo)
						.toProperty("lastProcessingNo").map(lastDeliveryDateStringDate)
						.toProperty("lastDeliveryDateStringDate").map(lastShipmentNo).toProperty("lastShipmentNo")
						.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
						.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	default int insertSelective(OptionKanbanCycle record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanCycle, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(placeStOid)
				.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(placeOfDischargeId)
				.toPropertyWhenPresent("placeOfDischargeId", record::getPlaceOfDischargeId).map(placeSfOid)
				.toPropertyWhenPresent("placeSfOid", record::getPlaceSfOid).map(cycleA)
				.toPropertyWhenPresent("cycleA", record::getCycleA).map(cycleB)
				.toPropertyWhenPresent("cycleB", record::getCycleB).map(cycleC)
				.toPropertyWhenPresent("cycleC", record::getCycleC).map(cycleD)
				.toPropertyWhenPresent("cycleD", record::getCycleD).map(optionCalendarOid)
				.toPropertyWhenPresent("optionCalendarOid", record::getOptionCalendarOid).map(lastProcessingDate)
				.toPropertyWhenPresent("lastProcessingDate", record::getLastProcessingDate).map(lastProcessingNo)
				.toPropertyWhenPresent("lastProcessingNo", record::getLastProcessingNo).map(lastDeliveryDateStringDate)
				.toPropertyWhenPresent("lastDeliveryDateStringDate", record::getLastDeliveryDateStringDate)
				.map(lastShipmentNo).toPropertyWhenPresent("lastShipmentNo", record::getLastShipmentNo)
				.map(tsRegistererDate).toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate)
				.map(tsRegistererUserId).toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId)
				.map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	default Optional<OptionKanbanCycle> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionKanbanCycle, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	default List<OptionKanbanCycle> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionKanbanCycle, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	default List<OptionKanbanCycle> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionKanbanCycle, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	default Optional<OptionKanbanCycle> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionKanbanCycle, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionKanbanCycle record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(placeStOid).equalTo(record::getPlaceStOid)
				.set(placeOfDischargeId).equalTo(record::getPlaceOfDischargeId).set(placeSfOid)
				.equalTo(record::getPlaceSfOid).set(cycleA).equalTo(record::getCycleA).set(cycleB)
				.equalTo(record::getCycleB).set(cycleC).equalTo(record::getCycleC).set(cycleD)
				.equalTo(record::getCycleD).set(optionCalendarOid).equalTo(record::getOptionCalendarOid)
				.set(lastProcessingDate).equalTo(record::getLastProcessingDate).set(lastProcessingNo)
				.equalTo(record::getLastProcessingNo).set(lastDeliveryDateStringDate)
				.equalTo(record::getLastDeliveryDateStringDate).set(lastShipmentNo).equalTo(record::getLastShipmentNo)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionKanbanCycle record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(placeOfDischargeId).equalToWhenPresent(record::getPlaceOfDischargeId).set(placeSfOid)
				.equalToWhenPresent(record::getPlaceSfOid).set(cycleA).equalToWhenPresent(record::getCycleA).set(cycleB)
				.equalToWhenPresent(record::getCycleB).set(cycleC).equalToWhenPresent(record::getCycleC).set(cycleD)
				.equalToWhenPresent(record::getCycleD).set(optionCalendarOid)
				.equalToWhenPresent(record::getOptionCalendarOid).set(lastProcessingDate)
				.equalToWhenPresent(record::getLastProcessingDate).set(lastProcessingNo)
				.equalToWhenPresent(record::getLastProcessingNo).set(lastDeliveryDateStringDate)
				.equalToWhenPresent(record::getLastDeliveryDateStringDate).set(lastShipmentNo)
				.equalToWhenPresent(record::getLastShipmentNo).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	default int updateByPrimaryKey(OptionKanbanCycle record) {
		return update(c -> c.set(placeStOid).equalTo(record::getPlaceStOid).set(placeOfDischargeId)
				.equalTo(record::getPlaceOfDischargeId).set(placeSfOid).equalTo(record::getPlaceSfOid).set(cycleA)
				.equalTo(record::getCycleA).set(cycleB).equalTo(record::getCycleB).set(cycleC)
				.equalTo(record::getCycleC).set(cycleD).equalTo(record::getCycleD).set(optionCalendarOid)
				.equalTo(record::getOptionCalendarOid).set(lastProcessingDate).equalTo(record::getLastProcessingDate)
				.set(lastProcessingNo).equalTo(record::getLastProcessingNo).set(lastDeliveryDateStringDate)
				.equalTo(record::getLastDeliveryDateStringDate).set(lastShipmentNo).equalTo(record::getLastShipmentNo)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.option_kanban_cycle")
	default int updateByPrimaryKeySelective(OptionKanbanCycle record) {
		return update(c -> c.set(placeStOid).equalToWhenPresent(record::getPlaceStOid).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(placeSfOid)
				.equalToWhenPresent(record::getPlaceSfOid).set(cycleA).equalToWhenPresent(record::getCycleA).set(cycleB)
				.equalToWhenPresent(record::getCycleB).set(cycleC).equalToWhenPresent(record::getCycleC).set(cycleD)
				.equalToWhenPresent(record::getCycleD).set(optionCalendarOid)
				.equalToWhenPresent(record::getOptionCalendarOid).set(lastProcessingDate)
				.equalToWhenPresent(record::getLastProcessingDate).set(lastProcessingNo)
				.equalToWhenPresent(record::getLastProcessingNo).set(lastDeliveryDateStringDate)
				.equalToWhenPresent(record::getLastDeliveryDateStringDate).set(lastShipmentNo)
				.equalToWhenPresent(record::getLastShipmentNo).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}