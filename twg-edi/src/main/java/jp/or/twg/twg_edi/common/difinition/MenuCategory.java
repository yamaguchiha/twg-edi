package jp.or.twg.twg_edi.common.difinition;

/**
 * メニューカテゴリー
 *
 * @author Yamaguchi
 * @version 1.0
 */
public enum MenuCategory {

	/** ＴＯＰ */		TOP,
	/** 納入管理 */		INBOUND,
	/** 出荷管理 */		OUTBOUND,
	/** 支給管理 */		SUPPLY,
	/** 内示管理 */		DELFOR,
	/** 実績集計 */		SUMMARY,
	/** マスタ管理 */	MASTER,
	/** システム */		SYSTEM,
	/** オプション */	OPTION,
	;

	/**
	 * メニューカテゴリー取得
	 *
	 * @param categoryName メニューカテゴリー名
	 * @return メニューカテゴリー
	 */
	public static MenuCategory getMenuCategory(String categoryName) {
		for (MenuCategory type : values()) {
			if (type.name().equals(categoryName)) {
				return type;
			}
		}
		throw new IllegalArgumentException("予期せぬメニューカテゴリー");
	}

}
