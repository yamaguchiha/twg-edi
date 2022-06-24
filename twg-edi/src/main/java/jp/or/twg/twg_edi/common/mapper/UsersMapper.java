package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.UsersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.Users;
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
public interface UsersMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4584111+09:00", comments = "Source Table: public.users")
	BasicColumn[] selectList = BasicColumn.columnList(oid, userId, password, name, roleType, defaultPlaceOid,
			enabledPlaceOidValues, loadingOid, dischargeOid);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4444481+09:00", comments = "Source Table: public.users")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4464425+09:00", comments = "Source Table: public.users")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4474398+09:00", comments = "Source Table: public.users")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Users> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4484373+09:00", comments = "Source Table: public.users")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Users> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.449436+09:00", comments = "Source Table: public.users")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("UsersResult")
	Optional<Users> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4504329+09:00", comments = "Source Table: public.users")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "UsersResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "user_id", property = "userId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "role_type", property = "roleType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "default_place_oid", property = "defaultPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "enabled_place_oid_values", property = "enabledPlaceOidValues", jdbcType = JdbcType.VARCHAR),
			@Result(column = "loading_oid", property = "loadingOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "discharge_oid", property = "dischargeOid", jdbcType = JdbcType.BIGINT) })
	List<Users> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4524271+09:00", comments = "Source Table: public.users")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4524271+09:00", comments = "Source Table: public.users")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4534246+09:00", comments = "Source Table: public.users")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4544215+09:00", comments = "Source Table: public.users")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4544215+09:00", comments = "Source Table: public.users")
	default int insert(Users record) {
		return MyBatis3Utils.insert(this::insert, record, users,
				c -> c.map(oid).toProperty("oid").map(userId).toProperty("userId").map(password).toProperty("password")
						.map(name).toProperty("name").map(roleType).toProperty("roleType").map(defaultPlaceOid)
						.toProperty("defaultPlaceOid").map(enabledPlaceOidValues).toProperty("enabledPlaceOidValues")
						.map(loadingOid).toProperty("loadingOid").map(dischargeOid).toProperty("dischargeOid"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.456417+09:00", comments = "Source Table: public.users")
	default int insertMultiple(Collection<Users> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, users,
				c -> c.map(oid).toProperty("oid").map(userId).toProperty("userId").map(password).toProperty("password")
						.map(name).toProperty("name").map(roleType).toProperty("roleType").map(defaultPlaceOid)
						.toProperty("defaultPlaceOid").map(enabledPlaceOidValues).toProperty("enabledPlaceOidValues")
						.map(loadingOid).toProperty("loadingOid").map(dischargeOid).toProperty("dischargeOid"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4574136+09:00", comments = "Source Table: public.users")
	default int insertSelective(Users record) {
		return MyBatis3Utils.insert(this::insert, record, users,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(userId)
						.toPropertyWhenPresent("userId", record::getUserId).map(password)
						.toPropertyWhenPresent("password", record::getPassword).map(name)
						.toPropertyWhenPresent("name", record::getName).map(roleType)
						.toPropertyWhenPresent("roleType", record::getRoleType).map(defaultPlaceOid)
						.toPropertyWhenPresent("defaultPlaceOid", record::getDefaultPlaceOid).map(enabledPlaceOidValues)
						.toPropertyWhenPresent("enabledPlaceOidValues", record::getEnabledPlaceOidValues)
						.map(loadingOid).toPropertyWhenPresent("loadingOid", record::getLoadingOid).map(dischargeOid)
						.toPropertyWhenPresent("dischargeOid", record::getDischargeOid));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4604055+09:00", comments = "Source Table: public.users")
	default Optional<Users> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4604055+09:00", comments = "Source Table: public.users")
	default List<Users> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4614027+09:00", comments = "Source Table: public.users")
	default List<Users> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4614027+09:00", comments = "Source Table: public.users")
	default Optional<Users> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4624002+09:00", comments = "Source Table: public.users")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4633976+09:00", comments = "Source Table: public.users")
	static UpdateDSL<UpdateModel> updateAllColumns(Users record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(userId).equalTo(record::getUserId).set(password)
				.equalTo(record::getPassword).set(name).equalTo(record::getName).set(roleType)
				.equalTo(record::getRoleType).set(defaultPlaceOid).equalTo(record::getDefaultPlaceOid)
				.set(enabledPlaceOidValues).equalTo(record::getEnabledPlaceOidValues).set(loadingOid)
				.equalTo(record::getLoadingOid).set(dischargeOid).equalTo(record::getDischargeOid);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4633976+09:00", comments = "Source Table: public.users")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Users record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(userId).equalToWhenPresent(record::getUserId)
				.set(password).equalToWhenPresent(record::getPassword).set(name).equalToWhenPresent(record::getName)
				.set(roleType).equalToWhenPresent(record::getRoleType).set(defaultPlaceOid)
				.equalToWhenPresent(record::getDefaultPlaceOid).set(enabledPlaceOidValues)
				.equalToWhenPresent(record::getEnabledPlaceOidValues).set(loadingOid)
				.equalToWhenPresent(record::getLoadingOid).set(dischargeOid)
				.equalToWhenPresent(record::getDischargeOid);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4653928+09:00", comments = "Source Table: public.users")
	default int updateByPrimaryKey(Users record) {
		return update(c -> c.set(userId).equalTo(record::getUserId).set(password).equalTo(record::getPassword).set(name)
				.equalTo(record::getName).set(roleType).equalTo(record::getRoleType).set(defaultPlaceOid)
				.equalTo(record::getDefaultPlaceOid).set(enabledPlaceOidValues)
				.equalTo(record::getEnabledPlaceOidValues).set(loadingOid).equalTo(record::getLoadingOid)
				.set(dischargeOid).equalTo(record::getDischargeOid).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4663898+09:00", comments = "Source Table: public.users")
	default int updateByPrimaryKeySelective(Users record) {
		return update(c -> c.set(userId).equalToWhenPresent(record::getUserId).set(password)
				.equalToWhenPresent(record::getPassword).set(name).equalToWhenPresent(record::getName).set(roleType)
				.equalToWhenPresent(record::getRoleType).set(defaultPlaceOid)
				.equalToWhenPresent(record::getDefaultPlaceOid).set(enabledPlaceOidValues)
				.equalToWhenPresent(record::getEnabledPlaceOidValues).set(loadingOid)
				.equalToWhenPresent(record::getLoadingOid).set(dischargeOid).equalToWhenPresent(record::getDischargeOid)
				.where(oid, isEqualTo(record::getOid)));
	}
}