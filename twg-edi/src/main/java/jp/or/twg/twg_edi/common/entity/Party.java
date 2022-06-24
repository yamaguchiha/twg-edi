package jp.or.twg.twg_edi.common.entity;

import javax.annotation.Generated;

public class Party {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.tdb_party_code")
	private String tdbPartyCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.name")
	private String name;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.tdb_party_code")
	public String getTdbPartyCode() {
		return tdbPartyCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.tdb_party_code")
	public void setTdbPartyCode(String tdbPartyCode) {
		this.tdbPartyCode = tdbPartyCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.name")
	public String getName() {
		return name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.name")
	public void setName(String name) {
		this.name = name;
	}
}