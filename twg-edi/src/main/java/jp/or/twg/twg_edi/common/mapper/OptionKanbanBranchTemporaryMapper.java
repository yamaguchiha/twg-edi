package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionKanbanBranchTemporaryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionKanbanBranchTemporary;
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
public interface OptionKanbanBranchTemporaryMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	BasicColumn[] selectList = BasicColumn.columnList(oid);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionKanbanBranchTemporary> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionKanbanBranchTemporary> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionKanbanBranchTemporaryResult")
	Optional<OptionKanbanBranchTemporary> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionKanbanBranchTemporaryResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true) })
	List<OptionKanbanBranchTemporary> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionKanbanBranchTemporary, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionKanbanBranchTemporary, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	default int insert(OptionKanbanBranchTemporary record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanBranchTemporary,
				c -> c.map(oid).toProperty("oid"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	default int insertMultiple(Collection<OptionKanbanBranchTemporary> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionKanbanBranchTemporary,
				c -> c.map(oid).toProperty("oid"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	default int insertSelective(OptionKanbanBranchTemporary record) {
		return MyBatis3Utils.insert(this::insert, record, optionKanbanBranchTemporary,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	default Optional<OptionKanbanBranchTemporary> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionKanbanBranchTemporary, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	default List<OptionKanbanBranchTemporary> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionKanbanBranchTemporary, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	default List<OptionKanbanBranchTemporary> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionKanbanBranchTemporary, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionKanbanBranchTemporary, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionKanbanBranchTemporary record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionKanbanBranchTemporary record,
			UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid);
	}
}