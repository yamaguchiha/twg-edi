package jp.or.twg.twg_edi.common.resource;

/**
 * ファイルリソースリーダー
 *
 * @author Yamaguchi
 * @version 1.0
 */
public class FileResourceReader extends ResourceReader {
	private static final long serialVersionUID = 1L;

	/* (非 Javadoc)
	 * @see jp.co.gwise.common.resource.ResourceReader#getResourceName()
	 */
	@Override
	protected String getResourceName() {
		return "fileResources";
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

	/**
	 * キャラセット(UTF8)取得
	 *
	 * @return キャラセット(UTF8)
	 */
	public String getCharsetUTF8() {
		return getString("charset.UTF8");
	}

}
