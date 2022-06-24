package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionShipmentSettingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionShipmentSetting;
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
public interface OptionShipmentSettingMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	BasicColumn[] selectList = BasicColumn.columnList(oid, optionShipmentOid, placeOfDischargeId, placeSfOid,
			processingNo, processingDateType, tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId,
			tsLastModifiedDate, tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionShipmentSetting> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionShipmentSetting> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionShipmentSettingResult")
	Optional<OptionShipmentSetting> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionShipmentSettingResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "option_shipment_oid", property = "optionShipmentOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_of_discharge_id", property = "placeOfDischargeId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_sf_oid", property = "placeSfOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "processing_no", property = "processingNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "processing_date_type", property = "processingDateType", jdbcType = JdbcType.INTEGER),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<OptionShipmentSetting> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionShipmentSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionShipmentSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default int insert(OptionShipmentSetting record) {
		return MyBatis3Utils.insert(this::insert, record, optionShipmentSetting,
				c -> c.map(oid).toProperty("oid").map(optionShipmentOid).toProperty("optionShipmentOid")
						.map(placeOfDischargeId).toProperty("placeOfDischargeId").map(placeSfOid)
						.toProperty("placeSfOid").map(processingNo).toProperty("processingNo").map(processingDateType)
						.toProperty("processingDateType").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default int insertMultiple(Collection<OptionShipmentSetting> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionShipmentSetting,
				c -> c.map(oid).toProperty("oid").map(optionShipmentOid).toProperty("optionShipmentOid")
						.map(placeOfDischargeId).toProperty("placeOfDischargeId").map(placeSfOid)
						.toProperty("placeSfOid").map(processingNo).toProperty("processingNo").map(processingDateType)
						.toProperty("processingDateType").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default int insertSelective(OptionShipmentSetting record) {
		return MyBatis3Utils.insert(this::insert, record, optionShipmentSetting, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(optionShipmentOid)
				.toPropertyWhenPresent("optionShipmentOid", record::getOptionShipmentOid).map(placeOfDischargeId)
				.toPropertyWhenPresent("placeOfDischargeId", record::getPlaceOfDischargeId).map(placeSfOid)
				.toPropertyWhenPresent("placeSfOid", record::getPlaceSfOid).map(processingNo)
				.toPropertyWhenPresent("processingNo", record::getProcessingNo).map(processingDateType)
				.toPropertyWhenPresent("processingDateType", record::getProcessingDateType).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default Optional<OptionShipmentSetting> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionShipmentSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default List<OptionShipmentSetting> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionShipmentSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default List<OptionShipmentSetting> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionShipmentSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default Optional<OptionShipmentSetting> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionShipmentSetting, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionShipmentSetting record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(optionShipmentOid).equalTo(record::getOptionShipmentOid)
				.set(placeOfDischargeId).equalTo(record::getPlaceOfDischargeId).set(placeSfOid)
				.equalTo(record::getPlaceSfOid).set(processingNo).equalTo(record::getProcessingNo)
				.set(processingDateType).equalTo(record::getProcessingDateType).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionShipmentSetting record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(optionShipmentOid)
				.equalToWhenPresent(record::getOptionShipmentOid).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(placeSfOid)
				.equalToWhenPresent(record::getPlaceSfOid).set(processingNo).equalToWhenPresent(record::getProcessingNo)
				.set(processingDateType).equalToWhenPresent(record::getProcessingDateType).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default int updateByPrimaryKey(OptionShipmentSetting record) {
		return update(c -> c.set(optionShipmentOid).equalTo(record::getOptionShipmentOid).set(placeOfDischargeId)
				.equalTo(record::getPlaceOfDischargeId).set(placeSfOid).equalTo(record::getPlaceSfOid).set(processingNo)
				.equalTo(record::getProcessingNo).set(processingDateType).equalTo(record::getProcessingDateType)
				.set(tsRegistererDate).equalTo(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	default int updateByPrimaryKeySelective(OptionShipmentSetting record) {
		return update(c -> c.set(optionShipmentOid).equalToWhenPresent(record::getOptionShipmentOid)
				.set(placeOfDischargeId).equalToWhenPresent(record::getPlaceOfDischargeId).set(placeSfOid)
				.equalToWhenPresent(record::getPlaceSfOid).set(processingNo).equalToWhenPresent(record::getProcessingNo)
				.set(processingDateType).equalToWhenPresent(record::getProcessingDateType).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}