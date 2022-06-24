package jp.or.twg.twg_edi.common.difinition;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

/**
 * ロール区分
 *
 * @author yamaguchiha
 * @version 1.0
 */
public enum RoleType {
	/** 0:システム */				WORKER			("0", 	false,	false),
	/** 1:管理者 */					ADMINISTRATOR	("1", 	true,	true),
	/** 2:運用者 */					OPERATOR		("2", 	true,	true),
	/** 3:検索者 */					SEARCHER		("3", 	true,	true),
	/** 4:保守 */					MAINTENANCE	("4", 	false,	true),
	/** 5:出荷・納入場所管理者 */	OPTUSER		("5", 	true,	true),
	;

	/** ID */
	private final String id;

	/** 検索通常表示(true：表示する false:表示しない) */
	private final boolean commonDisplay;

	/** 検索拡大表示(true：表示する false:表示しない) */
	private final boolean moreDisplay;

	/**
	 * コンストラクタ
	 *
	 * @param id				ID
	 * @param commonDisplay 	検索通常表示
	 * @param moreDisplay 		検索拡大表示
	 */
	private RoleType(String id, boolean commonDisplay, boolean moreDisplay) {
		this.id = id;
		this.commonDisplay = commonDisplay;
		this.moreDisplay = moreDisplay;
	}

	/**
	 * ロール区分取得
	 *
	 * @param id ID
	 * @return ロール区分
	 */
	public static RoleType getRoleType(String id) {
		for (RoleType type : values()) {
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
	 * 検索通常表示
	 *
	 * @return true：表示する false:表示しない
	 */
	public boolean isCommonDisplay() {
		return commonDisplay;
	}

	/**
	 * 検索拡大表示
	 *
	 * @return true：表示する false:表示しない
	 */
	public boolean isMoreDisplay() {
		return moreDisplay;
	}


	/**
	 * ロール区分名取得
	 *
	 * @return ロール区分名
	 */
	public String getName() {
		String name = "";
		Properties props;
		try {
			props = PropertiesLoaderUtils.loadProperties(new ClassPathResource("/roletype.properties"));
			name= props.getProperty("RoleType.name." + this.name());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;
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
//		if(RoleType.getRoleType(id) == null) {
//			ret.add("", new Message("kazura.jama.error.validate.illegalargument", new Message("kazura.jama.error.validate.RoleType").toString()));
//		}
//		return ret;
//	}

	/**
	 * 名称からコードを返す
	 *
	 * @param name 種別名
	 * @return ID
	 */
	public static String getStatusCode(String name){
		for (RoleType type : values()) {
			if (type.name().equals(name)) {
				return type.id;
			}
		}
		return null;
	}

	/**
	 * IDと定義値名取得
	 *
	 * @return IDと定義値名
	 */
	public String getTypeIdAndName() {
		return id + ":" + getName();
	}

	/**
	 * HTMLリスト取得
	 *
	 * @return HTMLリスト
	 */
	public static Map<String,String> getHtmlList() {
		Map<String,String> list = new LinkedHashMap<String,String>();
		for (RoleType type : values()) {
			if (type.isMoreDisplay()) {
//				if (OPTUSER == type && !SystemConfig.isPlaceSecurityOption()) {
				if (OPTUSER == type) {
					continue;
				}
				list.put(type.getId(), type.getName());
			}
		}
		return list;
	}
}
