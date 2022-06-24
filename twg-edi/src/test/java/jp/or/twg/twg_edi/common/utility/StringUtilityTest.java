package jp.or.twg.twg_edi.common.utility;

import java.io.UnsupportedEncodingException;

import junit.framework.TestCase;

public class StringUtilityTest  extends TestCase {

	/**
	 * コンストラクタ
	 * このクラスはすべて静的メソッドだが、Coverage Reportで未テストクラスとして扱われるため、生成できることも確認する。
	 */
	public void test_StringUtility() {
		StringUtility cls = null;
		cls = new StringUtility();
		assertNotNull("クラスが生成されていません", cls);
	}

	/**
	 * 指定のバイト数で文字列をカットする
	 */
	public void test_cut(){

		assertNull("編集後の文字列が正しくありません。", StringUtility.cut(null, 0));

		//指定バイト数0
		assertEquals("編集後の文字列が正しくありません。", "", StringUtility.cut("DUMMY", 0));

		//指定バイト数のが大きい場合
		assertEquals("編集後の文字列が正しくありません。", "DUMMY", StringUtility.cut("DUMMY", 100));

		//指定バイト数のが小さい場合
		assertEquals("編集後の文字列が正しくありません。", "DU", StringUtility.cut("DUMMY", 2));

		//全角の場合
		assertEquals("編集後の文字列が正しくありません。", "あいうえおかきくけこ", StringUtility.cut("あいうえおかきくけこ", 20));

		//全角の場合
		assertEquals("編集後の文字列が正しくありません。", "あいうえお", StringUtility.cut("あいうえおかきくけこ", 10));

		//全角の半端なところで終わる場合
		assertEquals("編集後の文字列が正しくありません。", "あいうえ", StringUtility.cut("あいうえおかきくけこ", 9));

		//全角半角が混在する場合
		assertEquals("編集後の文字列が正しくありません。", "あaいbうcえd", StringUtility.cut("あaいbうcえdおeかfきgくhけiこj", 12));

		//全角半角が混在して全角の半端なところで終わる場合
		assertEquals("編集後の文字列が正しくありません。", "あaいbうc", StringUtility.cut("あaいbうcえdおeかfきgくhけiこj", 10));

		//全角半角が混在して全角の半端なところで終わる場合(Shift_JISの禁則文字を含む場合)
		assertEquals("編集後の文字列が正しくありません。", "あa淼b彅c寘dおe", StringUtility.cut("あa淼b彅c寘dおeかfきgくhけiこj", 16));

		//全角半角が混在する場合(Shift_JISの禁則文字、半角カナを含む場合)
		assertEquals("編集後の文字列が正しくありません。", "あaｷ淼b｣彅cﾞ寘dお", StringUtility.cut("あaｷ淼b｣彅cﾞ寘dおeかfきgくhけiこj", 17));

		//全角半角が混在して全角の半端なところで終わる場合(Shift_JISの禁則文字、半角カナを含む場合)
		assertEquals("編集後の文字列が正しくありません。", "あaｷ淼b｣彅cﾞ寘d", StringUtility.cut("あaｷ淼b｣彅cﾞ寘dおeかfきgくhけiこj", 16));
	}

	/**
	 * 指定のバイト数で文字列をカットする
	 */
	public void test_cutFromBack(){

		assertNull("編集後の文字列が正しくありません。", StringUtility.cutFromBack(null, 0));

		//指定バイト数0
		assertEquals("編集後の文字列が正しくありません。", "", StringUtility.cutFromBack("DUMMY", 0));

		//指定バイト数のが大きい場合
		assertEquals("編集後の文字列が正しくありません。", "DUMMY", StringUtility.cutFromBack("DUMMY", 100));

		//指定バイト数のが小さい場合
		assertEquals("編集後の文字列が正しくありません。", "MY", StringUtility.cutFromBack("DUMMY", 2));

		//全角の場合
		assertEquals("編集後の文字列が正しくありません。", "あいうえおかきくけこ", StringUtility.cutFromBack("あいうえおかきくけこ", 20));

		//全角の場合
		assertEquals("編集後の文字列が正しくありません。", "かきくけこ", StringUtility.cutFromBack("あいうえおかきくけこ", 10));

		//全角の半端なところで終わる場合
		assertEquals("編集後の文字列が正しくありません。", "きくけこ", StringUtility.cutFromBack("あいうえおかきくけこ", 9));

		//全角半角が混在する場合
		assertEquals("編集後の文字列が正しくありません。", "きgくhけiこj", StringUtility.cutFromBack("あaいbうcえdおeかfきgくhけiこj", 12));

		//全角半角が混在して全角の半端なところで終わる場合
		assertEquals("編集後の文字列が正しくありません。", "gくhけiこ", StringUtility.cutFromBack("あaいbうcえdおeかfきgくhけiこ", 10));

		//全角半角が混在して全角の半端なところで終わる場合(Shift_JISの禁則文字を含む場合)
		assertEquals("編集後の文字列が正しくありません。", "jあa淼b彅c寘dお", StringUtility.cutFromBack("かfきgくhけiこjあa淼b彅c寘dお", 16));

		//全角半角が混在する場合(Shift_JISの禁則文字、半角カナを含む場合)
		assertEquals("編集後の文字列が正しくありません。", "あaｷ淼b｣彅cﾞ寘dお", StringUtility.cutFromBack("かfきgくhけiこjあaｷ淼b｣彅cﾞ寘dお", 17));

		//全角半角が混在して全角の半端なところで終わる場合(Shift_JISの禁則文字、半角カナを含む場合)
		assertEquals("編集後の文字列が正しくありません。", "aｷ淼b｣彅cﾞ寘dお", StringUtility.cutFromBack("かfきgくhけiこjあaｷ淼b｣彅cﾞ寘dお", 16));
	}

	/**
	 * 文字列のバイト数を返す
	 */
	public void test_getByteLength() {
		assertEquals("取得したバイト数が正しくありません。", 0, 	StringUtility.getByteLength(null));

		assertEquals("取得したバイト数が正しくありません。", 5, 	StringUtility.getByteLength("DUMMY"));

		assertEquals("取得したバイト数が正しくありません。", 20, 	StringUtility.getByteLength("あいうえおかきくけこ"));

		assertEquals("取得したバイト数が正しくありません。", 30, 	StringUtility.getByteLength("あaいbうcえdおeかfきgくhけiこj"));

		//全角半角が混在してる場合(Shift_JISの禁則文字を含む場合)
		assertEquals("取得したバイト数が正しくありません。", 30, 	StringUtility.getByteLength("あa淼b彅c寘dおeかfきgくhけiこj"));

		//半角カナ、半角句読点を含む場合
		String test = "～－あa淼b彅c寘dおeかfきgくhけiこj｡。｡「｢｣､･ｦｱｲｳｴｵｶｷｸｹｺｻｼｽｾｿﾀﾁﾂﾃﾄﾅﾆﾇﾈﾉﾊﾋﾌﾍﾎﾏﾐﾑﾒﾓﾗﾘﾙﾚﾛﾔﾕﾖﾜｦﾝﾞﾟあiうえカタ";
		assertEquals("取得したバイト数が正しくありません。", 104, 	StringUtility.getByteLength(test));

//文字コード表と違う結果が返るが、サイズ判定は正しくできている
//		System.out.println(Integer.toHexString('\\'));
//		System.out.println(Integer.toHexString('~'));

	}

	/**
	 * 半角数字以外を削除する
	 */
	public void test_getDeleteNonNumber() {
		assertEquals("取得した文字列が正しくありません。", null, 	StringUtility.getDeleteNonNumber(null));

		assertEquals("取得した文字列が正しくありません。", "1234567890", 	StringUtility.getDeleteNonNumber("D+*1!U#2$M%3&M(4)Y=-5~|D6U7M8M9Y0"));

		assertEquals("取得した文字列が正しくありません。", "1234567890", 	StringUtility.getDeleteNonNumber("1あ2い3う4え5お6か7き8く9け0こ"));

		assertEquals("取得した文字列が正しくありません。", "0123456789", 	StringUtility.getDeleteNonNumber("0あ1a2い3b4う5c6え7d8お9eかfきgくhけiこj"));

		//全角半角が混在してる場合(Shift_JISの禁則文字を含む場合)
		assertEquals("取得した文字列が正しくありません。", "", 	StringUtility.getDeleteNonNumber("あa淼b彅c寘dおeかfきgくhけiこj"));

		//半角カナ、半角句読点を含む場合
		String test = "～－あa淼b彅c寘dおeかfきgくhけiこj｡。｡「｢｣､･ｦｱｲｳｴｵｶｷｸｹｺｻｼｽｾｿﾀﾁﾂﾃﾄﾅﾆﾇﾈﾉﾊﾋﾌﾍﾎﾏﾐﾑﾒﾓﾗﾘﾙﾚﾛﾔﾕﾖﾜｦﾝﾞﾟあiうえカタ";
		assertEquals("取得した文字列が正しくありません。", "", 	StringUtility.getDeleteNonNumber(test));
	}



	/**
	 * RTrim 後ろスペース削除
	 */
	public void test_rtrim() {
		assertEquals("取得した文字列が正しくありません。", null, 	StringUtility.rtrim(null));

		assertEquals("取得した文字列が正しくありません。", "", 	StringUtility.rtrim(""));

		assertEquals("取得した文字列が正しくありません。", "あいうえお", 	StringUtility.rtrim("あいうえお 　"));

		//後ろ以外は削除しない
		assertEquals("取得した文字列が正しくありません。", "あい う　えお", 	StringUtility.rtrim("あい う　えお 　"));

		assertEquals("取得した文字列が正しくありません。", "　 あい う　えお", 	StringUtility.rtrim("　 あい う　えお 　"));
	}

	/**
	 * 入力文字列がNullの場合はオリジナル値引数を返す
	 */
	public void test_getStringValueOrOriginal() {
		final Long   ORG_LONG    = 999L;
		final String ORG_STRING  = "オリジナル値";
		final String TEST_STRING = "テスト値";
		final Long   TEST_LONG   = 111L;

		// null
		assertEquals("取得した文字列が正しくありません。", ORG_STRING, 			StringUtility.getStringValueOrOriginal(null, ORG_STRING));
		assertNull(  "取得した文字列が正しくありません。",             			StringUtility.getStringValueOrOriginal(null, null));

		assertEquals("取得した文字列が正しくありません。", ORG_LONG.toString(), 	StringUtility.getStringValueOrOriginal(null, ORG_LONG));
		assertNull(  "取得した文字列が正しくありません。",                    	StringUtility.getStringValueOrOriginal(null, null));

		// ブランク
		assertEquals("取得した文字列が正しくありません。", "", 	StringUtility.getStringValueOrOriginal("", ORG_STRING));
		assertEquals("取得した文字列が正しくありません。", "",  	StringUtility.getStringValueOrOriginal("", null));

		assertEquals("取得した文字列が正しくありません。", "", 	StringUtility.getStringValueOrOriginal("", ORG_LONG));
		assertEquals("取得した文字列が正しくありません。", "",  	StringUtility.getStringValueOrOriginal("", null));

		// 値あり
		assertEquals("取得した文字列が正しくありません。", TEST_STRING, 				StringUtility.getStringValueOrOriginal(TEST_STRING, ORG_STRING));
		assertEquals("取得した文字列が正しくありません。", TEST_STRING, 				StringUtility.getStringValueOrOriginal(TEST_STRING, null));

		assertEquals("取得した文字列が正しくありません。", TEST_LONG.toString(), 	StringUtility.getStringValueOrOriginal(TEST_LONG.toString(), ORG_LONG));
		assertEquals("取得した文字列が正しくありません。", TEST_LONG.toString(), 	StringUtility.getStringValueOrOriginal(TEST_LONG.toString(), null));
	}

	/**
	 * 入力文字列がNull、ブランクの場合はオリジナル値引数を返す
	 */
	public void test_getStringValueOrOriginalWhenBlankOrNull() {
		final Long   ORG_LONG    = 999L;
		final String ORG_STRING  = "オリジナル値";
		final String TEST_STRING = "テスト値";
		final Long   TEST_LONG   = 111L;

		// null
		assertEquals("取得した文字列が正しくありません。", ORG_STRING, 			StringUtility.getStringValueOrOriginalWhenBlankOrNull(null, ORG_STRING));
		assertNull(  "取得した文字列が正しくありません。",             			StringUtility.getStringValueOrOriginalWhenBlankOrNull(null, null));

		assertEquals("取得した文字列が正しくありません。", ORG_LONG.toString(), 	StringUtility.getStringValueOrOriginalWhenBlankOrNull(null, ORG_LONG));
		assertNull(  "取得した文字列が正しくありません。",                    	StringUtility.getStringValueOrOriginalWhenBlankOrNull(null, null));

		// ブランク
		assertEquals("取得した文字列が正しくありません。", ORG_STRING, 			StringUtility.getStringValueOrOriginalWhenBlankOrNull("", ORG_STRING));
		assertNull(  "取得した文字列が正しくありません。", 						StringUtility.getStringValueOrOriginalWhenBlankOrNull("", null));

		assertEquals("取得した文字列が正しくありません。", ORG_LONG.toString(),	StringUtility.getStringValueOrOriginalWhenBlankOrNull("", ORG_LONG));
		assertNull(  "取得した文字列が正しくありません。", 			 			StringUtility.getStringValueOrOriginalWhenBlankOrNull("", null));

		// 値あり
		assertEquals("取得した文字列が正しくありません。", TEST_STRING, 			StringUtility.getStringValueOrOriginalWhenBlankOrNull(TEST_STRING, ORG_STRING));
		assertEquals("取得した文字列が正しくありません。", TEST_STRING, 			StringUtility.getStringValueOrOriginalWhenBlankOrNull(TEST_STRING, null));

		assertEquals("取得した文字列が正しくありません。", TEST_LONG.toString(),	StringUtility.getStringValueOrOriginalWhenBlankOrNull(TEST_LONG.toString(), ORG_LONG));
		assertEquals("取得した文字列が正しくありません。", TEST_LONG.toString(),	StringUtility.getStringValueOrOriginalWhenBlankOrNull(TEST_LONG.toString(), null));
	}

	/**
	 * 文字列がnull、空文字のものは、nullを返す
	 * それ以外は文字列をそのまま返す
	 */
	public void test_blankToNull() {
		assertNull("文字列が違います", StringUtility.blankToNull(null));
		assertNull("文字列が違います", StringUtility.blankToNull(""));
		assertEquals("文字列が違います", " ", StringUtility.blankToNull(" "));
		assertEquals("文字列が違います", "TEST", StringUtility.blankToNull("TEST"));
	}

	/**
	 * 変換元文字列を指定した文字コードのサイズで変換して返す.
	 * サイズを超える場合はカットし、満たさない場合は挿入文字で埋める.
	 * @param org 変換元文字列
	 * @param size 指定サイズ
	 * @param addStr　挿入文字
	 * @param encoding 文字コード
	 * @return 変換後文字列
	 * @throws UnsupportedEncodingException
	 */
	public void test_getStringByEncodeSize() throws UnsupportedEncodingException {
		String data = "あいう";
		assertEquals("結果が違います", "あい", StringUtility.getStringByEncodeSize(data, 6, "A", "UTF-8"));
		assertEquals("結果が違います", "あいう", StringUtility.getStringByEncodeSize(data, 9, "A", "UTF-8"));
		assertEquals("結果が違います", "あいうAAA", StringUtility.getStringByEncodeSize(data, 12, "A", "UTF-8"));
		assertEquals("結果が違います", "あいうえええ", StringUtility.getStringByEncodeSize(data, 12, "え", "UTF-8"));
		assertEquals("結果が違います", "あい", StringUtility.getStringByEncodeSize(data, 4, "A", "SJIS"));
		assertEquals("結果が違います", "あいう", StringUtility.getStringByEncodeSize(data, 6, "A", "SJIS"));
		assertEquals("結果が違います", "あいうAAA", StringUtility.getStringByEncodeSize(data, 9, "A", "SJIS"));
		assertEquals("結果が違います", "あいうえええ", StringUtility.getStringByEncodeSize(data, 9, "え", "SJIS"));
	}

	/**
	 * 文字列を指定桁数分返す
	 * @throws UnsupportedEncodingException
	 */
	public void test_getStringByByte() throws UnsupportedEncodingException {
		int sByte;
		int len;
		String result;
		String data = "あいうえお1234567890ｱｲｳｴｵｶｷｸｹｺかきくけこ";	// 40桁

		//TIPS:位置を正常に設定しないと文字化けするため注意

		// ***** チェック ***** //
		// null
		sByte = 0;
		len = 25;
		result = null;
		assertEquals("結果が違います", result, StringUtility.getStringByByte(null, sByte, len));

		// ブランク
		result = "";
		assertEquals("結果が違います", result, StringUtility.getStringByByte("", sByte, len));

		// 開始位置：0未満
		sByte = -1;
		result = "";
		assertEquals("結果が違います", result, StringUtility.getStringByByte(data, sByte, len));

		// 桁＜開始位置
		sByte = 40;
		len = 10;
		result = "";
		assertEquals("結果が違います", result, StringUtility.getStringByByte(data, sByte, len));

		// ***** 切取対象 ***** //

		// 疎通
		sByte = 30;
		len = 6;
		result = "かきく";
		assertEquals("結果が違います", result, StringUtility.getStringByByte(data, sByte, len));

		// 開始位置：0
		sByte = 0;
		len = 4;
		result = "あい";
		assertEquals("結果が違います", result, StringUtility.getStringByByte(data, sByte, len));

		// 開始位置を2byte文字の途中で切れる様に指定（含まれないこと）
		sByte = 1;
		len = 5;
		result = "いう";
		assertEquals("結果が違います", result, StringUtility.getStringByByte(data, sByte, len));

		// 開始位置＋桁＝終了位置
		sByte = 29;
		len = 11;
		result = "ｺかきくけこ";
		assertEquals("結果が違います", result, StringUtility.getStringByByte(data, sByte, len));

		// 終了位置を2byte文字の途中で切れる様に指定（含まれないこと）
		sByte = 29;
		len = 10;
		result = "ｺかきくけ";
		assertEquals("結果が違います", result, StringUtility.getStringByByte(data, sByte, len));

		//
		//String data = "あいうえお1234567890ｱｲｳｴｵｶｷｸｹｺかきくけこ";	// 40桁
		sByte = 31;
		len = 6;
		result = "きくけ";	// 前cutを先に行う関係上、後の全角は取得されてしまう。
		assertEquals("結果が違います", result, StringUtility.getStringByByte(data, sByte, len));

		// 桁数超過
		sByte = 25;
		len = 26;
		result = "ｶｷｸｹｺかきくけこ";
		assertEquals("結果が違います", result, StringUtility.getStringByByte(data, sByte, len));
	}

}
