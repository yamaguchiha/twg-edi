package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionSlipNoManagerDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	public static final OptionSlipNoManager optionSlipNoManager = new OptionSlipNoManager();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.oid")
	public static final SqlColumn<Long> oid = optionSlipNoManager.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.manager_type")
	public static final SqlColumn<String> managerType = optionSlipNoManager.managerType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.place_st_oid")
	public static final SqlColumn<Long> placeStOid = optionSlipNoManager.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.slip_no_01")
	public static final SqlColumn<Long> slipNo01 = optionSlipNoManager.slipNo01;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.slip_no_02")
	public static final SqlColumn<Long> slipNo02 = optionSlipNoManager.slipNo02;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionSlipNoManager.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionSlipNoManager.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionSlipNoManager.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionSlipNoManager.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionSlipNoManager.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source field: public.option_slip_no_manager.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionSlipNoManager.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5242346+09:00", comments = "Source Table: public.option_slip_no_manager")
	public static final class OptionSlipNoManager extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> managerType = column("manager_type", JDBCType.VARCHAR);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> slipNo01 = column("slip_no_01", JDBCType.BIGINT);
		public final SqlColumn<Long> slipNo02 = column("slip_no_02", JDBCType.BIGINT);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionSlipNoManager() {
			super("public.option_slip_no_manager");
		}
	}
}