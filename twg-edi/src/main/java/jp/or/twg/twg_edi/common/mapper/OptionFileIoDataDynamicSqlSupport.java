package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionFileIoDataDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.option_file_io_data")
	public static final OptionFileIoData optionFileIoData = new OptionFileIoData();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.oid")
	public static final SqlColumn<Long> oid = optionFileIoData.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.content_type")
	public static final SqlColumn<String> contentType = optionFileIoData.contentType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.charset_name")
	public static final SqlColumn<String> charsetName = optionFileIoData.charsetName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.file_name")
	public static final SqlColumn<String> fileName = optionFileIoData.fileName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.value")
	public static final SqlColumn<String> value = optionFileIoData.value;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionFileIoData.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionFileIoData.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionFileIoData.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionFileIoData.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionFileIoData.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source field: public.option_file_io_data.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionFileIoData.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5142611+09:00", comments = "Source Table: public.option_file_io_data")
	public static final class OptionFileIoData extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> contentType = column("content_type", JDBCType.VARCHAR);
		public final SqlColumn<String> charsetName = column("charset_name", JDBCType.VARCHAR);
		public final SqlColumn<String> fileName = column("file_name", JDBCType.VARCHAR);
		public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionFileIoData() {
			super("public.option_file_io_data");
		}
	}
}