package jp.or.twg.twg_edi.common.entity;

import java.util.Date;
import javax.annotation.Generated;

public class OptionTransactionItemMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.transaction_oid")
	private Long transactionOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.item_oid")
	private Long itemOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.transaction_oid")
	public Long getTransactionOid() {
		return transactionOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.transaction_oid")
	public void setTransactionOid(Long transactionOid) {
		this.transactionOid = transactionOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.item_oid")
	public Long getItemOid() {
		return itemOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.item_oid")
	public void setItemOid(Long itemOid) {
		this.itemOid = itemOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4863367+09:00", comments = "Source field: public.option_transaction_item_mapper.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}
}