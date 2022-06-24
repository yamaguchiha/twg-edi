package jp.or.twg.twg_edi.common.difinition;

import lombok.Getter;

/**
 * フォームモード
 *
 * @author yamaguchiha
 * @version 1.0
 */
@Getter
public enum FormMode {
	/** NEW */			NEW("1", "NEW"),
	/** EDIT */			EDIT("2", "EDIT"),
	/** DELETE */		DELETE("3", "DELETE"),
	/** CONFIRM */		CONFIRM("4", "CONFIRM"),
	;

	/** ID */
	private final String id;

	/** 値 */
	private final String val;

	/**
	 * コンストラクタ
	 *
	 * @param id
	 * @param val
	 */
	private FormMode(String id, String val) {
		this.id = id;
		this.val = val;
	}

}
