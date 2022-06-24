package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionSimpleKanbanDeliveryHistoryDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	public static final OptionSimpleKanbanDeliveryHistory optionSimpleKanbanDeliveryHistory = new OptionSimpleKanbanDeliveryHistory();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.oid")
	public static final SqlColumn<Long> oid = optionSimpleKanbanDeliveryHistory.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.place_st_oid")
	public static final SqlColumn<Long> placeStOid = optionSimpleKanbanDeliveryHistory.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.item_part_oid")
	public static final SqlColumn<Long> itemPartOid = optionSimpleKanbanDeliveryHistory.itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.delivery_date_string_date")
	public static final SqlColumn<String> deliveryDateStringDate = optionSimpleKanbanDeliveryHistory.deliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.shipment_no")
	public static final SqlColumn<Integer> shipmentNo = optionSimpleKanbanDeliveryHistory.shipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.processing_date_time")
	public static final SqlColumn<Date> processingDateTime = optionSimpleKanbanDeliveryHistory.processingDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.processing_shipment_no")
	public static final SqlColumn<Integer> processingShipmentNo = optionSimpleKanbanDeliveryHistory.processingShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.doc_ref_id_aau")
	public static final SqlColumn<String> docRefIdAau = optionSimpleKanbanDeliveryHistory.docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.delivery_box")
	public static final SqlColumn<Integer> deliveryBox = optionSimpleKanbanDeliveryHistory.deliveryBox;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.delivery_quantity")
	public static final SqlColumn<Integer> deliveryQuantity = optionSimpleKanbanDeliveryHistory.deliveryQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.thread_id")
	public static final SqlColumn<String> threadId = optionSimpleKanbanDeliveryHistory.threadId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionSimpleKanbanDeliveryHistory.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionSimpleKanbanDeliveryHistory.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionSimpleKanbanDeliveryHistory.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionSimpleKanbanDeliveryHistory.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionSimpleKanbanDeliveryHistory.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source field: public.option_simple_kanban_delivery_history.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionSimpleKanbanDeliveryHistory.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5122668+09:00", comments = "Source Table: public.option_simple_kanban_delivery_history")
	public static final class OptionSimpleKanbanDeliveryHistory extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> itemPartOid = column("item_part_oid", JDBCType.BIGINT);
		public final SqlColumn<String> deliveryDateStringDate = column("delivery_date_string_date", JDBCType.VARCHAR);
		public final SqlColumn<Integer> shipmentNo = column("shipment_no", JDBCType.INTEGER);
		public final SqlColumn<Date> processingDateTime = column("processing_date_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Integer> processingShipmentNo = column("processing_shipment_no", JDBCType.INTEGER);
		public final SqlColumn<String> docRefIdAau = column("doc_ref_id_aau", JDBCType.VARCHAR);
		public final SqlColumn<Integer> deliveryBox = column("delivery_box", JDBCType.INTEGER);
		public final SqlColumn<Integer> deliveryQuantity = column("delivery_quantity", JDBCType.INTEGER);
		public final SqlColumn<String> threadId = column("thread_id", JDBCType.VARCHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionSimpleKanbanDeliveryHistory() {
			super("public.option_simple_kanban_delivery_history");
		}
	}
}