package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionKanbanBranchTemporaryDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	public static final OptionKanbanBranchTemporary optionKanbanBranchTemporary = new OptionKanbanBranchTemporary();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.option_kanban_branch_temporary.oid")
	public static final SqlColumn<Long> oid = optionKanbanBranchTemporary.oid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source Table: public.option_kanban_branch_temporary")
	public static final class OptionKanbanBranchTemporary extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);

		public OptionKanbanBranchTemporary() {
			super("public.option_kanban_branch_temporary");
		}
	}
}