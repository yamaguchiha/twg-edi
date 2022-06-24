package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.PlaceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.annotation.Generated;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
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
import org.springframework.data.repository.query.Param;

import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.model.SelectPlaceCondition;

@Mapper
public interface PlaceMapper {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	BasicColumn[] selectList = BasicColumn.columnList(oid, partyOid, tdbPlaceCode, name, validStartStringDate,
			validEndStringDate);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Place> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Place> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("PlaceResult")
	Optional<Place> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "PlaceResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "party_oid", property = "partyOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "tdb_place_code", property = "tdbPlaceCode", jdbcType = JdbcType.VARCHAR),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "valid_start_string_date", property = "validStartStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "valid_end_string_date", property = "validEndStringDate", jdbcType = JdbcType.VARCHAR) })
	List<Place> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, place, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, place, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default int insert(Place record) {
		return MyBatis3Utils.insert(this::insert, record, place,
				c -> c.map(oid).toProperty("oid").map(partyOid).toProperty("partyOid").map(tdbPlaceCode)
						.toProperty("tdbPlaceCode").map(name).toProperty("name").map(validStartStringDate)
						.toProperty("validStartStringDate").map(validEndStringDate).toProperty("validEndStringDate"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default int insertMultiple(Collection<Place> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, place,
				c -> c.map(oid).toProperty("oid").map(partyOid).toProperty("partyOid").map(tdbPlaceCode)
						.toProperty("tdbPlaceCode").map(name).toProperty("name").map(validStartStringDate)
						.toProperty("validStartStringDate").map(validEndStringDate).toProperty("validEndStringDate"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default int insertSelective(Place record) {
		return MyBatis3Utils.insert(this::insert, record, place,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(partyOid)
						.toPropertyWhenPresent("partyOid", record::getPartyOid).map(tdbPlaceCode)
						.toPropertyWhenPresent("tdbPlaceCode", record::getTdbPlaceCode).map(name)
						.toPropertyWhenPresent("name", record::getName).map(validStartStringDate)
						.toPropertyWhenPresent("validStartStringDate", record::getValidStartStringDate)
						.map(validEndStringDate)
						.toPropertyWhenPresent("validEndStringDate", record::getValidEndStringDate));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default Optional<Place> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, place, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default List<Place> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, place, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default List<Place> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, place, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default Optional<Place> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, place, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	static UpdateDSL<UpdateModel> updateAllColumns(Place record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(partyOid).equalTo(record::getPartyOid).set(tdbPlaceCode)
				.equalTo(record::getTdbPlaceCode).set(name).equalTo(record::getName).set(validStartStringDate)
				.equalTo(record::getValidStartStringDate).set(validEndStringDate)
				.equalTo(record::getValidEndStringDate);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Place record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(partyOid).equalToWhenPresent(record::getPartyOid)
				.set(tdbPlaceCode).equalToWhenPresent(record::getTdbPlaceCode).set(name)
				.equalToWhenPresent(record::getName).set(validStartStringDate)
				.equalToWhenPresent(record::getValidStartStringDate).set(validEndStringDate)
				.equalToWhenPresent(record::getValidEndStringDate);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default int updateByPrimaryKey(Place record) {
		return update(c -> c.set(partyOid).equalTo(record::getPartyOid).set(tdbPlaceCode)
				.equalTo(record::getTdbPlaceCode).set(name).equalTo(record::getName).set(validStartStringDate)
				.equalTo(record::getValidStartStringDate).set(validEndStringDate).equalTo(record::getValidEndStringDate)
				.where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	default int updateByPrimaryKeySelective(Place record) {
		return update(c -> c.set(partyOid).equalToWhenPresent(record::getPartyOid).set(tdbPlaceCode)
				.equalToWhenPresent(record::getTdbPlaceCode).set(name).equalToWhenPresent(record::getName)
				.set(validStartStringDate).equalToWhenPresent(record::getValidStartStringDate).set(validEndStringDate)
				.equalToWhenPresent(record::getValidEndStringDate).where(oid, isEqualTo(record::getOid)));
	}

    /**
     * 企業OIDで企業にぶら下がる事業所のOIDのリストを取得
     *
     * @param partyOid
     * @return
     */
	@Select("select oid from place where party_oid=#{partyOid}")
	public List<Long> selectByPartyOid(@Param("partyOid") long partyOid);

	/**
	 * 企業事業所選択Ajax用
	 *
	 * @param condition
	 * @return
	 */
	public List<Place> selectPlaceList(SelectPlaceCondition condition);
}