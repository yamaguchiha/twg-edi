package jp.or.twg.twg_edi.master.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.difinition.OptionFileIoType;
import jp.or.twg.twg_edi.common.difinition.SqlStatement;
import jp.or.twg.twg_edi.common.entity.OptionFileIoHistory;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.servlet.SimpleDownloadHelper;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.master.service.OutputPdfSampleService;

/**
 * PDF発行サンプル
 * @author yamaguchiha
 *
 */
@Controller
public class OutputPdfSampleController extends BaseController {

	@Autowired
	OutputPdfSampleService outPdfService;

	@RequestMapping({"/outputPdf/list"})
	public String getexEcuteUnissuedData(Model model) {
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

    	List<OptionFileIoHistory> list = outPdfService.getFileIoHistoryListByFileIoType(userSession.getMyPlace().getOid(), OptionFileIoType.RESERVE_KANBAN_DOWNLOAD.name(), SqlStatement.VALUE_Y);
    	model.addAttribute("list", list);

    	return "master/OutputPdfSample";
	}

	/**
	 * 未発行データのダウンロード（発行ボタン処理）
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@GetMapping({"/outputPdf/output/{id}"})
    public void executeAllDownload(@PathVariable Long id, Model model, HttpServletResponse servletResponse) {

		SimpleDownloadHelper downloadHelper = outPdfService.downloadUnissuedData(id);

		try {
			downloadHelper.execute(servletResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 画面への応答ストリームが開始されて
		// [この応答のためにgetOutputStream（）がすでに呼び出されています]のエラーが発生する。
		// 画面の再描画ができないのはどうしようか？
		//return "master/OutputPdfSample";
	}

}
