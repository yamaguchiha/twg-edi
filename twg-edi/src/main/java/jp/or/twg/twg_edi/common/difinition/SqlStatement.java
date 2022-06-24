package jp.or.twg.twg_edi.common.difinition;

public class SqlStatement {

	/**
	 * SQLのLIKEで使用するワイルドカード文字
	 */
	public static final String WILDCARD = "%";

	/**
	 * 前方一致の画面値
	 */
	public static final String PREFIX_MATCH = "0";

	/**
	 * 部分一致の画面値
	 */
	public static final String PARTIAL_MATCH = "1";

	/**
	 * 保守ユーザ含む
	 */
	public static final String INC_MAINTE_USER = "Y";

	/**
	 * 利用者のみ
	 */
	public static final String USERS_ONLY = "N";

	/**
	 * 値：Y
	 */
	public static final String VALUE_Y = "Y";

	/**
	 * 値：N
	 */
	public static final String VALUE_N = "N";

}
