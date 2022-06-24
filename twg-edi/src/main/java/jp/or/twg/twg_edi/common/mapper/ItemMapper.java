package jp.or.twg.twg_edi.common.mapper;

import static jp.or.twg.twg_edi.common.mapper.ItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.annotation.Generated;

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

import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.common.model.SelectItemCondition;

@Mapper
public interface ItemMapper {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	BasicColumn[] selectList = BasicColumn.columnList(oid, changed, related, relatedDate, itemIdIn, itemIdPd, item8,
			itemE18, identicalItemId, validStartStringDate, validEndStringDate, placeByOid, placeSeOid, placeObOid,
			placeSfOid, placeStOid, placeOfLoadingId, placeOfLoadingName, placeOfDischargeId, itemE04,
			perPackageQuantity, manufacturingDepartmentId, packageTypeDescriptionCode, quantityUnitCode, buyable,
			supplyType, itemType, throughType, materialsType, separateSupplyType, itemM03, itemIdCl, itemM01Desc,
			itemP04Detail, itemP05A1L01, itemP05A1L02, itemP05A1L03, itemP05A1L04, itemP05A1L05, itemP05A1L06,
			itemP05A1L07, itemP05A1L08, itemP05A1L09, itemP05A1L10, itemP05A1L11, itemP05A1L12, itemP05A1L13,
			itemP05A1L14, itemP05A1L15, itemP05A1L16, itemP05A1L17, itemP05A1L18, itemP05A1L19, itemP05A1L20,
			itemP05A2L01, itemP05A2L02, itemP05A2L03, itemP05A2L04, itemP05A2L05, itemP05A2L06, itemP05A2L07,
			itemP05A2L08, itemP05A2L09, itemP05A2L10, itemP05A2L11, itemP05A2L12, itemP05A2L13, itemP05A2L14,
			itemP05A2L15, itemP05A2L16, itemP05A2L17, itemP05A2L18, itemP05A2L19, itemP05A2L20, itemP05A3L01,
			itemP05A3L02, itemP05A3L03, itemP05A3L04, itemP05A3L05, itemP05A3L06, itemP05A3L07, itemP05A3L08,
			itemP05A3L09, itemP05A3L10, itemP05A3L11, itemP05A3L12, itemP05A3L13, itemP05A3L14, itemP05A3L15,
			itemP05A3L16, itemP05A3L17, itemP05A3L18, itemP05A3L19, itemP05A3L20, itemP05A4, processPrintType, memo,
			messageTypeCode5, itemP05A1Pattern, itemP05A2Pattern, itemP05A3Pattern);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Item> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Item> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("ItemResult")
	Optional<Item> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "ItemResult", value = {
			@Result(column = "oid", property = "oid", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "changed", property = "changed", jdbcType = JdbcType.CHAR),
			@Result(column = "related", property = "related", jdbcType = JdbcType.CHAR),
			@Result(column = "related_date", property = "relatedDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "item_id_in", property = "itemIdIn", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_id_pd", property = "itemIdPd", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_8", property = "item8", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_e18", property = "itemE18", jdbcType = JdbcType.VARCHAR),
			@Result(column = "identical_item_id", property = "identicalItemId", jdbcType = JdbcType.BIGINT),
			@Result(column = "valid_start_string_date", property = "validStartStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "valid_end_string_date", property = "validEndStringDate", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_by_oid", property = "placeByOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_se_oid", property = "placeSeOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_ob_oid", property = "placeObOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_sf_oid", property = "placeSfOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_st_oid", property = "placeStOid", jdbcType = JdbcType.BIGINT),
			@Result(column = "place_of_loading_id", property = "placeOfLoadingId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_loading_name", property = "placeOfLoadingName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "place_of_discharge_id", property = "placeOfDischargeId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_e04", property = "itemE04", jdbcType = JdbcType.VARCHAR),
			@Result(column = "per_package_quantity", property = "perPackageQuantity", jdbcType = JdbcType.BIGINT),
			@Result(column = "manufacturing_department_id", property = "manufacturingDepartmentId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "package_type_description_code", property = "packageTypeDescriptionCode", jdbcType = JdbcType.VARCHAR),
			@Result(column = "quantity_unit_code", property = "quantityUnitCode", jdbcType = JdbcType.VARCHAR),
			@Result(column = "buyable", property = "buyable", jdbcType = JdbcType.CHAR),
			@Result(column = "supply_type", property = "supplyType", jdbcType = JdbcType.CHAR),
			@Result(column = "item_type", property = "itemType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "through_type", property = "throughType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "materials_type", property = "materialsType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "separate_supply_type", property = "separateSupplyType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_m03", property = "itemM03", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_id_cl", property = "itemIdCl", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_m01_desc", property = "itemM01Desc", jdbcType = JdbcType.VARCHAR),
			@Result(column = "item_p04_detail", property = "itemP04Detail", jdbcType = JdbcType.VARCHAR),
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
			@Result(column = "process_print_type", property = "processPrintType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "memo", property = "memo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "message_type_code5", property = "messageTypeCode5", jdbcType = JdbcType.CHAR),
			@Result(column = "item_p05_a1_pattern", property = "itemP05A1Pattern", jdbcType = JdbcType.CHAR),
			@Result(column = "item_p05_a2_pattern", property = "itemP05A2Pattern", jdbcType = JdbcType.CHAR),
			@Result(column = "item_p05_a3_pattern", property = "itemP05A3Pattern", jdbcType = JdbcType.CHAR) })
	List<Item> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, item, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, item, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	default int deleteByPrimaryKey(Long oid_) {
		return delete(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	default int insert(Item record) {
		return MyBatis3Utils.insert(this::insert, record, item,
				c -> c.map(oid).toProperty("oid").map(changed).toProperty("changed").map(related).toProperty("related")
						.map(relatedDate).toProperty("relatedDate").map(itemIdIn).toProperty("itemIdIn").map(itemIdPd)
						.toProperty("itemIdPd").map(item8).toProperty("item8").map(itemE18).toProperty("itemE18")
						.map(identicalItemId).toProperty("identicalItemId").map(validStartStringDate)
						.toProperty("validStartStringDate").map(validEndStringDate).toProperty("validEndStringDate")
						.map(placeByOid).toProperty("placeByOid").map(placeSeOid).toProperty("placeSeOid")
						.map(placeObOid).toProperty("placeObOid").map(placeSfOid).toProperty("placeSfOid")
						.map(placeStOid).toProperty("placeStOid").map(placeOfLoadingId).toProperty("placeOfLoadingId")
						.map(placeOfLoadingName).toProperty("placeOfLoadingName").map(placeOfDischargeId)
						.toProperty("placeOfDischargeId").map(itemE04).toProperty("itemE04").map(perPackageQuantity)
						.toProperty("perPackageQuantity").map(manufacturingDepartmentId)
						.toProperty("manufacturingDepartmentId").map(packageTypeDescriptionCode)
						.toProperty("packageTypeDescriptionCode").map(quantityUnitCode).toProperty("quantityUnitCode")
						.map(buyable).toProperty("buyable").map(supplyType).toProperty("supplyType").map(itemType)
						.toProperty("itemType").map(throughType).toProperty("throughType").map(materialsType)
						.toProperty("materialsType").map(separateSupplyType).toProperty("separateSupplyType")
						.map(itemM03).toProperty("itemM03").map(itemIdCl).toProperty("itemIdCl").map(itemM01Desc)
						.toProperty("itemM01Desc").map(itemP04Detail).toProperty("itemP04Detail").map(itemP05A1L01)
						.toProperty("itemP05A1L01").map(itemP05A1L02).toProperty("itemP05A1L02").map(itemP05A1L03)
						.toProperty("itemP05A1L03").map(itemP05A1L04).toProperty("itemP05A1L04").map(itemP05A1L05)
						.toProperty("itemP05A1L05").map(itemP05A1L06).toProperty("itemP05A1L06").map(itemP05A1L07)
						.toProperty("itemP05A1L07").map(itemP05A1L08).toProperty("itemP05A1L08").map(itemP05A1L09)
						.toProperty("itemP05A1L09").map(itemP05A1L10).toProperty("itemP05A1L10").map(itemP05A1L11)
						.toProperty("itemP05A1L11").map(itemP05A1L12).toProperty("itemP05A1L12").map(itemP05A1L13)
						.toProperty("itemP05A1L13").map(itemP05A1L14).toProperty("itemP05A1L14").map(itemP05A1L15)
						.toProperty("itemP05A1L15").map(itemP05A1L16).toProperty("itemP05A1L16").map(itemP05A1L17)
						.toProperty("itemP05A1L17").map(itemP05A1L18).toProperty("itemP05A1L18").map(itemP05A1L19)
						.toProperty("itemP05A1L19").map(itemP05A1L20).toProperty("itemP05A1L20").map(itemP05A2L01)
						.toProperty("itemP05A2L01").map(itemP05A2L02).toProperty("itemP05A2L02").map(itemP05A2L03)
						.toProperty("itemP05A2L03").map(itemP05A2L04).toProperty("itemP05A2L04").map(itemP05A2L05)
						.toProperty("itemP05A2L05").map(itemP05A2L06).toProperty("itemP05A2L06").map(itemP05A2L07)
						.toProperty("itemP05A2L07").map(itemP05A2L08).toProperty("itemP05A2L08").map(itemP05A2L09)
						.toProperty("itemP05A2L09").map(itemP05A2L10).toProperty("itemP05A2L10").map(itemP05A2L11)
						.toProperty("itemP05A2L11").map(itemP05A2L12).toProperty("itemP05A2L12").map(itemP05A2L13)
						.toProperty("itemP05A2L13").map(itemP05A2L14).toProperty("itemP05A2L14").map(itemP05A2L15)
						.toProperty("itemP05A2L15").map(itemP05A2L16).toProperty("itemP05A2L16").map(itemP05A2L17)
						.toProperty("itemP05A2L17").map(itemP05A2L18).toProperty("itemP05A2L18").map(itemP05A2L19)
						.toProperty("itemP05A2L19").map(itemP05A2L20).toProperty("itemP05A2L20").map(itemP05A3L01)
						.toProperty("itemP05A3L01").map(itemP05A3L02).toProperty("itemP05A3L02").map(itemP05A3L03)
						.toProperty("itemP05A3L03").map(itemP05A3L04).toProperty("itemP05A3L04").map(itemP05A3L05)
						.toProperty("itemP05A3L05").map(itemP05A3L06).toProperty("itemP05A3L06").map(itemP05A3L07)
						.toProperty("itemP05A3L07").map(itemP05A3L08).toProperty("itemP05A3L08").map(itemP05A3L09)
						.toProperty("itemP05A3L09").map(itemP05A3L10).toProperty("itemP05A3L10").map(itemP05A3L11)
						.toProperty("itemP05A3L11").map(itemP05A3L12).toProperty("itemP05A3L12").map(itemP05A3L13)
						.toProperty("itemP05A3L13").map(itemP05A3L14).toProperty("itemP05A3L14").map(itemP05A3L15)
						.toProperty("itemP05A3L15").map(itemP05A3L16).toProperty("itemP05A3L16").map(itemP05A3L17)
						.toProperty("itemP05A3L17").map(itemP05A3L18).toProperty("itemP05A3L18").map(itemP05A3L19)
						.toProperty("itemP05A3L19").map(itemP05A3L20).toProperty("itemP05A3L20").map(itemP05A4)
						.toProperty("itemP05A4").map(processPrintType).toProperty("processPrintType").map(memo)
						.toProperty("memo").map(messageTypeCode5).toProperty("messageTypeCode5").map(itemP05A1Pattern)
						.toProperty("itemP05A1Pattern").map(itemP05A2Pattern).toProperty("itemP05A2Pattern")
						.map(itemP05A3Pattern).toProperty("itemP05A3Pattern"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source Table: public.item")
	default int insertMultiple(Collection<Item> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, item,
				c -> c.map(oid).toProperty("oid").map(changed).toProperty("changed").map(related).toProperty("related")
						.map(relatedDate).toProperty("relatedDate").map(itemIdIn).toProperty("itemIdIn").map(itemIdPd)
						.toProperty("itemIdPd").map(item8).toProperty("item8").map(itemE18).toProperty("itemE18")
						.map(identicalItemId).toProperty("identicalItemId").map(validStartStringDate)
						.toProperty("validStartStringDate").map(validEndStringDate).toProperty("validEndStringDate")
						.map(placeByOid).toProperty("placeByOid").map(placeSeOid).toProperty("placeSeOid")
						.map(placeObOid).toProperty("placeObOid").map(placeSfOid).toProperty("placeSfOid")
						.map(placeStOid).toProperty("placeStOid").map(placeOfLoadingId).toProperty("placeOfLoadingId")
						.map(placeOfLoadingName).toProperty("placeOfLoadingName").map(placeOfDischargeId)
						.toProperty("placeOfDischargeId").map(itemE04).toProperty("itemE04").map(perPackageQuantity)
						.toProperty("perPackageQuantity").map(manufacturingDepartmentId)
						.toProperty("manufacturingDepartmentId").map(packageTypeDescriptionCode)
						.toProperty("packageTypeDescriptionCode").map(quantityUnitCode).toProperty("quantityUnitCode")
						.map(buyable).toProperty("buyable").map(supplyType).toProperty("supplyType").map(itemType)
						.toProperty("itemType").map(throughType).toProperty("throughType").map(materialsType)
						.toProperty("materialsType").map(separateSupplyType).toProperty("separateSupplyType")
						.map(itemM03).toProperty("itemM03").map(itemIdCl).toProperty("itemIdCl").map(itemM01Desc)
						.toProperty("itemM01Desc").map(itemP04Detail).toProperty("itemP04Detail").map(itemP05A1L01)
						.toProperty("itemP05A1L01").map(itemP05A1L02).toProperty("itemP05A1L02").map(itemP05A1L03)
						.toProperty("itemP05A1L03").map(itemP05A1L04).toProperty("itemP05A1L04").map(itemP05A1L05)
						.toProperty("itemP05A1L05").map(itemP05A1L06).toProperty("itemP05A1L06").map(itemP05A1L07)
						.toProperty("itemP05A1L07").map(itemP05A1L08).toProperty("itemP05A1L08").map(itemP05A1L09)
						.toProperty("itemP05A1L09").map(itemP05A1L10).toProperty("itemP05A1L10").map(itemP05A1L11)
						.toProperty("itemP05A1L11").map(itemP05A1L12).toProperty("itemP05A1L12").map(itemP05A1L13)
						.toProperty("itemP05A1L13").map(itemP05A1L14).toProperty("itemP05A1L14").map(itemP05A1L15)
						.toProperty("itemP05A1L15").map(itemP05A1L16).toProperty("itemP05A1L16").map(itemP05A1L17)
						.toProperty("itemP05A1L17").map(itemP05A1L18).toProperty("itemP05A1L18").map(itemP05A1L19)
						.toProperty("itemP05A1L19").map(itemP05A1L20).toProperty("itemP05A1L20").map(itemP05A2L01)
						.toProperty("itemP05A2L01").map(itemP05A2L02).toProperty("itemP05A2L02").map(itemP05A2L03)
						.toProperty("itemP05A2L03").map(itemP05A2L04).toProperty("itemP05A2L04").map(itemP05A2L05)
						.toProperty("itemP05A2L05").map(itemP05A2L06).toProperty("itemP05A2L06").map(itemP05A2L07)
						.toProperty("itemP05A2L07").map(itemP05A2L08).toProperty("itemP05A2L08").map(itemP05A2L09)
						.toProperty("itemP05A2L09").map(itemP05A2L10).toProperty("itemP05A2L10").map(itemP05A2L11)
						.toProperty("itemP05A2L11").map(itemP05A2L12).toProperty("itemP05A2L12").map(itemP05A2L13)
						.toProperty("itemP05A2L13").map(itemP05A2L14).toProperty("itemP05A2L14").map(itemP05A2L15)
						.toProperty("itemP05A2L15").map(itemP05A2L16).toProperty("itemP05A2L16").map(itemP05A2L17)
						.toProperty("itemP05A2L17").map(itemP05A2L18).toProperty("itemP05A2L18").map(itemP05A2L19)
						.toProperty("itemP05A2L19").map(itemP05A2L20).toProperty("itemP05A2L20").map(itemP05A3L01)
						.toProperty("itemP05A3L01").map(itemP05A3L02).toProperty("itemP05A3L02").map(itemP05A3L03)
						.toProperty("itemP05A3L03").map(itemP05A3L04).toProperty("itemP05A3L04").map(itemP05A3L05)
						.toProperty("itemP05A3L05").map(itemP05A3L06).toProperty("itemP05A3L06").map(itemP05A3L07)
						.toProperty("itemP05A3L07").map(itemP05A3L08).toProperty("itemP05A3L08").map(itemP05A3L09)
						.toProperty("itemP05A3L09").map(itemP05A3L10).toProperty("itemP05A3L10").map(itemP05A3L11)
						.toProperty("itemP05A3L11").map(itemP05A3L12).toProperty("itemP05A3L12").map(itemP05A3L13)
						.toProperty("itemP05A3L13").map(itemP05A3L14).toProperty("itemP05A3L14").map(itemP05A3L15)
						.toProperty("itemP05A3L15").map(itemP05A3L16).toProperty("itemP05A3L16").map(itemP05A3L17)
						.toProperty("itemP05A3L17").map(itemP05A3L18).toProperty("itemP05A3L18").map(itemP05A3L19)
						.toProperty("itemP05A3L19").map(itemP05A3L20).toProperty("itemP05A3L20").map(itemP05A4)
						.toProperty("itemP05A4").map(processPrintType).toProperty("processPrintType").map(memo)
						.toProperty("memo").map(messageTypeCode5).toProperty("messageTypeCode5").map(itemP05A1Pattern)
						.toProperty("itemP05A1Pattern").map(itemP05A2Pattern).toProperty("itemP05A2Pattern")
						.map(itemP05A3Pattern).toProperty("itemP05A3Pattern"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	default int insertSelective(Item record) {
		return MyBatis3Utils.insert(this::insert, record, item, c -> c.map(oid)
				.toPropertyWhenPresent("oid", record::getOid).map(changed)
				.toPropertyWhenPresent("changed", record::getChanged).map(related)
				.toPropertyWhenPresent("related", record::getRelated).map(relatedDate)
				.toPropertyWhenPresent("relatedDate", record::getRelatedDate).map(itemIdIn)
				.toPropertyWhenPresent("itemIdIn", record::getItemIdIn).map(itemIdPd)
				.toPropertyWhenPresent("itemIdPd", record::getItemIdPd).map(item8)
				.toPropertyWhenPresent("item8", record::getItem8).map(itemE18)
				.toPropertyWhenPresent("itemE18", record::getItemE18).map(identicalItemId)
				.toPropertyWhenPresent("identicalItemId", record::getIdenticalItemId).map(validStartStringDate)
				.toPropertyWhenPresent("validStartStringDate", record::getValidStartStringDate).map(validEndStringDate)
				.toPropertyWhenPresent("validEndStringDate", record::getValidEndStringDate).map(placeByOid)
				.toPropertyWhenPresent("placeByOid", record::getPlaceByOid).map(placeSeOid)
				.toPropertyWhenPresent("placeSeOid", record::getPlaceSeOid).map(placeObOid)
				.toPropertyWhenPresent("placeObOid", record::getPlaceObOid).map(placeSfOid)
				.toPropertyWhenPresent("placeSfOid", record::getPlaceSfOid).map(placeStOid)
				.toPropertyWhenPresent("placeStOid", record::getPlaceStOid).map(placeOfLoadingId)
				.toPropertyWhenPresent("placeOfLoadingId", record::getPlaceOfLoadingId).map(placeOfLoadingName)
				.toPropertyWhenPresent("placeOfLoadingName", record::getPlaceOfLoadingName).map(placeOfDischargeId)
				.toPropertyWhenPresent("placeOfDischargeId", record::getPlaceOfDischargeId).map(itemE04)
				.toPropertyWhenPresent("itemE04", record::getItemE04).map(perPackageQuantity)
				.toPropertyWhenPresent("perPackageQuantity", record::getPerPackageQuantity)
				.map(manufacturingDepartmentId)
				.toPropertyWhenPresent("manufacturingDepartmentId", record::getManufacturingDepartmentId)
				.map(packageTypeDescriptionCode)
				.toPropertyWhenPresent("packageTypeDescriptionCode", record::getPackageTypeDescriptionCode)
				.map(quantityUnitCode).toPropertyWhenPresent("quantityUnitCode", record::getQuantityUnitCode)
				.map(buyable).toPropertyWhenPresent("buyable", record::getBuyable).map(supplyType)
				.toPropertyWhenPresent("supplyType", record::getSupplyType).map(itemType)
				.toPropertyWhenPresent("itemType", record::getItemType).map(throughType)
				.toPropertyWhenPresent("throughType", record::getThroughType).map(materialsType)
				.toPropertyWhenPresent("materialsType", record::getMaterialsType).map(separateSupplyType)
				.toPropertyWhenPresent("separateSupplyType", record::getSeparateSupplyType).map(itemM03)
				.toPropertyWhenPresent("itemM03", record::getItemM03).map(itemIdCl)
				.toPropertyWhenPresent("itemIdCl", record::getItemIdCl).map(itemM01Desc)
				.toPropertyWhenPresent("itemM01Desc", record::getItemM01Desc).map(itemP04Detail)
				.toPropertyWhenPresent("itemP04Detail", record::getItemP04Detail).map(itemP05A1L01)
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
				.toPropertyWhenPresent("itemP05A1L20", record::getItemP05A1L20).map(itemP05A2L01)
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
				.toPropertyWhenPresent("itemP05A2L20", record::getItemP05A2L20).map(itemP05A3L01)
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
				.toPropertyWhenPresent("itemP05A4", record::getItemP05A4).map(processPrintType)
				.toPropertyWhenPresent("processPrintType", record::getProcessPrintType).map(memo)
				.toPropertyWhenPresent("memo", record::getMemo).map(messageTypeCode5)
				.toPropertyWhenPresent("messageTypeCode5", record::getMessageTypeCode5).map(itemP05A1Pattern)
				.toPropertyWhenPresent("itemP05A1Pattern", record::getItemP05A1Pattern).map(itemP05A2Pattern)
				.toPropertyWhenPresent("itemP05A2Pattern", record::getItemP05A2Pattern).map(itemP05A3Pattern)
				.toPropertyWhenPresent("itemP05A3Pattern", record::getItemP05A3Pattern));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	default Optional<Item> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, item, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	default List<Item> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, item, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	default List<Item> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, item, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	default Optional<Item> selectByPrimaryKey(Long oid_) {
		return selectOne(c -> c.where(oid, isEqualTo(oid_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, item, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	static UpdateDSL<UpdateModel> updateAllColumns(Item record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalTo(record::getOid).set(changed).equalTo(record::getChanged).set(related)
				.equalTo(record::getRelated).set(relatedDate).equalTo(record::getRelatedDate).set(itemIdIn)
				.equalTo(record::getItemIdIn).set(itemIdPd).equalTo(record::getItemIdPd).set(item8)
				.equalTo(record::getItem8).set(itemE18).equalTo(record::getItemE18).set(identicalItemId)
				.equalTo(record::getIdenticalItemId).set(validStartStringDate).equalTo(record::getValidStartStringDate)
				.set(validEndStringDate).equalTo(record::getValidEndStringDate).set(placeByOid)
				.equalTo(record::getPlaceByOid).set(placeSeOid).equalTo(record::getPlaceSeOid).set(placeObOid)
				.equalTo(record::getPlaceObOid).set(placeSfOid).equalTo(record::getPlaceSfOid).set(placeStOid)
				.equalTo(record::getPlaceStOid).set(placeOfLoadingId).equalTo(record::getPlaceOfLoadingId)
				.set(placeOfLoadingName).equalTo(record::getPlaceOfLoadingName).set(placeOfDischargeId)
				.equalTo(record::getPlaceOfDischargeId).set(itemE04).equalTo(record::getItemE04).set(perPackageQuantity)
				.equalTo(record::getPerPackageQuantity).set(manufacturingDepartmentId)
				.equalTo(record::getManufacturingDepartmentId).set(packageTypeDescriptionCode)
				.equalTo(record::getPackageTypeDescriptionCode).set(quantityUnitCode)
				.equalTo(record::getQuantityUnitCode).set(buyable).equalTo(record::getBuyable).set(supplyType)
				.equalTo(record::getSupplyType).set(itemType).equalTo(record::getItemType).set(throughType)
				.equalTo(record::getThroughType).set(materialsType).equalTo(record::getMaterialsType)
				.set(separateSupplyType).equalTo(record::getSeparateSupplyType).set(itemM03).equalTo(record::getItemM03)
				.set(itemIdCl).equalTo(record::getItemIdCl).set(itemM01Desc).equalTo(record::getItemM01Desc)
				.set(itemP04Detail).equalTo(record::getItemP04Detail).set(itemP05A1L01).equalTo(record::getItemP05A1L01)
				.set(itemP05A1L02).equalTo(record::getItemP05A1L02).set(itemP05A1L03).equalTo(record::getItemP05A1L03)
				.set(itemP05A1L04).equalTo(record::getItemP05A1L04).set(itemP05A1L05).equalTo(record::getItemP05A1L05)
				.set(itemP05A1L06).equalTo(record::getItemP05A1L06).set(itemP05A1L07).equalTo(record::getItemP05A1L07)
				.set(itemP05A1L08).equalTo(record::getItemP05A1L08).set(itemP05A1L09).equalTo(record::getItemP05A1L09)
				.set(itemP05A1L10).equalTo(record::getItemP05A1L10).set(itemP05A1L11).equalTo(record::getItemP05A1L11)
				.set(itemP05A1L12).equalTo(record::getItemP05A1L12).set(itemP05A1L13).equalTo(record::getItemP05A1L13)
				.set(itemP05A1L14).equalTo(record::getItemP05A1L14).set(itemP05A1L15).equalTo(record::getItemP05A1L15)
				.set(itemP05A1L16).equalTo(record::getItemP05A1L16).set(itemP05A1L17).equalTo(record::getItemP05A1L17)
				.set(itemP05A1L18).equalTo(record::getItemP05A1L18).set(itemP05A1L19).equalTo(record::getItemP05A1L19)
				.set(itemP05A1L20).equalTo(record::getItemP05A1L20).set(itemP05A2L01).equalTo(record::getItemP05A2L01)
				.set(itemP05A2L02).equalTo(record::getItemP05A2L02).set(itemP05A2L03).equalTo(record::getItemP05A2L03)
				.set(itemP05A2L04).equalTo(record::getItemP05A2L04).set(itemP05A2L05).equalTo(record::getItemP05A2L05)
				.set(itemP05A2L06).equalTo(record::getItemP05A2L06).set(itemP05A2L07).equalTo(record::getItemP05A2L07)
				.set(itemP05A2L08).equalTo(record::getItemP05A2L08).set(itemP05A2L09).equalTo(record::getItemP05A2L09)
				.set(itemP05A2L10).equalTo(record::getItemP05A2L10).set(itemP05A2L11).equalTo(record::getItemP05A2L11)
				.set(itemP05A2L12).equalTo(record::getItemP05A2L12).set(itemP05A2L13).equalTo(record::getItemP05A2L13)
				.set(itemP05A2L14).equalTo(record::getItemP05A2L14).set(itemP05A2L15).equalTo(record::getItemP05A2L15)
				.set(itemP05A2L16).equalTo(record::getItemP05A2L16).set(itemP05A2L17).equalTo(record::getItemP05A2L17)
				.set(itemP05A2L18).equalTo(record::getItemP05A2L18).set(itemP05A2L19).equalTo(record::getItemP05A2L19)
				.set(itemP05A2L20).equalTo(record::getItemP05A2L20).set(itemP05A3L01).equalTo(record::getItemP05A3L01)
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
				.set(processPrintType).equalTo(record::getProcessPrintType).set(memo).equalTo(record::getMemo)
				.set(messageTypeCode5).equalTo(record::getMessageTypeCode5).set(itemP05A1Pattern)
				.equalTo(record::getItemP05A1Pattern).set(itemP05A2Pattern).equalTo(record::getItemP05A2Pattern)
				.set(itemP05A3Pattern).equalTo(record::getItemP05A3Pattern);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Item record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(oid).equalToWhenPresent(record::getOid).set(changed).equalToWhenPresent(record::getChanged)
				.set(related).equalToWhenPresent(record::getRelated).set(relatedDate)
				.equalToWhenPresent(record::getRelatedDate).set(itemIdIn).equalToWhenPresent(record::getItemIdIn)
				.set(itemIdPd).equalToWhenPresent(record::getItemIdPd).set(item8).equalToWhenPresent(record::getItem8)
				.set(itemE18).equalToWhenPresent(record::getItemE18).set(identicalItemId)
				.equalToWhenPresent(record::getIdenticalItemId).set(validStartStringDate)
				.equalToWhenPresent(record::getValidStartStringDate).set(validEndStringDate)
				.equalToWhenPresent(record::getValidEndStringDate).set(placeByOid)
				.equalToWhenPresent(record::getPlaceByOid).set(placeSeOid).equalToWhenPresent(record::getPlaceSeOid)
				.set(placeObOid).equalToWhenPresent(record::getPlaceObOid).set(placeSfOid)
				.equalToWhenPresent(record::getPlaceSfOid).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(placeOfLoadingId).equalToWhenPresent(record::getPlaceOfLoadingId).set(placeOfLoadingName)
				.equalToWhenPresent(record::getPlaceOfLoadingName).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(itemE04).equalToWhenPresent(record::getItemE04)
				.set(perPackageQuantity).equalToWhenPresent(record::getPerPackageQuantity)
				.set(manufacturingDepartmentId).equalToWhenPresent(record::getManufacturingDepartmentId)
				.set(packageTypeDescriptionCode).equalToWhenPresent(record::getPackageTypeDescriptionCode)
				.set(quantityUnitCode).equalToWhenPresent(record::getQuantityUnitCode).set(buyable)
				.equalToWhenPresent(record::getBuyable).set(supplyType).equalToWhenPresent(record::getSupplyType)
				.set(itemType).equalToWhenPresent(record::getItemType).set(throughType)
				.equalToWhenPresent(record::getThroughType).set(materialsType)
				.equalToWhenPresent(record::getMaterialsType).set(separateSupplyType)
				.equalToWhenPresent(record::getSeparateSupplyType).set(itemM03).equalToWhenPresent(record::getItemM03)
				.set(itemIdCl).equalToWhenPresent(record::getItemIdCl).set(itemM01Desc)
				.equalToWhenPresent(record::getItemM01Desc).set(itemP04Detail)
				.equalToWhenPresent(record::getItemP04Detail).set(itemP05A1L01)
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
				.equalToWhenPresent(record::getItemP05A1L20).set(itemP05A2L01)
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
				.equalToWhenPresent(record::getItemP05A2L20).set(itemP05A3L01)
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
				.set(processPrintType).equalToWhenPresent(record::getProcessPrintType).set(memo)
				.equalToWhenPresent(record::getMemo).set(messageTypeCode5)
				.equalToWhenPresent(record::getMessageTypeCode5).set(itemP05A1Pattern)
				.equalToWhenPresent(record::getItemP05A1Pattern).set(itemP05A2Pattern)
				.equalToWhenPresent(record::getItemP05A2Pattern).set(itemP05A3Pattern)
				.equalToWhenPresent(record::getItemP05A3Pattern);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	default int updateByPrimaryKey(Item record) {
		return update(c -> c.set(changed).equalTo(record::getChanged).set(related).equalTo(record::getRelated)
				.set(relatedDate).equalTo(record::getRelatedDate).set(itemIdIn).equalTo(record::getItemIdIn)
				.set(itemIdPd).equalTo(record::getItemIdPd).set(item8).equalTo(record::getItem8).set(itemE18)
				.equalTo(record::getItemE18).set(identicalItemId).equalTo(record::getIdenticalItemId)
				.set(validStartStringDate).equalTo(record::getValidStartStringDate).set(validEndStringDate)
				.equalTo(record::getValidEndStringDate).set(placeByOid).equalTo(record::getPlaceByOid).set(placeSeOid)
				.equalTo(record::getPlaceSeOid).set(placeObOid).equalTo(record::getPlaceObOid).set(placeSfOid)
				.equalTo(record::getPlaceSfOid).set(placeStOid).equalTo(record::getPlaceStOid).set(placeOfLoadingId)
				.equalTo(record::getPlaceOfLoadingId).set(placeOfLoadingName).equalTo(record::getPlaceOfLoadingName)
				.set(placeOfDischargeId).equalTo(record::getPlaceOfDischargeId).set(itemE04).equalTo(record::getItemE04)
				.set(perPackageQuantity).equalTo(record::getPerPackageQuantity).set(manufacturingDepartmentId)
				.equalTo(record::getManufacturingDepartmentId).set(packageTypeDescriptionCode)
				.equalTo(record::getPackageTypeDescriptionCode).set(quantityUnitCode)
				.equalTo(record::getQuantityUnitCode).set(buyable).equalTo(record::getBuyable).set(supplyType)
				.equalTo(record::getSupplyType).set(itemType).equalTo(record::getItemType).set(throughType)
				.equalTo(record::getThroughType).set(materialsType).equalTo(record::getMaterialsType)
				.set(separateSupplyType).equalTo(record::getSeparateSupplyType).set(itemM03).equalTo(record::getItemM03)
				.set(itemIdCl).equalTo(record::getItemIdCl).set(itemM01Desc).equalTo(record::getItemM01Desc)
				.set(itemP04Detail).equalTo(record::getItemP04Detail).set(itemP05A1L01).equalTo(record::getItemP05A1L01)
				.set(itemP05A1L02).equalTo(record::getItemP05A1L02).set(itemP05A1L03).equalTo(record::getItemP05A1L03)
				.set(itemP05A1L04).equalTo(record::getItemP05A1L04).set(itemP05A1L05).equalTo(record::getItemP05A1L05)
				.set(itemP05A1L06).equalTo(record::getItemP05A1L06).set(itemP05A1L07).equalTo(record::getItemP05A1L07)
				.set(itemP05A1L08).equalTo(record::getItemP05A1L08).set(itemP05A1L09).equalTo(record::getItemP05A1L09)
				.set(itemP05A1L10).equalTo(record::getItemP05A1L10).set(itemP05A1L11).equalTo(record::getItemP05A1L11)
				.set(itemP05A1L12).equalTo(record::getItemP05A1L12).set(itemP05A1L13).equalTo(record::getItemP05A1L13)
				.set(itemP05A1L14).equalTo(record::getItemP05A1L14).set(itemP05A1L15).equalTo(record::getItemP05A1L15)
				.set(itemP05A1L16).equalTo(record::getItemP05A1L16).set(itemP05A1L17).equalTo(record::getItemP05A1L17)
				.set(itemP05A1L18).equalTo(record::getItemP05A1L18).set(itemP05A1L19).equalTo(record::getItemP05A1L19)
				.set(itemP05A1L20).equalTo(record::getItemP05A1L20).set(itemP05A2L01).equalTo(record::getItemP05A2L01)
				.set(itemP05A2L02).equalTo(record::getItemP05A2L02).set(itemP05A2L03).equalTo(record::getItemP05A2L03)
				.set(itemP05A2L04).equalTo(record::getItemP05A2L04).set(itemP05A2L05).equalTo(record::getItemP05A2L05)
				.set(itemP05A2L06).equalTo(record::getItemP05A2L06).set(itemP05A2L07).equalTo(record::getItemP05A2L07)
				.set(itemP05A2L08).equalTo(record::getItemP05A2L08).set(itemP05A2L09).equalTo(record::getItemP05A2L09)
				.set(itemP05A2L10).equalTo(record::getItemP05A2L10).set(itemP05A2L11).equalTo(record::getItemP05A2L11)
				.set(itemP05A2L12).equalTo(record::getItemP05A2L12).set(itemP05A2L13).equalTo(record::getItemP05A2L13)
				.set(itemP05A2L14).equalTo(record::getItemP05A2L14).set(itemP05A2L15).equalTo(record::getItemP05A2L15)
				.set(itemP05A2L16).equalTo(record::getItemP05A2L16).set(itemP05A2L17).equalTo(record::getItemP05A2L17)
				.set(itemP05A2L18).equalTo(record::getItemP05A2L18).set(itemP05A2L19).equalTo(record::getItemP05A2L19)
				.set(itemP05A2L20).equalTo(record::getItemP05A2L20).set(itemP05A3L01).equalTo(record::getItemP05A3L01)
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
				.set(processPrintType).equalTo(record::getProcessPrintType).set(memo).equalTo(record::getMemo)
				.set(messageTypeCode5).equalTo(record::getMessageTypeCode5).set(itemP05A1Pattern)
				.equalTo(record::getItemP05A1Pattern).set(itemP05A2Pattern).equalTo(record::getItemP05A2Pattern)
				.set(itemP05A3Pattern).equalTo(record::getItemP05A3Pattern).where(oid, isEqualTo(record::getOid)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4843416+09:00", comments = "Source Table: public.item")
	default int updateByPrimaryKeySelective(Item record) {
		return update(c -> c.set(changed).equalToWhenPresent(record::getChanged).set(related)
				.equalToWhenPresent(record::getRelated).set(relatedDate).equalToWhenPresent(record::getRelatedDate)
				.set(itemIdIn).equalToWhenPresent(record::getItemIdIn).set(itemIdPd)
				.equalToWhenPresent(record::getItemIdPd).set(item8).equalToWhenPresent(record::getItem8).set(itemE18)
				.equalToWhenPresent(record::getItemE18).set(identicalItemId)
				.equalToWhenPresent(record::getIdenticalItemId).set(validStartStringDate)
				.equalToWhenPresent(record::getValidStartStringDate).set(validEndStringDate)
				.equalToWhenPresent(record::getValidEndStringDate).set(placeByOid)
				.equalToWhenPresent(record::getPlaceByOid).set(placeSeOid).equalToWhenPresent(record::getPlaceSeOid)
				.set(placeObOid).equalToWhenPresent(record::getPlaceObOid).set(placeSfOid)
				.equalToWhenPresent(record::getPlaceSfOid).set(placeStOid).equalToWhenPresent(record::getPlaceStOid)
				.set(placeOfLoadingId).equalToWhenPresent(record::getPlaceOfLoadingId).set(placeOfLoadingName)
				.equalToWhenPresent(record::getPlaceOfLoadingName).set(placeOfDischargeId)
				.equalToWhenPresent(record::getPlaceOfDischargeId).set(itemE04).equalToWhenPresent(record::getItemE04)
				.set(perPackageQuantity).equalToWhenPresent(record::getPerPackageQuantity)
				.set(manufacturingDepartmentId).equalToWhenPresent(record::getManufacturingDepartmentId)
				.set(packageTypeDescriptionCode).equalToWhenPresent(record::getPackageTypeDescriptionCode)
				.set(quantityUnitCode).equalToWhenPresent(record::getQuantityUnitCode).set(buyable)
				.equalToWhenPresent(record::getBuyable).set(supplyType).equalToWhenPresent(record::getSupplyType)
				.set(itemType).equalToWhenPresent(record::getItemType).set(throughType)
				.equalToWhenPresent(record::getThroughType).set(materialsType)
				.equalToWhenPresent(record::getMaterialsType).set(separateSupplyType)
				.equalToWhenPresent(record::getSeparateSupplyType).set(itemM03).equalToWhenPresent(record::getItemM03)
				.set(itemIdCl).equalToWhenPresent(record::getItemIdCl).set(itemM01Desc)
				.equalToWhenPresent(record::getItemM01Desc).set(itemP04Detail)
				.equalToWhenPresent(record::getItemP04Detail).set(itemP05A1L01)
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
				.equalToWhenPresent(record::getItemP05A1L20).set(itemP05A2L01)
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
				.equalToWhenPresent(record::getItemP05A2L20).set(itemP05A3L01)
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
				.set(processPrintType).equalToWhenPresent(record::getProcessPrintType).set(memo)
				.equalToWhenPresent(record::getMemo).set(messageTypeCode5)
				.equalToWhenPresent(record::getMessageTypeCode5).set(itemP05A1Pattern)
				.equalToWhenPresent(record::getItemP05A1Pattern).set(itemP05A2Pattern)
				.equalToWhenPresent(record::getItemP05A2Pattern).set(itemP05A3Pattern)
				.equalToWhenPresent(record::getItemP05A3Pattern).where(oid, isEqualTo(record::getOid)));
	}

	/**
	 * 品番選択Ajax用
	 *
	 * @param condition
	 * @return
	 */
	public List<Item> selectItemList(SelectItemCondition condition);

}