package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionSystemConfigDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source Table: public.option_system_config")
	public static final OptionSystemConfig optionSystemConfig = new OptionSystemConfig();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.oid")
	public static final SqlColumn<Long> oid = optionSystemConfig.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = optionSystemConfig.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.category")
	public static final SqlColumn<String> category = optionSystemConfig.category;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.parameter")
	public static final SqlColumn<String> parameter = optionSystemConfig.parameter;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.memo")
	public static final SqlColumn<String> memo = optionSystemConfig.memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionSystemConfig.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionSystemConfig.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionSystemConfig.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionSystemConfig.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionSystemConfig.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source field: public.option_system_config.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionSystemConfig.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5182516+09:00", comments = "Source Table: public.option_system_config")
	public static final class OptionSystemConfig extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);
		public final SqlColumn<String> parameter = column("parameter", JDBCType.VARCHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionSystemConfig() {
			super("public.option_system_config");
		}
	}
}