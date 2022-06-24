package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ThreadManagerDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	public static final ThreadManager threadManager = new ThreadManager();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.id")
	public static final SqlColumn<String> id = threadManager.id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = threadManager.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.thread_status")
	public static final SqlColumn<String> threadStatus = threadManager.threadStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.thread_category")
	public static final SqlColumn<String> threadCategory = threadManager.threadCategory;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.users_oid")
	public static final SqlColumn<Long> usersOid = threadManager.usersOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.user_place_oid")
	public static final SqlColumn<Long> userPlaceOid = threadManager.userPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.start_up_time")
	public static final SqlColumn<Date> startUpTime = threadManager.startUpTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.close_out_time")
	public static final SqlColumn<Date> closeOutTime = threadManager.closeOutTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.error_message")
	public static final SqlColumn<String> errorMessage = threadManager.errorMessage;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source field: public.thread_manager.memo")
	public static final SqlColumn<String> memo = threadManager.memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5032908+09:00", comments = "Source Table: public.thread_manager")
	public static final class ThreadManager extends SqlTable {
		public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> threadStatus = column("thread_status", JDBCType.VARCHAR);
		public final SqlColumn<String> threadCategory = column("thread_category", JDBCType.VARCHAR);
		public final SqlColumn<Long> usersOid = column("users_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> userPlaceOid = column("user_place_oid", JDBCType.BIGINT);
		public final SqlColumn<Date> startUpTime = column("start_up_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Date> closeOutTime = column("close_out_time", JDBCType.TIMESTAMP);
		public final SqlColumn<String> errorMessage = column("error_message", JDBCType.VARCHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);

		public ThreadManager() {
			super("public.thread_manager");
		}
	}
}