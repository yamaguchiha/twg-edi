package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionSortConfigDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionSortConfig;
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
public interface OptionSortConfigMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	BasicColumn[] selectList = BasicColumn.columnList(oid, usersOid, pageId, viewTabType, parameter, tsRegistererDate,
			tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId,
			tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionSortConfig> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionSortConfig> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionSortConfigResult")
	Optional<OptionSortConfig> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionSortConfigResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "users_oid", property = "usersOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "page_id", property = "pageId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "view_tab_type", property = "viewTabType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "parameter", property = "parameter", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionSortConfig> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionSortConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionSortConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default int insert(OptionSortConfig record) {
		return MyBatis3Utils.insert(this::insert, record, optionSortConfig,
				c -> c.map(oid).toProperty("oid").map(usersOid).toProperty("usersOid").map(pageId).toProperty("pageId")
						.map(viewTabType).toProperty("viewTabType").map(parameter).toProperty("parameter")
						.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
						.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default int insertMultiple(Collection<OptionSortConfig> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionSortConfig,
				c -> c.map(oid).toProperty("oid").map(usersOid).toProperty("usersOid").map(pageId).toProperty("pageId")
						.map(viewTabType).toProperty("viewTabType").map(parameter).toProperty("parameter")
						.map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
						.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default int insertSelective(OptionSortConfig record) {
		return MyBatis3Utils.insert(this::insert, record, optionSortConfig, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(usersOid)
				.toPropertyWhenPresent("usersOid", record::getUsersOid).map(pageId)
				.toPropertyWhenPresent("pageId", record::getPageId).map(viewTabType)
				.toPropertyWhenPresent("viewTabType", record::getViewTabType).map(parameter)
				.toPropertyWhenPresent("parameter", record::getParameter).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default Optional<OptionSortConfig> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionSortConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default List<OptionSortConfig> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionSortConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default List<OptionSortConfig> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionSortConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default Optional<OptionSortConfig> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionSortConfig, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionSortConfig record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(usersOid).equalTo(record::getUsersOid).set(pageId)
				.equalTo(record::getPageId).set(viewTabType).equalTo(record::getViewTabType).set(parameter)
				.equalTo(record::getParameter).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source Table: public.option_sort_config")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionSortConfig record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(usersOid).equalToWhenPresent(record::getUsersOid)
				.set(pageId).equalToWhenPresent(record::getPageId).set(viewTabType)
				.equalToWhenPresent(record::getViewTabType).set(parameter).equalToWhenPresent(record::getParameter)
				.set(tsRegistererDate).equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source Table: public.option_sort_config")
	default int updateByPrimaryKey(OptionSortConfig record) {
		return update(c -> c.set(usersOid).equalTo(record::getUsersOid).set(pageId).equalTo(record::getPageId)
				.set(viewTabType).equalTo(record::getViewTabType).set(parameter).equalTo(record::getParameter)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source Table: public.option_sort_config")
	default int updateByPrimaryKeySelective(OptionSortConfig record) {
		return update(c -> c.set(usersOid).equalToWhenPresent(record::getUsersOid).set(pageId)
				.equalToWhenPresent(record::getPageId).set(viewTabType).equalToWhenPresent(record::getViewTabType)
				.set(parameter).equalToWhenPresent(record::getParameter).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}