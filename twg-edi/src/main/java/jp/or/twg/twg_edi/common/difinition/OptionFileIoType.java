package jp.or.twg.twg_edi.common.difinition;

import jp.or.twg.twg_edi.common.utility.Base64Util;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.UrlConvertUtil;

/**
 * ファイル入出力種別
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public enum OptionFileIoType {


	/** 差換かんばんダウンロード */
	EXCHANGE_KANBAN_DOWNLOAD {
		/* (non-Javadoc)
		 * @see jp.co.gwise.kazura.jama.definition.FileIoType#convertByteArray(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
		 */
		@Override
		public byte[] convertByteArray(String value, String contentType, String charsetName, String fileName) {
			return Base64Util.base64ToByteArray(value, charsetName);
		}
	},

	/** 予備かんばんダウンロード */
	RESERVE_KANBAN_DOWNLOAD {
		/* (non-Javadoc)
		 * @see jp.co.gwise.kazura.jama.definition.FileIoType#convertByteArray(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
		 */
		@Override
		public byte[] convertByteArray(String value, String contentType, String charsetName, String fileName) {
			return Base64Util.base64ToByteArray(value, charsetName);
		}
	},

	/** かんばん読取支給_未発行納品書ダウンロード */
	SUPPLY_UNISSUED_REPORT_DOWNLOAD {
		/* (non-Javadoc)
		 * @see jp.co.gwise.kazura.jama.definition.FileIoType#convertByteArray(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
		 */
		@Override
		public byte[] convertByteArray(String value, String contentType, String charsetName, String fileName) {
			return Base64Util.base64ToByteArray(value, charsetName);
		}
	},
	;

	/**
	 * 値 -> バイト配列変換
	 *
	 * @param value 値
	 * @param contentType ファイル種別
	 * @param charsetName 文字コード名
	 * @param fileName ファイル名
	 * @return バイト配列
	 */
	abstract public byte[] convertByteArray(String value, String contentType, String charsetName, String fileName);

	/**
	 * テキスト用値 -> バイト配列変換既定
	 *
	 * @param value 値
	 * @param charsetName 文字コード名
	 * @return バイト配列
	 */
	byte[] defaultConvertByteArrayByText(String value, String charsetName) {
		if (value == null) {
			return null;
		}
		try {
			return value.getBytes(charsetName);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Base64用値 -> バイト配列変換既定
	 *
	 * @param value 値
	 * @return バイト配列
	 */
	byte[] defaultConvertByteArrayByBase64(String value) {
		return UrlConvertUtil.base64ToByteArray(value);
	}

	/**
	 * ファイル入出力種別取得
	 *
	 * @param fileIoTypeId ファイル入出力種別ID
	 * @return ファイル入出力種別
	 */
	public static OptionFileIoType getType(String fileIoTypeId) {
		if (!CommonDataUtil.isNullOrEmpty(fileIoTypeId)) {
			try {
				return valueOf(fileIoTypeId);
			} catch (IllegalArgumentException e) {
				// 処理なし
			}
		}
		return null;
	}

//	/**
//	 * データ検証
//	 *
//	 * @param fileIoTypeId ファイル入出力種別ID
//	 * @return エラーメッセージ
//	 */
//	public static Messages validate(String fileIoTypeId) {
//		Messages ret = new Messages();
//
//		if (CommonDataUtil.isNullOrEmpty(fileIoTypeId)) {
//			ret.add("", new Message("kazura.jama.error.validate.unsetting", new Message("kazura.jama.error.validate.FileIoType").toString()));
//			return ret;
//		}
//
//		// 対象外
//		if (getType(fileIoTypeId) == null) {
//			ret.add("", new Message("kazura.jama.error.validate.illegalargument", new Message("kazura.jama.error.validate.FileIoType").toString()));
//		}
//
//		return ret;
//	}

}
