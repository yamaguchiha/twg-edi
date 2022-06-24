package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionKanbanBranchPermanentDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.option_kanban_branch_permanent")
	public static final OptionKanbanBranchPermanent optionKanbanBranchPermanent = new OptionKanbanBranchPermanent();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.option_kanban_branch_permanent.oid")
	public static final SqlColumn<Long> oid = optionKanbanBranchPermanent.oid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.option_kanban_branch_permanent")
	public static final class OptionKanbanBranchPermanent extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);

		public OptionKanbanBranchPermanent() {
			super("public.option_kanban_branch_permanent");
		}
	}
}