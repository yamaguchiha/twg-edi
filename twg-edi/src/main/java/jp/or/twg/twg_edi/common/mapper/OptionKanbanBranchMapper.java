package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionKanbanBranchDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionKanbanBranch;
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
public interface OptionKanbanBranchMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	BasicColumn[] selectList = BasicColumn.columnList(oid, placeStOid, itemPartOid, deliveryDateStringDate, shipmentNo,
			itemA04Desc, docRefIdAau, branchNo, branchStatus, readDateTime, readCount, processingDateTime,
			processingShipmentNo, printType, tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId,
			tsLastModifiedDate, tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionKanbanBranch> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionKanbanBranch> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionKanbanBranchResult")
	Optional<OptionKanbanBranch> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionKanbanBranchResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "item_part_oid", property = "itemPartOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "delivery_date_string_date", property = "deliveryDateStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "shipment_no", property = "shipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "item_a04_desc", property = "itemA04Desc", jdbcType = JdbcType.VARCHAR),
			@Result(column = "doc_ref_id_aau", property = "docRefIdAau", jdbcType = JdbcType.VARCHAR),
			@Result(column = "branch_no", property = "branchNo", jdbcType = JdbcType.BIGINT),
			@Result(column = "branch_status", property = "branchStatus", jdbcType = JdbcType.INTEGER),
			@Result(column = "read_date_time", property = "readDateTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "read_count", property = "readCount", jdbcType = JdbcType.INTEGER),
			@Result(column = "processing_date_time", property = "processingDateTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "processing_shipment_no", property = "processingShipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "print_type", property = "printType", jdbcType = JdbcType.INTEGER),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionKanbanBranch> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionKanbanBranch, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionKanbanBranch, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default int insert(OptionKanbanBranch record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanBranch,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(itemPartOid)
						.toProperty("itemPartOid").map(deliveryDateStringDate).toProperty("deliveryDateStringDate")
						.map(shipmentNo).toProperty("shipmentNo").map(itemA04Desc).toProperty("itemA04Desc")
						.map(docRefIdAau).toProperty("docRefIdAau").map(branchNo).toProperty("branchNo")
						.map(branchStatus).toProperty("branchStatus").map(readDateTime).toProperty("readDateTime")
						.map(readCount).toProperty("readCount").map(processingDateTime).toProperty("processingDateTime")
						.map(processingShipmentNo).toProperty("processingShipmentNo").map(printType)
						.toProperty("printType").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default int insertMultiple(Collection<OptionKanbanBranch> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionKanbanBranch,
				c -> c.map(oid).toProperty("oid").map(placeStOid).toProperty("placeStOid").map(itemPartOid)
						.toProperty("itemPartOid").map(deliveryDateStringDate).toProperty("deliveryDateStringDate")
						.map(shipmentNo).toProperty("shipmentNo").map(itemA04Desc).toProperty("itemA04Desc")
						.map(docRefIdAau).toProperty("docRefIdAau").map(branchNo).toProperty("branchNo")
						.map(branchStatus).toProperty("branchStatus").map(readDateTime).toProperty("readDateTime")
						.map(readCount).toProperty("readCount").map(processingDateTime).toProperty("processingDateTime")
						.map(processingShipmentNo).toProperty("processingShipmentNo").map(printType)
						.toProperty("printType").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default int insertSelective(OptionKanbanBranch record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanBranch, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(placeStOid)
				.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(itemPartOid)
				.toPropertyWhenPresent("itemPartOid", record::getItemPartOid).map(deliveryDateStringDate)
				.toPropertyWhenPresent("deliveryDateStringDate", record::getDeliveryDateStringDate).map(shipmentNo)
				.toPropertyWhenPresent("shipmentNo", record::getShipmentNo).map(itemA04Desc)
				.toPropertyWhenPresent("itemA04Desc", record::getItemA04Desc).map(docRefIdAau)
				.toPropertyWhenPresent("docRefIdAau", record::getDocRefIdAau).map(branchNo)
				.toPropertyWhenPresent("branchNo", record::getBranchNo).map(branchStatus)
				.toPropertyWhenPresent("branchStatus", record::getBranchStatus).map(readDateTime)
				.toPropertyWhenPresent("readDateTime", record::getReadDateTime).map(readCount)
				.toPropertyWhenPresent("readCount", record::getReadCount).map(processingDateTime)
				.toPropertyWhenPresent("processingDateTime", record::getProcessingDateTime).map(processingShipmentNo)
				.toPropertyWhenPresent("processingShipmentNo", record::getProcessingShipmentNo).map(printType)
				.toPropertyWhenPresent("printType", record::getPrintType).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default Optional<OptionKanbanBranch> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionKanbanBranch, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default List<OptionKanbanBranch> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionKanbanBranch, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default List<OptionKanbanBranch> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionKanbanBranch, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default Optional<OptionKanbanBranch> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionKanbanBranch, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionKanbanBranch record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(placeStOid).equalTo(record::getPlaceStOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate)
				.set(shipmentNo).equalTo(record::getShipmentNo).set(itemA04Desc).equalTo(record::getItemA04Desc)
				.set(docRefIdAau).equalTo(record::getDocRefIdAau).set(branchNo).equalTo(record::getBranchNo)
				.set(branchStatus).equalTo(record::getBranchStatus).set(readDateTime).equalTo(record::getReadDateTime)
				.set(readCount).equalTo(record::getReadCount).set(processingDateTime)
				.equalTo(record::getProcessingDateTime).set(processingShipmentNo)
				.equalTo(record::getProcessingShipmentNo).set(printType).equalTo(record::getPrintType)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionKanbanBranch record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(itemPartOid).equalToWhenPresent(record::getItemPartOid).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(shipmentNo)
				.equalToWhenPresent(record::getShipmentNo).set(itemA04Desc).equalToWhenPresent(record::getItemA04Desc)
				.set(docRefIdAau).equalToWhenPresent(record::getDocRefIdAau).set(branchNo)
				.equalToWhenPresent(record::getBranchNo).set(branchStatus).equalToWhenPresent(record::getBranchStatus)
				.set(readDateTime).equalToWhenPresent(record::getReadDateTime).set(readCount)
				.equalToWhenPresent(record::getReadCount).set(processingDateTime)
				.equalToWhenPresent(record::getProcessingDateTime).set(processingShipmentNo)
				.equalToWhenPresent(record::getProcessingShipmentNo).set(printType)
				.equalToWhenPresent(record::getPrintType).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.option_kanban_branch")
	default int updateByPrimaryKey(OptionKanbanBranch record) {
		return update(c -> c.set(placeStOid).equalTo(record::getPlaceStOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(deliveryDateStringDate).equalTo(record::getDeliveryDateStringDate)
				.set(shipmentNo).equalTo(record::getShipmentNo).set(itemA04Desc).equalTo(record::getItemA04Desc)
				.set(docRefIdAau).equalTo(record::getDocRefIdAau).set(branchNo).equalTo(record::getBranchNo)
				.set(branchStatus).equalTo(record::getBranchStatus).set(readDateTime).equalTo(record::getReadDateTime)
				.set(readCount).equalTo(record::getReadCount).set(processingDateTime)
				.equalTo(record::getProcessingDateTime).set(processingShipmentNo)
				.equalTo(record::getProcessingShipmentNo).set(printType).equalTo(record::getPrintType)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.option_kanban_branch")
	default int updateByPrimaryKeySelective(OptionKanbanBranch record) {
		return update(c -> c.set(placeStOid).equalToWhenPresent(record::getPlaceStOid).set(itemPartOid)
				.equalToWhenPresent(record::getItemPartOid).set(deliveryDateStringDate)
				.equalToWhenPresent(record::getDeliveryDateStringDate).set(shipmentNo)
				.equalToWhenPresent(record::getShipmentNo).set(itemA04Desc).equalToWhenPresent(record::getItemA04Desc)
				.set(docRefIdAau).equalToWhenPresent(record::getDocRefIdAau).set(branchNo)
				.equalToWhenPresent(record::getBranchNo).set(branchStatus).equalToWhenPresent(record::getBranchStatus)
				.set(readDateTime).equalToWhenPresent(record::getReadDateTime).set(readCount)
				.equalToWhenPresent(record::getReadCount).set(processingDateTime)
				.equalToWhenPresent(record::getProcessingDateTime).set(processingShipmentNo)
				.equalToWhenPresent(record::getProcessingShipmentNo).set(printType)
				.equalToWhenPresent(record::getPrintType).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}