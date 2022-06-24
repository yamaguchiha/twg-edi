package jp.or.twg.twg_edi.common.difinition;

import jp.or.twg.twg_edi.common.resource.TwgResourceReader;

/**
 * スレッドステータス
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public enum OptionThreadStatus {

	/** 実行中 */	RUNNING			(false,	false),
	/** 正常終了 */	SUCCESSFUL		(true,	false),
	/** 正常終了（警告あり） */	SUCCESSFUL_WARNING	(true,	false),
	/** 異常終了 */	ABEND			(true,	true),
	/** 例外発生 */	EXCEPTION		(true,	true),
	/** EDIエラー */	REJECT		(true,	true),
	/** データ入力中 */	ADDING_DATA	(false,	true),
	/** データ入力済 */	ADDED_DATA	(false,	true),
	;

	/** データ削除可否 */
	private final boolean delete;

	/** エラー詳細可否 */
	private final boolean detail;

	/**
	 * コンストラクタ
	 *
	 * @param delete データ削除可否
	 * @param detail エラー詳細可否
	 */
	private OptionThreadStatus(boolean delete, boolean detail) {
		this.delete = delete;
		this.detail = detail;
	}

	/**
	 * スレッドステータス取得
	 *
	 * @param statusString ID
	 * @return スレッドステータス
	 */
	public static OptionThreadStatus getThreadStatus(String statusString) {
		for (OptionThreadStatus type : values()) {
			if (type.name().equals(statusString)) {
				return type;
			}
		}
		throw new IllegalArgumentException("予期せぬスレッドステータス");
	}

	/**
	 * スレッドステータス名取得
	 *
	 * @return スレッドステータス名
	 */
	public String getName() {
		return new TwgResourceReader().getString(getClass().getSimpleName() + ".name." + this.name());
	}

	/**
	 * データ削除可否取得
	 *
	 * @return データ削除可否
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * エラー詳細可否取得
	 *
	 * @return エラー詳細可否
	 */
	public boolean isErrorDetail() {
		return detail;
	}

//	/**
//	 * スレッドステータス列挙体チェックボックスリスト取得
//	 *
//	 * @return スレッドステータス列挙体チェックボックスリスト
//	 */
//	public static List<CheckboxListItem> getThreadStatusList() {
//		List<CheckboxListItem> list = new ArrayList<CheckboxListItem>();
//		for (OptionThreadStatus type : values()) {
//			list.add(new CheckboxListItem(type.name(), type.getName()));
//		}
//		return list;
//	}

//	/**
//	 * データ検証
//	 *
//	 * @param value スレッドステータス
//	 * @return エラーメッセージ
//	 */
//	public static Messages validate(String value) {
//		Messages ret = new Messages();
//
//		// 未入力
//		if (CommonDataUtil.isNullOrEmpty(value)) {
//			ret.add("", new Message("kazura.jama.error.validate.unsetting", new Message("kazura.jama.error.validate.ThreadStatus").toString()));
//			return ret;
//		}
//
//		// 対象外
//		try {
//			OptionThreadStatus.getThreadStatus(value);
//		} catch (IllegalArgumentException e) {
//			ret.add("", new Message("kazura.jama.error.validate.illegalargument", new Message("kazura.jama.error.validate.ThreadStatus").toString()));
//		}
//		return ret;
//	}
}
