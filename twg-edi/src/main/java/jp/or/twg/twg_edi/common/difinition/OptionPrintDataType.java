package jp.or.twg.twg_edi.common.difinition;

import jp.or.twg.twg_edi.common.resource.FileOptionResourceReader;

/**
 * オプション用印刷データ種別
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public enum OptionPrintDataType {

	/** 未発行 差換かんばん */ EXCHANGE_KANBAN		(1,		"kanban.exchange",	false,	JamaReportPrintType.KANBAN,	OptionThreadCategory.MakeExchangeKanbanService,	OptionFileIoType.EXCHANGE_KANBAN_DOWNLOAD),
	/** 未発行 予備かんばん */ RESERVE_KANBAN		(2,		"kanban.reserve",	false,	JamaReportPrintType.KANBAN,	OptionThreadCategory.MakeReserveKanbanService,	OptionFileIoType.RESERVE_KANBAN_DOWNLOAD),
	;

	/** ID */
	private final Integer id;

	/** リソース名 */
	private final String resource;

	/** JAMA帳票印刷種別 */
	private final JamaReportPrintType printType;

	/** スレッドカテゴリー */
	private final OptionThreadCategory category;

	/** ファイル入出力種別 */
	private final OptionFileIoType fileIoType;

	/**
	 * コンストラクタ
	 *
	 * @param id ID
	 * @param resource ファイルリソース
	 * @param printType JAMA帳票印刷種別
	 * @param category スレッドカテゴリー
	 * @param fileIoType ファイル入出力種別
	 */
	private OptionPrintDataType(Integer id, String resource, boolean isReprint, JamaReportPrintType printType, OptionThreadCategory category, OptionFileIoType fileIoType) {
		this.id = id;
		this.resource = resource;
		this.printType = printType;
		this.category = category;
		this.fileIoType = fileIoType;
	}

	/**
	 * IDを取得
	 *
	 * @return ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 名称を取得
	 *
	 * @return 名称
	 */
	public String getName() {
		return new FileOptionResourceReader().getString(getClass().getSimpleName() + ".name." + resource);
	}

	/**
	 * 略名を取得
	 *
	 * @return 略名
	 */
	public String getShortName() {
		return new FileOptionResourceReader().getString(getClass().getSimpleName() + ".shortname." + resource);
	}

	/**
	 * JAMA帳票印刷種別を取得
	 *
	 * @return JAMA帳票印刷種別
	 */
	public JamaReportPrintType getJamaReportPrintType() {
		return printType;
	}

	/**
	 * スレッドカテゴリーを取得
	 *
	 * @return スレッドカテゴリー
	 */
	public OptionThreadCategory getThreadCategory() {
		return category;
	}

	/**
	 * ファイル入出力種別を取得
	 *
	 * @return ファイル入出力種別
	 */
	public OptionFileIoType getFileIoType() {
		return fileIoType;
	}


//	/**
//	 * ダウンロードファイル名を取得
//	 *
//	 * @return ダウンロードファイル名
//	 * @throws MessagesIncludingException
//	 * @throws VersionUnmuchException
//	 */
//	public String getDownloadFilename() throws VersionUnmuchException, MessagesIncludingException {
//		FileOptionResourceReader fileResource = new FileOptionResourceReader();
//		String ext;
//		if (this.isPrintDeljitCsv()) {
//			ext = fileResource.getExtensionCsv();
//		} else {
//			ext = fileResource.getExtensionPdf();
//		}
//		String fileNameResource;
//		if (isReprint()) {
//			fileNameResource = "download.filename.prefix.option.reprint.";
//		} else {
//			fileNameResource = "download.filename.prefix.option.";
//		}
//		StringBuilder sb = new StringBuilder();
//		sb.append(fileResource.getString(fileNameResource + resource));
//		sb.append("_");
//		if (this.isPrintDeljitCsv()) {
//			sb.append(getDeljitCsvNumber());
//		} else {
//			sb.append(DateUtility.getStringFromDateYYYYMMDD(new Date()));
//		}
//		sb.append("." + ext);
//		return sb.toString();
//	}
//
//	/**
//	 * ファイル入出力種別IDから種別名称を取得する
//	 *
//	 * @param fileIoTypeId ファイル入出力種別ID
//	 * @return 種別名称
//	 */
//	public static String getNameByFileIoTypeId(String fileIoTypeId) {
//		return getOptionPrintDataTypeByFileIoTypeId(fileIoTypeId).getName();
//	}

}
