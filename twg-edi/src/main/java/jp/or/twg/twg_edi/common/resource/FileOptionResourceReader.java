package jp.or.twg.twg_edi.common.resource;


/**
 * オプションファイルリソースリーダー
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public class FileOptionResourceReader extends MultiResourceReader {
	private static final long serialVersionUID = 1L;

	/** 対象のリソースファイル */
	private static final String[] RESOURCE_FILE = {
		"fileResources",
		"fileOptionResources",
	};

	/*}
	 * RESOURCE_FILE(非 Javadoc)
	 * @see jp.co.gwise.kazura.jama.option.resource.MultiResourceReader#getResourceNamess()
	 */
	@Override
	protected String[] getResourceNamess() {
		return RESOURCE_FILE;
	}

	/**
	 * キャラセット(デフォルト)取得
	 *
	 * @return キャラセット(デフォルト)
	 */
	public String getCharsetDefault() {
		return getString("charset.default");
	}

	/**
	 * キャラセット(シフトJIS)取得
	 *
	 * @return キャラセット(シフトJIS)
	 */
	public String getCharsetShiftJIS() {
		return getString("charset.Shift_JIS");
	}

	/**
	 * キャラセット(Latin-1)取得
	 *
	 * @return キャラセット(Latin-1)
	 */
	public String getCharsetLatin1() {
		return getString("charset.ISO-8859-1");
	}

	/**
	 * 改行文字(デフォルト)取得
	 *
	 * @return 改行文字(デフォルト)
	 */
	public String getLineFeedDefault() {
		return getString("linefeed.default");
	}

	/**
	 * 拡張子(PDF)取得
	 *
	 * @return 拡張子(PDF)
	 */
	public String getExtensionPdf() {
		return getString("ext.pdf");
	}

	/**
	 * 拡張子(CSV)取得
	 *
	 * @return 拡張子(CSV)
	 */
	public String getExtensionCsv() {
		return getString("ext.csv");
	}

	/**
	 * コンテンツタイプ(TEXT)取得
	 *
	 * @return コンテンツタイプ(TEXT)
	 */
	public String getContentTypeText() {
		return getString("content.text");
	}

	/**
	 * コンテンツタイプ(CSV)取得
	 *
	 * @return コンテンツタイプ(CSV)
	 */
	public String getContentTypeCsv() {
		return getString("content.csv");
	}

	/**
	 * コンテンツタイプ(PDF)取得
	 *
	 * @return コンテンツタイプ(PDF)
	 */
	public String getContentTypePdf() {
		return getString("content.pdf");
	}

	/**
	 * コンテンツタイプ(ZIP)取得
	 *
	 * @return コンテンツタイプ(ZIP)
	 */
	public String getContentTypeZip() {
		return getString("content.zip");
	}

	/**
	 * コンテンツタイプ(Excel)取得
	 *
	 * @return コンテンツタイプ(Excel)
	 */
	public String getContentTypeExcel() {
		return getString("content.excel");
	}
}
