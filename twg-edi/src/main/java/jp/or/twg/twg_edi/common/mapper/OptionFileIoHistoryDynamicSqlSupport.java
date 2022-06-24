package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionFileIoHistoryDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	public static final OptionFileIoHistory optionFileIoHistory = new OptionFileIoHistory();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.oid")
	public static final SqlColumn<Long> oid = optionFileIoHistory.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.file_io_type_id")
	public static final SqlColumn<String> fileIoTypeId = optionFileIoHistory.fileIoTypeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.place_oid")
	public static final SqlColumn<Long> placeOid = optionFileIoHistory.placeOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.file_io_data_oid")
	public static final SqlColumn<Long> fileIoDataOid = optionFileIoHistory.fileIoDataOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.thread_manager_id")
	public static final SqlColumn<String> threadManagerId = optionFileIoHistory.threadManagerId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.acquired")
	public static final SqlColumn<String> acquired = optionFileIoHistory.acquired;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.create_data_oid")
	public static final SqlColumn<String> createDataOid = optionFileIoHistory.createDataOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.data_size")
	public static final SqlColumn<Integer> dataSize = optionFileIoHistory.dataSize;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.delete_flag")
	public static final SqlColumn<String> deleteFlag = optionFileIoHistory.deleteFlag;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionFileIoHistory.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionFileIoHistory.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionFileIoHistory.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionFileIoHistory.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionFileIoHistory.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionFileIoHistory.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source Table: public.option_file_io_history")
	public static final class OptionFileIoHistory extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> fileIoTypeId = column("file_io_type_id", JDBCType.VARCHAR);
		public final SqlColumn<Long> placeOid = column("place_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> fileIoDataOid = column("file_io_data_oid", JDBCType.BIGINT);
		public final SqlColumn<String> threadManagerId = column("thread_manager_id", JDBCType.VARCHAR);
		public final SqlColumn<String> acquired = column("acquired", JDBCType.CHAR);
		public final SqlColumn<String> createDataOid = column("create_data_oid", JDBCType.VARCHAR);
		public final SqlColumn<Integer> dataSize = column("data_size", JDBCType.INTEGER);
		public final SqlColumn<String> deleteFlag = column("delete_flag", JDBCType.CHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionFileIoHistory() {
			super("public.option_file_io_history");
		}
	}
}