package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.ShipmentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.Shipment;
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
public interface ShipmentMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	BasicColumn[] selectList = BasicColumn.columnList(oid, ownPlaceOid, placeSfOid, placeStOid, shipmentNo,
			shipmentTime);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Shipment> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Shipment> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("ShipmentResult")
	Optional<Shipment> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "ShipmentResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "own_place_oid", property = "ownPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_sf_oid", property = "placeSfOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "shipment_no", property = "shipmentNo", jdbcType = JdbcType.INTEGER),
			@Result(column = "shipment_time", property = "shipmentTime", jdbcType = JdbcType.VARCHAR) })
	List<Shipment> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, shipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, shipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.shipment")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	default int insert(Shipment record) {
		return MyBatis3Utils.insert(this::insert, record, shipment,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(placeSfOid)
						.toProperty("placeSfOid").map(placeStOid).toProperty("placeStOid").map(shipmentNo)
						.toProperty("shipmentNo").map(shipmentTime).toProperty("shipmentTime"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	default int insertMultiple(Collection<Shipment> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, shipment,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(placeSfOid)
						.toProperty("placeSfOid").map(placeStOid).toProperty("placeStOid").map(shipmentNo)
						.toProperty("shipmentNo").map(shipmentTime).toProperty("shipmentTime"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	default int insertSelective(Shipment record) {
		return MyBatis3Utils.insert(this::insert, record, shipment,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(ownPlaceOid)
						.toPropertyWhenPresent("ownPlaceOid", record::getOwnPlaceOid).map(placeSfOid)
						.toPropertyWhenPresent("placeSfOid", record::getPlaceSfOid).map(placeStOid)
						.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(shipmentNo)
						.toPropertyWhenPresent("shipmentNo", record::getShipmentNo).map(shipmentTime)
						.toPropertyWhenPresent("shipmentTime", record::getShipmentTime));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	default Optional<Shipment> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, shipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	default List<Shipment> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, shipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	default List<Shipment> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, shipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	default Optional<Shipment> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, shipment, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	static UpdateDSL<UpdateModel> updateAllColumns(Shipment record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(placeSfOid)
				.equalTo(record::getPlaceSfOid).set(placeStOid).equalTo(record::getPlaceStOid).set(shipmentNo)
				.equalTo(record::getShipmentNo).set(shipmentTime).equalTo(record::getShipmentTime);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Shipment record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(ownPlaceOid)
				.equalToWhenPresent(record::getOwnPlaceOid).set(placeSfOid).equalToWhenPresent(record::getPlaceSfOid)
				.set(placeStOid).equalToWhenPresent(record::getPlaceStOid).set(shipmentNo)
				.equalToWhenPresent(record::getShipmentNo).set(shipmentTime)
				.equalToWhenPresent(record::getShipmentTime);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	default int updateByPrimaryKey(Shipment record) {
		return update(
				c -> c.set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(placeSfOid).equalTo(record::getPlaceSfOid)
						.set(placeStOid).equalTo(record::getPlaceStOid).set(shipmentNo).equalTo(record::getShipmentNo)
						.set(shipmentTime).equalTo(record::getShipmentTime).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5132645+09:00", comments = "Source Table: public.shipment")
	default int updateByPrimaryKeySelective(Shipment record) {
		return update(c -> c.set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid).set(placeSfOid)
				.equalToWhenPresent(record::getPlaceSfOid).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(shipmentNo).equalToWhenPresent(record::getShipmentNo).set(shipmentTime)
				.equalToWhenPresent(record::getShipmentTime).where(oid, isEqualTo(record::getOid)));
	}
}