package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.ItemTypeA04DynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.ItemTypeA04;
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
public interface ItemTypeA04Mapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	BasicColumn[] selectList = BasicColumn.columnList(oid, ownPlaceOid, description, note, defaultFlag, memo);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source Table: public.item_type_a04")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source Table: public.item_type_a04")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source Table: public.item_type_a04")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<ItemTypeA04> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source Table: public.item_type_a04")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<ItemTypeA04> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source Table: public.item_type_a04")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("ItemTypeA04Result")
	Optional<ItemTypeA04> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source Table: public.item_type_a04")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "ItemTypeA04Result", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "own_place_oid", property = "ownPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
			@Result(column = "note", property = "note", jdbcType = JdbcType.VARCHAR),
			@Result(column = "default_flag", property = "defaultFlag", jdbcType = JdbcType.CHAR),
			@Result(column = "memo", property = "memo", jdbcType = JdbcType.VARCHAR) })
	List<ItemTypeA04> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source Table: public.item_type_a04")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, itemTypeA04, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, itemTypeA04, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default int insert(ItemTypeA04 record) {
		return MyBatis3Utils.insert(this::insert, record, itemTypeA04,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(description)
						.toProperty("description").map(note).toProperty("note").map(defaultFlag)
						.toProperty("defaultFlag").map(memo).toProperty("memo"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default int insertMultiple(Collection<ItemTypeA04> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, itemTypeA04,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(description)
						.toProperty("description").map(note).toProperty("note").map(defaultFlag)
						.toProperty("defaultFlag").map(memo).toProperty("memo"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default int insertSelective(ItemTypeA04 record) {
		return MyBatis3Utils.insert(this::insert, record, itemTypeA04,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(ownPlaceOid)
						.toPropertyWhenPresent("ownPlaceOid", record::getOwnPlaceOid).map(description)
						.toPropertyWhenPresent("description", record::getDescription).map(note)
						.toPropertyWhenPresent("note", record::getNote).map(defaultFlag)
						.toPropertyWhenPresent("defaultFlag", record::getDefaultFlag).map(memo)
						.toPropertyWhenPresent("memo", record::getMemo));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default Optional<ItemTypeA04> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, itemTypeA04, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default List<ItemTypeA04> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, itemTypeA04, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default List<ItemTypeA04> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, itemTypeA04, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default Optional<ItemTypeA04> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, itemTypeA04, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	static UpdateDSL<UpdateModel> updateAllColumns(ItemTypeA04 record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(description)
				.equalTo(record::getDescription).set(note).equalTo(record::getNote).set(defaultFlag)
				.equalTo(record::getDefaultFlag).set(memo).equalTo(record::getMemo);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(ItemTypeA04 record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(ownPlaceOid)
				.equalToWhenPresent(record::getOwnPlaceOid).set(description).equalToWhenPresent(record::getDescription)
				.set(note).equalToWhenPresent(record::getNote).set(defaultFlag)
				.equalToWhenPresent(record::getDefaultFlag).set(memo).equalToWhenPresent(record::getMemo);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default int updateByPrimaryKey(ItemTypeA04 record) {
		return update(
				c -> c.set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(description).equalTo(record::getDescription)
						.set(note).equalTo(record::getNote).set(defaultFlag).equalTo(record::getDefaultFlag).set(memo)
						.equalTo(record::getMemo).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4733709+09:00", comments = "Source Table: public.item_type_a04")
	default int updateByPrimaryKeySelective(ItemTypeA04 record) {
		return update(c -> c.set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid).set(description)
				.equalToWhenPresent(record::getDescription).set(note).equalToWhenPresent(record::getNote)
				.set(defaultFlag).equalToWhenPresent(record::getDefaultFlag).set(memo)
				.equalToWhenPresent(record::getMemo).where(oid, isEqualTo(record::getOid)));
	}
}