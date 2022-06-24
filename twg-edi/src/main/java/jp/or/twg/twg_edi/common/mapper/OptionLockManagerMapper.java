package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionLockManagerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionLockManager;
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
public interface OptionLockManagerMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	BasicColumn[] selectList = BasicColumn.columnList(oid, threadId, usersOid, placeOid, lockStatus, threadClass,
			threadNum, startUpTime, closeOutTime, memo);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionLockManager> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionLockManager> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionLockManagerResult")
	Optional<OptionLockManager> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionLockManagerResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "thread_id", property = "threadId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "users_oid", property = "usersOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_oid", property = "placeOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "lock_status", property = "lockStatus", jdbcType = JdbcType.CHAR),
			@Result(column = "thread_class", property = "threadClass", jdbcType = JdbcType.VARCHAR),
			@Result(column = "thread_num", property = "threadNum", jdbcType = JdbcType.INTEGER),
			@Result(column = "start_up_time", property = "startUpTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "close_out_time", property = "closeOutTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "memo", property = "memo", jdbcType = JdbcType.VARCHAR) })
	List<OptionLockManager> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionLockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionLockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default int insert(OptionLockManager record) {
		return MyBatis3Utils.insert(this::insert, record, optionLockManager,
				c -> c.map(oid).toProperty("oid").map(threadId).toProperty("threadId").map(usersOid)
						.toProperty("usersOid").map(placeOid).toProperty("placeOid").map(lockStatus)
						.toProperty("lockStatus").map(threadClass).toProperty("threadClass").map(threadNum)
						.toProperty("threadNum").map(startUpTime).toProperty("startUpTime").map(closeOutTime)
						.toProperty("closeOutTime").map(memo).toProperty("memo"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default int insertMultiple(Collection<OptionLockManager> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionLockManager,
				c -> c.map(oid).toProperty("oid").map(threadId).toProperty("threadId").map(usersOid)
						.toProperty("usersOid").map(placeOid).toProperty("placeOid").map(lockStatus)
						.toProperty("lockStatus").map(threadClass).toProperty("threadClass").map(threadNum)
						.toProperty("threadNum").map(startUpTime).toProperty("startUpTime").map(closeOutTime)
						.toProperty("closeOutTime").map(memo).toProperty("memo"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default int insertSelective(OptionLockManager record) {
		return MyBatis3Utils.insert(this::insert, record, optionLockManager,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(threadId)
						.toPropertyWhenPresent("threadId", record::getThreadId).map(usersOid)
						.toPropertyWhenPresent("usersOid", record::getUsersOid).map(placeOid)
						.toPropertyWhenPresent("placeOid", record::getPlaceOid).map(lockStatus)
						.toPropertyWhenPresent("lockStatus", record::getLockStatus).map(threadClass)
						.toPropertyWhenPresent("threadClass", record::getThreadClass).map(threadNum)
						.toPropertyWhenPresent("threadNum", record::getThreadNum).map(startUpTime)
						.toPropertyWhenPresent("startUpTime", record::getStartUpTime).map(closeOutTime)
						.toPropertyWhenPresent("closeOutTime", record::getCloseOutTime).map(memo)
						.toPropertyWhenPresent("memo", record::getMemo));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default Optional<OptionLockManager> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionLockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default List<OptionLockManager> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionLockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default List<OptionLockManager> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionLockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default Optional<OptionLockManager> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionLockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionLockManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(threadId).equalTo(record::getThreadId).set(usersOid)
				.equalTo(record::getUsersOid).set(placeOid).equalTo(record::getPlaceOid).set(lockStatus)
				.equalTo(record::getLockStatus).set(threadClass).equalTo(record::getThreadClass).set(threadNum)
				.equalTo(record::getThreadNum).set(startUpTime).equalTo(record::getStartUpTime).set(closeOutTime)
				.equalTo(record::getCloseOutTime).set(memo).equalTo(record::getMemo);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionLockManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(threadId).equalToWhenPresent(record::getThreadId)
				.set(usersOid).equalToWhenPresent(record::getUsersOid).set(placeOid)
				.equalToWhenPresent(record::getPlaceOid).set(lockStatus).equalToWhenPresent(record::getLockStatus)
				.set(threadClass).equalToWhenPresent(record::getThreadClass).set(threadNum)
				.equalToWhenPresent(record::getThreadNum).set(startUpTime).equalToWhenPresent(record::getStartUpTime)
				.set(closeOutTime).equalToWhenPresent(record::getCloseOutTime).set(memo)
				.equalToWhenPresent(record::getMemo);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default int updateByPrimaryKey(OptionLockManager record) {
		return update(c -> c.set(threadId).equalTo(record::getThreadId).set(usersOid).equalTo(record::getUsersOid)
				.set(placeOid).equalTo(record::getPlaceOid).set(lockStatus).equalTo(record::getLockStatus)
				.set(threadClass).equalTo(record::getThreadClass).set(threadNum).equalTo(record::getThreadNum)
				.set(startUpTime).equalTo(record::getStartUpTime).set(closeOutTime).equalTo(record::getCloseOutTime)
				.set(memo).equalTo(record::getMemo).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	default int updateByPrimaryKeySelective(OptionLockManager record) {
		return update(c -> c.set(threadId).equalToWhenPresent(record::getThreadId).set(usersOid)
				.equalToWhenPresent(record::getUsersOid).set(placeOid).equalToWhenPresent(record::getPlaceOid)
				.set(lockStatus).equalToWhenPresent(record::getLockStatus).set(threadClass)
				.equalToWhenPresent(record::getThreadClass).set(threadNum).equalToWhenPresent(record::getThreadNum)
				.set(startUpTime).equalToWhenPresent(record::getStartUpTime).set(closeOutTime)
				.equalToWhenPresent(record::getCloseOutTime).set(memo).equalToWhenPresent(record::getMemo)
				.where(oid, isEqualTo(record::getOid)));
	}
}