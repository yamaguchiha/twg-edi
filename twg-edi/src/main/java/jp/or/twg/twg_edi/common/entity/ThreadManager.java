package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class ThreadManager {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.id")
	private String id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.own_place_oid")
	private Long ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.thread_status")
	private String threadStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.thread_category")
	private String threadCategory;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.users_oid")
	private Long usersOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.user_place_oid")
	private Long userPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.start_up_time")
	private Date startUpTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.close_out_time")
	private Date closeOutTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.error_message")
	private String errorMessage;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.memo")
	private String memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.id")
	public String getId() {
		return id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.id")
	public void setId(String id) {
		this.id = id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.own_place_oid")
	public Long getOwnPlaceOid() {
		return ownPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.own_place_oid")
	public void setOwnPlaceOid(Long ownPlaceOid) {
		this.ownPlaceOid = ownPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.thread_status")
	public String getThreadStatus() {
		return threadStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.thread_status")
	public void setThreadStatus(String threadStatus) {
		this.threadStatus = threadStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.thread_category")
	public String getThreadCategory() {
		return threadCategory;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.thread_category")
	public void setThreadCategory(String threadCategory) {
		this.threadCategory = threadCategory;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.users_oid")
	public Long getUsersOid() {
		return usersOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.users_oid")
	public void setUsersOid(Long usersOid) {
		this.usersOid = usersOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.user_place_oid")
	public Long getUserPlaceOid() {
		return userPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.user_place_oid")
	public void setUserPlaceOid(Long userPlaceOid) {
		this.userPlaceOid = userPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.start_up_time")
	public Date getStartUpTime() {
		return startUpTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.start_up_time")
	public void setStartUpTime(Date startUpTime) {
		this.startUpTime = startUpTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.close_out_time")
	public Date getCloseOutTime() {
		return closeOutTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.close_out_time")
	public void setCloseOutTime(Date closeOutTime) {
		this.closeOutTime = closeOutTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.error_message")
	public String getErrorMessage() {
		return errorMessage;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.error_message")
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.memo")
	public String getMemo() {
		return memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.memo")
	public void setMemo(String memo) {
		this.memo = memo;
	}
}