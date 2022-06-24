package jp.or.twg.twg_edi.common.entity;

import javax.annotation.Generated;

public class Users {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4075472+09:00", comments = "Source field: public.users.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4195181+09:00", comments = "Source field: public.users.user_id")
	private String userId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.password")
	private String password;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.name")
	private String name;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.role_type")
	private String roleType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.default_place_oid")
	private Long defaultPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.enabled_place_oid_values")
	private String enabledPlaceOidValues;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.loading_oid")
	private Long loadingOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.discharge_oid")
	private Long dischargeOid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4195181+09:00", comments = "Source field: public.users.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4195181+09:00", comments = "Source field: public.users.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4195181+09:00", comments = "Source field: public.users.user_id")
	public String getUserId() {
		return userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.user_id")
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.password")
	public String getPassword() {
		return password;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.password")
	public void setPassword(String password) {
		this.password = password;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.name")
	public String getName() {
		return name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.name")
	public void setName(String name) {
		this.name = name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.role_type")
	public String getRoleType() {
		return roleType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.role_type")
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.default_place_oid")
	public Long getDefaultPlaceOid() {
		return defaultPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.default_place_oid")
	public void setDefaultPlaceOid(Long defaultPlaceOid) {
		this.defaultPlaceOid = defaultPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.enabled_place_oid_values")
	public String getEnabledPlaceOidValues() {
		return enabledPlaceOidValues;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.enabled_place_oid_values")
	public void setEnabledPlaceOidValues(String enabledPlaceOidValues) {
		this.enabledPlaceOidValues = enabledPlaceOidValues;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.loading_oid")
	public Long getLoadingOid() {
		return loadingOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.loading_oid")
	public void setLoadingOid(Long loadingOid) {
		this.loadingOid = loadingOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4205135+09:00", comments = "Source field: public.users.discharge_oid")
	public Long getDischargeOid() {
		return dischargeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4215122+09:00", comments = "Source field: public.users.discharge_oid")
	public void setDischargeOid(Long dischargeOid) {
		this.dischargeOid = dischargeOid;
	}
}