package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PartyDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	public static final Party party = new Party();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.oid")
	public static final SqlColumn<Long> oid = party.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.tdb_party_code")
	public static final SqlColumn<String> tdbPartyCode = party.tdbPartyCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.party.name")
	public static final SqlColumn<String> name = party.name;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.party")
	public static final class Party extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> tdbPartyCode = column("tdb_party_code", JDBCType.VARCHAR);
		public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

		public Party() {
			super("public.party");
		}
	}
}