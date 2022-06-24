package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.TransportHeaderDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.TransportHeader;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface TransportHeaderMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	BasicColumn[] selectList = BasicColumn.columnList(oid, transportDataType, aaSenderId, aaInterchangeDateTime,
			aaBodid, aaReceiverId, aaMessageDirection, syncCode, messageType, messageTypeCode, messageTypeCodeName,
			documentDateTime, dateTimePeriod257, partyNameSt, placeNameSt, partyNameSf, placeNameSf, memo,
			tsRegistererDate, tsRegistererUserId, tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId,
			tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<TransportHeader> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<TransportHeader> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("TransportHeaderResult")
	Optional<TransportHeader> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "TransportHeaderResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "transport_data_type", property = "transportDataType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_sender_id", property = "aaSenderId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_interchange_date_time", property = "aaInterchangeDateTime", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_bodid", property = "aaBodid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_receiver_id", property = "aaReceiverId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_message_direction", property = "aaMessageDirection", jdbcType = JdbcType.VARCHAR),
			@Result(column = "sync_code", property = "syncCode", jdbcType = JdbcType.VARCHAR),
			@Result(column = "message_type", property = "messageType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "message_type_code", property = "messageTypeCode", jdbcType = JdbcType.VARCHAR),
			@Result(column = "message_type_code_name", property = "messageTypeCodeName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "document_date_time", property = "documentDateTime", jdbcType = JdbcType.VARCHAR),
			@Result(column = "date_time_period_257", property = "dateTimePeriod257", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_name_st", property = "partyNameSt", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_name_st", property = "placeNameSt", jdbcType = JdbcType.VARCHAR),
			@Result(column = "party_name_sf", property = "partyNameSf", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_name_sf", property = "placeNameSf", jdbcType = JdbcType.VARCHAR),
			@Result(column = "memo", property = "memo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<TransportHeader> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, transportHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, transportHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default int insert(TransportHeader record) {
		return MyBatis3Utils.insert(this::insert, record, transportHeader,
				c -> c.map(oid).toProperty("oid").map(transportDataType).toProperty("transportDataType").map(aaSenderId)
						.toProperty("aaSenderId").map(aaInterchangeDateTime).toProperty("aaInterchangeDateTime")
						.map(aaBodid).toProperty("aaBodid").map(aaReceiverId).toProperty("aaReceiverId")
						.map(aaMessageDirection).toProperty("aaMessageDirection").map(syncCode).toProperty("syncCode")
						.map(messageType).toProperty("messageType").map(messageTypeCode).toProperty("messageTypeCode")
						.map(messageTypeCodeName).toProperty("messageTypeCodeName").map(documentDateTime)
						.toProperty("documentDateTime").map(dateTimePeriod257).toProperty("dateTimePeriod257")
						.map(partyNameSt).toProperty("partyNameSt").map(placeNameSt).toProperty("placeNameSt")
						.map(partyNameSf).toProperty("partyNameSf").map(placeNameSf).toProperty("placeNameSf").map(memo)
						.toProperty("memo").map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
						.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default int insertMultiple(Collection<TransportHeader> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, transportHeader,
				c -> c.map(oid).toProperty("oid").map(transportDataType).toProperty("transportDataType").map(aaSenderId)
						.toProperty("aaSenderId").map(aaInterchangeDateTime).toProperty("aaInterchangeDateTime")
						.map(aaBodid).toProperty("aaBodid").map(aaReceiverId).toProperty("aaReceiverId")
						.map(aaMessageDirection).toProperty("aaMessageDirection").map(syncCode).toProperty("syncCode")
						.map(messageType).toProperty("messageType").map(messageTypeCode).toProperty("messageTypeCode")
						.map(messageTypeCodeName).toProperty("messageTypeCodeName").map(documentDateTime)
						.toProperty("documentDateTime").map(dateTimePeriod257).toProperty("dateTimePeriod257")
						.map(partyNameSt).toProperty("partyNameSt").map(placeNameSt).toProperty("placeNameSt")
						.map(partyNameSf).toProperty("partyNameSf").map(placeNameSf).toProperty("placeNameSf").map(memo)
						.toProperty("memo").map(tsRegistererDate).toProperty("tsRegistererDate").map(tsRegistererUserId)
						.toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default int insertSelective(TransportHeader record) {
		return MyBatis3Utils.insert(this::insert, record, transportHeader, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(transportDataType)
				.toPropertyWhenPresent("transportDataType", record::getTransportDataType).map(aaSenderId)
				.toPropertyWhenPresent("aaSenderId", record::getAaSenderId).map(aaInterchangeDateTime)
				.toPropertyWhenPresent("aaInterchangeDateTime", record::getAaInterchangeDateTime).map(aaBodid)
				.toPropertyWhenPresent("aaBodid", record::getAaBodid).map(aaReceiverId)
				.toPropertyWhenPresent("aaReceiverId", record::getAaReceiverId).map(aaMessageDirection)
				.toPropertyWhenPresent("aaMessageDirection", record::getAaMessageDirection).map(syncCode)
				.toPropertyWhenPresent("syncCode", record::getSyncCode).map(messageType)
				.toPropertyWhenPresent("messageType", record::getMessageType).map(messageTypeCode)
				.toPropertyWhenPresent("messageTypeCode", record::getMessageTypeCode).map(messageTypeCodeName)
				.toPropertyWhenPresent("messageTypeCodeName", record::getMessageTypeCodeName).map(documentDateTime)
				.toPropertyWhenPresent("documentDateTime", record::getDocumentDateTime).map(dateTimePeriod257)
				.toPropertyWhenPresent("dateTimePeriod257", record::getDateTimePeriod257).map(partyNameSt)
				.toPropertyWhenPresent("partyNameSt", record::getPartyNameSt).map(placeNameSt)
				.toPropertyWhenPresent("placeNameSt", record::getPlaceNameSt).map(partyNameSf)
				.toPropertyWhenPresent("partyNameSf", record::getPartyNameSf).map(placeNameSf)
				.toPropertyWhenPresent("placeNameSf", record::getPlaceNameSf).map(memo)
				.toPropertyWhenPresent("memo", record::getMemo).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default Optional<TransportHeader> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, transportHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default List<TransportHeader> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, transportHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default List<TransportHeader> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, transportHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default Optional<TransportHeader> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, transportHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	static UpdateDSL<UpdateModel> updateAllColumns(TransportHeader record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(transportDataType).equalTo(record::getTransportDataType)
				.set(aaSenderId).equalTo(record::getAaSenderId).set(aaInterchangeDateTime)
				.equalTo(record::getAaInterchangeDateTime).set(aaBodid).equalTo(record::getAaBodid).set(aaReceiverId)
				.equalTo(record::getAaReceiverId).set(aaMessageDirection).equalTo(record::getAaMessageDirection)
				.set(syncCode).equalTo(record::getSyncCode).set(messageType).equalTo(record::getMessageType)
				.set(messageTypeCode).equalTo(record::getMessageTypeCode).set(messageTypeCodeName)
				.equalTo(record::getMessageTypeCodeName).set(documentDateTime).equalTo(record::getDocumentDateTime)
				.set(dateTimePeriod257).equalTo(record::getDateTimePeriod257).set(partyNameSt)
				.equalTo(record::getPartyNameSt).set(placeNameSt).equalTo(record::getPlaceNameSt).set(partyNameSf)
				.equalTo(record::getPartyNameSf).set(placeNameSf).equalTo(record::getPlaceNameSf).set(memo)
				.equalTo(record::getMemo).set(tsRegistererDate).equalTo(record::getTsRegistererDate)
				.set(tsRegistererUserId).equalTo(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(TransportHeader record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(transportDataType)
				.equalToWhenPresent(record::getTransportDataType).set(aaSenderId)
				.equalToWhenPresent(record::getAaSenderId).set(aaInterchangeDateTime)
				.equalToWhenPresent(record::getAaInterchangeDateTime).set(aaBodid)
				.equalToWhenPresent(record::getAaBodid).set(aaReceiverId).equalToWhenPresent(record::getAaReceiverId)
				.set(aaMessageDirection).equalToWhenPresent(record::getAaMessageDirection).set(syncCode)
				.equalToWhenPresent(record::getSyncCode).set(messageType).equalToWhenPresent(record::getMessageType)
				.set(messageTypeCode).equalToWhenPresent(record::getMessageTypeCode).set(messageTypeCodeName)
				.equalToWhenPresent(record::getMessageTypeCodeName).set(documentDateTime)
				.equalToWhenPresent(record::getDocumentDateTime).set(dateTimePeriod257)
				.equalToWhenPresent(record::getDateTimePeriod257).set(partyNameSt)
				.equalToWhenPresent(record::getPartyNameSt).set(placeNameSt).equalToWhenPresent(record::getPlaceNameSt)
				.set(partyNameSf).equalToWhenPresent(record::getPartyNameSf).set(placeNameSf)
				.equalToWhenPresent(record::getPlaceNameSf).set(memo).equalToWhenPresent(record::getMemo)
				.set(tsRegistererDate).equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default int updateByPrimaryKey(TransportHeader record) {
		return update(c -> c.set(transportDataType).equalTo(record::getTransportDataType).set(aaSenderId)
				.equalTo(record::getAaSenderId).set(aaInterchangeDateTime).equalTo(record::getAaInterchangeDateTime)
				.set(aaBodid).equalTo(record::getAaBodid).set(aaReceiverId).equalTo(record::getAaReceiverId)
				.set(aaMessageDirection).equalTo(record::getAaMessageDirection).set(syncCode)
				.equalTo(record::getSyncCode).set(messageType).equalTo(record::getMessageType).set(messageTypeCode)
				.equalTo(record::getMessageTypeCode).set(messageTypeCodeName).equalTo(record::getMessageTypeCodeName)
				.set(documentDateTime).equalTo(record::getDocumentDateTime).set(dateTimePeriod257)
				.equalTo(record::getDateTimePeriod257).set(partyNameSt).equalTo(record::getPartyNameSt).set(placeNameSt)
				.equalTo(record::getPlaceNameSt).set(partyNameSf).equalTo(record::getPartyNameSf).set(placeNameSf)
				.equalTo(record::getPlaceNameSf).set(memo).equalTo(record::getMemo).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5082774+09:00", comments = "Source Table: public.transport_header")
	default int updateByPrimaryKeySelective(TransportHeader record) {
		return update(c -> c.set(transportDataType).equalToWhenPresent(record::getTransportDataType).set(aaSenderId)
				.equalToWhenPresent(record::getAaSenderId).set(aaInterchangeDateTime)
				.equalToWhenPresent(record::getAaInterchangeDateTime).set(aaBodid)
				.equalToWhenPresent(record::getAaBodid).set(aaReceiverId).equalToWhenPresent(record::getAaReceiverId)
				.set(aaMessageDirection).equalToWhenPresent(record::getAaMessageDirection).set(syncCode)
				.equalToWhenPresent(record::getSyncCode).set(messageType).equalToWhenPresent(record::getMessageType)
				.set(messageTypeCode).equalToWhenPresent(record::getMessageTypeCode).set(messageTypeCodeName)
				.equalToWhenPresent(record::getMessageTypeCodeName).set(documentDateTime)
				.equalToWhenPresent(record::getDocumentDateTime).set(dateTimePeriod257)
				.equalToWhenPresent(record::getDateTimePeriod257).set(partyNameSt)
				.equalToWhenPresent(record::getPartyNameSt).set(placeNameSt).equalToWhenPresent(record::getPlaceNameSt)
				.set(partyNameSf).equalToWhenPresent(record::getPartyNameSf).set(placeNameSf)
				.equalToWhenPresent(record::getPlaceNameSf).set(memo).equalToWhenPresent(record::getMemo)
				.set(tsRegistererDate).equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}