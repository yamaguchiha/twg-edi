package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionReadOrderQuantityManagerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionReadOrderQuantityManager;
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
public interface OptionReadOrderQuantityManagerMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	BasicColumn[] selectList = BasicColumn.columnList(oid, placeStOid, itemPartOid, orderQuantity, readQuantity,
			tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId,
			tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionReadOrderQuantityManager> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionReadOrderQuantityManager> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionReadOrderQuantityManagerResult")
	Optional<OptionReadOrderQuantityManager> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionReadOrderQuantityManagerResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "item_part_oid", property = "itemPartOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "order_quantity", property = "orderQuantity", jdbcType = JdbcType.INTEGER),
			@Result(column = "read_quantity", property = "readQuantity", jdbcType = JdbcType.INTEGER),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionReadOrderQuantityManager> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionReadOrderQuantityManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionReadOrderQuantityManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default int insert(OptionReadOrderQuantityManager record) {
		return MyBatis3Utils.insert(this::insert, record, optionReadOrderQuantityManager,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(itemPartOid)
						.toProperty("itemPartOid").map(orderQuantity).toProperty("orderQuantity").map(readQuantity)
						.toProperty("readQuantity").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default int insertMultiple(Collection<OptionReadOrderQuantityManager> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionReadOrderQuantityManager,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(itemPartOid)
						.toProperty("itemPartOid").map(orderQuantity).toProperty("orderQuantity").map(readQuantity)
						.toProperty("readQuantity").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default int insertSelective(OptionReadOrderQuantityManager record) {
		return MyBatis3Utils.insert(this::insert, record, optionReadOrderQuantityManager, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(placeStOid)
				.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(itemPartOid)
				.toPropertyWhenPresent("itemPartOid", record::getItemPartOid).map(orderQuantity)
				.toPropertyWhenPresent("orderQuantity", record::getOrderQuantity).map(readQuantity)
				.toPropertyWhenPresent("readQuantity", record::getReadQuantity).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default Optional<OptionReadOrderQuantityManager> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionReadOrderQuantityManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default List<OptionReadOrderQuantityManager> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionReadOrderQuantityManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default List<OptionReadOrderQuantityManager> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionReadOrderQuantityManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default Optional<OptionReadOrderQuantityManager> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionReadOrderQuantityManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4943151+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionReadOrderQuantityManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(placeStOid).equalTo(record::getPlaceStOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(orderQuantity).equalTo(record::getOrderQuantity).set(readQuantity)
				.equalTo(record::getReadQuantity).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionReadOrderQuantityManager record,
			UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(itemPartOid).equalToWhenPresent(record::getItemPartOid).set(orderQuantity)
				.equalToWhenPresent(record::getOrderQuantity).set(readQuantity)
				.equalToWhenPresent(record::getReadQuantity).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default int updateByPrimaryKey(OptionReadOrderQuantityManager record) {
		return update(c -> c.set(placeStOid).equalTo(record::getPlaceStOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(orderQuantity).equalTo(record::getOrderQuantity).set(readQuantity)
				.equalTo(record::getReadQuantity).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source Table: public.option_read_order_quantity_manager")
	default int updateByPrimaryKeySelective(OptionReadOrderQuantityManager record) {
		return update(c -> c.set(placeStOid).equalToWhenPresent(record::getPlaceStOid).set(itemPartOid)
				.equalToWhenPresent(record::getItemPartOid).set(orderQuantity)
				.equalToWhenPresent(record::getOrderQuantity).set(readQuantity)
				.equalToWhenPresent(record::getReadQuantity).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}