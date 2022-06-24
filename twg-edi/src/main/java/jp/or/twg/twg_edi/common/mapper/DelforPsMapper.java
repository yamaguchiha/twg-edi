package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.DelforPsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.DelforPs;
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
public interface DelforPsMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	BasicColumn[] selectList = BasicColumn.columnList(oid, docRefIdPs, dateFormat, date, partyIdBy, placeIdBy,
			partyIdSe, placeIdSe, itemIdIn, itemE18, tsLastModifiedDate);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.delfor_ps")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<DelforPs> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<DelforPs> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("DelforPsResult")
	Optional<DelforPs> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "DelforPsResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "doc_ref_id_ps", property = "docRefIdPs", jdbcType = JdbcType.VARCHAR),
			@Result(column = "date_format", property = "dateFormat", jdbcType = JdbcType.VARCHAR),
			@Result(column = "date", property = "date", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_by", property = "partyIdBy", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_by", property = "placeIdBy", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_id_se", property = "partyIdSe", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_id_se", property = "placeIdSe", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_id_in", property = "itemIdIn", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_e18", property = "itemE18", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP) })
	List<DelforPs> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, delforPs, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, delforPs, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default int insert(DelforPs record) {
		return MyBatis3Utils.insert(this::insert, record, delforPs,
				c -> c.map(oid).toProperty("oid").map(docRefIdPs).toProperty("docRefIdPs").map(dateFormat)
						.toProperty("dateFormat").map(date).toProperty("date").map(partyIdBy).toProperty("partyIdBy")
						.map(placeIdBy).toProperty("placeIdBy").map(partyIdSe).toProperty("partyIdSe").map(placeIdSe)
						.toProperty("placeIdSe").map(itemIdIn).toProperty("itemIdIn").map(itemE18).toProperty("itemE18")
						.map(tsLastModifiedDate).toProperty("tsLastModifiedDate"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default int insertMultiple(Collection<DelforPs> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, delforPs,
				c -> c.map(oid).toProperty("oid").map(docRefIdPs).toProperty("docRefIdPs").map(dateFormat)
						.toProperty("dateFormat").map(date).toProperty("date").map(partyIdBy).toProperty("partyIdBy")
						.map(placeIdBy).toProperty("placeIdBy").map(partyIdSe).toProperty("partyIdSe").map(placeIdSe)
						.toProperty("placeIdSe").map(itemIdIn).toProperty("itemIdIn").map(itemE18).toProperty("itemE18")
						.map(tsLastModifiedDate).toProperty("tsLastModifiedDate"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default int insertSelective(DelforPs record) {
		return MyBatis3Utils.insert(this::insert, record, delforPs,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(docRefIdPs)
						.toPropertyWhenPresent("docRefIdPs", record::getDocRefIdPs).map(dateFormat)
						.toPropertyWhenPresent("dateFormat", record::getDateFormat).map(date)
						.toPropertyWhenPresent("date", record::getDate).map(partyIdBy)
						.toPropertyWhenPresent("partyIdBy", record::getPartyIdBy).map(placeIdBy)
						.toPropertyWhenPresent("placeIdBy", record::getPlaceIdBy).map(partyIdSe)
						.toPropertyWhenPresent("partyIdSe", record::getPartyIdSe).map(placeIdSe)
						.toPropertyWhenPresent("placeIdSe", record::getPlaceIdSe).map(itemIdIn)
						.toPropertyWhenPresent("itemIdIn", record::getItemIdIn).map(itemE18)
						.toPropertyWhenPresent("itemE18", record::getItemE18).map(tsLastModifiedDate)
						.toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default Optional<DelforPs> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, delforPs, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default List<DelforPs> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, delforPs, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default List<DelforPs> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, delforPs, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default Optional<DelforPs> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, delforPs, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	static UpdateDSL<UpdateModel> updateAllColumns(DelforPs record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(docRefIdPs).equalTo(record::getDocRefIdPs).set(dateFormat)
				.equalTo(record::getDateFormat).set(date).equalTo(record::getDate).set(partyIdBy)
				.equalTo(record::getPartyIdBy).set(placeIdBy).equalTo(record::getPlaceIdBy).set(partyIdSe)
				.equalTo(record::getPartyIdSe).set(placeIdSe).equalTo(record::getPlaceIdSe).set(itemIdIn)
				.equalTo(record::getItemIdIn).set(itemE18).equalTo(record::getItemE18).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(DelforPs record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(docRefIdPs).equalToWhenPresent(record::getDocRefIdPs)
				.set(dateFormat).equalToWhenPresent(record::getDateFormat).set(date).equalToWhenPresent(record::getDate)
				.set(partyIdBy).equalToWhenPresent(record::getPartyIdBy).set(placeIdBy)
				.equalToWhenPresent(record::getPlaceIdBy).set(partyIdSe).equalToWhenPresent(record::getPartyIdSe)
				.set(placeIdSe).equalToWhenPresent(record::getPlaceIdSe).set(itemIdIn)
				.equalToWhenPresent(record::getItemIdIn).set(itemE18).equalToWhenPresent(record::getItemE18)
				.set(tsLastModifiedDate).equalToWhenPresent(record::getTsLastModifiedDate);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default int updateByPrimaryKey(DelforPs record) {
		return update(c -> c.set(docRefIdPs).equalTo(record::getDocRefIdPs).set(dateFormat)
				.equalTo(record::getDateFormat).set(date).equalTo(record::getDate).set(partyIdBy)
				.equalTo(record::getPartyIdBy).set(placeIdBy).equalTo(record::getPlaceIdBy).set(partyIdSe)
				.equalTo(record::getPartyIdSe).set(placeIdSe).equalTo(record::getPlaceIdSe).set(itemIdIn)
				.equalTo(record::getItemIdIn).set(itemE18).equalTo(record::getItemE18).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.52224+09:00", comments = "Source Table: public.delfor_ps")
	default int updateByPrimaryKeySelective(DelforPs record) {
		return update(c -> c.set(docRefIdPs).equalToWhenPresent(record::getDocRefIdPs).set(dateFormat)
				.equalToWhenPresent(record::getDateFormat).set(date).equalToWhenPresent(record::getDate).set(partyIdBy)
				.equalToWhenPresent(record::getPartyIdBy).set(placeIdBy).equalToWhenPresent(record::getPlaceIdBy)
				.set(partyIdSe).equalToWhenPresent(record::getPartyIdSe).set(placeIdSe)
				.equalToWhenPresent(record::getPlaceIdSe).set(itemIdIn).equalToWhenPresent(record::getItemIdIn)
				.set(itemE18).equalToWhenPresent(record::getItemE18).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).where(oid, isEqualTo(record::getOid)));
	}
}