package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.PartyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.Party;
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
public interface PartyMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	BasicColumn[] selectList = BasicColumn.columnList(oid, tdbPartyCode, name);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Party> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Party> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("PartyResult")
	Optional<Party> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "PartyResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "tdb_party_code", property = "tdbPartyCode", jdbcType = JdbcType.VARCHAR),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR) })
	List<Party> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, party, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, party, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default int insert(Party record) {
		return MyBatis3Utils.insert(this::insert, record, party, c -> c.map(oid).toProperty("oid").map(tdbPartyCode)
				.toProperty("tdbPartyCode").map(name).toProperty("name"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default int insertMultiple(Collection<Party> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, party, c -> c.map(oid).toProperty("oid")
				.map(tdbPartyCode).toProperty("tdbPartyCode").map(name).toProperty("name"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default int insertSelective(Party record) {
		return MyBatis3Utils.insert(this::insert, record, party,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(tdbPartyCode)
						.toPropertyWhenPresent("tdbPartyCode", record::getTdbPartyCode).map(name)
						.toPropertyWhenPresent("name", record::getName));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default Optional<Party> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, party, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default List<Party> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, party, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default List<Party> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, party, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default Optional<Party> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, party, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	static UpdateDSL<UpdateModel> updateAllColumns(Party record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(tdbPartyCode).equalTo(record::getTdbPartyCode).set(name)
				.equalTo(record::getName);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Party record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(tdbPartyCode)
				.equalToWhenPresent(record::getTdbPartyCode).set(name).equalToWhenPresent(record::getName);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default int updateByPrimaryKey(Party record) {
		return update(c -> c.set(tdbPartyCode).equalTo(record::getTdbPartyCode).set(name).equalTo(record::getName)
				.where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	default int updateByPrimaryKeySelective(Party record) {
		return update(c -> c.set(tdbPartyCode).equalToWhenPresent(record::getTdbPartyCode).set(name)
				.equalToWhenPresent(record::getName).where(oid, isEqualTo(record::getOid)));
	}
}