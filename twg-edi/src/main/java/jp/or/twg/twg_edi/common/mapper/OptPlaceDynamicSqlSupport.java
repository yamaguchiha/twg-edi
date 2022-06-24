package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptPlaceDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	public static final OptPlace optPlace = new OptPlace();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.opt_place.oid")
	public static final SqlColumn<Long> oid = optPlace.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.opt_place.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = optPlace.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.opt_place.discharge")
	public static final SqlColumn<String> discharge = optPlace.discharge;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.opt_place.code")
	public static final SqlColumn<String> code = optPlace.code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.opt_place.name")
	public static final SqlColumn<String> name = optPlace.name;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.opt_place.opt_place_type")
	public static final SqlColumn<String> optPlaceType = optPlace.optPlaceType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.opt_place.area_pattern")
	public static final SqlColumn<String> areaPattern = optPlace.areaPattern;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.opt_place.print_sikiri_type")
	public static final SqlColumn<String> printSikiriType = optPlace.printSikiriType;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.opt_place")
	public static final class OptPlace extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> discharge = column("discharge", JDBCType.CHAR);
		public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
		public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
		public final SqlColumn<String> optPlaceType = column("opt_place_type", JDBCType.VARCHAR);
		public final SqlColumn<String> areaPattern = column("area_pattern", JDBCType.VARCHAR);
		public final SqlColumn<String> printSikiriType = column("print_sikiri_type", JDBCType.VARCHAR);

		public OptPlace() {
			super("public.opt_place");
		}
	}
}