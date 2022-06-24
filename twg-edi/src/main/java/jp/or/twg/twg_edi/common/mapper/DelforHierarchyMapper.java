package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.DelforHierarchyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.DelforHierarchy;
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
public interface DelforHierarchyMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.471377+09:00", comments = "Source Table: public.delfor_hierarchy")
	BasicColumn[] selectList = BasicColumn.columnList(oid, delforPsOid, hrcLevel, partyIdBy, placeIdBy, partyIdSe,
			placeIdSe);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<DelforHierarchy> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<DelforHierarchy> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("DelforHierarchyResult")
	Optional<DelforHierarchy> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "DelforHierarchyResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "delfor_ps_oid", property = "delforPsOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "hrc_level", property = "hrcLevel", jdbcType = JdbcType.INTEGER),
			@Result(column = "party_id_by", property = "partyIdBy", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_by", property = "placeIdBy", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_se", property = "partyIdSe", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_se", property = "placeIdSe", jdbcType = JdbcType.VARCHAR) })
	List<DelforHierarchy> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, delforHierarchy, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, delforHierarchy, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	default int insert(DelforHierarchy record) {
		return MyBatis3Utils.insert(this::insert, record, delforHierarchy,
				c -> c.map(oid).toProperty("oid").map(delforPsOid).toProperty("delforPsOid").map(hrcLevel)
						.toProperty("hrcLevel").map(partyIdBy).toProperty("partyIdBy").map(placeIdBy)
						.toProperty("placeIdBy").map(partyIdSe).toProperty("partyIdSe").map(placeIdSe)
						.toProperty("placeIdSe"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	default int insertMultiple(Collection<DelforHierarchy> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, delforHierarchy,
				c -> c.map(oid).toProperty("oid").map(delforPsOid).toProperty("delforPsOid").map(hrcLevel)
						.toProperty("hrcLevel").map(partyIdBy).toProperty("partyIdBy").map(placeIdBy)
						.toProperty("placeIdBy").map(partyIdSe).toProperty("partyIdSe").map(placeIdSe)
						.toProperty("placeIdSe"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source Table: public.delfor_hierarchy")
	default int insertSelective(DelforHierarchy record) {
		return MyBatis3Utils.insert(this::insert, record, delforHierarchy,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(delforPsOid)
						.toPropertyWhenPresent("delforPsOid", record::getDelforPsOid).map(hrcLevel)
						.toPropertyWhenPresent("hrcLevel", record::getHrcLevel).map(partyIdBy)
						.toPropertyWhenPresent("partyIdBy", record::getPartyIdBy).map(placeIdBy)
						.toPropertyWhenPresent("placeIdBy", record::getPlaceIdBy).map(partyIdSe)
						.toPropertyWhenPresent("partyIdSe", record::getPartyIdSe).map(placeIdSe)
						.toPropertyWhenPresent("placeIdSe", record::getPlaceIdSe));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.471377+09:00", comments = "Source Table: public.delfor_hierarchy")
	default Optional<DelforHierarchy> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, delforHierarchy, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.471377+09:00", comments = "Source Table: public.delfor_hierarchy")
	default List<DelforHierarchy> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, delforHierarchy, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.471377+09:00", comments = "Source Table: public.delfor_hierarchy")
	default List<DelforHierarchy> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, delforHierarchy, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.471377+09:00", comments = "Source Table: public.delfor_hierarchy")
	default Optional<DelforHierarchy> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.471377+09:00", comments = "Source Table: public.delfor_hierarchy")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, delforHierarchy, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.471377+09:00", comments = "Source Table: public.delfor_hierarchy")
	static UpdateDSL<UpdateModel> updateAllColumns(DelforHierarchy record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(delforPsOid).equalTo(record::getDelforPsOid).set(hrcLevel)
				.equalTo(record::getHrcLevel).set(partyIdBy).equalTo(record::getPartyIdBy).set(placeIdBy)
				.equalTo(record::getPlaceIdBy).set(partyIdSe).equalTo(record::getPartyIdSe).set(placeIdSe)
				.equalTo(record::getPlaceIdSe);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.471377+09:00", comments = "Source Table: public.delfor_hierarchy")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(DelforHierarchy record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(delforPsOid)
				.equalToWhenPresent(record::getDelforPsOid).set(hrcLevel).equalToWhenPresent(record::getHrcLevel)
				.set(partyIdBy).equalToWhenPresent(record::getPartyIdBy).set(placeIdBy)
				.equalToWhenPresent(record::getPlaceIdBy).set(partyIdSe).equalToWhenPresent(record::getPartyIdSe)
				.set(placeIdSe).equalToWhenPresent(record::getPlaceIdSe);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.471377+09:00", comments = "Source Table: public.delfor_hierarchy")
	default int updateByPrimaryKey(DelforHierarchy record) {
		return update(c -> c.set(delforPsOid).equalTo(record::getDelforPsOid).set(hrcLevel).equalTo(record::getHrcLevel)
				.set(partyIdBy).equalTo(record::getPartyIdBy).set(placeIdBy).equalTo(record::getPlaceIdBy)
				.set(partyIdSe).equalTo(record::getPartyIdSe).set(placeIdSe).equalTo(record::getPlaceIdSe)
				.where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.471377+09:00", comments = "Source Table: public.delfor_hierarchy")
	default int updateByPrimaryKeySelective(DelforHierarchy record) {
		return update(c -> c.set(delforPsOid).equalToWhenPresent(record::getDelforPsOid).set(hrcLevel)
				.equalToWhenPresent(record::getHrcLevel).set(partyIdBy).equalToWhenPresent(record::getPartyIdBy)
				.set(placeIdBy).equalToWhenPresent(record::getPlaceIdBy).set(partyIdSe)
				.equalToWhenPresent(record::getPartyIdSe).set(placeIdSe).equalToWhenPresent(record::getPlaceIdSe)
				.where(oid, isEqualTo(record::getOid)));
	}
}