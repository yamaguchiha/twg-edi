package jp.or.twg.twg_edi.kanbanslim.controller;

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
 * かんばん納入指示Slim　コントロールクラス
 *
 *   かんばん納入指示Slimメニュー内にある各画面のコントロールはすべてここに記述する
 *
 * @author yamaguchiha
 *
 */
@Controller
public class KanbanSlimController extends BaseController {

	/**
	 * かんばん読取枚数調整 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/inboundReadQuantityAdjust"})
    public String inboundReadQuantityAdjustInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "かんばん読取枚数調整");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "kanbanslim/inboundReadQuantityAdjust";
    }

	/**
	 * 発注枚数リセット 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/inboundOrderQuantityReset"})
    public String inboundOrderQuantityResetInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "発注枚数リセット");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "kanbanslim/inboundOrderQuantityReset";
    }

	/**
	 * 発注対象登録処理 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/inboundOrderTargetRegistration"})
    public String inboundOrderTargetRegistrationInit(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "発注対象登録処理");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "kanbanslim/inboundOrderTargetRegistration";
    }

}
