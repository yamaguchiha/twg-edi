package jp.or.twg.twg_edi.master.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import jp.or.twg.twg_edi.common.utility.DateUtility;
/**
 * マスタ(かんばん) コントロールクラス
 *
 *   マスタ(かんばん)メニュー内にある各画面のコントロールはすべてここに記述する
 *
 * @author yamaguchiha
 */
@Controller
public class MasterKanbanController extends BaseController {

//	@Autowired
//	MasterKanbanService service;

	@Autowired
	PartyPlaceService partyPlaceService;

	/**
	 * 基本情報設定 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/optionSystemConfig"})
    public String optionSystemConfigInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "基本情報設定");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "master/optionSystemConfig";
    }

	/**
	 * カレンダマスタ 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/calendar"})
    public String calendarInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "カレンダマスタ");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "master/calendar";
    }

	/**
	 * かんばんサイクル情報 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/kanbancycle"})
	public String kanbancycleInit(Model model) {
		// セッションにログイン情報を格納？
		// SCMからの遷移方法を聞いてから検討する
		Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
		if(obj instanceof UserSession) {
	        model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
	        model.addAttribute("pageTitle", "かんばんサイクル情報");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
		} else {
			// SCMのログイン画面に戻す。
			return "redirect:/timeout";
		}

		// 必要な初期処理を記述


	    return "master/kanbancycle";
	}

	/**
	 * かんばん納入指示テーブル 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/deliveryorder"})
	public String deliveryorderInit(Model model) {
		// セッションにログイン情報を格納？
		// SCMからの遷移方法を聞いてから検討する
		Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
		if(obj instanceof UserSession) {
	        model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
	        model.addAttribute("pageTitle", "かんばん納入指示テーブル");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
		} else {
			// SCMのログイン画面に戻す。
			return "redirect:/timeout";
		}

		// 必要な初期処理を記述


	    return "master/deliveryorder";
	}

	/**
	 * かんばん増減情報 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/kanbanadjust"})
	public String kanbanadjustInit(Model model) {
		// セッションにログイン情報を格納？
		// SCMからの遷移方法を聞いてから検討する
		Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
		if(obj instanceof UserSession) {
	        model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
	        model.addAttribute("pageTitle", "かんばん増減情報");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
		} else {
			// SCMのログイン画面に戻す。
			return "redirect:/timeout";
		}

		// 必要な初期処理を記述


	    return "master/kanbanadjust";
	}

	/**
	 * かんばん回転・枝番情報 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/kanbanroll"})
	public String kanbanrollInit(Model model) {
		// セッションにログイン情報を格納？
		// SCMからの遷移方法を聞いてから検討する
		Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
		if(obj instanceof UserSession) {
	        model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
	        model.addAttribute("pageTitle", "かんばん回転・枝番情報");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
		} else {
			// SCMのログイン画面に戻す。
			return "redirect:/timeout";
		}

		// 必要な初期処理を記述


	    return "master/kanbanroll";
	}

	/**
	 * 打切情報 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/orderstop"})
	public String orderstopInit(Model model) {
		// セッションにログイン情報を格納？
		// SCMからの遷移方法を聞いてから検討する
		Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
		if(obj instanceof UserSession) {
	        model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
	        model.addAttribute("pageTitle", "打切情報");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
		} else {
			// SCMのログイン画面に戻す。
			return "redirect:/timeout";
		}

		// 必要な初期処理を記述


	    return "master/orderstop";
	}

}

