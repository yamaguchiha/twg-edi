package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.TransportOptionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.or.twg.twg_edi.common.entity.TransportOption;
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
public interface TransportOptionMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source Table: public.transport_option")
	BasicColumn[] selectList = BasicColumn.columnList(oid, itemA04Desc, itemA04Note, itemA02, dateTimePeriod2Deljit,
			itemL01, itemIdPd, itemE04, manufacturingDepartmentId, packageTypeDescriptionCode, item67, quantity143,
			itemH02, itemP08, contactName, itemP04L01, itemP04L02, itemP04L03, itemP04L04, itemP04Detail, itemM01Desc,
			itemM01Note, itemP07, itemP05A1Pattern, itemP05A1L01, itemP05A1L02, itemP05A1L03, itemP05A1L04,
			itemP05A1L05, itemP05A1L06, itemP05A1L07, itemP05A1L08, itemP05A1L09, itemP05A1L10, itemP05A1L11,
			itemP05A1L12, itemP05A1L13, itemP05A1L14, itemP05A1L15, itemP05A1L16, itemP05A1L17, itemP05A1L18,
			itemP05A1L19, itemP05A1L20, itemP05A2Pattern, itemP05A2L01, itemP05A2L02, itemP05A2L03, itemP05A2L04,
			itemP05A2L05, itemP05A2L06, itemP05A2L07, itemP05A2L08, itemP05A2L09, itemP05A2L10, itemP05A2L11,
			itemP05A2L12, itemP05A2L13, itemP05A2L14, itemP05A2L15, itemP05A2L16, itemP05A2L17, itemP05A2L18,
			itemP05A2L19, itemP05A2L20, itemP05A3Pattern, itemP05A3L01, itemP05A3L02, itemP05A3L03, itemP05A3L04,
			itemP05A3L05, itemP05A3L06, itemP05A3L07, itemP05A3L08, itemP05A3L09, itemP05A3L10, itemP05A3L11,
			itemP05A3L12, itemP05A3L13, itemP05A3L14, itemP05A3L15, itemP05A3L16, itemP05A3L17, itemP05A3L18,
			itemP05A3L19, itemP05A3L20, itemP05A4, reportStartIndex, tsRegistererDate, tsRegistererUserId,
			tsRegistererUserPlaceId, tsLastModifiedDate, tsLastModifiedUserId, tsLastModifiedUserPlaceId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<TransportOption> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<TransportOption> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("TransportOptionResult")
	Optional<TransportOption> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "TransportOptionResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "item_a04_desc", property = "itemA04Desc", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_a04_note", property = "itemA04Note", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_a02", property = "itemA02", jdbcType = JdbcType.VARCHAR),
			@Result(column = "date_time_period_2_deljit", property = "dateTimePeriod2Deljit", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_l01", property = "itemL01", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_id_pd", property = "itemIdPd", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_e04", property = "itemE04", jdbcType = JdbcType.VARCHAR),
			@Result(column = "manufacturing_department_id", property = "manufacturingDepartmentId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "package_type_description_code", property = "packageTypeDescriptionCode", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_67", property = "item67", jdbcType = JdbcType.VARCHAR),
			@Result(column = "quantity_143", property = "quantity143", jdbcType = JdbcType.BIGINT),
			@Result(column = "item_h02", property = "itemH02", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p08", property = "itemP08", jdbcType = JdbcType.VARCHAR),
			@Result(column = "contact_name", property = "contactName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p04_l01", property = "itemP04L01", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p04_l02", property = "itemP04L02", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p04_l03", property = "itemP04L03", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p04_l04", property = "itemP04L04", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p04_detail", property = "itemP04Detail", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_m01_desc", property = "itemM01Desc", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_m01_note", property = "itemM01Note", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p07", property = "itemP07", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_pattern", property = "itemP05A1Pattern", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l01", property = "itemP05A1L01", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l02", property = "itemP05A1L02", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l03", property = "itemP05A1L03", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l04", property = "itemP05A1L04", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l05", property = "itemP05A1L05", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l06", property = "itemP05A1L06", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l07", property = "itemP05A1L07", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l08", property = "itemP05A1L08", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l09", property = "itemP05A1L09", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l10", property = "itemP05A1L10", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l11", property = "itemP05A1L11", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l12", property = "itemP05A1L12", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l13", property = "itemP05A1L13", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l14", property = "itemP05A1L14", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l15", property = "itemP05A1L15", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l16", property = "itemP05A1L16", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l17", property = "itemP05A1L17", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l18", property = "itemP05A1L18", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l19", property = "itemP05A1L19", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a1_l20", property = "itemP05A1L20", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_pattern", property = "itemP05A2Pattern", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l01", property = "itemP05A2L01", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l02", property = "itemP05A2L02", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l03", property = "itemP05A2L03", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l04", property = "itemP05A2L04", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l05", property = "itemP05A2L05", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l06", property = "itemP05A2L06", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l07", property = "itemP05A2L07", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l08", property = "itemP05A2L08", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l09", property = "itemP05A2L09", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l10", property = "itemP05A2L10", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l11", property = "itemP05A2L11", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l12", property = "itemP05A2L12", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l13", property = "itemP05A2L13", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l14", property = "itemP05A2L14", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l15", property = "itemP05A2L15", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l16", property = "itemP05A2L16", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l17", property = "itemP05A2L17", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l18", property = "itemP05A2L18", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l19", property = "itemP05A2L19", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a2_l20", property = "itemP05A2L20", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_pattern", property = "itemP05A3Pattern", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l01", property = "itemP05A3L01", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l02", property = "itemP05A3L02", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l03", property = "itemP05A3L03", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l04", property = "itemP05A3L04", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l05", property = "itemP05A3L05", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l06", property = "itemP05A3L06", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l07", property = "itemP05A3L07", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l08", property = "itemP05A3L08", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l09", property = "itemP05A3L09", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l10", property = "itemP05A3L10", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l11", property = "itemP05A3L11", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l12", property = "itemP05A3L12", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l13", property = "itemP05A3L13", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l14", property = "itemP05A3L14", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l15", property = "itemP05A3L15", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l16", property = "itemP05A3L16", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l17", property = "itemP05A3L17", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l18", property = "itemP05A3L18", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l19", property = "itemP05A3L19", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a3_l20", property = "itemP05A3L20", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p05_a4", property = "itemP05A4", jdbcType = JdbcType.VARCHAR),
			@Result(column = "report_start_index", property = "reportStartIndex", jdbcType = JdbcType.INTEGER),
			@Result(column = "ts_registerer_date", property = "tsRegistererDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_registerer_user_id", property = "tsRegistererUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_registerer_user_place_id", property = "tsRegistererUserPlaceId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_date", property = "tsLastModifiedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ts_last_modified_user_id", property = "tsLastModifiedUserId", jdbcType = JdbcType.BIGINT),
			@Result(column = "ts_last_modified_user_place_id", property = "tsLastModifiedUserPlaceId", jdbcType = JdbcType.BIGINT) })
	List<TransportOption> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, transportOption, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, transportOption, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	default int insert(TransportOption record) {
		return MyBatis3Utils.insert(this::insert, record, transportOption, c -> c.map(oid).toProperty("oid")
				.map(itemA04Desc).toProperty("itemA04Desc").map(itemA04Note).toProperty("itemA04Note").map(itemA02)
				.toProperty("itemA02").map(dateTimePeriod2Deljit).toProperty("dateTimePeriod2Deljit").map(itemL01)
				.toProperty("itemL01").map(itemIdPd).toProperty("itemIdPd").map(itemE04).toProperty("itemE04")
				.map(manufacturingDepartmentId).toProperty("manufacturingDepartmentId").map(packageTypeDescriptionCode)
				.toProperty("packageTypeDescriptionCode").map(item67).toProperty("item67").map(quantity143)
				.toProperty("quantity143").map(itemH02).toProperty("itemH02").map(itemP08).toProperty("itemP08")
				.map(contactName).toProperty("contactName").map(itemP04L01).toProperty("itemP04L01").map(itemP04L02)
				.toProperty("itemP04L02").map(itemP04L03).toProperty("itemP04L03").map(itemP04L04)
				.toProperty("itemP04L04").map(itemP04Detail).toProperty("itemP04Detail").map(itemM01Desc)
				.toProperty("itemM01Desc").map(itemM01Note).toProperty("itemM01Note").map(itemP07).toProperty("itemP07")
				.map(itemP05A1Pattern).toProperty("itemP05A1Pattern").map(itemP05A1L01).toProperty("itemP05A1L01")
				.map(itemP05A1L02).toProperty("itemP05A1L02").map(itemP05A1L03).toProperty("itemP05A1L03")
				.map(itemP05A1L04).toProperty("itemP05A1L04").map(itemP05A1L05).toProperty("itemP05A1L05")
				.map(itemP05A1L06).toProperty("itemP05A1L06").map(itemP05A1L07).toProperty("itemP05A1L07")
				.map(itemP05A1L08).toProperty("itemP05A1L08").map(itemP05A1L09).toProperty("itemP05A1L09")
				.map(itemP05A1L10).toProperty("itemP05A1L10").map(itemP05A1L11).toProperty("itemP05A1L11")
				.map(itemP05A1L12).toProperty("itemP05A1L12").map(itemP05A1L13).toProperty("itemP05A1L13")
				.map(itemP05A1L14).toProperty("itemP05A1L14").map(itemP05A1L15).toProperty("itemP05A1L15")
				.map(itemP05A1L16).toProperty("itemP05A1L16").map(itemP05A1L17).toProperty("itemP05A1L17")
				.map(itemP05A1L18).toProperty("itemP05A1L18").map(itemP05A1L19).toProperty("itemP05A1L19")
				.map(itemP05A1L20).toProperty("itemP05A1L20").map(itemP05A2Pattern).toProperty("itemP05A2Pattern")
				.map(itemP05A2L01).toProperty("itemP05A2L01").map(itemP05A2L02).toProperty("itemP05A2L02")
				.map(itemP05A2L03).toProperty("itemP05A2L03").map(itemP05A2L04).toProperty("itemP05A2L04")
				.map(itemP05A2L05).toProperty("itemP05A2L05").map(itemP05A2L06).toProperty("itemP05A2L06")
				.map(itemP05A2L07).toProperty("itemP05A2L07").map(itemP05A2L08).toProperty("itemP05A2L08")
				.map(itemP05A2L09).toProperty("itemP05A2L09").map(itemP05A2L10).toProperty("itemP05A2L10")
				.map(itemP05A2L11).toProperty("itemP05A2L11").map(itemP05A2L12).toProperty("itemP05A2L12")
				.map(itemP05A2L13).toProperty("itemP05A2L13").map(itemP05A2L14).toProperty("itemP05A2L14")
				.map(itemP05A2L15).toProperty("itemP05A2L15").map(itemP05A2L16).toProperty("itemP05A2L16")
				.map(itemP05A2L17).toProperty("itemP05A2L17").map(itemP05A2L18).toProperty("itemP05A2L18")
				.map(itemP05A2L19).toProperty("itemP05A2L19").map(itemP05A2L20).toProperty("itemP05A2L20")
				.map(itemP05A3Pattern).toProperty("itemP05A3Pattern").map(itemP05A3L01).toProperty("itemP05A3L01")
				.map(itemP05A3L02).toProperty("itemP05A3L02").map(itemP05A3L03).toProperty("itemP05A3L03")
				.map(itemP05A3L04).toProperty("itemP05A3L04").map(itemP05A3L05).toProperty("itemP05A3L05")
				.map(itemP05A3L06).toProperty("itemP05A3L06").map(itemP05A3L07).toProperty("itemP05A3L07")
				.map(itemP05A3L08).toProperty("itemP05A3L08").map(itemP05A3L09).toProperty("itemP05A3L09")
				.map(itemP05A3L10).toProperty("itemP05A3L10").map(itemP05A3L11).toProperty("itemP05A3L11")
				.map(itemP05A3L12).toProperty("itemP05A3L12").map(itemP05A3L13).toProperty("itemP05A3L13")
				.map(itemP05A3L14).toProperty("itemP05A3L14").map(itemP05A3L15).toProperty("itemP05A3L15")
				.map(itemP05A3L16).toProperty("itemP05A3L16").map(itemP05A3L17).toProperty("itemP05A3L17")
				.map(itemP05A3L18).toProperty("itemP05A3L18").map(itemP05A3L19).toProperty("itemP05A3L19")
				.map(itemP05A3L20).toProperty("itemP05A3L20").map(itemP05A4).toProperty("itemP05A4")
				.map(reportStartIndex).toProperty("reportStartIndex").map(tsRegistererDate)
				.toProperty("tsRegistererDate").map(tsRegistererUserId).toProperty("tsRegistererUserId")
				.map(tsRegistererUserPlaceId).toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate)
				.toProperty("tsLastModifiedDate").map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId")
				.map(tsLastModifiedUserPlaceId).toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	default int insertMultiple(Collection<TransportOption> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, transportOption,
				c -> c.map(oid).toProperty("oid").map(itemA04Desc).toProperty("itemA04Desc").map(itemA04Note)
						.toProperty("itemA04Note").map(itemA02).toProperty("itemA02").map(dateTimePeriod2Deljit)
						.toProperty("dateTimePeriod2Deljit").map(itemL01).toProperty("itemL01").map(itemIdPd)
						.toProperty("itemIdPd").map(itemE04).toProperty("itemE04").map(manufacturingDepartmentId)
						.toProperty("manufacturingDepartmentId").map(packageTypeDescriptionCode)
						.toProperty("packageTypeDescriptionCode").map(item67).toProperty("item67").map(quantity143)
						.toProperty("quantity143").map(itemH02).toProperty("itemH02").map(itemP08).toProperty("itemP08")
						.map(contactName).toProperty("contactName").map(itemP04L01).toProperty("itemP04L01")
						.map(itemP04L02).toProperty("itemP04L02").map(itemP04L03).toProperty("itemP04L03")
						.map(itemP04L04).toProperty("itemP04L04").map(itemP04Detail).toProperty("itemP04Detail")
						.map(itemM01Desc).toProperty("itemM01Desc").map(itemM01Note).toProperty("itemM01Note")
						.map(itemP07).toProperty("itemP07").map(itemP05A1Pattern).toProperty("itemP05A1Pattern")
						.map(itemP05A1L01).toProperty("itemP05A1L01").map(itemP05A1L02).toProperty("itemP05A1L02")
						.map(itemP05A1L03).toProperty("itemP05A1L03").map(itemP05A1L04).toProperty("itemP05A1L04")
						.map(itemP05A1L05).toProperty("itemP05A1L05").map(itemP05A1L06).toProperty("itemP05A1L06")
						.map(itemP05A1L07).toProperty("itemP05A1L07").map(itemP05A1L08).toProperty("itemP05A1L08")
						.map(itemP05A1L09).toProperty("itemP05A1L09").map(itemP05A1L10).toProperty("itemP05A1L10")
						.map(itemP05A1L11).toProperty("itemP05A1L11").map(itemP05A1L12).toProperty("itemP05A1L12")
						.map(itemP05A1L13).toProperty("itemP05A1L13").map(itemP05A1L14).toProperty("itemP05A1L14")
						.map(itemP05A1L15).toProperty("itemP05A1L15").map(itemP05A1L16).toProperty("itemP05A1L16")
						.map(itemP05A1L17).toProperty("itemP05A1L17").map(itemP05A1L18).toProperty("itemP05A1L18")
						.map(itemP05A1L19).toProperty("itemP05A1L19").map(itemP05A1L20).toProperty("itemP05A1L20")
						.map(itemP05A2Pattern).toProperty("itemP05A2Pattern").map(itemP05A2L01)
						.toProperty("itemP05A2L01").map(itemP05A2L02).toProperty("itemP05A2L02").map(itemP05A2L03)
						.toProperty("itemP05A2L03").map(itemP05A2L04).toProperty("itemP05A2L04").map(itemP05A2L05)
						.toProperty("itemP05A2L05").map(itemP05A2L06).toProperty("itemP05A2L06").map(itemP05A2L07)
						.toProperty("itemP05A2L07").map(itemP05A2L08).toProperty("itemP05A2L08").map(itemP05A2L09)
						.toProperty("itemP05A2L09").map(itemP05A2L10).toProperty("itemP05A2L10").map(itemP05A2L11)
						.toProperty("itemP05A2L11").map(itemP05A2L12).toProperty("itemP05A2L12").map(itemP05A2L13)
						.toProperty("itemP05A2L13").map(itemP05A2L14).toProperty("itemP05A2L14").map(itemP05A2L15)
						.toProperty("itemP05A2L15").map(itemP05A2L16).toProperty("itemP05A2L16").map(itemP05A2L17)
						.toProperty("itemP05A2L17").map(itemP05A2L18).toProperty("itemP05A2L18").map(itemP05A2L19)
						.toProperty("itemP05A2L19").map(itemP05A2L20).toProperty("itemP05A2L20").map(itemP05A3Pattern)
						.toProperty("itemP05A3Pattern").map(itemP05A3L01).toProperty("itemP05A3L01").map(itemP05A3L02)
						.toProperty("itemP05A3L02").map(itemP05A3L03).toProperty("itemP05A3L03").map(itemP05A3L04)
						.toProperty("itemP05A3L04").map(itemP05A3L05).toProperty("itemP05A3L05").map(itemP05A3L06)
						.toProperty("itemP05A3L06").map(itemP05A3L07).toProperty("itemP05A3L07").map(itemP05A3L08)
						.toProperty("itemP05A3L08").map(itemP05A3L09).toProperty("itemP05A3L09").map(itemP05A3L10)
						.toProperty("itemP05A3L10").map(itemP05A3L11).toProperty("itemP05A3L11").map(itemP05A3L12)
						.toProperty("itemP05A3L12").map(itemP05A3L13).toProperty("itemP05A3L13").map(itemP05A3L14)
						.toProperty("itemP05A3L14").map(itemP05A3L15).toProperty("itemP05A3L15").map(itemP05A3L16)
						.toProperty("itemP05A3L16").map(itemP05A3L17).toProperty("itemP05A3L17").map(itemP05A3L18)
						.toProperty("itemP05A3L18").map(itemP05A3L19).toProperty("itemP05A3L19").map(itemP05A3L20)
						.toProperty("itemP05A3L20").map(itemP05A4).toProperty("itemP05A4").map(reportStartIndex)
						.toProperty("reportStartIndex").map(tsRegistererDate).toProperty("tsRegistererDate")
						.map(tsRegistererUserId).toProperty("tsRegistererUserId").map(tsRegistererUserPlaceId)
						.toProperty("tsRegistererUserPlaceId").map(tsLastModifiedDate).toProperty("tsLastModifiedDate")
						.map(tsLastModifiedUserId).toProperty("tsLastModifiedUserId").map(tsLastModifiedUserPlaceId)
						.toProperty("tsLastModifiedUserPlaceId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5062932+09:00", comments = "Source Table: public.transport_option")
	default int insertSelective(TransportOption record) {
		return MyBatis3Utils.insert(this::insert, record, transportOption, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(itemA04Desc)
				.toPropertyWhenPresent("itemA04Desc", record::getItemA04Desc).map(itemA04Note)
				.toPropertyWhenPresent("itemA04Note", record::getItemA04Note).map(itemA02)
				.toPropertyWhenPresent("itemA02", record::getItemA02).map(dateTimePeriod2Deljit)
				.toPropertyWhenPresent("dateTimePeriod2Deljit", record::getDateTimePeriod2Deljit).map(itemL01)
				.toPropertyWhenPresent("itemL01", record::getItemL01).map(itemIdPd)
				.toPropertyWhenPresent("itemIdPd", record::getItemIdPd).map(itemE04)
				.toPropertyWhenPresent("itemE04", record::getItemE04).map(manufacturingDepartmentId)
				.toPropertyWhenPresent("manufacturingDepartmentId", record::getManufacturingDepartmentId)
				.map(packageTypeDescriptionCode)
				.toPropertyWhenPresent("packageTypeDescriptionCode", record::getPackageTypeDescriptionCode).map(item67)
				.toPropertyWhenPresent("item67", record::getItem67).map(quantity143)
				.toPropertyWhenPresent("quantity143", record::getQuantity143).map(itemH02)
				.toPropertyWhenPresent("itemH02", record::getItemH02).map(itemP08)
				.toPropertyWhenPresent("itemP08", record::getItemP08).map(contactName)
				.toPropertyWhenPresent("contactName", record::getContactName).map(itemP04L01)
				.toPropertyWhenPresent("itemP04L01", record::getItemP04L01).map(itemP04L02)
				.toPropertyWhenPresent("itemP04L02", record::getItemP04L02).map(itemP04L03)
				.toPropertyWhenPresent("itemP04L03", record::getItemP04L03).map(itemP04L04)
				.toPropertyWhenPresent("itemP04L04", record::getItemP04L04).map(itemP04Detail)
				.toPropertyWhenPresent("itemP04Detail", record::getItemP04Detail).map(itemM01Desc)
				.toPropertyWhenPresent("itemM01Desc", record::getItemM01Desc).map(itemM01Note)
				.toPropertyWhenPresent("itemM01Note", record::getItemM01Note).map(itemP07)
				.toPropertyWhenPresent("itemP07", record::getItemP07).map(itemP05A1Pattern)
				.toPropertyWhenPresent("itemP05A1Pattern", record::getItemP05A1Pattern).map(itemP05A1L01)
				.toPropertyWhenPresent("itemP05A1L01", record::getItemP05A1L01).map(itemP05A1L02)
				.toPropertyWhenPresent("itemP05A1L02", record::getItemP05A1L02).map(itemP05A1L03)
				.toPropertyWhenPresent("itemP05A1L03", record::getItemP05A1L03).map(itemP05A1L04)
				.toPropertyWhenPresent("itemP05A1L04", record::getItemP05A1L04).map(itemP05A1L05)
				.toPropertyWhenPresent("itemP05A1L05", record::getItemP05A1L05).map(itemP05A1L06)
				.toPropertyWhenPresent("itemP05A1L06", record::getItemP05A1L06).map(itemP05A1L07)
				.toPropertyWhenPresent("itemP05A1L07", record::getItemP05A1L07).map(itemP05A1L08)
				.toPropertyWhenPresent("itemP05A1L08", record::getItemP05A1L08).map(itemP05A1L09)
				.toPropertyWhenPresent("itemP05A1L09", record::getItemP05A1L09).map(itemP05A1L10)
				.toPropertyWhenPresent("itemP05A1L10", record::getItemP05A1L10).map(itemP05A1L11)
				.toPropertyWhenPresent("itemP05A1L11", record::getItemP05A1L11).map(itemP05A1L12)
				.toPropertyWhenPresent("itemP05A1L12", record::getItemP05A1L12).map(itemP05A1L13)
				.toPropertyWhenPresent("itemP05A1L13", record::getItemP05A1L13).map(itemP05A1L14)
				.toPropertyWhenPresent("itemP05A1L14", record::getItemP05A1L14).map(itemP05A1L15)
				.toPropertyWhenPresent("itemP05A1L15", record::getItemP05A1L15).map(itemP05A1L16)
				.toPropertyWhenPresent("itemP05A1L16", record::getItemP05A1L16).map(itemP05A1L17)
				.toPropertyWhenPresent("itemP05A1L17", record::getItemP05A1L17).map(itemP05A1L18)
				.toPropertyWhenPresent("itemP05A1L18", record::getItemP05A1L18).map(itemP05A1L19)
				.toPropertyWhenPresent("itemP05A1L19", record::getItemP05A1L19).map(itemP05A1L20)
				.toPropertyWhenPresent("itemP05A1L20", record::getItemP05A1L20).map(itemP05A2Pattern)
				.toPropertyWhenPresent("itemP05A2Pattern", record::getItemP05A2Pattern).map(itemP05A2L01)
				.toPropertyWhenPresent("itemP05A2L01", record::getItemP05A2L01).map(itemP05A2L02)
				.toPropertyWhenPresent("itemP05A2L02", record::getItemP05A2L02).map(itemP05A2L03)
				.toPropertyWhenPresent("itemP05A2L03", record::getItemP05A2L03).map(itemP05A2L04)
				.toPropertyWhenPresent("itemP05A2L04", record::getItemP05A2L04).map(itemP05A2L05)
				.toPropertyWhenPresent("itemP05A2L05", record::getItemP05A2L05).map(itemP05A2L06)
				.toPropertyWhenPresent("itemP05A2L06", record::getItemP05A2L06).map(itemP05A2L07)
				.toPropertyWhenPresent("itemP05A2L07", record::getItemP05A2L07).map(itemP05A2L08)
				.toPropertyWhenPresent("itemP05A2L08", record::getItemP05A2L08).map(itemP05A2L09)
				.toPropertyWhenPresent("itemP05A2L09", record::getItemP05A2L09).map(itemP05A2L10)
				.toPropertyWhenPresent("itemP05A2L10", record::getItemP05A2L10).map(itemP05A2L11)
				.toPropertyWhenPresent("itemP05A2L11", record::getItemP05A2L11).map(itemP05A2L12)
				.toPropertyWhenPresent("itemP05A2L12", record::getItemP05A2L12).map(itemP05A2L13)
				.toPropertyWhenPresent("itemP05A2L13", record::getItemP05A2L13).map(itemP05A2L14)
				.toPropertyWhenPresent("itemP05A2L14", record::getItemP05A2L14).map(itemP05A2L15)
				.toPropertyWhenPresent("itemP05A2L15", record::getItemP05A2L15).map(itemP05A2L16)
				.toPropertyWhenPresent("itemP05A2L16", record::getItemP05A2L16).map(itemP05A2L17)
				.toPropertyWhenPresent("itemP05A2L17", record::getItemP05A2L17).map(itemP05A2L18)
				.toPropertyWhenPresent("itemP05A2L18", record::getItemP05A2L18).map(itemP05A2L19)
				.toPropertyWhenPresent("itemP05A2L19", record::getItemP05A2L19).map(itemP05A2L20)
				.toPropertyWhenPresent("itemP05A2L20", record::getItemP05A2L20).map(itemP05A3Pattern)
				.toPropertyWhenPresent("itemP05A3Pattern", record::getItemP05A3Pattern).map(itemP05A3L01)
				.toPropertyWhenPresent("itemP05A3L01", record::getItemP05A3L01).map(itemP05A3L02)
				.toPropertyWhenPresent("itemP05A3L02", record::getItemP05A3L02).map(itemP05A3L03)
				.toPropertyWhenPresent("itemP05A3L03", record::getItemP05A3L03).map(itemP05A3L04)
				.toPropertyWhenPresent("itemP05A3L04", record::getItemP05A3L04).map(itemP05A3L05)
				.toPropertyWhenPresent("itemP05A3L05", record::getItemP05A3L05).map(itemP05A3L06)
				.toPropertyWhenPresent("itemP05A3L06", record::getItemP05A3L06).map(itemP05A3L07)
				.toPropertyWhenPresent("itemP05A3L07", record::getItemP05A3L07).map(itemP05A3L08)
				.toPropertyWhenPresent("itemP05A3L08", record::getItemP05A3L08).map(itemP05A3L09)
				.toPropertyWhenPresent("itemP05A3L09", record::getItemP05A3L09).map(itemP05A3L10)
				.toPropertyWhenPresent("itemP05A3L10", record::getItemP05A3L10).map(itemP05A3L11)
				.toPropertyWhenPresent("itemP05A3L11", record::getItemP05A3L11).map(itemP05A3L12)
				.toPropertyWhenPresent("itemP05A3L12", record::getItemP05A3L12).map(itemP05A3L13)
				.toPropertyWhenPresent("itemP05A3L13", record::getItemP05A3L13).map(itemP05A3L14)
				.toPropertyWhenPresent("itemP05A3L14", record::getItemP05A3L14).map(itemP05A3L15)
				.toPropertyWhenPresent("itemP05A3L15", record::getItemP05A3L15).map(itemP05A3L16)
				.toPropertyWhenPresent("itemP05A3L16", record::getItemP05A3L16).map(itemP05A3L17)
				.toPropertyWhenPresent("itemP05A3L17", record::getItemP05A3L17).map(itemP05A3L18)
				.toPropertyWhenPresent("itemP05A3L18", record::getItemP05A3L18).map(itemP05A3L19)
				.toPropertyWhenPresent("itemP05A3L19", record::getItemP05A3L19).map(itemP05A3L20)
				.toPropertyWhenPresent("itemP05A3L20", record::getItemP05A3L20).map(itemP05A4)
				.toPropertyWhenPresent("itemP05A4", record::getItemP05A4).map(reportStartIndex)
				.toPropertyWhenPresent("reportStartIndex", record::getReportStartIndex).map(tsRegistererDate)
				.toPropertyWhenPresent("tsRegistererDate", record::getTsRegistererDate).map(tsRegistererUserId)
				.toPropertyWhenPresent("tsRegistererUserId", record::getTsRegistererUserId).map(tsRegistererUserPlaceId)
				.toPropertyWhenPresent("tsRegistererUserPlaceId", record::getTsRegistererUserPlaceId)
				.map(tsLastModifiedDate).toPropertyWhenPresent("tsLastModifiedDate", record::getTsLastModifiedDate)
				.map(tsLastModifiedUserId)
				.toPropertyWhenPresent("tsLastModifiedUserId", record::getTsLastModifiedUserId)
				.map(tsLastModifiedUserPlaceId)
				.toPropertyWhenPresent("tsLastModifiedUserPlaceId", record::getTsLastModifiedUserPlaceId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source Table: public.transport_option")
	default Optional<TransportOption> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, transportOption, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source Table: public.transport_option")
	default List<TransportOption> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, transportOption, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source Table: public.transport_option")
	default List<TransportOption> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, transportOption, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source Table: public.transport_option")
	default Optional<TransportOption> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source Table: public.transport_option")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, transportOption, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source Table: public.transport_option")
	static UpdateDSL<UpdateModel> updateAllColumns(TransportOption record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(itemA04Desc).equalTo(record::getItemA04Desc).set(itemA04Note)
				.equalTo(record::getItemA04Note).set(itemA02).equalTo(record::getItemA02).set(dateTimePeriod2Deljit)
				.equalTo(record::getDateTimePeriod2Deljit).set(itemL01).equalTo(record::getItemL01).set(itemIdPd)
				.equalTo(record::getItemIdPd).set(itemE04).equalTo(record::getItemE04).set(manufacturingDepartmentId)
				.equalTo(record::getManufacturingDepartmentId).set(packageTypeDescriptionCode)
				.equalTo(record::getPackageTypeDescriptionCode).set(item67).equalTo(record::getItem67).set(quantity143)
				.equalTo(record::getQuantity143).set(itemH02).equalTo(record::getItemH02).set(itemP08)
				.equalTo(record::getItemP08).set(contactName).equalTo(record::getContactName).set(itemP04L01)
				.equalTo(record::getItemP04L01).set(itemP04L02).equalTo(record::getItemP04L02).set(itemP04L03)
				.equalTo(record::getItemP04L03).set(itemP04L04).equalTo(record::getItemP04L04).set(itemP04Detail)
				.equalTo(record::getItemP04Detail).set(itemM01Desc).equalTo(record::getItemM01Desc).set(itemM01Note)
				.equalTo(record::getItemM01Note).set(itemP07).equalTo(record::getItemP07).set(itemP05A1Pattern)
				.equalTo(record::getItemP05A1Pattern).set(itemP05A1L01).equalTo(record::getItemP05A1L01)
				.set(itemP05A1L02).equalTo(record::getItemP05A1L02).set(itemP05A1L03).equalTo(record::getItemP05A1L03)
				.set(itemP05A1L04).equalTo(record::getItemP05A1L04).set(itemP05A1L05).equalTo(record::getItemP05A1L05)
				.set(itemP05A1L06).equalTo(record::getItemP05A1L06).set(itemP05A1L07).equalTo(record::getItemP05A1L07)
				.set(itemP05A1L08).equalTo(record::getItemP05A1L08).set(itemP05A1L09).equalTo(record::getItemP05A1L09)
				.set(itemP05A1L10).equalTo(record::getItemP05A1L10).set(itemP05A1L11).equalTo(record::getItemP05A1L11)
				.set(itemP05A1L12).equalTo(record::getItemP05A1L12).set(itemP05A1L13).equalTo(record::getItemP05A1L13)
				.set(itemP05A1L14).equalTo(record::getItemP05A1L14).set(itemP05A1L15).equalTo(record::getItemP05A1L15)
				.set(itemP05A1L16).equalTo(record::getItemP05A1L16).set(itemP05A1L17).equalTo(record::getItemP05A1L17)
				.set(itemP05A1L18).equalTo(record::getItemP05A1L18).set(itemP05A1L19).equalTo(record::getItemP05A1L19)
				.set(itemP05A1L20).equalTo(record::getItemP05A1L20).set(itemP05A2Pattern)
				.equalTo(record::getItemP05A2Pattern).set(itemP05A2L01).equalTo(record::getItemP05A2L01)
				.set(itemP05A2L02).equalTo(record::getItemP05A2L02).set(itemP05A2L03).equalTo(record::getItemP05A2L03)
				.set(itemP05A2L04).equalTo(record::getItemP05A2L04).set(itemP05A2L05).equalTo(record::getItemP05A2L05)
				.set(itemP05A2L06).equalTo(record::getItemP05A2L06).set(itemP05A2L07).equalTo(record::getItemP05A2L07)
				.set(itemP05A2L08).equalTo(record::getItemP05A2L08).set(itemP05A2L09).equalTo(record::getItemP05A2L09)
				.set(itemP05A2L10).equalTo(record::getItemP05A2L10).set(itemP05A2L11).equalTo(record::getItemP05A2L11)
				.set(itemP05A2L12).equalTo(record::getItemP05A2L12).set(itemP05A2L13).equalTo(record::getItemP05A2L13)
				.set(itemP05A2L14).equalTo(record::getItemP05A2L14).set(itemP05A2L15).equalTo(record::getItemP05A2L15)
				.set(itemP05A2L16).equalTo(record::getItemP05A2L16).set(itemP05A2L17).equalTo(record::getItemP05A2L17)
				.set(itemP05A2L18).equalTo(record::getItemP05A2L18).set(itemP05A2L19).equalTo(record::getItemP05A2L19)
				.set(itemP05A2L20).equalTo(record::getItemP05A2L20).set(itemP05A3Pattern)
				.equalTo(record::getItemP05A3Pattern).set(itemP05A3L01).equalTo(record::getItemP05A3L01)
				.set(itemP05A3L02).equalTo(record::getItemP05A3L02).set(itemP05A3L03).equalTo(record::getItemP05A3L03)
				.set(itemP05A3L04).equalTo(record::getItemP05A3L04).set(itemP05A3L05).equalTo(record::getItemP05A3L05)
				.set(itemP05A3L06).equalTo(record::getItemP05A3L06).set(itemP05A3L07).equalTo(record::getItemP05A3L07)
				.set(itemP05A3L08).equalTo(record::getItemP05A3L08).set(itemP05A3L09).equalTo(record::getItemP05A3L09)
				.set(itemP05A3L10).equalTo(record::getItemP05A3L10).set(itemP05A3L11).equalTo(record::getItemP05A3L11)
				.set(itemP05A3L12).equalTo(record::getItemP05A3L12).set(itemP05A3L13).equalTo(record::getItemP05A3L13)
				.set(itemP05A3L14).equalTo(record::getItemP05A3L14).set(itemP05A3L15).equalTo(record::getItemP05A3L15)
				.set(itemP05A3L16).equalTo(record::getItemP05A3L16).set(itemP05A3L17).equalTo(record::getItemP05A3L17)
				.set(itemP05A3L18).equalTo(record::getItemP05A3L18).set(itemP05A3L19).equalTo(record::getItemP05A3L19)
				.set(itemP05A3L20).equalTo(record::getItemP05A3L20).set(itemP05A4).equalTo(record::getItemP05A4)
				.set(reportStartIndex).equalTo(record::getReportStartIndex).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source Table: public.transport_option")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(TransportOption record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(itemA04Desc)
				.equalToWhenPresent(record::getItemA04Desc).set(itemA04Note).equalToWhenPresent(record::getItemA04Note)
				.set(itemA02).equalToWhenPresent(record::getItemA02).set(dateTimePeriod2Deljit)
				.equalToWhenPresent(record::getDateTimePeriod2Deljit).set(itemL01)
				.equalToWhenPresent(record::getItemL01).set(itemIdPd).equalToWhenPresent(record::getItemIdPd)
				.set(itemE04).equalToWhenPresent(record::getItemE04).set(manufacturingDepartmentId)
				.equalToWhenPresent(record::getManufacturingDepartmentId).set(packageTypeDescriptionCode)
				.equalToWhenPresent(record::getPackageTypeDescriptionCode).set(item67)
				.equalToWhenPresent(record::getItem67).set(quantity143).equalToWhenPresent(record::getQuantity143)
				.set(itemH02).equalToWhenPresent(record::getItemH02).set(itemP08).equalToWhenPresent(record::getItemP08)
				.set(contactName).equalToWhenPresent(record::getContactName).set(itemP04L01)
				.equalToWhenPresent(record::getItemP04L01).set(itemP04L02).equalToWhenPresent(record::getItemP04L02)
				.set(itemP04L03).equalToWhenPresent(record::getItemP04L03).set(itemP04L04)
				.equalToWhenPresent(record::getItemP04L04).set(itemP04Detail)
				.equalToWhenPresent(record::getItemP04Detail).set(itemM01Desc)
				.equalToWhenPresent(record::getItemM01Desc).set(itemM01Note).equalToWhenPresent(record::getItemM01Note)
				.set(itemP07).equalToWhenPresent(record::getItemP07).set(itemP05A1Pattern)
				.equalToWhenPresent(record::getItemP05A1Pattern).set(itemP05A1L01)
				.equalToWhenPresent(record::getItemP05A1L01).set(itemP05A1L02)
				.equalToWhenPresent(record::getItemP05A1L02).set(itemP05A1L03)
				.equalToWhenPresent(record::getItemP05A1L03).set(itemP05A1L04)
				.equalToWhenPresent(record::getItemP05A1L04).set(itemP05A1L05)
				.equalToWhenPresent(record::getItemP05A1L05).set(itemP05A1L06)
				.equalToWhenPresent(record::getItemP05A1L06).set(itemP05A1L07)
				.equalToWhenPresent(record::getItemP05A1L07).set(itemP05A1L08)
				.equalToWhenPresent(record::getItemP05A1L08).set(itemP05A1L09)
				.equalToWhenPresent(record::getItemP05A1L09).set(itemP05A1L10)
				.equalToWhenPresent(record::getItemP05A1L10).set(itemP05A1L11)
				.equalToWhenPresent(record::getItemP05A1L11).set(itemP05A1L12)
				.equalToWhenPresent(record::getItemP05A1L12).set(itemP05A1L13)
				.equalToWhenPresent(record::getItemP05A1L13).set(itemP05A1L14)
				.equalToWhenPresent(record::getItemP05A1L14).set(itemP05A1L15)
				.equalToWhenPresent(record::getItemP05A1L15).set(itemP05A1L16)
				.equalToWhenPresent(record::getItemP05A1L16).set(itemP05A1L17)
				.equalToWhenPresent(record::getItemP05A1L17).set(itemP05A1L18)
				.equalToWhenPresent(record::getItemP05A1L18).set(itemP05A1L19)
				.equalToWhenPresent(record::getItemP05A1L19).set(itemP05A1L20)
				.equalToWhenPresent(record::getItemP05A1L20).set(itemP05A2Pattern)
				.equalToWhenPresent(record::getItemP05A2Pattern).set(itemP05A2L01)
				.equalToWhenPresent(record::getItemP05A2L01).set(itemP05A2L02)
				.equalToWhenPresent(record::getItemP05A2L02).set(itemP05A2L03)
				.equalToWhenPresent(record::getItemP05A2L03).set(itemP05A2L04)
				.equalToWhenPresent(record::getItemP05A2L04).set(itemP05A2L05)
				.equalToWhenPresent(record::getItemP05A2L05).set(itemP05A2L06)
				.equalToWhenPresent(record::getItemP05A2L06).set(itemP05A2L07)
				.equalToWhenPresent(record::getItemP05A2L07).set(itemP05A2L08)
				.equalToWhenPresent(record::getItemP05A2L08).set(itemP05A2L09)
				.equalToWhenPresent(record::getItemP05A2L09).set(itemP05A2L10)
				.equalToWhenPresent(record::getItemP05A2L10).set(itemP05A2L11)
				.equalToWhenPresent(record::getItemP05A2L11).set(itemP05A2L12)
				.equalToWhenPresent(record::getItemP05A2L12).set(itemP05A2L13)
				.equalToWhenPresent(record::getItemP05A2L13).set(itemP05A2L14)
				.equalToWhenPresent(record::getItemP05A2L14).set(itemP05A2L15)
				.equalToWhenPresent(record::getItemP05A2L15).set(itemP05A2L16)
				.equalToWhenPresent(record::getItemP05A2L16).set(itemP05A2L17)
				.equalToWhenPresent(record::getItemP05A2L17).set(itemP05A2L18)
				.equalToWhenPresent(record::getItemP05A2L18).set(itemP05A2L19)
				.equalToWhenPresent(record::getItemP05A2L19).set(itemP05A2L20)
				.equalToWhenPresent(record::getItemP05A2L20).set(itemP05A3Pattern)
				.equalToWhenPresent(record::getItemP05A3Pattern).set(itemP05A3L01)
				.equalToWhenPresent(record::getItemP05A3L01).set(itemP05A3L02)
				.equalToWhenPresent(record::getItemP05A3L02).set(itemP05A3L03)
				.equalToWhenPresent(record::getItemP05A3L03).set(itemP05A3L04)
				.equalToWhenPresent(record::getItemP05A3L04).set(itemP05A3L05)
				.equalToWhenPresent(record::getItemP05A3L05).set(itemP05A3L06)
				.equalToWhenPresent(record::getItemP05A3L06).set(itemP05A3L07)
				.equalToWhenPresent(record::getItemP05A3L07).set(itemP05A3L08)
				.equalToWhenPresent(record::getItemP05A3L08).set(itemP05A3L09)
				.equalToWhenPresent(record::getItemP05A3L09).set(itemP05A3L10)
				.equalToWhenPresent(record::getItemP05A3L10).set(itemP05A3L11)
				.equalToWhenPresent(record::getItemP05A3L11).set(itemP05A3L12)
				.equalToWhenPresent(record::getItemP05A3L12).set(itemP05A3L13)
				.equalToWhenPresent(record::getItemP05A3L13).set(itemP05A3L14)
				.equalToWhenPresent(record::getItemP05A3L14).set(itemP05A3L15)
				.equalToWhenPresent(record::getItemP05A3L15).set(itemP05A3L16)
				.equalToWhenPresent(record::getItemP05A3L16).set(itemP05A3L17)
				.equalToWhenPresent(record::getItemP05A3L17).set(itemP05A3L18)
				.equalToWhenPresent(record::getItemP05A3L18).set(itemP05A3L19)
				.equalToWhenPresent(record::getItemP05A3L19).set(itemP05A3L20)
				.equalToWhenPresent(record::getItemP05A3L20).set(itemP05A4).equalToWhenPresent(record::getItemP05A4)
				.set(reportStartIndex).equalToWhenPresent(record::getReportStartIndex).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source Table: public.transport_option")
	default int updateByPrimaryKey(TransportOption record) {
		return update(c -> c.set(itemA04Desc).equalTo(record::getItemA04Desc).set(itemA04Note)
				.equalTo(record::getItemA04Note).set(itemA02).equalTo(record::getItemA02).set(dateTimePeriod2Deljit)
				.equalTo(record::getDateTimePeriod2Deljit).set(itemL01).equalTo(record::getItemL01).set(itemIdPd)
				.equalTo(record::getItemIdPd).set(itemE04).equalTo(record::getItemE04).set(manufacturingDepartmentId)
				.equalTo(record::getManufacturingDepartmentId).set(packageTypeDescriptionCode)
				.equalTo(record::getPackageTypeDescriptionCode).set(item67).equalTo(record::getItem67).set(quantity143)
				.equalTo(record::getQuantity143).set(itemH02).equalTo(record::getItemH02).set(itemP08)
				.equalTo(record::getItemP08).set(contactName).equalTo(record::getContactName).set(itemP04L01)
				.equalTo(record::getItemP04L01).set(itemP04L02).equalTo(record::getItemP04L02).set(itemP04L03)
				.equalTo(record::getItemP04L03).set(itemP04L04).equalTo(record::getItemP04L04).set(itemP04Detail)
				.equalTo(record::getItemP04Detail).set(itemM01Desc).equalTo(record::getItemM01Desc).set(itemM01Note)
				.equalTo(record::getItemM01Note).set(itemP07).equalTo(record::getItemP07).set(itemP05A1Pattern)
				.equalTo(record::getItemP05A1Pattern).set(itemP05A1L01).equalTo(record::getItemP05A1L01)
				.set(itemP05A1L02).equalTo(record::getItemP05A1L02).set(itemP05A1L03).equalTo(record::getItemP05A1L03)
				.set(itemP05A1L04).equalTo(record::getItemP05A1L04).set(itemP05A1L05).equalTo(record::getItemP05A1L05)
				.set(itemP05A1L06).equalTo(record::getItemP05A1L06).set(itemP05A1L07).equalTo(record::getItemP05A1L07)
				.set(itemP05A1L08).equalTo(record::getItemP05A1L08).set(itemP05A1L09).equalTo(record::getItemP05A1L09)
				.set(itemP05A1L10).equalTo(record::getItemP05A1L10).set(itemP05A1L11).equalTo(record::getItemP05A1L11)
				.set(itemP05A1L12).equalTo(record::getItemP05A1L12).set(itemP05A1L13).equalTo(record::getItemP05A1L13)
				.set(itemP05A1L14).equalTo(record::getItemP05A1L14).set(itemP05A1L15).equalTo(record::getItemP05A1L15)
				.set(itemP05A1L16).equalTo(record::getItemP05A1L16).set(itemP05A1L17).equalTo(record::getItemP05A1L17)
				.set(itemP05A1L18).equalTo(record::getItemP05A1L18).set(itemP05A1L19).equalTo(record::getItemP05A1L19)
				.set(itemP05A1L20).equalTo(record::getItemP05A1L20).set(itemP05A2Pattern)
				.equalTo(record::getItemP05A2Pattern).set(itemP05A2L01).equalTo(record::getItemP05A2L01)
				.set(itemP05A2L02).equalTo(record::getItemP05A2L02).set(itemP05A2L03).equalTo(record::getItemP05A2L03)
				.set(itemP05A2L04).equalTo(record::getItemP05A2L04).set(itemP05A2L05).equalTo(record::getItemP05A2L05)
				.set(itemP05A2L06).equalTo(record::getItemP05A2L06).set(itemP05A2L07).equalTo(record::getItemP05A2L07)
				.set(itemP05A2L08).equalTo(record::getItemP05A2L08).set(itemP05A2L09).equalTo(record::getItemP05A2L09)
				.set(itemP05A2L10).equalTo(record::getItemP05A2L10).set(itemP05A2L11).equalTo(record::getItemP05A2L11)
				.set(itemP05A2L12).equalTo(record::getItemP05A2L12).set(itemP05A2L13).equalTo(record::getItemP05A2L13)
				.set(itemP05A2L14).equalTo(record::getItemP05A2L14).set(itemP05A2L15).equalTo(record::getItemP05A2L15)
				.set(itemP05A2L16).equalTo(record::getItemP05A2L16).set(itemP05A2L17).equalTo(record::getItemP05A2L17)
				.set(itemP05A2L18).equalTo(record::getItemP05A2L18).set(itemP05A2L19).equalTo(record::getItemP05A2L19)
				.set(itemP05A2L20).equalTo(record::getItemP05A2L20).set(itemP05A3Pattern)
				.equalTo(record::getItemP05A3Pattern).set(itemP05A3L01).equalTo(record::getItemP05A3L01)
				.set(itemP05A3L02).equalTo(record::getItemP05A3L02).set(itemP05A3L03).equalTo(record::getItemP05A3L03)
				.set(itemP05A3L04).equalTo(record::getItemP05A3L04).set(itemP05A3L05).equalTo(record::getItemP05A3L05)
				.set(itemP05A3L06).equalTo(record::getItemP05A3L06).set(itemP05A3L07).equalTo(record::getItemP05A3L07)
				.set(itemP05A3L08).equalTo(record::getItemP05A3L08).set(itemP05A3L09).equalTo(record::getItemP05A3L09)
				.set(itemP05A3L10).equalTo(record::getItemP05A3L10).set(itemP05A3L11).equalTo(record::getItemP05A3L11)
				.set(itemP05A3L12).equalTo(record::getItemP05A3L12).set(itemP05A3L13).equalTo(record::getItemP05A3L13)
				.set(itemP05A3L14).equalTo(record::getItemP05A3L14).set(itemP05A3L15).equalTo(record::getItemP05A3L15)
				.set(itemP05A3L16).equalTo(record::getItemP05A3L16).set(itemP05A3L17).equalTo(record::getItemP05A3L17)
				.set(itemP05A3L18).equalTo(record::getItemP05A3L18).set(itemP05A3L19).equalTo(record::getItemP05A3L19)
				.set(itemP05A3L20).equalTo(record::getItemP05A3L20).set(itemP05A4).equalTo(record::getItemP05A4)
				.set(reportStartIndex).equalTo(record::getReportStartIndex).set(tsRegistererDate)
				.equalTo(record::getTsRegistererDate).set(tsRegistererUserId).equalTo(record::getTsRegistererUserId)
				.set(tsRegistererUserPlaceId).equalTo(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalTo(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalTo(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalTo(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5072805+09:00", comments = "Source Table: public.transport_option")
	default int updateByPrimaryKeySelective(TransportOption record) {
		return update(c -> c.set(itemA04Desc).equalToWhenPresent(record::getItemA04Desc).set(itemA04Note)
				.equalToWhenPresent(record::getItemA04Note).set(itemA02).equalToWhenPresent(record::getItemA02)
				.set(dateTimePeriod2Deljit).equalToWhenPresent(record::getDateTimePeriod2Deljit).set(itemL01)
				.equalToWhenPresent(record::getItemL01).set(itemIdPd).equalToWhenPresent(record::getItemIdPd)
				.set(itemE04).equalToWhenPresent(record::getItemE04).set(manufacturingDepartmentId)
				.equalToWhenPresent(record::getManufacturingDepartmentId).set(packageTypeDescriptionCode)
				.equalToWhenPresent(record::getPackageTypeDescriptionCode).set(item67)
				.equalToWhenPresent(record::getItem67).set(quantity143).equalToWhenPresent(record::getQuantity143)
				.set(itemH02).equalToWhenPresent(record::getItemH02).set(itemP08).equalToWhenPresent(record::getItemP08)
				.set(contactName).equalToWhenPresent(record::getContactName).set(itemP04L01)
				.equalToWhenPresent(record::getItemP04L01).set(itemP04L02).equalToWhenPresent(record::getItemP04L02)
				.set(itemP04L03).equalToWhenPresent(record::getItemP04L03).set(itemP04L04)
				.equalToWhenPresent(record::getItemP04L04).set(itemP04Detail)
				.equalToWhenPresent(record::getItemP04Detail).set(itemM01Desc)
				.equalToWhenPresent(record::getItemM01Desc).set(itemM01Note).equalToWhenPresent(record::getItemM01Note)
				.set(itemP07).equalToWhenPresent(record::getItemP07).set(itemP05A1Pattern)
				.equalToWhenPresent(record::getItemP05A1Pattern).set(itemP05A1L01)
				.equalToWhenPresent(record::getItemP05A1L01).set(itemP05A1L02)
				.equalToWhenPresent(record::getItemP05A1L02).set(itemP05A1L03)
				.equalToWhenPresent(record::getItemP05A1L03).set(itemP05A1L04)
				.equalToWhenPresent(record::getItemP05A1L04).set(itemP05A1L05)
				.equalToWhenPresent(record::getItemP05A1L05).set(itemP05A1L06)
				.equalToWhenPresent(record::getItemP05A1L06).set(itemP05A1L07)
				.equalToWhenPresent(record::getItemP05A1L07).set(itemP05A1L08)
				.equalToWhenPresent(record::getItemP05A1L08).set(itemP05A1L09)
				.equalToWhenPresent(record::getItemP05A1L09).set(itemP05A1L10)
				.equalToWhenPresent(record::getItemP05A1L10).set(itemP05A1L11)
				.equalToWhenPresent(record::getItemP05A1L11).set(itemP05A1L12)
				.equalToWhenPresent(record::getItemP05A1L12).set(itemP05A1L13)
				.equalToWhenPresent(record::getItemP05A1L13).set(itemP05A1L14)
				.equalToWhenPresent(record::getItemP05A1L14).set(itemP05A1L15)
				.equalToWhenPresent(record::getItemP05A1L15).set(itemP05A1L16)
				.equalToWhenPresent(record::getItemP05A1L16).set(itemP05A1L17)
				.equalToWhenPresent(record::getItemP05A1L17).set(itemP05A1L18)
				.equalToWhenPresent(record::getItemP05A1L18).set(itemP05A1L19)
				.equalToWhenPresent(record::getItemP05A1L19).set(itemP05A1L20)
				.equalToWhenPresent(record::getItemP05A1L20).set(itemP05A2Pattern)
				.equalToWhenPresent(record::getItemP05A2Pattern).set(itemP05A2L01)
				.equalToWhenPresent(record::getItemP05A2L01).set(itemP05A2L02)
				.equalToWhenPresent(record::getItemP05A2L02).set(itemP05A2L03)
				.equalToWhenPresent(record::getItemP05A2L03).set(itemP05A2L04)
				.equalToWhenPresent(record::getItemP05A2L04).set(itemP05A2L05)
				.equalToWhenPresent(record::getItemP05A2L05).set(itemP05A2L06)
				.equalToWhenPresent(record::getItemP05A2L06).set(itemP05A2L07)
				.equalToWhenPresent(record::getItemP05A2L07).set(itemP05A2L08)
				.equalToWhenPresent(record::getItemP05A2L08).set(itemP05A2L09)
				.equalToWhenPresent(record::getItemP05A2L09).set(itemP05A2L10)
				.equalToWhenPresent(record::getItemP05A2L10).set(itemP05A2L11)
				.equalToWhenPresent(record::getItemP05A2L11).set(itemP05A2L12)
				.equalToWhenPresent(record::getItemP05A2L12).set(itemP05A2L13)
				.equalToWhenPresent(record::getItemP05A2L13).set(itemP05A2L14)
				.equalToWhenPresent(record::getItemP05A2L14).set(itemP05A2L15)
				.equalToWhenPresent(record::getItemP05A2L15).set(itemP05A2L16)
				.equalToWhenPresent(record::getItemP05A2L16).set(itemP05A2L17)
				.equalToWhenPresent(record::getItemP05A2L17).set(itemP05A2L18)
				.equalToWhenPresent(record::getItemP05A2L18).set(itemP05A2L19)
				.equalToWhenPresent(record::getItemP05A2L19).set(itemP05A2L20)
				.equalToWhenPresent(record::getItemP05A2L20).set(itemP05A3Pattern)
				.equalToWhenPresent(record::getItemP05A3Pattern).set(itemP05A3L01)
				.equalToWhenPresent(record::getItemP05A3L01).set(itemP05A3L02)
				.equalToWhenPresent(record::getItemP05A3L02).set(itemP05A3L03)
				.equalToWhenPresent(record::getItemP05A3L03).set(itemP05A3L04)
				.equalToWhenPresent(record::getItemP05A3L04).set(itemP05A3L05)
				.equalToWhenPresent(record::getItemP05A3L05).set(itemP05A3L06)
				.equalToWhenPresent(record::getItemP05A3L06).set(itemP05A3L07)
				.equalToWhenPresent(record::getItemP05A3L07).set(itemP05A3L08)
				.equalToWhenPresent(record::getItemP05A3L08).set(itemP05A3L09)
				.equalToWhenPresent(record::getItemP05A3L09).set(itemP05A3L10)
				.equalToWhenPresent(record::getItemP05A3L10).set(itemP05A3L11)
				.equalToWhenPresent(record::getItemP05A3L11).set(itemP05A3L12)
				.equalToWhenPresent(record::getItemP05A3L12).set(itemP05A3L13)
				.equalToWhenPresent(record::getItemP05A3L13).set(itemP05A3L14)
				.equalToWhenPresent(record::getItemP05A3L14).set(itemP05A3L15)
				.equalToWhenPresent(record::getItemP05A3L15).set(itemP05A3L16)
				.equalToWhenPresent(record::getItemP05A3L16).set(itemP05A3L17)
				.equalToWhenPresent(record::getItemP05A3L17).set(itemP05A3L18)
				.equalToWhenPresent(record::getItemP05A3L18).set(itemP05A3L19)
				.equalToWhenPresent(record::getItemP05A3L19).set(itemP05A3L20)
				.equalToWhenPresent(record::getItemP05A3L20).set(itemP05A4).equalToWhenPresent(record::getItemP05A4)
				.set(reportStartIndex).equalToWhenPresent(record::getReportStartIndex).set(tsRegistererDate)
				.equalToWhenPresent(record::getTsRegistererDate).set(tsRegistererUserId)
				.equalToWhenPresent(record::getTsRegistererUserId).set(tsRegistererUserPlaceId)
				.equalToWhenPresent(record::getTsRegistererUserPlaceId).set(tsLastModifiedDate)
				.equalToWhenPresent(record::getTsLastModifiedDate).set(tsLastModifiedUserId)
				.equalToWhenPresent(record::getTsLastModifiedUserId).set(tsLastModifiedUserPlaceId)
				.equalToWhenPresent(record::getTsLastModifiedUserPlaceId).where(oid, isEqualTo(record::getOid)));
	}
}