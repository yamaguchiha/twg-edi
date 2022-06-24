package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptSystemConfigDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source Table: public.opt_system_config")
	public static final OptSystemConfig optSystemConfig = new OptSystemConfig();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.opt_system_config.oid")
	public static final SqlColumn<Long> oid = optSystemConfig.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.opt_system_config.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = optSystemConfig.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.opt_system_config.category")
	public static final SqlColumn<String> category = optSystemConfig.category;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.opt_system_config.opt_place_oid")
	public static final SqlColumn<Long> optPlaceOid = optSystemConfig.optPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.opt_system_config.parameter")
	public static final SqlColumn<String> parameter = optSystemConfig.parameter;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source field: public.opt_system_config.memo")
	public static final SqlColumn<String> memo = optSystemConfig.memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4973066+09:00", comments = "Source Table: public.opt_system_config")
	public static final class OptSystemConfig extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);
		public final SqlColumn<Long> optPlaceOid = column("opt_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> parameter = column("parameter", JDBCType.VARCHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);

		public OptSystemConfig() {
			super("public.opt_system_config");
		}
	}
}