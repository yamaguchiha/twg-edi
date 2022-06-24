package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionKanbanReadHistoryItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionKanbanReadHistoryItem;
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
public interface OptionKanbanReadHistoryItemMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	BasicColumn[] selectList = BasicColumn.columnList(oid, kanbanReadHistoryOid, itemPartOid, rollQuantity,
			readQuantity, tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate,
			tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionKanbanReadHistoryItem> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionKanbanReadHistoryItem> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionKanbanReadHistoryItemResult")
	Optional<OptionKanbanReadHistoryItem> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionKanbanReadHistoryItemResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "kanban_read_history_oid", property = "kanbanReadHistoryOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "item_part_oid", property = "itemPartOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "roll_quantity", property = "rollQuantity", jdbcType = JdbcType.INTEGER),
			@Result(column = "read_quantity", property = "readQuantity", jdbcType = JdbcType.INTEGER),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionKanbanReadHistoryItem> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionKanbanReadHistoryItem, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionKanbanReadHistoryItem, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default int insert(OptionKanbanReadHistoryItem record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanReadHistoryItem,
				c -> c.map(oid).toProperty("oid").map(kanbanReadHistoryOid).toProperty("kanbanReadHistoryOid")
						.map(itemPartOid).toProperty("itemPartOid").map(rollQuantity).toProperty("rollQuantity")
						.map(readQuantity).toProperty("readQuantity").map(tsRegistererDate)
						.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
						.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
						.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default int insertMultiple(Collection<OptionKanbanReadHistoryItem> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionKanbanReadHistoryItem,
				c -> c.map(oid).toProperty("oid").map(kanbanReadHistoryOid).toProperty("kanbanReadHistoryOid")
						.map(itemPartOid).toProperty("itemPartOid").map(rollQuantity).toProperty("rollQuantity")
						.map(readQuantity).toProperty("readQuantity").map(tsRegistererDate)
						.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
						.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
						.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default int insertSelective(OptionKanbanReadHistoryItem record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanReadHistoryItem, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(kanbanReadHistoryOid)
				.toPropertyWhenPresent("kanbanReadHistoryOid", record::getKanbanReadHistoryOid).map(itemPartOid)
				.toPropertyWhenPresent("itemPartOid", record::getItemPartOid).map(rollQuantity)
				.toPropertyWhenPresent("rollQuantity", record::getRollQuantity).map(readQuantity)
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

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default Optional<OptionKanbanReadHistoryItem> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionKanbanReadHistoryItem, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default List<OptionKanbanReadHistoryItem> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionKanbanReadHistoryItem, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default List<OptionKanbanReadHistoryItem> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionKanbanReadHistoryItem, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default Optional<OptionKanbanReadHistoryItem> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionKanbanReadHistoryItem, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionKanbanReadHistoryItem record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(kanbanReadHistoryOid).equalTo(record::getKanbanReadHistoryOid)
				.set(itemPartOid).equalTo(record::getItemPartOid).set(rollQuantity).equalTo(record::getRollQuantity)
				.set(readQuantity).equalTo(record::getReadQuantity).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionKanbanReadHistoryItem record,
			UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(kanbanReadHistoryOid)
				.equalToWhenPresent(record::getKanbanReadHistoryOid).set(itemPartOid)
				.equalToWhenPresent(record::getItemPartOid).set(rollQuantity)
				.equalToWhenPresent(record::getRollQuantity).set(readQuantity)
				.equalToWhenPresent(record::getReadQuantity).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default int updateByPrimaryKey(OptionKanbanReadHistoryItem record) {
		return update(c -> c.set(kanbanReadHistoryOid).equalTo(record::getKanbanReadHistoryOid).set(itemPartOid)
				.equalTo(record::getItemPartOid).set(rollQuantity).equalTo(record::getRollQuantity).set(readQuantity)
				.equalTo(record::getReadQuantity).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.519248+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	default int updateByPrimaryKeySelective(OptionKanbanReadHistoryItem record) {
		return update(c -> c.set(kanbanReadHistoryOid).equalToWhenPresent(record::getKanbanReadHistoryOid)
				.set(itemPartOid).equalToWhenPresent(record::getItemPartOid).set(rollQuantity)
				.equalToWhenPresent(record::getRollQuantity).set(readQuantity)
				.equalToWhenPresent(record::getReadQuantity).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}