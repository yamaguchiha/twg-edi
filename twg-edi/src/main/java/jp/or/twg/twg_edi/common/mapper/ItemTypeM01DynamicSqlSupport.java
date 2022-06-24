package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemTypeM01DynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source Table: public.item_type_m01")
	public static final ItemTypeM01 itemTypeM01 = new ItemTypeM01();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source field: public.item_type_m01.oid")
	public static final SqlColumn<Long> oid = itemTypeM01.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source field: public.item_type_m01.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = itemTypeM01.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source field: public.item_type_m01.description")
	public static final SqlColumn<String> description = itemTypeM01.description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source field: public.item_type_m01.note")
	public static final SqlColumn<String> note = itemTypeM01.note;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source field: public.item_type_m01.default_flag")
	public static final SqlColumn<String> defaultFlag = itemTypeM01.defaultFlag;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source field: public.item_type_m01.memo")
	public static final SqlColumn<String> memo = itemTypeM01.memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4903287+09:00", comments = "Source Table: public.item_type_m01")
	public static final class ItemTypeM01 extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);
		public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);
		public final SqlColumn<String> defaultFlag = column("default_flag", JDBCType.CHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);

		public ItemTypeM01() {
			super("public.item_type_m01");
		}
	}
}