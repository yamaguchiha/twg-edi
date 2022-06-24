package jp.or.twg.twg_edi.common.entity;

import javax.annotation.Generated;

public class PartySetting {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.party_oid")
	private Long partyOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.own_place_oid")
	private Long ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.abbr_code")
	private String abbrCode;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.party_oid")
	public Long getPartyOid() {
		return partyOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.party_oid")
	public void setPartyOid(Long partyOid) {
		this.partyOid = partyOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.own_place_oid")
	public Long getOwnPlaceOid() {
		return ownPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.own_place_oid")
	public void setOwnPlaceOid(Long ownPlaceOid) {
		this.ownPlaceOid = ownPlaceOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.abbr_code")
	public String getAbbrCode() {
		return abbrCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.abbr_code")
	public void setAbbrCode(String abbrCode) {
		this.abbrCode = abbrCode;
	}
}