package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class JobScheduler {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.id")
	private Long id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.own_place_oid")
	private Long ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.job_category")
	private String jobCategory;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.schedule")
	private String schedule;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.comment")
	private String comment;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.parameter")
	private String parameter;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.valid")
	private String valid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.ts_last_modified_date")
	private Date tsLastModifiedDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.id")
	public Long getId() {
		return id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.id")
	public void setId(Long id) {
		this.id = id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.own_place_oid")
	public Long getOwnPlaceOid() {
		return ownPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.own_place_oid")
	public void setOwnPlaceOid(Long ownPlaceOid) {
		this.ownPlaceOid = ownPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.job_category")
	public String getJobCategory() {
		return jobCategory;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.job_category")
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.schedule")
	public String getSchedule() {
		return schedule;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.schedule")
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.comment")
	public String getComment() {
		return comment;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.comment")
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.parameter")
	public String getParameter() {
		return parameter;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.parameter")
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.valid")
	public String getValid() {
		return valid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.valid")
	public void setValid(String valid) {
		this.valid = valid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source field: public.job_scheduler.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}
}