package jp.or.twg.twg_edi.common.difinition;

import java.util.ArrayList;
import java.util.List;

import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.resource.TwgResourceReader;

/**
 * マスタ区分（部品区分）種別
 *
 * @author Yamaguchiha
 */
public enum ItemType {

	// 連携の項目はとりあえずITEM作成のフラグと同じにしてあります
	/** 1:購入 */			BUY					("1",	true,	false,	true,	false,	true,	true,	false),
	/** 2:売り  */				SELL				("2",	false,	true,	false,	false,	false,	false,	false),
	/** 3:支給  */			PROVISION			("3",	false,	true,	false,	false,	true,	false,	true),
	/** 4:受給  */			SUPPLY_ONEROUSLY	("4",	true,	false,	true,	false,	false,	false,	false),
	/** 5:直送支給  */		DIRECT				("5",	true,	true,	true,	true,	true,	true,	true),
	/** 6:製造委託 */			CONSIGNED			("6",	true,	true,	false,	true,	false,	true,	false),
	/** 7:受給品を直送支給 */	SUPPLY_CONSIGNED	("7",	true,	true,	true,	true,	false,	false,	true),
	/** 8:別送支給 */			SEPARATE_SUPPLY		("8",	true,	true,	true,	true,	true,	true,	true),
	;

	/** ID */
	private final String id;

	/** 部品項目を表示・編集するかどうか */
	private final boolean isEditPartEntry;

	/** 製品項目を表示・編集するかどうか */
	private final boolean isEditProductEntry;

	/** 表示項目（true:受入、false:出荷） */
	private final boolean isPartView;

	/** 売り買いの同時登録を行うか(同一品番IDを付与するか)（true:行う、false:行わない） */
	private final boolean isSetIdenticalItemId;

	/** 発注元のみ設定可能か(注文明細番号IDを付与できるか)（true:発注元のみ、false:発注元以外） */
	private final boolean isSetDocRefIdPs;

	/** 部品項目をマスタ連携するかどうか */
	private final boolean isRelationPartEntry;

	/** 製品項目をマスタ連携するかどうか */
	private final boolean isRelationProductEntry;

	/**
	 * コンストラクタ
	 *
	 * @param id ID
	 * @param isEditPartEntry 部品項目を表示・編集するかどうか
	 * @param isEditProductEntry 製品項目を表示・編集するかどうか
	 * @param isPartView 表示項目（true:受入、false:出荷）
	 * @param isSetIdenticalItemId 売り買いの同時登録を行うか（true:行う、false:行わない）
	 * @param isSetDocRefIdPs  発注元のみ設定可能か（true:発注元のみ、false:発注元以外）
	 * @param isRelationPartEntry 部品項目をマスタ連携するかどうか
	 * @param isRelationProductEntry 製品項目をマスタ連携するかどうか
	 */
	private ItemType(String id
			       , boolean isEditPartEntry
			       , boolean isEditProductEntry
			       , boolean isPartView
			       , boolean isSetIdenticalItemId
			       , boolean isSetDocRefIdPs
			       , boolean isRelationPartEntry
			       , boolean isRelationProductEntry) {
		this.id = id;
		this.isEditPartEntry = isEditPartEntry;
		this.isEditProductEntry = isEditProductEntry;
		this.isPartView = isPartView;
		this.isSetIdenticalItemId = isSetIdenticalItemId;
		this.isSetDocRefIdPs = isSetDocRefIdPs;
		this.isRelationPartEntry = isRelationPartEntry;
		this.isRelationProductEntry = isRelationProductEntry;
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
	 * タイトルの取得
	 *
	 * @return タイトル
	 */
	public String getTitle() {
		String resource;
		if (this.isConsigned()) {
			resource = "ItemType.title.consigned";
		} else if (this.isPartView) {
			resource = "ItemType.title.part";
		} else {
			resource = "ItemType.title.product";
		}
		return new TwgResourceReader().getString(resource);
	}

	/**
	 * 種別名称の取得
	 *
	 * @return 種別名称
	 */
	public String getName() {
		return new TwgResourceReader().getString("ItemType.name." + this.name());
	}

	/**
	 * 種別名称（略称）の取得
	 *
	 * @return 種別名称（略称）
	 */
	public String getShortName() {
		return new TwgResourceReader().getString("ItemType.shortName." + this.name());
	}

	/**
	 * マスタ区分が「購入」であるか
	 *
	 * @return true:購入
	 */
	public boolean isBuy() {
		return this.equals(ItemType.BUY);
	}

	/**
	 * マスタ区分が「売り」であるか
	 *
	 * @return true:売り
	 */
	public boolean isSell() {
		return this.equals(ItemType.SELL);
	}

	/**
	 * マスタ区分が「支給」であるか
	 *
	 * @return true:支給
	 */
	public boolean isProvision() {
		return this.equals(ItemType.PROVISION);
	}

	/**
	 * マスタ区分が「受給」であるか
	 *
	 * @return true:受給
	 */
	public boolean isSupplyOnerously() {
		return this.equals(ItemType.SUPPLY_ONEROUSLY);
	}

	/**
	 * マスタ区分が「直送支給」であるか
	 *
	 * @return true:直送支給
	 */
	public boolean isDirect() {
		return this.equals(ItemType.DIRECT);
	}

	/**
	 * マスタ区分が「製造委託」であるか
	 *
	 * @return true:製造委託
	 */
	public boolean isConsigned() {
		return this.equals(ItemType.CONSIGNED);
	}

	/**
	 * マスタ区分が「受給品を直送支給」であるか
	 *
	 * @return true:受給品を直送支給
	 */
	public boolean isSupplyConsigned() {
		return this.equals(ItemType.SUPPLY_CONSIGNED);
	}

	/**
	 * マスタ区分が「別送支給」であるか
	 *
	 * @return true:別送支給
	 */
	public boolean isSeparateSupply() {
		return this.equals(ItemType.SEPARATE_SUPPLY);
	}

	/**
	 * 部品項目を表示・編集するかどうか
	 *
	 * @return true:表示・編集する
	 */
	public boolean isEditPartEntry() {
		return isEditPartEntry;
	}

	/**
	 * 製品項目を表示・編集するかどうか
	 *
	 * @return true:表示・編集する
	 */
	public boolean isEditProductEntry() {
		return isEditProductEntry;
	}

	/**
	 * 表示項目（true:受入、false:出荷）
	 *
	 * @return 表示項目（true:受入、false:出荷）
	 */
	public boolean isPartView() {
		return isPartView;
	}

	/**
	 * 売り買いの同時登録を行うか(同一品番IDを付与するか)（true:行う、false:行わない）
	 *
	 * @return true:可能
	 */
	public boolean isSetIdenticalItemId() {
		return isSetIdenticalItemId;
	}

	/**
	 * 発注元のみ設定可能か(注文明細番号IDを付与できるか)（true:発注元のみ、false:発注元以外）
	 *
	 * @return true:可能
	 */
	public boolean isSetDocRefIdPs() {
		return isSetDocRefIdPs;
	}

	/**
	 * 部品項目をマスタ連携するかどうか
	 *
	 * @return true:連携する
	 */
	public boolean isRelationPartEntry() {
		return isRelationPartEntry;
	}

	/**
	 * 製品項目をマスタ連携するかどうか
	 *
	 * @return true:連携する
	 */
	public boolean isRelationProductEntry() {
		return isRelationProductEntry;
	}

	/**
	 * マスタ区分 種別の取得
	 *
	 * @param id ID
	 * @return 区分マスタ種別
	 */
	public static ItemType getType(String id) {
		for (ItemType type : ItemType.values()) {
			if (type.id.equals(id)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * ラジオボタン用 マスタ区分（部品区分）選択リストの取得
	 *
	 * @param buyable true:受入用、false:出荷用
	 * @return ラジオボタン用 マスタ区分（部品区分）選択リスト
	 */
	public static List<ItemType> getItemTypeRadioList(boolean buyable) {
		List<ItemType> list = new ArrayList<ItemType>();
		for (ItemType type : ItemType.values()) {
			if (type.isPartView() == buyable) {
				list.add(type);
			}
		}
		return list;
	}

	/**
	 * マスタ区分リスト（全項目）の取得
	 *
	 * @return マスタ区分リスト
	 */
	public static List<ItemType> getItemTypeAllList() {
		List<ItemType> list = new ArrayList<ItemType>();
		for (ItemType type : ItemType.values()) {
			list.add(type);
		}
		return list;
	}

	/**
	 * マスタ連携時（受信側）のマスタ区分を取得する
	 *
	 * @param type 連携されたマスタ区分
	 * @param placeBy 発注者
	 * @param placeSe 受注者
	 * @param placeSt 納入先
	 * @param placeSf 出荷元
	 * @param buyable 購買区分(true:相手が製品[売り]を連携、false:相手が部品[買い]を連携)
	 * @return マスタ区分
	 */
	public static ItemType getItemTypeForRelationItem(ItemType type, Place placeBy, Place placeSe, Place placeSt, Place placeSf, boolean buyable) {
		ItemType itemType = type;

		if (buyable) {
			//================================================
			// 部品（相手が製品[売り]を送信）
			//================================================
			if (placeBy.equals(placeSt) || type.isSeparateSupply()) {
				// 発注者と納入先が同じ場合は、「受給」
				itemType = ItemType.SUPPLY_ONEROUSLY;
			} else {
				// 発注者と納入先が違う場合は、「受給品を直送支給」
				itemType = ItemType.SUPPLY_CONSIGNED;
			}
		} else {
			//================================================
			// 製品（相手が部品[買い]を送信）
			//================================================
			if (placeSe.equals(placeSf) || type.isSeparateSupply()) {
				// 受注者と出荷元が同じ場合は、「売り」
				itemType = ItemType.SELL;
			} else {
				// 受注者と出荷元が違う場合は、「製造委託」
				itemType = ItemType.CONSIGNED;
			}
		}
		return itemType;
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
//			ret.add("", new Message("kazura.jama.error.validate.unsetting", SchemaDescriptionUtil.getColumn(Item.class, Item.ITEM_TYPE)));
//			return ret;
//		}
//
//		// 対象外
//		try {
//			getType(id);
//		} catch (KazuraJamaException e) {
//			ret.add("", new Message("kazura.jama.error.validate.illegalargument", SchemaDescriptionUtil.getColumn(Item.class, Item.ITEM_TYPE)));
//		}
//		return ret;
//	}
}
