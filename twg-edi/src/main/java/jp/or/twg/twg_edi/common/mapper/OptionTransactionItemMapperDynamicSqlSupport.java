package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptionTransactionItemMapperDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source Table: public.option_transaction_item_mapper")
	public static final OptionTransactionItemMapper optionTransactionItemMapper = new OptionTransactionItemMapper();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.oid")
	public static final SqlColumn<Long> oid = optionTransactionItemMapper.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.transaction_oid")
	public static final SqlColumn<Long> transactionOid = optionTransactionItemMapper.transactionOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.item_oid")
	public static final SqlColumn<Long> itemOid = optionTransactionItemMapper.itemOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_date")
	public static final SqlColumn<Date> tsRegistererDate = optionTransactionItemMapper.tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_user_id")
	public static final SqlColumn<Long> tsRegistererUserId = optionTransactionItemMapper.tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_user_place_id")
	public static final SqlColumn<Long> tsRegistererUserPlaceId = optionTransactionItemMapper.tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_date")
	public static final SqlColumn<Date> tsLastModifiedDate = optionTransactionItemMapper.tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_user_id")
	public static final SqlColumn<Long> tsLastModifiedUserId = optionTransactionItemMapper.tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_user_place_id")
	public static final SqlColumn<Long> tsLastModifiedUserPlaceId = optionTransactionItemMapper.tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source Table: public.option_transaction_item_mapper")
	public static final class OptionTransactionItemMapper extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<Long> transactionOid = column("transaction_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> itemOid = column("item_oid", JDBCType.BIGINT);
		public final SqlColumn<Date> tsRegistererDate = column("ts_registerer_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsRegistererUserId = column("ts_registerer_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsRegistererUserPlaceId = column("ts_registerer_user_place_id", JDBCType.BIGINT);
		public final SqlColumn<Date> tsLastModifiedDate = column("ts_last_modified_date", JDBCType.TIMESTAMP);
		public final SqlColumn<Long> tsLastModifiedUserId = column("ts_last_modified_user_id", JDBCType.BIGINT);
		public final SqlColumn<Long> tsLastModifiedUserPlaceId = column("ts_last_modified_user_place_id",
				JDBCType.BIGINT);

		public OptionTransactionItemMapper() {
			super("public.option_transaction_item_mapper");
		}
	}
}