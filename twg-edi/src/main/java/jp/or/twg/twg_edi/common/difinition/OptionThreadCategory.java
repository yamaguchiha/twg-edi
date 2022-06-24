package jp.or.twg.twg_edi.common.difinition;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.or.twg.twg_edi.common.resource.TwgResourceReader;

/**
 * オプションスレッドカテゴリー
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public enum OptionThreadCategory {

	//----------------------------------------------------------------------
	//かんばん納入指示
	//----------------------------------------------------------------------
	/** かんばん納入指示 */
	MakeKanbanOrderService				(true,	MenuCategory.INBOUND,		true),

	/** かんばん増減枚数計算 */
	MakeKanbanAdjustPlanService			(true,	MenuCategory.INBOUND,		true),

	/** かんばん設定枚数計算 */
	MakeKanbanRotationPlanService		(true,	MenuCategory.INBOUND,		false),

	/** かんばん増減情報作成 */
	MakeKanbanAdjustService				(true,	MenuCategory.INBOUND,		false),

	/** かんばん追加納入指示 */
	MakeAddKanbanOrderService			(true,	MenuCategory.INBOUND,		true),

	// 20180223 Yamaguchi
	/** かんばん追加納入指示(出荷数変更なし) */
	MakeAddKanbanOrderServiceCT			(true,	MenuCategory.INBOUND,		true),

	// 20180223 Yamaguchi
	/** かんばん追加納入指示(出荷数変更あり) */
	MakeAddKanbanOrderServiceMT			(true,	MenuCategory.INBOUND,		true),

	/** かんばん納入指示(仕入先工区設定に従う) */
	MakeAddKanbanOrderServiceBefore		(true,	MenuCategory.INBOUND,		true),

	/** かんばん納入指示(後工程) */
	MakeAddKanbanOrderServiceAfter		(true,	MenuCategory.INBOUND,		true),

	/** かんばん納入指示(出荷数変更なし、かつ仕入先工区設定に従う) */
	MakeAddKanbanOrderServiceCtBefore	(true,	MenuCategory.INBOUND,		true),

	/** かんばん納入指示(出荷数変更なし、かつ後工程) */
	MakeAddKanbanOrderServiceCtAfter	(true,	MenuCategory.INBOUND,		true),

	/** かんばん納入指示(出荷数変更あり、かつ仕入先工区設定に従う) */
	MakeAddKanbanOrderServiceMtBefore	(true,	MenuCategory.INBOUND,		true),

	/** かんばん納入指示(出荷数変更あり、かつ後工程) */
	MakeAddKanbanOrderServiceMtAfter	(true,	MenuCategory.INBOUND,		true),

	/** 差換かんばん作成 */
	MakeExchangeKanbanService			(true, MenuCategory.INBOUND,		false),

	/** 予備かんばん作成 */
	MakeReserveKanbanService			(true, MenuCategory.INBOUND,		false),

	/** 簡易かんばん納入指示 */
	MakeSimpleKanbanOrderService		(true,	MenuCategory.INBOUND,		true),


;

	/** ロック管理必須可否(true:必須, false:不要) */
	private final boolean needLockManager;

	/** メニューカテゴリー */
	private final MenuCategory category;

	/** 複数場所での実行可否(true:可能, false:不可) */
	private final boolean multiPlace;

	/**
	 * コンストラクタ
	 *
	 * @param needLockManager ロック管理必須可否
	 * @param category メニューカテゴリー
	 * @param multiPlace 複数場所での実行可否
	 */
	private OptionThreadCategory(boolean needLockManager, MenuCategory category, boolean multiPlace) {
		this.needLockManager = needLockManager;
		this.category = category;
		this.multiPlace = multiPlace;
	}

	/**
	 * スレッドカテゴリー取得
	 * @param threadCategoryId スレッドカテゴリーID
	 * @return スレッドカテゴリー
	 */
	public static OptionThreadCategory getThreadCategory(String threadCategoryId) {
		for (OptionThreadCategory type : values()) {
			if (type.name().equals(threadCategoryId)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * ロック管理必須可否取得
	 *
	 * @return ロック管理必須可否
	 */
	public boolean isNeedLockManager() {
		return needLockManager;
	}

	/**
	 * スレッドカテゴリー名取得
	 *
	 * @return スレッドカテゴリー名
	 */
	public String getName() {
		return new TwgResourceReader().getString(getClass().getSimpleName() + ".name." + name());
	}

	/**
	 * メニューカテゴリー取得
	 *
	 * @return メニューカテゴリー
	 */
	public MenuCategory getMenuCategory() {
		return category;
	}

	/**
	 * 複数場所での実行可否取得
	 *
	 * @return 複数場所での実行可否(true:可能, false:不可)
	 */
	public boolean isMultiPlace() {
		return multiPlace;
	}

	/**
	 * スレッドカテゴリーHTMLリスト取得
	 *
	 * @return スレッドカテゴリーHTMLリスト
	 */
	public static Map<String,String>  getHtmlListItemList() {
		Map<String,String> list = new LinkedHashMap<String,String>();
		for (OptionThreadCategory type : values()) {
			list.put(type.name(), type.getName());
		}
		return list;
	}

	/**
	 * メニューカテゴリー別スレッドカテゴリーID取得
	 *
	 * @param category メニューカテゴリー
	 * @return スレッドカテゴリーID配列
	 */
	public static String[] getThreadCategoryIdByMenuCategory(MenuCategory category) {
		if (category == null) {
			return null;
		}

		List<String> list = new ArrayList<String>();
		for (OptionThreadCategory type : values()) {
			if (category.equals(MenuCategory.TOP) || type.getMenuCategory().equals(category)) {
				list.add(type.name());
			}
		}

		if (list.isEmpty()) {
			return null;
		}
		return list.toArray(new String[0]);
	}


//	/**
//	 * データ検証
//	 *
//	 * @param threadCategoryId スレッドカテゴリーID
//	 * @return エラーメッセージ
//	 */
//	public static Messages validate(String threadCategoryId) {
//		Messages ret = new Messages();
//
//		// 未入力
//		if (CommonDataUtil.isNullOrEmpty(threadCategoryId)) {
//			ret.add("", new Message("kazura.jama.error.validate.unsetting", new Message("kazura.jama.error.validate.ThreadCategory").toString()));
//
//			return ret;
//		}
//
//		// 対象外
//		if (getThreadCategory(threadCategoryId) == null) {
//			ret.add("", new Message("kazura.jama.error.validate.illegalargument", new Message("kazura.jama.error.validate.ThreadCategory").toString()));
//		}
//
//		return ret;
//	}
}