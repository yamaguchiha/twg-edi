package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class OptionKanbanReadHistoryItem {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.kanban_read_history_oid")
	private Long kanbanReadHistoryOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.item_part_oid")
	private Long itemPartOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.roll_quantity")
	private Integer rollQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.read_quantity")
	private Integer readQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.kanban_read_history_oid")
	public Long getKanbanReadHistoryOid() {
		return kanbanReadHistoryOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.kanban_read_history_oid")
	public void setKanbanReadHistoryOid(Long kanbanReadHistoryOid) {
		this.kanbanReadHistoryOid = kanbanReadHistoryOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.item_part_oid")
	public Long getItemPartOid() {
		return itemPartOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.item_part_oid")
	public void setItemPartOid(Long itemPartOid) {
		this.itemPartOid = itemPartOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.roll_quantity")
	public Integer getRollQuantity() {
		return rollQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.roll_quantity")
	public void setRollQuantity(Integer rollQuantity) {
		this.rollQuantity = rollQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.read_quantity")
	public Integer getReadQuantity() {
		return readQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.read_quantity")
	public void setReadQuantity(Integer readQuantity) {
		this.readQuantity = readQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_kanban_read_history_item.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}
}