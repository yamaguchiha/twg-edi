package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PartySettingDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source Table: public.party_setting")
	public static final PartySetting partySetting = new PartySetting();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.oid")
	public static final SqlColumn<Long> oid = partySetting.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.party_oid")
	public static final SqlColumn<Long> partyOid = partySetting.partyOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = partySetting.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source field: public.party_setting.abbr_code")
	public static final SqlColumn<String> abbrCode = partySetting.abbrCode;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4743684+09:00", comments = "Source Table: public.party_setting")
	public static final class PartySetting extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> partyOid = column("party_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> abbrCode = column("abbr_code", JDBCType.VARCHAR);

		public PartySetting() {
			super("public.party_setting");
		}
	}
}