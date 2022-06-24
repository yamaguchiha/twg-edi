package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.ThreadManagerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.ThreadManager;
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
public interface ThreadManagerMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	BasicColumn[] selectList = BasicColumn.columnList(id, ownPlaceOid, threadStatus, threadCategory, usersOid,
			userPlaceOid, startUpTime, closeOutTime, errorMessage, memo);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<ThreadManager> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<ThreadManager> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("ThreadManagerResult")
	Optional<ThreadManager> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "ThreadManagerResult", value = {
			@Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "own_place_oid", property = "ownPlaceOid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "thread_status", property = "threadStatus", jdbcType = JdbcType.VARCHAR),
			@Result(column = "thread_category", property = "threadCategory", jdbcType = JdbcType.VARCHAR),
			@Result(column = "users_oid", property = "usersOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "user_place_oid", property = "userPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "start_up_time", property = "startUpTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "close_out_time", property = "closeOutTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "error_message", property = "errorMessage", jdbcType = JdbcType.VARCHAR),
			@Result(column = "memo", property = "memo", jdbcType = JdbcType.VARCHAR) })
	List<ThreadManager> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, threadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, threadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default int deleteByPrimaryKey(String id_, Long ownPlaceOid_) {
		return delete(c -> c.where(id, isEqualTo(id_)).and(ownPlaceOid, isEqualTo(ownPlaceOid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default int insert(ThreadManager record) {
		return MyBatis3Utils.insert(this::insert, record, threadManager,
				c -> c.map(id).toProperty("id").map(ownPlaceOid).toProperty("ownPlaceOid").map(threadStatus)
						.toProperty("threadStatus").map(threadCategory).toProperty("threadCategory").map(usersOid)
						.toProperty("usersOid").map(userPlaceOid).toProperty("userPlaceOid").map(startUpTime)
						.toProperty("startUpTime").map(closeOutTime).toProperty("closeOutTime").map(errorMessage)
						.toProperty("errorMessage").map(memo).toProperty("memo"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default int insertMultiple(Collection<ThreadManager> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, threadManager,
				c -> c.map(id).toProperty("id").map(ownPlaceOid).toProperty("ownPlaceOid").map(threadStatus)
						.toProperty("threadStatus").map(threadCategory).toProperty("threadCategory").map(usersOid)
						.toProperty("usersOid").map(userPlaceOid).toProperty("userPlaceOid").map(startUpTime)
						.toProperty("startUpTime").map(closeOutTime).toProperty("closeOutTime").map(errorMessage)
						.toProperty("errorMessage").map(memo).toProperty("memo"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default int insertSelective(ThreadManager record) {
		return MyBatis3Utils.insert(this::insert, record, threadManager,
				c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(ownPlaceOid)
						.toPropertyWhenPresent("ownPlaceOid", record::getOwnPlaceOid).map(threadStatus)
						.toPropertyWhenPresent("threadStatus", record::getThreadStatus).map(threadCategory)
						.toPropertyWhenPresent("threadCategory", record::getThreadCategory).map(usersOid)
						.toPropertyWhenPresent("usersOid", record::getUsersOid).map(userPlaceOid)
						.toPropertyWhenPresent("userPlaceOid", record::getUserPlaceOid).map(startUpTime)
						.toPropertyWhenPresent("startUpTime", record::getStartUpTime).map(closeOutTime)
						.toPropertyWhenPresent("closeOutTime", record::getCloseOutTime).map(errorMessage)
						.toPropertyWhenPresent("errorMessage", record::getErrorMessage).map(memo)
						.toPropertyWhenPresent("memo", record::getMemo));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default Optional<ThreadManager> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, threadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default List<ThreadManager> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, threadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default List<ThreadManager> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, threadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default Optional<ThreadManager> selectByPrimaryKey(String id_, Long ownPlaceOid_) {
		return selectOne(c -> c.where(id, isEqualTo(id_)).and(ownPlaceOid, isEqualTo(ownPlaceOid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, threadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	static UpdateDSL<UpdateModel> updateAllColumns(ThreadManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalTo(record::getId).set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(threadStatus)
				.equalTo(record::getThreadStatus).set(threadCategory).equalTo(record::getThreadCategory).set(usersOid)
				.equalTo(record::getUsersOid).set(userPlaceOid).equalTo(record::getUserPlaceOid).set(startUpTime)
				.equalTo(record::getStartUpTime).set(closeOutTime).equalTo(record::getCloseOutTime).set(errorMessage)
				.equalTo(record::getErrorMessage).set(memo).equalTo(record::getMemo);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(ThreadManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalToWhenPresent(record::getId).set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid)
				.set(threadStatus).equalToWhenPresent(record::getThreadStatus).set(threadCategory)
				.equalToWhenPresent(record::getThreadCategory).set(usersOid).equalToWhenPresent(record::getUsersOid)
				.set(userPlaceOid).equalToWhenPresent(record::getUserPlaceOid).set(startUpTime)
				.equalToWhenPresent(record::getStartUpTime).set(closeOutTime)
				.equalToWhenPresent(record::getCloseOutTime).set(errorMessage)
				.equalToWhenPresent(record::getErrorMessage).set(memo).equalToWhenPresent(record::getMemo);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default int updateByPrimaryKey(ThreadManager record) {
		return update(c -> c.set(threadStatus).equalTo(record::getThreadStatus).set(threadCategory)
				.equalTo(record::getThreadCategory).set(usersOid).equalTo(record::getUsersOid).set(userPlaceOid)
				.equalTo(record::getUserPlaceOid).set(startUpTime).equalTo(record::getStartUpTime).set(closeOutTime)
				.equalTo(record::getCloseOutTime).set(errorMessage).equalTo(record::getErrorMessage).set(memo)
				.equalTo(record::getMemo).where(id, isEqualTo(record::getId))
				.and(ownPlaceOid, isEqualTo(record::getOwnPlaceOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	default int updateByPrimaryKeySelective(ThreadManager record) {
		return update(c -> c.set(threadStatus).equalToWhenPresent(record::getThreadStatus).set(threadCategory)
				.equalToWhenPresent(record::getThreadCategory).set(usersOid).equalToWhenPresent(record::getUsersOid)
				.set(userPlaceOid).equalToWhenPresent(record::getUserPlaceOid).set(startUpTime)
				.equalToWhenPresent(record::getStartUpTime).set(closeOutTime)
				.equalToWhenPresent(record::getCloseOutTime).set(errorMessage)
				.equalToWhenPresent(record::getErrorMessage).set(memo).equalToWhenPresent(record::getMemo)
				.where(id, isEqualTo(record::getId)).and(ownPlaceOid, isEqualTo(record::getOwnPlaceOid)));
	}
}