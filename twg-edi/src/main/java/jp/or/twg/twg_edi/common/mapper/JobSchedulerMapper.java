package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.JobSchedulerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.JobScheduler;
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
public interface JobSchedulerMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	BasicColumn[] selectList = BasicColumn.columnList(id, ownPlaceOid, jobCategory, schedule, comment, parameter, valid,
			tsRegistererDate, tsLastModifiedDate);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<JobScheduler> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<JobScheduler> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("JobSchedulerResult")
	Optional<JobScheduler> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "JobSchedulerResult", value = {
			@Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "own_place_oid", property = "ownPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "job_category", property = "jobCategory", jdbcType = JdbcType.VARCHAR),
			@Result(column = "schedule", property = "schedule", jdbcType = JdbcType.VARCHAR),
			@Result(column = "comment", property = "comment", jdbcType = JdbcType.VARCHAR),
			@Result(column = "parameter", property = "parameter", jdbcType = JdbcType.VARCHAR),
			@Result(column = "valid", property = "valid", jdbcType = JdbcType.CHAR),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP) })
	List<JobScheduler> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, jobScheduler, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, jobScheduler, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default int deleteByPrimaryKey(Long id_) {
		return delete(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default int insert(JobScheduler record) {
		return MyBatis3Utils.insert(this::insert, record, jobScheduler,
				c -> c.map(id).toProperty("id").map(ownPlaceOid).toProperty("ownPlaceOid").map(jobCategory)
						.toProperty("jobCategory").map(schedule).toProperty("schedule").map(comment)
						.toProperty("comment").map(parameter).toProperty("parameter").map(valid).toProperty("valid")
						.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default int insertMultiple(Collection<JobScheduler> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, jobScheduler,
				c -> c.map(id).toProperty("id").map(ownPlaceOid).toProperty("ownPlaceOid").map(jobCategory)
						.toProperty("jobCategory").map(schedule).toProperty("schedule").map(comment)
						.toProperty("comment").map(parameter).toProperty("parameter").map(valid).toProperty("valid")
						.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default int insertSelective(JobScheduler record) {
		return MyBatis3Utils.insert(this::insert, record, jobScheduler,
				c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(ownPlaceOid)
						.toPropertyWhenPresent("ownPlaceOid", record::getOwnPlaceOid).map(jobCategory)
						.toPropertyWhenPresent("jobCategory", record::getJobCategory).map(schedule)
						.toPropertyWhenPresent("schedule", record::getSchedule).map(comment)
						.toPropertyWhenPresent("comment", record::getComment).map(parameter)
						.toPropertyWhenPresent("parameter", record::getParameter).map(valid)
						.toPropertyWhenPresent("valid", record::getValid).map(tsRegistererDate)
						.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsLastModifiedDate)
						.toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default Optional<JobScheduler> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, jobScheduler, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default List<JobScheduler> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, jobScheduler, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default List<JobScheduler> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, jobScheduler, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default Optional<JobScheduler> selectByPrimaryKey(Long id_) {
		return selectOne(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, jobScheduler, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	static UpdateDSL<UpdateModel> updateAllColumns(JobScheduler record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalTo(record::getId).set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(jobCategory)
				.equalTo(record::getJobCategory).set(schedule).equalTo(record::getSchedule).set(comment)
				.equalTo(record::getComment).set(parameter).equalTo(record::getParameter).set(valid)
				.equalTo(record::getValid).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsLastModifiedDate).equalTo(record::getTsLastModifiedDate);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(JobScheduler record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalToWhenPresent(record::getId).set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid)
				.set(jobCategory).equalToWhenPresent(record::getJobCategory).set(schedule)
				.equalToWhenPresent(record::getSchedule).set(comment).equalToWhenPresent(record::getComment)
				.set(parameter).equalToWhenPresent(record::getParameter).set(valid).equalToWhenPresent(record::getValid)
				.set(tsRegistererDate).equalToWhenPresent(record::getTsRegistererDate).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default int updateByPrimaryKey(JobScheduler record) {
		return update(c -> c.set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(jobCategory)
				.equalTo(record::getJobCategory).set(schedule).equalTo(record::getSchedule).set(comment)
				.equalTo(record::getComment).set(parameter).equalTo(record::getParameter).set(valid)
				.equalTo(record::getValid).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsLastModifiedDate).equalTo(record::getTsLastModifiedDate).where(id, isEqualTo(record::getId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	default int updateByPrimaryKeySelective(JobScheduler record) {
		return update(c -> c.set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid).set(jobCategory)
				.equalToWhenPresent(record::getJobCategory).set(schedule).equalToWhenPresent(record::getSchedule)
				.set(comment).equalToWhenPresent(record::getComment).set(parameter)
				.equalToWhenPresent(record::getParameter).set(valid).equalToWhenPresent(record::getValid)
				.set(tsRegistererDate).equalToWhenPresent(record::getTsRegistererDate).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).where(id, isEqualTo(record::getId)));
	}
}