package jp.or.twg.twg_edi.common.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.difinition.OptionFileIoType;
import jp.or.twg.twg_edi.common.entity.OptionFileIoData;
import jp.or.twg.twg_edi.common.entity.OptionFileIoHistory;
import jp.or.twg.twg_edi.common.servlet.SimpleDownloadHelper;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class HelperService {

	/**
	 * ダウンロードヘルパー取得
	 *
	 * @return ダウンロードヘルパー
	 */
	public SimpleDownloadHelper getSimpleDownloadHelper(OptionFileIoHistory fileIoHistory, OptionFileIoData fileIoData) {
		if (CommonDataUtil.isNullOrEmpty(fileIoData.getContentType())) {
			throw new RuntimeException("ContentTypeが設定されていません");
		}

		if (CommonDataUtil.isNullOrEmpty(fileIoData.getCharsetName())) {
			throw new RuntimeException("文字コード名が設定されていません");
		}

		if (CommonDataUtil.isNullOrEmpty(fileIoData.getFileName())) {
			throw new RuntimeException("ファイル名が設定されていません");
		}

		if (CommonDataUtil.isNullOrEmpty(fileIoData.getValue())) {
			return null;
		}

		// ファイル入出力種別取得
		OptionFileIoType fileIoType = fileIoHistory.getFileIoType();
		if (fileIoType == null) {
			return null;
		}

		// バイト配列に変換
		byte[] array = fileIoType.convertByteArray(fileIoData.getValue(), fileIoData.getContentType(), fileIoData.getCharsetName(), fileIoData.getFileName());

		// ダウンロードヘルパー生成
		return new DownloadService().generateSimpleDownloadHelper(fileIoData.getContentType(), fileIoData.getFileName(), array);
	}



}
