package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionCalendarSettingDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	public static final OptionCalendarSetting optionCalendarSetting = new OptionCalendarSetting();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.option_calendar_setting.oid")
	public static final SqlColumn<Long> oid = optionCalendarSetting.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.option_calendar_setting.option_calendar_oid")
	public static final SqlColumn<Long> optionCalendarOid = optionCalendarSetting.optionCalendarOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.option_calendar_setting.date")
	public static final SqlColumn<Date> date = optionCalendarSetting.date;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.option_calendar_setting.operating_info")
	public static final SqlColumn<Integer> operatingInfo = optionCalendarSetting.operatingInfo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.option_calendar_setting.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionCalendarSetting.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.option_calendar_setting.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionCalendarSetting.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.option_calendar_setting.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionCalendarSetting.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.option_calendar_setting.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionCalendarSetting.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.option_calendar_setting.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionCalendarSetting.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.option_calendar_setting.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionCalendarSetting.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.option_calendar_setting")
	public static final class OptionCalendarSetting extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> optionCalendarOid = column("option_calendar_oid", JDBCType.BIGINT);
		public final SqlColumn<Date> date = column("date", JDBCType.DATE);
		public final SqlColumn<Integer> operatingInfo = column("operating_info", JDBCType.INTEGER);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionCalendarSetting() {
			super("public.option_calendar_setting");
		}
	}
}