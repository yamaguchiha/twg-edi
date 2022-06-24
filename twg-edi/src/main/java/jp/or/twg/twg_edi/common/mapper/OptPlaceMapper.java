package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptPlaceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptPlace;
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
public interface OptPlaceMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	BasicColumn[] selectList = BasicColumn.columnList(oid, ownPlaceOid, discharge, code, name, optPlaceType,
			areaPattern, printSikiriType);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptPlace> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptPlace> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptPlaceResult")
	Optional<OptPlace> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptPlaceResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "own_place_oid", property = "ownPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "discharge", property = "discharge", jdbcType = JdbcType.CHAR),
			@Result(column = "code", property = "code", jdbcType = JdbcType.VARCHAR),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "opt_place_type", property = "optPlaceType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "area_pattern", property = "areaPattern", jdbcType = JdbcType.VARCHAR),
			@Result(column = "print_sikiri_type", property = "printSikiriType", jdbcType = JdbcType.VARCHAR) })
	List<OptPlace> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optPlace, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optPlace, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default int insert(OptPlace record) {
		return MyBatis3Utils.insert(this::insert, record, optPlace,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(discharge)
						.toProperty("discharge").map(code).toProperty("code").map(name).toProperty("name")
						.map(optPlaceType).toProperty("optPlaceType").map(areaPattern).toProperty("areaPattern")
						.map(printSikiriType).toProperty("printSikiriType"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default int insertMultiple(Collection<OptPlace> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optPlace,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(discharge)
						.toProperty("discharge").map(code).toProperty("code").map(name).toProperty("name")
						.map(optPlaceType).toProperty("optPlaceType").map(areaPattern).toProperty("areaPattern")
						.map(printSikiriType).toProperty("printSikiriType"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default int insertSelective(OptPlace record) {
		return MyBatis3Utils.insert(this::insert, record, optPlace,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(ownPlaceOid)
						.toPropertyWhenPresent("ownPlaceOid", record::getOwnPlaceOid).map(discharge)
						.toPropertyWhenPresent("discharge", record::getDischarge).map(code)
						.toPropertyWhenPresent("code", record::getCode).map(name)
						.toPropertyWhenPresent("name", record::getName).map(optPlaceType)
						.toPropertyWhenPresent("optPlaceType", record::getOptPlaceType).map(areaPattern)
						.toPropertyWhenPresent("areaPattern", record::getAreaPattern).map(printSikiriType)
						.toPropertyWhenPresent("printSikiriType", record::getPrintSikiriType));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default Optional<OptPlace> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optPlace, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default List<OptPlace> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optPlace, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default List<OptPlace> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optPlace, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default Optional<OptPlace> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optPlace, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	static UpdateDSL<UpdateModel> updateAllColumns(OptPlace record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(discharge)
				.equalTo(record::getDischarge).set(code).equalTo(record::getCode).set(name).equalTo(record::getName)
				.set(optPlaceType).equalTo(record::getOptPlaceType).set(areaPattern).equalTo(record::getAreaPattern)
				.set(printSikiriType).equalTo(record::getPrintSikiriType);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptPlace record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(ownPlaceOid)
				.equalToWhenPresent(record::getOwnPlaceOid).set(discharge).equalToWhenPresent(record::getDischarge)
				.set(code).equalToWhenPresent(record::getCode).set(name).equalToWhenPresent(record::getName)
				.set(optPlaceType).equalToWhenPresent(record::getOptPlaceType).set(areaPattern)
				.equalToWhenPresent(record::getAreaPattern).set(printSikiriType)
				.equalToWhenPresent(record::getPrintSikiriType);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default int updateByPrimaryKey(OptPlace record) {
		return update(c -> c.set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(discharge)
				.equalTo(record::getDischarge).set(code).equalTo(record::getCode).set(name).equalTo(record::getName)
				.set(optPlaceType).equalTo(record::getOptPlaceType).set(areaPattern).equalTo(record::getAreaPattern)
				.set(printSikiriType).equalTo(record::getPrintSikiriType).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	default int updateByPrimaryKeySelective(OptPlace record) {
		return update(c -> c.set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid).set(discharge)
				.equalToWhenPresent(record::getDischarge).set(code).equalToWhenPresent(record::getCode).set(name)
				.equalToWhenPresent(record::getName).set(optPlaceType).equalToWhenPresent(record::getOptPlaceType)
				.set(areaPattern).equalToWhenPresent(record::getAreaPattern).set(printSikiriType)
				.equalToWhenPresent(record::getPrintSikiriType).where(oid, isEqualTo(record::getOid)));
	}
}