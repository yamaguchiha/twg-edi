package jp.or.twg.twg_edi.common.service;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.or.twg.twg_edi.common.resource.FileResourceReader;
import jp.or.twg.twg_edi.common.servlet.SimpleDownloadHelper;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.DateUtility;

public class DownloadService {

	/** Log4Jインスタンス */
	private final static Log log = LogFactory.getLog(DownloadService.class);

	/**
	 * ダウンロードヘルパー生成(データ文字列)
	 *
	 * @param contentType コンテンツタイプ
	 * @param charsetName 文字コード名
	 * @param filename ファイル名
	 * @param dataSting データ文字列
	 * @return ダウンロードヘルパー
	 */
	public SimpleDownloadHelper generateSimpleDownloadHelper(String contentType, String charsetName, String filename, String dataSting) {

		// 文字コード名設定チェック
		if (CommonDataUtil.isNullOrEmpty(charsetName)) {
			throw new RuntimeException("文字コード名が設定されていません");
		}

		// データ存在チェック
		if (CommonDataUtil.isNullOrEmpty(dataSting)) {
			return null;
		}

		// バイト配列に変換
		byte[] dataByteArray;
		try {
			dataByteArray = dataSting.getBytes(charsetName);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
			throw new RuntimeException("ダウンロードヘルパーの生成に失敗しました");
		}

		return generateSimpleDownloadHelper(contentType, filename, dataByteArray);
	}

	/**
	 * ダウンロードヘルパー生成(バイトデータ配列)
	 *
	 * @param contentType コンテンツタイプ
	 * @param filename ファイル名
	 * @param dataByteArray バイトデータ配列
	 * @return ダウンロードヘルパー
	 */
	public SimpleDownloadHelper generateSimpleDownloadHelper(String contentType, String filename, byte[] dataByteArray) {

		// コンテンツタイプ設定チェック
		if (CommonDataUtil.isNullOrEmpty(contentType)) {
			throw new RuntimeException("コンテンツタイプが設定されていません");
		}

		// ファイル名設定チェック
		if (CommonDataUtil.isNullOrEmpty(filename)) {
			throw new RuntimeException("ファイル名が設定されていません");
		}

		// データ存在チェック
		if (dataByteArray == null || dataByteArray.length == 0) {
			return null;
		}

		// ファイル名エンコード変換
		String convertedFilename = convertedFilename(filename);
		if (CommonDataUtil.isNullOrEmpty(convertedFilename)) {
			throw new RuntimeException("ファイル名の変換に失敗しました");
		}

		SimpleDownloadHelper downloadHelper = new SimpleDownloadHelper();
		downloadHelper.setContentType(contentType);
		downloadHelper.setContent(new ByteArrayInputStream(dataByteArray));
		downloadHelper.setFileName(convertedFilename);
		return downloadHelper;
	}

	/**
	 * ダウンロードファイル名生成
	 * @param fileExt 拡張子
	 * @return ダウンロードファイル名
	 */
	public static String generateTempDownloadFileName(String fileExt) {
		StringBuilder sb = new StringBuilder();
		sb.append(DateUtility.getStringFromDateYYYYMMDDHHMMSS(new Date()));
		sb.append("-");
		sb.append(UUID.randomUUID().toString());
		sb.append(".");
		sb.append(fileExt);
		return sb.toString();
	}

	/**
	 * ファイル名エンコード変換
	 *
	 * @param filename エンコード前のファイル名
	 * @return エンコードしたファイル名
	 */
	public static String convertedFilename(String filename) {
		if (!CommonDataUtil.isNullOrEmpty(filename)) {
			FileResourceReader fileResource = new FileResourceReader();
			try {
				//return new String(filename.toString().getBytes(fileResource.getCharsetShiftJIS()), fileResource.getCharsetLatin1());
				return URLEncoder.encode(filename, fileResource.getCharsetUTF8());
			} catch (UnsupportedEncodingException e) {
				log.error(e);
			}
		}
		return null;
	}
}
