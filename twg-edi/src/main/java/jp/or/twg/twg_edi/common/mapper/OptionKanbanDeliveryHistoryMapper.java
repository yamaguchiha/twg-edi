package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionKanbanDeliveryHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionKanbanDeliveryHistory;
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
public interface OptionKanbanDeliveryHistoryMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	BasicColumn[] selectList = BasicColumn.columnList(oid, placeStOid, itemPartOid, deliveryDateStringDate, shipmentNo,
			deliveryProcessingDateStringDate, processingDateTime, processingShipmentNo, itemA04Desc, docRefIdAau,
			deliveryBox, deliveryQuantity, rollQuantity, readQuantity, adjustQuantity, orderStopQuantity,
			tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId,
			tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionKanbanDeliveryHistory> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionKanbanDeliveryHistory> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionKanbanDeliveryHistoryResult")
	Optional<OptionKanbanDeliveryHistory> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionKanbanDeliveryHistoryResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "item_part_oid", property = "itemPartOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "delivery_date_string_date", property = "deliveryDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "shipment_no", property = "shipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "delivery_processing_date_string_date", property = "deliveryProcessingDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "processing_date_time", property = "processingDateTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "processing_shipment_no", property = "processingShipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "item_a04_desc", property = "itemA04Desc", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_id_aau", property = "docRefIdAau", jdbcType = JdbcType.VARCHAR),
			@Result(column = "delivery_box", property = "deliveryBox", jdbcType = JdbcType.INTEGER),
			@Result(column = "delivery_quantity", property = "deliveryQuantity", jdbcType = JdbcType.INTEGER),
			@Result(column = "roll_quantity", property = "rollQuantity", jdbcType = JdbcType.INTEGER),
			@Result(column = "read_quantity", property = "readQuantity", jdbcType = JdbcType.INTEGER),
			@Result(column = "adjust_quantity", property = "adjustQuantity", jdbcType = JdbcType.INTEGER),
			@Result(column = "order_stop_quantity", property = "orderStopQuantity", jdbcType = JdbcType.INTEGER),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionKanbanDeliveryHistory> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default int insert(OptionKanbanDeliveryHistory record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanDeliveryHistory,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(itemPartOid)
						.toProperty("itemPartOid").map(deliveryDateStringDate).toProperty("deliveryDateStringDate")
						.map(shipmentNo).toProperty("shipmentNo").map(deliveryProcessingDateStringDate)
						.toProperty("deliveryProcessingDateStringDate").map(processingDateTime)
						.toProperty("processingDateTime").map(processingShipmentNo).toProperty("processingShipmentNo")
						.map(itemA04Desc).toProperty("itemA04Desc").map(docRefIdAau).toProperty("docRefIdAau")
						.map(deliveryBox).toProperty("deliveryBox").map(deliveryQuantity).toProperty("deliveryQuantity")
						.map(rollQuantity).toProperty("rollQuantity").map(readQuantity).toProperty("readQuantity")
						.map(adjustQuantity).toProperty("adjustQuantity").map(orderStopQuantity)
						.toProperty("orderStopQuantity").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default int insertMultiple(Collection<OptionKanbanDeliveryHistory> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionKanbanDeliveryHistory,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(itemPartOid)
						.toProperty("itemPartOid").map(deliveryDateStringDate).toProperty("deliveryDateStringDate")
						.map(shipmentNo).toProperty("shipmentNo").map(deliveryProcessingDateStringDate)
						.toProperty("deliveryProcessingDateStringDate").map(processingDateTime)
						.toProperty("processingDateTime").map(processingShipmentNo).toProperty("processingShipmentNo")
						.map(itemA04Desc).toProperty("itemA04Desc").map(docRefIdAau).toProperty("docRefIdAau")
						.map(deliveryBox).toProperty("deliveryBox").map(deliveryQuantity).toProperty("deliveryQuantity")
						.map(rollQuantity).toProperty("rollQuantity").map(readQuantity).toProperty("readQuantity")
						.map(adjustQuantity).toProperty("adjustQuantity").map(orderStopQuantity)
						.toProperty("orderStopQuantity").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default int insertSelective(OptionKanbanDeliveryHistory record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanDeliveryHistory, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(placeStOid)
				.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(itemPartOid)
				.toPropertyWhenPresent("itemPartOid", record::getItemPartOid).map(deliveryDateStringDate)
				.toPropertyWhenPresent("deliveryDateStringDate", record::getDeliveryDateStringDate).map(shipmentNo)
				.toPropertyWhenPresent("shipmentNo", record::getShipmentNo).map(deliveryProcessingDateStringDate)
				.toPropertyWhenPresent("deliveryProcessingDateStringDate", record::getDeliveryProcessingDateStringDate)
				.map(processingDateTime).toPropertyWhenPresent("processingDateTime", record::getProcessingDateTime)
				.map(processingShipmentNo)
				.toPropertyWhenPresent("processingShipmentNo", record::getProcessingShipmentNo).map(itemA04Desc)
				.toPropertyWhenPresent("itemA04Desc", record::getItemA04Desc).map(docRefIdAau)
				.toPropertyWhenPresent("docRefIdAau", record::getDocRefIdAau).map(deliveryBox)
				.toPropertyWhenPresent("deliveryBox", record::getDeliveryBox).map(deliveryQuantity)
				.toPropertyWhenPresent("deliveryQuantity", record::getDeliveryQuantity).map(rollQuantity)
				.toPropertyWhenPresent("rollQuantity", record::getRollQuantity).map(readQuantity)
				.toPropertyWhenPresent("readQuantity", record::getReadQuantity).map(adjustQuantity)
				.toPropertyWhenPresent("adjustQuantity", record::getAdjustQuantity).map(orderStopQuantity)
				.toPropertyWhenPresent("orderStopQuantity", record::getOrderStopQuantity).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default Optional<OptionKanbanDeliveryHistory> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default List<OptionKanbanDeliveryHistory> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default List<OptionKanbanDeliveryHistory> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default Optional<OptionKanbanDeliveryHistory> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionKanbanDeliveryHistory, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionKanbanDeliveryHistory record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(placeStOid).equalTo(record::getPlaceStOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate)
				.set(shipmentNo).equalTo(record::getShipmentNo).set(deliveryProcessingDateStringDate)
				.equalTo(record::getDeliveryProcessingDateStringDate).set(processingDateTime)
				.equalTo(record::getProcessingDateTime).set(processingShipmentNo)
				.equalTo(record::getProcessingShipmentNo).set(itemA04Desc).equalTo(record::getItemA04Desc)
				.set(docRefIdAau).equalTo(record::getDocRefIdAau).set(deliveryBox).equalTo(record::getDeliveryBox)
				.set(deliveryQuantity).equalTo(record::getDeliveryQuantity).set(rollQuantity)
				.equalTo(record::getRollQuantity).set(readQuantity).equalTo(record::getReadQuantity).set(adjustQuantity)
				.equalTo(record::getAdjustQuantity).set(orderStopQuantity).equalTo(record::getOrderStopQuantity)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionKanbanDeliveryHistory record,
			UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(itemPartOid).equalToWhenPresent(record::getItemPartOid).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(shipmentNo)
				.equalToWhenPresent(record::getShipmentNo).set(deliveryProcessingDateStringDate)
				.equalToWhenPresent(record::getDeliveryProcessingDateStringDate).set(processingDateTime)
				.equalToWhenPresent(record::getProcessingDateTime).set(processingShipmentNo)
				.equalToWhenPresent(record::getProcessingShipmentNo).set(itemA04Desc)
				.equalToWhenPresent(record::getItemA04Desc).set(docRefIdAau).equalToWhenPresent(record::getDocRefIdAau)
				.set(deliveryBox).equalToWhenPresent(record::getDeliveryBox).set(deliveryQuantity)
				.equalToWhenPresent(record::getDeliveryQuantity).set(rollQuantity)
				.equalToWhenPresent(record::getRollQuantity).set(readQuantity)
				.equalToWhenPresent(record::getReadQuantity).set(adjustQuantity)
				.equalToWhenPresent(record::getAdjustQuantity).set(orderStopQuantity)
				.equalToWhenPresent(record::getOrderStopQuantity).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default int updateByPrimaryKey(OptionKanbanDeliveryHistory record) {
		return update(c -> c.set(placeStOid).equalTo(record::getPlaceStOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate)
				.set(shipmentNo).equalTo(record::getShipmentNo).set(deliveryProcessingDateStringDate)
				.equalTo(record::getDeliveryProcessingDateStringDate).set(processingDateTime)
				.equalTo(record::getProcessingDateTime).set(processingShipmentNo)
				.equalTo(record::getProcessingShipmentNo).set(itemA04Desc).equalTo(record::getItemA04Desc)
				.set(docRefIdAau).equalTo(record::getDocRefIdAau).set(deliveryBox).equalTo(record::getDeliveryBox)
				.set(deliveryQuantity).equalTo(record::getDeliveryQuantity).set(rollQuantity)
				.equalTo(record::getRollQuantity).set(readQuantity).equalTo(record::getReadQuantity).set(adjustQuantity)
				.equalTo(record::getAdjustQuantity).set(orderStopQuantity).equalTo(record::getOrderStopQuantity)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4963102+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	default int updateByPrimaryKeySelective(OptionKanbanDeliveryHistory record) {
		return update(c -> c.set(placeStOid).equalToWhenPresent(record::getPlaceStOid).set(itemPartOid)
				.equalToWhenPresent(record::getItemPartOid).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(shipmentNo)
				.equalToWhenPresent(record::getShipmentNo).set(deliveryProcessingDateStringDate)
				.equalToWhenPresent(record::getDeliveryProcessingDateStringDate).set(processingDateTime)
				.equalToWhenPresent(record::getProcessingDateTime).set(processingShipmentNo)
				.equalToWhenPresent(record::getProcessingShipmentNo).set(itemA04Desc)
				.equalToWhenPresent(record::getItemA04Desc).set(docRefIdAau).equalToWhenPresent(record::getDocRefIdAau)
				.set(deliveryBox).equalToWhenPresent(record::getDeliveryBox).set(deliveryQuantity)
				.equalToWhenPresent(record::getDeliveryQuantity).set(rollQuantity)
				.equalToWhenPresent(record::getRollQuantity).set(readQuantity)
				.equalToWhenPresent(record::getReadQuantity).set(adjustQuantity)
				.equalToWhenPresent(record::getAdjustQuantity).set(orderStopQuantity)
				.equalToWhenPresent(record::getOrderStopQuantity).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}