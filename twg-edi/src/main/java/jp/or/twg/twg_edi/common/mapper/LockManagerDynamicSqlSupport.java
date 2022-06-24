package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LockManagerDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.lock_manager")
	public static final LockManager lockManager = new LockManager();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.lock_manager.oid")
	public static final SqlColumn<Long> oid = lockManager.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.lock_manager.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = lockManager.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.lock_manager.thread_id")
	public static final SqlColumn<String> threadId = lockManager.threadId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.lock_manager.users_oid")
	public static final SqlColumn<Long> usersOid = lockManager.usersOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.lock_manager.lock_status")
	public static final SqlColumn<String> lockStatus = lockManager.lockStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.lock_manager.start_up_time")
	public static final SqlColumn<Date> startUpTime = lockManager.startUpTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.lock_manager.close_out_time")
	public static final SqlColumn<Date> closeOutTime = lockManager.closeOutTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source field: public.lock_manager.memo")
	public static final SqlColumn<String> memo = lockManager.memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.lock_manager")
	public static final class LockManager extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> threadId = column("thread_id", JDBCType.VARCHAR);
		public final SqlColumn<Long> usersOid = column("users_oid", JDBCType.BIGINT);
		public final SqlColumn<String> lockStatus = column("lock_status", JDBCType.CHAR);
		public final SqlColumn<Date> startUpTime = column("start_up_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Date> closeOutTime = column("close_out_time", JDBCType.TIMESTAMP);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);

		public LockManager() {
			super("public.lock_manager");
		}
	}
}