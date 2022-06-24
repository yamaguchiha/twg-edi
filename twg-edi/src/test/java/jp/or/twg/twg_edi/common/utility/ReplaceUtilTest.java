package jp.or.twg.twg_edi.common.utility;

import junit.framework.TestCase;

/**
 * 文字置換ユーティリティ
 *
 * @author g-wise
 * @version 1.0
 */
public class ReplaceUtilTest extends TestCase {

	/**
	 * かんばん識別番号用 置換
	 */
	public void test_replaceRenban() {
		String str;
		int replacement;

		// 置換する値がnull
		replacement = 1;
		String result = ReplaceUtil.replaceRenban(null, replacement);
		assertNull("置換結果が違います", result);

		// 置換する値が負の場合
		str = "TEST#RENBAN$4#";
		replacement = -1;
		result = ReplaceUtil.replaceRenban(str, replacement);
		assertEquals("置換結果が違います", str, result);

		// 置換対象でない文字列
		str = "TEST#RENBANX$4#";
		replacement = -1;
		result = ReplaceUtil.replaceRenban(str, replacement);
		assertEquals("置換結果が違います", str, result);

		// 正常
		str = "TEST#RENBAN$4#";
		replacement = 0;
		result = ReplaceUtil.replaceRenban(str, replacement);
		assertEquals("置換結果が違います", "TEST0000", result);

		str = "TEST#RENBAN$4#";
		replacement = 1;
		result = ReplaceUtil.replaceRenban(str, replacement);
		assertEquals("置換結果が違います", "TEST0001", result);

		str = "TEST#RENBAN$01#";
		replacement = 1;
		result = ReplaceUtil.replaceRenban(str, replacement);
		assertEquals("置換結果が違います", "TEST1", result);

		str = "TEST#RENBAN$3#";
		replacement = 1234;
		result = ReplaceUtil.replaceRenban(str, replacement);
		//assertEquals("置換結果が違います", "TEST1234", result);
		assertEquals("置換結果が違います", "TEST234", result);

		// 正常 複数回設定
		str = "TEST#RENBAN$3##RENBAN$6##RENBAN$9#";
		replacement = 1;
		result = ReplaceUtil.replaceRenban(str, replacement);
		assertEquals("置換結果が違います", "TEST001000001000000001", result);
	}

	/**
	 * 文字列を置換して返す
	 */
	public void test_replaceString() {
		String headerName;
		String str;
		String replacement;
		String result;

		// null
		result = ReplaceUtil.replaceString(null, null, null);
		assertNull("置換結果が違います", result);

		// 予約語 null
		headerName  = null;
		str         = "TEST#発注者#";
		replacement = "PARTY";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", str, result);

		// 置換対象の文字列 null
		headerName  = "発注者";
		str         = null;
		replacement = "PARTY";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", str, result);

		// 置換を行う文字列 null 桁数指定なし
		headerName  = "発注者";
		str         = "TEST#発注者#";
		replacement = null;
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TEST", result);

		// 置換を行う文字列 null 桁数指定あり
		headerName  = "発注者";
		str         = "TEST#発注者$5#";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TEST     ", result);

		// 正常 桁数指定なし 半角文字
		headerName  = "発注者";
		str         = "TEST#発注者#";
		replacement = "PARTY";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTPARTY", result);

		// 正常 桁数指定なし 全角文字
		headerName  = "発注者";
		str         = "TEST#発注者#";
		replacement = "パーティー";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTパーティー", result);

		// 正常 桁数指定あり 半角文字
		headerName  = "発注者";
		str         = "TEST#発注者$10#";
		replacement = "PARTY";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTPARTY     ", result);

		// 正常 桁数指定あり 全角文字
		headerName  = "発注者";
		str         = "TEST#発注者$5#";
		replacement = "てすと";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTてす ", result);

		headerName  = "発注者";
		str         = "TEST#発注者$6#";
		replacement = "てすと";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTてすと", result);

		headerName  = "発注者";
		str         = "TEST#発注者$7#";
		replacement = "てすと";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTてすと ", result);

		// 正常 複数回設定
		headerName  = "発注者";
		str         = "TEST#発注者$4##発注者$6#";
		replacement = "PARTY";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTPARTPARTY ", result);
		headerName  = "発注者";
		str         = "TEST#発注者##発注者$4##発注者$6#";
		replacement = "PARTY";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTPARTYPARTPARTY ", result);
		// 正常 複数回設定
		headerName  = "発注者";
		str         = "TEST#発注者$5##発注者$3#";
		replacement = "てすと";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTてす て ", result);
		headerName  = "発注者";
		str         = "TEST#発注者##発注者$5##発注者$3#";
		replacement = "てすと";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTてすとてす て ", result);
		headerName  = "発注者";
		str         = "TEST#発注者$5##発注者##発注者$3#";
		replacement = "てすと";
		result = ReplaceUtil.replaceString(headerName, str, replacement);
		assertEquals("置換結果が違います", "TESTてす てすとて ", result);
	}

	/**
	 * 文字列を置換して返す
	 */
	public void test_replaceStringZeroPaddingCutFromBack() {
		String headerName;
		String str;
		String replacement;
		String result;

		// null
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(null, null, null, null);
		assertNull("置換結果が違います", result);

		// 予約語 null
		headerName  = null;
		str         = "TEST#発注者#";
		replacement = "PARTY";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います",str, result);

		// 置換対象の文字列 null
		headerName  = "発注者";
		str         = null;
		replacement = "PARTY";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います",str, result);

		// 置換を行う文字列 null 桁数指定なし
		headerName  = "発注者";
		str         = "TEST#発注者#";
		replacement = null;
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TEST", result);

		// 置換を行う文字列 null 桁数指定なし 変換しない
		headerName  = "発注者";
		str         = "TEST#発注者#";
		replacement = null;
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.NO_REPLACE);
		assertEquals("置換結果が違います", str, result);

		// 置換を行う文字列 null 桁数指定あり
		headerName  = "発注者";
		str         = "TEST#発注者$5#";
		replacement = null;
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TEST00000", result);

		// 正常 桁数指定なし 半角文字
		headerName  = "発注者";
		str         = "TEST#発注者#";
		replacement = "PARTY";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TESTPARTY", result);

		// 正常 桁数指定なし 半角文字 変換しない
		headerName  = "発注者";
		str         = "TEST#発注者#";
		replacement = "PARTY";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.NO_REPLACE);
		assertEquals("置換結果が違います", str , result);

		// 正常 桁数指定なし 全角文字
		headerName  = "発注者";
		str         = "TEST#発注者#";
		replacement = "パーティー";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TESTパーティー", result);

		// 正常 桁数指定なし 全角文字 変換しない
		headerName  = "発注者";
		str         = "TEST#発注者#";
		replacement = "パーティー";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.NO_REPLACE);
		assertEquals("置換結果が違います",str , result);

		// 正常 桁数指定あり 半角文字
		headerName  = "発注者";
		str         = "TEST#発注者$10#";
		replacement = "PARTY";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TEST00000PARTY", result);

		// 正常 桁数指定あり 全角文字
		headerName  = "発注者";
		str         = "TEST#発注者$5#";
		replacement = "てすと";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TEST0すと", result);

		headerName  = "発注者";
		str         = "TEST#発注者$6#";
		replacement = "てすと";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TESTてすと", result);

		headerName  = "発注者";
		str         = "TEST#発注者$7#";
		replacement = "てすと";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TEST0てすと", result);

		// 正常 複数回設定
		headerName  = "発注者";
		str         = "TEST#発注者$4##発注者$6#";
		replacement = "PARTY";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TESTARTY0PARTY", result);
		// 正常 複数回 先頭に桁数指定なし
		headerName  = "発注者";
		str         = "TEST#発注者##発注者$5##発注者$3#";
		replacement = "てすと";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TESTてすと0すと0と", result);
		// 正常 複数回 途中に桁数指定なし
		headerName  = "発注者";
		str         = "TEST#発注者$4##発注者##発注者$7#";
		replacement = "てすと";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.REPLACE);
		assertEquals("置換結果が違います", "TESTすとてすと0てすと", result);
		// 正常 複数回 途中に桁数指定なし＋指定なしは置換しない
		headerName  = "発注者";
		str         = "TEST#発注者$5##発注者##発注者$3#";
		replacement = "てすと";
		result = ReplaceUtil.replaceStringZeroPaddingCutFromBack(headerName, str, replacement, ReplaceUtil.NO_REPLACE);
		assertEquals("置換結果が違います", "TEST0すと#発注者#0と", result);
	}

}
