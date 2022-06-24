package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.LockManagerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.LockManager;
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
public interface LockManagerMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	BasicColumn[] selectList = BasicColumn.columnList(oid, ownPlaceOid, threadId, usersOid, lockStatus, startUpTime,
			closeOutTime, memo);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.lock_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<LockManager> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<LockManager> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("LockManagerResult")
	Optional<LockManager> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "LockManagerResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "own_place_oid", property = "ownPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "thread_id", property = "threadId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "users_oid", property = "usersOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "lock_status", property = "lockStatus", jdbcType = JdbcType.CHAR),
			@Result(column = "start_up_time", property = "startUpTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "close_out_time", property = "closeOutTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "memo", property = "memo", jdbcType = JdbcType.VARCHAR) })
	List<LockManager> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, lockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, lockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default int insert(LockManager record) {
		return MyBatis3Utils.insert(this::insert, record, lockManager,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(threadId)
						.toProperty("threadId").map(usersOid).toProperty("usersOid").map(lockStatus)
						.toProperty("lockStatus").map(startUpTime).toProperty("startUpTime").map(closeOutTime)
						.toProperty("closeOutTime").map(memo).toProperty("memo"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default int insertMultiple(Collection<LockManager> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, lockManager,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(threadId)
						.toProperty("threadId").map(usersOid).toProperty("usersOid").map(lockStatus)
						.toProperty("lockStatus").map(startUpTime).toProperty("startUpTime").map(closeOutTime)
						.toProperty("closeOutTime").map(memo).toProperty("memo"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default int insertSelective(LockManager record) {
		return MyBatis3Utils.insert(this::insert, record, lockManager,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(ownPlaceOid)
						.toPropertyWhenPresent("ownPlaceOid", record::getOwnPlaceOid).map(threadId)
						.toPropertyWhenPresent("threadId", record::getThreadId).map(usersOid)
						.toPropertyWhenPresent("usersOid", record::getUsersOid).map(lockStatus)
						.toPropertyWhenPresent("lockStatus", record::getLockStatus).map(startUpTime)
						.toPropertyWhenPresent("startUpTime", record::getStartUpTime).map(closeOutTime)
						.toPropertyWhenPresent("closeOutTime", record::getCloseOutTime).map(memo)
						.toPropertyWhenPresent("memo", record::getMemo));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default Optional<LockManager> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, lockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default List<LockManager> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, lockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default List<LockManager> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, lockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default Optional<LockManager> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, lockManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	static UpdateDSL<UpdateModel> updateAllColumns(LockManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(threadId)
				.equalTo(record::getThreadId).set(usersOid).equalTo(record::getUsersOid).set(lockStatus)
				.equalTo(record::getLockStatus).set(startUpTime).equalTo(record::getStartUpTime).set(closeOutTime)
				.equalTo(record::getCloseOutTime).set(memo).equalTo(record::getMemo);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(LockManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(ownPlaceOid)
				.equalToWhenPresent(record::getOwnPlaceOid).set(threadId).equalToWhenPresent(record::getThreadId)
				.set(usersOid).equalToWhenPresent(record::getUsersOid).set(lockStatus)
				.equalToWhenPresent(record::getLockStatus).set(startUpTime).equalToWhenPresent(record::getStartUpTime)
				.set(closeOutTime).equalToWhenPresent(record::getCloseOutTime).set(memo)
				.equalToWhenPresent(record::getMemo);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default int updateByPrimaryKey(LockManager record) {
		return update(c -> c.set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(threadId).equalTo(record::getThreadId)
				.set(usersOid).equalTo(record::getUsersOid).set(lockStatus).equalTo(record::getLockStatus)
				.set(startUpTime).equalTo(record::getStartUpTime).set(closeOutTime).equalTo(record::getCloseOutTime)
				.set(memo).equalTo(record::getMemo).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5292211+09:00", comments = "Source Table: public.lock_manager")
	default int updateByPrimaryKeySelective(LockManager record) {
		return update(c -> c.set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid).set(threadId)
				.equalToWhenPresent(record::getThreadId).set(usersOid).equalToWhenPresent(record::getUsersOid)
				.set(lockStatus).equalToWhenPresent(record::getLockStatus).set(startUpTime)
				.equalToWhenPresent(record::getStartUpTime).set(closeOutTime)
				.equalToWhenPresent(record::getCloseOutTime).set(memo).equalToWhenPresent(record::getMemo)
				.where(oid, isEqualTo(record::getOid)));
	}
}