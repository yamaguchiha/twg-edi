package jp.or.twg.twg_edi.kanban.service;

import java.util.ArrayList;
import java.util.List;

import jp.or.twg.twg_edi.common.resource.Message;
import jp.or.twg.twg_edi.common.resource.Messages;
import jp.or.twg.twg_edi.common.resource.TwgResourceReader;

/**
 * かんばんステータス
 * @author nishidat
 */
public enum KanbanStatusType {

	/** 未使用 */
	UNARRIVAL	(0,	true,	"KanbanStatus.UNARRIVAL",	true,	true,	true,	false),
	/** 外れかんばん */
	OFF_KANBAN	(1,	true,	"KanbanStatus.OFF_KANBAN",	false,	true,	true,	true),
	/** 使用済み */
	USED		(2,	true,	"KanbanStatus.USED",		false,	true,	false,	true),
	/** 削除済 */
	DELETE		(3,	true,	"KanbanStatus.DELETE",		false,	true,	false,	false);

	/** ID */
	private int id;

	/** 使用可能ステータス */
	private final boolean possibleUse;

	/** リソース名 */
	private final String resourceName;

	/** 外れかんばん実施可否 */
	private final boolean possibleOffKanban;

	/** 外れかんばん実施警告可否 */
	private final boolean possibleOffKanbanWarning;

	/** 回転取り扱い可否 */
	private final boolean rotationKanban;

	/**
	 * コンストラクタ
	 *
	 * @param id ID
	 * @param possibleUse 使用可能ステータス
	 * @param resourceName リソース名
	 * @param possibleOffKanban 外れかんばん実施可否
	 * @param possibleOffKanbanWarning 外れかんばん実施警告可否
	 * @param rotationKanban 回転取り扱い可否
	 */
	private KanbanStatusType(int id, 
							 boolean possibleUse, 
							 String resourceName, 
							 boolean possibleOffKanban, 
							 boolean possibleOffKanbanWarning, 
							 boolean rotationKanban, 
							 boolean reservePossibleUse) {
		this.id = id;
		this.possibleUse = possibleUse;
		this.resourceName = resourceName;
		this.possibleOffKanban = possibleOffKanban;
		this.possibleOffKanbanWarning = possibleOffKanbanWarning;
		this.rotationKanban = rotationKanban;
	}

	/**
	 * ID取得
	 *
	 * @return ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * ステータスリソース名を返す
	 *
	 * @return ステータスリソース名
	 */
	public String getName(){
		return new TwgResourceReader().getString(resourceName);
	}

	/**
	 * 外れかんばん実施可否
	 *
	 * @return possibleOffKanban 外れかんばん実施可否
	 */
	public boolean isPossibleOffKanban() {
		return possibleOffKanban;
	}

	/**
	 * 外れかんばん実施警告可否
	 *
	 * @return possibleOffKanbanWarning 外れかんばん実施警告可否
	 */
	public boolean isPossibleOffKanbanWarning() {
		return possibleOffKanbanWarning;
	}

	/**
	 * 回転取り扱い可否
	 *
	 * @return rotationKanban 回転取り扱い可否
	 */
	public boolean isRotationKanban() {
		return rotationKanban;
	}

	/**
	 * かんばんステータス取得
	 *
	 * @param id ID
	 * @return かんばんステータス
	 */
	public static KanbanStatusType getStatusById(int id) {
		for (KanbanStatusType status : values()) {
			if (status.id == id) {
				return status;
			}
		}
		throw new IllegalArgumentException("予期せぬかんばんステータス値");
	}

	/**
	 * かんばんステータス取得
	 *
	 * @param name name
	 * @return かんばんステータス
	 */
	public static KanbanStatusType getStatusByName(String name){
		if (name == null) {
			throw new IllegalArgumentException("予期せぬかんばんステータス値");
		}
		return valueOf(name);
	}

	/**
	 * かんばんステータス取得
	 *
	 * @param resourceName リソース名称
	 * @return かんばんステータス
	 */
	public static KanbanStatusType getStatusByResourceName(String resourceName) {
		for (KanbanStatusType type : values()) {
			if (type.getName().equals(resourceName)) {
				return type;
			}
		}
		return null;
	}

//	/**
//	 * ステータスチェックボックスリスト取得
//	 *
//	 * @return チェックボックスリスト
//	 */
//	public static List<CheckboxListItem> getStatusCheckboxListItem() {
//		List<CheckboxListItem> list = new ArrayList<CheckboxListItem>();
//		for (KanbanStatusType type : values()) {
//			if (type.possibleUse) {
//				String name = type.getName();
//				if (!CommonDataUtil.isNullOrEmpty(name)) {
//					list.add(new CheckboxListItem(type.name(), name));
//				}
//			}
//		}
//		return list;
//	}
//
//	/**
//	 * かんばんステータス選択項目用リスト作成
//	 *
//	 * @return かんばんステータス選択項目用リスト
//	 */
//	public static List<HtmlListItem> getSelectHtmlList() {
//
//		List<HtmlListItem> list = new ArrayList<HtmlListItem>();
//
//		for (KanbanStatusType type : values()) {
//			if (type.possibleUse) {
//				list.add(new HtmlListItem(String.valueOf(type.getId()), type.getName()));
//			}
//		}
//		return list;
//	}

	/**
	 * データ検証
	 *
	 * @param id ID
	 * @return エラーメッセージ
	 */
	public static Messages validate(int id) {
		Messages ret = new Messages();

		// 対象外
		try {
			getStatusById(id);
		} catch (IllegalArgumentException e) {
			ret.add("", new Message("error.validate.illegalargument", new Message("error.validate.KanbanStatus.Status").toString()));
		}

		return ret;
	}

	/**
	 * 回転対象とするかんばんステータスリストを取得する
	 *
	 * @return かんばんステータスリスト
	 */
	public static List<KanbanStatusType> getRotationKanbanStatusList() {
		List<KanbanStatusType> list = new ArrayList<KanbanStatusType>();
		for (KanbanStatusType type : values()) {
			if (type.rotationKanban) {
				list.add(type);
			}
		}
		return list;
	}

	/**
	 * 回転対象外とするかんばんステータスリストを取得する
	 *
	 * @return かんばんステータスリスト
	 */
	public static List<KanbanStatusType> getNotRotationKanbanStatusList() {
		List<KanbanStatusType> list = new ArrayList<KanbanStatusType>();
		for (KanbanStatusType type : values()) {
			if (!type.rotationKanban) {
				list.add(type);
			}
		}
		return list;
	}
}
