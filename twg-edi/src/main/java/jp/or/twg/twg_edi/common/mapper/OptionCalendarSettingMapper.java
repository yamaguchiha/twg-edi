package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionCalendarSettingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionCalendarSetting;
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
public interface OptionCalendarSettingMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	BasicColumn[] selectList = BasicColumn.columnList(oid, optionCalendarOid, date, operatingInfo, tsRegistererDate,
			tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId,
			tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionCalendarSetting> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionCalendarSetting> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionCalendarSettingResult")
	Optional<OptionCalendarSetting> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionCalendarSettingResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "option_calendar_oid", property = "optionCalendarOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "date", property = "date", jdbcType = JdbcType.DATE),
			@Result(column = "operating_info", property = "operatingInfo", jdbcType = JdbcType.INTEGER),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionCalendarSetting> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionCalendarSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionCalendarSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	default int insert(OptionCalendarSetting record) {
		return MyBatis3Utils.insert(this::insert, record, optionCalendarSetting,
				c -> c.map(oid).toProperty("oid").map(optionCalendarOid).toProperty("optionCalendarOid").map(date)
						.toProperty("date").map(operatingInfo).toProperty("operatingInfo").map(tsRegistererDate)
						.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
						.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
						.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	default int insertMultiple(Collection<OptionCalendarSetting> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionCalendarSetting,
				c -> c.map(oid).toProperty("oid").map(optionCalendarOid).toProperty("optionCalendarOid").map(date)
						.toProperty("date").map(operatingInfo).toProperty("operatingInfo").map(tsRegistererDate)
						.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
						.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
						.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	default int insertSelective(OptionCalendarSetting record) {
		return MyBatis3Utils.insert(this::insert, record, optionCalendarSetting, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(optionCalendarOid)
				.toPropertyWhenPresent("optionCalendarOid", record::getOptionCalendarOid).map(date)
				.toPropertyWhenPresent("date", record::getDate).map(operatingInfo)
				.toPropertyWhenPresent("operatingInfo", record::getOperatingInfo).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	default Optional<OptionCalendarSetting> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionCalendarSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	default List<OptionCalendarSetting> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionCalendarSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	default List<OptionCalendarSetting> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionCalendarSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	default Optional<OptionCalendarSetting> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionCalendarSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionCalendarSetting record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(optionCalendarOid).equalTo(record::getOptionCalendarOid)
				.set(date).equalTo(record::getDate).set(operatingInfo).equalTo(record::getOperatingInfo)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionCalendarSetting record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(optionCalendarOid)
				.equalToWhenPresent(record::getOptionCalendarOid).set(date).equalToWhenPresent(record::getDate)
				.set(operatingInfo).equalToWhenPresent(record::getOperatingInfo).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	default int updateByPrimaryKey(OptionCalendarSetting record) {
		return update(c -> c.set(optionCalendarOid).equalTo(record::getOptionCalendarOid).set(date)
				.equalTo(record::getDate).set(operatingInfo).equalTo(record::getOperatingInfo).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_calendar_setting")
	default int updateByPrimaryKeySelective(OptionCalendarSetting record) {
		return update(c -> c.set(optionCalendarOid).equalToWhenPresent(record::getOptionCalendarOid).set(date)
				.equalToWhenPresent(record::getDate).set(operatingInfo).equalToWhenPresent(record::getOperatingInfo)
				.set(tsRegistererDate).equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}