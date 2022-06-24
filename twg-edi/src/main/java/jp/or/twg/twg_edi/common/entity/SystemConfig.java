package jp.or.twg.twg_edi.common.entity;

import javax.annotation.Generated;

public class SystemConfig {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.own_place_oid")
	private Long ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.category")
	private String category;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.parameter")
	private String parameter;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.memo")
	private String memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.own_place_oid")
	public Long getOwnPlaceOid() {
		return ownPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.own_place_oid")
	public void setOwnPlaceOid(Long ownPlaceOid) {
		this.ownPlaceOid = ownPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.category")
	public String getCategory() {
		return category;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.category")
	public void setCategory(String category) {
		this.category = category;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.parameter")
	public String getParameter() {
		return parameter;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.parameter")
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.memo")
	public String getMemo() {
		return memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.memo")
	public void setMemo(String memo) {
		this.memo = memo;
	}
}