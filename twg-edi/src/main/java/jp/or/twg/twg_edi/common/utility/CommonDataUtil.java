package jp.or.twg.twg_edi.common.utility;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * データ操作ユーティリティ
 *
 * @author twg
 * @version 1.0
 */
public class CommonDataUtil {

    public final static String 	BOOLEAN_CHAR_T = "Y";
    public final static String 	BOOLEAN_CHAR_F = "N";

    /**
	 * Null値変換(Microsoft Access VBA の Nz関数相当)
	 *
	 * @param value 値
	 * @param defaultvalue Null時の値
	 * @return 変換値
	 */
	@SuppressWarnings("unchecked")
	public static <T> T nz(Object value, T defaultvalue) {
		if (value == null) {
			return defaultvalue;
		}
		return (T) value;
	}

	/**
	 * Null値変換(Microsoft Access VBA の Nz関数相当)
	 *
	 * @param value 値
	 * @param defaultvalue Null時の値
	 * @return 変換値
	 */
	public static String nz(Object value, String defaultvalue) {
		if (value == null) {
			return defaultvalue;
		}
		return value.toString();
	}

	/**
	 * Null値変換(Microsoft Access VBA の Nz関数相当)
	 *
	 * @param value 値
	 * @return 変換値
	 */
	public static String nz(Object value) {
		return nz(value, "");
	}

	/**
	 * 未入力判定(Microsoft .net の IsNullOrEmpty関数相当)
	 *
	 * @param value 値
	 * @return true:Null値または空の文字列 / false:文字列あり
	 */
	public static boolean isNullOrEmpty(String value) {
		if (value == null) {
			return true;
		}
		return value.isEmpty();
	}

	/**
	 * 全て未入力判定(Microsoft .net の IsNullOrEmpty関数相当)
	 *
	 * @param valueArray 配列値
	 * @return true:全てNull値または空の文字列 / false:文字列あり
	 */
	public static boolean isAllNullOrEmptyArray(String... valueArray) {
		if (valueArray == null) {
			return true;
		}

		boolean empty = true;
		for (String value : valueArray) {
			if (!CommonDataUtil.isNullOrEmpty(value)) {
				empty = false;
				break;
			}
		}

		return empty;
	}

	/**
	 * 未入力判定(Microsoft .net の IsNullOrEmpty関数相当)
	 *
	 * @param value 値
	 * @return true:Null値または空のコレクション / false:コレクションデータあり
	 */
	public static <T> boolean isNullOrEmpty(Collection<T> value) {
		if (value == null) {
			return true;
		}
		return value.isEmpty();
	}

	/**
	 * 未入力判定(Microsoft .net の IsNullOrEmpty関数相当)
	 *
	 * @param value 値
	 * @return true:Null値または空のマップ / false:マップデータあり
	 */
	public static <K, V> boolean isNullOrEmpty(Map<K, V> value) {
		if (value == null) {
			return true;
		}
		return value.isEmpty();
	}

	/**
	 * 未入力判定(Microsoft .net の IsNullOrEmpty関数相当)
	 *
	 * @param value 値
	 * @return true:Null値または空の配列 / false:配列データあり
	 */
	public static <T> boolean isNullOrEmpty(T[] value) {
		if (value == null) {
			return true;
		}

		for (T obj : value) {
			if(obj != null) {
				return false;
			}
		}

		return true;
	}

	/**
	 * リストの最初の要素を取得します
	 * @param <T> 要素の型
	 * @param list リスト
	 * @return 要素
	 */
	public static <T> T getListFirstElement(List<T> list) {
		if(isNullOrEmpty(list)) {
			return null;
		}
		return list.get(0);
	}

	/**
	 * リスト縮小
	 *
	 * @param <T> リストのデータ型
	 * @param list 対象リスト
	 * @param maxSize 最大件数
	 */
	public static <T> List<T> reducedList(List<T> list, int maxSize) {
		if (CommonDataUtil.isNullOrEmpty(list) || list.size() <= maxSize) {
			return list;
		}

		List<T> resultList = new ArrayList<T>();
		for(int idx = 0; idx < maxSize; idx++) {
			resultList.add(list.get(idx));
		}
		return resultList;
	}

	/**
	 * LPADを行います。
	 * 文字列[str]の左に指定した文字列[addStr]を[len]に
	 * 満たすまで挿入します。
	 * @param str 対象文字列
	 * @param len 補充するまでの桁数（LPADを行った後のサイズを指定します。）
	 * @param addStr 挿入する文字列
	 * @return 変換後の文字列。
	 */
	public static String lpad(String str, int len, String addStr) {
		if (len < 1 || isNullOrEmpty(addStr)) {
			return null;
		}

		String baseStr = str;
		if (baseStr == null) {
			baseStr = "";
		}
		String baseAddStr = addStr;

		StringBuffer buffer = new StringBuffer(baseStr);
		while (len > buffer.length()) {
			int sum = buffer.length() + baseAddStr.length();
			if (sum > len) {
				baseAddStr = baseAddStr.substring(0, baseAddStr.length() - (sum - len));
				buffer.insert(0, baseAddStr);
			} else {
				buffer.insert(0, baseAddStr);
			}
		}
		return buffer.toString().substring(0, len);
	}

	/**
	 * RPADを行います。
	 * 文字列[str]の右に指定した文字列[addStr]を[len]に
	 * 満たすまで挿入します。
	 * @param str 対象文字列
	 * @param len 補充するまでの桁数（RPADを行った後のサイズを指定します。）
	 * @param addStr 挿入する文字列
	 * @return 変換後の文字列。
	 */
	public static String rpad(String str, int len, String addStr) {
		if (len < 1 || isNullOrEmpty(addStr)) {
			return null;
		}

		String baseStr = str;
		if (baseStr == null) {
			baseStr = "";
		}

		StringBuffer buffer = new StringBuffer(baseStr);
		while (len > buffer.length()) {
			buffer.append(addStr);
		}
		return buffer.toString().substring(0, len);
	}

	/**
	 * BOOLEAN_CHAR -> booleanの変換を行う
	 *
	 * @param value BOOLEAN_CHAR
	 * @return boolean値
	 */
	public static boolean booleanCharToBoolean(String value) {
		return BOOLEAN_CHAR_T.equals(value);
	}

	/**
	 * boolean -> BOOLEAN_CHARの変換を行う
	 *
	 * @param value boolean値
	 * @return BOOLEAN_CHAR
	 */
	public static String booleanToBooleanCharTo(boolean value) {
		return value ? BOOLEAN_CHAR_T : BOOLEAN_CHAR_F;
	}

	/**
	 * String -> List<Byte>の変換を行う
	 * @param src String
	 * @return List<Byte>
	 * @throws UnsupportedEncodingException
	 */
	public static List<Byte> stringToByteClassList(String src) throws UnsupportedEncodingException	{
		return Arrays.asList(byteDataArrayToByteClassArray(src.getBytes("SJIS")));
	}

	/**
	 * byte[] -> Byte[]の変換を行う
	 * @param src byte[]
	 * @return Byte[]
	 * @throws UnsupportedEncodingException
	 */
	public static Byte[] byteDataArrayToByteClassArray(byte[] src) {
		if (src == null) {
			return null;
		}

		Byte[] dstByte = new Byte[src.length];
		for (int idx = 0; idx < src.length; idx++) {
			dstByte[idx] = Byte.valueOf(src[idx]);
		}
		return dstByte;
	}

	/**
	 * Byte[] -> byte[]の変換を行う
	 * @param src Byte[]
	 * @return byte[]
	 * @throws UnsupportedEncodingException
	 */
	public static byte[] byteClassArrayToByteDataArray(Byte[] src) {
		if (src == null) {
			return null;
		}

		byte[] dstByte = new byte[src.length];
		for (int idx = 0; idx < src.length; idx++) {
			dstByte[idx] = src[idx].byteValue();
		}
		return dstByte;
	}

	/**
	 * 文字列結合
	 *
	 * @param stringArray String配列
	 * @return 結合した文字列
	 */
	public static String catString(String[] stringArray) {
		StringBuffer sb = new StringBuffer();
		for (String str : stringArray) {
			if (str != null) {
				sb.append(str);
			}
		}
		return sb.toString();
	}

	/**
	 * 対象文字列削除
	 *
	 * @param srcString 元文字列
	 * @param eraseStrings 削除文字列
	 * @return 対象文字列が削除された文字列
	 */
	public static String eraseString(String srcString, String... eraseStrings) {
		String resultString = srcString;
		if (CommonDataUtil.isNullOrEmpty(resultString) || CommonDataUtil.isAllNullOrEmptyArray(eraseStrings)) {
			return resultString;
		}

		// 文字列の長い順にソートのためのリスト作成
		List<String> eraseStringList = new ArrayList<String>();
		for (String eraseString : eraseStrings) {
			eraseStringList.add(eraseString);
		}

		// 文字列の長い順にソート
		List<String> sortedEraseStringList = stringListSortByLongLength(eraseStringList);

		for (String eraseString : sortedEraseStringList) {

			// 削除実行
			resultString = resultString.replaceAll(eraseString, "");

			// 文字列がなくなったら削除終了
			if (CommonDataUtil.isNullOrEmpty(resultString)) {
				break;
			}
		}
		return resultString;
	}

	/**
	 * 文字列分解
	 *
	 * @param value 文字列
	 * @return String配列文字列
	 */
	public static String[] splitString(String value) {
		char[] charArray = value.toCharArray();
		int len = charArray.length;
		String[] stringArray = new String[len];
		for (int idx = 0; idx < len; idx++) {
			stringArray[idx] = String.valueOf(charArray[idx]);
		}
		return stringArray;
	}

	/**
	 * 内容の比較
	 *
	 * @param <T> 比較対象のデータ型
	 * @param thisValue 値
	 * @param foreignValue 相手の値
	 * @return true:同じ false:違う
	 */
	public static <T> boolean compareValue(T thisValue, T foreignValue) {
		if (thisValue == null) {
			if (foreignValue != null) {
				return false;
			}
		} else {
			if (!thisValue.equals(foreignValue)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 文字列の長い順にソート
	 *
	 * @param list リスト
	 * @return 文字列の長い順にソートしたリスト
	 */
	public static List<String> stringListSortByLongLength(List<String> list) {
		if (CommonDataUtil.isNullOrEmpty(list)) {
			return list;
		}

		List<String> resultList = new ArrayList<String>(list);
		Collections.sort(resultList, new Comparator<String>() {
			@Override
			public int compare(String string1, String string2) {
				int lenParam1 = string1.length();
				int lenParam2 = string2.length();

				// 長いもの順に並び替え
				if (lenParam1 < lenParam2) {
					return 1;
				} else if (lenParam1 > lenParam2) {
					return -1;
				}

				// 文字コード順に並び替え
				return string1.compareTo(string2);
			}
		});

		return resultList;
	}

}
