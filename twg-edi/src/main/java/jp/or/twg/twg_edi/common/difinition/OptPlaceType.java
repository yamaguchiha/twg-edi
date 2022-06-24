package jp.or.twg.twg_edi.common.difinition;

import jp.or.twg.twg_edi.common.resource.TwgResourceReader;

/**
 *  受入出荷場タイプ
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public enum OptPlaceType {
	/** 0:通常 */					NORMAL	("0"),
	/** 1:全て */					ALL		("1"),
	/** 2:使用不可 */				DISABLE	("2"),
	;

	/** ID */
	private final String id;

	/**
	 * コンストラクタ
	 *
	 * @param id			ID
	 */
	private OptPlaceType(String id) {
		this.id = id;
	}

	/**
	 * 受入出荷場タイプ取得
	 *
	 * @param id ID
	 * @return 受入出荷場タイプ
	 */
	public static OptPlaceType getOptPlaceType(String id) {
		for (OptPlaceType type : values()) {
			if (type.getId().equals(id)) {
				return type;
			}
		}
		return null;
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
	 * 受入出荷場タイプ名取得
	 *
	 * @return 受入出荷場タイプ名
	 */
	public String getName() {
		return new TwgResourceReader().getString("OptPlaceType.name." + this.name());
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
//		if(CommonDataUtil.isNullOrEmpty(id)) {
//			// 正常
//			return ret;
//		}
//
//		// 対象外
//		if(OptPlaceType.getOptPlaceType(id) == null) {
//			ret.add("", new Message("kazura.jama.error.validate.illegalargument", new Message("kazura.jama.error.validate.OptPlaceType").toString()));
//		}
//		return ret;
//	}
}
