package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DelforPsDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.delfor_ps")
	public static final DelforPs delforPs = new DelforPs();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.oid")
	public static final SqlColumn<Long> oid = delforPs.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.doc_ref_id_ps")
	public static final SqlColumn<String> docRefIdPs = delforPs.docRefIdPs;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.date_format")
	public static final SqlColumn<String> dateFormat = delforPs.dateFormat;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.date")
	public static final SqlColumn<String> date = delforPs.date;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.party_id_by")
	public static final SqlColumn<String> partyIdBy = delforPs.partyIdBy;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.place_id_by")
	public static final SqlColumn<String> placeIdBy = delforPs.placeIdBy;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.party_id_se")
	public static final SqlColumn<String> partyIdSe = delforPs.partyIdSe;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.place_id_se")
	public static final SqlColumn<String> placeIdSe = delforPs.placeIdSe;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.item_id_in")
	public static final SqlColumn<String> itemIdIn = delforPs.itemIdIn;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.item_e18")
	public static final SqlColumn<String> itemE18 = delforPs.itemE18;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source field: public.delfor_ps.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = delforPs.tsLastModifiedDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5212442+09:00", comments = "Source Table: public.delfor_ps")
	public static final class DelforPs extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> docRefIdPs = column("doc_ref_id_ps", JDBCType.VARCHAR);
		public final SqlColumn<String> dateFormat = column("date_format", JDBCType.VARCHAR);
		public final SqlColumn<String> date = column("date", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdBy = column("party_id_by", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdBy = column("place_id_by", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdSe = column("party_id_se", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdSe = column("place_id_se", JDBCType.VARCHAR);
		public final SqlColumn<String> itemIdIn = column("item_id_in", JDBCType.VARCHAR);
		public final SqlColumn<String> itemE18 = column("item_e18", JDBCType.VARCHAR);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);

		public DelforPs() {
			super("public.delfor_ps");
		}
	}
}