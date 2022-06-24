package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionKanbanReadHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionKanbanReadHistory;
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
public interface OptionKanbanReadHistoryMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	BasicColumn[] selectList = BasicColumn.columnList(oid, placeStOid, terminalNo, readDateStringDate, readCount,
			readStartTime, readEndTime, readSpendTime, updateStartTime, updateEndTime, updateSpendTime, totalQuantity,
			readErrorQuantity, dataErrorQuantity, readErrorRatio, tsRegistererDate, tsRegistererUserId,
			tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionKanbanReadHistory> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionKanbanReadHistory> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionKanbanReadHistoryResult")
	Optional<OptionKanbanReadHistory> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionKanbanReadHistoryResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "terminal_no", property = "terminalNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "read_date_string_date", property = "readDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "read_count", property = "readCount", jdbcType = JdbcType.INTEGER),
			@Result(column = "read_start_time", property = "readStartTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "read_end_time", property = "readEndTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "read_spend_time", property = "readSpendTime", jdbcType = JdbcType.INTEGER),
			@Result(column = "update_start_time", property = "updateStartTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_end_time", property = "updateEndTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_spend_time", property = "updateSpendTime", jdbcType = JdbcType.INTEGER),
			@Result(column = "total_quantity", property = "totalQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "read_error_quantity", property = "readErrorQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "data_error_quantity", property = "dataErrorQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "read_error_ratio", property = "readErrorRatio", jdbcType = JdbcType.NUMERIC),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionKanbanReadHistory> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionKanbanReadHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionKanbanReadHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default int insert(OptionKanbanReadHistory record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanReadHistory,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(terminalNo)
						.toProperty("terminalNo").map(readDateStringDate).toProperty("readDateStringDate")
						.map(readCount).toProperty("readCount").map(readStartTime).toProperty("readStartTime")
						.map(readEndTime).toProperty("readEndTime").map(readSpendTime).toProperty("readSpendTime")
						.map(updateStartTime).toProperty("updateStartTime").map(updateEndTime)
						.toProperty("updateEndTime").map(updateSpendTime).toProperty("updateSpendTime")
						.map(totalQuantity).toProperty("totalQuantity").map(readErrorQuantity)
						.toProperty("readErrorQuantity").map(dataErrorQuantity).toProperty("dataErrorQuantity")
						.map(readErrorRatio).toProperty("readErrorRatio").map(tsRegistererDate)
						.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
						.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
						.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default int insertMultiple(Collection<OptionKanbanReadHistory> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionKanbanReadHistory,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(terminalNo)
						.toProperty("terminalNo").map(readDateStringDate).toProperty("readDateStringDate")
						.map(readCount).toProperty("readCount").map(readStartTime).toProperty("readStartTime")
						.map(readEndTime).toProperty("readEndTime").map(readSpendTime).toProperty("readSpendTime")
						.map(updateStartTime).toProperty("updateStartTime").map(updateEndTime)
						.toProperty("updateEndTime").map(updateSpendTime).toProperty("updateSpendTime")
						.map(totalQuantity).toProperty("totalQuantity").map(readErrorQuantity)
						.toProperty("readErrorQuantity").map(dataErrorQuantity).toProperty("dataErrorQuantity")
						.map(readErrorRatio).toProperty("readErrorRatio").map(tsRegistererDate)
						.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
						.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
						.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default int insertSelective(OptionKanbanReadHistory record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanReadHistory, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(placeStOid)
				.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(terminalNo)
				.toPropertyWhenPresent("terminalNo", record::getTerminalNo).map(readDateStringDate)
				.toPropertyWhenPresent("readDateStringDate", record::getReadDateStringDate).map(readCount)
				.toPropertyWhenPresent("readCount", record::getReadCount).map(readStartTime)
				.toPropertyWhenPresent("readStartTime", record::getReadStartTime).map(readEndTime)
				.toPropertyWhenPresent("readEndTime", record::getReadEndTime).map(readSpendTime)
				.toPropertyWhenPresent("readSpendTime", record::getReadSpendTime).map(updateStartTime)
				.toPropertyWhenPresent("updateStartTime", record::getUpdateStartTime).map(updateEndTime)
				.toPropertyWhenPresent("updateEndTime", record::getUpdateEndTime).map(updateSpendTime)
				.toPropertyWhenPresent("updateSpendTime", record::getUpdateSpendTime).map(totalQuantity)
				.toPropertyWhenPresent("totalQuantity", record::getTotalQuantity).map(readErrorQuantity)
				.toPropertyWhenPresent("readErrorQuantity", record::getReadErrorQuantity).map(dataErrorQuantity)
				.toPropertyWhenPresent("dataErrorQuantity", record::getDataErrorQuantity).map(readErrorRatio)
				.toPropertyWhenPresent("readErrorRatio", record::getReadErrorRatio).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default Optional<OptionKanbanReadHistory> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionKanbanReadHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default List<OptionKanbanReadHistory> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionKanbanReadHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default List<OptionKanbanReadHistory> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionKanbanReadHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default Optional<OptionKanbanReadHistory> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionKanbanReadHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionKanbanReadHistory record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(placeStOid).equalTo(record::getPlaceStOid).set(terminalNo)
				.equalTo(record::getTerminalNo).set(readDateStringDate).equalTo(record::getReadDateStringDate)
				.set(readCount).equalTo(record::getReadCount).set(readStartTime).equalTo(record::getReadStartTime)
				.set(readEndTime).equalTo(record::getReadEndTime).set(readSpendTime).equalTo(record::getReadSpendTime)
				.set(updateStartTime).equalTo(record::getUpdateStartTime).set(updateEndTime)
				.equalTo(record::getUpdateEndTime).set(updateSpendTime).equalTo(record::getUpdateSpendTime)
				.set(totalQuantity).equalTo(record::getTotalQuantity).set(readErrorQuantity)
				.equalTo(record::getReadErrorQuantity).set(dataErrorQuantity).equalTo(record::getDataErrorQuantity)
				.set(readErrorRatio).equalTo(record::getReadErrorRatio).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionKanbanReadHistory record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(terminalNo).equalToWhenPresent(record::getTerminalNo).set(readDateStringDate)
				.equalToWhenPresent(record::getReadDateStringDate).set(readCount)
				.equalToWhenPresent(record::getReadCount).set(readStartTime)
				.equalToWhenPresent(record::getReadStartTime).set(readEndTime)
				.equalToWhenPresent(record::getReadEndTime).set(readSpendTime)
				.equalToWhenPresent(record::getReadSpendTime).set(updateStartTime)
				.equalToWhenPresent(record::getUpdateStartTime).set(updateEndTime)
				.equalToWhenPresent(record::getUpdateEndTime).set(updateSpendTime)
				.equalToWhenPresent(record::getUpdateSpendTime).set(totalQuantity)
				.equalToWhenPresent(record::getTotalQuantity).set(readErrorQuantity)
				.equalToWhenPresent(record::getReadErrorQuantity).set(dataErrorQuantity)
				.equalToWhenPresent(record::getDataErrorQuantity).set(readErrorRatio)
				.equalToWhenPresent(record::getReadErrorRatio).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default int updateByPrimaryKey(OptionKanbanReadHistory record) {
		return update(c -> c.set(placeStOid).equalTo(record::getPlaceStOid).set(terminalNo)
				.equalTo(record::getTerminalNo).set(readDateStringDate).equalTo(record::getReadDateStringDate)
				.set(readCount).equalTo(record::getReadCount).set(readStartTime).equalTo(record::getReadStartTime)
				.set(readEndTime).equalTo(record::getReadEndTime).set(readSpendTime).equalTo(record::getReadSpendTime)
				.set(updateStartTime).equalTo(record::getUpdateStartTime).set(updateEndTime)
				.equalTo(record::getUpdateEndTime).set(updateSpendTime).equalTo(record::getUpdateSpendTime)
				.set(totalQuantity).equalTo(record::getTotalQuantity).set(readErrorQuantity)
				.equalTo(record::getReadErrorQuantity).set(dataErrorQuantity).equalTo(record::getDataErrorQuantity)
				.set(readErrorRatio).equalTo(record::getReadErrorRatio).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	default int updateByPrimaryKeySelective(OptionKanbanReadHistory record) {
		return update(c -> c.set(placeStOid).equalToWhenPresent(record::getPlaceStOid).set(terminalNo)
				.equalToWhenPresent(record::getTerminalNo).set(readDateStringDate)
				.equalToWhenPresent(record::getReadDateStringDate).set(readCount)
				.equalToWhenPresent(record::getReadCount).set(readStartTime)
				.equalToWhenPresent(record::getReadStartTime).set(readEndTime)
				.equalToWhenPresent(record::getReadEndTime).set(readSpendTime)
				.equalToWhenPresent(record::getReadSpendTime).set(updateStartTime)
				.equalToWhenPresent(record::getUpdateStartTime).set(updateEndTime)
				.equalToWhenPresent(record::getUpdateEndTime).set(updateSpendTime)
				.equalToWhenPresent(record::getUpdateSpendTime).set(totalQuantity)
				.equalToWhenPresent(record::getTotalQuantity).set(readErrorQuantity)
				.equalToWhenPresent(record::getReadErrorQuantity).set(dataErrorQuantity)
				.equalToWhenPresent(record::getDataErrorQuantity).set(readErrorRatio)
				.equalToWhenPresent(record::getReadErrorRatio).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}