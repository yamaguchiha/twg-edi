package jp.or.twg.twg_edi.common.difinition;

import jp.or.twg.twg_edi.common.resource.TwgResourceReader;

/**
 * 受入出荷場フラグ
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public enum OptPlaceDischargeFlg {
	/** 1:納入場所 */					DISCHARGE	("1", 	true),
	/** 2:出荷場所 */					LOADING		("2", 	false),
	;

	/** ID */
	private final String id;

	/** 納入場所か否か(true:納入場所 false：出荷場所) */
	private final boolean isDischarge;

	/**
	 * コンストラクタ
	 *
	 * @param id			ID
	 * @param isDischarge 	納入場所か否か(true:納入場所 false：出荷場所)
	 */
	private OptPlaceDischargeFlg(String id, boolean isDischarge) {
		this.id = id;
		this.isDischarge = isDischarge;
	}


	/**
	 * 受入出荷場フラグ取得
	 *
	 * @param id ID
	 * @return 受入出荷場フラグ
	 */
	public static OptPlaceDischargeFlg getOptPlaceDischargeFlg(String id) {
		for (OptPlaceDischargeFlg type : values()) {
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
	 * 納入場所かどうか
	 *
	 * @return true：納入場所 false:出荷場所
	 */
	public boolean isDischarge() {
		return isDischarge;
	}

	/**
	 * 受入出荷場フラグ名取得
	 *
	 * @return 受入出荷場フラグ名
	 */
	public String getName() {
		return new TwgResourceReader().getString("OptPlaceDischargeFlg.name." + this.name());
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
//		if(OptPlaceDischargeFlg.getOptPlaceDischargeFlg(id) == null) {
//			ret.add("", new Message("kazura.jama.error.validate.illegalargument", new Message("kazura.jama.error.validate.OptPlaceDischargeFlg").toString()));
//		}
//		return ret;
//	}

	/**
	 * 名称からコードを返す
	 *
	 * @param name 種別名
	 * @return ID
	 */
	public static String getOptPlaceDischargeFlgCode(String name){
		for (OptPlaceDischargeFlg type : values()) {
			if (type.name().equals(name)) {
				return type.id;
			}
		}
		return null;
	}
}
