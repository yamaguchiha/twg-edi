package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.KnbReadDataHeaderDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.KnbReadDataHeader;
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
public interface KnbReadDataHeaderMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	BasicColumn[] selectList = BasicColumn.columnList(oid, kanbanReadDataType, aaSenderId, aaInterchangeDateTime,
			aaBodid, aaReceiverId, aaMessageId, aaMessageDirection, ediMessageSent, ediMessageAckReceived,
			documentDateTime);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<KnbReadDataHeader> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<KnbReadDataHeader> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("KnbReadDataHeaderResult")
	Optional<KnbReadDataHeader> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "KnbReadDataHeaderResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "kanban_read_data_type", property = "kanbanReadDataType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_sender_id", property = "aaSenderId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_interchange_date_time", property = "aaInterchangeDateTime", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_bodid", property = "aaBodid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_receiver_id", property = "aaReceiverId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_message_id", property = "aaMessageId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "aa_message_direction", property = "aaMessageDirection", jdbcType = JdbcType.VARCHAR),
			@Result(column = "edi_message_sent", property = "ediMessageSent", jdbcType = JdbcType.CHAR),
			@Result(column = "edi_message_ack_received", property = "ediMessageAckReceived", jdbcType = JdbcType.CHAR),
			@Result(column = "document_date_time", property = "documentDateTime", jdbcType = JdbcType.VARCHAR) })
	List<KnbReadDataHeader> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, knbReadDataHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, knbReadDataHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5162574+09:00", comments = "Source Table: public.knb_read_data_header")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	default int insert(KnbReadDataHeader record) {
		return MyBatis3Utils.insert(this::insert, record, knbReadDataHeader,
				c -> c.map(oid).toProperty("oid").map(kanbanReadDataType).toProperty("kanbanReadDataType")
						.map(aaSenderId).toProperty("aaSenderId").map(aaInterchangeDateTime)
						.toProperty("aaInterchangeDateTime").map(aaBodid).toProperty("aaBodid").map(aaReceiverId)
						.toProperty("aaReceiverId").map(aaMessageId).toProperty("aaMessageId").map(aaMessageDirection)
						.toProperty("aaMessageDirection").map(ediMessageSent).toProperty("ediMessageSent")
						.map(ediMessageAckReceived).toProperty("ediMessageAckReceived").map(documentDateTime)
						.toProperty("documentDateTime"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	default int insertMultiple(Collection<KnbReadDataHeader> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, knbReadDataHeader,
				c -> c.map(oid).toProperty("oid").map(kanbanReadDataType).toProperty("kanbanReadDataType")
						.map(aaSenderId).toProperty("aaSenderId").map(aaInterchangeDateTime)
						.toProperty("aaInterchangeDateTime").map(aaBodid).toProperty("aaBodid").map(aaReceiverId)
						.toProperty("aaReceiverId").map(aaMessageId).toProperty("aaMessageId").map(aaMessageDirection)
						.toProperty("aaMessageDirection").map(ediMessageSent).toProperty("ediMessageSent")
						.map(ediMessageAckReceived).toProperty("ediMessageAckReceived").map(documentDateTime)
						.toProperty("documentDateTime"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	default int insertSelective(KnbReadDataHeader record) {
		return MyBatis3Utils.insert(this::insert, record, knbReadDataHeader,
				c -> c.map(oid).toPropertyWhenPresent("oid", record::getOid).map(kanbanReadDataType)
						.toPropertyWhenPresent("kanbanReadDataType", record::getKanbanReadDataType).map(aaSenderId)
						.toPropertyWhenPresent("aaSenderId", record::getAaSenderId).map(aaInterchangeDateTime)
						.toPropertyWhenPresent("aaInterchangeDateTime", record::getAaInterchangeDateTime).map(aaBodid)
						.toPropertyWhenPresent("aaBodid", record::getAaBodid).map(aaReceiverId)
						.toPropertyWhenPresent("aaReceiverId", record::getAaReceiverId).map(aaMessageId)
						.toPropertyWhenPresent("aaMessageId", record::getAaMessageId).map(aaMessageDirection)
						.toPropertyWhenPresent("aaMessageDirection", record::getAaMessageDirection).map(ediMessageSent)
						.toPropertyWhenPresent("ediMessageSent", record::getEdiMessageSent).map(ediMessageAckReceived)
						.toPropertyWhenPresent("ediMessageAckReceived", record::getEdiMessageAckReceived)
						.map(documentDateTime).toPropertyWhenPresent("documentDateTime", record::getDocumentDateTime));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	default Optional<KnbReadDataHeader> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, knbReadDataHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	default List<KnbReadDataHeader> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, knbReadDataHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	default List<KnbReadDataHeader> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, knbReadDataHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	default Optional<KnbReadDataHeader> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, knbReadDataHeader, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	static UpdateDSL<UpdateModel> updateAllColumns(KnbReadDataHeader record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(kanbanReadDataType).equalTo(record::getKanbanReadDataType)
				.set(aaSenderId).equalTo(record::getAaSenderId).set(aaInterchangeDateTime)
				.equalTo(record::getAaInterchangeDateTime).set(aaBodid).equalTo(record::getAaBodid).set(aaReceiverId)
				.equalTo(record::getAaReceiverId).set(aaMessageId).equalTo(record::getAaMessageId)
				.set(aaMessageDirection).equalTo(record::getAaMessageDirection).set(ediMessageSent)
				.equalTo(record::getEdiMessageSent).set(ediMessageAckReceived).equalTo(record::getEdiMessageAckReceived)
				.set(documentDateTime).equalTo(record::getDocumentDateTime);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(KnbReadDataHeader record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(kanbanReadDataType)
				.equalToWhenPresent(record::getKanbanReadDataType).set(aaSenderId)
				.equalToWhenPresent(record::getAaSenderId).set(aaInterchangeDateTime)
				.equalToWhenPresent(record::getAaInterchangeDateTime).set(aaBodid)
				.equalToWhenPresent(record::getAaBodid).set(aaReceiverId).equalToWhenPresent(record::getAaReceiverId)
				.set(aaMessageId).equalToWhenPresent(record::getAaMessageId).set(aaMessageDirection)
				.equalToWhenPresent(record::getAaMessageDirection).set(ediMessageSent)
				.equalToWhenPresent(record::getEdiMessageSent).set(ediMessageAckReceived)
				.equalToWhenPresent(record::getEdiMessageAckReceived).set(documentDateTime)
				.equalToWhenPresent(record::getDocumentDateTime);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	default int updateByPrimaryKey(KnbReadDataHeader record) {
		return update(c -> c.set(kanbanReadDataType).equalTo(record::getKanbanReadDataType).set(aaSenderId)
				.equalTo(record::getAaSenderId).set(aaInterchangeDateTime).equalTo(record::getAaInterchangeDateTime)
				.set(aaBodid).equalTo(record::getAaBodid).set(aaReceiverId).equalTo(record::getAaReceiverId)
				.set(aaMessageId).equalTo(record::getAaMessageId).set(aaMessageDirection)
				.equalTo(record::getAaMessageDirection).set(ediMessageSent).equalTo(record::getEdiMessageSent)
				.set(ediMessageAckReceived).equalTo(record::getEdiMessageAckReceived).set(documentDateTime)
				.equalTo(record::getDocumentDateTime).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5172545+09:00", comments = "Source Table: public.knb_read_data_header")
	default int updateByPrimaryKeySelective(KnbReadDataHeader record) {
		return update(c -> c.set(kanbanReadDataType).equalToWhenPresent(record::getKanbanReadDataType).set(aaSenderId)
				.equalToWhenPresent(record::getAaSenderId).set(aaInterchangeDateTime)
				.equalToWhenPresent(record::getAaInterchangeDateTime).set(aaBodid)
				.equalToWhenPresent(record::getAaBodid).set(aaReceiverId).equalToWhenPresent(record::getAaReceiverId)
				.set(aaMessageId).equalToWhenPresent(record::getAaMessageId).set(aaMessageDirection)
				.equalToWhenPresent(record::getAaMessageDirection).set(ediMessageSent)
				.equalToWhenPresent(record::getEdiMessageSent).set(ediMessageAckReceived)
				.equalToWhenPresent(record::getEdiMessageAckReceived).set(documentDateTime)
				.equalToWhenPresent(record::getDocumentDateTime).where(oid, isEqualTo(record::getOid)));
	}
}