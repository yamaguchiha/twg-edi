package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptUsersDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.opt_users")
	public static final OptUsers optUsers = new OptUsers();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.oid")
	public static final SqlColumn<Long> oid = optUsers.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.users_oid")
	public static final SqlColumn<Long> usersOid = optUsers.usersOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.loading_oid")
	public static final SqlColumn<Long> loadingOid = optUsers.loadingOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source field: public.opt_users.discharge_oid")
	public static final SqlColumn<Long> dischargeOid = optUsers.dischargeOid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5022934+09:00", comments = "Source Table: public.opt_users")
	public static final class OptUsers extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> usersOid = column("users_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> loadingOid = column("loading_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> dischargeOid = column("discharge_oid", JDBCType.BIGINT);

		public OptUsers() {
			super("public.opt_users");
		}
	}
}