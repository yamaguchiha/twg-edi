package jp.or.twg.twg_edi.common.difinition;

import java.util.ArrayList;
import java.util.List;

import jp.or.twg.twg_edi.common.resource.TwgResourceReader;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;

/**
 * 情報区分コード内適用業務区分
 *
 * @author yamaguchiha
 */
public enum MessageTypeCode5Type {

	/** ブランク*/				BLANK						(" "), //特殊な状態として スペース、長さ0文字、nullを許す
	/** 0:指定なし*/			UNSPECIFIED					("0"),
	/** 1:量産部品	*/		MASS_PRODUCTION_PARTS		("1"),
	/** 2:生産試作部品*/		PRODUCTION_PROTOTYPE_PARTS	("2"),
	/** 3:KD部品*/			KD_PARTS					("3"),
	/** 4:補修品・用品*/		REPAIR_PRODUCTS_AND_SUPPLIES("4"),
	/** 5:直接材料	*/		DIRECT_MATERIAL				("5"),
	/** 6:間接材／副資材*/	INDIRECT_OR_SECONDARY_MATERIAL("6"),
	/** 7:設備*/				FACILITY					("7")
	;

	/** 情報区分コード内適用業務区分id */
	private String id;

	/**
	 * コンストラクタ
	 *
	 * @param id 情報区分コード内適用業務区分id
	 */
	private MessageTypeCode5Type(String id) {
		this.id  = id;
	}
	/**
	 * 情報区分コード内適用業務区分の取得
	 *
	 * @param id ID
	 * @return 情報区分コード内適用業務区分
	 */
	public static MessageTypeCode5Type getType(String id) {
		if(CommonDataUtil.isNullOrEmpty(id)){
			return MessageTypeCode5Type.BLANK;//存在しない場合はブランクとして扱う
		}
		for (MessageTypeCode5Type type : MessageTypeCode5Type.values()) {
			if (type.id.equals(id)) {
				return type;
			}
		}
		return null;
//		throw new KazuraJamaException("予期せぬ情報区分コード内適用業務区分");
	}
	/**
	 * 情報区分コード内適用業務区分名の取得
	 *
	 * @return 情報区分コード内適用業務区分名
	 */
	public String getName() {
		return new TwgResourceReader().getString("MessageTypeCode5Type.name." + this.name());
	}

	/**
	 * 情報区分コード内適用業務区分短縮名の取得
	 *
	 * @return 情報区分コード内適用業務区分短縮名
	 */
	public String getShortName() {
		return new TwgResourceReader().getString("MessageTypeCode5Type.shortName." + this.name());
	}

	/**
	 * 情報区分コード内適用業務区分IDの取得
	 *
	 * @return 情報区分コード内適用業務区分ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * 情報区分コード内適用業務区分リスト（全項目）の取得
	 *
	 * @return 情報区分コード内適用業務区分リスト
	 */
	public static List<MessageTypeCode5Type> getMessageTypeCode5AllList() {
		List<MessageTypeCode5Type> list = new ArrayList<MessageTypeCode5Type>();
		for (MessageTypeCode5Type type : MessageTypeCode5Type.values()) {
			list.add(type);
		}
		return list;
	}

	/**
	 * 情報区分コード内適用業務区分リスト（ブランク以外）の取得
	 *
	 * @return 情報区分コード内適用業務区分リスト
	 */
	public static List<MessageTypeCode5Type> getMessageTypeCode5List() {
		List<MessageTypeCode5Type> list = new ArrayList<MessageTypeCode5Type>();
		for (MessageTypeCode5Type type : MessageTypeCode5Type.values()) {
			if(type.equals(BLANK)){
				continue;
			}
			list.add(type);
		}
		return list;
	}

//	/**
//	 * データ検証
//	 * ※外部I/Fダウンロードの項目チェックに使用
//	 *
//	 * @param id ID
//	 * @return エラーメッセージ
//	 */
//	public static Messages validateForExternalIF(String id) {
//		Messages ret = new Messages();
//
//		// 未入力
//		if (CommonDataUtil.isNullOrEmpty(id)) {
//			ret.add("", new Message("kazura.jama.error.validate.unsetting", SchemaDescriptionUtil.getColumn(Item.class, Item.MESSAGE_TYPE_CODE5)));
//			return ret;
//		}
//
//		// 対象外
//		try {
//			getType(id);
//		} catch (KazuraJamaException e) {
//			ret.add("", new Message("kazura.jama.error.validate.illegalargument", SchemaDescriptionUtil.getColumn(Item.class, Item.MESSAGE_TYPE_CODE5)));
//		}
//		return ret;
//	}

	/**
	 * ブランクかどうかチェック
	 * @param id ID
	 * @return
	 */
	public static boolean isBlank(String id) {
		return CommonDataUtil.isNullOrEmpty(id) || MessageTypeCode5Type.BLANK.getId().equals(id);
	}

}
