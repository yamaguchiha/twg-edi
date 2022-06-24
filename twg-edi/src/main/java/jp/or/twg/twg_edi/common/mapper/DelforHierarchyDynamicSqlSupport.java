package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DelforHierarchyDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4693817+09:00", comments = "Source Table: public.delfor_hierarchy")
	public static final DelforHierarchy delforHierarchy = new DelforHierarchy();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4693817+09:00", comments = "Source field: public.delfor_hierarchy.oid")
	public static final SqlColumn<Long> oid = delforHierarchy.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4693817+09:00", comments = "Source field: public.delfor_hierarchy.delfor_ps_oid")
	public static final SqlColumn<Long> delforPsOid = delforHierarchy.delforPsOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4693817+09:00", comments = "Source field: public.delfor_hierarchy.hrc_level")
	public static final SqlColumn<Integer> hrcLevel = delforHierarchy.hrcLevel;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source field: public.delfor_hierarchy.party_id_by")
	public static final SqlColumn<String> partyIdBy = delforHierarchy.partyIdBy;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source field: public.delfor_hierarchy.place_id_by")
	public static final SqlColumn<String> placeIdBy = delforHierarchy.placeIdBy;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source field: public.delfor_hierarchy.party_id_se")
	public static final SqlColumn<String> partyIdSe = delforHierarchy.partyIdSe;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4703789+09:00", comments = "Source field: public.delfor_hierarchy.place_id_se")
	public static final SqlColumn<String> placeIdSe = delforHierarchy.placeIdSe;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4693817+09:00", comments = "Source Table: public.delfor_hierarchy")
	public static final class DelforHierarchy extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> delforPsOid = column("delfor_ps_oid", JDBCType.BIGINT);
		public final SqlColumn<Integer> hrcLevel = column("hrc_level", JDBCType.INTEGER);
		public final SqlColumn<String> partyIdBy = column("party_id_by", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdBy = column("place_id_by", JDBCType.VARCHAR);
		public final SqlColumn<String> partyIdSe = column("party_id_se", JDBCType.VARCHAR);
		public final SqlColumn<String> placeIdSe = column("place_id_se", JDBCType.VARCHAR);

		public DelforHierarchy() {
			super("public.delfor_hierarchy");
		}
	}
}