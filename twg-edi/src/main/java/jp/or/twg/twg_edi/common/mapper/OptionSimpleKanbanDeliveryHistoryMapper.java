package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionSimpleKanbanDeliveryHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionSimpleKanbanDeliveryHistory;
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
public interface OptionSimpleKanbanDeliveryHistoryMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	BasicColumn[] selectList = BasicColumn.columnList(oid, placeStOid, itemPartOid, deliveryDateStringDate, shipmentNo,
			processingDateTime, processingShipmentNo, docRefIdAau, deliveryBox, deliveryQuantity, threadId,
			tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId,
			tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionSimpleKanbanDeliveryHistory> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionSimpleKanbanDeliveryHistory> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionSimpleKanbanDeliveryHistoryResult")
	Optional<OptionSimpleKanbanDeliveryHistory> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionSimpleKanbanDeliveryHistoryResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "item_part_oid", property = "itemPartOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "delivery_date_string_date", property = "deliveryDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "shipment_no", property = "shipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "processing_date_time", property = "processingDateTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "processing_shipment_no", property = "processingShipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "doc_ref_id_aau", property = "docRefIdAau", jdbcType = JdbcType.VARCHAR),
			@Result(column = "delivery_box", property = "deliveryBox", jdbcType = JdbcType.INTEGER),
			@Result(column = "delivery_quantity", property = "deliveryQuantity", jdbcType = JdbcType.INTEGER),
			@Result(column = "thread_id", property = "threadId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionSimpleKanbanDeliveryHistory> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionSimpleKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionSimpleKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default int insert(OptionSimpleKanbanDeliveryHistory record) {
		return MyBatis3Utils.insert(this::insert, record, optionSimpleKanbanDeliveryHistory,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(itemPartOid)
						.toProperty("itemPartOid").map(deliveryDateStringDate).toProperty("deliveryDateStringDate")
						.map(shipmentNo).toProperty("shipmentNo").map(processingDateTime)
						.toProperty("processingDateTime").map(processingShipmentNo).toProperty("processingShipmentNo")
						.map(docRefIdAau).toProperty("docRefIdAau").map(deliveryBox).toProperty("deliveryBox")
						.map(deliveryQuantity).toProperty("deliveryQuantity").map(threadId).toProperty("threadId")
						.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
						.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default int insertMultiple(Collection<OptionSimpleKanbanDeliveryHistory> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionSimpleKanbanDeliveryHistory,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(itemPartOid)
						.toProperty("itemPartOid").map(deliveryDateStringDate).toProperty("deliveryDateStringDate")
						.map(shipmentNo).toProperty("shipmentNo").map(processingDateTime)
						.toProperty("processingDateTime").map(processingShipmentNo).toProperty("processingShipmentNo")
						.map(docRefIdAau).toProperty("docRefIdAau").map(deliveryBox).toProperty("deliveryBox")
						.map(deliveryQuantity).toProperty("deliveryQuantity").map(threadId).toProperty("threadId")
						.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
						.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default int insertSelective(OptionSimpleKanbanDeliveryHistory record) {
		return MyBatis3Utils.insert(this::insert, record, optionSimpleKanbanDeliveryHistory, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(placeStOid)
				.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(itemPartOid)
				.toPropertyWhenPresent("itemPartOid", record::getItemPartOid).map(deliveryDateStringDate)
				.toPropertyWhenPresent("deliveryDateStringDate", record::getDeliveryDateStringDate).map(shipmentNo)
				.toPropertyWhenPresent("shipmentNo", record::getShipmentNo).map(processingDateTime)
				.toPropertyWhenPresent("processingDateTime", record::getProcessingDateTime).map(processingShipmentNo)
				.toPropertyWhenPresent("processingShipmentNo", record::getProcessingShipmentNo).map(docRefIdAau)
				.toPropertyWhenPresent("docRefIdAau", record::getDocRefIdAau).map(deliveryBox)
				.toPropertyWhenPresent("deliveryBox", record::getDeliveryBox).map(deliveryQuantity)
				.toPropertyWhenPresent("deliveryQuantity", record::getDeliveryQuantity).map(threadId)
				.toPropertyWhenPresent("threadId", record::getThreadId).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default Optional<OptionSimpleKanbanDeliveryHistory> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionSimpleKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default List<OptionSimpleKanbanDeliveryHistory> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionSimpleKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default List<OptionSimpleKanbanDeliveryHistory> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionSimpleKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default Optional<OptionSimpleKanbanDeliveryHistory> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionSimpleKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionSimpleKanbanDeliveryHistory record,
			UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(placeStOid).equalTo(record::getPlaceStOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate)
				.set(shipmentNo).equalTo(record::getShipmentNo).set(processingDateTime)
				.equalTo(record::getProcessingDateTime).set(processingShipmentNo)
				.equalTo(record::getProcessingShipmentNo).set(docRefIdAau).equalTo(record::getDocRefIdAau)
				.set(deliveryBox).equalTo(record::getDeliveryBox).set(deliveryQuantity)
				.equalTo(record::getDeliveryQuantity).set(threadId).equalTo(record::getThreadId).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionSimpleKanbanDeliveryHistory record,
			UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(itemPartOid).equalToWhenPresent(record::getItemPartOid).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(shipmentNo)
				.equalToWhenPresent(record::getShipmentNo).set(processingDateTime)
				.equalToWhenPresent(record::getProcessingDateTime).set(processingShipmentNo)
				.equalToWhenPresent(record::getProcessingShipmentNo).set(docRefIdAau)
				.equalToWhenPresent(record::getDocRefIdAau).set(deliveryBox).equalToWhenPresent(record::getDeliveryBox)
				.set(deliveryQuantity).equalToWhenPresent(record::getDeliveryQuantity).set(threadId)
				.equalToWhenPresent(record::getThreadId).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default int updateByPrimaryKey(OptionSimpleKanbanDeliveryHistory record) {
		return update(c -> c.set(placeStOid).equalTo(record::getPlaceStOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate)
				.set(shipmentNo).equalTo(record::getShipmentNo).set(processingDateTime)
				.equalTo(record::getProcessingDateTime).set(processingShipmentNo)
				.equalTo(record::getProcessingShipmentNo).set(docRefIdAau).equalTo(record::getDocRefIdAau)
				.set(deliveryBox).equalTo(record::getDeliveryBox).set(deliveryQuantity)
				.equalTo(record::getDeliveryQuantity).set(threadId).equalTo(record::getThreadId).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	default int updateByPrimaryKeySelective(OptionSimpleKanbanDeliveryHistory record) {
		return update(c -> c.set(placeStOid).equalToWhenPresent(record::getPlaceStOid).set(itemPartOid)
				.equalToWhenPresent(record::getItemPartOid).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(shipmentNo)
				.equalToWhenPresent(record::getShipmentNo).set(processingDateTime)
				.equalToWhenPresent(record::getProcessingDateTime).set(processingShipmentNo)
				.equalToWhenPresent(record::getProcessingShipmentNo).set(docRefIdAau)
				.equalToWhenPresent(record::getDocRefIdAau).set(deliveryBox).equalToWhenPresent(record::getDeliveryBox)
				.set(deliveryQuantity).equalToWhenPresent(record::getDeliveryQuantity).set(threadId)
				.equalToWhenPresent(record::getThreadId).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}