package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionKanbanAdjustDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionKanbanAdjust;
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
public interface OptionKanbanAdjustMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	BasicColumn[] selectList = BasicColumn.columnList(oid, itemPartOid, planDateStringDate, startDeliveryDateStringDate,
			startShipmentNo, adjustStatus, adjustType, quantity, parQuantity, totalQuantity,
			carryForwardFractionQuantity, tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId,
			tsLastModifiedDate, tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionKanbanAdjust> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionKanbanAdjust> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionKanbanAdjustResult")
	Optional<OptionKanbanAdjust> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionKanbanAdjustResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "item_part_oid", property = "itemPartOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "plan_date_string_date", property = "planDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "start_delivery_date_string_date", property = "startDeliveryDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "start_shipment_no", property = "startShipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "adjust_status", property = "adjustStatus", jdbcType = JdbcType.INTEGER),
			@Result(column = "adjust_type", property = "adjustType", jdbcType = JdbcType.INTEGER),
			@Result(column = "quantity", property = "quantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "par_quantity", property = "parQuantity", jdbcType = JdbcType.NUMERIC),
			@Result(column = "total_quantity", property = "totalQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "carry_forward_fraction_quantity", property = "carryForwardFractionQuantity", jdbcType = JdbcType.NUMERIC),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionKanbanAdjust> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionKanbanAdjust, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionKanbanAdjust, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	default int insert(OptionKanbanAdjust record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanAdjust,
				c -> c.map(oid).toProperty("oid").map(itemPartOid).toProperty("itemPartOid").map(planDateStringDate)
						.toProperty("planDateStringDate").map(startDeliveryDateStringDate)
						.toProperty("startDeliveryDateStringDate").map(startShipmentNo).toProperty("startShipmentNo")
						.map(adjustStatus).toProperty("adjustStatus").map(adjustType).toProperty("adjustType")
						.map(quantity).toProperty("quantity").map(parQuantity).toProperty("parQuantity")
						.map(totalQuantity).toProperty("totalQuantity").map(carryForwardFractionQuantity)
						.toProperty("carryForwardFractionQuantity").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	default int insertMultiple(Collection<OptionKanbanAdjust> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionKanbanAdjust,
				c -> c.map(oid).toProperty("oid").map(itemPartOid).toProperty("itemPartOid").map(planDateStringDate)
						.toProperty("planDateStringDate").map(startDeliveryDateStringDate)
						.toProperty("startDeliveryDateStringDate").map(startShipmentNo).toProperty("startShipmentNo")
						.map(adjustStatus).toProperty("adjustStatus").map(adjustType).toProperty("adjustType")
						.map(quantity).toProperty("quantity").map(parQuantity).toProperty("parQuantity")
						.map(totalQuantity).toProperty("totalQuantity").map(carryForwardFractionQuantity)
						.toProperty("carryForwardFractionQuantity").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	default int insertSelective(OptionKanbanAdjust record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanAdjust, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(itemPartOid)
				.toPropertyWhenPresent("itemPartOid", record::getItemPartOid).map(planDateStringDate)
				.toPropertyWhenPresent("planDateStringDate", record::getPlanDateStringDate)
				.map(startDeliveryDateStringDate)
				.toPropertyWhenPresent("startDeliveryDateStringDate", record::getStartDeliveryDateStringDate)
				.map(startShipmentNo).toPropertyWhenPresent("startShipmentNo", record::getStartShipmentNo)
				.map(adjustStatus).toPropertyWhenPresent("adjustStatus", record::getAdjustStatus).map(adjustType)
				.toPropertyWhenPresent("adjustType", record::getAdjustType).map(quantity)
				.toPropertyWhenPresent("quantity", record::getQuantity).map(parQuantity)
				.toPropertyWhenPresent("parQuantity", record::getParQuantity).map(totalQuantity)
				.toPropertyWhenPresent("totalQuantity", record::getTotalQuantity).map(carryForwardFractionQuantity)
				.toPropertyWhenPresent("carryForwardFractionQuantity", record::getCarryForwardFractionQuantity)
				.map(tsRegistererDate).toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate)
				.map(tsRegistererUserId).toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId)
				.map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	default Optional<OptionKanbanAdjust> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionKanbanAdjust, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4983043+09:00", comments = "Source Table: public.option_kanban_adjust")
	default List<OptionKanbanAdjust> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionKanbanAdjust, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.option_kanban_adjust")
	default List<OptionKanbanAdjust> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionKanbanAdjust, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.option_kanban_adjust")
	default Optional<OptionKanbanAdjust> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.option_kanban_adjust")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionKanbanAdjust, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.option_kanban_adjust")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionKanbanAdjust record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(itemPartOid).equalTo(record::getItemPartOid)
				.set(planDateStringDate).equalTo(record::getPlanDateStringDate).set(startDeliveryDateStringDate)
				.equalTo(record::getStartDeliveryDateStringDate).set(startShipmentNo)
				.equalTo(record::getStartShipmentNo).set(adjustStatus).equalTo(record::getAdjustStatus).set(adjustType)
				.equalTo(record::getAdjustType).set(quantity).equalTo(record::getQuantity).set(parQuantity)
				.equalTo(record::getParQuantity).set(totalQuantity).equalTo(record::getTotalQuantity)
				.set(carryForwardFractionQuantity).equalTo(record::getCarryForwardFractionQuantity)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.option_kanban_adjust")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionKanbanAdjust record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(itemPartOid)
				.equalToWhenPresent(record::getItemPartOid).set(planDateStringDate)
				.equalToWhenPresent(record::getPlanDateStringDate).set(startDeliveryDateStringDate)
				.equalToWhenPresent(record::getStartDeliveryDateStringDate).set(startShipmentNo)
				.equalToWhenPresent(record::getStartShipmentNo).set(adjustStatus)
				.equalToWhenPresent(record::getAdjustStatus).set(adjustType).equalToWhenPresent(record::getAdjustType)
				.set(quantity).equalToWhenPresent(record::getQuantity).set(parQuantity)
				.equalToWhenPresent(record::getParQuantity).set(totalQuantity)
				.equalToWhenPresent(record::getTotalQuantity).set(carryForwardFractionQuantity)
				.equalToWhenPresent(record::getCarryForwardFractionQuantity).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.option_kanban_adjust")
	default int updateByPrimaryKey(OptionKanbanAdjust record) {
		return update(c -> c.set(itemPartOid).equalTo(record::getItemPartOid).set(planDateStringDate)
				.equalTo(record::getPlanDateStringDate).set(startDeliveryDateStringDate)
				.equalTo(record::getStartDeliveryDateStringDate).set(startShipmentNo)
				.equalTo(record::getStartShipmentNo).set(adjustStatus).equalTo(record::getAdjustStatus).set(adjustType)
				.equalTo(record::getAdjustType).set(quantity).equalTo(record::getQuantity).set(parQuantity)
				.equalTo(record::getParQuantity).set(totalQuantity).equalTo(record::getTotalQuantity)
				.set(carryForwardFractionQuantity).equalTo(record::getCarryForwardFractionQuantity)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.option_kanban_adjust")
	default int updateByPrimaryKeySelective(OptionKanbanAdjust record) {
		return update(c -> c.set(itemPartOid).equalToWhenPresent(record::getItemPartOid).set(planDateStringDate)
				.equalToWhenPresent(record::getPlanDateStringDate).set(startDeliveryDateStringDate)
				.equalToWhenPresent(record::getStartDeliveryDateStringDate).set(startShipmentNo)
				.equalToWhenPresent(record::getStartShipmentNo).set(adjustStatus)
				.equalToWhenPresent(record::getAdjustStatus).set(adjustType).equalToWhenPresent(record::getAdjustType)
				.set(quantity).equalToWhenPresent(record::getQuantity).set(parQuantity)
				.equalToWhenPresent(record::getParQuantity).set(totalQuantity)
				.equalToWhenPresent(record::getTotalQuantity).set(carryForwardFractionQuantity)
				.equalToWhenPresent(record::getCarryForwardFractionQuantity).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}