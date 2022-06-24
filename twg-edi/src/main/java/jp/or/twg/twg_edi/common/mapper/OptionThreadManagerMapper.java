package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.OptionThreadManagerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.OptionThreadManager;
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
public interface OptionThreadManagerMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	BasicColumn[] selectList = BasicColumn.columnList(id, threadStatus, threadCategory, usersOid, userPlaceOid,
			placeOfDischargeId, startUpTime, closeOutTime, partyOid, placeOid, dataNumber, dataSize, dataSize2,
			errorMessage, memo, memo2);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<OptionThreadManager> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<OptionThreadManager> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("OptionThreadManagerResult")
	Optional<OptionThreadManager> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "OptionThreadManagerResult", value = {
			@Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "thread_status", property = "threadStatus", jdbcType = JdbcType.VARCHAR),
			@Result(column = "thread_category", property = "threadCategory", jdbcType = JdbcType.VARCHAR),
			@Result(column = "users_oid", property = "usersOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "user_place_oid", property = "userPlaceOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_of_discharge_id", property = "placeOfDischargeId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "start_up_time", property = "startUpTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "close_out_time", property = "closeOutTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "party_oid", property = "partyOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_oid", property = "placeOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "data_number", property = "dataNumber", jdbcType = JdbcType.INTEGER),
			@Result(column = "data_size", property = "dataSize", jdbcType = JdbcType.INTEGER),
			@Result(column = "data_size2", property = "dataSize2", jdbcType = JdbcType.INTEGER),
			@Result(column = "error_message", property = "errorMessage", jdbcType = JdbcType.VARCHAR),
			@Result(column = "memo", property = "memo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "memo2", property = "memo2", jdbcType = JdbcType.VARCHAR) })
	List<OptionThreadManager> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, optionThreadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, optionThreadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	default int deleteByPrimaryKey(String id_) {
		return delete(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5272266+09:00", comments = "Source Table: public.option_thread_manager")
	default int insert(OptionThreadManager record) {
		return MyBatis3Utils.insert(this::insert, record, optionThreadManager,
				c -> c.map(id).toProperty("id").map(threadStatus).toProperty("threadStatus").map(threadCategory)
						.toProperty("threadCategory").map(usersOid).toProperty("usersOid").map(userPlaceOid)
						.toProperty("userPlaceOid").map(placeOfDischargeId).toProperty("placeOfDischargeId")
						.map(startUpTime).toProperty("startUpTime").map(closeOutTime).toProperty("closeOutTime")
						.map(partyOid).toProperty("partyOid").map(placeOid).toProperty("placeOid").map(dataNumber)
						.toProperty("dataNumber").map(dataSize).toProperty("dataSize").map(dataSize2)
						.toProperty("dataSize2").map(errorMessage).toProperty("errorMessage").map(memo)
						.toProperty("memo").map(memo2).toProperty("memo2"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	default int insertMultiple(Collection<OptionThreadManager> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optionThreadManager,
				c -> c.map(id).toProperty("id").map(threadStatus).toProperty("threadStatus").map(threadCategory)
						.toProperty("threadCategory").map(usersOid).toProperty("usersOid").map(userPlaceOid)
						.toProperty("userPlaceOid").map(placeOfDischargeId).toProperty("placeOfDischargeId")
						.map(startUpTime).toProperty("startUpTime").map(closeOutTime).toProperty("closeOutTime")
						.map(partyOid).toProperty("partyOid").map(placeOid).toProperty("placeOid").map(dataNumber)
						.toProperty("dataNumber").map(dataSize).toProperty("dataSize").map(dataSize2)
						.toProperty("dataSize2").map(errorMessage).toProperty("errorMessage").map(memo)
						.toProperty("memo").map(memo2).toProperty("memo2"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	default int insertSelective(OptionThreadManager record) {
		return MyBatis3Utils.insert(this::insert, record, optionThreadManager,
				c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(threadStatus)
						.toPropertyWhenPresent("threadStatus", record::getThreadStatus).map(threadCategory)
						.toPropertyWhenPresent("threadCategory", record::getThreadCategory).map(usersOid)
						.toPropertyWhenPresent("usersOid", record::getUsersOid).map(userPlaceOid)
						.toPropertyWhenPresent("userPlaceOid", record::getUserPlaceOid).map(placeOfDischargeId)
						.toPropertyWhenPresent("placeOfDischargeId", record::getPlaceOfDischargeId).map(startUpTime)
						.toPropertyWhenPresent("startUpTime", record::getStartUpTime).map(closeOutTime)
						.toPropertyWhenPresent("closeOutTime", record::getCloseOutTime).map(partyOid)
						.toPropertyWhenPresent("partyOid", record::getPartyOid).map(placeOid)
						.toPropertyWhenPresent("placeOid", record::getPlaceOid).map(dataNumber)
						.toPropertyWhenPresent("dataNumber", record::getDataNumber).map(dataSize)
						.toPropertyWhenPresent("dataSize", record::getDataSize).map(dataSize2)
						.toPropertyWhenPresent("dataSize2", record::getDataSize2).map(errorMessage)
						.toPropertyWhenPresent("errorMessage", record::getErrorMessage).map(memo)
						.toPropertyWhenPresent("memo", record::getMemo).map(memo2)
						.toPropertyWhenPresent("memo2", record::getMemo2));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	default Optional<OptionThreadManager> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, optionThreadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	default List<OptionThreadManager> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, optionThreadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	default List<OptionThreadManager> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optionThreadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	default Optional<OptionThreadManager> selectByPrimaryKey(String id_) {
		return selectOne(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, optionThreadManager, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	static UpdateDSL<UpdateModel> updateAllColumns(OptionThreadManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalTo(record::getId).set(threadStatus).equalTo(record::getThreadStatus).set(threadCategory)
				.equalTo(record::getThreadCategory).set(usersOid).equalTo(record::getUsersOid).set(userPlaceOid)
				.equalTo(record::getUserPlaceOid).set(placeOfDischargeId).equalTo(record::getPlaceOfDischargeId)
				.set(startUpTime).equalTo(record::getStartUpTime).set(closeOutTime).equalTo(record::getCloseOutTime)
				.set(partyOid).equalTo(record::getPartyOid).set(placeOid).equalTo(record::getPlaceOid).set(dataNumber)
				.equalTo(record::getDataNumber).set(dataSize).equalTo(record::getDataSize).set(dataSize2)
				.equalTo(record::getDataSize2).set(errorMessage).equalTo(record::getErrorMessage).set(memo)
				.equalTo(record::getMemo).set(memo2).equalTo(record::getMemo2);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(OptionThreadManager record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalToWhenPresent(record::getId).set(threadStatus)
				.equalToWhenPresent(record::getThreadStatus).set(threadCategory)
				.equalToWhenPresent(record::getThreadCategory).set(usersOid).equalToWhenPresent(record::getUsersOid)
				.set(userPlaceOid).equalToWhenPresent(record::getUserPlaceOid).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(startUpTime)
				.equalToWhenPresent(record::getStartUpTime).set(closeOutTime)
				.equalToWhenPresent(record::getCloseOutTime).set(partyOid).equalToWhenPresent(record::getPartyOid)
				.set(placeOid).equalToWhenPresent(record::getPlaceOid).set(dataNumber)
				.equalToWhenPresent(record::getDataNumber).set(dataSize).equalToWhenPresent(record::getDataSize)
				.set(dataSize2).equalToWhenPresent(record::getDataSize2).set(errorMessage)
				.equalToWhenPresent(record::getErrorMessage).set(memo).equalToWhenPresent(record::getMemo).set(memo2)
				.equalToWhenPresent(record::getMemo2);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	default int updateByPrimaryKey(OptionThreadManager record) {
		return update(c -> c.set(threadStatus).equalTo(record::getThreadStatus).set(threadCategory)
				.equalTo(record::getThreadCategory).set(usersOid).equalTo(record::getUsersOid).set(userPlaceOid)
				.equalTo(record::getUserPlaceOid).set(placeOfDischargeId).equalTo(record::getPlaceOfDischargeId)
				.set(startUpTime).equalTo(record::getStartUpTime).set(closeOutTime).equalTo(record::getCloseOutTime)
				.set(partyOid).equalTo(record::getPartyOid).set(placeOid).equalTo(record::getPlaceOid).set(dataNumber)
				.equalTo(record::getDataNumber).set(dataSize).equalTo(record::getDataSize).set(dataSize2)
				.equalTo(record::getDataSize2).set(errorMessage).equalTo(record::getErrorMessage).set(memo)
				.equalTo(record::getMemo).set(memo2).equalTo(record::getMemo2).where(id, isEqualTo(record::getId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5282238+09:00", comments = "Source Table: public.option_thread_manager")
	default int updateByPrimaryKeySelective(OptionThreadManager record) {
		return update(c -> c.set(threadStatus).equalToWhenPresent(record::getThreadStatus).set(threadCategory)
				.equalToWhenPresent(record::getThreadCategory).set(usersOid).equalToWhenPresent(record::getUsersOid)
				.set(userPlaceOid).equalToWhenPresent(record::getUserPlaceOid).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(startUpTime)
				.equalToWhenPresent(record::getStartUpTime).set(closeOutTime)
				.equalToWhenPresent(record::getCloseOutTime).set(partyOid).equalToWhenPresent(record::getPartyOid)
				.set(placeOid).equalToWhenPresent(record::getPlaceOid).set(dataNumber)
				.equalToWhenPresent(record::getDataNumber).set(dataSize).equalToWhenPresent(record::getDataSize)
				.set(dataSize2).equalToWhenPresent(record::getDataSize2).set(errorMessage)
				.equalToWhenPresent(record::getErrorMessage).set(memo).equalToWhenPresent(record::getMemo).set(memo2)
				.equalToWhenPresent(record::getMemo2).where(id, isEqualTo(record::getId)));
	}
}