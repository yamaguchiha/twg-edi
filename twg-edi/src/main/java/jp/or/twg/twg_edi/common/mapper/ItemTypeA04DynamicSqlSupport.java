package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemTypeA04DynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source Table: public.item_type_a04")
	public static final ItemTypeA04 itemTypeA04 = new ItemTypeA04();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source field: public.item_type_a04.oid")
	public static final SqlColumn<Long> oid = itemTypeA04.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source field: public.item_type_a04.own_place_oid")
	public static final SqlColumn<Long> ownPlaceOid = itemTypeA04.ownPlaceOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source field: public.item_type_a04.description")
	public static final SqlColumn<String> description = itemTypeA04.description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source field: public.item_type_a04.note")
	public static final SqlColumn<String> note = itemTypeA04.note;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source field: public.item_type_a04.default_flag")
	public static final SqlColumn<String> defaultFlag = itemTypeA04.defaultFlag;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source field: public.item_type_a04.memo")
	public static final SqlColumn<String> memo = itemTypeA04.memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4723737+09:00", comments = "Source Table: public.item_type_a04")
	public static final class ItemTypeA04 extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> ownPlaceOid = column("own_place_oid", JDBCType.BIGINT);
		public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);
		public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);
		public final SqlColumn<String> defaultFlag = column("default_flag", JDBCType.CHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);

		public ItemTypeA04() {
			super("public.item_type_a04");
		}
	}
}