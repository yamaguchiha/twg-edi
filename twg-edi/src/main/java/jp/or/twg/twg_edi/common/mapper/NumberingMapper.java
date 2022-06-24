package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.NumberingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.Numbering;
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
public interface NumberingMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	BasicColumn[] selectList = BasicColumn.columnList(id, nextNumber);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Numbering> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Numbering> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("NumberingResult")
	Optional<Numbering> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "NumberingResult", value = {
			@Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "next_number", property = "nextNumber", jdbcType = JdbcType.BIGINT) })
	List<Numbering> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, numbering, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, numbering, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default int deleteByPrimaryKey(String id_) {
		return delete(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default int insert(Numbering record) {
		return MyBatis3Utils.insert(this::insert, record, numbering,
				c -> c.map(id).toProperty("id").map(nextNumber).toProperty("nextNumber"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default int insertMultiple(Collection<Numbering> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, numbering,
				c -> c.map(id).toProperty("id").map(nextNumber).toProperty("nextNumber"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default int insertSelective(Numbering record) {
		return MyBatis3Utils.insert(this::insert, record, numbering,
				c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(nextNumber)
						.toPropertyWhenPresent("nextNumber", record::getNextNumber));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default Optional<Numbering> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, numbering, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default List<Numbering> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, numbering, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default List<Numbering> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, numbering, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default Optional<Numbering> selectByPrimaryKey(String id_) {
		return selectOne(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, numbering, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	static UpdateDSL<UpdateModel> updateAllColumns(Numbering record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalTo(record::getId).set(nextNumber).equalTo(record::getNextNumber);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Numbering record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalToWhenPresent(record::getId).set(nextNumber).equalToWhenPresent(record::getNextNumber);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default int updateByPrimaryKey(Numbering record) {
		return update(c -> c.set(nextNumber).equalTo(record::getNextNumber).where(id, isEqualTo(record::getId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	default int updateByPrimaryKeySelective(Numbering record) {
		return update(
				c -> c.set(nextNumber).equalToWhenPresent(record::getNextNumber).where(id, isEqualTo(record::getId)));
	}
}