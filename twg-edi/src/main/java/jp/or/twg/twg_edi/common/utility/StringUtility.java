package jp.or.twg.twg_edi.common.utility;

import java.io.UnsupportedEncodingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.or.twg.twg_edi.common.model.FixDate;
import jp.or.twg.twg_edi.common.resource.TwgResourceReader;

/**
 * 文字列ユーティリティ
 *
 * @author g-wise
 * @version 1.0
 */
public class StringUtility {

	/** Log4Jインスタンス */
	private static final Log log = LogFactory.getLog(StringUtility.class);

	/** 日付区切り文字 */
	static final String DATE_DELIMITER = "/";

	/** 時刻区切り文字 */
	static final String TIME_DELIMITER = ":";

	/** 値区切り文字 */
	static final String VALUE_DELIMITER = ":";

	/** 半角スペース */
	final static char HALF_SPACE = ' ';

	/** 全角スペース */
	final static char WIDE_SPACE = '　';

	/** ゼロ */
	final static char ZERO = '0';

	/**
	 * 指定のバイト数で文字列をカットする
	 *
	 * エンコードにかかわらず全角は一律２バイト
	 *
	 * @param str			String ソース文字列
	 * @param maxLength		int    指定バイト数
	 * @return 指定のバイト数でカットした文字列
	 */
	public static String cut(String str, int maxLength){

		if (str == null) {
			return null;
		}

		if (maxLength == 0) {
			return "";
		}

		StringBuffer returnStrBuffer = new StringBuffer();
		int checkLength = 0;
		for (int i = 0 ; i < str.length() ; i++) {
			//半角カナ＆半角句読点チェック 文字コードによって１バイトだったり
			//２バイトだったりするのでUnicodeのまま確認します。
			int hankaku = str.substring(i, i + 1).toCharArray()[0];
			if (0xFF61 <= hankaku &&  hankaku <= 0xFF9F) {
				checkLength++;
			} else {
				//全角が2バイトのエンコードも3バイトのエンコードも一律2バイト扱い
				checkLength += (str.substring(i, i + 1).getBytes().length == 1) ? 1 : 2;
			}
			if (checkLength <= maxLength) {
				returnStrBuffer.append(str.substring(i, i + 1));
			} else {
				break;
			}
		}

		return returnStrBuffer.toString();
	}

	/**
	 * 指定のバイト数で文字列をカットする(前方をカット)
	 *
	 * エンコードにかかわらず全角は一律２バイト
	 *
	 * @param str			String ソース文字列
	 * @param maxLength		int    指定バイト数
	 * @return 指定のバイト数でカットした文字列
	 */
	public static String cutFromBack(String str, int maxLength){

		if (str == null) {
			return null;
		}

		if (maxLength == 0) {
			return "";
		}

//		if(str.length() * 2 <= maxLength){
//			return str;
//		}

		StringBuffer returnStrBuffer = new StringBuffer();
		int checkLength = maxLength;

		for (int i = str.length() ; i > 0 ; i--) {
			//半角カナ＆半角句読点チェック 文字コードによって１バイトだったり
			//２バイトだったりするのでUnicodeのまま確認します。
			int hankaku = str.substring(i - 1, i).toCharArray()[0];
			if (0xFF61 <= hankaku &&  hankaku <= 0xFF9F) {
				checkLength--;
			} else {
				//全角が2バイトのエンコードも3バイトのエンコードも一律2バイト扱い
				checkLength -= (str.substring(i - 1, i).getBytes().length == 1) ? 1 : 2;
			}
			if (checkLength >= 0) {
				returnStrBuffer.insert(0, str.substring(i - 1, i));
			} else {
				break;
			}
		}

		return returnStrBuffer.toString();
	}

	/**
	 * 文字列のバイト数を返す
	 *
	 * エンコードにかかわらず全角は一律２バイトで計算する
	 *
	 * @param str		String ソース文字列
	 * @return int バイト数（全角を2バイト固定で計算）
	 */
	public static int getByteLength(String str){
		int length = 0;

		if (!CommonDataUtil.isNullOrEmpty(str)) {
			for (int i = 0 ; i < str.length() ; i++) {
				//半角カナ＆半角句読点チェック 文字コードによって１バイトだったり
				//２バイトだったりするのでUnicodeのまま確認します。
				int hankaku = str.substring(i, i + 1).toCharArray()[0];
				if (0xFF61 <= hankaku &&  hankaku <= 0xFF9F) {
					length++;
				} else {
					//全角が2バイトのエンコードも3バイトのエンコードも一律2バイト扱い
					length += (str.substring(i, i + 1).getBytes().length == 1) ? 1 : 2;
				}
			}
		}

		return length;
	}

	/**
	 * 半角数字以外を削除する
	 *
	 * @param str		String ソース文字列
	 * @return 半角数字以外を削除した文字列
	 */
	public static String getDeleteNonNumber(String str){
		if (str != null) {
			return str.replaceAll("[^0-9]", "");
		}
		return null;
	}

	/**
	 * RTrim処理
	 *
	 * @param str	String ソース文字列
	 * @return      後ろスペースを除いた文字列
	 */
	public static String rtrim(String str) {
		if (CommonDataUtil.isNullOrEmpty(str)) {
			return str;
		}

		char[] ary = str.toCharArray();

		for (int index = ary.length-1; 0 <= index; index--) {
			if (ary[index] == HALF_SPACE || ary[index] == WIDE_SPACE) {
				continue;
			}
			return new String(ary, 0, index + 1);
		}

		return "";
	}

	/**
	 * 入力文字列がNullの場合はオリジナル値引数を返す
	 *
	 * @param value      入力文字列
	 * @param original   オリジナルの値
	 * @return 文字列
	 */
	public static String getStringValueOrOriginal(String value, Object original) {
		if (value == null) {
			if (original != null) {
				return  original.toString();
			}
			return null;
		}
		return value;
	}

	/**
	 * 入力文字列がNull、ブランクの場合はオリジナル値引数を返す
	 *
	 * @param value      入力文字列
	 * @param original   オリジナルの値
	 * @return 文字列
	 */
	public static String getStringValueOrOriginalWhenBlankOrNull(String value, Object original) {
		if (CommonDataUtil.isNullOrEmpty(value)) {
			if (original != null) {
				return  original.toString();
			}
			return null;
		}
		return value;
	}

	/**
	 * 文字列がnull、空文字のものは、nullを返す
	 * それ以外は文字列をそのまま返す
	 *
	 * @param value 文字列
	 * @return 文字列
	 */
	public static String blankToNull(String value) {
		return CommonDataUtil.isNullOrEmpty(value) ? null : value;
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
	public static String getStringByEncodeSize(String org, int size, String addStr, String encoding) throws UnsupportedEncodingException {
		StringBuffer buffer = new StringBuffer();

		// 変換元がnullまたは空の場合はaddStrで指定サイズ埋め尽くした文字列を返す
		if (org == null || org.length() == 0) {
			StringBuffer buf = new StringBuffer();
			for(int i = 0; i < size; i++) {
				buf.append(addStr);
			}
			return buf.toString();
		}

		// 指定サイズが負または指定サイズと文字コード変換後のサイズが等しい場合はそのまま返す
		if(size <= 0 || org.getBytes(encoding).length == size) {
			return org;
		}

		// 文字コード変換後のサイズが指定サイズより小さい場合はaddStrを追加して返す
		if (org.getBytes(encoding).length < size) {
			buffer.append(org);
			int blankLength = size - org.getBytes(encoding).length;
			for(int i = 0; i < blankLength; i++) {
				buffer.append(addStr);
			}
		} else {
			// org.getBytes(encoding).length == sizeの場合は最初に弾かれている
			StringBuilder tmpSb = new StringBuilder();

			 for (int i = 0; i < org.length(); i++) {
				 // 1文字取得
				 String cut = org.substring(i, i + 1);

				 // 現在のtmpSbのバイトサイズ＋取得した文字のバイトサイズが指定されてサイズを超えたら
				 if (size < tmpSb.toString().getBytes(encoding).length + cut.getBytes(encoding).length) {
					 // 指定されたサイズ未満の場合に指定サイズになるまで挿入文字列を追加する
					 while(size > tmpSb.toString().getBytes(encoding).length) {
						 tmpSb.append(addStr);
					 }
					 buffer.append(tmpSb.toString());
					 break;
				 }
				 tmpSb.append(cut);
			 }
		}
		return buffer.toString();
	}

	// 20211213 nishidat OPT開発用に追加 汎用的に使用できるため、Utilityに実装
	/**
	 * 文字列を指定桁数分返す<br>
	 * TIPS:2byte文字の中間から2byte文字の中間までを指定した場合、後の2byte文字がカットされず取得できてしまうので注意。<br>
	 *  例）データ：ＡＢＣＤＥ/開始：3/桁：4 → 結果：ＣＤ<br>
	 *  （ホントは" Ｃ "みたいになるはずが処理的に前cut→後cutするため余剰に取得される）
	 * @param data 変換元データ
	 * @param startByte 開始バイト位置
	 * @param length 桁数
	 * @return 文字列
	 */
	public static String getStringByByte(String data, int startByte, int length) {
		String val = "";
		if(startByte < 0) return val;
		if(CommonDataUtil.isNullOrEmpty(data)) return data;	// 値が無ければそのまま返却

		int orgLen = getByteLength(data);
		if(orgLen <= startByte) return val;					// 桁数＜開始位置はブランク

		val = data;
		if(startByte != 0) {
			val = cutFromBack(data, orgLen - startByte);	// 開始位置までを削除
		}

		if(getByteLength(val) <= length) {
			// 桁超過
		} else {
			val = cut(val, length);							// 指定桁数分取得
		}
		return val;
	}

	/**
	 * 日付文字列をYYYY/MMに変換します
	 *
	 * @param value 日付文字列 YYYYMM
	 * @return YYYY/MM
	 */
	public static String formatDateYYYYMM(String value) {
		if (CommonDataUtil.isNullOrEmpty(value)) {
			return "";
		}
		return value.length() >= 6 ? value.substring(0, 4) + DATE_DELIMITER + value.substring(4, 6) : value;
	}

	/**
	 * 日付文字列をYYYY/MM/DDに変換します
	 *
	 * @param value 日付文字列 YYYYMMDD
	 * @return YYYY/MM/DD
	 */
	public static String formatDateYYYYMMDD(String value) {
		String dateStr;
		if (CommonDataUtil.isNullOrEmpty(value)) {
			dateStr = "";
		} else if(value.length() >= 8) {
			StringBuilder sb = new StringBuilder(value);
			dateStr = sb.insert(4, DATE_DELIMITER).insert(7, DATE_DELIMITER).substring(0, 10);
		} else {
			dateStr = value;
		}
		return dateStr;
	}

	/**
	 * 日付文字列をYYYY/MM/DDに変換します。
	 * 00000000か99999999の場合、無期限の表記を行います。
	 *
	 * @param value 日付文字列 YYYYMMDD
	 * @return YYYY/MM/DDまたは無期限表記
	 */
	public static String formatDateYYYYMMDDOrINFINITY(String value) {
		String dateStr;
		if (CommonDataUtil.isNullOrEmpty(value)) {
			dateStr = "";
		} else if(value.equals(FixDate.STRING_DATE_RANGE.MIN) || value.equals(FixDate.STRING_DATE_RANGE.MAX)){
			dateStr = new TwgResourceReader().getString("StringUtility.INFINITY");
		} else if(value.length() >= 8) {
			StringBuilder sb = new StringBuilder(value);
			dateStr = sb.insert(4, DATE_DELIMITER).insert(7, DATE_DELIMITER).substring(0, 10);
		} else {
			dateStr = value;
		}
		return dateStr;
	}

	/**
	 * 日付文字列をYYYY/MM/DDに変換します。
	 * 空文字の場合、無期限の表記を行います。
	 *
	 * @param value 日付文字列 YYYYMMDD
	 * @return YYYY/MM/DDまたは無期限表記
	 */
	public static String formatDateYYYYMMDDOrEmpty(String value) {
		String dateStr;
		if (CommonDataUtil.isNullOrEmpty(value)) {
			dateStr = new TwgResourceReader().getString("StringUtility.INFINITY");
		} else if(value.length() == 8) {
			StringBuilder sb = new StringBuilder(value);
			dateStr = sb.insert(4, DATE_DELIMITER).insert(7, DATE_DELIMITER).substring(0, 10);
		} else {
			dateStr = value;
		}
		return dateStr;
	}

	/**
	 * NULLか空白の場合、無期限の表記を行います。
	 *
	 * @param value String
	 * @return valueのままか無期限表記
	 */
	public static String formatINFINITY(String value) {
		String str;
		if (CommonDataUtil.isNullOrEmpty(value)) {
			str = new TwgResourceReader().getString("StringUtility.INFINITY");
		} else {
			str = value;
		}
		return str;
	}

	/**
	 * 日付文字列をYYYY/MM/DD HH:MMに変換します
	 *
	 * @param value 日付文字列 YYYYMMDDHHMM
	 * @return YYYY/MM/DD HH:MM
	 */
	public static String formatDateYYYYMMDDHHMM(String value) {
		String dateStr;
		if (CommonDataUtil.isNullOrEmpty(value)) {
			dateStr = "";
		} else if (value.length() >= 12) {
			StringBuilder sb = new StringBuilder(value);
			dateStr = sb.insert(4, DATE_DELIMITER).insert(7, DATE_DELIMITER).insert(10, " ").insert(13, TIME_DELIMITER).substring(0, 16);
		} else {
			dateStr = value;
		}
		return dateStr;
	}

	/**
	 * 日付文字列をYYYY/MM/DD<改行>HH:MMに変換します
	 *
	 * @param value 日付文字列 YYYYMMDDHHMM
	 * @return YYYY/MM/DD<改行>HH:MM
	 */
	public static String formatDateYYYYMMDD_BR_HHMM(String value) {
		String dateStr;
		if (CommonDataUtil.isNullOrEmpty(value)) {
			dateStr = "";
		} else if (value.length() >= 12) {
			StringBuilder sb = new StringBuilder(value);
			dateStr = sb.insert(4, DATE_DELIMITER).insert(7, DATE_DELIMITER).insert(10, "<BR>").insert(16, TIME_DELIMITER).substring(0, 19);
		} else {
			dateStr = value;
		}
		return dateStr;
	}
	/**
	 * 日付文字列をHH:MMに変換します
	 *
	 * @param value 日付文字列 YYYYMMDDHHMM
	 * @return 日付文字列 HH:MM
	 */
	public static String formatDateHHMM(String value) {
		String dateStr;
		if (CommonDataUtil.isNullOrEmpty(value) || value.length() < 12) {
			dateStr = "";
		} else {
			StringBuilder sb = new StringBuilder(value);
			dateStr = sb.insert(10, TIME_DELIMITER).substring(8, 13);
		}
		return dateStr;
	}

	/**
	 * 時刻文字列をHH:MMに変換します
	 *
	 * @param value 時刻文字列 HHMM
	 * @return 時刻文字列 HH:MM
	 */
	public static String formatTimeHHMM(String value) {
		String timeStr;
		if (CommonDataUtil.isNullOrEmpty(value) || value.length() < 4) {
			timeStr = "";
		} else {
			StringBuilder sb = new StringBuilder(value);
			timeStr = sb.insert(2, TIME_DELIMITER).substring(0, 5);
		}
		return timeStr;
	}

	/**
	 * 日付 + 便Noの文字列から便Noのみを取り出す
	 *
	 * @param value YYYYMMDDPP
	 * @return 便No（前0なし）
	 */
	public static String getShipmentNoFromDateTimePeriod(String value) {
		if (value != null && value.length() > 8) {
			try {
				return Integer.valueOf(value.substring(8)).toString();
			} catch (Exception e) {
				log.error(e);
			}
		}
		return "";
	}

}
