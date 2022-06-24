package jp.or.twg.twg_edi.common.difinition;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.or.twg.twg_edi.common.resource.TwgResourceReader;

/**
 * オプション用印刷データ種別
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public enum OrderTarget {

	/** 発注対象外 */
	EXCLUDE("0")
	,
	/** 発注対象 */
	INCLUDE("1")
	,
	;

	/** 値 */
	private final String id;

	/**
	 * コンストラクタ。
	 */
	private OrderTarget(String id) {
		this.id = id;
	}

	/**
	 * 発注区分取得
	 *
	 * @param id ID
	 * @return 種別
	 */
	public static OrderTarget getOrderTargetType(String id) {
		for (OrderTarget ordertargettype : values()) {
			if (ordertargettype.getId().equals(id)) {
				return ordertargettype;
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
	 * 発注区分リスト取得
	 *
	 * @return 工程区分リスト
	 */
	public static List<OrderTarget> getOrderTargetTypeList() {
		List<OrderTarget> ordertargettypeList = new ArrayList<OrderTarget>();
		for (OrderTarget ordertargettype : values()) {
			ordertargettypeList.add(ordertargettype);
		}
		return ordertargettypeList;
	}

	/**
	 * 発注区分選択項目用リスト作成
	 *
	 * @return 工程区分選択項目用リスト
	 */
	public static Map<String,String> getSelectHtmlList() {
		List<OrderTarget> ordertargettypeList = OrderTarget.getOrderTargetTypeList();

		Map<String,String> list = new LinkedHashMap<String,String>();
		for (OrderTarget ordertargettype : ordertargettypeList) {
			list.put(ordertargettype.getId(), ordertargettype.getOrderTargetTypeName());
		}
		return list;
	}

	/**
	 * 発注区分名称取得
	 *
	 * @return フォーマット
	 */
	public String getOrderTargetTypeName() {
		//getIdがEXCLUDEかINCLUDEが返ってくる処理を書く
		return new TwgResourceReader().getString("OptionOrderTargetManager.orderTargetType." + this.name());
	}
}