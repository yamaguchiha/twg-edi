package jp.or.twg.twg_edi.master.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.difinition.FormMode;
import jp.or.twg.twg_edi.common.difinition.OptPlaceType;
import jp.or.twg.twg_edi.common.difinition.RoleType;
import jp.or.twg.twg_edi.common.difinition.SqlStatement;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.resource.Message;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import jp.or.twg.twg_edi.common.service.SystemConfigService;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.master.model.UserForm;
import jp.or.twg.twg_edi.master.model.UserSearchCondition;
import jp.or.twg.twg_edi.master.service.MasterUserService;
/**
 * マスタ(ユーザ) コントロールクラス
 *
 *   マスタ(ユーザ)メニュー内にある各画面のコントロールはすべてここに記述する
 *
 * @author yamaguchiha
 */
@Controller
public class MasterUserController extends BaseController {

	@Autowired
	MasterUserService service;

	@Autowired
	PartyPlaceService partyPlaceService;

	@Autowired
	SystemConfigService systemConfigService;

	/**
	 * ユーザ登録 一覧画面（開発用）
	 * @param model
	 * @return
	 */
	@RequestMapping({"/masterUser/list"})
    //public String masterUserList(@ModelAttribute UserSearchCondition condition, Model model) {
    public String masterUserList(@PageableDefault(page = 0, size = 20) Pageable pageable, @ModelAttribute UserSearchCondition condition, Model model) {
		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "ユーザ登録");
            // 操作完了のメッセージを画面側に設定
            model.addAttribute("messages", getMessages());
            // エラーと警告はクリアしておく。メッセージは登録、更新、削除が完了した場合に表示する必要があるのでクリアしない
            clearErrors();
            clearWarnings();
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("userSearchCondition", RequestAttributes.SCOPE_SESSION);
    	if(obj != null && obj instanceof UserSearchCondition) {
    		// セッションに検索条件がある場合

    		if(condition.getSrhInMaintenance() == null &&
    	       condition.getSrhName() == null &&
    	       condition.getSrhUserId() == null &&
    	       condition.getSrhUserIdType() == null &&
    	       condition.getSrhNameType() == null) {
    			// ページング処理での場合
        		condition = (UserSearchCondition)obj;
    		}
    	} else {
    		// セッションになく各項目がNULLの場合は検索条件を初期化
    		if(condition.getSrhInMaintenance() == null &&
        	   condition.getSrhName() == null &&
        	   condition.getSrhUserId() == null &&
        	   condition.getSrhUserIdType() == null &&
        	   condition.getSrhNameType() == null
        	       ) {
        	    	condition.setSrhInMaintenance(CommonDataUtil.isNullOrEmpty(condition.getSrhInMaintenance()) ?  SqlStatement.USERS_ONLY : condition.getSrhInMaintenance());
        	    	condition.setSrhUserIdType(CommonDataUtil.isNullOrEmpty(condition.getSrhUserIdType()) ? SqlStatement.PREFIX_MATCH : condition.getSrhUserIdType());
        	    	condition.setSrhNameType(CommonDataUtil.isNullOrEmpty(condition.getSrhNameType()) ? SqlStatement.PREFIX_MATCH : condition.getSrhNameType());
    		}
    	}

    	// ここからはおまじないと思って記述してください。m(_ _)m
    	if(condition.getPageSize() == null) {
	    	// 1ページに表示する件数はシスパラから取得
	    	condition.setPageSize(systemConfigService.getDefaultSizePerPage(userSession.getMyPlace()).longValue());
	    	// シスパラから取得したページサイズでpage=0のPageableを生成する
	    	pageable = PageRequest.of(pageable.getPageNumber(), condition.getPageSize().intValue(), pageable.getSort());
    	}
    	// パラメータのPageableのpageSizeがデフォルトに戻る？
    	if(condition.getPageSize().intValue() != pageable.getPageSize()) {
    		// セッションからまたは新規のconditionに持つpageSizeとPageableのpageSizeが異なる場合は
    		// conditionの値でPageableを生成しなおす。ちょっと納得いかないが。。。
	    	pageable = PageRequest.of(pageable.getPageNumber(), condition.getPageSize().intValue(), pageable.getSort());
    	}
    	// ここまではおまじないと思って記述してください。m(_ _)m

    	// セッションに検索条件を格納
		RequestContextHolder.getRequestAttributes().setAttribute("userSearchCondition", condition, RequestAttributes.SCOPE_SESSION);

    	// 検索条件に一致するデータを取得
		Page<Users> pageList = service.getListByCondition(pageable, condition);
		editEnabledPlaceForPager(pageList);

		// 属性名はpageList固定とする
    	model.addAttribute("pageList", pageList);
    	model.addAttribute("condition", condition);

    	// ページサイズ変更用（Pagerを使用する画面は必須）
    	model.addAttribute("pageSizeList", getPageSizeList());

    	// Controllerが持っているメッセージをクリア（次以降の動作でメッセージがクリアされている）
        clearErrors();
        clearMessages();
        clearWarnings();

    	return "master/masterUser";
    }

	/**
	 * ユーザ登録 新規登録画面（開発用）
	 * @param model
	 * @return
	 */
	@GetMapping({"/masterUser/add"})
    public String masterUserAdd(Model model) {
		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "ユーザ登録　新規登録");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述

    	// 権限リストの作成
    	Map<String, String> roleTypes = RoleType.getHtmlList();
    	model.addAttribute("roles", roleTypes);

    	// 事業所一覧
    	List<Place> places = partyPlaceService.getAllPlaceByParty(userSession.getMyParty());
    	model.addAttribute("places", places);

    	// 出荷場所一覧
    	Map<String, String> shipments = service.getShipmentHTMLList(places.get(0).getOid());
    	model.addAttribute("shipmentList", shipments);

    	// 納入場所一覧
    	Map<String, String> deliverys = service.getDeliveryHTMLList(places.get(0).getOid());
    	model.addAttribute("deliveryList", deliverys);

    	// UserForm
    	UserForm userForm = new UserForm();
    	userForm.setMode(FormMode.NEW.getVal());
    	userForm.setRoleTypeId(RoleType.ADMINISTRATOR.getId());
    	userForm.setDefaultPlace(places.get(0).getTdbPlaceCode());
    	String[] initVal = {places.get(0).getTdbPlaceCode()};
    	userForm.setSelectPlaces(initVal);
    	userForm.setSelectShipment(OptPlaceType.ALL.getId());
    	userForm.setSelectDelivery(OptPlaceType.ALL.getId());
    	model.addAttribute("userForm", userForm);

        clearErrors();
        clearMessages();
        clearWarnings();
        return "master/masterUserForm";
    }

	/**
	 * ユーザ登録 編集画面（開発用）
	 * @param model
	 * @return
	 */
	@GetMapping({"/masterUser/edit/{id}"})
    public String masterUserEdit(@PathVariable Long id, Model model) {
		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "ユーザ登録　編集");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述

    	// 権限リストの作成
    	Map<String, String> roleTypes = RoleType.getHtmlList();
    	model.addAttribute("roles", roleTypes);
    	// 事業所一覧
    	List<Place> places = partyPlaceService.getAllPlaceByParty(userSession.getMyParty());
    	model.addAttribute("places", places);

    	// 編集するユーザ情報を取得
    	Users userInfo = service.getUserInfo(id);

    	// 出荷場所一覧
    	Map<String, String> shipments = service.getShipmentHTMLList(userInfo.getDefaultPlaceOid());
    	model.addAttribute("shipmentList", shipments);

    	// 納入場所一覧
    	Map<String, String> deliverys = service.getDeliveryHTMLList(userInfo.getDefaultPlaceOid());
    	model.addAttribute("deliveryList", deliverys);

    	// UserForm
    	UserForm userForm = new UserForm();
    	userForm.setMode(FormMode.EDIT.getVal());
    	userForm.setUserOid(userInfo.getOid().toString());
    	userForm.setIptUserId(userInfo.getUserId());
    	userForm.setIptName(userInfo.getName());
    	userForm.setIptPassword(userInfo.getPassword());
    	userForm.setIptPasswordReconfirm(userInfo.getPassword());
    	userForm.setRoleTypeId(userInfo.getRoleType());
    	userForm.setDefaultPlace(partyPlaceService.getPlace(userInfo.getDefaultPlaceOid()).getTdbPlaceCode());
    	String oidValues = userInfo.getEnabledPlaceOidValues();
    	userForm.setSelectPlaces(oidValues.split(","));
    	userForm.setSelectPlacesString(userForm.getSelectPlaces().toString());
    	if(userInfo.getDischargeOid() != null) {
    		userForm.setSelectDelivery(service.getOptPlaceCode(userInfo.getDischargeOid()));
    	}
    	if(userInfo.getLoadingOid() != null) {
    		userForm.setSelectShipment(service.getOptPlaceCode(userInfo.getLoadingOid()));
    	}
    	model.addAttribute("userForm", userForm);

        clearErrors();
        clearMessages();
        clearWarnings();
    	return "master/masterUserForm";
	}

	/**
	 * ユーザ登録 削除画面（開発用）
	 * @param model
	 * @return
	 */
	@GetMapping({"/masterUser/delete/{id}"})
    public String masterUserDelete(@PathVariable Long id, Model model) {
		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "ユーザ登録　削除");
	        clearErrors();
	        clearMessages();
	        clearWarnings();
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
    	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述

    	// 編集するユーザ情報を取得
    	Users userInfo = service.getUserInfo(id);

    	// UserForm
    	UserForm userForm = new UserForm();
    	userForm.setMode(FormMode.DELETE.getVal());
    	userForm.setUserOid(userInfo.getOid().toString());
    	userForm.setIptUserId(userInfo.getUserId());
    	userForm.setIptName(userInfo.getName());
    	userForm.setIptPassword(userInfo.getPassword());
    	userForm.setIptPasswordReconfirm(userInfo.getPassword());
    	userForm.setRoleTypeId(userInfo.getRoleType());
    	userForm.setDefaultPlace(partyPlaceService.getPlace(userInfo.getDefaultPlaceOid()).getTdbPlaceCode());
    	String oidValues = userInfo.getEnabledPlaceOidValues();
    	userForm.setSelectPlaces(oidValues.split(","));
    	userForm.setSelectPlacesString(userForm.getSelectPlaces().toString());
    	if(userInfo.getDischargeOid() != null) {
    		userForm.setSelectDelivery(service.getOptPlaceCode(userInfo.getDischargeOid()));
    	}
    	if(userInfo.getLoadingOid() != null) {
    		userForm.setSelectShipment(service.getOptPlaceCode(userInfo.getLoadingOid()));
    	}

		RequestContextHolder.getRequestAttributes().setAttribute("userForm", userForm, RequestAttributes.SCOPE_SESSION);
    	return "redirect: ../confirm";

	}

	/**
	 * masterUserFromからのPOST処理
	 *
	 * @param userForm
	 * @param bindingResult
	 * @param modelt
	 * @return
	 */
	@RequestMapping(value = "/masterUser/formPost", method = RequestMethod.POST)
	public String masterUserPost(@Valid @ModelAttribute("userForm") UserForm userForm, BindingResult bindingResult, Model model) {
    	if (bindingResult.hasErrors()) {
    		// Formのモデルクラスのアノテーションによるエラーが発生した場合に
    		// モデルクラスにない項目header部分で使用しているModelに追加している属性などはここですべて設定しておく必要がある。
    		// そうしないと画面表示に必要なものがなくエラーとなる。
			return "master/masterUserForm";
		}

        // 新規追加でユーザIDが既に使用されているまたはパスワードが一致していない場合
    	// 更新でパスワードが一致していない場合
    	if((userForm.getMode().equals(FormMode.NEW.getVal()) &&
    			(!service.checkUserId(userForm.getIptUserId()) || !userForm.getIptPassword().equals(userForm.getIptPasswordReconfirm()))) ||
    		(userForm.getMode().equals(FormMode.EDIT.getVal()) &&
    			!userForm.getIptPassword().equals(userForm.getIptPasswordReconfirm()))
    	  ) {
    		clearErrors();
    		if(userForm.getMode().equals(FormMode.NEW.getVal()) && !service.checkUserId(userForm.getIptUserId())) {
        		getErrors().add("", new Message("twg_edi.error.duplicate", "ユーザID"));
    		}
    		if(!userForm.getIptPassword().equals(userForm.getIptPasswordReconfirm())) {
        		getErrors().add("", new Message("twg_edi.error.unmatch", "パスワード", "パスワード(確認)"));
    		}
    		if(!userForm.getIptUserId().equals(userForm.getIptPassword())) {
        		getErrors().add("", new Message("twg_edi.error.nevermatch", "ユーザID", "パスワード"));
    		}

    		UserSession userSession = getUserSession();
        	if(userSession != null) {
                model.addAttribute("loginInfo", userSession);
                model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
                model.addAttribute("messages", getMessages());
                model.addAttribute("errors", getErrors());
                model.addAttribute("warnings", getWarnings());
                model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));

            	// 権限リストの作成
            	Map<String, String> roleTypes = RoleType.getHtmlList();
            	model.addAttribute("roles", roleTypes);
            	// 事業所一覧
            	List<Place> places = partyPlaceService.getAllPlaceByParty(userSession.getMyParty());
            	model.addAttribute("places", places);
            	// 出荷場所一覧
            	Map<String, String> shipments = service.getShipmentHTMLList(places.get(0).getOid());
            	model.addAttribute("shipmentList", shipments);
            	// 納入場所一覧
            	Map<String, String> deliverys = service.getDeliveryHTMLList(places.get(0).getOid());
            	model.addAttribute("deliveryList", deliverys);
       	}
			return "master/masterUserForm";
		}

    	if(userForm.getMode().equals(FormMode.CONFIRM.getVal())) {
			// 保存処理
			service.saveUsers(userForm);
	        clearErrors();
	        clearMessages();
	        clearWarnings();
	        getMessages().add("", new Message("twg_edi.info.finish", "ユーザ", "登録"));

			RequestContextHolder.getRequestAttributes().removeAttribute("userForm", RequestAttributes.SCOPE_SESSION);
	    	return "redirect: ../masterUser/list";
		} else if(userForm.getMode().equals(FormMode.DELETE.getVal())) {
				// 削除処理
				service.deleteUsers(userForm);
		        clearErrors();
		        clearMessages();
		        clearWarnings();
		        getMessages().add("", new Message("twg_edi.info.finish", "ユーザ", "削除"));

				RequestContextHolder.getRequestAttributes().removeAttribute("userForm", RequestAttributes.SCOPE_SESSION);
		    	return "redirect: ../masterUser/list";
		} else {
			RequestContextHolder.getRequestAttributes().setAttribute("userForm", userForm, RequestAttributes.SCOPE_SESSION);
	    	return "redirect: ./confirm";
		}
	}

	/**
	 * ユーザ登録 確認画面（開発用）
	 * @param model
	 * @return
	 */
	@GetMapping({"/masterUser/confirm"})
    public String masterUserConfirm( Model model) {
		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
   	} else {
    		// SCMのログイン画面に戻す。
    		return "redirect:/timeout";
    	}

    	// 必要な初期処理を記述

    	// 事業所一覧
    	List<Place> places = partyPlaceService.getAllPlaceByParty(userSession.getMyParty());
    	model.addAttribute("places", places);

    	UserForm userForm = (UserForm)RequestContextHolder.getRequestAttributes().getAttribute("userForm", RequestAttributes.SCOPE_SESSION);

    	if(userForm.getMode().equals(FormMode.DELETE.getVal())) {
	        model.addAttribute("pageTitle", "ユーザ登録　削除確認");

	        clearErrors();
	        clearMessages();
	        clearWarnings();
	        getWarnings().add("", new Message("twg_edi.warn.confirm", "ユーザ", "削除"));
	        model.addAttribute("warnings", getWarnings());

    	} else if(userForm.getMode().equals(FormMode.NEW.getVal())) {
	        clearErrors();
	        clearMessages();
	        clearWarnings();

	        model.addAttribute("pageTitle", "ユーザ登録　登録確認");

	        getWarnings().add("", new Message("twg_edi.warn.confirm", "ユーザ", "登録"));
	        model.addAttribute("warnings", getWarnings());

	        userForm.setMode(FormMode.CONFIRM.getVal());
    	} else {
	        model.addAttribute("pageTitle", "ユーザ登録　更新確認");

	        clearErrors();
	        clearMessages();
	        clearWarnings();
	        getWarnings().add("", new Message("twg_edi.warn.confirm", "ユーザ", "更新"));
	        model.addAttribute("warnings", getWarnings());

	        userForm.setMode(FormMode.CONFIRM.getVal());
    	}

    	// 権限
    	Map<String, String> roleTypes = RoleType.getHtmlList();
    	userForm.setRoleTypeName(roleTypes.get(userForm.getRoleTypeId()));

    	Place defaultPlace = partyPlaceService.getPlaceByPartyAndPlaceCode(userSession.getMyParty(), userForm.getDefaultPlace());
    	userForm.setDefaultPlaceOid(defaultPlace.getOid().toString());

    	// 出荷場所
    	Map<String, String> shipments = service.getShipmentHTMLList(defaultPlace.getOid());
    	userForm.setSelectShipmentName(shipments.get(userForm.getSelectShipment()));

    	// 納入場所
    	Map<String, String> deliverys = service.getDeliveryHTMLList(defaultPlace.getOid());
    	userForm.setSelectDeliveryName(deliverys.get(userForm.getSelectDelivery()));

    	userForm.setSelectPlacesString(userForm.getSelectPlaces().toString());
    	model.addAttribute("userForm", userForm);

    	return "master/masterUserForm";
	}

	/**
	 * Ajaxでの出荷場所一覧取得
	 *
	 * @param defaultPlace
	 * @return
	 */
	@PostMapping({"/masterUser/shipment"})
	@ResponseBody
	public Map<String, String> setShipmentSelectBox(@RequestBody String defaultPlace) {
		ObjectMapper mapper = new ObjectMapper();
		String searchPlaceCd = "";
		try {
			JsonNode root = mapper.readTree(defaultPlace);
			searchPlaceCd = root.get("defaultPlace").textValue();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	Place searchPlace = partyPlaceService.getPlaceByPartyAndPlaceCode(((UserSession)obj).getMyParty(), searchPlaceCd);
		Map<String, String> shipments = service.getShipmentHTMLList(searchPlace.getOid());

		return shipments;
	}

	/**
	 * Ajaxでの納入場所一覧取得
	 *
	 * @param defaultPlace
	 * @return
	 */
	@PostMapping({"/masterUser/delivery"})
	@ResponseBody
	public Map<String, String> setDeliverySelectBox(@RequestBody String defaultPlace) {
		ObjectMapper mapper = new ObjectMapper();
		String searchPlaceCd = "";
		try {
			JsonNode root = mapper.readTree(defaultPlace);
			searchPlaceCd = root.get("defaultPlace").textValue();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	Place searchPlace = partyPlaceService.getPlaceByPartyAndPlaceCode(((UserSession)obj).getMyParty(), searchPlaceCd);
		Map<String, String> deliveries = service.getDeliveryHTMLList(searchPlace.getOid());

		return deliveries;
	}

}

