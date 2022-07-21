package jp.or.twg.twg_edi.common.entity;

import java.util.Date;

import javax.annotation.Generated;

import jp.or.twg.twg_edi.common.difinition.OptionThreadCategory;
import jp.or.twg.twg_edi.common.difinition.OptionThreadStatus;

public class OptionThreadManager {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.id")
	private String id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.thread_status")
	private String threadStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.thread_category")
	private String threadCategory;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.users_oid")
	private Long usersOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.user_place_oid")
	private Long userPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.place_of_discharge_id")
	private String placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.start_up_time")
	private Date startUpTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.close_out_time")
	private Date closeOutTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.party_oid")
	private Long partyOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.place_oid")
	private Long placeOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_number")
	private Integer dataNumber;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_size")
	private Integer dataSize;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_size2")
	private Integer dataSize2;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.error_message")
	private String errorMessage;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.memo")
	private String memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.memo2")
	private String memo2;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.id")
	public String getId() {
		return id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.id")
	public void setId(String id) {
		this.id = id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.thread_status")
	public String getThreadStatus() {
		return threadStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.thread_status")
	public void setThreadStatus(String threadStatus) {
		this.threadStatus = threadStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.thread_category")
	public String getThreadCategory() {
		return threadCategory;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.thread_category")
	public void setThreadCategory(String threadCategory) {
		this.threadCategory = threadCategory;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.users_oid")
	public Long getUsersOid() {
		return usersOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.users_oid")
	public void setUsersOid(Long usersOid) {
		this.usersOid = usersOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.user_place_oid")
	public Long getUserPlaceOid() {
		return userPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.user_place_oid")
	public void setUserPlaceOid(Long userPlaceOid) {
		this.userPlaceOid = userPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.place_of_discharge_id")
	public String getPlaceOfDischargeId() {
		return placeOfDischargeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.place_of_discharge_id")
	public void setPlaceOfDischargeId(String placeOfDischargeId) {
		this.placeOfDischargeId = placeOfDischargeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.start_up_time")
	public Date getStartUpTime() {
		return startUpTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.start_up_time")
	public void setStartUpTime(Date startUpTime) {
		this.startUpTime = startUpTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.close_out_time")
	public Date getCloseOutTime() {
		return closeOutTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.close_out_time")
	public void setCloseOutTime(Date closeOutTime) {
		this.closeOutTime = closeOutTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.party_oid")
	public Long getPartyOid() {
		return partyOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.party_oid")
	public void setPartyOid(Long partyOid) {
		this.partyOid = partyOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.place_oid")
	public Long getPlaceOid() {
		return placeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.place_oid")
	public void setPlaceOid(Long placeOid) {
		this.placeOid = placeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_number")
	public Integer getDataNumber() {
		return dataNumber;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_number")
	public void setDataNumber(Integer dataNumber) {
		this.dataNumber = dataNumber;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_size")
	public Integer getDataSize() {
		return dataSize;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_size")
	public void setDataSize(Integer dataSize) {
		this.dataSize = dataSize;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_size2")
	public Integer getDataSize2() {
		return dataSize2;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_size2")
	public void setDataSize2(Integer dataSize2) {
		this.dataSize2 = dataSize2;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.error_message")
	public String getErrorMessage() {
		return errorMessage;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.error_message")
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.memo")
	public String getMemo() {
		return memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.memo")
	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.memo2")
	public String getMemo2() {
		return memo2;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.memo2")
	public void setMemo2(String memo2) {
		this.memo2 = memo2;
	}

	/** from kazura-jama-option **/

    /**
     * 
     * @return
     */
	public OptionThreadStatus getThreadStatusInType() {
		return OptionThreadStatus.getThreadStatus(this.getThreadStatus());
	}

	/**
	 * 
	 * @return
	 */
	public String getThreadStatusName() {
		return getThreadStatusInType().getName();
	}

	/**
	 * 
	 * @return
	 */
	public boolean isErrorDetail() {
		return getThreadStatusInType().isErrorDetail();
	}

	/**
	 * 
	 * @return
	 */
	public String getThreadCategoryName() {
		OptionThreadCategory threadCategory = OptionThreadCategory.getThreadCategory(this.getThreadCategory());
		if (threadCategory != null) {
			return threadCategory.getName();
		}
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public Long getIntervalTime() {
		if (getStartUpTime() == null) {
			return null;
		}

		Date closeOutTime;
		if (getCloseOutTime() != null) {
			closeOutTime = getCloseOutTime();
		} else {
			closeOutTime = new Date();
		}
		return (closeOutTime.getTime() - getStartUpTime().getTime()) / 1000;
	}
}