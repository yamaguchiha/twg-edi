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

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.difinition.RoleType;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.service.SystemConfigService;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.kanbanslim.model.KanbanSlimDeljitBean;
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
    public String inboundSimpleKanbanDeljitInit(@PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
    	KanbanSlimDeljitForm form = new KanbanSlimDeljitForm();
    	return inboundSimpleKanbanDeljitRefresh(form, pageable, model);
	}

	/**
	 * かんばん納入指示Slim 検索(POST)
	 *
	 * @param pageable
	 * @param model
	 * @return
	 */
	@RequestMapping(value="list", params="refresh", method=RequestMethod.POST)
    public String inboundSimpleKanbanDeljitRefresh(@Valid @ModelAttribute("kanbanSlimDeljitForm") KanbanSlimDeljitForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {

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

    	// →シスパラの納入指示日の時間（HHMM)を取得して処理日を決定する必要がある。対応したらこのコメントを削除
    	// システム日付を処理日にセット
    	form.setIptOperationDate(DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd"));

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
        clearMessages();
        clearWarnings();

        return "kanbanslim/inboundSimpleKanbanDeljit";
    }


}
