package jp.or.twg.twg_edi.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source Table: public.item")
	public static final Item item = new Item();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.oid")
	public static final SqlColumn<Long> oid = item.oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.changed")
	public static final SqlColumn<String> changed = item.changed;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.related")
	public static final SqlColumn<String> related = item.related;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.related_date")
	public static final SqlColumn<Date> relatedDate = item.relatedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_id_in")
	public static final SqlColumn<String> itemIdIn = item.itemIdIn;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_id_pd")
	public static final SqlColumn<String> itemIdPd = item.itemIdPd;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_8")
	public static final SqlColumn<String> item8 = item.item8;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_e18")
	public static final SqlColumn<String> itemE18 = item.itemE18;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.identical_item_id")
	public static final SqlColumn<Long> identicalItemId = item.identicalItemId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.valid_start_string_date")
	public static final SqlColumn<String> validStartStringDate = item.validStartStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.valid_end_string_date")
	public static final SqlColumn<String> validEndStringDate = item.validEndStringDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.place_by_oid")
	public static final SqlColumn<Long> placeByOid = item.placeByOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.place_se_oid")
	public static final SqlColumn<Long> placeSeOid = item.placeSeOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.place_ob_oid")
	public static final SqlColumn<Long> placeObOid = item.placeObOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.place_sf_oid")
	public static final SqlColumn<Long> placeSfOid = item.placeSfOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.place_st_oid")
	public static final SqlColumn<Long> placeStOid = item.placeStOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.place_of_loading_id")
	public static final SqlColumn<String> placeOfLoadingId = item.placeOfLoadingId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.place_of_loading_name")
	public static final SqlColumn<String> placeOfLoadingName = item.placeOfLoadingName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.place_of_discharge_id")
	public static final SqlColumn<String> placeOfDischargeId = item.placeOfDischargeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_e04")
	public static final SqlColumn<String> itemE04 = item.itemE04;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.per_package_quantity")
	public static final SqlColumn<Long> perPackageQuantity = item.perPackageQuantity;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.manufacturing_department_id")
	public static final SqlColumn<String> manufacturingDepartmentId = item.manufacturingDepartmentId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.package_type_description_code")
	public static final SqlColumn<String> packageTypeDescriptionCode = item.packageTypeDescriptionCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.quantity_unit_code")
	public static final SqlColumn<String> quantityUnitCode = item.quantityUnitCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.buyable")
	public static final SqlColumn<String> buyable = item.buyable;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.supply_type")
	public static final SqlColumn<String> supplyType = item.supplyType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_type")
	public static final SqlColumn<String> itemType = item.itemType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.through_type")
	public static final SqlColumn<String> throughType = item.throughType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.materials_type")
	public static final SqlColumn<String> materialsType = item.materialsType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.separate_supply_type")
	public static final SqlColumn<String> separateSupplyType = item.separateSupplyType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_m03")
	public static final SqlColumn<String> itemM03 = item.itemM03;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_id_cl")
	public static final SqlColumn<String> itemIdCl = item.itemIdCl;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_m01_desc")
	public static final SqlColumn<String> itemM01Desc = item.itemM01Desc;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p04_detail")
	public static final SqlColumn<String> itemP04Detail = item.itemP04Detail;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l01")
	public static final SqlColumn<String> itemP05A1L01 = item.itemP05A1L01;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l02")
	public static final SqlColumn<String> itemP05A1L02 = item.itemP05A1L02;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l03")
	public static final SqlColumn<String> itemP05A1L03 = item.itemP05A1L03;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l04")
	public static final SqlColumn<String> itemP05A1L04 = item.itemP05A1L04;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l05")
	public static final SqlColumn<String> itemP05A1L05 = item.itemP05A1L05;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l06")
	public static final SqlColumn<String> itemP05A1L06 = item.itemP05A1L06;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l07")
	public static final SqlColumn<String> itemP05A1L07 = item.itemP05A1L07;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l08")
	public static final SqlColumn<String> itemP05A1L08 = item.itemP05A1L08;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l09")
	public static final SqlColumn<String> itemP05A1L09 = item.itemP05A1L09;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l10")
	public static final SqlColumn<String> itemP05A1L10 = item.itemP05A1L10;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l11")
	public static final SqlColumn<String> itemP05A1L11 = item.itemP05A1L11;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l12")
	public static final SqlColumn<String> itemP05A1L12 = item.itemP05A1L12;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l13")
	public static final SqlColumn<String> itemP05A1L13 = item.itemP05A1L13;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_l14")
	public static final SqlColumn<String> itemP05A1L14 = item.itemP05A1L14;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a1_l15")
	public static final SqlColumn<String> itemP05A1L15 = item.itemP05A1L15;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a1_l16")
	public static final SqlColumn<String> itemP05A1L16 = item.itemP05A1L16;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a1_l17")
	public static final SqlColumn<String> itemP05A1L17 = item.itemP05A1L17;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a1_l18")
	public static final SqlColumn<String> itemP05A1L18 = item.itemP05A1L18;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a1_l19")
	public static final SqlColumn<String> itemP05A1L19 = item.itemP05A1L19;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a1_l20")
	public static final SqlColumn<String> itemP05A1L20 = item.itemP05A1L20;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l01")
	public static final SqlColumn<String> itemP05A2L01 = item.itemP05A2L01;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l02")
	public static final SqlColumn<String> itemP05A2L02 = item.itemP05A2L02;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l03")
	public static final SqlColumn<String> itemP05A2L03 = item.itemP05A2L03;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l04")
	public static final SqlColumn<String> itemP05A2L04 = item.itemP05A2L04;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l05")
	public static final SqlColumn<String> itemP05A2L05 = item.itemP05A2L05;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l06")
	public static final SqlColumn<String> itemP05A2L06 = item.itemP05A2L06;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l07")
	public static final SqlColumn<String> itemP05A2L07 = item.itemP05A2L07;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l08")
	public static final SqlColumn<String> itemP05A2L08 = item.itemP05A2L08;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l09")
	public static final SqlColumn<String> itemP05A2L09 = item.itemP05A2L09;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l10")
	public static final SqlColumn<String> itemP05A2L10 = item.itemP05A2L10;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l11")
	public static final SqlColumn<String> itemP05A2L11 = item.itemP05A2L11;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l12")
	public static final SqlColumn<String> itemP05A2L12 = item.itemP05A2L12;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l13")
	public static final SqlColumn<String> itemP05A2L13 = item.itemP05A2L13;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l14")
	public static final SqlColumn<String> itemP05A2L14 = item.itemP05A2L14;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l15")
	public static final SqlColumn<String> itemP05A2L15 = item.itemP05A2L15;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l16")
	public static final SqlColumn<String> itemP05A2L16 = item.itemP05A2L16;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l17")
	public static final SqlColumn<String> itemP05A2L17 = item.itemP05A2L17;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l18")
	public static final SqlColumn<String> itemP05A2L18 = item.itemP05A2L18;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l19")
	public static final SqlColumn<String> itemP05A2L19 = item.itemP05A2L19;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_l20")
	public static final SqlColumn<String> itemP05A2L20 = item.itemP05A2L20;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l01")
	public static final SqlColumn<String> itemP05A3L01 = item.itemP05A3L01;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l02")
	public static final SqlColumn<String> itemP05A3L02 = item.itemP05A3L02;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l03")
	public static final SqlColumn<String> itemP05A3L03 = item.itemP05A3L03;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l04")
	public static final SqlColumn<String> itemP05A3L04 = item.itemP05A3L04;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l05")
	public static final SqlColumn<String> itemP05A3L05 = item.itemP05A3L05;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l06")
	public static final SqlColumn<String> itemP05A3L06 = item.itemP05A3L06;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l07")
	public static final SqlColumn<String> itemP05A3L07 = item.itemP05A3L07;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l08")
	public static final SqlColumn<String> itemP05A3L08 = item.itemP05A3L08;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l09")
	public static final SqlColumn<String> itemP05A3L09 = item.itemP05A3L09;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l10")
	public static final SqlColumn<String> itemP05A3L10 = item.itemP05A3L10;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l11")
	public static final SqlColumn<String> itemP05A3L11 = item.itemP05A3L11;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l12")
	public static final SqlColumn<String> itemP05A3L12 = item.itemP05A3L12;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l13")
	public static final SqlColumn<String> itemP05A3L13 = item.itemP05A3L13;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l14")
	public static final SqlColumn<String> itemP05A3L14 = item.itemP05A3L14;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l15")
	public static final SqlColumn<String> itemP05A3L15 = item.itemP05A3L15;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l16")
	public static final SqlColumn<String> itemP05A3L16 = item.itemP05A3L16;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l17")
	public static final SqlColumn<String> itemP05A3L17 = item.itemP05A3L17;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l18")
	public static final SqlColumn<String> itemP05A3L18 = item.itemP05A3L18;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l19")
	public static final SqlColumn<String> itemP05A3L19 = item.itemP05A3L19;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_l20")
	public static final SqlColumn<String> itemP05A3L20 = item.itemP05A3L20;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a4")
	public static final SqlColumn<String> itemP05A4 = item.itemP05A4;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.process_print_type")
	public static final SqlColumn<String> processPrintType = item.processPrintType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.memo")
	public static final SqlColumn<String> memo = item.memo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.message_type_code5")
	public static final SqlColumn<String> messageTypeCode5 = item.messageTypeCode5;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a1_pattern")
	public static final SqlColumn<String> itemP05A1Pattern = item.itemP05A1Pattern;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a2_pattern")
	public static final SqlColumn<String> itemP05A2Pattern = item.itemP05A2Pattern;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4833443+09:00", comments = "Source field: public.item.item_p05_a3_pattern")
	public static final SqlColumn<String> itemP05A3Pattern = item.itemP05A3Pattern;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source Table: public.item")
	public static final class Item extends SqlTable {
		public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);
		public final SqlColumn<String> changed = column("changed", JDBCType.CHAR);
		public final SqlColumn<String> related = column("related", JDBCType.CHAR);
		public final SqlColumn<Date> relatedDate = column("related_date", JDBCType.TIMESTAMP);
		public final SqlColumn<String> itemIdIn = column("item_id_in", JDBCType.VARCHAR);
		public final SqlColumn<String> itemIdPd = column("item_id_pd", JDBCType.VARCHAR);
		public final SqlColumn<String> item8 = column("item_8", JDBCType.VARCHAR);
		public final SqlColumn<String> itemE18 = column("item_e18", JDBCType.VARCHAR);
		public final SqlColumn<Long> identicalItemId = column("identical_item_id", JDBCType.BIGINT);
		public final SqlColumn<String> validStartStringDate = column("valid_start_string_date", JDBCType.VARCHAR);
		public final SqlColumn<String> validEndStringDate = column("valid_end_string_date", JDBCType.VARCHAR);
		public final SqlColumn<Long> placeByOid = column("place_by_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeSeOid = column("place_se_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeObOid = column("place_ob_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeSfOid = column("place_sf_oid", JDBCType.BIGINT);
		public final SqlColumn<Long> placeStOid = column("place_st_oid", JDBCType.BIGINT);
		public final SqlColumn<String> placeOfLoadingId = column("place_of_loading_id", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfLoadingName = column("place_of_loading_name", JDBCType.VARCHAR);
		public final SqlColumn<String> placeOfDischargeId = column("place_of_discharge_id", JDBCType.VARCHAR);
		public final SqlColumn<String> itemE04 = column("item_e04", JDBCType.VARCHAR);
		public final SqlColumn<Long> perPackageQuantity = column("per_package_quantity", JDBCType.BIGINT);
		public final SqlColumn<String> manufacturingDepartmentId = column("manufacturing_department_id",
				JDBCType.VARCHAR);
		public final SqlColumn<String> packageTypeDescriptionCode = column("package_type_description_code",
				JDBCType.VARCHAR);
		public final SqlColumn<String> quantityUnitCode = column("quantity_unit_code", JDBCType.VARCHAR);
		public final SqlColumn<String> buyable = column("buyable", JDBCType.CHAR);
		public final SqlColumn<String> supplyType = column("supply_type", JDBCType.CHAR);
		public final SqlColumn<String> itemType = column("item_type", JDBCType.VARCHAR);
		public final SqlColumn<String> throughType = column("through_type", JDBCType.VARCHAR);
		public final SqlColumn<String> materialsType = column("materials_type", JDBCType.VARCHAR);
		public final SqlColumn<String> separateSupplyType = column("separate_supply_type", JDBCType.VARCHAR);
		public final SqlColumn<String> itemM03 = column("item_m03", JDBCType.VARCHAR);
		public final SqlColumn<String> itemIdCl = column("item_id_cl", JDBCType.VARCHAR);
		public final SqlColumn<String> itemM01Desc = column("item_m01_desc", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP04Detail = column("item_p04_detail", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L01 = column("item_p05_a1_l01", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L02 = column("item_p05_a1_l02", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L03 = column("item_p05_a1_l03", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L04 = column("item_p05_a1_l04", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L05 = column("item_p05_a1_l05", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L06 = column("item_p05_a1_l06", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L07 = column("item_p05_a1_l07", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L08 = column("item_p05_a1_l08", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L09 = column("item_p05_a1_l09", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L10 = column("item_p05_a1_l10", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L11 = column("item_p05_a1_l11", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L12 = column("item_p05_a1_l12", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L13 = column("item_p05_a1_l13", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L14 = column("item_p05_a1_l14", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L15 = column("item_p05_a1_l15", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L16 = column("item_p05_a1_l16", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L17 = column("item_p05_a1_l17", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L18 = column("item_p05_a1_l18", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L19 = column("item_p05_a1_l19", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A1L20 = column("item_p05_a1_l20", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L01 = column("item_p05_a2_l01", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L02 = column("item_p05_a2_l02", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L03 = column("item_p05_a2_l03", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L04 = column("item_p05_a2_l04", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L05 = column("item_p05_a2_l05", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L06 = column("item_p05_a2_l06", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L07 = column("item_p05_a2_l07", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L08 = column("item_p05_a2_l08", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L09 = column("item_p05_a2_l09", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L10 = column("item_p05_a2_l10", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L11 = column("item_p05_a2_l11", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L12 = column("item_p05_a2_l12", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L13 = column("item_p05_a2_l13", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L14 = column("item_p05_a2_l14", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L15 = column("item_p05_a2_l15", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L16 = column("item_p05_a2_l16", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L17 = column("item_p05_a2_l17", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L18 = column("item_p05_a2_l18", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L19 = column("item_p05_a2_l19", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A2L20 = column("item_p05_a2_l20", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L01 = column("item_p05_a3_l01", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L02 = column("item_p05_a3_l02", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L03 = column("item_p05_a3_l03", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L04 = column("item_p05_a3_l04", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L05 = column("item_p05_a3_l05", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L06 = column("item_p05_a3_l06", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L07 = column("item_p05_a3_l07", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L08 = column("item_p05_a3_l08", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L09 = column("item_p05_a3_l09", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L10 = column("item_p05_a3_l10", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L11 = column("item_p05_a3_l11", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L12 = column("item_p05_a3_l12", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L13 = column("item_p05_a3_l13", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L14 = column("item_p05_a3_l14", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L15 = column("item_p05_a3_l15", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L16 = column("item_p05_a3_l16", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L17 = column("item_p05_a3_l17", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L18 = column("item_p05_a3_l18", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L19 = column("item_p05_a3_l19", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A3L20 = column("item_p05_a3_l20", JDBCType.VARCHAR);
		public final SqlColumn<String> itemP05A4 = column("item_p05_a4", JDBCType.VARCHAR);
		public final SqlColumn<String> processPrintType = column("process_print_type", JDBCType.VARCHAR);
		public final SqlColumn<String> memo = column("memo", JDBCType.VARCHAR);
		public final SqlColumn<String> messageTypeCode5 = column("message_type_code5", JDBCType.CHAR);
		public final SqlColumn<String> itemP05A1Pattern = column("item_p05_a1_pattern", JDBCType.CHAR);
		public final SqlColumn<String> itemP05A2Pattern = column("item_p05_a2_pattern", JDBCType.CHAR);
		public final SqlColumn<String> itemP05A3Pattern = column("item_p05_a3_pattern", JDBCType.CHAR);

		public Item() {
			super("public.item");
		}
	}
}