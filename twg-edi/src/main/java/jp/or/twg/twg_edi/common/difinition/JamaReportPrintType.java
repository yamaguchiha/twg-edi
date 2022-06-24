package jp.or.twg.twg_edi.common.difinition;

import jp.or.twg.twg_edi.common.resource.FileResourceReader;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;

/**
 * JAMA帳票印刷種別
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public enum JamaReportPrintType {

	/** かんばん */
	KANBAN(1, "download.filename.prefix.inbound.kanban"),

	/** 帳票 */
	REPORT(2, "download.filename.prefix.inbound.report"),

	/** 荷揃書 */
	PICKING(3, "download.filename.prefix.inbound.picking"),

	/** 便チケット */
	TICKET(5, "download.filename.prefix.inbound.ticket"),
	;

	/** ID */
	private final Integer id;

	/** 納入ダウンロードリソース名 */
	private final String inboundDownloadResource;

	/**
	 * コンストラクタ
	 *
	 * @param id ID
	 * @param cls サービスクラス
	 * @param inboundDownloadResource 納入ダウンロードリソース名
	 */
	private JamaReportPrintType(Integer id, String inboundDownloadResource) {
		this.id = id;
		this.inboundDownloadResource = inboundDownloadResource;
	}

	/**
	 * 帳票発行タイプ取得
	 * @param id ID
	 * @return 帳票発行タイプ
	 */
	public static JamaReportPrintType getJamaReportPrintType(Integer id) {
		for (JamaReportPrintType type : values()) {
			if (type.getId().equals(id)) {
				return type;
			}
		}
		throw new IllegalArgumentException("予期せぬ帳票発行タイプ");
	}

	/**
	 * ID取得
	 *
	 * @return ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 納入ダウンロードファイル名取得
	 *
	 * @return 納入ダウンロードファイル名
	 */
	public String getInboundDownloadFileName() {
		return CommonDataUtil.isNullOrEmpty(inboundDownloadResource) ? null : new FileResourceReader().getString(inboundDownloadResource);
	}


}
