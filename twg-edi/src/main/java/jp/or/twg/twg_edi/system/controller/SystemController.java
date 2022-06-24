package jp.or.twg.twg_edi.system.controller;

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
 * 処理一覧（オプション）　コントロールクラス
 *
 *   処理一覧（オプション）メニュー内にある各画面のコントロールはすべてここに記述する
 *
 * @author yamaguchiha
 */
@Controller
public class SystemController extends BaseController {

	/**
	 * 処理一覧（オプション） 初期画面
	 * @param model
	 * @return
	 */
	@GetMapping({"/optionThreadManager"})
    public String init(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "処理一覧(オプション)");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述


        return "system/OptionTreadManager";
    }

}
