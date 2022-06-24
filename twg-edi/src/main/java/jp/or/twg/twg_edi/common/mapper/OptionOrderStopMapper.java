package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionOrderStopDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionOrderStop;
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
public interface OptionOrderStopMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	BasicColumn[] selectList = BasicColumn.columnList(oid, itemPartOid, orderStopId, orderStopStatus,
			startDeliveryDateStringDate, startShipmentNo, quantity, totalQuantity, remainderQuantity, fractionQuantity,
			lastStartDeliveryDateStringDate, lastStartShipmentNo, lastSlipNo, lastDeliveryQuantity, tsRegistererDate,
			tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId,
			tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionOrderStop> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionOrderStop> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionOrderStopResult")
	Optional<OptionOrderStop> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionOrderStopResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "item_part_oid", property = "itemPartOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "order_stop_id", property = "orderStopId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "order_stop_status", property = "orderStopStatus", jdbcType = JdbcType.INTEGER),
			@Result(column = "start_delivery_date_string_date", property = "startDeliveryDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "start_shipment_no", property = "startShipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "quantity", property = "quantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "total_quantity", property = "totalQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "remainder_quantity", property = "remainderQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "fraction_quantity", property = "fractionQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "last_start_delivery_date_string_date", property = "lastStartDeliveryDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "last_start_shipment_no", property = "lastStartShipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "last_slip_no", property = "lastSlipNo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "last_delivery_quantity", property = "lastDeliveryQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionOrderStop> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionOrderStop, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionOrderStop, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default int insert(OptionOrderStop record) {
		return MyBatis3Utils.insert(this::insert, record, optionOrderStop,
				c -> c.map(oid).toProperty("oid").map(itemPartOid).toProperty("itemPartOid").map(orderStopId)
						.toProperty("orderStopId").map(orderStopStatus).toProperty("orderStopStatus")
						.map(startDeliveryDateStringDate).toProperty("startDeliveryDateStringDate").map(startShipmentNo)
						.toProperty("startShipmentNo").map(quantity).toProperty("quantity").map(totalQuantity)
						.toProperty("totalQuantity").map(remainderQuantity).toProperty("remainderQuantity")
						.map(fractionQuantity).toProperty("fractionQuantity").map(lastStartDeliveryDateStringDate)
						.toProperty("lastStartDeliveryDateStringDate").map(lastStartShipmentNo)
						.toProperty("lastStartShipmentNo").map(lastSlipNo).toProperty("lastSlipNo")
						.map(lastDeliveryQuantity).toProperty("lastDeliveryQuantity").map(tsRegistererDate)
						.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
						.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
						.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default int insertMultiple(Collection<OptionOrderStop> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionOrderStop,
				c -> c.map(oid).toProperty("oid").map(itemPartOid).toProperty("itemPartOid").map(orderStopId)
						.toProperty("orderStopId").map(orderStopStatus).toProperty("orderStopStatus")
						.map(startDeliveryDateStringDate).toProperty("startDeliveryDateStringDate").map(startShipmentNo)
						.toProperty("startShipmentNo").map(quantity).toProperty("quantity").map(totalQuantity)
						.toProperty("totalQuantity").map(remainderQuantity).toProperty("remainderQuantity")
						.map(fractionQuantity).toProperty("fractionQuantity").map(lastStartDeliveryDateStringDate)
						.toProperty("lastStartDeliveryDateStringDate").map(lastStartShipmentNo)
						.toProperty("lastStartShipmentNo").map(lastSlipNo).toProperty("lastSlipNo")
						.map(lastDeliveryQuantity).toProperty("lastDeliveryQuantity").map(tsRegistererDate)
						.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
						.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
						.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default int insertSelective(OptionOrderStop record) {
		return MyBatis3Utils.insert(this::insert, record, optionOrderStop, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(itemPartOid)
				.toPropertyWhenPresent("itemPartOid", record::getItemPartOid).map(orderStopId)
				.toPropertyWhenPresent("orderStopId", record::getOrderStopId).map(orderStopStatus)
				.toPropertyWhenPresent("orderStopStatus", record::getOrderStopStatus).map(startDeliveryDateStringDate)
				.toPropertyWhenPresent("startDeliveryDateStringDate", record::getStartDeliveryDateStringDate)
				.map(startShipmentNo).toPropertyWhenPresent("startShipmentNo", record::getStartShipmentNo).map(quantity)
				.toPropertyWhenPresent("quantity", record::getQuantity).map(totalQuantity)
				.toPropertyWhenPresent("totalQuantity", record::getTotalQuantity).map(remainderQuantity)
				.toPropertyWhenPresent("remainderQuantity", record::getRemainderQuantity).map(fractionQuantity)
				.toPropertyWhenPresent("fractionQuantity", record::getFractionQuantity)
				.map(lastStartDeliveryDateStringDate)
				.toPropertyWhenPresent("lastStartDeliveryDateStringDate", record::getLastStartDeliveryDateStringDate)
				.map(lastStartShipmentNo).toPropertyWhenPresent("lastStartShipmentNo", record::getLastStartShipmentNo)
				.map(lastSlipNo).toPropertyWhenPresent("lastSlipNo", record::getLastSlipNo).map(lastDeliveryQuantity)
				.toPropertyWhenPresent("lastDeliveryQuantity", record::getLastDeliveryQuantity).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default Optional<OptionOrderStop> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionOrderStop, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default List<OptionOrderStop> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionOrderStop, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default List<OptionOrderStop> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionOrderStop, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default Optional<OptionOrderStop> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionOrderStop, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4893296+09:00", comments = "Source Table: public.option_order_stop")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionOrderStop record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(itemPartOid).equalTo(record::getItemPartOid).set(orderStopId)
				.equalTo(record::getOrderStopId).set(orderStopStatus).equalTo(record::getOrderStopStatus)
				.set(startDeliveryDateStringDate).equalTo(record::getStartDeliveryDateStringDate).set(startShipmentNo)
				.equalTo(record::getStartShipmentNo).set(quantity).equalTo(record::getQuantity).set(totalQuantity)
				.equalTo(record::getTotalQuantity).set(remainderQuantity).equalTo(record::getRemainderQuantity)
				.set(fractionQuantity).equalTo(record::getFractionQuantity).set(lastStartDeliveryDateStringDate)
				.equalTo(record::getLastStartDeliveryDateStringDate).set(lastStartShipmentNo)
				.equalTo(record::getLastStartShipmentNo).set(lastSlipNo).equalTo(record::getLastSlipNo)
				.set(lastDeliveryQuantity).equalTo(record::getLastDeliveryQuantity).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source Table: public.option_order_stop")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionOrderStop record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(itemPartOid)
				.equalToWhenPresent(record::getItemPartOid).set(orderStopId).equalToWhenPresent(record::getOrderStopId)
				.set(orderStopStatus).equalToWhenPresent(record::getOrderStopStatus).set(startDeliveryDateStringDate)
				.equalToWhenPresent(record::getStartDeliveryDateStringDate).set(startShipmentNo)
				.equalToWhenPresent(record::getStartShipmentNo).set(quantity).equalToWhenPresent(record::getQuantity)
				.set(totalQuantity).equalToWhenPresent(record::getTotalQuantity).set(remainderQuantity)
				.equalToWhenPresent(record::getRemainderQuantity).set(fractionQuantity)
				.equalToWhenPresent(record::getFractionQuantity).set(lastStartDeliveryDateStringDate)
				.equalToWhenPresent(record::getLastStartDeliveryDateStringDate).set(lastStartShipmentNo)
				.equalToWhenPresent(record::getLastStartShipmentNo).set(lastSlipNo)
				.equalToWhenPresent(record::getLastSlipNo).set(lastDeliveryQuantity)
				.equalToWhenPresent(record::getLastDeliveryQuantity).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source Table: public.option_order_stop")
	default int updateByPrimaryKey(OptionOrderStop record) {
		return update(c -> c.set(itemPartOid).equalTo(record::getItemPartOid).set(orderStopId)
				.equalTo(record::getOrderStopId).set(orderStopStatus).equalTo(record::getOrderStopStatus)
				.set(startDeliveryDateStringDate).equalTo(record::getStartDeliveryDateStringDate).set(startShipmentNo)
				.equalTo(record::getStartShipmentNo).set(quantity).equalTo(record::getQuantity).set(totalQuantity)
				.equalTo(record::getTotalQuantity).set(remainderQuantity).equalTo(record::getRemainderQuantity)
				.set(fractionQuantity).equalTo(record::getFractionQuantity).set(lastStartDeliveryDateStringDate)
				.equalTo(record::getLastStartDeliveryDateStringDate).set(lastStartShipmentNo)
				.equalTo(record::getLastStartShipmentNo).set(lastSlipNo).equalTo(record::getLastSlipNo)
				.set(lastDeliveryQuantity).equalTo(record::getLastDeliveryQuantity).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source Table: public.option_order_stop")
	default int updateByPrimaryKeySelective(OptionOrderStop record) {
		return update(c -> c.set(itemPartOid).equalToWhenPresent(record::getItemPartOid).set(orderStopId)
				.equalToWhenPresent(record::getOrderStopId).set(orderStopStatus)
				.equalToWhenPresent(record::getOrderStopStatus).set(startDeliveryDateStringDate)
				.equalToWhenPresent(record::getStartDeliveryDateStringDate).set(startShipmentNo)
				.equalToWhenPresent(record::getStartShipmentNo).set(quantity).equalToWhenPresent(record::getQuantity)
				.set(totalQuantity).equalToWhenPresent(record::getTotalQuantity).set(remainderQuantity)
				.equalToWhenPresent(record::getRemainderQuantity).set(fractionQuantity)
				.equalToWhenPresent(record::getFractionQuantity).set(lastStartDeliveryDateStringDate)
				.equalToWhenPresent(record::getLastStartDeliveryDateStringDate).set(lastStartShipmentNo)
				.equalToWhenPresent(record::getLastStartShipmentNo).set(lastSlipNo)
				.equalToWhenPresent(record::getLastSlipNo).set(lastDeliveryQuantity)
				.equalToWhenPresent(record::getLastDeliveryQuantity).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}