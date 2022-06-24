package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NumberingDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	public static final Numbering numbering = new Numbering();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source field: public.numbering.id")
	public static final SqlColumn<String> id = numbering.id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source field: public.numbering.next_number")
	public static final SqlColumn<Long> nextNumber = numbering.nextNumber;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source Table: public.numbering")
	public static final class Numbering extends SqlTable {
		public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);
		public final SqlColumn<Long> nextNumber = column("next_number", JDBCType.BIGINT);

		public Numbering() {
			super("public.numbering");
		}
	}
}