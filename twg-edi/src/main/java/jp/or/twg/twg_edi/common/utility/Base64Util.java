package jp.or.twg.twg_edi.common.utility;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Base64ユーティリティ
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public class Base64Util {

	/** Log4Jインスタンス */
	private static final Log log = LogFactory.getLog(Base64Util.class);

	/**
	 * 文字列 -> Base64文字列
	 *
	 * @param str 文字列
	 * @param charsetName 文字コード
	 * @return Base64文字列
	 */
	public static String stringToBase64(String str, String charsetName) {
		if(CommonDataUtil.isNullOrEmpty(str) || CommonDataUtil.isNullOrEmpty(charsetName)) {
			return null;
		}
		byte[] bytes = null;
		try {
			bytes = str.getBytes(charsetName);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
		} catch (RuntimeException e) {
			log.error(e);
		} catch (Exception e) {
			log.error(e);
		}
		return byteArrayToBase64(bytes, charsetName);
	}

	/**
	 * バイト配列 -> Base64文字列
	 *
	 * @param data バイト配列
	 * @param charsetName 文字コード
	 * @return Base64文字列
	 */
	public static String byteArrayToBase64(byte[] data, String charsetName) {
		if (data == null || CommonDataUtil.isNullOrEmpty(charsetName)) {
			return null;
		}
		try {
			return new String(Base64.encodeBase64(data), charsetName);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
		} catch (RuntimeException e) {
			log.error(e);
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}

	/**
	 * Base64文字列 -> 文字列
	 *
	 * @param base64Str Base64文字列
	 * @param charsetName 文字コード
	 * @return 文字列
	 */
	public static String base64ToString(String base64Str, String charsetName) {
		if(CommonDataUtil.isNullOrEmpty(base64Str) || CommonDataUtil.isNullOrEmpty(charsetName)) {
			return null;
		}
		try {
			return new String(base64ToByteArray(base64Str, charsetName), charsetName);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
		} catch (RuntimeException e) {
			log.error(e);
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}

	/**
	 * Base64文字列 -> バイト配列
	 *
	 * @param base64Str Base64文字列
	 * @param charsetName 文字コード
	 * @return バイト配列
	 */
	public static byte[] base64ToByteArray(String base64Str, String charsetName) {
		if(CommonDataUtil.isNullOrEmpty(base64Str) || CommonDataUtil.isNullOrEmpty(charsetName)) {
			return null;
		}

		try {
			return Base64.decodeBase64(base64Str.getBytes(charsetName));
		} catch (UnsupportedEncodingException e) {
			log.error(e);
		} catch (RuntimeException e) {
			log.error(e);
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}

	/**
	 * URLエンコード
	 *
	 * @param str 文字列
	 * @param charsetName 文字コード
	 * @return URLエンコードされた文字列
	 */
	public static String encodeURL(String str, String charsetName) {
		if(CommonDataUtil.isNullOrEmpty(str) || CommonDataUtil.isNullOrEmpty(charsetName)) {
			return null;
		}

		try {
			return URLEncoder.encode(str, charsetName);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
		} catch (RuntimeException e) {
			log.error(e);
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}

	/**
	 * URLデコード
	 *
	 * @param str URLエンコードされた文字列
	 * @param charsetName 文字コード
	 * @return 文字列
	 */
	public static String decodeURL(String str, String charsetName) {
		if(CommonDataUtil.isNullOrEmpty(str) || CommonDataUtil.isNullOrEmpty(charsetName)) {
			return null;
		}

		try {
			return URLDecoder.decode(str, charsetName);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
		} catch (RuntimeException e) {
			log.error(e);
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}

	/**
	 * エンコード
	 *
	 * @param data バイトデータ配列
	 * @param charsetName 文字コード
	 * @return Base64にエンコードした文字列
	 */
	public static String encodeBase64Url(byte[] data, String charsetName) {
		return encodeURL(byteArrayToBase64(data, charsetName), charsetName);
	}

	/**
	 * デコード
	 *
	 * @param base64Data Base64にエンコードした文字列
	 * @param charsetName 文字コード
	 * @return バイトデータ配列
	 */
	public static byte[] decodeBase64Url(String base64Data, String charsetName) {
		return base64ToByteArray(decodeURL(base64Data, charsetName), charsetName);
	}
}
