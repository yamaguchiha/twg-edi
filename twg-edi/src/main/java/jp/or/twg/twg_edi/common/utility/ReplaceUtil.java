package jp.or.twg.twg_edi.common.utility;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 文字置換ユーティリティ
 *
 * @author twg
 * @version 1.0
 */
public class ReplaceUtil {
	/** 変換する */
	public final static boolean REPLACE = true;

	/** 変換しない */
	public final static boolean NO_REPLACE = false;

	/**
	 * かんばん識別番号用 置換
	 *
	 * @param str 置換対象の文字列
	 * @param replacement 置換を行う文字列
	 * @return 置換後の文字列
	 */
	public static String replaceRenban(String str, int replacement) {
		final String REGEXP = "#RENBAN\\$(\\d+)#";
		final int GROUP_LENGTH = 1;
		final int FIND_START   = 0;

		if (CommonDataUtil.isNullOrEmpty(str) || replacement < 0) {
			return str;
		}

		String rtnStr = str;
		String replaceStr;
		Matcher matcher;
		int formatSize;
		String format;
		DecimalFormat df;

		while(true) {
			matcher = Pattern.compile(REGEXP).matcher(rtnStr);

			// 置換文字がない場合は、Loop抜け文字列を返却
			if (!matcher.find(FIND_START)) break;

			// 整形用 桁数取得
			formatSize = NumberUtil.tryParseInteger(matcher.group(GROUP_LENGTH));
			format = CommonDataUtil.rpad("", formatSize, "0");
			df = new DecimalFormat(format);

			// 先頭の置換文字をルールに従い、置き換える
			replaceStr = df.format(replacement);
			// 指定桁数 < 値桁 を考慮し、後ろ優先で桁切り
			replaceStr = StringUtility.cutFromBack(replaceStr, formatSize);
			rtnStr = matcher.replaceFirst(replaceStr);
		}

		return rtnStr;
	}

	/**
	 * 文字列を置換して返す
	 *
	 * フォーマット #予約語$桁数#
	 *   [1]予約語はCSVヘッダ名と同一とする
	 *   [2]桁数はバイト数のことである
	 *   [3]$桁数は省略可能。省略された場合はデータをそのままセットする
	 *   [4]桁数指定された場合は次の動作となる
	 *      (1) データが桁数オーバーの場合は、カットする
	 *      (2) データが桁数未満の場合は、後ろをブランク埋めする
	 *
	 * @param headerName 置換対象のヘッダ名（予約語）
	 * @param str 置換対象の文字列
	 * @param replacement 置換を行う文字列
	 * @return 置換後の文字列
	 */
	public static String replaceString(String headerName, String str, String replacement) {
		// 置換データがないものは処理しない
		if (CommonDataUtil.isNullOrEmpty(headerName) || CommonDataUtil.isNullOrEmpty(str)) {
			return str;
		}

		final String REGEXP_SIMPLE = "#" + headerName + "#";
		final String REGEXP_DIGIT  = "#" + headerName + "\\$(\\d+)#";
		final int FIND_START   = 0;
		final int GROUP_LENGTH = 1;

		String rtnStr = str;
		Matcher matcher;
		boolean isDigitReplace;
		StringBuilder replaceStr;
		String paramReplacement;
		int formatSize;

		while(true) {
			matcher = Pattern.compile(REGEXP_DIGIT).matcher(rtnStr);
			isDigitReplace = true;	// 桁数指定の有無(true:あり、false:なし)

			// 桁数指定か判定
			if (!matcher.find(FIND_START)) {
				isDigitReplace = false;
				matcher = Pattern.compile(REGEXP_SIMPLE).matcher(rtnStr);	// 桁数指定なしの置換文字を探す
			}

			// 桁数指定あり/なし 双方置換文字がない場合は、Loop抜け文字列を返却
			if (!matcher.find(FIND_START)) break;

			replaceStr = new StringBuilder();
			paramReplacement = CommonDataUtil.nz(replacement);

			// 置換後の文字を整形
			if (isDigitReplace) {
				// 整形用 桁数取得
				formatSize = NumberUtil.tryParseInteger(matcher.group(GROUP_LENGTH));

				// 置換文字列の整形
				replaceStr.append(StringUtility.cut(paramReplacement, formatSize));
				while (StringUtility.getByteLength(replaceStr.toString()) < formatSize) {
					replaceStr.append(StringUtility.HALF_SPACE);
				}
			} else {
				replaceStr.append(paramReplacement);
			}

			// 先頭の置換文字をルールに従い、置き換える
			rtnStr = matcher.replaceFirst(replaceStr.toString());
		}
		return rtnStr;
	}

	/**
	 * 文字列を置換して返す
	 *
	 * フォーマット #予約語$桁数#
	 *   [1]予約語はCSVヘッダ名と同一とする
	 *   [2]桁数はバイト数のことである
	 *   [3]$桁数は省略可能。省略された場合はフラグにより判定
	 *      true：データ全て置換  false：置換しない
	 *   [4]桁数指定された場合は次の動作となる
	 *      (1) データが桁数オーバーの場合は、前方をカットする
	 *      (2) データが桁数未満の場合は、前を0埋めする
	 *
	 * @param headerName 置換対象のヘッダ名（予約語）
	 * @param str 置換対象の文字列
	 * @param replacement 置換を行う文字列
	 * @param replaceFlg 桁数省略時の置換フラグ
	 * @return 置換後の文字列
	 */
	public static String replaceStringZeroPaddingCutFromBack(String headerName, String str, String replacement, Boolean replaceFlg) {
		// 置換データがないものは処理しない
		if (CommonDataUtil.isNullOrEmpty(headerName) || CommonDataUtil.isNullOrEmpty(str)) {
			return str;
		}

		final String REGEXP_SIMPLE = "#" + headerName + "#";
		final String REGEXP_DIGIT  = "#" + headerName + "\\$(\\d+)#";
		final int FIND_START   = 0;
		final int GROUP_LENGTH = 1;

		String rtnStr = str;
		Matcher matcher;
		boolean isDigitReplace;
		StringBuilder replaceStr;
		String paramReplacement;
		int formatSize;

		while(true) {
			matcher = Pattern.compile(REGEXP_DIGIT).matcher(rtnStr);
			isDigitReplace = true;	// 桁数指定の有無(true:あり、false:なし)
			if (!matcher.find(FIND_START)) {
				// 置換しない場合
				if(replaceFlg == NO_REPLACE) break;

				isDigitReplace = false;
				matcher = Pattern.compile(REGEXP_SIMPLE).matcher(rtnStr);
			}

			// 桁数指定あり/なし 双方置換文字がない場合は、Loop抜け文字列を返却
			if (!matcher.find(FIND_START)) break;

			replaceStr = new StringBuilder();
			paramReplacement = CommonDataUtil.nz(replacement);
			if (isDigitReplace) {
				// 整形用 桁数取得
				formatSize = NumberUtil.tryParseInteger(matcher.group(GROUP_LENGTH));

				// 置換文字列の整形
				replaceStr.append(StringUtility.cutFromBack(paramReplacement, formatSize));
				while (StringUtility.getByteLength(replaceStr.toString()) < formatSize) {
					replaceStr.insert(0, StringUtility.ZERO);
				}
			} else {
				replaceStr.append(paramReplacement);
			}

			// 先頭の置換文字をルールに従い、置き換える
			rtnStr = matcher.replaceFirst(replaceStr.toString());
		}
		return rtnStr;
	}
}
