package jp.or.twg.twg_edi.common.resource;

import jp.or.twg.twg_edi.common.utility.CommonDataUtil;

/**
 * リソースファイル読み込み（マルチ用）
 * ※複数のリソースを指定して読み込みが可能です。
 * ※別リソース・同キーが存在する場合は、最初に指定したリソースを優先して返却します。
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public abstract class MultiResourceReader extends ResourceReader {
	private static final long serialVersionUID = 1L;

	/** 取得対象のリソース名 */
	private String tmpResourceName = null;

	/* (非 Javadoc)
	 * @see jp.co.gwise.common.resource.ResourceReader#getResourceName()
	 */
	@Override
	final protected String getResourceName() {
		// これ以上継承させない
		return tmpResourceName;
	}

    /**
     * リソースファイル名取得
     *
     * @return リソースファイル名
     */
	abstract protected String[] getResourceNamess();

	/*
	 * (非 Javadoc)
	 * @see jp.co.gwise.common.resource.ResourceReader#getString(java.lang.String)
	 */
	@Override
	public String getString(String key) {

		String value = null;

		String[] resourceNames = getResourceNamess();

		if (resourceNames != null) {
			for (String resourceName : resourceNames) {
				// 順番にリソース名を設定し、値を取得する。
				tmpResourceName = resourceName;
				value = super.getString(key);

				// 値が存在すればループ終了（返却）
				if (!CommonDataUtil.isNullOrEmpty(value)) {
					break;
				}
			}
		}

		return value;
	}

}
