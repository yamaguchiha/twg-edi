package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionOrderTargetManagerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionOrderTargetManager;
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
public interface OptionOrderTargetManagerMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	BasicColumn[] selectList = BasicColumn.columnList(oid, placeStOid, itemPartOid, orderTargetType, lastProcessingDate,
			lastDeliveryDate, lastShipmentNo, tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId,
			tsLastModifiedDate, tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionOrderTargetManager> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionOrderTargetManager> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionOrderTargetManagerResult")
	Optional<OptionOrderTargetManager> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionOrderTargetManagerResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "item_part_oid", property = "itemPartOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "order_target_type", property = "orderTargetType", jdbcType = JdbcType.INTEGER),
			@Result(column = "last_processing_date", property = "lastProcessingDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "last_delivery_date", property = "lastDeliveryDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "last_shipment_no", property = "lastShipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionOrderTargetManager> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionOrderTargetManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionOrderTargetManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	default int insert(OptionOrderTargetManager record) {
		return MyBatis3Utils.insert(this::insert, record, optionOrderTargetManager,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(itemPartOid)
						.toProperty("itemPartOid").map(orderTargetType).toProperty("orderTargetType")
						.map(lastProcessingDate).toProperty("lastProcessingDate").map(lastDeliveryDate)
						.toProperty("lastDeliveryDate").map(lastShipmentNo).toProperty("lastShipmentNo")
						.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
						.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_order_target_manager")
	default int insertMultiple(Collection<OptionOrderTargetManager> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionOrderTargetManager,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(itemPartOid)
						.toProperty("itemPartOid").map(orderTargetType).toProperty("orderTargetType")
						.map(lastProcessingDate).toProperty("lastProcessingDate").map(lastDeliveryDate)
						.toProperty("lastDeliveryDate").map(lastShipmentNo).toProperty("lastShipmentNo")
						.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
						.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	default int insertSelective(OptionOrderTargetManager record) {
		return MyBatis3Utils.insert(this::insert, record, optionOrderTargetManager, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(placeStOid)
				.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(itemPartOid)
				.toPropertyWhenPresent("itemPartOid", record::getItemPartOid).map(orderTargetType)
				.toPropertyWhenPresent("orderTargetType", record::getOrderTargetType).map(lastProcessingDate)
				.toPropertyWhenPresent("lastProcessingDate", record::getLastProcessingDate).map(lastDeliveryDate)
				.toPropertyWhenPresent("lastDeliveryDate", record::getLastDeliveryDate).map(lastShipmentNo)
				.toPropertyWhenPresent("lastShipmentNo", record::getLastShipmentNo).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	default Optional<OptionOrderTargetManager> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionOrderTargetManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	default List<OptionOrderTargetManager> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionOrderTargetManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	default List<OptionOrderTargetManager> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionOrderTargetManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	default Optional<OptionOrderTargetManager> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionOrderTargetManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionOrderTargetManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(placeStOid).equalTo(record::getPlaceStOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(orderTargetType).equalTo(record::getOrderTargetType)
				.set(lastProcessingDate).equalTo(record::getLastProcessingDate).set(lastDeliveryDate)
				.equalTo(record::getLastDeliveryDate).set(lastShipmentNo).equalTo(record::getLastShipmentNo)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionOrderTargetManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(itemPartOid).equalToWhenPresent(record::getItemPartOid).set(orderTargetType)
				.equalToWhenPresent(record::getOrderTargetType).set(lastProcessingDate)
				.equalToWhenPresent(record::getLastProcessingDate).set(lastDeliveryDate)
				.equalToWhenPresent(record::getLastDeliveryDate).set(lastShipmentNo)
				.equalToWhenPresent(record::getLastShipmentNo).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	default int updateByPrimaryKey(OptionOrderTargetManager record) {
		return update(c -> c.set(placeStOid).equalTo(record::getPlaceStOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(orderTargetType).equalTo(record::getOrderTargetType)
				.set(lastProcessingDate).equalTo(record::getLastProcessingDate).set(lastDeliveryDate)
				.equalTo(record::getLastDeliveryDate).set(lastShipmentNo).equalTo(record::getLastShipmentNo)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5202452+09:00", comments = "Source Table: public.option_order_target_manager")
	default int updateByPrimaryKeySelective(OptionOrderTargetManager record) {
		return update(c -> c.set(placeStOid).equalToWhenPresent(record::getPlaceStOid).set(itemPartOid)
				.equalToWhenPresent(record::getItemPartOid).set(orderTargetType)
				.equalToWhenPresent(record::getOrderTargetType).set(lastProcessingDate)
				.equalToWhenPresent(record::getLastProcessingDate).set(lastDeliveryDate)
				.equalToWhenPresent(record::getLastDeliveryDate).set(lastShipmentNo)
				.equalToWhenPresent(record::getLastShipmentNo).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}