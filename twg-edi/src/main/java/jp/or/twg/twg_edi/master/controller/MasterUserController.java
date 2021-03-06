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
 * ?????????(?????????) ???????????????????????????
 *
 *   ?????????(?????????)???????????????????????????????????????????????????????????????????????????????????????
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
	 * ??????????????? ???????????????????????????
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
            model.addAttribute("pageTitle", "???????????????");
            // ???????????????????????????????????????????????????
            model.addAttribute("messages", getMessages());
            // ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
            clearErrors();
            clearWarnings();
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
    	} else {
    		// SCM?????????????????????????????????
    		return "redirect:/timeout";
    	}

    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("userSearchCondition", RequestAttributes.SCOPE_SESSION);
    	if(obj != null && obj instanceof UserSearchCondition) {
    		// ?????????????????????????????????????????????

    		if(condition.getSrhInMaintenance() == null &&
    	       condition.getSrhName() == null &&
    	       condition.getSrhUserId() == null &&
    	       condition.getSrhUserIdType() == null &&
    	       condition.getSrhNameType() == null) {
    			// ?????????????????????????????????
        		condition = (UserSearchCondition)obj;
    		}
    	} else {
    		// ????????????????????????????????????NULL????????????????????????????????????
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

    	// ?????????????????????????????????????????????????????????????????????m(_ _)m
    	if(condition.getPageSize() == null) {
	    	// 1?????????????????????????????????????????????????????????
	    	condition.setPageSize(systemConfigService.getDefaultSizePerPage(userSession.getMyPlace()).longValue());
	    	// ???????????????????????????????????????????????????page=0???Pageable???????????????
	    	pageable = PageRequest.of(pageable.getPageNumber(), condition.getPageSize().intValue(), pageable.getSort());
    	}
    	// ??????????????????Pageable???pageSize??????????????????????????????
    	if(condition.getPageSize().intValue() != pageable.getPageSize()) {
    		// ???????????????????????????????????????condition?????????pageSize???Pageable???pageSize?????????????????????
    		// condition?????????Pageable??????????????????????????????????????????????????????????????????
	    	pageable = PageRequest.of(pageable.getPageNumber(), condition.getPageSize().intValue(), pageable.getSort());
    	}
    	// ?????????????????????????????????????????????????????????????????????m(_ _)m

    	// ???????????????????????????????????????
		RequestContextHolder.getRequestAttributes().setAttribute("userSearchCondition", condition, RequestAttributes.SCOPE_SESSION);

    	// ?????????????????????????????????????????????
		Page<Users> pageList = service.getListByCondition(pageable, condition);
		editEnabledPlaceForPager(pageList);

		// ????????????pageList???????????????
    	model.addAttribute("pageList", pageList);
    	model.addAttribute("condition", condition);

    	// ??????????????????????????????Pager?????????????????????????????????
    	model.addAttribute("pageSizeList", getPageSizeList());

    	// Controller??????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        clearErrors();
        clearMessages();
        clearWarnings();

    	return "master/masterUser";
    }

	/**
	 * ??????????????? ?????????????????????????????????
	 * @param model
	 * @return
	 */
	@GetMapping({"/masterUser/add"})
    public String masterUserAdd(Model model) {
		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "??????????????????????????????");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
    	} else {
    		// SCM?????????????????????????????????
    		return "redirect:/timeout";
    	}

    	// ??????????????????????????????

    	// ????????????????????????
    	Map<String, String> roleTypes = RoleType.getHtmlList();
    	model.addAttribute("roles", roleTypes);

    	// ???????????????
    	List<Place> places = partyPlaceService.getAllPlaceByParty(userSession.getMyParty());
    	model.addAttribute("places", places);

    	// ??????????????????
    	Map<String, String> shipments = service.getShipmentHTMLList(places.get(0).getOid());
    	model.addAttribute("shipmentList", shipments);

    	// ??????????????????
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
	 * ??????????????? ???????????????????????????
	 * @param model
	 * @return
	 */
	@GetMapping({"/masterUser/edit/{id}"})
    public String masterUserEdit(@PathVariable Long id, Model model) {
		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "????????????????????????");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
    	} else {
    		// SCM?????????????????????????????????
    		return "redirect:/timeout";
    	}

    	// ??????????????????????????????

    	// ????????????????????????
    	Map<String, String> roleTypes = RoleType.getHtmlList();
    	model.addAttribute("roles", roleTypes);
    	// ???????????????
    	List<Place> places = partyPlaceService.getAllPlaceByParty(userSession.getMyParty());
    	model.addAttribute("places", places);

    	// ????????????????????????????????????
    	Users userInfo = service.getUserInfo(id);

    	// ??????????????????
    	Map<String, String> shipments = service.getShipmentHTMLList(userInfo.getDefaultPlaceOid());
    	model.addAttribute("shipmentList", shipments);

    	// ??????????????????
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
	 * ??????????????? ???????????????????????????
	 * @param model
	 * @return
	 */
	@GetMapping({"/masterUser/delete/{id}"})
    public String masterUserDelete(@PathVariable Long id, Model model) {
		UserSession userSession = getUserSession();
    	if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "????????????????????????");
	        clearErrors();
	        clearMessages();
	        clearWarnings();
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
    	} else {
    		// SCM?????????????????????????????????
    		return "redirect:/timeout";
    	}

    	// ??????????????????????????????

    	// ????????????????????????????????????
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
	 * masterUserFrom?????????POST??????
	 *
	 * @param userForm
	 * @param bindingResult
	 * @param modelt
	 * @return
	 */
	@RequestMapping(value = "/masterUser/formPost", method = RequestMethod.POST)
	public String masterUserPost(@Valid @ModelAttribute("userForm") UserForm userForm, BindingResult bindingResult, Model model) {
    	if (bindingResult.hasErrors()) {
    		// Form???????????????????????????????????????????????????????????????????????????????????????
    		// ?????????????????????????????????header???????????????????????????Model??????????????????????????????????????????????????????????????????????????????????????????
    		// ??????????????????????????????????????????????????????????????????????????????
			return "master/masterUserForm";
		}

        // ????????????????????????ID????????????????????????????????????????????????????????????????????????????????????
    	// ??????????????????????????????????????????????????????
    	if((userForm.getMode().equals(FormMode.NEW.getVal()) &&
    			(!service.checkUserId(userForm.getIptUserId()) || !userForm.getIptPassword().equals(userForm.getIptPasswordReconfirm()))) ||
    		(userForm.getMode().equals(FormMode.EDIT.getVal()) &&
    			!userForm.getIptPassword().equals(userForm.getIptPasswordReconfirm()))
    	  ) {
    		clearErrors();
    		if(userForm.getMode().equals(FormMode.NEW.getVal()) && !service.checkUserId(userForm.getIptUserId())) {
        		getErrors().add("", new Message("twg_edi.error.duplicate", "?????????ID"));
    		}
    		if(!userForm.getIptPassword().equals(userForm.getIptPasswordReconfirm())) {
        		getErrors().add("", new Message("twg_edi.error.unmatch", "???????????????", "???????????????(??????)"));
    		}
    		if(!userForm.getIptUserId().equals(userForm.getIptPassword())) {
        		getErrors().add("", new Message("twg_edi.error.nevermatch", "?????????ID", "???????????????"));
    		}

    		UserSession userSession = getUserSession();
        	if(userSession != null) {
                model.addAttribute("loginInfo", userSession);
                model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
                model.addAttribute("messages", getMessages());
                model.addAttribute("errors", getErrors());
                model.addAttribute("warnings", getWarnings());
                model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));

            	// ????????????????????????
            	Map<String, String> roleTypes = RoleType.getHtmlList();
            	model.addAttribute("roles", roleTypes);
            	// ???????????????
            	List<Place> places = partyPlaceService.getAllPlaceByParty(userSession.getMyParty());
            	model.addAttribute("places", places);
            	// ??????????????????
            	Map<String, String> shipments = service.getShipmentHTMLList(places.get(0).getOid());
            	model.addAttribute("shipmentList", shipments);
            	// ??????????????????
            	Map<String, String> deliverys = service.getDeliveryHTMLList(places.get(0).getOid());
            	model.addAttribute("deliveryList", deliverys);
       	}
			return "master/masterUserForm";
		}

    	if(userForm.getMode().equals(FormMode.CONFIRM.getVal())) {
			// ????????????
			service.saveUsers(userForm);
	        clearErrors();
	        clearMessages();
	        clearWarnings();
	        getMessages().add("", new Message("twg_edi.info.finish", "?????????", "??????"));

			RequestContextHolder.getRequestAttributes().removeAttribute("userForm", RequestAttributes.SCOPE_SESSION);
	    	return "redirect: ../masterUser/list";
		} else if(userForm.getMode().equals(FormMode.DELETE.getVal())) {
				// ????????????
				service.deleteUsers(userForm);
		        clearErrors();
		        clearMessages();
		        clearWarnings();
		        getMessages().add("", new Message("twg_edi.info.finish", "?????????", "??????"));

				RequestContextHolder.getRequestAttributes().removeAttribute("userForm", RequestAttributes.SCOPE_SESSION);
		    	return "redirect: ../masterUser/list";
		} else {
			RequestContextHolder.getRequestAttributes().setAttribute("userForm", userForm, RequestAttributes.SCOPE_SESSION);
	    	return "redirect: ./confirm";
		}
	}

	/**
	 * ??????????????? ???????????????????????????
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
    		// SCM?????????????????????????????????
    		return "redirect:/timeout";
    	}

    	// ??????????????????????????????

    	// ???????????????
    	List<Place> places = partyPlaceService.getAllPlaceByParty(userSession.getMyParty());
    	model.addAttribute("places", places);

    	UserForm userForm = (UserForm)RequestContextHolder.getRequestAttributes().getAttribute("userForm", RequestAttributes.SCOPE_SESSION);

    	if(userForm.getMode().equals(FormMode.DELETE.getVal())) {
	        model.addAttribute("pageTitle", "??????????????????????????????");

	        clearErrors();
	        clearMessages();
	        clearWarnings();
	        getWarnings().add("", new Message("twg_edi.warn.confirm", "?????????", "??????"));
	        model.addAttribute("warnings", getWarnings());

    	} else if(userForm.getMode().equals(FormMode.NEW.getVal())) {
	        clearErrors();
	        clearMessages();
	        clearWarnings();

	        model.addAttribute("pageTitle", "??????????????????????????????");

	        getWarnings().add("", new Message("twg_edi.warn.confirm", "?????????", "??????"));
	        model.addAttribute("warnings", getWarnings());

	        userForm.setMode(FormMode.CONFIRM.getVal());
    	} else {
	        model.addAttribute("pageTitle", "??????????????????????????????");

	        clearErrors();
	        clearMessages();
	        clearWarnings();
	        getWarnings().add("", new Message("twg_edi.warn.confirm", "?????????", "??????"));
	        model.addAttribute("warnings", getWarnings());

	        userForm.setMode(FormMode.CONFIRM.getVal());
    	}

    	// ??????
    	Map<String, String> roleTypes = RoleType.getHtmlList();
    	userForm.setRoleTypeName(roleTypes.get(userForm.getRoleTypeId()));

    	Place defaultPlace = partyPlaceService.getPlaceByPartyAndPlaceCode(userSession.getMyParty(), userForm.getDefaultPlace());
    	userForm.setDefaultPlaceOid(defaultPlace.getOid().toString());

    	// ????????????
    	Map<String, String> shipments = service.getShipmentHTMLList(defaultPlace.getOid());
    	userForm.setSelectShipmentName(shipments.get(userForm.getSelectShipment()));

    	// ????????????
    	Map<String, String> deliverys = service.getDeliveryHTMLList(defaultPlace.getOid());
    	userForm.setSelectDeliveryName(deliverys.get(userForm.getSelectDelivery()));

    	userForm.setSelectPlacesString(userForm.getSelectPlaces().toString());
    	model.addAttribute("userForm", userForm);

    	return "master/masterUserForm";
	}

	/**
	 * Ajax??????????????????????????????
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
	 * Ajax??????????????????????????????
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

