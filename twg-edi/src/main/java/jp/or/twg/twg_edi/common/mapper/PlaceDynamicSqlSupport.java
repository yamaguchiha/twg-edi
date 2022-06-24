package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PlaceDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	public static final Place place = new Place();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.place.oid")
	public static final SqlColumn<Long> oid = place.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.place.party_oid")
	public static final SqlColumn<Long> partyOid = place.partyOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.place.tdb_place_code")
	public static final SqlColumn<String> tdbPlaceCode = place.tdbPlaceCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.place.name")
	public static final SqlColumn<String> name = place.name;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.place.valid_start_string_date")
	public static final SqlColumn<String> validStartStringDate = place.validStartStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.place.valid_end_string_date")
	public static final SqlColumn<String> validEndStringDate = place.validEndStringDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.place")
	public static final class Place extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> partyOid = column("party_oid", JDBCType.BIGINT);
		public final SqlColumn<String> tdbPlaceCode = column("tdb_place_code", JDBCType.VARCHAR);
		public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
		public final SqlColumn<String> validStartStringDate = column("valid_start_string_date", JDBCType.VARCHAR);
		public final SqlColumn<String> validEndStringDate = column("valid_end_string_date", JDBCType.VARCHAR);

		public Place() {
			super("public.place");
		}
	}
}