package jp.or.twg.twg_edi.common.entity;

import javax.annotation.Generated;

public class OptUsers {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.users_oid")
	private Long usersOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.loading_oid")
	private Long loadingOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.discharge_oid")
	private Long dischargeOid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.users_oid")
	public Long getUsersOid() {
		return usersOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.users_oid")
	public void setUsersOid(Long usersOid) {
		this.usersOid = usersOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.loading_oid")
	public Long getLoadingOid() {
		return loadingOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.loading_oid")
	public void setLoadingOid(Long loadingOid) {
		this.loadingOid = loadingOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.discharge_oid")
	public Long getDischargeOid() {
		return dischargeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.discharge_oid")
	public void setDischargeOid(Long dischargeOid) {
		this.dischargeOid = dischargeOid;
	}
}