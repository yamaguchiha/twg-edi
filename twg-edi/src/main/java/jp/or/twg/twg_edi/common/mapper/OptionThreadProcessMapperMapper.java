package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionThreadProcessMapperDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionThreadProcessMapper;
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
public interface OptionThreadProcessMapperMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	BasicColumn[] selectList = BasicColumn.columnList(oid, threadId, processOid, tsRegistererDate, tsRegistererUserId,
			tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionThreadProcessMapper> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionThreadProcessMapper> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionThreadProcessMapperResult")
	Optional<OptionThreadProcessMapper> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionThreadProcessMapperResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "thread_id", property = "threadId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "process_oid", property = "processOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionThreadProcessMapper> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionThreadProcessMapper, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionThreadProcessMapper, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default int insert(OptionThreadProcessMapper record) {
		return MyBatis3Utils.insert(this::insert, record, optionThreadProcessMapper,
				c -> c.map(oid).toProperty("oid").map(threadId).toProperty("threadId").map(processOid)
						.toProperty("processOid").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default int insertMultiple(Collection<OptionThreadProcessMapper> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionThreadProcessMapper,
				c -> c.map(oid).toProperty("oid").map(threadId).toProperty("threadId").map(processOid)
						.toProperty("processOid").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default int insertSelective(OptionThreadProcessMapper record) {
		return MyBatis3Utils.insert(this::insert, record, optionThreadProcessMapper, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(threadId)
				.toPropertyWhenPresent("threadId", record::getThreadId).map(processOid)
				.toPropertyWhenPresent("processOid", record::getProcessOid).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default Optional<OptionThreadProcessMapper> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionThreadProcessMapper, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default List<OptionThreadProcessMapper> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionThreadProcessMapper, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default List<OptionThreadProcessMapper> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionThreadProcessMapper, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default Optional<OptionThreadProcessMapper> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionThreadProcessMapper, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionThreadProcessMapper record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(threadId).equalTo(record::getThreadId).set(processOid)
				.equalTo(record::getProcessOid).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionThreadProcessMapper record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(threadId).equalToWhenPresent(record::getThreadId)
				.set(processOid).equalToWhenPresent(record::getProcessOid).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default int updateByPrimaryKey(OptionThreadProcessMapper record) {
		return update(c -> c.set(threadId).equalTo(record::getThreadId).set(processOid).equalTo(record::getProcessOid)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.option_thread_process_mapper")
	default int updateByPrimaryKeySelective(OptionThreadProcessMapper record) {
		return update(c -> c.set(threadId).equalToWhenPresent(record::getThreadId).set(processOid)
				.equalToWhenPresent(record::getProcessOid).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}