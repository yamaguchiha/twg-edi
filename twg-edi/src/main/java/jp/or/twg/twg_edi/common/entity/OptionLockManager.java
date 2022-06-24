package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class OptionLockManager {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_id")
	private String threadId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.users_oid")
	private Long usersOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.place_oid")
	private Long placeOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.lock_status")
	private String lockStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_class")
	private String threadClass;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_num")
	private Integer threadNum;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.start_up_time")
	private Date startUpTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.close_out_time")
	private Date closeOutTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.memo")
	private String memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_id")
	public String getThreadId() {
		return threadId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_id")
	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.users_oid")
	public Long getUsersOid() {
		return usersOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.users_oid")
	public void setUsersOid(Long usersOid) {
		this.usersOid = usersOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.place_oid")
	public Long getPlaceOid() {
		return placeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.place_oid")
	public void setPlaceOid(Long placeOid) {
		this.placeOid = placeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.lock_status")
	public String getLockStatus() {
		return lockStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.lock_status")
	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_class")
	public String getThreadClass() {
		return threadClass;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_class")
	public void setThreadClass(String threadClass) {
		this.threadClass = threadClass;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_num")
	public Integer getThreadNum() {
		return threadNum;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_num")
	public void setThreadNum(Integer threadNum) {
		this.threadNum = threadNum;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.start_up_time")
	public Date getStartUpTime() {
		return startUpTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.start_up_time")
	public void setStartUpTime(Date startUpTime) {
		this.startUpTime = startUpTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.close_out_time")
	public Date getCloseOutTime() {
		return closeOutTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.close_out_time")
	public void setCloseOutTime(Date closeOutTime) {
		this.closeOutTime = closeOutTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.memo")
	public String getMemo() {
		return memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.memo")
	public void setMemo(String memo) {
		this.memo = memo;
	}
}