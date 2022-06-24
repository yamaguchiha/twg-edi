package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.PlaceSettingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.PlaceSetting;
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
public interface PlaceSettingMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	BasicColumn[] selectList = BasicColumn.columnList(oid, placeOid, ownPlaceOid, docRefIdP02, itemP07, itemBefPattern,
			beforeProcessFlag, beforeProcessStartStringDate, beforeProcessEndStringDate);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<PlaceSetting> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<PlaceSetting> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("PlaceSettingResult")
	Optional<PlaceSetting> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "PlaceSettingResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "place_oid", property = "placeOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "own_place_oid", property = "ownPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "doc_ref_id_p02", property = "docRefIdP02", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p07", property = "itemP07", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_bef_pattern", property = "itemBefPattern", jdbcType = JdbcType.VARCHAR),
			@Result(column = "before_process_flag", property = "beforeProcessFlag", jdbcType = JdbcType.CHAR),
			@Result(column = "before_process_start_string_date", property = "beforeProcessStartStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "before_process_end_string_date", property = "beforeProcessEndStringDate", jdbcType = JdbcType.VARCHAR) })
	List<PlaceSetting> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, placeSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, placeSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default int insert(PlaceSetting record) {
		return MyBatis3Utils.insert(this::insert, record, placeSetting,
				c -> c.map(oid).toProperty("oid").map(placeOid).toProperty("placeOid").map(ownPlaceOid)
						.toProperty("ownPlaceOid").map(docRefIdP02).toProperty("docRefIdP02").map(itemP07)
						.toProperty("itemP07").map(itemBefPattern).toProperty("itemBefPattern").map(beforeProcessFlag)
						.toProperty("beforeProcessFlag").map(beforeProcessStartStringDate)
						.toProperty("beforeProcessStartStringDate").map(beforeProcessEndStringDate)
						.toProperty("beforeProcessEndStringDate"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default int insertMultiple(Collection<PlaceSetting> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, placeSetting,
				c -> c.map(oid).toProperty("oid").map(placeOid).toProperty("placeOid").map(ownPlaceOid)
						.toProperty("ownPlaceOid").map(docRefIdP02).toProperty("docRefIdP02").map(itemP07)
						.toProperty("itemP07").map(itemBefPattern).toProperty("itemBefPattern").map(beforeProcessFlag)
						.toProperty("beforeProcessFlag").map(beforeProcessStartStringDate)
						.toProperty("beforeProcessStartStringDate").map(beforeProcessEndStringDate)
						.toProperty("beforeProcessEndStringDate"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default int insertSelective(PlaceSetting record) {
		return MyBatis3Utils.insert(this::insert, record, placeSetting,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(placeOid)
						.toPropertyWhenPresent("placeOid", record::getPlaceOid).map(ownPlaceOid)
						.toPropertyWhenPresent("ownPlaceOid", record::getOwnPlaceOid).map(docRefIdP02)
						.toPropertyWhenPresent("docRefIdP02", record::getDocRefIdP02).map(itemP07)
						.toPropertyWhenPresent("itemP07", record::getItemP07).map(itemBefPattern)
						.toPropertyWhenPresent("itemBefPattern", record::getItemBefPattern).map(beforeProcessFlag)
						.toPropertyWhenPresent("beforeProcessFlag", record::getBeforeProcessFlag)
						.map(beforeProcessStartStringDate)
						.toPropertyWhenPresent("beforeProcessStartStringDate", record::getBeforeProcessStartStringDate)
						.map(beforeProcessEndStringDate)
						.toPropertyWhenPresent("beforeProcessEndStringDate", record::getBeforeProcessEndStringDate));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default Optional<PlaceSetting> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, placeSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default List<PlaceSetting> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, placeSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default List<PlaceSetting> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, placeSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default Optional<PlaceSetting> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, placeSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	static UpdateDSL<UpdateModel> updateAllColumns(PlaceSetting record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(placeOid).equalTo(record::getPlaceOid).set(ownPlaceOid)
				.equalTo(record::getOwnPlaceOid).set(docRefIdP02).equalTo(record::getDocRefIdP02).set(itemP07)
				.equalTo(record::getItemP07).set(itemBefPattern).equalTo(record::getItemBefPattern)
				.set(beforeProcessFlag).equalTo(record::getBeforeProcessFlag).set(beforeProcessStartStringDate)
				.equalTo(record::getBeforeProcessStartStringDate).set(beforeProcessEndStringDate)
				.equalTo(record::getBeforeProcessEndStringDate);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(PlaceSetting record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(placeOid).equalToWhenPresent(record::getPlaceOid)
				.set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid).set(docRefIdP02)
				.equalToWhenPresent(record::getDocRefIdP02).set(itemP07).equalToWhenPresent(record::getItemP07)
				.set(itemBefPattern).equalToWhenPresent(record::getItemBefPattern).set(beforeProcessFlag)
				.equalToWhenPresent(record::getBeforeProcessFlag).set(beforeProcessStartStringDate)
				.equalToWhenPresent(record::getBeforeProcessStartStringDate).set(beforeProcessEndStringDate)
				.equalToWhenPresent(record::getBeforeProcessEndStringDate);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default int updateByPrimaryKey(PlaceSetting record) {
		return update(c -> c.set(placeOid).equalTo(record::getPlaceOid).set(ownPlaceOid).equalTo(record::getOwnPlaceOid)
				.set(docRefIdP02).equalTo(record::getDocRefIdP02).set(itemP07).equalTo(record::getItemP07)
				.set(itemBefPattern).equalTo(record::getItemBefPattern).set(beforeProcessFlag)
				.equalTo(record::getBeforeProcessFlag).set(beforeProcessStartStringDate)
				.equalTo(record::getBeforeProcessStartStringDate).set(beforeProcessEndStringDate)
				.equalTo(record::getBeforeProcessEndStringDate).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	default int updateByPrimaryKeySelective(PlaceSetting record) {
		return update(c -> c.set(placeOid).equalToWhenPresent(record::getPlaceOid).set(ownPlaceOid)
				.equalToWhenPresent(record::getOwnPlaceOid).set(docRefIdP02).equalToWhenPresent(record::getDocRefIdP02)
				.set(itemP07).equalToWhenPresent(record::getItemP07).set(itemBefPattern)
				.equalToWhenPresent(record::getItemBefPattern).set(beforeProcessFlag)
				.equalToWhenPresent(record::getBeforeProcessFlag).set(beforeProcessStartStringDate)
				.equalToWhenPresent(record::getBeforeProcessStartStringDate).set(beforeProcessEndStringDate)
				.equalToWhenPresent(record::getBeforeProcessEndStringDate).where(oid, isEqualTo(record::getOid)));
	}
}