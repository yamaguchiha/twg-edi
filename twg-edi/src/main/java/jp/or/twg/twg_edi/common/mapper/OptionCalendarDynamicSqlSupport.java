package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionCalendarDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source Table: public.option_calendar")
	public static final OptionCalendar optionCalendar = new OptionCalendar();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source field: public.option_calendar.oid")
	public static final SqlColumn<Long> oid = optionCalendar.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source field: public.option_calendar.place_st_oid")
	public static final SqlColumn<Long> placeStOid = optionCalendar.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source field: public.option_calendar.calendar_no")
	public static final SqlColumn<Integer> calendarNo = optionCalendar.calendarNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source field: public.option_calendar.memo")
	public static final SqlColumn<String> memo = optionCalendar.memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source field: public.option_calendar.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionCalendar.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source field: public.option_calendar.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionCalendar.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source field: public.option_calendar.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionCalendar.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source field: public.option_calendar.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionCalendar.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source field: public.option_calendar.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionCalendar.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source field: public.option_calendar.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionCalendar.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.491324+09:00", comments = "Source Table: public.option_calendar")
	public static final class OptionCalendar extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> calendarNo = column("calendar_no", JDBCType.INTEGER);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionCalendar() {
			super("public.option_calendar");
		}
	}
}