package jp.or.twg.twg_edi.common.difinition;

/**
 * Configカテゴリ　インターフェース
 *
 * @author yamaguchiha
 *
 */
public interface IConfigCategory {
	public String name();

	/**
	 * システムパラメーターカテゴリー名取得
	 *
	 * @return システムパラメーターカテゴリー名
	 */
	public String getTypeName();

	/**
	 * 説明取得
	 *
	 * @return 説明
	 */
	public String getDescription();

	/**
	 * 既定値取得
	 *
	 * @return 既定値
	 */
	public String getDefaultParameter();

}
