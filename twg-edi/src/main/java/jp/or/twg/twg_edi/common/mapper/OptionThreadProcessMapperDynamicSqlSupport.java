package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionThreadProcessMapperDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_thread_process_mapper")
	public static final OptionThreadProcessMapper optionThreadProcessMapper = new OptionThreadProcessMapper();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_thread_process_mapper.oid")
	public static final SqlColumn<Long> oid = optionThreadProcessMapper.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_thread_process_mapper.thread_id")
	public static final SqlColumn<String> threadId = optionThreadProcessMapper.threadId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_thread_process_mapper.process_oid")
	public static final SqlColumn<Long> processOid = optionThreadProcessMapper.processOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_thread_process_mapper.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionThreadProcessMapper.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_thread_process_mapper.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionThreadProcessMapper.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_thread_process_mapper.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionThreadProcessMapper.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source field: public.option_thread_process_mapper.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionThreadProcessMapper.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.option_thread_process_mapper.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionThreadProcessMapper.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source field: public.option_thread_process_mapper.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionThreadProcessMapper.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5152586+09:00", comments = "Source Table: public.option_thread_process_mapper")
	public static final class OptionThreadProcessMapper extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> threadId = column("thread_id", JDBCType.VARCHAR);
		public final SqlColumn<Long> processOid = column("process_oid", JDBCType.BIGINT);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionThreadProcessMapper() {
			super("public.option_thread_process_mapper");
		}
	}
}