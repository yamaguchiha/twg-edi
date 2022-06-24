package jp.or.twg.twg_edi.common.difinition;


import jp.or.twg.twg_edi.common.context.ApplicationContextProvider;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.SystemConfig;
import jp.or.twg.twg_edi.common.resource.Messages;
import jp.or.twg.twg_edi.common.resource.TwgResourceReader;
import jp.or.twg.twg_edi.common.service.SystemConfigService;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;

/**
 * システムパラメーターカテゴリー
 *
 * @author yamaguchiha
 */
public enum SystemConfigCategory implements IConfigCategory {

	/** 出荷・納入場所セキュリティ(Y:利用する N:利用しない) */
	PlaceSecurityOption(SystemConfigCategoryType.SYSTEM),

	/** 出荷・納入場所検索オプション(Y:利用する N:利用しない) */
	DischargeSearchOption(SystemConfigCategoryType.SYSTEM),

	/** 別送支給利用制限(Y:制限する N:制限しない) */
	SupplyFuncLimited(SystemConfigCategoryType.SYSTEM),


	/** 各種画面で１ページに表示する行数 */
	DefaultSizePerPage(SystemConfigCategoryType.LIST),

	/** 納品書番号自動採番 */
	AutoSetDocRefIdAau(SystemConfigCategoryType.INBOUND),

	/** かんばんカーメーカーエリア(2) パターン */
	ItemP05A2Pattern(SystemConfigCategoryType.REPORT),

	/** かんばんカーメーカーエリア(3) パターン */
	ItemP05A3Pattern(SystemConfigCategoryType.REPORT),

	/** かんばん出力方法 */
	PrintKan(SystemConfigCategoryType.REPORT),

	/** 仕切りかんばん出力(Y:出力 N:出力しない) */
	SikiriOutPut(SystemConfigCategoryType.REPORT),

	/**便チケット用紙サイズ*/
	TicketPaperSize(SystemConfigCategoryType.REPORT),

	/** 自工区データ受入フラグ */
	OwnPlacePermissionFlg(SystemConfigCategoryType.SYSTEM),

	/** CSV入出力時に社内企業コードを優先する */
	CsvIoPartyAbbrCode(SystemConfigCategoryType.OUTPUT),

	/** Jamaオプション機能使用フラグ */
	KazuraJamaOptionFlag(SystemConfigCategoryType.SYSTEM),

	/** Jamaオプション納受領書/便チケット出力フラグ */
	KazuraJamaOptionPrintDesadvFlag(SystemConfigCategoryType.SYSTEM),

	/** 後工程で帳票印刷を行わずに納入指示を実行する。 */
	AfterProcessDeljitPrintThrough(SystemConfigCategoryType.REPORT),

	/** 帳票フォーマット */
	DocumentFormatType(SystemConfigCategoryType.REPORT),

	// 削除対象経過日数設定
	/** 内示の削除対象となる経過月数 */
	DeleteDelforMonth(SystemConfigCategoryType.SYSTEM),

	/** 輸送データの削除対象とする経過日数 */
	DeleteTransportDay(SystemConfigCategoryType.SYSTEM),

	/** 品目の削除対象とする経過日数 */
	DeleteItemDay(SystemConfigCategoryType.SYSTEM),

	/** スレッド管理を削除対象とする経過日数 */
	DeleteThreadManagerDay(SystemConfigCategoryType.SYSTEM),

	/** ファイル入出力管理の削除対象とする経過日数 */
	DeleteFileIoHistoryDay(SystemConfigCategoryType.SYSTEM),

	/** 外部IFデータの削除対象とする経過日数 */
	DeleteExternalIfDataDay(SystemConfigCategoryType.SYSTEM),

	/** かんばん読取情報の削除対象となる経過日数 */
	DeleteKnbrdDay(SystemConfigCategoryType.SYSTEM),

	/** 検収帳票発行管理の削除対象となる経過日数 */
	DeleteRecadvIssueManager(SystemConfigCategoryType.SYSTEM),


	/** かんばん単位情報対応(Y:利用する N:利用しない) */
	KanbanEveryPrint(SystemConfigCategoryType.REPORT),

	/** 前工程QRに枝番を指定した場合頭０埋めにする。(N:行わない, Y:行う) */
	SerialNoZeroPadding(SystemConfigCategoryType.REPORT),

	/** 外部I/F用新メッセージ使用 Add 2020/10/19 */
	UseExternalMessageNew(SystemConfigCategoryType.EXTERNAL),
	;

	/** システムパラメーターカテゴリー種別 */
	private final SystemConfigCategoryType systemConfigCategoryType;

	/** リソースキー */
	enum ResourceKey {
		NAME(				"name",				"名称"),
		DESCRIPTION(		"description",		"説明"),
		DEFAULT_PARAMETER(	"defaultParameter",	"既定値"),
		;

		/** キー */
		private final String key;

		/** 説明 */
		private final String description;

		/**
		 * コンストラクタ
		 *
		 * @param key キー
		 * @param description 説明
		 */
		private ResourceKey(String key, String description) {
			this.key = key;
			this.description = description;
		}

		/**
		 * キー
		 *
		 * @return キー
		 */
		public String getKey() {
			return key;
		}

		/**
		 * 説明
		 *
		 * @return 説明
		 */
		public String getDescription() {
			return description;
		}
	}

	/**
	 * コンストラクタ
	 *
	 * @param systemConfigType システムパラメーターカテゴリー種別
	 */
	private SystemConfigCategory(SystemConfigCategoryType systemConfigType) {
		this.systemConfigCategoryType = systemConfigType;
	}

	/**
	 * システムパラメーターカテゴリー種別取得
	 *
	 * @return システムパラメーターカテゴリー種別
	 */
	public SystemConfigCategoryType getSystemConfigCategoryType() {
		return systemConfigCategoryType;
	}

	/**
	 * システムパラメーターカテゴリー名取得
	 *
	 * @return システムパラメーターカテゴリー名
	 */
	@Override
	public String getTypeName() {
		return getResourceValue(this, ResourceKey.NAME);
	}

	/**
	 * 説明取得
	 *
	 * @return 説明
	 */
	@Override
	public String getDescription() {
		return getResourceValue(this, ResourceKey.DESCRIPTION);
	}

	/**
	 * 既定値取得
	 *
	 * @return 既定値
	 */
	@Override
	public String getDefaultParameter() {
		return getResourceValue(this, ResourceKey.DEFAULT_PARAMETER);
	}

	/**
	 * リソース値取得
	 *
	 * @param systemConfigCategory システムパラメーターカテゴリー
	 * @param resourceKey リソースキー
	 * @return リソース値
	 */
	String getResourceValue(SystemConfigCategory systemConfigCategory, ResourceKey resourceKey) {
		String value = new TwgResourceReader().getString(SystemConfigCategory.class.getSimpleName() + "." + systemConfigCategory.name() + "." + resourceKey.getKey());
		if (CommonDataUtil.isNullOrEmpty(value)) {
//			throw new KazuraJamaException(systemConfigCategory.name() + "の" + resourceKey.getDescription() + "がリソースに定義されていません");
		}
		return value;
	}

	/**
	 * システムパラメーターカテゴリー取得
	 *
	 * @param name カテゴリー名
	 * @return システムパラメーターカテゴリー
	 */
	public static SystemConfigCategory getType(String name) {
		try {
			return valueOf(name);
		} catch (Exception e) {
			throw e;
//			throw new KazuraJamaException("予期せぬシステムパラメーターカテゴリー");
		}
	}

	/**
	 * 入力用選択項目
	 *
	 * @return 入力用選択項目
	 */
	public String inputSelectItem() {
		return null;
	}

	/**
	 * システムパラメータ要素取得
	 * 見つからない場合、場所無しで検索する
	 *
	 * @param place 場所
	 * @return システムパラメータ要素
	 */
	public SystemConfig getConfigByPlace(Place place) {
		SystemConfigService service = ApplicationContextProvider.getBean(SystemConfigService.class);
		SystemConfig config = service.getEntityBySystemConfigCategory(this, place, false);
		if (config == null) {
			config = getConfig();
		}
		return config;
	}

	/**
	 * システムパラメータ要素取得
	 * 見つからない場合、nullを返す。
	 *
	 * @param place 場所
	 * @return システムパラメータ要素
	 */
	public SystemConfig getConfigByPlaceEdit(Place place) {
		SystemConfigService service = ApplicationContextProvider.getBean(SystemConfigService.class);
		SystemConfig config = service.getEntityBySystemConfigCategory(this, place, false);
		return config == null ? null : config;
	}

	/**
	 * システムパラメータ要素取得
	 *
	 * @return システムパラメータ要素
	 */
	public SystemConfig getConfig() {
		SystemConfigService service = ApplicationContextProvider.getBean(SystemConfigService.class);
	SystemConfig config = service.getEntityBySystemConfigCategory(this, null, false);
		return config == null ? null : config;
	}

	/**
	 * パラメータ取得
	 *
	 * @param place 場所
	 * @return パラメータ
	 */
	public String getParameterByPlace(Place place) {
		SystemConfig config = getConfigByPlace(place);
		return config == null ? getDefaultParameter() : config.getParameter();
	}

	/**
	 * パラメータ取得
	 *
	 * @return パラメータ
	 */
	public String getParameter() {
		SystemConfig config = getConfig();
		return config == null ? getDefaultParameter() : config.getParameter();
	}

	/**
	 * 入力内容のチェック
	 * @param config システムコンフィグ
	 * @return メッセージ(エラー発生時は空でないもの)
	 */
	public Messages validation( SystemConfig config ) {
		Messages ret = new Messages();
		return ret;
	}
}
