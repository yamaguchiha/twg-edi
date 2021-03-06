package jp.or.twg.twg_edi.kanban.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.resource.Message;
import jp.or.twg.twg_edi.common.resource.Messages;
import jp.or.twg.twg_edi.common.service.SystemConfigService;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.kanban.model.InboundKanbanDeljitForm;
import jp.or.twg.twg_edi.kanban.service.InboundKanbanDeljitBean;
import jp.or.twg.twg_edi.kanban.service.InboundKanbanDeljitService;

/**
 * かんばん納入指示 コントロールクラス
 * @author nishidat
 */
@Controller
@RequestMapping("inboundKanbanDeljit")
public class InboundKanbanDeljitController extends BaseController {

	private final String PAGE_TITTLE = "かんばん納入指示";

	/** 日付フォーマット */
	public final String DATE_PATTERN = "yyyy/MM/dd HH:mm:ss";

	private final String FORM_ATTR = "inboundKanbanDeljitForm";

	@Autowired
	InboundKanbanDeljitService service;

	@Autowired
	SystemConfigService systemConfigService;

	//* memo:Event一覧 *//
	// Init    : 一覧表示
	// Paging  : 指定ページ移動(/list?)
	// Refresh : 検索実行
	// Order   : かんばん発注
	// UnissuedDataRefresh : 送信状況一覧更新

	/**
	 * かんばん納入指示 初期画面表示
	 *
	 * @param model
	 * @return
	 */
	//@GetMapping({"/inboundKanbanDeljit/list"})
	@RequestMapping(value="list", params="refresh", method=RequestMethod.GET)
	//@RequestMapping(value="list", method=RequestMethod.GET)
    public String inboundKanbanDeljitInit(@PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(!(obj instanceof UserSession)) return "redirect:/timeout";	 // SCMのログイン画面に戻す。

    	UserSession userSession = (UserSession)obj;

    	// 必要な初期処理を記述
        InboundKanbanDeljitForm form = new InboundKanbanDeljitForm();

        /* form.init()の処理 */
        form.setRunSearch(false);
    	form.setInputTableNo(null);

    	// TODO:ｾｷｭﾘﾃｨチェック

    	Party party = userSession.getMyParty();
    	String ownTdbPartyCode = party.getTdbPartyCode();
    	form.setOwnTdbPartyCode(ownTdbPartyCode);
    	Place place = userSession.getMyPlace();
    	String ownTdbPlaceCode = place.getTdbPlaceCode();
		form.setOwnTdbPlaceCode(ownTdbPlaceCode);

    	//TODO:debug
    	//String strStartTime = OptionSystemConfig.getParameterBySystemConfigCategory(OptionSystemConfigCategory.ProcessStartTodayTime,(UserSession)obj, true);
    	String strStartTime = "1200";
    	String strdate = this.getDisplayDate(new Date(), strStartTime);
    	form.setInputOperationDate(strdate);
//    	Date nowdate = new Date();
//    	SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");
//    	form.setInputOperationTime(timeFormat.format(nowdate));
    	form.setNotOrder(true);
    	/* form.init()の処理 */

    	// 共通処理
    	this.setCommonModelSetting(pageable, model, userSession, form);

        return "kanban/inboundKanbanDeljit";
    }

	/**
	 * 検索
	 * @param form
	 * @param pageable
	 * @param model
	 * @return
	 */
	@RequestMapping(value="list", params="refresh", method=RequestMethod.POST)
	public String inboundKanbanDeljitRefresh(@Valid @ModelAttribute(FORM_ATTR) InboundKanbanDeljitForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
    //public String inboundKanbanDeljitRefresh(@Valid @ModelAttribute("inboundKanbanDeljitForm") InboundKanbanDeljitForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(!(obj instanceof UserSession)) return "redirect:/timeout";	 // SCMのログイン画面に戻す。

    	UserSession userSession = (UserSession)obj;

    	//* 処理日のチェック *//
    	if(!this.checkDate(form.getInputOperationDate())) {
    		// 共通項目だけセットする
        	this.setCommonModelSetting(pageable, model, userSession, form);
            return "kanban/inboundKanbanDeljit";
    	}

//		try {
//			// 処理日の設定
//			form.setOperationDate(DateUtility.getDateFromString(form.getInputOperationDate()));
//		} catch (ParseException e) {
//			//事前にチェックしているため、ココは入りえない
//			getErrors().add("", new Message("twg_edi.option.error.CheakDate", form.getInputOperationDate()));
//            return "kanban/inboundKanbanDeljit";
//		}
    	form.setOperationDate(form.getInputOperationDate());
    	form.setTableNo(form.getInputTableNo());
    	//* 処理日のチェック *//

    	// ここからはおまじないと思って記述してください。m(_ _)m
    	if(form.getPageSize() == null) {
	    	// 1ページに表示する件数はシスパラから取得
	    	form.setPageSize(systemConfigService.getDefaultSizePerPage(userSession.getMyPlace()).longValue());
	    	// シスパラから取得したページサイズでpage=0のPageableを生成する
	    	pageable = PageRequest.of(pageable.getPageNumber(), form.getPageSize().intValue(), pageable.getSort());
    	}
    	// パラメータのPageableのpageSizeがデフォルトに戻る？
    	if(form.getPageSize().intValue() != pageable.getPageSize()) {
    		// セッションからまたは新規のconditionに持つpageSizeとPageableのpageSizeが異なる場合は
    		// conditionの値でPageableを生成しなおす。ちょっと納得いかないが。。。
	    	pageable = PageRequest.of(pageable.getPageNumber(), form.getPageSize().intValue(), pageable.getSort());
    	}
    	// ここまではおまじないと思って記述してください。m(_ _)m

    	// 必要な初期処理を記述
        //InboundKanbanDeljitForm form = new InboundKanbanDeljitForm();
        form.setRunSearch(true);

    	// 共通処理
    	this.setCommonModelSetting(pageable, model, userSession, form);

        return "kanban/inboundKanbanDeljit";
	}


	/**
	 * かんばん納入指示 最新の情報に更新
	 * @param form
	 * @param pageable
	 * @param model
	 * @return
	 */
	//@GetMapping({"/inboundKanbanDeljit/list"})
	//@RequestMapping(value="list", params="refresh", method=RequestMethod.GET)
	@RequestMapping(value="list", params="unissuedRefresh", method=RequestMethod.POST)
	public String inboundKanbanDeljitUnissuedDataRefresh(@Valid @ModelAttribute(FORM_ATTR) InboundKanbanDeljitForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
	//public String inboundKanbanDeljitUnissuedDataRefresh(@Valid @ModelAttribute("inboundKanbanDeljitForm") InboundKanbanDeljitForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
		// セッションにログイン情報を格納？
		// SCMからの遷移方法を聞いてから検討する
		Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
		if(!(obj instanceof UserSession)) return "redirect:/timeout";	 // SCMのログイン画面に戻す。

		UserSession userSession = (UserSession)obj;

		// 共通処理
		this.setCommonModelSetting(pageable, model, userSession, form);

		return "kanban/inboundKanbanDeljit";
    }

	//@RequestMapping(value="list", params="execute", method=RequestMethod.POST)
	@RequestMapping(value="execute", method=RequestMethod.POST)
	public String inboundKanbanDeljitOrder(@Valid @ModelAttribute(FORM_ATTR) InboundKanbanDeljitForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(!(obj instanceof UserSession)) return "redirect:/timeout";	 // SCMのログイン画面に戻す。

		UserSession userSession = (UserSession)obj;

    	//UserSession userSession = (UserSession)obj;
    	// 共通処理
    	//this.setCommonModelSetting(pageable, model, userSession, form);

    	// かんばん発注対象リストを生成
		List<InboundKanbanDeljitBean> beanList = new ArrayList<InboundKanbanDeljitBean>();

		// かんばん納入指示対象の取得
    	for(InboundKanbanDeljitBean bean : form.getBeanList()) {		//TODO:表示中の頁だけ取得したい	getCurrentPageCollection
    		// 未選択の場合はスキップ
    		if(!bean.getCheckboxValue()) {
    			continue;
    		}

			// テーブルNoの設定
			bean.setDataNo(form.getTableNo());
//			// 納入指示対象企業の設定
//			bean.setParty(bean.getOptionKanbanCycle().getPlaceSf().getParty());
//			// 納入指示対象事業所の設定
//			bean.setPlace(bean.getOptionKanbanCycle().getPlaceSf());
			// ボタンを押した直後の時間を再度処理時間として設定
			//bean.setOperationTime(form.getOperationTime());

			// エンティティの設定
			beanList.add(bean);
    	}

    	// 無ければ、リフレッシュ実行→終了
		if (beanList.isEmpty()) {
			getErrors().add("", new Message("twg_edi.edi.err.none", new Message("twg_edi.edi.msg.deljit").toString()));
			//soxLogger.resultOut(SoxLogResult.ABEND, getErrors().toString());
			// リフレッシュ実行
			//refresh();

			return this.inboundKanbanDeljitRefresh(form, pageable, model);
		}

    	// マルチスレッド処理呼び出し
		//TODO:mock
		this.service.threadStart(beanList, userSession);

		// 画面表示メッセージの設定
		getMessages().add("", new Message("twg_edi.option.inbound.kanban.result"));

		// 初状態に戻す
		return this.inboundKanbanDeljitInit(pageable, model);
//        form.setRunSearch(false);
//    	this.setCommonModelSetting(pageable, model, userSession, form);

//        return "kanban/inboundKanbanDeljit";
    }

	//** 以下、Method **//
	/**
	 * 共通Model設定
	 * @param model
	 */
	private void setCommonModelSetting(Pageable pageable, Model model, UserSession userSession, InboundKanbanDeljitForm form) {

		model.addAttribute("loginInfo", userSession);
		model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
		model.addAttribute("pageTitle", PAGE_TITTLE);
		model.addAttribute("messages", getMessages());
		model.addAttribute("errors", getErrors());
		model.addAttribute("warnings", getWarnings());

		/* form.reset()の処理 */
		Place place = userSession.getMyPlace();
		form.setAutoSetDocRefIdAau(systemConfigService.isAutoSetDocRefIdAau(place));
		if (!form.getAutoSetDocRefIdAau()) {
			getWarnings().add("", new Message("twg_edi.option.auto.set.DocRefIdAau.off", "納入指示実行"));
		}
		/* form.reset()の処理 */

		/* html→formの処理(ここは共通の呼び出しとした方がよい) */
		// 納入指示テーブル指定
		form.setItemTypeHtmlList(this.service.getItemTypeHtmlList(userSession));
		// 納入指示テーブルの備考
		form.setDeliveryMemo(this.service.getDeliveryMemo(userSession, form.getTableNo()));
		// かんばん納入指示送信履歴一覧
		form.setUnissuedDownloadList(this.service.getUnissuedDownloadList(userSession));
		// 納入指示実行有無
		form.setIsKanbanOrder(this.service.isRunKanbanOrder(userSession));
		/* html→formの処理 */

		// 検索ボタン押下をフラグにて保持
		if(form.getRunSearch()) {
			// 検索条件に一致するデータを取得
			Page<InboundKanbanDeljitBean> pageList = this.service.getPageInfo(pageable, userSession, form.getTableNo(), form.getOperationDate(), form.getNotOrder());
			// 属性名はpageList固定とする
			model.addAttribute("pageList", pageList);
			// ページサイズ変更用（Pagerを使用する画面は必須）
			model.addAttribute("pageSizeList", getPageSizeList());

			// POST時に必要なリストをセット
			form.setBeanList(pageList.getContent());
    	}

    	model.addAttribute(FORM_ATTR, form);
    	//model.addAttribute("inboundKanbanDeljitForm", form);

		clearErrors();
		clearMessages();
		clearWarnings();
	}

	/**
	 * 日付チェック
	 * @param date
	 * @param time
	 * @return
	 */
	public boolean checkDate(String date) {
		//outDate = null;

//		Property prp = null;
//
//		//リソース項目名あり
//		SearchConditionForDateEx testCondtion = new SearchConditionForDateEx("oparationDate", prp);
//		//Fromが数値と/以外
//		((SearchConditionForDateEx)testCondtion).setSearchPattern(SearchConditionForDateEx.SearchPattern.EQUAL);
//		((SearchConditionForDateEx)testCondtion).setSrhDate(date);
		//String resourceName = "oparationDate";
		String resourceName = "処理日";
		if (this.validate(date, getErrors(), resourceName, true).hasError()){
			return false;
		}

		if(date == null || date.isEmpty()) {
			getErrors().add("",new Message("twg_edi.error.validate.unsetting", new Message("twg_edi.err.searcher.name.processingDateTime").toString()));
			return false;
		}

		Date retDate = null;
		//Date iptDate = null;
		try {
			if(!date.contains("/")){
				retDate = DateUtility.getDateFromStringYYYYMMDD(date);
				date = new SimpleDateFormat("yyyy/MM/dd").format(retDate);
			}

			SimpleDateFormat format = new SimpleDateFormat(DATE_PATTERN);
			//iptDate = format.parse(date+ " " + time);
			//outDate = Optional.ofNullable(format.parse(date+ " " + "00:00"));
			format.parse(date+ " " + "00:00:00");
		} catch (Exception e) {
			//getErrors().add("", new Message("twg_edi.err.datecheck.err", new Message(resourceName).toString()));
			getErrors().add("", new Message("twg_edi.err.datecheck.err", resourceName));
			return false;
		}
		return true;
	}

	public Messages validate(String srhDate, Messages errmsgs, String resourceName, boolean requiredFlag) {

		if (CommonDataUtil.isNullOrEmpty(resourceName)) {
			throw new RuntimeException("リソース項目名が定義されていません");
		}

		// 必須チェック
		if (requiredFlag) {
			boolean isError = false;

			// 日付が未入力の場合
			if (CommonDataUtil.isNullOrEmpty(srhDate)) {
				isError = true;
			}

//			// 範囲検索
//			if (SearchPattern.RANGE == getSearchPattern()) {
//
//				// From-Toの両方が未入力の場合
//				if(CommonDataUtil.isNullOrEmpty(getSrhDateFrom()) && CommonDataUtil.isNullOrEmpty(getSrhDateTo())) {
//					isError = true;
//				}
//
//			// 一致検索
//			} else if(SearchPattern.EQUAL == getSearchPattern()) {
//
//				// 日付が未入力の場合
//				if (CommonDataUtil.isNullOrEmpty(getSrhDate())) {
//					isError = true;
//				}
//
//			// 上記以外（ありえないのでエラーログだけ書き込む）
//			} else {
//				log.error("想定外の検索パターンです。");
//			}

			if (isError) {
				//errmsgs.add("", new Message("errors.required", 	new Message(resourceName).toString()));
				errmsgs.add("", new Message("errors.required", 	resourceName));
			}
		}

		// エラーが存在していた場合はそのまま返却
		if (errmsgs.hasError()) {
			return errmsgs;
		}

		if (!CommonDataUtil.isNullOrEmpty(resourceName)) {
			//数値チェック
			if(this.check(srhDate)) {
				//errmsgs.add("", new Message("twg_edi.err.datecheck.err",	new Message(resourceName).toString()));
				errmsgs.add("", new Message("twg_edi.err.datecheck.err",	resourceName));
			}
//			if (getChecker().check(getSrhDate())) {
//				//メッセージはSearchConditionForDate固有なので固定
//				errmsgs.add("", new Message("kazura.jama.err.datecheck.err",	new Message(resourceName).toString()));
//				setSrhDate("");
//			}
		}

		//return super.validate(errmsgs);
		return errmsgs;
	}

	private static Pattern ptn = Pattern.compile("^[0-9|/]*$");

	public boolean check(Object obj){
		return !ptn.matcher((String)obj).matches();
	}

	// ↓以前は共通処理だったためpublicココに記載するかは検討
	/**
	 *
	 * @param nowDate
	 * @param hhmm
	 * @return
	 */
	public String getDisplayDate(Date nowDate, String hhmm) {
		//現在日時を取得
		//hhmmが時刻の範囲である場合、判断を行う
		if (checkDateStringHHMM(hhmm)){
			String now_hhmm = DateUtility.getStringFromDate(nowDate, "HHmm");;
			//時刻が基準時より前の場合、1日引く
			if(now_hhmm.compareTo(hhmm) < 0){
				nowDate = DateUtility.getDateBack(nowDate, 1);
			}
		}
		// YYYY/MM/DDの形にして戻す。
		return DateUtility.getStringFromDate(nowDate);
	}

	/**
	 *
	 * @param value
	 * @return
	 */
	public static boolean checkDateStringHHMM(String value) {
		try {
			return DateUtility.getTimeFromString(value) != null;
		} catch (ParseException e) {
			// 処理なし
		}
		return false;
	}

}
