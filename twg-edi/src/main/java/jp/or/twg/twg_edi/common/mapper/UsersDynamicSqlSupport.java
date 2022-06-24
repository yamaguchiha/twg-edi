package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UsersDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4394617+09:00", comments = "Source Table: public.users")
	public static final Users users = new Users();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4414563+09:00", comments = "Source field: public.users.oid")
	public static final SqlColumn<Long> oid = users.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4424541+09:00", comments = "Source field: public.users.user_id")
	public static final SqlColumn<String> userId = users.userId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4424541+09:00", comments = "Source field: public.users.password")
	public static final SqlColumn<String> password = users.password;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4424541+09:00", comments = "Source field: public.users.name")
	public static final SqlColumn<String> name = users.name;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4424541+09:00", comments = "Source field: public.users.role_type")
	public static final SqlColumn<String> roleType = users.roleType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4424541+09:00", comments = "Source field: public.users.default_place_oid")
	public static final SqlColumn<Long> defaultPlaceOid = users.defaultPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4424541+09:00", comments = "Source field: public.users.enabled_place_oid_values")
	public static final SqlColumn<String> enabledPlaceOidValues = users.enabledPlaceOidValues;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4424541+09:00", comments = "Source field: public.users.loading_oid")
	public static final SqlColumn<Long> loadingOid = users.loadingOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4424541+09:00", comments = "Source field: public.users.discharge_oid")
	public static final SqlColumn<Long> dischargeOid = users.dischargeOid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4404597+09:00", comments = "Source Table: public.users")
	public static final class Users extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);
		public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);
		public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
		public final SqlColumn<String> roleType = column("role_type", JDBCType.VARCHAR);
		public final SqlColumn<Long> defaultPlaceOid = column("default_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> enabledPlaceOidValues = column("enabled_place_oid_values", JDBCType.VARCHAR);
		public final SqlColumn<Long> loadingOid = column("loading_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> dischargeOid = column("discharge_oid", JDBCType.BIGINT);

		public Users() {
			super("public.users");
		}
	}
}