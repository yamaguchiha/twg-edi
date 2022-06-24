package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptShipmentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptShipment;
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
public interface OptShipmentMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	BasicColumn[] selectList = BasicColumn.columnList(oid, ownPlaceOid, placeSfOid, optPlaceStOid, shipmentNo,
			shipmentTime);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptShipment> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptShipment> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptShipmentResult")
	Optional<OptShipment> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptShipmentResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "own_place_oid", property = "ownPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_sf_oid", property = "placeSfOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "opt_place_st_oid", property = "optPlaceStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "shipment_no", property = "shipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "shipment_time", property = "shipmentTime", jdbcType = JdbcType.VARCHAR) })
	List<OptShipment> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optShipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optShipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default int insert(OptShipment record) {
		return MyBatis3Utils.insert(this::insert, record, optShipment,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(placeSfOid)
						.toProperty("placeSfOid").map(optPlaceStOid).toProperty("optPlaceStOid").map(shipmentNo)
						.toProperty("shipmentNo").map(shipmentTime).toProperty("shipmentTime"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default int insertMultiple(Collection<OptShipment> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optShipment,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(placeSfOid)
						.toProperty("placeSfOid").map(optPlaceStOid).toProperty("optPlaceStOid").map(shipmentNo)
						.toProperty("shipmentNo").map(shipmentTime).toProperty("shipmentTime"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default int insertSelective(OptShipment record) {
		return MyBatis3Utils.insert(this::insert, record, optShipment,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(ownPlaceOid)
						.toPropertyWhenPresent("ownPlaceOid", record::getOwnPlaceOid).map(placeSfOid)
						.toPropertyWhenPresent("placeSfOid", record::getPlaceSfOid).map(optPlaceStOid)
						.toPropertyWhenPresent("optPlaceStOid", record::getOptPlaceStOid).map(shipmentNo)
						.toPropertyWhenPresent("shipmentNo", record::getShipmentNo).map(shipmentTime)
						.toPropertyWhenPresent("shipmentTime", record::getShipmentTime));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default Optional<OptShipment> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optShipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default List<OptShipment> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optShipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default List<OptShipment> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optShipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default Optional<OptShipment> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optShipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	static UpdateDSL<UpdateModel> updateAllColumns(OptShipment record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(placeSfOid)
				.equalTo(record::getPlaceSfOid).set(optPlaceStOid).equalTo(record::getOptPlaceStOid).set(shipmentNo)
				.equalTo(record::getShipmentNo).set(shipmentTime).equalTo(record::getShipmentTime);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptShipment record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(ownPlaceOid)
				.equalToWhenPresent(record::getOwnPlaceOid).set(placeSfOid).equalToWhenPresent(record::getPlaceSfOid)
				.set(optPlaceStOid).equalToWhenPresent(record::getOptPlaceStOid).set(shipmentNo)
				.equalToWhenPresent(record::getShipmentNo).set(shipmentTime)
				.equalToWhenPresent(record::getShipmentTime);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default int updateByPrimaryKey(OptShipment record) {
		return update(c -> c.set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(placeSfOid)
				.equalTo(record::getPlaceSfOid).set(optPlaceStOid).equalTo(record::getOptPlaceStOid).set(shipmentNo)
				.equalTo(record::getShipmentNo).set(shipmentTime).equalTo(record::getShipmentTime)
				.where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.opt_shipment")
	default int updateByPrimaryKeySelective(OptShipment record) {
		return update(c -> c.set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid).set(placeSfOid)
				.equalToWhenPresent(record::getPlaceSfOid).set(optPlaceStOid)
				.equalToWhenPresent(record::getOptPlaceStOid).set(shipmentNo).equalToWhenPresent(record::getShipmentNo)
				.set(shipmentTime).equalToWhenPresent(record::getShipmentTime).where(oid, isEqualTo(record::getOid)));
	}
}