package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionFileIoHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionFileIoHistory;
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
public interface OptionFileIoHistoryMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	BasicColumn[] selectList = BasicColumn.columnList(oid, fileIoTypeId, placeOid, fileIoDataOid, threadManagerId,
			acquired, createDataOid, dataSize, deleteFlag, tsRegistererDate, tsRegistererUserId,
			tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionFileIoHistory> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionFileIoHistory> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionFileIoHistoryResult")
	Optional<OptionFileIoHistory> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionFileIoHistoryResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "file_io_type_id", property = "fileIoTypeId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_oid", property = "placeOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "file_io_data_oid", property = "fileIoDataOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "thread_manager_id", property = "threadManagerId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "acquired", property = "acquired", jdbcType = JdbcType.CHAR),
			@Result(column = "create_data_oid", property = "createDataOid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "data_size", property = "dataSize", jdbcType = JdbcType.INTEGER),
			@Result(column = "delete_flag", property = "deleteFlag", jdbcType = JdbcType.CHAR),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionFileIoHistory> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionFileIoHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionFileIoHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default int insert(OptionFileIoHistory record) {
		return MyBatis3Utils.insert(this::insert, record, optionFileIoHistory,
				c -> c.map(oid).toProperty("oid").map(fileIoTypeId).toProperty("fileIoTypeId").map(placeOid)
						.toProperty("placeOid").map(fileIoDataOid).toProperty("fileIoDataOid").map(threadManagerId)
						.toProperty("threadManagerId").map(acquired).toProperty("acquired").map(createDataOid)
						.toProperty("createDataOid").map(dataSize).toProperty("dataSize").map(deleteFlag)
						.toProperty("deleteFlag").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default int insertMultiple(Collection<OptionFileIoHistory> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionFileIoHistory,
				c -> c.map(oid).toProperty("oid").map(fileIoTypeId).toProperty("fileIoTypeId").map(placeOid)
						.toProperty("placeOid").map(fileIoDataOid).toProperty("fileIoDataOid").map(threadManagerId)
						.toProperty("threadManagerId").map(acquired).toProperty("acquired").map(createDataOid)
						.toProperty("createDataOid").map(dataSize).toProperty("dataSize").map(deleteFlag)
						.toProperty("deleteFlag").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default int insertSelective(OptionFileIoHistory record) {
		return MyBatis3Utils.insert(this::insert, record, optionFileIoHistory, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(fileIoTypeId)
				.toPropertyWhenPresent("fileIoTypeId", record::getFileIoTypeId).map(placeOid)
				.toPropertyWhenPresent("placeOid", record::getPlaceOid).map(fileIoDataOid)
				.toPropertyWhenPresent("fileIoDataOid", record::getFileIoDataOid).map(threadManagerId)
				.toPropertyWhenPresent("threadManagerId", record::getThreadManagerId).map(acquired)
				.toPropertyWhenPresent("acquired", record::getAcquired).map(createDataOid)
				.toPropertyWhenPresent("createDataOid", record::getCreateDataOid).map(dataSize)
				.toPropertyWhenPresent("dataSize", record::getDataSize).map(deleteFlag)
				.toPropertyWhenPresent("deleteFlag", record::getDeleteFlag).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default Optional<OptionFileIoHistory> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionFileIoHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default List<OptionFileIoHistory> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionFileIoHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default List<OptionFileIoHistory> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionFileIoHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default Optional<OptionFileIoHistory> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionFileIoHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionFileIoHistory record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(fileIoTypeId).equalTo(record::getFileIoTypeId).set(placeOid)
				.equalTo(record::getPlaceOid).set(fileIoDataOid).equalTo(record::getFileIoDataOid).set(threadManagerId)
				.equalTo(record::getThreadManagerId).set(acquired).equalTo(record::getAcquired).set(createDataOid)
				.equalTo(record::getCreateDataOid).set(dataSize).equalTo(record::getDataSize).set(deleteFlag)
				.equalTo(record::getDeleteFlag).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionFileIoHistory record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(fileIoTypeId)
				.equalToWhenPresent(record::getFileIoTypeId).set(placeOid).equalToWhenPresent(record::getPlaceOid)
				.set(fileIoDataOid).equalToWhenPresent(record::getFileIoDataOid).set(threadManagerId)
				.equalToWhenPresent(record::getThreadManagerId).set(acquired).equalToWhenPresent(record::getAcquired)
				.set(createDataOid).equalToWhenPresent(record::getCreateDataOid).set(dataSize)
				.equalToWhenPresent(record::getDataSize).set(deleteFlag).equalToWhenPresent(record::getDeleteFlag)
				.set(tsRegistererDate).equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default int updateByPrimaryKey(OptionFileIoHistory record) {
		return update(c -> c.set(fileIoTypeId).equalTo(record::getFileIoTypeId).set(placeOid)
				.equalTo(record::getPlaceOid).set(fileIoDataOid).equalTo(record::getFileIoDataOid).set(threadManagerId)
				.equalTo(record::getThreadManagerId).set(acquired).equalTo(record::getAcquired).set(createDataOid)
				.equalTo(record::getCreateDataOid).set(dataSize).equalTo(record::getDataSize).set(deleteFlag)
				.equalTo(record::getDeleteFlag).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	default int updateByPrimaryKeySelective(OptionFileIoHistory record) {
		return update(c -> c.set(fileIoTypeId).equalToWhenPresent(record::getFileIoTypeId).set(placeOid)
				.equalToWhenPresent(record::getPlaceOid).set(fileIoDataOid).equalToWhenPresent(record::getFileIoDataOid)
				.set(threadManagerId).equalToWhenPresent(record::getThreadManagerId).set(acquired)
				.equalToWhenPresent(record::getAcquired).set(createDataOid).equalToWhenPresent(record::getCreateDataOid)
				.set(dataSize).equalToWhenPresent(record::getDataSize).set(deleteFlag)
				.equalToWhenPresent(record::getDeleteFlag).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}