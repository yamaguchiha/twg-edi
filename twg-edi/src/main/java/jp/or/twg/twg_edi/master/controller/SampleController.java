/**
 *
 */
package jp.or.twg.twg_edi.master.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.master.model.SampleSearchCondition;

/**
 * @author yamaguchiha
 *
 */
@Controller
public class SampleController extends BaseController {

	@RequestMapping({"/sample/list"})
    public String masterUserAdd(Pageable pageable, @ModelAttribute SampleSearchCondition condition, Model model) {

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

    	condition.setIptShipmentDate(DateUtility.getStringFromDate(new Date()));

    	// 選択する項目側は変更不可でよいのでunmodifiableMapを使用してます
    	Map<String, String> CHECK_ITEMS = Collections.unmodifiableMap(new LinkedHashMap<String, String>() {
            {
                put("checkbox_A", "A");
                put("checkbox_B", "B");
                put("checkbox_C", "C");
                put("checkbox_D", "D");
                put("checkbox_E", "E");
            }
        });
    	model.addAttribute("checkItems", CHECK_ITEMS);
    	if(CommonDataUtil.isNullOrEmpty(condition.getMultiChecks())) {
    		// 初回はnullなので初期値としてBとDを入れてみました。
        	condition.setMultiChecks(new String[] {"B", "D"});
    	}

    	model.addAttribute("condition", condition);

    	// 検索結果エリアにチェックボックスで選択されたものを表示させます
    	List<String> conditionStrings = new ArrayList<String>();
    	if(condition.getMultiChecks().length > 0) {
    		for(String str : condition.getMultiChecks()) {
    			conditionStrings.add(str);
    		}
    	}
    	// Pagerは使用しませんが、他の画面の参考になるようにPageListに値を突っ込んでます
    	Page<String> pageList = new PageImpl<>(conditionStrings, pageable, conditionStrings.size());;
       	model.addAttribute("pageList", pageList);

		return "master/sample";
	}

	/**
	 * Ajax 企業工区選択　一覧取得
	 *   ※BaseControllerのメソッドを呼び出す
	 *
	 * @param postData
	 * @return
	 */
	@PostMapping({"/common/ajaxPartyPlaceList"})
	@ResponseBody
	public Map<String, String>[] setDeliverySelectBox(@RequestBody String postData) {
		// BaseControllerが持つsetSelectPlaceBoxを呼び出す。
		// 引数のpostDataはHTML側を参照
		return super.setSelectPlaceBox(postData);
	}

	/**
	 * Ajax 品番選択　一覧取得
	 *   ※BaseControllerのメソッドを呼び出す
	 *
	 * @param postData
	 * @return
	 */
	@PostMapping({"/common/ajaxItemList"})
	@ResponseBody
	public String setSelectItemBox(@RequestBody String postData) {
		// BaseControllerが持つsetSelectItemBoxを呼び出す。
		// 引数のpostDataはHTML側を参照
		return super.setSelectItemBox(postData);
	}

}
