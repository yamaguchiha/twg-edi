package jp.or.twg.twg_edi.kanban.service;

import jp.or.twg.twg_edi.common.resource.Message;
import jp.or.twg.twg_edi.common.resource.Messages;
import jp.or.twg.twg_edi.common.resource.TwgResourceReader;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;

/**
 * 稼動・非稼動区分
 * @author nishidat
 */
public enum OperatingKbn {
	/** 稼動 */
	OPERATION("0", "OperatingKbn.OPERATION", true, true, true, 1D),
	/** 非稼動 */
	NON_OPERATION("1", "OperatingKbn.NON_OPERATION", false, false, false, 0D),
	/** 半稼動 */
	HALF_OPERATION("2", "OperatingKbn.HALF_OPERATION", false, true, false, 0.5D);
	
	/** 稼動非稼動区分 */
	private final String id;

	/** 稼動非稼動区分（ファイル取込） */
	private final String fileOperatingKbn;

	/** 稼働日(便なしは含まない)判定 */
	private final boolean operating;

	/** 稼働日(臨時は含まない)判定 */
	private final boolean omitTmpOperating;

	/** かんばん分の全日稼動判定（稼動+便なし） */
	private final boolean kanbanAllOperating;

	/** 稼働割合 */
	private final double operatingRate;
	
	/**
	 * コンストラクタ
	 * @param id 稼動非稼動ID
	 * @param fileOperatingKbn 稼動非稼動区分（ファイル取込）
	 * @param operating 稼働日判定
	 * @param omitTmpOperating 稼働日(臨時は含まない)判定
	 * @param tmporary 臨時稼動日判定
	 * @param kanbanAllOperating かんばん分の全日稼動日判定
	 */
	private OperatingKbn(String id, String fileOperatingKbn, boolean operating, boolean omitTmpOperating, boolean kanbanAllOperating, double operationRate) {
		this.id = id;
		this.fileOperatingKbn = fileOperatingKbn;
		this.operating = operating;
		this.omitTmpOperating = omitTmpOperating;
		this.kanbanAllOperating = kanbanAllOperating;
		this.operatingRate = operationRate;
	}

	/**
	 * 稼動非稼動取得
	 * @param typeString 稼動非稼動文字列
	 * @return 稼動非稼動
	 */
	public static OperatingKbn getOperatingKbn(String typeString) {
		for (OperatingKbn type : values()) {
			if (type.name().equals(typeString)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * 稼動非稼動取得(IDから)
	 * @param id 稼動非稼動ID
	 * @return 稼動非稼動
	 */
	public static OperatingKbn getOperationgKbnById(String id) {
		for (OperatingKbn type : values()) {
			if (type.getId().equals(id)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * 稼動非稼動取得(稼動非稼動区分（ファイル取込）から)
	 * @param fileOperatingKbn 稼動非稼動区分（ファイル取込）
	 * @return 稼動非稼動
	 */
	public static OperatingKbn getOperationgKbnByFile(String fileOperatingKbn) {
		for (OperatingKbn type : values()) {
			String typeFileOperatingKbn = type.getFileOperatingKbn();
			if (!CommonDataUtil.isNullOrEmpty(typeFileOperatingKbn)
					&& typeFileOperatingKbn.equals(fileOperatingKbn)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * 稼動非稼動ID取得
	 * @return 稼動非稼動ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * 稼動非稼動区分取得(ファイル取り込み)
	 * @return 稼動非稼動区分取得(ファイル取り込み)
	 */
	public String getFileOperatingKbn() {
		//return new KazuraJamaOptionResourceReader().getString(fileOperatingKbn);
		return new TwgResourceReader().getString(fileOperatingKbn);
	}

	/**
	 * 稼働日判定
	 * @return 稼働日判定
	 */
	public boolean isOperating() {
		return operating;
	}

	/**
	 * 稼働日(臨時は含まない)判定
	 * @return 稼働日(臨時は含まない)判定
	 */
	public boolean isOmitTmpOperating() {
		return omitTmpOperating;
	}

	/**
	 * かんばん分の全日稼動日判定
	 * @return 稼働日(稼動＋便なし)判定
	 */
	public boolean isKanbanAllOperating() {
		return kanbanAllOperating;
	}

	/**
	 * データ検証
	 * @param id 稼動非稼動ID
	 * @return エラーメッセージ
	 */
	public static Messages validate(String value) {
		Messages ret = new Messages();

		if(CommonDataUtil.isNullOrEmpty(value)) {
			ret.add("", new Message("error.validate.unsetting", new Message("error.validate.OperatingKbn").toString()));
			return ret;
		}

		OperatingKbn type = OperatingKbn.getOperationgKbnById(value);
		if(type == null) {
			ret.add("", new Message("error.validate.illegalargument", new Message("error.validate.OperatingKbn").toString()));
			return ret;
		}

		return ret;
	}

	/**
	 * 稼働区分の稼働割合を取得する
	 */
	public double getOperatingRate() {
		return operatingRate;
	}
}
