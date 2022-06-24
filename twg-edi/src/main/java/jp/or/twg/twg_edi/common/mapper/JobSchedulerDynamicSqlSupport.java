package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JobSchedulerDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	public static final JobScheduler jobScheduler = new JobScheduler();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.id")
	public static final SqlColumn<Long> id = jobScheduler.id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = jobScheduler.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.job_category")
	public static final SqlColumn<String> jobCategory = jobScheduler.jobCategory;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.schedule")
	public static final SqlColumn<String> schedule = jobScheduler.schedule;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.comment")
	public static final SqlColumn<String> comment = jobScheduler.comment;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.parameter")
	public static final SqlColumn<String> parameter = jobScheduler.parameter;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.valid")
	public static final SqlColumn<String> valid = jobScheduler.valid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = jobScheduler.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.job_scheduler.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = jobScheduler.tsLastModifiedDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source Table: public.job_scheduler")
	public static final class JobScheduler extends SqlTable {
		public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> jobCategory = column("job_category", JDBCType.VARCHAR);
		public final SqlColumn<String> schedule = column("schedule", JDBCType.VARCHAR);
		public final SqlColumn<String> comment = column("comment", JDBCType.VARCHAR);
		public final SqlColumn<String> parameter = column("parameter", JDBCType.VARCHAR);
		public final SqlColumn<String> valid = column("valid", JDBCType.CHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);

		public JobScheduler() {
			super("public.job_scheduler");
		}
	}
}