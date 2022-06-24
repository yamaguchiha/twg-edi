package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SystemConfigDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	public static final SystemConfig systemConfig = new SystemConfig();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.oid")
	public static final SqlColumn<Long> oid = systemConfig.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = systemConfig.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.category")
	public static final SqlColumn<String> category = systemConfig.category;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.parameter")
	public static final SqlColumn<String> parameter = systemConfig.parameter;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source field: public.system_config.memo")
	public static final SqlColumn<String> memo = systemConfig.memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4853402+09:00", comments = "Source Table: public.system_config")
	public static final class SystemConfig extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);
		public final SqlColumn<String> parameter = column("parameter", JDBCType.VARCHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);

		public SystemConfig() {
			super("public.system_config");
		}
	}
}