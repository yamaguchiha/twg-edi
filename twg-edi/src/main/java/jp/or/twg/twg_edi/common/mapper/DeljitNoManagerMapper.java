package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.DeljitNoManagerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.DeljitNoManager;
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
public interface DeljitNoManagerMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	BasicColumn[] selectList = BasicColumn.columnList(oid, ownPlaceOid, deliveryDate, deljitNo, tsRegistererDate,
			tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId,
			tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<DeljitNoManager> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<DeljitNoManager> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("DeljitNoManagerResult")
	Optional<DeljitNoManager> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "DeljitNoManagerResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "own_place_oid", property = "ownPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "delivery_date", property = "deliveryDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "deljit_no", property = "deljitNo", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<DeljitNoManager> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, deljitNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, deljitNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default int insert(DeljitNoManager record) {
		return MyBatis3Utils.insert(this::insert, record, deljitNoManager,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(deliveryDate)
						.toProperty("deliveryDate").map(deljitNo).toProperty("deljitNo").map(tsRegistererDate)
						.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
						.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
						.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default int insertMultiple(Collection<DeljitNoManager> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, deljitNoManager,
				c -> c.map(oid).toProperty("oid").map(ownPlaceOid).toProperty("ownPlaceOid").map(deliveryDate)
						.toProperty("deliveryDate").map(deljitNo).toProperty("deljitNo").map(tsRegistererDate)
						.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
						.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
						.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
						.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default int insertSelective(DeljitNoManager record) {
		return MyBatis3Utils.insert(this::insert, record, deljitNoManager, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(ownPlaceOid)
				.toPropertyWhenPresent("ownPlaceOid", record::getOwnPlaceOid).map(deliveryDate)
				.toPropertyWhenPresent("deliveryDate", record::getDeliveryDate).map(deljitNo)
				.toPropertyWhenPresent("deljitNo", record::getDeljitNo).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default Optional<DeljitNoManager> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, deljitNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default List<DeljitNoManager> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, deljitNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default List<DeljitNoManager> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, deljitNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default Optional<DeljitNoManager> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, deljitNoManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	static UpdateDSL<UpdateModel> updateAllColumns(DeljitNoManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(deliveryDate)
				.equalTo(record::getDeliveryDate).set(deljitNo).equalTo(record::getDeljitNo).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(DeljitNoManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(ownPlaceOid)
				.equalToWhenPresent(record::getOwnPlaceOid).set(deliveryDate)
				.equalToWhenPresent(record::getDeliveryDate).set(deljitNo).equalToWhenPresent(record::getDeljitNo)
				.set(tsRegistererDate).equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	default int updateByPrimaryKey(DeljitNoManager record) {
		return update(c -> c.set(ownPlaceOid).equalTo(record::getOwnPlaceOid).set(deliveryDate)
				.equalTo(record::getDeliveryDate).set(deljitNo).equalTo(record::getDeljitNo).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4883321+09:00", comments = "Source Table: public.deljit_no_manager")
	default int updateByPrimaryKeySelective(DeljitNoManager record) {
		return update(c -> c.set(ownPlaceOid).equalToWhenPresent(record::getOwnPlaceOid).set(deliveryDate)
				.equalToWhenPresent(record::getDeliveryDate).set(deljitNo).equalToWhenPresent(record::getDeljitNo)
				.set(tsRegistererDate).equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}