package jp.or.twg.twg_edi.common.difinition;

import java.util.ArrayList;
import java.util.List;

import jp.or.twg.twg_edi.common.resource.TwgResourceReader;

/**
 * システムパラメーターカテゴリー種別
 *
 * @author Yamaguchiha
 */
public enum SystemConfigCategoryType {

	/** システム（非表示） */
	SYSTEM(true),

	/** 一覧設定 */
	LIST(false),

	/** 帳票設定 */
	REPORT(false),

	/** 出力設定 */
	OUTPUT(false),

	/** 発注設定 */
	INBOUND(false),

	/** 外部I/F設定 */
	EXTERNAL(false),

	;

	/** システムユーザーの場合のみ表示 */
	private final boolean onlySystemUserDisplays;

	/** リソースキー */
	static interface RESOURCE_KEY {
		/** 名称 */				public static final String NAME = "name";
	}

	/**
	 * コンストラクタ
	 *
	 * @param onlySystemUserDisplays true:システムユーザーの場合のみ表示
	 */
	private SystemConfigCategoryType(boolean onlySystemUserDisplays) {
		this.onlySystemUserDisplays = onlySystemUserDisplays;
	}


	/**
	 * システムユーザーの場合のみ表示
	 *
	 * @return true:システムユーザーの場合のみ表示
	 */
	public boolean isOnlySystemUserDisplays() {
		return onlySystemUserDisplays;
	}

	/**
	 * システムパラメーターカテゴリー種別名取得
	 *
	 * @return システムパラメーターカテゴリー種別名
	 */
	public String getTypeName() {
		return new TwgResourceReader().getString(SystemConfigCategoryType.class.getSimpleName() + "." + name() + "." + RESOURCE_KEY.NAME);
	}

	/**
	 * システムパラメーターカテゴリー種別取得
	 *
	 * @param name ID
	 * @return システムパラメーターカテゴリー種別
	 */
	public static SystemConfigCategoryType getType(String name) {
		try {
			return valueOf(name);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * システムパラメーターカテゴリー配列取得
	 *
	 * @return システムパラメーターカテゴリー配列
	 */
	public SystemConfigCategory[] getSystemConfigCategorys() {
		return getSystemConfigCategoryList().toArray(new SystemConfigCategory[0]);
	}

	/**
	 * システムパラメーターカテゴリー名配列取得
	 *
	 * @return システムパラメーターカテゴリー名配列
	 */
	public String[] getSystemConfigCategoryNames() {
		List<String> categoryNamesList = new ArrayList<String>();
		for (SystemConfigCategory category : getSystemConfigCategoryList()) {
			categoryNamesList.add(category.name());
		}
		return categoryNamesList.toArray(new String[0]);
	}

	/**
	 * システムパラメーターカテゴリーリスト取得
	 *
	 * @return システムパラメーターカテゴリーリスト
	 */
	List<SystemConfigCategory> getSystemConfigCategoryList() {
		List<SystemConfigCategory> categoryList = new ArrayList<SystemConfigCategory>();
		for (SystemConfigCategory category : SystemConfigCategory.values()) {
			if (this.equals(category.getSystemConfigCategoryType())) {
				categoryList.add(category);
			}
		}
		return categoryList;
	}
}
