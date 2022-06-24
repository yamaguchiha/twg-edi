package jp.or.twg.twg_edi.common.entity;

import javax.annotation.Generated;

import lombok.Getter;
import lombok.Setter;

public class Place {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.oid")
	private Long oid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.party_oid")
	private Long partyOid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.tdb_place_code")
	private String tdbPlaceCode;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.name")
	private String name;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.valid_start_string_date")
	private String validStartStringDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.place.valid_end_string_date")
	private String validEndStringDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.party_oid")
	public Long getPartyOid() {
		return partyOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.party_oid")
	public void setPartyOid(Long partyOid) {
		this.partyOid = partyOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.tdb_place_code")
	public String getTdbPlaceCode() {
		return tdbPlaceCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.tdb_place_code")
	public void setTdbPlaceCode(String tdbPlaceCode) {
		this.tdbPlaceCode = tdbPlaceCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.name")
	public String getName() {
		return name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.name")
	public void setName(String name) {
		this.name = name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5012962+09:00", comments = "Source field: public.place.valid_start_string_date")
	public String getValidStartStringDate() {
		return validStartStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.place.valid_start_string_date")
	public void setValidStartStringDate(String validStartStringDate) {
		this.validStartStringDate = validStartStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.place.valid_end_string_date")
	public String getValidEndStringDate() {
		return validEndStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.place.valid_end_string_date")
	public void setValidEndStringDate(String validEndStringDate) {
		this.validEndStringDate = validEndStringDate;
	}

	/**
	 * 企業
	 */
	@Getter
	@Setter
	private Party party;

	/**
	 * 企業設定
	 */
	@Getter
	@Setter
	private PartySetting partySetting;
}