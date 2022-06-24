package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionKanbanReadHistoryItemDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	public static final OptionKanbanReadHistoryItem optionKanbanReadHistoryItem = new OptionKanbanReadHistoryItem();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.oid")
	public static final SqlColumn<Long> oid = optionKanbanReadHistoryItem.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.kanban_read_history_oid")
	public static final SqlColumn<Long> kanbanReadHistoryOid = optionKanbanReadHistoryItem.kanbanReadHistoryOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.item_part_oid")
	public static final SqlColumn<Long> itemPartOid = optionKanbanReadHistoryItem.itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.roll_quantity")
	public static final SqlColumn<Integer> rollQuantity = optionKanbanReadHistoryItem.rollQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.read_quantity")
	public static final SqlColumn<Integer> readQuantity = optionKanbanReadHistoryItem.readQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionKanbanReadHistoryItem.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionKanbanReadHistoryItem.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionKanbanReadHistoryItem.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionKanbanReadHistoryItem.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionKanbanReadHistoryItem.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionKanbanReadHistoryItem.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source Table: public.option_kanban_read_history_item")
	public static final class OptionKanbanReadHistoryItem extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> kanbanReadHistoryOid = column("kanban_read_history_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> itemPartOid = column("item_part_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> rollQuantity = column("roll_quantity", JDBCType.INTEGER);
		public final SqlColumn<Integer> readQuantity = column("read_quantity", JDBCType.INTEGER);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionKanbanReadHistoryItem() {
			super("public.option_kanban_read_history_item");
		}
	}
}