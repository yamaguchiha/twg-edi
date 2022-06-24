package jp.or.twg.twg_edi.development.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.service.LoginInfoService;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.development.model.DevLogin;

@Controller
public class DevLoginController extends BaseController {

	@Autowired
	LoginInfoService service;

	@GetMapping({"/scm"})
    public String scm(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("pageTitle", "SCM側メニュー");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

        return "development/DevMenuSCM";
    }

	@GetMapping({"/login"})
    public String login(Model model, @ModelAttribute DevLogin login) {
        model.addAttribute("versionInformation", "Ver 0.9.000");
        return "development/DevLogin";
    }

	@GetMapping({"/timeout"})
    public String timeout(Model model) {
        return "timeout/timeout";
    }

	@GetMapping({"/logoff"})
    public String logoff() {
    	RequestContextHolder.resetRequestAttributes();

    	// SCMのログイン画面に戻す。
		return "redirect:/login";
    }

	@PostMapping("/login/process")
	public String process(@Validated @ModelAttribute DevLogin login, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/login";
		}

		// ログインチェック
		String loginUserId = login.getUserId().contains("sd") ? login.getUserId() + "_" + login.getPartyId() : login.getUserId();
		if(!service.chkUserPasswd(loginUserId, login.getUserPasswd())) {
			return "redirect:/login";
		}

		// ログイン情報
		service.initialize(loginUserId, login.getPartyId(), login.getPlaceId());

		return "redirect:/menuIB";
	}

    @GetMapping({"/menuIB"})
    public String dispMenuIB(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("menu", "IB");
            model.addAttribute("pageTitle", "オプション開発用メニュー（発注管理）");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	return "development/DevMenuIB";
    }

    @GetMapping({"/menuMA"})
    public String dispMenuMA(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("menu", "MA");
            model.addAttribute("pageTitle", "オプション開発用メニュー（マスタ）");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	return "development/DevMenuMA";
    }

    @GetMapping({"/menuSY"})
    public String dispMenuSY(Model model) {
    	// セッションにログイン情報を格納？
    	// SCMからの遷移方法を聞いてから検討する
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
            model.addAttribute("loginInfo", (UserSession)obj);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("menu", "SY");
            model.addAttribute("pageTitle", "オプション開発用メニュー（システム）");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	return "development/DevMenuSY";
    }
}
