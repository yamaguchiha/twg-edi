package jp.or.twg.twg_edi.common.utility;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 暗号化・復号化ユーティリティ
 *
 * @author yamaguchiha
 * @version 1.0
 */
public class CipherUtil {

	/** Log4Jインスタンス */
	private static final Log log = LogFactory.getLog(CipherUtil.class);

	/** 暗号化キー */
	SecretKeySpec secretKeySpec;

	/** 文字コード名 */
	static final String CHARSET_NAME = "UTF-8";

	/**
	 * コンストラクタ
	 *
	 * @param algorithm 暗号化アルゴリズム
	 * @param key キー
	 */
	public CipherUtil(String algorithm, String key) {
		if (CommonDataUtil.isNullOrEmpty(algorithm)) {
			throw new RuntimeException("暗号化アルゴリズムが設定されていません");
		}
		if (CommonDataUtil.isNullOrEmpty(key)) {
			throw new RuntimeException("キーが設定されていません");
		}
		try {
			secretKeySpec = new SecretKeySpec(key.getBytes(CHARSET_NAME), algorithm);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
			throw new RuntimeException("暗号化・復号化ユーティリティの生成に失敗しました");
		}

		// 一旦生成して暗号化アルゴリズム・キーを検証する
		try {
			Cipher cipher = Cipher.getInstance(secretKeySpec.getAlgorithm());
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		} catch (NoSuchAlgorithmException e) {
			log.error(e);
			throw new RuntimeException("暗号化アルゴリズムが異常です");
		} catch (NoSuchPaddingException e) {
			log.error(e);
			throw new RuntimeException("暗号化アルゴリズムが異常です");
		} catch (InvalidKeyException e) {
			log.error(e);
			throw new RuntimeException("キーが異常です(キーは16文字で指定してください)");
		}
	}

	/**
	 * 暗号化
	 *
	 * @param clearText 平文
	 * @return 暗号文
	 */
	public String encrypt(String clearText) {
		if (clearText == null) {
			return null;
		}

		try {
			byte[] originalBytes = clearText.getBytes(CHARSET_NAME);
			byte[] encryptBytes = executeCipher(Cipher.ENCRYPT_MODE, originalBytes);
			byte[] encryptBytesBase64 = Base64.encodeBase64(encryptBytes, false);
			return new String(encryptBytesBase64, CHARSET_NAME);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
		}
		return null;
	}

	/**
	 * 復号化
	 *
	 * @param cipherText 暗号文
	 * @return 平文
	 */
	public String decrypt(String cipherText) {
		if (cipherText == null) {
			return null;
		}

		try {
			byte[] encryptBytes = Base64.decodeBase64(cipherText.getBytes(CHARSET_NAME));
			byte[] originalBytes = executeCipher(Cipher.DECRYPT_MODE, encryptBytes);
			return new String(originalBytes, CHARSET_NAME);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
		}
		return null;
	}

	/**
	 * 暗号化・復号化実行
	 *
	 * @param opmode 実行モード
	 * @param baseBytes 対象バイト配列
	 * @return 実行後のバイト配列
	 */
	byte[] executeCipher(int opmode, byte[] baseBytes) {
		try {
			Cipher cipher = Cipher.getInstance(secretKeySpec.getAlgorithm());
			cipher.init(opmode, secretKeySpec);
			return cipher.doFinal(baseBytes);
		} catch (BadPaddingException e) {
			log.error(e);
		} catch (IllegalBlockSizeException e) {
			log.error(e);
		} catch (InvalidKeyException e) {
			log.error(e);
		} catch (NoSuchAlgorithmException e) {
			log.error(e);
		} catch (NoSuchPaddingException e) {
			log.error(e);
		}
		return null;
	}

}
