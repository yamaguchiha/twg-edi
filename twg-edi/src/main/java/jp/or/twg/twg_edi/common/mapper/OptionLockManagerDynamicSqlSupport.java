package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionLockManagerDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	public static final OptionLockManager optionLockManager = new OptionLockManager();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.oid")
	public static final SqlColumn<Long> oid = optionLockManager.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_id")
	public static final SqlColumn<String> threadId = optionLockManager.threadId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.users_oid")
	public static final SqlColumn<Long> usersOid = optionLockManager.usersOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.place_oid")
	public static final SqlColumn<Long> placeOid = optionLockManager.placeOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.lock_status")
	public static final SqlColumn<String> lockStatus = optionLockManager.lockStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_class")
	public static final SqlColumn<String> threadClass = optionLockManager.threadClass;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.thread_num")
	public static final SqlColumn<Integer> threadNum = optionLockManager.threadNum;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.start_up_time")
	public static final SqlColumn<Date> startUpTime = optionLockManager.startUpTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.close_out_time")
	public static final SqlColumn<Date> closeOutTime = optionLockManager.closeOutTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_lock_manager.memo")
	public static final SqlColumn<String> memo = optionLockManager.memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_lock_manager")
	public static final class OptionLockManager extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> threadId = column("thread_id", JDBCType.VARCHAR);
		public final SqlColumn<Long> usersOid = column("users_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeOid = column("place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> lockStatus = column("lock_status", JDBCType.CHAR);
		public final SqlColumn<String> threadClass = column("thread_class", JDBCType.VARCHAR);
		public final SqlColumn<Integer> threadNum = column("thread_num", JDBCType.INTEGER);
		public final SqlColumn<Date> startUpTime = column("start_up_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Date> closeOutTime = column("close_out_time", JDBCType.TIMESTAMP);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);

		public OptionLockManager() {
			super("public.option_lock_manager");
		}
	}
}