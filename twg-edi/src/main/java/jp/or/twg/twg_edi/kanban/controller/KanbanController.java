package jp.or.twg.twg_edi.kanban.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.utility.DateUtility;

/**
 * かんばん納入指示 コントロールクラス
 *
 *   かんばん納入指示メニュー内にある各画面のコントロールはすべてここに記述する
 *
 * @author yamaguchiha
 *
 */
@Controller
public class KanbanController extends BaseController {

	/**
	 * かんばん納入指示 初期画面表示
	 *
	 * @param model
	 * @return
	 */
	@GetMapping({"/inboundKanbanDeljit"})
    public String inboundKanbanDeljitInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "かんばん納入指示");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "kanban/inboundKanbanDeljit";
    }

	/**
	 * 追加納入指示 初期画面表示
	 *
	 * @param model
	 * @return
	 */
	@GetMapping({"/inboundAddDeljit"})
    public String inboundAddDeljitInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "追加納入指示");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "kanban/inboundAddDeljit";
    }

	/**
	 * 外れかんばんキー入力 初期画面表示
	 *
	 * @param model
	 * @return
	 */
	@GetMapping({"/inboundOffKanbanKeyInput"})
    public String inboundOffKanbanKeyInputInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "外れかんばんキー入力");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "kanban/inboundOffKanbanKeyInput";
    }

	/**
	 * 外れかんばんキー入力 初期画面表示
	 *
	 * @param model
	 * @return
	 */
	@GetMapping({"/inboundExchangeReservePrint"})
    public String inboundExchangeReservePrintInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "外れかんばんキー入力");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "kanban/inboundExchangeReservePrint";
    }

	/**
	 * かんばん読取履歴 初期画面表示
	 *
	 * @param model
	 * @return
	 */
	@GetMapping({"/inboundKanbanReadHistoryList"})
    public String inboundKanbanReadHistoryListInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "かんばん読取履歴");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "kanban/inboundKanbanReadHistoryList";
    }

	/**
	 * 納入指示履歴 初期画面表示
	 *
	 * @param model
	 * @return
	 */
	@GetMapping({"/deliveryHistory"})
    public String deliveryHistoryInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "納入指示履歴");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "kanban/deliveryHistory";
    }


}
