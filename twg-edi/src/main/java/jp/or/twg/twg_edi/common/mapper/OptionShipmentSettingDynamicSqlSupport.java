package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionShipmentSettingDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	public static final OptionShipmentSetting optionShipmentSetting = new OptionShipmentSetting();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.oid")
	public static final SqlColumn<Long> oid = optionShipmentSetting.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.option_shipment_oid")
	public static final SqlColumn<Long> optionShipmentOid = optionShipmentSetting.optionShipmentOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.place_of_discharge_id")
	public static final SqlColumn<String> placeOfDischargeId = optionShipmentSetting.placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.place_sf_oid")
	public static final SqlColumn<Long> placeSfOid = optionShipmentSetting.placeSfOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.processing_no")
	public static final SqlColumn<Integer> processingNo = optionShipmentSetting.processingNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.processing_date_type")
	public static final SqlColumn<Integer> processingDateType = optionShipmentSetting.processingDateType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionShipmentSetting.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionShipmentSetting.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionShipmentSetting.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionShipmentSetting.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionShipmentSetting.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source field: public.option_shipment_setting.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionShipmentSetting.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5112693+09:00", comments = "Source Table: public.option_shipment_setting")
	public static final class OptionShipmentSetting extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> optionShipmentOid = column("option_shipment_oid", JDBCType.BIGINT);
		public final SqlColumn<String> placeOfDischargeId = column("place_of_discharge_id", JDBCType.VARCHAR);
		public final SqlColumn<Long> placeSfOid = column("place_sf_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> processingNo = column("processing_no", JDBCType.INTEGER);
		public final SqlColumn<Integer> processingDateType = column("processing_date_type", JDBCType.INTEGER);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionShipmentSetting() {
			super("public.option_shipment_setting");
		}
	}
}