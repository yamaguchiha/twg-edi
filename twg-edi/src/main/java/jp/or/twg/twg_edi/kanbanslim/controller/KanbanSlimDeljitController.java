package jp.or.twg.twg_edi.kanbanslim.controller;

import java.util.Date;

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
import jp.or.twg.twg_edi.common.difinition.RoleType;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.service.SystemConfigService;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.kanbanslim.model.KanbanSlimDeljitBean;
import jp.or.twg.twg_edi.kanbanslim.model.KanbanSlimDeljitCondition;
import jp.or.twg.twg_edi.kanbanslim.model.KanbanSlimDeljitForm;
import jp.or.twg.twg_edi.kanbanslim.service.KanbanSlimDeljitService;

/**
 * かんばん納入指示Slim　かんばん納入指示画面用コントローラークラス
 *
 * @author yamaguchiha
 *
 */
@Controller
@RequestMapping("inboundSimpleKanbanDeljit")
public class KanbanSlimDeljitController extends BaseController {

	@Autowired
	KanbanSlimDeljitService service;

	@Autowired
	SystemConfigService systemConfigService;

	/**
	 * かんばん納入指示Slim 初期画面表示(GET)
	 *
	 * @param pageable
	 * @param model
	 * @return
	 */
	//@RequestMapping({"/inboundSimpleKanbanDeljit/list"})
	@RequestMapping(value="list", params="refresh", method=RequestMethod.GET)
    public String kanbanSlimDeljitInit(@PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
    	KanbanSlimDeljitForm form = new KanbanSlimDeljitForm();
    	return kanbanSlimDeljitRefresh(form, pageable, model);
	}

	/**
	 * かんばん納入指示Slim 検索(POST)
	 *
	 * @param pageable
	 * @param model
	 * @return
	 */
	@RequestMapping(value="list", params="refresh", method=RequestMethod.POST)
    public String kanbanSlimDeljitRefresh(@Valid @ModelAttribute("kanbanSlimDeljitForm") KanbanSlimDeljitForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {

		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "かんばん納入指示Slim");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述

    	// 各メソッド共通処理
    	pageable = commonLogic(form, userSession, pageable);

    	// →シスパラの納入指示日の時間（HHMM)を取得して処理日を決定する必要がある。対応したらこのコメントを削除
    	// システム日付を処理日にセット
    	form.setIptOperationDate(DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd"));

    	// 検索条件に一致するデータを取得
		Page<KanbanSlimDeljitBean> pageList = service.getListByShipToReciveCode(pageable, form.getShipToReciveCode());

		// 属性名はpageList固定とする
    	model.addAttribute("pageList", pageList);

    	// POST時に必要なリストをセット
    	form.setBeanList(pageList.getContent());

    	// ページサイズ変更用（Pagerを使用する画面は必須）
    	model.addAttribute("pageSizeList", getPageSizeList());

        // かんばん納入指示送信履歴一覧
    	form.setUnissuedDownloadList(service.getUnissuedDownloadList(userSession));

    	// 納入指示実行有無
    	form.setKanbanOrder(service.isRunKanbanOrder(userSession));

    	model.addAttribute("kanbanSlimDeljitForm", form);

    	// Controllerが持っているメッセージをクリア（次以降の動作でメッセージがクリアされている）
        clearErrors();
        clearMessages();
        clearWarnings();

        return "kanbanslim/inboundSimpleKanbanDeljit";
    }

	/**
	 * 納入指示実行
	 *   納入指示実行のスレッドを起動し、再度検索した結果を画面表示する
	 *
	 * @param form
	 * @param pageable
	 * @param model
	 * @return
	 */
	@RequestMapping(value="list", params="execute", method=RequestMethod.POST)
    public String kanbanSlimDeljitExecute(@Valid @ModelAttribute("kanbanSlimDeljitForm") KanbanSlimDeljitForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {

		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "かんばん納入指示Slim");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述

    	// 各メソッド共通処理
    	pageable = commonLogic(form, userSession, pageable);

    	// →シスパラの納入指示日の時間（HHMM)を取得して処理日を決定する必要がある。対応したらこのコメントを削除
    	// システム日付を処理日にセット
    	form.setIptOperationDate(DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd"));

    	// ここから納入指示実行の処理を記載する







		// Messageに「かんばん納入指示を開始しました。」を設定する



    	// これ以降は再検索になる

    	// 検索条件に一致するデータを取得
		Page<KanbanSlimDeljitBean> pageList = service.getListByShipToReciveCode(pageable, form.getShipToReciveCode());

		// 属性名はpageList固定とする
    	model.addAttribute("pageList", pageList);

    	// POST時に必要なリストをセット
    	form.setBeanList(pageList.getContent());

    	// ページサイズ変更用（Pagerを使用する画面は必須）
    	model.addAttribute("pageSizeList", getPageSizeList());

    	model.addAttribute("kanbanSlimDeljitForm", form);

    	// Controllerが持っているメッセージをクリア（次以降の動作でメッセージがクリアされている）
        clearErrors();
        clearWarnings();

		return "kanbanslim/inboundSimpleKanbanDeljit";
	}

	/**
	 * 一括登録
	 *   納入指示日、便を表示されている対象一覧に設定する
	 *   もし現行がJavaScriptで実装しているならこのメソッドは破棄
	 *
	 * @param form
	 * @param pageable
	 * @param model
	 * @return
	 */
	@RequestMapping(value="list", params="allInsert", method=RequestMethod.POST)
    public String kanbanSlimDeljitAllInsert(@Valid @ModelAttribute("kanbanSlimDeljitForm") KanbanSlimDeljitForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {

		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "かんばん納入指示Slim");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述

    	// 各メソッド共通処理
    	pageable = commonLogic(form, userSession, pageable);

    	// →シスパラの納入指示日の時間（HHMM)を取得して処理日を決定する必要がある。対応したらこのコメントを削除
    	// システム日付を処理日にセット
    	form.setIptOperationDate(DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd"));

    	// これ以降は再検索になる

    	// 検索条件に一致するデータを取得
		Page<KanbanSlimDeljitBean> pageList = service.getListByShipToReciveCode(pageable, form.getShipToReciveCode());

		// 一括登録の処理として対象一覧内のデータに納入指示日と便を設定する
		for(KanbanSlimDeljitBean bean : pageList.getContent()) {
			bean.setIptDeliveryDate(form.getIptShipmentDate());
			bean.setIptShipmentNo(form.getIptShipmentNo());
		}
		// 属性名はpageList固定とする
    	model.addAttribute("pageList", pageList);

    	// POST時に必要なリストをセット
    	form.setBeanList(pageList.getContent());

    	// ページサイズ変更用（Pagerを使用する画面は必須）
    	model.addAttribute("pageSizeList", getPageSizeList());

    	model.addAttribute("kanbanSlimDeljitForm", form);

    	// Controllerが持っているメッセージをクリア（次以降の動作でメッセージがクリアされている）
        clearErrors();
        clearMessages();
        clearWarnings();

		return "kanbanslim/inboundSimpleKanbanDeljit";
	}

	/**
	 * 各メソッドでの共通処理
	 *   出荷場セキュリティの使用有無
	 *   ユーザの実行権限
	 *   検索条件の保持、更新
	 *   ページング処理
	 *
	 * @param form
	 * @param userSession
	 * @param pageable
	 * @return
	 */
	private Pageable commonLogic(KanbanSlimDeljitForm form, UserSession userSession, Pageable pageable) {
    	// 出荷場セキュリティの使用（自分の工区情報から取得）
    	form.setUserDischargePlaceCode(false);

    	// 実行権限取得（ユーザのロールタイプ）
    	String roleType = userSession.getMyUsers().getRoleType();
    	if(RoleType.ADMINISTRATOR.getId().equals(roleType)
    			|| RoleType.MAINTENANCE.getId().equals(roleType)
    			|| RoleType.OPERATOR.getId().equals(roleType)
    			|| RoleType.OPTUSER.getId().equals(roleType)
    			|| RoleType.WORKER.getId().equals(roleType)) {
    		form.setAuthorized(true);
    	} else {
    		form.setAuthorized(false);
    	}

    	KanbanSlimDeljitCondition condition = null;
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("kanbanSlimDeljitCondition", RequestAttributes.SCOPE_SESSION);
    	if(obj != null && obj instanceof KanbanSlimDeljitCondition) {
    		// セッションに検索条件がある場合
    		condition = (KanbanSlimDeljitCondition)obj;
    		if(form.getPageSize() == null) {
    			form.setPageSize(condition.getPageSize());
    		} else {
    			condition.setPageSize(form.getPageSize());
    		}
    		if(CommonDataUtil.isNullOrEmpty(form.getShipToReciveCode())) {
    			form.setShipToReciveCode(condition.getShipToReciveCode());
    		} else {
    			condition.setShipToReciveCode(form.getShipToReciveCode());
    		}
    	} else {
    		// セッションにない場合は検索条件を保存
    		condition = new KanbanSlimDeljitCondition();
    		condition.setPageSize(form.getPageSize());
    		condition.setShipToReciveCode(form.getShipToReciveCode());
    	}
    	// セッションに検索条件を格納
		RequestContextHolder.getRequestAttributes().setAttribute("kanbanSlimDeljitCondition", condition, RequestAttributes.SCOPE_SESSION);

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

    	return pageable;
	}

	/**
	 * かんばん納入指示 最新の情報に更新
	 * @param form
	 * @param pageable
	 * @param model
	 * @return
	 */
	@RequestMapping(value="list", params="unissuedRefresh", method=RequestMethod.POST)
    public String inboundKanbanDeljitUnissuedDataRefresh(@Valid @ModelAttribute("kanbanSlimDeljitForm") KanbanSlimDeljitForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(!(obj instanceof UserSession)) return "redirect:/timeout";	 // SCMのログイン画面に戻す。

    	UserSession userSession = (UserSession)obj;

    	// 各メソッド共通処理
    	pageable = commonLogic(form, userSession, pageable);


		return "kanbanslim/inboundSimpleKanbanDeljit";
    }

}
