package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionSortConfigDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	public static final OptionSortConfig optionSortConfig = new OptionSortConfig();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.oid")
	public static final SqlColumn<Long> oid = optionSortConfig.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.users_oid")
	public static final SqlColumn<Long> usersOid = optionSortConfig.usersOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.page_id")
	public static final SqlColumn<String> pageId = optionSortConfig.pageId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.view_tab_type")
	public static final SqlColumn<String> viewTabType = optionSortConfig.viewTabType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.parameter")
	public static final SqlColumn<String> parameter = optionSortConfig.parameter;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionSortConfig.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionSortConfig.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionSortConfig.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionSortConfig.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionSortConfig.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source field: public.option_sort_config.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionSortConfig.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.option_sort_config")
	public static final class OptionSortConfig extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> usersOid = column("users_oid", JDBCType.BIGINT);
		public final SqlColumn<String> pageId = column("page_id", JDBCType.VARCHAR);
		public final SqlColumn<String> viewTabType = column("view_tab_type", JDBCType.VARCHAR);
		public final SqlColumn<String> parameter = column("parameter", JDBCType.VARCHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionSortConfig() {
			super("public.option_sort_config");
		}
	}
}