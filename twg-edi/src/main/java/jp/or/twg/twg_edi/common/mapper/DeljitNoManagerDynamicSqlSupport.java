package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DeljitNoManagerDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	public static final DeljitNoManager deljitNoManager = new DeljitNoManager();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source field: public.deljit_no_manager.oid")
	public static final SqlColumn<Long> oid = deljitNoManager.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source field: public.deljit_no_manager.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = deljitNoManager.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source field: public.deljit_no_manager.delivery_date")
	public static final SqlColumn<String> deliveryDate = deljitNoManager.deliveryDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source field: public.deljit_no_manager.deljit_no")
	public static final SqlColumn<Long> deljitNo = deljitNoManager.deljitNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source field: public.deljit_no_manager.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = deljitNoManager.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source field: public.deljit_no_manager.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = deljitNoManager.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source field: public.deljit_no_manager.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = deljitNoManager.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source field: public.deljit_no_manager.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = deljitNoManager.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source field: public.deljit_no_manager.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = deljitNoManager.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source field: public.deljit_no_manager.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = deljitNoManager.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4873344+09:00", comments = "Source Table: public.deljit_no_manager")
	public static final class DeljitNoManager extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> deliveryDate = column("delivery_date", JDBCType.VARCHAR);
		public final SqlColumn<Long> deljitNo = column("deljit_no", JDBCType.BIGINT);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public DeljitNoManager() {
			super("public.deljit_no_manager");
		}
	}
}