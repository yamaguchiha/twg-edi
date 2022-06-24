package jp.or.twg.twg_edi.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class OptionKanbanReadHistory {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.place_st_oid")
	private Long placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.terminal_no")
	private Integer terminalNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_date_string_date")
	private String readDateStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_count")
	private Integer readCount;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_start_time")
	private Date readStartTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_end_time")
	private Date readEndTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_spend_time")
	private Integer readSpendTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.update_start_time")
	private Date updateStartTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.update_end_time")
	private Date updateEndTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.update_spend_time")
	private Integer updateSpendTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.total_quantity")
	private Long totalQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_error_quantity")
	private Long readErrorQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.data_error_quantity")
	private Long dataErrorQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_error_ratio")
	private BigDecimal readErrorRatio;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.place_st_oid")
	public Long getPlaceStOid() {
		return placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.place_st_oid")
	public void setPlaceStOid(Long placeStOid) {
		this.placeStOid = placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.terminal_no")
	public Integer getTerminalNo() {
		return terminalNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.terminal_no")
	public void setTerminalNo(Integer terminalNo) {
		this.terminalNo = terminalNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_date_string_date")
	public String getReadDateStringDate() {
		return readDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_date_string_date")
	public void setReadDateStringDate(String readDateStringDate) {
		this.readDateStringDate = readDateStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_count")
	public Integer getReadCount() {
		return readCount;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_count")
	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_start_time")
	public Date getReadStartTime() {
		return readStartTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_start_time")
	public void setReadStartTime(Date readStartTime) {
		this.readStartTime = readStartTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_end_time")
	public Date getReadEndTime() {
		return readEndTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_end_time")
	public void setReadEndTime(Date readEndTime) {
		this.readEndTime = readEndTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_spend_time")
	public Integer getReadSpendTime() {
		return readSpendTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_spend_time")
	public void setReadSpendTime(Integer readSpendTime) {
		this.readSpendTime = readSpendTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.update_start_time")
	public Date getUpdateStartTime() {
		return updateStartTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.update_start_time")
	public void setUpdateStartTime(Date updateStartTime) {
		this.updateStartTime = updateStartTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.update_end_time")
	public Date getUpdateEndTime() {
		return updateEndTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.update_end_time")
	public void setUpdateEndTime(Date updateEndTime) {
		this.updateEndTime = updateEndTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.update_spend_time")
	public Integer getUpdateSpendTime() {
		return updateSpendTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.update_spend_time")
	public void setUpdateSpendTime(Integer updateSpendTime) {
		this.updateSpendTime = updateSpendTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.total_quantity")
	public Long getTotalQuantity() {
		return totalQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.total_quantity")
	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_error_quantity")
	public Long getReadErrorQuantity() {
		return readErrorQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_error_quantity")
	public void setReadErrorQuantity(Long readErrorQuantity) {
		this.readErrorQuantity = readErrorQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.data_error_quantity")
	public Long getDataErrorQuantity() {
		return dataErrorQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.data_error_quantity")
	public void setDataErrorQuantity(Long dataErrorQuantity) {
		this.dataErrorQuantity = dataErrorQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_error_ratio")
	public BigDecimal getReadErrorRatio() {
		return readErrorRatio;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.read_error_ratio")
	public void setReadErrorRatio(BigDecimal readErrorRatio) {
		this.readErrorRatio = readErrorRatio;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4923201+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4933176+09:00", comments = "Source field: public.option_kanban_read_history.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}
}