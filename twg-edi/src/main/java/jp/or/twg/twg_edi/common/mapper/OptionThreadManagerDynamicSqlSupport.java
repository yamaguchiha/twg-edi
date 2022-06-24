package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionThreadManagerDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	public static final OptionThreadManager optionThreadManager = new OptionThreadManager();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.id")
	public static final SqlColumn<String> id = optionThreadManager.id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.thread_status")
	public static final SqlColumn<String> threadStatus = optionThreadManager.threadStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.thread_category")
	public static final SqlColumn<String> threadCategory = optionThreadManager.threadCategory;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.users_oid")
	public static final SqlColumn<Long> usersOid = optionThreadManager.usersOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.user_place_oid")
	public static final SqlColumn<Long> userPlaceOid = optionThreadManager.userPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.place_of_discharge_id")
	public static final SqlColumn<String> placeOfDischargeId = optionThreadManager.placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.start_up_time")
	public static final SqlColumn<Date> startUpTime = optionThreadManager.startUpTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.close_out_time")
	public static final SqlColumn<Date> closeOutTime = optionThreadManager.closeOutTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.party_oid")
	public static final SqlColumn<Long> partyOid = optionThreadManager.partyOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.place_oid")
	public static final SqlColumn<Long> placeOid = optionThreadManager.placeOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_number")
	public static final SqlColumn<Integer> dataNumber = optionThreadManager.dataNumber;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_size")
	public static final SqlColumn<Integer> dataSize = optionThreadManager.dataSize;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.data_size2")
	public static final SqlColumn<Integer> dataSize2 = optionThreadManager.dataSize2;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.error_message")
	public static final SqlColumn<String> errorMessage = optionThreadManager.errorMessage;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.memo")
	public static final SqlColumn<String> memo = optionThreadManager.memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source field: public.option_thread_manager.memo2")
	public static final SqlColumn<String> memo2 = optionThreadManager.memo2;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	public static final class OptionThreadManager extends SqlTable {
		public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);
		public final SqlColumn<String> threadStatus = column("thread_status", JDBCType.VARCHAR);
		public final SqlColumn<String> threadCategory = column("thread_category", JDBCType.VARCHAR);
		public final SqlColumn<Long> usersOid = column("users_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> userPlaceOid = column("user_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> placeOfDischargeId = column("place_of_discharge_id", JDBCType.VARCHAR);
		public final SqlColumn<Date> startUpTime = column("start_up_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Date> closeOutTime = column("close_out_time", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> partyOid = column("party_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeOid = column("place_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> dataNumber = column("data_number", JDBCType.INTEGER);
		public final SqlColumn<Integer> dataSize = column("data_size", JDBCType.INTEGER);
		public final SqlColumn<Integer> dataSize2 = column("data_size2", JDBCType.INTEGER);
		public final SqlColumn<String> errorMessage = column("error_message", JDBCType.VARCHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);
		public final SqlColumn<String> memo2 = column("memo2", JDBCType.VARCHAR);

		public OptionThreadManager() {
			super("public.option_thread_manager");
		}
	}
}