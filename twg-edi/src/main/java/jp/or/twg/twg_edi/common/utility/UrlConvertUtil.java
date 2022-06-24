package jp.or.twg.twg_edi.common.utility;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.apache.commons.codec.binary.Base64;

/**
 * URLデータ変換ユーティリティ
 * @Deprecated このクラスでは文字コードを指定できないので Base64Util を使用してください
 * @author Yamaguchiha
 * @version 1.0
 */
public class UrlConvertUtil {

	/**
	 * 文字列 -> Base64文字列
	 *
	 * @param str 文字列
	 * @return Base64文字列
	 */
	public static String stringToBase64(String str) {
		if(CommonDataUtil.isNullOrEmpty(str)) {
			return null;
		}
		return byteArrayToBase64(str.getBytes());
	}

	/**
	 * バイト配列 -> Base64文字列
	 *
	 * @param data バイト配列
	 * @return Base64文字列
	 */
	public static String byteArrayToBase64(byte[] data) {
		if (data == null) {
			return null;
		}
		return new String(Base64.encodeBase64(data));
	}

	/**
	 * Base64文字列 -> 文字列
	 *
	 * @param base64Str Base64文字列
	 * @return 文字列
	 */
	public static String base64ToString(String base64Str) {
		if(CommonDataUtil.isNullOrEmpty(base64Str)) {
			return null;
		}
		return new String(base64ToByteArray(base64Str));
	}

	/**
	 * Base64文字列 -> バイト配列
	 *
	 * @param base64Str Base64文字列
	 * @return バイト配列
	 */
	public static byte[] base64ToByteArray(String base64Str) {
		if(CommonDataUtil.isNullOrEmpty(base64Str)) {
			return null;
		}

		try {
			return Base64.decodeBase64(base64Str.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// 処理なし
		}
		return null;
	}

	/**
	 * URLエンコード
	 *
	 * @param str 文字列
	 * @return URLエンコードされた文字列
	 */
	public static String encodeURL(String str) {
		if(CommonDataUtil.isNullOrEmpty(str)) {
			return null;
		}

		try {
			return URLEncoder.encode(str, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// 処理なし
		}
		return null;
	}

	/**
	 * URLデコード
	 *
	 * @param str URLエンコードされた文字列
	 * @return 文字列
	 */
	public static String decodeURL(String str) {
		if(CommonDataUtil.isNullOrEmpty(str)) {
			return null;
		}

		try {
			return URLDecoder.decode(str, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// 処理なし
		}
		return null;
	}

	/**
	 * エンコード
	 *
	 * @param data バイトデータ配列
	 * @return Base64にエンコードした文字列
	 */
	public static String encodeBase64Url(byte[] data) {
		return encodeURL(byteArrayToBase64(data));
	}

	/**
	 * デコード
	 *
	 * @param base64Data Base64にエンコードした文字列
	 * @return バイトデータ配列
	 */
	public static byte[] decodeBase64Url(String base64Data) {
		return base64ToByteArray(decodeURL(base64Data));
	}
}

