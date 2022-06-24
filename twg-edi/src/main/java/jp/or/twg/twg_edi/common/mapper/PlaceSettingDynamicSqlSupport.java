package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PlaceSettingDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	public static final PlaceSetting placeSetting = new PlaceSetting();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.place_setting.oid")
	public static final SqlColumn<Long> oid = placeSetting.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.place_setting.place_oid")
	public static final SqlColumn<Long> placeOid = placeSetting.placeOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.place_setting.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = placeSetting.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.place_setting.doc_ref_id_p02")
	public static final SqlColumn<String> docRefIdP02 = placeSetting.docRefIdP02;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.place_setting.item_p07")
	public static final SqlColumn<String> itemP07 = placeSetting.itemP07;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.place_setting.item_bef_pattern")
	public static final SqlColumn<String> itemBefPattern = placeSetting.itemBefPattern;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.place_setting.before_process_flag")
	public static final SqlColumn<String> beforeProcessFlag = placeSetting.beforeProcessFlag;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.place_setting.before_process_start_string_date")
	public static final SqlColumn<String> beforeProcessStartStringDate = placeSetting.beforeProcessStartStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source field: public.place_setting.before_process_end_string_date")
	public static final SqlColumn<String> beforeProcessEndStringDate = placeSetting.beforeProcessEndStringDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5002988+09:00", comments = "Source Table: public.place_setting")
	public static final class PlaceSetting extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeOid = column("place_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> docRefIdP02 = column("doc_ref_id_p02", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP07 = column("item_p07", JDBCType.VARCHAR);
		public final SqlColumn<String> itemBefPattern = column("item_bef_pattern", JDBCType.VARCHAR);
		public final SqlColumn<String> beforeProcessFlag = column("before_process_flag", JDBCType.CHAR);
		public final SqlColumn<String> beforeProcessStartStringDate = column("before_process_start_string_date",
				JDBCType.VARCHAR);
		public final SqlColumn<String> beforeProcessEndStringDate = column("before_process_end_string_date",
				JDBCType.VARCHAR);

		public PlaceSetting() {
			super("public.place_setting");
		}
	}
}