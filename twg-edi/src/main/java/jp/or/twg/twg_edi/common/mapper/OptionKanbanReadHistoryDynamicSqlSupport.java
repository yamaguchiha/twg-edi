package jp.or.twg.twg_edi.common.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionKanbanReadHistoryDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	public static final OptionKanbanReadHistory optionKanbanReadHistory = new OptionKanbanReadHistory();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.oid")
	public static final SqlColumn<Long> oid = optionKanbanReadHistory.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.place_st_oid")
	public static final SqlColumn<Long> placeStOid = optionKanbanReadHistory.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.terminal_no")
	public static final SqlColumn<Integer> terminalNo = optionKanbanReadHistory.terminalNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.read_date_string_date")
	public static final SqlColumn<String> readDateStringDate = optionKanbanReadHistory.readDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.read_count")
	public static final SqlColumn<Integer> readCount = optionKanbanReadHistory.readCount;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.read_start_time")
	public static final SqlColumn<Date> readStartTime = optionKanbanReadHistory.readStartTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.read_end_time")
	public static final SqlColumn<Date> readEndTime = optionKanbanReadHistory.readEndTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.read_spend_time")
	public static final SqlColumn<Integer> readSpendTime = optionKanbanReadHistory.readSpendTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.update_start_time")
	public static final SqlColumn<Date> updateStartTime = optionKanbanReadHistory.updateStartTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.update_end_time")
	public static final SqlColumn<Date> updateEndTime = optionKanbanReadHistory.updateEndTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.update_spend_time")
	public static final SqlColumn<Integer> updateSpendTime = optionKanbanReadHistory.updateSpendTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.total_quantity")
	public static final SqlColumn<Long> totalQuantity = optionKanbanReadHistory.totalQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.read_error_quantity")
	public static final SqlColumn<Long> readErrorQuantity = optionKanbanReadHistory.readErrorQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.data_error_quantity")
	public static final SqlColumn<Long> dataErrorQuantity = optionKanbanReadHistory.dataErrorQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.read_error_ratio")
	public static final SqlColumn<BigDecimal> readErrorRatio = optionKanbanReadHistory.readErrorRatio;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionKanbanReadHistory.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionKanbanReadHistory.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionKanbanReadHistory.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionKanbanReadHistory.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionKanbanReadHistory.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionKanbanReadHistory.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source Table: public.option_kanban_read_history")
	public static final class OptionKanbanReadHistory extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> terminalNo = column("terminal_no", JDBCType.INTEGER);
		public final SqlColumn<String> readDateStringDate = column("read_date_string_date", JDBCType.VARCHAR);
		public final SqlColumn<Integer> readCount = column("read_count", JDBCType.INTEGER);
		public final SqlColumn<Date> readStartTime = column("read_start_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Date> readEndTime = column("read_end_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Integer> readSpendTime = column("read_spend_time", JDBCType.INTEGER);
		public final SqlColumn<Date> updateStartTime = column("update_start_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Date> updateEndTime = column("update_end_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Integer> updateSpendTime = column("update_spend_time", JDBCType.INTEGER);
		public final SqlColumn<Long> totalQuantity = column("total_quantity", JDBCType.BIGINT);
		public final SqlColumn<Long> readErrorQuantity = column("read_error_quantity", JDBCType.BIGINT);
		public final SqlColumn<Long> dataErrorQuantity = column("data_error_quantity", JDBCType.BIGINT);
		public final SqlColumn<BigDecimal> readErrorRatio = column("read_error_ratio", JDBCType.NUMERIC);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionKanbanReadHistory() {
			super("public.option_kanban_read_history");
		}
	}
}