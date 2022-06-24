package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionKanbanDeliveryHistoryDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	public static final OptionKanbanDeliveryHistory optionKanbanDeliveryHistory = new OptionKanbanDeliveryHistory();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.oid")
	public static final SqlColumn<Long> oid = optionKanbanDeliveryHistory.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.place_st_oid")
	public static final SqlColumn<Long> placeStOid = optionKanbanDeliveryHistory.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.item_part_oid")
	public static final SqlColumn<Long> itemPartOid = optionKanbanDeliveryHistory.itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_date_string_date")
	public static final SqlColumn<String> deliveryDateStringDate = optionKanbanDeliveryHistory.deliveryDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.shipment_no")
	public static final SqlColumn<Integer> shipmentNo = optionKanbanDeliveryHistory.shipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_processing_date_string_date")
	public static final SqlColumn<String> deliveryProcessingDateStringDate = optionKanbanDeliveryHistory.deliveryProcessingDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.processing_date_time")
	public static final SqlColumn<Date> processingDateTime = optionKanbanDeliveryHistory.processingDateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.processing_shipment_no")
	public static final SqlColumn<Integer> processingShipmentNo = optionKanbanDeliveryHistory.processingShipmentNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.item_a04_desc")
	public static final SqlColumn<String> itemA04Desc = optionKanbanDeliveryHistory.itemA04Desc;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.doc_ref_id_aau")
	public static final SqlColumn<String> docRefIdAau = optionKanbanDeliveryHistory.docRefIdAau;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_box")
	public static final SqlColumn<Integer> deliveryBox = optionKanbanDeliveryHistory.deliveryBox;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.delivery_quantity")
	public static final SqlColumn<Integer> deliveryQuantity = optionKanbanDeliveryHistory.deliveryQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.roll_quantity")
	public static final SqlColumn<Integer> rollQuantity = optionKanbanDeliveryHistory.rollQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.read_quantity")
	public static final SqlColumn<Integer> readQuantity = optionKanbanDeliveryHistory.readQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.adjust_quantity")
	public static final SqlColumn<Integer> adjustQuantity = optionKanbanDeliveryHistory.adjustQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.order_stop_quantity")
	public static final SqlColumn<Integer> orderStopQuantity = optionKanbanDeliveryHistory.orderStopQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionKanbanDeliveryHistory.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionKanbanDeliveryHistory.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionKanbanDeliveryHistory.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionKanbanDeliveryHistory.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionKanbanDeliveryHistory.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source field: public.option_kanban_delivery_history.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionKanbanDeliveryHistory.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.495312+09:00", comments = "Source Table: public.option_kanban_delivery_history")
	public static final class OptionKanbanDeliveryHistory extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> itemPartOid = column("item_part_oid", JDBCType.BIGINT);
		public final SqlColumn<String> deliveryDateStringDate = column("delivery_date_string_date", JDBCType.VARCHAR);
		public final SqlColumn<Integer> shipmentNo = column("shipment_no", JDBCType.INTEGER);
		public final SqlColumn<String> deliveryProcessingDateStringDate = column("delivery_processing_date_string_date",
				JDBCType.VARCHAR);
		public final SqlColumn<Date> processingDateTime = column("processing_date_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Integer> processingShipmentNo = column("processing_shipment_no", JDBCType.INTEGER);
		public final SqlColumn<String> itemA04Desc = column("item_a04_desc", JDBCType.VARCHAR);
		public final SqlColumn<String> docRefIdAau = column("doc_ref_id_aau", JDBCType.VARCHAR);
		public final SqlColumn<Integer> deliveryBox = column("delivery_box", JDBCType.INTEGER);
		public final SqlColumn<Integer> deliveryQuantity = column("delivery_quantity", JDBCType.INTEGER);
		public final SqlColumn<Integer> rollQuantity = column("roll_quantity", JDBCType.INTEGER);
		public final SqlColumn<Integer> readQuantity = column("read_quantity", JDBCType.INTEGER);
		public final SqlColumn<Integer> adjustQuantity = column("adjust_quantity", JDBCType.INTEGER);
		public final SqlColumn<Integer> orderStopQuantity = column("order_stop_quantity", JDBCType.INTEGER);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionKanbanDeliveryHistory() {
			super("public.option_kanban_delivery_history");
		}
	}
}