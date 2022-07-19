package jp.or.twg.twg_edi.common.difinition;

import java.util.ArrayList;
import java.util.List;

import jp.or.twg.twg_edi.common.TwgException;
import jp.or.twg.twg_edi.common.resource.TwgResourceReader;

/**
 * 素材／通常品区分
 *
 * @author g-wise
 * @version 1.0
 */
public enum MaterialsType {

	/** 0:通常品 */				CommonType					("0"),
	/** 1:素材   */				MaterialType				("1"),
	;

	/** ID */
	private final String id;

	/**
	 * コンストラクタ
	 *
	 * @param id ID
	 */
	private MaterialsType(String id) {
		this.id = id;
	}

	/**
	 * ID取得
	 *
	 * @return ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * 種別名称の取得
	 *
	 * @return 種別名称
	 */
	public String getName() {
		return new TwgResourceReader().getString("MaterialsType.name." + this.name());
	}

	/**
	 * 種別名称（略称）の取得
	 *
	 * @return 種別名称（略称）
	 */
	public String getShortName() {
		return new TwgResourceReader().getString("MaterialsType.shortName." + this.name());
	}


	/**
	 * 素材／通常品区分 種別の取得
	 *
	 * @param id ID
	 * @return 素材／通常品区分
	 */
	public static MaterialsType getType(String id) {
		for (MaterialsType type : MaterialsType.values()) {
			if (type.id.equals(id)) {
				return type;
			}
		}
		throw new TwgException("予期せぬ素材／通常品区分種別");
	}

	/**
	 * 素材／通常品区分リストの取得
	 *
	 * @return 素材／通常品区分リスト
	 */
	public static List<MaterialsType> getMaterialsTypeList() {
		List<MaterialsType> list = new ArrayList<MaterialsType>();
		for (MaterialsType type : MaterialsType.values()) {
			list.add(type);
		}
		return list;
	}

//	/**
//	 * データ検証
//	 *
//	 * @param id ID
//	 * @return エラーメッセージ
//	 */
//	public static Messages validate(String id) {
//		Messages ret = new Messages();
//
//		// 未入力
//		if (CommonDataUtil.isNullOrEmpty(id)) {
//			ret.add("", new Message("kazura.jama.error.validate.unsetting", SchemaDescriptionUtil.getColumn(Item.class, Item.MATERIALS_TYPE)));
//			return ret;
//		}
//
//		// 対象外
//		try {
//			getType(id);
//		} catch (KazuraJamaException e) {
//			ret.add("", new Message("kazura.jama.error.validate.illegalargument", SchemaDescriptionUtil.getColumn(Item.class, Item.MATERIALS_TYPE)));
//		}
//		return ret;
//	}
}
