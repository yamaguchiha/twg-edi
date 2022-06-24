package jp.or.twg.twg_edi.common.entity;

import java.util.Date;

import javax.annotation.Generated;

import lombok.Getter;
import lombok.Setter;

public class Item {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.oid")
	private Long oid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.changed")
	private String changed;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.related")
	private String related;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.related_date")
	private Date relatedDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.item_id_in")
	private String itemIdIn;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.item_id_pd")
	private String itemIdPd;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.item_8")
	private String item8;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.item_e18")
	private String itemE18;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.identical_item_id")
	private Long identicalItemId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.valid_start_string_date")
	private String validStartStringDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.valid_end_string_date")
	private String validEndStringDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_by_oid")
	private Long placeByOid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_se_oid")
	private Long placeSeOid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_ob_oid")
	private Long placeObOid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_sf_oid")
	private Long placeSfOid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_st_oid")
	private Long placeStOid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_of_loading_id")
	private String placeOfLoadingId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_of_loading_name")
	private String placeOfLoadingName;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_of_discharge_id")
	private String placeOfDischargeId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.item_e04")
	private String itemE04;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.per_package_quantity")
	private Long perPackageQuantity;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.manufacturing_department_id")
	private String manufacturingDepartmentId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.package_type_description_code")
	private String packageTypeDescriptionCode;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.quantity_unit_code")
	private String quantityUnitCode;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.buyable")
	private String buyable;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.supply_type")
	private String supplyType;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.item_type")
	private String itemType;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.through_type")
	private String throughType;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.materials_type")
	private String materialsType;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.separate_supply_type")
	private String separateSupplyType;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_m03")
	private String itemM03;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_id_cl")
	private String itemIdCl;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_m01_desc")
	private String itemM01Desc;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p04_detail")
	private String itemP04Detail;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l01")
	private String itemP05A1L01;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l02")
	private String itemP05A1L02;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l03")
	private String itemP05A1L03;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l04")
	private String itemP05A1L04;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l05")
	private String itemP05A1L05;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l06")
	private String itemP05A1L06;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l07")
	private String itemP05A1L07;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l08")
	private String itemP05A1L08;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l09")
	private String itemP05A1L09;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l10")
	private String itemP05A1L10;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l11")
	private String itemP05A1L11;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l12")
	private String itemP05A1L12;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l13")
	private String itemP05A1L13;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l14")
	private String itemP05A1L14;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l15")
	private String itemP05A1L15;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l16")
	private String itemP05A1L16;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l17")
	private String itemP05A1L17;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l18")
	private String itemP05A1L18;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l19")
	private String itemP05A1L19;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l20")
	private String itemP05A1L20;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l01")
	private String itemP05A2L01;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l02")
	private String itemP05A2L02;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l03")
	private String itemP05A2L03;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l04")
	private String itemP05A2L04;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l05")
	private String itemP05A2L05;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l06")
	private String itemP05A2L06;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l07")
	private String itemP05A2L07;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l08")
	private String itemP05A2L08;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l09")
	private String itemP05A2L09;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l10")
	private String itemP05A2L10;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l11")
	private String itemP05A2L11;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l12")
	private String itemP05A2L12;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l13")
	private String itemP05A2L13;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l14")
	private String itemP05A2L14;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l15")
	private String itemP05A2L15;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l16")
	private String itemP05A2L16;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l17")
	private String itemP05A2L17;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l18")
	private String itemP05A2L18;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l19")
	private String itemP05A2L19;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l20")
	private String itemP05A2L20;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l01")
	private String itemP05A3L01;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l02")
	private String itemP05A3L02;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l03")
	private String itemP05A3L03;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l04")
	private String itemP05A3L04;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l05")
	private String itemP05A3L05;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l06")
	private String itemP05A3L06;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l07")
	private String itemP05A3L07;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l08")
	private String itemP05A3L08;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l09")
	private String itemP05A3L09;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l10")
	private String itemP05A3L10;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l11")
	private String itemP05A3L11;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l12")
	private String itemP05A3L12;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l13")
	private String itemP05A3L13;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l14")
	private String itemP05A3L14;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l15")
	private String itemP05A3L15;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l16")
	private String itemP05A3L16;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l17")
	private String itemP05A3L17;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l18")
	private String itemP05A3L18;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l19")
	private String itemP05A3L19;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l20")
	private String itemP05A3L20;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a4")
	private String itemP05A4;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.process_print_type")
	private String processPrintType;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.memo")
	private String memo;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.message_type_code5")
	private String messageTypeCode5;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_pattern")
	private String itemP05A1Pattern;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a2_pattern")
	private String itemP05A2Pattern;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_pattern")
	private String itemP05A3Pattern;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.changed")
	public String getChanged() {
		return changed;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.changed")
	public void setChanged(String changed) {
		this.changed = changed;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.related")
	public String getRelated() {
		return related;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.related")
	public void setRelated(String related) {
		this.related = related;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.related_date")
	public Date getRelatedDate() {
		return relatedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.related_date")
	public void setRelatedDate(Date relatedDate) {
		this.relatedDate = relatedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.item_id_in")
	public String getItemIdIn() {
		return itemIdIn;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.item_id_in")
	public void setItemIdIn(String itemIdIn) {
		this.itemIdIn = itemIdIn;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.item_id_pd")
	public String getItemIdPd() {
		return itemIdPd;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.item_id_pd")
	public void setItemIdPd(String itemIdPd) {
		this.itemIdPd = itemIdPd;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.item_8")
	public String getItem8() {
		return item8;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4763626+09:00", comments = "Source field: public.item.item_8")
	public void setItem8(String item8) {
		this.item8 = item8;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.item_e18")
	public String getItemE18() {
		return itemE18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.item_e18")
	public void setItemE18(String itemE18) {
		this.itemE18 = itemE18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.identical_item_id")
	public Long getIdenticalItemId() {
		return identicalItemId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.identical_item_id")
	public void setIdenticalItemId(Long identicalItemId) {
		this.identicalItemId = identicalItemId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.valid_start_string_date")
	public String getValidStartStringDate() {
		return validStartStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.valid_start_string_date")
	public void setValidStartStringDate(String validStartStringDate) {
		this.validStartStringDate = validStartStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.valid_end_string_date")
	public String getValidEndStringDate() {
		return validEndStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.valid_end_string_date")
	public void setValidEndStringDate(String validEndStringDate) {
		this.validEndStringDate = validEndStringDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_by_oid")
	public Long getPlaceByOid() {
		return placeByOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_by_oid")
	public void setPlaceByOid(Long placeByOid) {
		this.placeByOid = placeByOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_se_oid")
	public Long getPlaceSeOid() {
		return placeSeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_se_oid")
	public void setPlaceSeOid(Long placeSeOid) {
		this.placeSeOid = placeSeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_ob_oid")
	public Long getPlaceObOid() {
		return placeObOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_ob_oid")
	public void setPlaceObOid(Long placeObOid) {
		this.placeObOid = placeObOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_sf_oid")
	public Long getPlaceSfOid() {
		return placeSfOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_sf_oid")
	public void setPlaceSfOid(Long placeSfOid) {
		this.placeSfOid = placeSfOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_st_oid")
	public Long getPlaceStOid() {
		return placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_st_oid")
	public void setPlaceStOid(Long placeStOid) {
		this.placeStOid = placeStOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_of_loading_id")
	public String getPlaceOfLoadingId() {
		return placeOfLoadingId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_of_loading_id")
	public void setPlaceOfLoadingId(String placeOfLoadingId) {
		this.placeOfLoadingId = placeOfLoadingId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_of_loading_name")
	public String getPlaceOfLoadingName() {
		return placeOfLoadingName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_of_loading_name")
	public void setPlaceOfLoadingName(String placeOfLoadingName) {
		this.placeOfLoadingName = placeOfLoadingName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_of_discharge_id")
	public String getPlaceOfDischargeId() {
		return placeOfDischargeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4773604+09:00", comments = "Source field: public.item.place_of_discharge_id")
	public void setPlaceOfDischargeId(String placeOfDischargeId) {
		this.placeOfDischargeId = placeOfDischargeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.item_e04")
	public String getItemE04() {
		return itemE04;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.item_e04")
	public void setItemE04(String itemE04) {
		this.itemE04 = itemE04;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.per_package_quantity")
	public Long getPerPackageQuantity() {
		return perPackageQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.per_package_quantity")
	public void setPerPackageQuantity(Long perPackageQuantity) {
		this.perPackageQuantity = perPackageQuantity;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.manufacturing_department_id")
	public String getManufacturingDepartmentId() {
		return manufacturingDepartmentId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.manufacturing_department_id")
	public void setManufacturingDepartmentId(String manufacturingDepartmentId) {
		this.manufacturingDepartmentId = manufacturingDepartmentId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.package_type_description_code")
	public String getPackageTypeDescriptionCode() {
		return packageTypeDescriptionCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.package_type_description_code")
	public void setPackageTypeDescriptionCode(String packageTypeDescriptionCode) {
		this.packageTypeDescriptionCode = packageTypeDescriptionCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.quantity_unit_code")
	public String getQuantityUnitCode() {
		return quantityUnitCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.quantity_unit_code")
	public void setQuantityUnitCode(String quantityUnitCode) {
		this.quantityUnitCode = quantityUnitCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.buyable")
	public String getBuyable() {
		return buyable;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.buyable")
	public void setBuyable(String buyable) {
		this.buyable = buyable;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.supply_type")
	public String getSupplyType() {
		return supplyType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.supply_type")
	public void setSupplyType(String supplyType) {
		this.supplyType = supplyType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.item_type")
	public String getItemType() {
		return itemType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.item_type")
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4783591+09:00", comments = "Source field: public.item.through_type")
	public String getThroughType() {
		return throughType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.through_type")
	public void setThroughType(String throughType) {
		this.throughType = throughType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.materials_type")
	public String getMaterialsType() {
		return materialsType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.materials_type")
	public void setMaterialsType(String materialsType) {
		this.materialsType = materialsType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.separate_supply_type")
	public String getSeparateSupplyType() {
		return separateSupplyType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.separate_supply_type")
	public void setSeparateSupplyType(String separateSupplyType) {
		this.separateSupplyType = separateSupplyType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_m03")
	public String getItemM03() {
		return itemM03;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_m03")
	public void setItemM03(String itemM03) {
		this.itemM03 = itemM03;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_id_cl")
	public String getItemIdCl() {
		return itemIdCl;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_id_cl")
	public void setItemIdCl(String itemIdCl) {
		this.itemIdCl = itemIdCl;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_m01_desc")
	public String getItemM01Desc() {
		return itemM01Desc;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_m01_desc")
	public void setItemM01Desc(String itemM01Desc) {
		this.itemM01Desc = itemM01Desc;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p04_detail")
	public String getItemP04Detail() {
		return itemP04Detail;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p04_detail")
	public void setItemP04Detail(String itemP04Detail) {
		this.itemP04Detail = itemP04Detail;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l01")
	public String getItemP05A1L01() {
		return itemP05A1L01;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l01")
	public void setItemP05A1L01(String itemP05A1L01) {
		this.itemP05A1L01 = itemP05A1L01;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l02")
	public String getItemP05A1L02() {
		return itemP05A1L02;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l02")
	public void setItemP05A1L02(String itemP05A1L02) {
		this.itemP05A1L02 = itemP05A1L02;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l03")
	public String getItemP05A1L03() {
		return itemP05A1L03;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l03")
	public void setItemP05A1L03(String itemP05A1L03) {
		this.itemP05A1L03 = itemP05A1L03;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l04")
	public String getItemP05A1L04() {
		return itemP05A1L04;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l04")
	public void setItemP05A1L04(String itemP05A1L04) {
		this.itemP05A1L04 = itemP05A1L04;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l05")
	public String getItemP05A1L05() {
		return itemP05A1L05;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l05")
	public void setItemP05A1L05(String itemP05A1L05) {
		this.itemP05A1L05 = itemP05A1L05;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l06")
	public String getItemP05A1L06() {
		return itemP05A1L06;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l06")
	public void setItemP05A1L06(String itemP05A1L06) {
		this.itemP05A1L06 = itemP05A1L06;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l07")
	public String getItemP05A1L07() {
		return itemP05A1L07;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l07")
	public void setItemP05A1L07(String itemP05A1L07) {
		this.itemP05A1L07 = itemP05A1L07;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4793621+09:00", comments = "Source field: public.item.item_p05_a1_l08")
	public String getItemP05A1L08() {
		return itemP05A1L08;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l08")
	public void setItemP05A1L08(String itemP05A1L08) {
		this.itemP05A1L08 = itemP05A1L08;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l09")
	public String getItemP05A1L09() {
		return itemP05A1L09;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l09")
	public void setItemP05A1L09(String itemP05A1L09) {
		this.itemP05A1L09 = itemP05A1L09;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l10")
	public String getItemP05A1L10() {
		return itemP05A1L10;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l10")
	public void setItemP05A1L10(String itemP05A1L10) {
		this.itemP05A1L10 = itemP05A1L10;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l11")
	public String getItemP05A1L11() {
		return itemP05A1L11;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l11")
	public void setItemP05A1L11(String itemP05A1L11) {
		this.itemP05A1L11 = itemP05A1L11;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l12")
	public String getItemP05A1L12() {
		return itemP05A1L12;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l12")
	public void setItemP05A1L12(String itemP05A1L12) {
		this.itemP05A1L12 = itemP05A1L12;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l13")
	public String getItemP05A1L13() {
		return itemP05A1L13;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l13")
	public void setItemP05A1L13(String itemP05A1L13) {
		this.itemP05A1L13 = itemP05A1L13;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l14")
	public String getItemP05A1L14() {
		return itemP05A1L14;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l14")
	public void setItemP05A1L14(String itemP05A1L14) {
		this.itemP05A1L14 = itemP05A1L14;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l15")
	public String getItemP05A1L15() {
		return itemP05A1L15;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l15")
	public void setItemP05A1L15(String itemP05A1L15) {
		this.itemP05A1L15 = itemP05A1L15;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l16")
	public String getItemP05A1L16() {
		return itemP05A1L16;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l16")
	public void setItemP05A1L16(String itemP05A1L16) {
		this.itemP05A1L16 = itemP05A1L16;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l17")
	public String getItemP05A1L17() {
		return itemP05A1L17;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l17")
	public void setItemP05A1L17(String itemP05A1L17) {
		this.itemP05A1L17 = itemP05A1L17;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l18")
	public String getItemP05A1L18() {
		return itemP05A1L18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l18")
	public void setItemP05A1L18(String itemP05A1L18) {
		this.itemP05A1L18 = itemP05A1L18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l19")
	public String getItemP05A1L19() {
		return itemP05A1L19;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l19")
	public void setItemP05A1L19(String itemP05A1L19) {
		this.itemP05A1L19 = itemP05A1L19;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l20")
	public String getItemP05A1L20() {
		return itemP05A1L20;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a1_l20")
	public void setItemP05A1L20(String itemP05A1L20) {
		this.itemP05A1L20 = itemP05A1L20;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l01")
	public String getItemP05A2L01() {
		return itemP05A2L01;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l01")
	public void setItemP05A2L01(String itemP05A2L01) {
		this.itemP05A2L01 = itemP05A2L01;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l02")
	public String getItemP05A2L02() {
		return itemP05A2L02;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l02")
	public void setItemP05A2L02(String itemP05A2L02) {
		this.itemP05A2L02 = itemP05A2L02;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l03")
	public String getItemP05A2L03() {
		return itemP05A2L03;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l03")
	public void setItemP05A2L03(String itemP05A2L03) {
		this.itemP05A2L03 = itemP05A2L03;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l04")
	public String getItemP05A2L04() {
		return itemP05A2L04;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l04")
	public void setItemP05A2L04(String itemP05A2L04) {
		this.itemP05A2L04 = itemP05A2L04;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l05")
	public String getItemP05A2L05() {
		return itemP05A2L05;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l05")
	public void setItemP05A2L05(String itemP05A2L05) {
		this.itemP05A2L05 = itemP05A2L05;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4803523+09:00", comments = "Source field: public.item.item_p05_a2_l06")
	public String getItemP05A2L06() {
		return itemP05A2L06;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l06")
	public void setItemP05A2L06(String itemP05A2L06) {
		this.itemP05A2L06 = itemP05A2L06;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l07")
	public String getItemP05A2L07() {
		return itemP05A2L07;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l07")
	public void setItemP05A2L07(String itemP05A2L07) {
		this.itemP05A2L07 = itemP05A2L07;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l08")
	public String getItemP05A2L08() {
		return itemP05A2L08;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l08")
	public void setItemP05A2L08(String itemP05A2L08) {
		this.itemP05A2L08 = itemP05A2L08;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l09")
	public String getItemP05A2L09() {
		return itemP05A2L09;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l09")
	public void setItemP05A2L09(String itemP05A2L09) {
		this.itemP05A2L09 = itemP05A2L09;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l10")
	public String getItemP05A2L10() {
		return itemP05A2L10;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l10")
	public void setItemP05A2L10(String itemP05A2L10) {
		this.itemP05A2L10 = itemP05A2L10;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l11")
	public String getItemP05A2L11() {
		return itemP05A2L11;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l11")
	public void setItemP05A2L11(String itemP05A2L11) {
		this.itemP05A2L11 = itemP05A2L11;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l12")
	public String getItemP05A2L12() {
		return itemP05A2L12;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l12")
	public void setItemP05A2L12(String itemP05A2L12) {
		this.itemP05A2L12 = itemP05A2L12;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l13")
	public String getItemP05A2L13() {
		return itemP05A2L13;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l13")
	public void setItemP05A2L13(String itemP05A2L13) {
		this.itemP05A2L13 = itemP05A2L13;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l14")
	public String getItemP05A2L14() {
		return itemP05A2L14;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l14")
	public void setItemP05A2L14(String itemP05A2L14) {
		this.itemP05A2L14 = itemP05A2L14;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l15")
	public String getItemP05A2L15() {
		return itemP05A2L15;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l15")
	public void setItemP05A2L15(String itemP05A2L15) {
		this.itemP05A2L15 = itemP05A2L15;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l16")
	public String getItemP05A2L16() {
		return itemP05A2L16;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l16")
	public void setItemP05A2L16(String itemP05A2L16) {
		this.itemP05A2L16 = itemP05A2L16;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l17")
	public String getItemP05A2L17() {
		return itemP05A2L17;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l17")
	public void setItemP05A2L17(String itemP05A2L17) {
		this.itemP05A2L17 = itemP05A2L17;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l18")
	public String getItemP05A2L18() {
		return itemP05A2L18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l18")
	public void setItemP05A2L18(String itemP05A2L18) {
		this.itemP05A2L18 = itemP05A2L18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l19")
	public String getItemP05A2L19() {
		return itemP05A2L19;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l19")
	public void setItemP05A2L19(String itemP05A2L19) {
		this.itemP05A2L19 = itemP05A2L19;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l20")
	public String getItemP05A2L20() {
		return itemP05A2L20;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a2_l20")
	public void setItemP05A2L20(String itemP05A2L20) {
		this.itemP05A2L20 = itemP05A2L20;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l01")
	public String getItemP05A3L01() {
		return itemP05A3L01;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l01")
	public void setItemP05A3L01(String itemP05A3L01) {
		this.itemP05A3L01 = itemP05A3L01;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l02")
	public String getItemP05A3L02() {
		return itemP05A3L02;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l02")
	public void setItemP05A3L02(String itemP05A3L02) {
		this.itemP05A3L02 = itemP05A3L02;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l03")
	public String getItemP05A3L03() {
		return itemP05A3L03;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l03")
	public void setItemP05A3L03(String itemP05A3L03) {
		this.itemP05A3L03 = itemP05A3L03;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l04")
	public String getItemP05A3L04() {
		return itemP05A3L04;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l04")
	public void setItemP05A3L04(String itemP05A3L04) {
		this.itemP05A3L04 = itemP05A3L04;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l05")
	public String getItemP05A3L05() {
		return itemP05A3L05;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l05")
	public void setItemP05A3L05(String itemP05A3L05) {
		this.itemP05A3L05 = itemP05A3L05;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l06")
	public String getItemP05A3L06() {
		return itemP05A3L06;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l06")
	public void setItemP05A3L06(String itemP05A3L06) {
		this.itemP05A3L06 = itemP05A3L06;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l07")
	public String getItemP05A3L07() {
		return itemP05A3L07;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l07")
	public void setItemP05A3L07(String itemP05A3L07) {
		this.itemP05A3L07 = itemP05A3L07;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l08")
	public String getItemP05A3L08() {
		return itemP05A3L08;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l08")
	public void setItemP05A3L08(String itemP05A3L08) {
		this.itemP05A3L08 = itemP05A3L08;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l09")
	public String getItemP05A3L09() {
		return itemP05A3L09;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l09")
	public void setItemP05A3L09(String itemP05A3L09) {
		this.itemP05A3L09 = itemP05A3L09;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l10")
	public String getItemP05A3L10() {
		return itemP05A3L10;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l10")
	public void setItemP05A3L10(String itemP05A3L10) {
		this.itemP05A3L10 = itemP05A3L10;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l11")
	public String getItemP05A3L11() {
		return itemP05A3L11;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l11")
	public void setItemP05A3L11(String itemP05A3L11) {
		this.itemP05A3L11 = itemP05A3L11;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l12")
	public String getItemP05A3L12() {
		return itemP05A3L12;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l12")
	public void setItemP05A3L12(String itemP05A3L12) {
		this.itemP05A3L12 = itemP05A3L12;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l13")
	public String getItemP05A3L13() {
		return itemP05A3L13;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l13")
	public void setItemP05A3L13(String itemP05A3L13) {
		this.itemP05A3L13 = itemP05A3L13;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l14")
	public String getItemP05A3L14() {
		return itemP05A3L14;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.481349+09:00", comments = "Source field: public.item.item_p05_a3_l14")
	public void setItemP05A3L14(String itemP05A3L14) {
		this.itemP05A3L14 = itemP05A3L14;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l15")
	public String getItemP05A3L15() {
		return itemP05A3L15;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l15")
	public void setItemP05A3L15(String itemP05A3L15) {
		this.itemP05A3L15 = itemP05A3L15;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l16")
	public String getItemP05A3L16() {
		return itemP05A3L16;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l16")
	public void setItemP05A3L16(String itemP05A3L16) {
		this.itemP05A3L16 = itemP05A3L16;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l17")
	public String getItemP05A3L17() {
		return itemP05A3L17;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l17")
	public void setItemP05A3L17(String itemP05A3L17) {
		this.itemP05A3L17 = itemP05A3L17;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l18")
	public String getItemP05A3L18() {
		return itemP05A3L18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l18")
	public void setItemP05A3L18(String itemP05A3L18) {
		this.itemP05A3L18 = itemP05A3L18;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l19")
	public String getItemP05A3L19() {
		return itemP05A3L19;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l19")
	public void setItemP05A3L19(String itemP05A3L19) {
		this.itemP05A3L19 = itemP05A3L19;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l20")
	public String getItemP05A3L20() {
		return itemP05A3L20;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_l20")
	public void setItemP05A3L20(String itemP05A3L20) {
		this.itemP05A3L20 = itemP05A3L20;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a4")
	public String getItemP05A4() {
		return itemP05A4;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a4")
	public void setItemP05A4(String itemP05A4) {
		this.itemP05A4 = itemP05A4;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.process_print_type")
	public String getProcessPrintType() {
		return processPrintType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.process_print_type")
	public void setProcessPrintType(String processPrintType) {
		this.processPrintType = processPrintType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.memo")
	public String getMemo() {
		return memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.memo")
	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.message_type_code5")
	public String getMessageTypeCode5() {
		return messageTypeCode5;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.message_type_code5")
	public void setMessageTypeCode5(String messageTypeCode5) {
		this.messageTypeCode5 = messageTypeCode5;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_pattern")
	public String getItemP05A1Pattern() {
		return itemP05A1Pattern;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a1_pattern")
	public void setItemP05A1Pattern(String itemP05A1Pattern) {
		this.itemP05A1Pattern = itemP05A1Pattern;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a2_pattern")
	public String getItemP05A2Pattern() {
		return itemP05A2Pattern;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a2_pattern")
	public void setItemP05A2Pattern(String itemP05A2Pattern) {
		this.itemP05A2Pattern = itemP05A2Pattern;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_pattern")
	public String getItemP05A3Pattern() {
		return itemP05A3Pattern;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4823468+09:00", comments = "Source field: public.item.item_p05_a3_pattern")
	public void setItemP05A3Pattern(String itemP05A3Pattern) {
		this.itemP05A3Pattern = itemP05A3Pattern;
	}

	/**
	 * 企業
	 */
	@Getter
	@Setter
	private Party party;

	/**
	 * 企業設定
	 */
	@Getter
	@Setter
	private PartySetting partySetting;

	/**
	 * 事業所
	 */
	@Getter
	@Setter
	private Place place;

}