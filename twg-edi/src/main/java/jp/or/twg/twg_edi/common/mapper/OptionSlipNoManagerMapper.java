package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionSlipNoManagerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionSlipNoManager;
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
public interface OptionSlipNoManagerMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	BasicColumn[] selectList = BasicColumn.columnList(oid, managerType, placeStOid, slipNo01, slipNo02,
			tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId,
			tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionSlipNoManager> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionSlipNoManager> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionSlipNoManagerResult")
	Optional<OptionSlipNoManager> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionSlipNoManagerResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "manager_type", property = "managerType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "slip_no_01", property = "slipNo01", jdbcType = JdbcType.BIGINT),
			@Result(column = "slip_no_02", property = "slipNo02", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionSlipNoManager> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionSlipNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionSlipNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default int insert(OptionSlipNoManager record) {
		return MyBatis3Utils.insert(this::insert, record, optionSlipNoManager,
				c -> c.map(oid).toProperty("oid").map(managerType).toProperty("managerType").map(placeStOid)
						.toProperty("placeStOid").map(slipNo01).toProperty("slipNo01").map(slipNo02)
						.toProperty("slipNo02").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default int insertMultiple(Collection<OptionSlipNoManager> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionSlipNoManager,
				c -> c.map(oid).toProperty("oid").map(managerType).toProperty("managerType").map(placeStOid)
						.toProperty("placeStOid").map(slipNo01).toProperty("slipNo01").map(slipNo02)
						.toProperty("slipNo02").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default int insertSelective(OptionSlipNoManager record) {
		return MyBatis3Utils.insert(this::insert, record, optionSlipNoManager, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(managerType)
				.toPropertyWhenPresent("managerType", record::getManagerType).map(placeStOid)
				.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(slipNo01)
				.toPropertyWhenPresent("slipNo01", record::getSlipNo01).map(slipNo02)
				.toPropertyWhenPresent("slipNo02", record::getSlipNo02).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default Optional<OptionSlipNoManager> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionSlipNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default List<OptionSlipNoManager> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionSlipNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default List<OptionSlipNoManager> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionSlipNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default Optional<OptionSlipNoManager> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionSlipNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionSlipNoManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(managerType).equalTo(record::getManagerType).set(placeStOid)
				.equalTo(record::getPlaceStOid).set(slipNo01).equalTo(record::getSlipNo01).set(slipNo02)
				.equalTo(record::getSlipNo02).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionSlipNoManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(managerType)
				.equalToWhenPresent(record::getManagerType).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(slipNo01).equalToWhenPresent(record::getSlipNo01).set(slipNo02)
				.equalToWhenPresent(record::getSlipNo02).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default int updateByPrimaryKey(OptionSlipNoManager record) {
		return update(c -> c.set(managerType).equalTo(record::getManagerType).set(placeStOid)
				.equalTo(record::getPlaceStOid).set(slipNo01).equalTo(record::getSlipNo01).set(slipNo02)
				.equalTo(record::getSlipNo02).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	default int updateByPrimaryKeySelective(OptionSlipNoManager record) {
		return update(c -> c.set(managerType).equalToWhenPresent(record::getManagerType).set(placeStOid)
				.equalToWhenPresent(record::getPlaceStOid).set(slipNo01).equalToWhenPresent(record::getSlipNo01)
				.set(slipNo02).equalToWhenPresent(record::getSlipNo02).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}