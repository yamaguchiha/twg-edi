package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.SystemConfigDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.SystemConfig;
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
public interface SystemConfigMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	BasicColumn[] selectList = BasicColumn.columnList(oid, ownPlaceOid, category, parameter, memo);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<SystemConfig> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<SystemConfig> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("SystemConfigResult")
	Optional<SystemConfig> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "SystemConfigResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "own_place_oid", property = "ownPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "category", property = "category", jdbcType = JdbcType.VARCHAR),
			@Result(column = "parameter", property = "parameter", jdbcType = JdbcType.VARCHAR),
			@Result(column = "memo", property = "memo", jdbcType = JdbcType.VARCHAR) })
	List<SystemConfig> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, systemConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, systemConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default int insert(SystemConfig record) {
		return MyBatis3Utils.insert(this::insert, record, systemConfig,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(category)
						.toProperty("category").map(parameter).toProperty("parameter").map(memo).toProperty("memo"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default int insertMultiple(Collection<SystemConfig> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, systemConfig,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(category)
						.toProperty("category").map(parameter).toProperty("parameter").map(memo).toProperty("memo"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default int insertSelective(SystemConfig record) {
		return MyBatis3Utils.insert(this::insert, record, systemConfig,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(ownPlaceOid)
						.toPropertyWhenPresent("ownPlaceOid", record::getOwnPlaceOid).map(category)
						.toPropertyWhenPresent("category", record::getCategory).map(parameter)
						.toPropertyWhenPresent("parameter", record::getParameter).map(memo)
						.toPropertyWhenPresent("memo", record::getMemo));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default Optional<SystemConfig> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, systemConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default List<SystemConfig> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, systemConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default List<SystemConfig> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, systemConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default Optional<SystemConfig> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, systemConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	static UpdateDSL<UpdateModel> updateAllColumns(SystemConfig record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(category)
				.equalTo(record::getCategory).set(parameter).equalTo(record::getParameter).set(memo)
				.equalTo(record::getMemo);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(SystemConfig record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(ownPlaceOid)
				.equalToWhenPresent(record::getOwnPlaceOid).set(category).equalToWhenPresent(record::getCategory)
				.set(parameter).equalToWhenPresent(record::getParameter).set(memo).equalToWhenPresent(record::getMemo);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	default int updateByPrimaryKey(SystemConfig record) {
		return update(c -> c.set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(category).equalTo(record::getCategory)
				.set(parameter).equalTo(record::getParameter).set(memo).equalTo(record::getMemo)
				.where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source Table: public.system_config")
	default int updateByPrimaryKeySelective(SystemConfig record) {
		return update(c -> c.set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid).set(category)
				.equalToWhenPresent(record::getCategory).set(parameter).equalToWhenPresent(record::getParameter)
				.set(memo).equalToWhenPresent(record::getMemo).where(oid, isEqualTo(record::getOid)));
	}
}