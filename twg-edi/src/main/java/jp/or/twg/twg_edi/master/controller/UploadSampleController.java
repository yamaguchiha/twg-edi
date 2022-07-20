package jp.or.twg.twg_edi.master.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.utility.DateUtility;

/**
 * @author yamaguchiha
 *
 */
@Controller
public class UploadSampleController extends BaseController {

	@RequestMapping({"/upload"})
    public String uploadInit(Model model) {

		// ログイン画面でログインした情報が取得できます.
		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "サンプル");
            clearMessages();
            clearErrors();
            clearWarnings();
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	List<String> list = new ArrayList<String>();
    	model.addAttribute("list", list);

    	return "master/uploadSample";
	}

	@PostMapping({"/upload/file"})
	public String uploadFile(@RequestParam("upload_file") MultipartFile multipartFile, Model model) {

		// ログイン画面でログインした情報が取得できます.
		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "サンプル");
            clearMessages();
            clearErrors();
            clearWarnings();
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}
    	List<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(multipartFile.getInputStream(), "MS932"));
			String line;
			while ((line = br.readLine()) != null) {
				final String[] split = line.split(",");
				list.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

    	model.addAttribute("list", list);

    	return "master/uploadSample";
	}

}
