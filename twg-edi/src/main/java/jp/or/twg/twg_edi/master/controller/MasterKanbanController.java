package jp.or.twg.twg_edi.master.controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.multipart.MultipartFile;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.difinition.FormMode;
import jp.or.twg.twg_edi.common.difinition.RoleType;
import jp.or.twg.twg_edi.common.difinition.SqlStatement;
import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.resource.Message;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import jp.or.twg.twg_edi.common.service.SystemConfigService;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.common.utility.StringUtility;
import jp.or.twg.twg_edi.master.model.KanbanAdjustCsvDto;
import jp.or.twg.twg_edi.master.model.KanbanAdjustDetailDto;
import jp.or.twg.twg_edi.master.model.KanbanAdjustDetailForm;
import jp.or.twg.twg_edi.master.model.KanbanAdjustDto;
import jp.or.twg.twg_edi.master.model.KanbanAdjustForm;
import jp.or.twg.twg_edi.master.model.KanbanAdjustSearchCondition;
import jp.or.twg.twg_edi.master.model.KanbanAdjustUploadForm;
import jp.or.twg.twg_edi.master.service.KanbanAdjustService;

/**
 * マスタ(かんばん) コントロールクラス
 *
 *   マスタ(かんばん)メニュー内にある各画面のコントロールはすべてここに記述する
 *
 * @author yamaguchiha
 */
@Controller
public class MasterKanbanController extends BaseController {

    @Autowired
    KanbanAdjustService kanbanAdjustService;

    @Autowired
    SystemConfigService systemConfigService;

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
     * かんばん増減情報 初期画面表示(GET)
     *
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/kanbanAdjust/list", params="refresh", method=RequestMethod.GET)
    public String kanbanAdjustInit(@PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
        KanbanAdjustForm form = new KanbanAdjustForm();
        return kanbanAdjustRefresh(form, pageable, model);
     }

    /**
     * かんばん増減情報 キャンセル(POST)
     *
     * @param form
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/kanbanAdjust/list", params="cancel", method=RequestMethod.POST)
    public String kanbanAdjustCancel(@Valid @ModelAttribute("kanbanAdjustForm") KanbanAdjustForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
        // 初期検索に戻す
        form = new KanbanAdjustForm();
        // セッションの検索条件を削除
        RequestContextHolder.getRequestAttributes().removeAttribute("kanbanAdjustSearchCondition", RequestAttributes.SCOPE_SESSION);
        return kanbanAdjustRefresh(form, pageable, model);
     }

    /**
     * かんばん増減情報 検索(POST)
     *
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/kanbanAdjust/list", params="search", method=RequestMethod.POST)
    public String kanbanAdjustSearch(@Valid @ModelAttribute("kanbanAdjustForm") KanbanAdjustForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
        // セッションに検索条件を格納
        RequestContextHolder.getRequestAttributes().setAttribute("kanbanAdjustSearchCondition", form.getCondition(), RequestAttributes.SCOPE_SESSION);
        return kanbanAdjustRefresh(form, pageable, model);
     }

     /**
      * かんばん増減情報 再表示(POST)
      *
      * @param form
      * @param pageable
      * @param model
      * @return
      */
     @RequestMapping(value="/kanbanAdjust/list", params="refresh", method=RequestMethod.POST)
     public String kanbanAdjustRefresh(@Valid @ModelAttribute("kanbanAdjustForm") KanbanAdjustForm form, Pageable pageable, Model model) {

         UserSession userSession = getUserSession();
         if(userSession != null) {
             model.addAttribute("loginInfo", userSession);
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

         // 各メソッド共通処理
         pageable = kanbanAdjustCommonLogic(form, userSession, pageable);


         // POST以外の検索はページングなどであるためセッションから検索条件を取得する
         if(form.getCondition() == null) {
             Object obj = RequestContextHolder.getRequestAttributes().getAttribute("kanbanAdjustSearchCondition", RequestAttributes.SCOPE_SESSION);
             if(obj != null && obj instanceof KanbanAdjustSearchCondition) {
                 // セッションに検索条件がある場合
                 form.setCondition((KanbanAdjustSearchCondition)obj);
             } else {
                 // セッションにない場合はありえないのでエラー
             }
         }

         // 再表示
         Boolean boo = kanbanAdjustRefreshDataSet(pageable, form, model);
         if(boo == false) {
             // SCMのログイン画面に戻す。
             return "redirect:/timeout";
         }

         // Controllerが持っているメッセージをクリア（次以降の動作でメッセージがクリアされている）
         clearErrors();
         clearMessages();
         clearWarnings();

         return "master/kanbanAdjust";
     }

//    /**
//      * かんばん増減情報更新
//      *
//      * @param pageable
//      * @param form
//      * @param model
//      * @return
//      */
//     @RequestMapping(value = "/kanbanAdjust/list",  params = "add", method = RequestMethod.POST)
//     public String kanbanAdjustPost(@Valid Pageable pageable, @ModelAttribute("kanbanAdjustForm") KanbanAdjustDetailForm form, Model model) {
//
//         UserSession userSession = getUserSession();
//         if(userSession != null) {
//             model.addAttribute("loginInfo", userSession);
//             model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
//             model.addAttribute("pageTitle", "かんばん増減情報");
//             model.addAttribute("messages", getMessages());
//             model.addAttribute("errors", getErrors());
//             model.addAttribute("warnings", getWarnings());
//         } else {
//             // SCMのログイン画面に戻す。
//             return "redirect:/timeout";
//         }
//
//         getMessages().add("", new Message("twg_edi.info.finish", "かんばん増減情報", "更新"));
//
//
//         clearErrors();
//         clearMessages();
//         clearWarnings();
//
//         model.addAttribute("kanbanAdjustDetailForm", form);
//
//         return "master/kanbanAdjust";
//    }
//
   /**
   * かんばん増減情報 再表示
   *
   * @param form
   * @param modelt
   */
  public boolean kanbanAdjustRefreshDataSet(Pageable pageable, KanbanAdjustForm form, Model model) {

      // ""はnullに置換する
      form.getCondition().setSrhItemE04(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhItemE04()) ? null : form.getCondition().getSrhItemE04());
      form.getCondition().setSrhItemE18(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhItemE18()) ? null : form.getCondition().getSrhItemE18());
      form.getCondition().setSrhItemIdIn(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhItemIdIn()) ? null : form.getCondition().getSrhItemIdIn());
      form.getCondition().setSrhPartyAbbrCode(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPartyAbbrCode()) ? null : form.getCondition().getSrhPartyAbbrCode());
      form.getCondition().setSrhPlaceCode(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPlaceCode()) ? null : form.getCondition().getSrhPlaceCode());
      form.getCondition().setSrhPlaceOfDischargeId(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPlaceOfDischargeId()) ? null : form.getCondition().getSrhPlaceOfDischargeId());
      form.getCondition().setSrhPlaceOfLoadingId(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPlaceOfLoadingId()) ? null : form.getCondition().getSrhPlaceOfLoadingId());

      // 検索条件に一致するデータを取得
      Page<KanbanAdjustDto> pageList = kanbanAdjustService.getListByCondition(pageable, form.getCondition());

      // srhAdjustType:増減区分
      Map<String, Integer> adjustTypeMap = kanbanAdjustService.getAdjustTypeHTMLCheckBox();
      model.addAttribute("adjustTypeCheckBox", adjustTypeMap);
      if(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhAdjustTypes())){
          // 初期値をセット
          form.getCondition().setSrhAdjustTypes(new Integer[] {0, 1});
      }

      // srhAdjustStatus:増減状況
      Map<String, Integer> adjustStatusMap = kanbanAdjustService.getAdjustStatusHTMLCheckBox();
      model.addAttribute("adjustStatusCheckBox", adjustStatusMap);
      if(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhAdjustStatus())){
          // 初期値をセット
          form.getCondition().setSrhAdjustStatus(new Integer[] {0, 1, 2, 3});
      }

      //表示用にデータを編集
      for(KanbanAdjustDto dto : pageList) {
          // 出荷元工区から出荷元を呼び出す
          Place place = partyPlaceService.getPlace(dto.getPlaceSfOid());
          Party party = partyPlaceService.getParty(place.getPartyOid());

          // 出荷元
          dto.setPartySfCode(party.getTdbPartyCode());
          dto.setPartySfName(party.getName());

          // 出荷元工区
          dto.setPlaceSfCode(place.getTdbPlaceCode());
          dto.setPlaceSfName(place.getName());

          // 増減開始納入指示日
          dto.setStartDeliveryDateStringDate(StringUtility.formatDateYYYYMMDD(dto.getStartDeliveryDateStringDate()));

          // 増減区分
          dto.setAdjustTypeName(getKey(adjustTypeMap, dto.getAdjustType()));

          // 増減状況
          dto.setAdjustStatusName(getKey(adjustStatusMap, dto.getAdjustStatus()));
      }

      // 属性名はpageList固定とする
      model.addAttribute("pageList", pageList);

      // ページサイズ変更用（Pagerを使用する画面は必須）
      model.addAttribute("pageSizeList", getPageSizeList());
      // ページ番号変更用（Pagerを使用する画面は必須）
      form.setPageNumber(pageable.getPageNumber());

      model.addAttribute("kanbanAdjustForm", form);

      return true;
  }

     /**
      * かんばん増減情報 各メソッドでの共通処理
      *   出荷場セキュリティの使用有無
      *   ユーザの実行権限
      *   検索条件の保持、更新
      *   ページング処理
      *
      * @param form
      * @param userSession
      * @param pageable
      * @return
      */
     private Pageable kanbanAdjustCommonLogic(KanbanAdjustForm form, UserSession userSession, Pageable pageable) {
         // 出荷場セキュリティの使用（自分の工区情報から取得）
         form.setUserDischargePlaceCode(false);

         // 実行権限取得（ユーザのロールタイプ）
         String roleType = userSession.getMyUsers().getRoleType();
         form.setAuthorized(isRoleType(roleType));

         KanbanAdjustSearchCondition condition = null;
         Object obj = RequestContextHolder.getRequestAttributes().getAttribute("kanbanAdjustSearchCondition", RequestAttributes.SCOPE_SESSION);
         if(obj != null && obj instanceof KanbanAdjustSearchCondition) {
             // セッションに検索条件がある場合
             condition = (KanbanAdjustSearchCondition)obj;
             if(form.getPageSize() == null) {
                 form.setPageSize(condition.getPageSize());
             } else {
                 condition.setPageSize(form.getPageSize());
             }
         } else {
             // セッションにない場合は検索条件を保存
             condition = new KanbanAdjustSearchCondition();
             condition.setPageSize(form.getPageSize());
             // 背番号 デフォルト：部分
             condition.setSrhItemE04Type(CommonDataUtil.isNullOrEmpty(condition.getSrhItemE04Type()) ?  SqlStatement.PARTIAL_MATCH : condition.getSrhItemE04Type());
             // 品番 デフォルト：部分
             condition.setSrhItemIdInType(CommonDataUtil.isNullOrEmpty(condition.getSrhItemIdInType()) ? SqlStatement.PARTIAL_MATCH : condition.getSrhItemIdInType());
         }
         // 自事業所
         condition.setSrhPlaceByOid(userSession.getMyPlace().getOid());

         // セッションに検索条件を格納
         RequestContextHolder.getRequestAttributes().setAttribute("kanbanAdjustSearchCondition", condition, RequestAttributes.SCOPE_SESSION);
         // formに検索条件を格納
         form.setCondition(condition);

         // ここからはおまじないと思って記述してください。m(_ _)m
         if(form.getPageSize() == null) {
             // 1ページに表示する件数はシスパラから取得
             form.setPageSize(systemConfigService.getDefaultSizePerPage(userSession.getMyPlace()).longValue());
             // シスパラから取得したページサイズでpage=0のPageableを生成する
             pageable = PageRequest.of(pageable.getPageNumber(), form.getPageSize().intValue(), pageable.getSort());
         }
         // パラメータのPageableのpageSizeがデフォルトに戻る？
         if(form.getPageSize().intValue() != pageable.getPageSize()) {
             // セッションからまたは新規のconditionに持つpageSizeとPageableのpageSizeが異なる場合は
             // conditionの値でPageableを生成しなおす。ちょっと納得いかないが。。。
             pageable = PageRequest.of(pageable.getPageNumber(), form.getPageSize().intValue(), pageable.getSort());
         }
         // ここまではおまじないと思って記述してください。m(_ _)m

         return pageable;
     }

     /**
      *  かんばん増減情報 新規登録画面
      * @param model
      * @return
      */
     @GetMapping({"/kanbanAdjust/add"})
     public String kanbanAdjustAdd(Model model) {
         UserSession userSession = getUserSession();
         if(userSession != null) {
             model.addAttribute("loginInfo", userSession);
             model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
             model.addAttribute("pageTitle", "かんばん増減情報 追加");
             model.addAttribute("messages", getMessages());
             model.addAttribute("errors", getErrors());
             model.addAttribute("warnings", getWarnings());
             model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
         } else {
             // SCMのログイン画面に戻す。
             return "redirect:/timeout";
         }

         // 必要な初期処理を記述

         // 増減状況プルダウンの作成
         Map<String, String> adjustStatusList = kanbanAdjustService.getAdjustStatusHTMLList();
         model.addAttribute("adjustStatusList", adjustStatusList);

         // 増減区分プルダウンの作成
         Map<String, String> adjustTypeList = kanbanAdjustService.getAdjustTypeHTMLList();
         model.addAttribute("adjustTypeList", adjustTypeList);

         // 増減情報
         KanbanAdjustDetailForm form = new KanbanAdjustDetailForm();
         form.setMode(FormMode.NEW.getVal());
         form.setSubMode(FormMode.NEW.getVal());   // 品番未検索
         form.setItemPartOid(null);
         form.setPlanDateStringDate(null);
         form.setStartDeliveryDateStringDate(null);
         form.setStartShipmentNo(null);
         form.setAdjustStatus(1);                                 // デフォルト：予約
         form.setAdjustType(null);                                // デフォルト：--選択してください
         form.setQuantity(null);
         form.setParQuantity(null);
         form.setCarryForwardFractionQuantity(null);
         model.addAttribute("kanbanAdjustDetailForm", form);

         clearErrors();
         clearMessages();
         clearWarnings();
         return "master/kanbanAdjustDetailForm";
     }

     /**
      *  かんばん増減情報 新規登録画面
      * @param model
      * @return
      */
     @RequestMapping(value = "/kanbanAdjust/add", method = RequestMethod.POST)
     public String kanbanAdjustAdd(@Valid @ModelAttribute("kanbanAdjustDetailForm") KanbanAdjustDetailForm form, Model model) {
         UserSession userSession = getUserSession();
         if(userSession != null) {
             model.addAttribute("loginInfo", userSession);
             model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
             model.addAttribute("pageTitle", "かんばん増減情報 追加");
             model.addAttribute("messages", getMessages());
             model.addAttribute("errors", getErrors());
             model.addAttribute("warnings", getWarnings());
             model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
         } else {
             // SCMのログイン画面に戻す。
             return "redirect:/timeout";
         }

         // 必要な初期処理を記述

         // 増減状況プルダウンの作成
         Map<String, String> adjustStatusList = kanbanAdjustService.getAdjustStatusHTMLList();
         model.addAttribute("adjustStatusList", adjustStatusList);

         // 増減区分プルダウンの作成
         Map<String, String> adjustTypeList = kanbanAdjustService.getAdjustTypeHTMLList();
         model.addAttribute("adjustTypeList", adjustTypeList);

         // 品番検索データを取得
         KanbanAdjustDetailDto dto = kanbanAdjustService.getItemData(form.getItemIdIn(), form.getItemE18());

         // 増減情報表示編集
         KanbanAdjustDetailForm formAdd = kanbanAdjustDisplayEdit(dto, FormMode.NEW.getVal());

         // 途中まで入力したフォームの情報はそのまま返す
         formAdd.setAdjustStatus(form.getAdjustStatus());
         formAdd.setPlanDateStringDate(form.getPlanDateStringDate());
         formAdd.setStartDeliveryDateStringDate(form.getStartDeliveryDateStringDate());
         formAdd.setStartShipmentNo(form.getStartShipmentNo());
         formAdd.setAdjustType(form.getAdjustType());
         formAdd.setQuantity(form.getQuantity());
         formAdd.setParQuantity(form.getParQuantity());
         formAdd.setTotalQuantity(form.getTotalQuantity());
         formAdd.setCarryForwardFractionQuantity(form.getCarryForwardFractionQuantity());

         // 増減情報
         form.setMode(FormMode.NEW.getVal());
         form.setSubMode(FormMode.EDIT.getVal());   // 品番検索済
         model.addAttribute("kanbanAdjustDetailForm", formAdd);

         clearErrors();
         clearMessages();
         clearWarnings();
         return "master/kanbanAdjustDetailForm";
     }

    /**
     *  かんばん増減情報 編集画面
     * @param model
     * @return
     */
    @GetMapping({"/kanbanAdjust/edit/{id}"})
    public String kanbanAdjustEdit(@PathVariable Long id, Model model) {
        UserSession userSession = getUserSession();
        if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "かんばん増減情報　編集");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
        } else {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        // 必要な初期処理を記述

        // 増減状況プルダウンの作成
        Map<String, String> adjustStatusList = kanbanAdjustService.getAdjustStatusHTMLList();
        model.addAttribute("adjustStatusList", adjustStatusList);

        // 増減区分プルダウンの作成
        Map<String, String> adjustTypeList = kanbanAdjustService.getAdjustTypeHTMLList();
        model.addAttribute("adjustTypeList", adjustTypeList);


        // 編集対象データを取得
        KanbanAdjustDetailDto dto = kanbanAdjustService.getDetailData(id);

        // 増減情報表示編集
        KanbanAdjustDetailForm form = kanbanAdjustDisplayEdit(dto, FormMode.EDIT.getVal());

        model.addAttribute("kanbanAdjustDetailForm", form);

        clearErrors();
        clearMessages();
        clearWarnings();
        return "master/kanbanAdjustDetailForm";
    }

    /**
     * kanbanAdjustDetailFormからのPOST処理
     *
     * @param kanbanAdjustDetailForm
     * @param bindingResult
     * @param modelt
     * @return
     */
    @RequestMapping(value = "/kanbanAdjust/formPost", method = RequestMethod.POST)
    public String kanbanAdjustPost(@Valid @ModelAttribute("kanbanAdjustDetailForm") KanbanAdjustDetailForm form, Model model) {
        UserSession userSession = getUserSession();
        if(userSession == null) {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        if(form.getMode().equals(FormMode.DELETE.getVal())) {
            // 削除処理
            kanbanAdjustService.delete(form);

            model.addAttribute("pageTitle", "かんばん増減情報登録　削除確認");

            clearErrors();
            clearMessages();
            clearWarnings();
            getMessages().add("", new Message("twg_edi.info.finish", "かんばん増減情報", "削除"));

            // 削除後は確定画面を表示
            form.setMode(FormMode.CONFIRM.getVal());
        } else if(form.getMode().equals(FormMode.NEW.getVal())) {
            // 保存処理
            kanbanAdjustService.insert(form, userSession);

            model.addAttribute("pageTitle", "かんばん増減情報登録　登録確認");

            clearErrors();
            clearMessages();
            clearWarnings();

            getMessages().add("", new Message("twg_edi.info.finish", "かんばん増減情報", "登録"));

            // 登録後は確定画面を表示
            form.setMode(FormMode.CONFIRM.getVal());
        } else if(form.getMode().equals(FormMode.EDIT.getVal())) {
            // 保存処理
            kanbanAdjustService.update(form, userSession);

            model.addAttribute("pageTitle", "かんばん増減情報登録　更新確認");

            clearErrors();
            clearMessages();
            clearWarnings();

            getMessages().add("", new Message("twg_edi.info.finish", "かんばん増減情報", "更新"));

            // 更新後は確定画面を表示
            form.setMode(FormMode.CONFIRM.getVal());
        }

        // 確認データの表示編集

        // srhAdjustType:増減区分
        Map<String, Integer> adjustTypeMap = kanbanAdjustService.getAdjustTypeHTMLCheckBox();

        // srhAdjustStatus:増減状況
        Map<String, Integer> adjustStatusMap = kanbanAdjustService.getAdjustStatusHTMLCheckBox();

        // 計画日
        form.setPlanDateStringDate(StringUtility.formatDateYYYYMMDD(form.getPlanDateStringDate()));

        // 増減開始納入指示日
        form.setStartDeliveryDateStringDate(StringUtility.formatDateYYYYMMDD(form.getStartDeliveryDateStringDate()));

        // 増減区分
        form.setAdjustTypeName(getKey(adjustTypeMap, form.getAdjustType()));

        // 増減状況
        form.setAdjustStatusName(getKey(adjustStatusMap, form.getAdjustStatus()));

        model.addAttribute("loginInfo", userSession);
        model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
        model.addAttribute("messages", getMessages());
        model.addAttribute("errors", getErrors());
        model.addAttribute("warnings", getWarnings());
        model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));

        model.addAttribute("kanbanAdjustDetailForm", form);

        clearErrors();
        clearMessages();
        clearWarnings();

        return "master/kanbanAdjustDetailForm";
    }

    /**
     *  かんばん増減情報 表示編集
     * @param model
     * @return
     */
    public KanbanAdjustDetailForm kanbanAdjustDisplayEdit(KanbanAdjustDetailDto dto, String mode) {

        // 増減情報
        KanbanAdjustDetailForm form = new KanbanAdjustDetailForm();

        form.setMode(mode);
        form.setOid(dto.getOid());

        // 背番号
        form.setItemE04(dto.getItemE04());
        // 品番
        form.setItemIdIn(dto.getItemIdIn());
        // 表示用品番
        form.setItemIdPd(dto.getItemIdPd());
        // 部品取扱識別
        form.setItemE18(dto.getItemE18());
        // 収容数
        form.setPerPackageQuantity(String.valueOf(dto.getPerPackageQuantity()));
        // 所番地
        form.setManufacturingDepartmentId(dto.getManufacturingDepartmentId());
        // 納入場所
        form.setPlaceOfDischargeId(dto.getPlaceOfDischargeId());

        // 出荷元工区から出荷元を呼び出す
        Place placeSf = partyPlaceService.getPlace(dto.getPlaceSfOid());
        if(placeSf!=null) {
            Party partySf = partyPlaceService.getParty(placeSf.getPartyOid());
            if(partySf!=null) {
                // 出荷元
                form.setPartySfCode(partySf.getTdbPartyCode());
                form.setPartySfName(partySf.getName());
            }
            // 出荷元工区
            form.setPlaceSfCode(placeSf.getTdbPlaceCode());
            form.setPlaceSfName(placeSf.getName());
        }

        // 出荷場所
        form.setPlaceOfLoadingId(dto.getPlaceOfLoadingId());
        form.setPlaceOfLoadingName(dto.getPlaceOfloadingName());

        // 発注元工区から発注元を呼び出す
        Place placeOb = partyPlaceService.getPlace(dto.getPlaceObOid());
        if(placeOb!=null) {
            Party partyOb = partyPlaceService.getParty(placeOb.getPartyOid());
            if(partyOb!=null) {
                // 発注元
                form.setPartySfCode(partyOb.getTdbPartyCode());
                form.setPartySfName(partyOb.getName());
            }
            // 発注元工区
            form.setPlaceSfCode(placeOb.getTdbPlaceCode());
            form.setPlaceSfName(placeOb.getName());
        }

        // かんばん増減情報 oid hidden
        form.setOkaOid(dto.getOkaOid());

        // 選択した増減状況
        form.setAdjustStatus(dto.getAdjustStatus());
        // 計画日
        form.setPlanDateStringDate(StringUtility.formatDateYYYYMMDD(dto.getPlanDateStringDate()));
        // 増減開始納入指示日
        form.setStartDeliveryDateStringDate(StringUtility.formatDateYYYYMMDD(dto.getStartDeliveryDateStringDate()));
        // 増減開始納入指示便
        form.setStartShipmentNo(dto.getStartShipmentNo());
        // 選択した増減状況
        form.setAdjustType(dto.getAdjustType());
        // 増減枚数
        form.setQuantity(dto.getQuantity());
        // 便当増減枚数)
        form.setParQuantity(dto.getParQuantity());
        //form 増減累計枚数
        form.setTotalQuantity(dto.getTotalQuantity());
        // 増減繰越端数
        form.setCarryForwardFractionQuantity(dto.getCarryForwardFractionQuantity());

        return form;
    }

    /**
     *  かんばん増減情報 アップロード画面
     *
     *  以下の設定でアップロードファイルのサイズやTEMP保存箇所を調整可能です
     *  spring.servlet.multipart.max-file-size
     *  spring.servlet.multipart.max-request-size
     *  spring.servlet.multipart.file-size-threshold
     *  spring.servlet.multipart.location
     *
     *  以下の設定を無効にすることでSpringのデフォルト実装を解除できます（アップロード時に何か邪魔されているとき）
     *  spring.servlet.multipart.enabled
     *
     * @param model
     * @return
     */
    @RequestMapping({"/kanbanAdjust/upload"})
    public String kanbanAdjustUpload(Model model) {
        UserSession userSession = getUserSession();
        if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "かんばん増減情報　アップロード");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
        } else {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        // 必要な初期処理を記述

        // ファイルアップロード情報
        List<String> csvList = new ArrayList<String>();
        model.addAttribute("csvList", csvList);


        clearErrors();
        clearMessages();
        clearWarnings();
        return "master/kanbanAdjustUpload";
    }

    /**
     * かんばん増減情報 アップロード確認画面ページ切り替え表示(GET)
     *
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/kanbanAdjust/upload/list", params="refresh", method=RequestMethod.GET)
    public String kanbanAdjustUploadPager(@PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
        // POST以外の検索はページングなどであるためセッションからformを取得する
        Object obj = RequestContextHolder.getRequestAttributes().getAttribute("kanbanAdjustUploadForm", RequestAttributes.SCOPE_SESSION);
        KanbanAdjustUploadForm form = (KanbanAdjustUploadForm)obj;
        return kanbanAdjustUploadRefresh(pageable, model, form);
     }

    /**
     *  かんばん増減情報 アップロード確認画面
     *
     * @param pageable
     * @param multipartFile
     * @param model
     * @param form
     * @return
     */
    @RequestMapping(value="/kanbanAdjust/upload/list", method=RequestMethod.POST)
    public String kanbanAdjustUploadConfirm(@PageableDefault(page = 0, size = 20) Pageable pageable, @RequestParam("uploadFile") MultipartFile multipartFile, Model model, @ModelAttribute("kanbanAdjustUploadForm") KanbanAdjustUploadForm form) {
        // CSVファイル読み込み
        List<KanbanAdjustCsvDto> csvList = new ArrayList<KanbanAdjustCsvDto>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(multipartFile.getInputStream(), "MS932"));
            String line;
            int i = 1;
            while ((line = br.readLine()) != null) {
                final String[] item = line.split(",");
                KanbanAdjustCsvDto csvDto = new KanbanAdjustCsvDto();
                csvDto.setNo(String.valueOf(i));       // No.
                csvDto.setPartyIdBy(item[0]);           // 発注者
                csvDto.setPlaceIdBy(item[1]);           // 発注者事業所
                csvDto.setPartyIdSe(item[2]);           // 受注者
                csvDto.setPlaceIdSe(item[3]);           // 受注者事業所
                csvDto.setItemIdIn(item[4]);            // 品番
                csvDto.setItemE18(item[5]);             // 部品取扱識別
                csvDto.setPartyIdOb(item[6]);           // 発注元
                csvDto.setPlaceIdOb(item[7]);           // 発注元工区
                csvDto.setPartyIdSf(item[8]);           // 出荷元
                csvDto.setPlaceIdSf(item[9]);           // 出荷元工区
                csvDto.setPartyIdSt(item[10]);          // 納入先
                csvDto.setPlaceIdSt(item[11]);          // 納入先工区
                csvDto.setPlanDate(item[12]);           // 計画日
                csvDto.setStartDeliveryDate(item[13]);  // 増減開始納入指示日
                csvDto.setStartShipmentNo(item[14]);    // 増減開始便
                csvDto.setAdjustType(item[15]);         // 増減区分
                csvDto.setQuantity(item[16]);           // 増減枚数
                csvDto.setParQuantity(item[17]);        // 便当増減枚数
                csvList.add(csvDto);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // formにファイルデータを格納
        form.setCsvList(csvList);
        // セッションにformを格納
        RequestContextHolder.getRequestAttributes().setAttribute("kanbanAdjustUploadForm", form, RequestAttributes.SCOPE_SESSION);
        // FIXME 取得時することに意味はないが、他のメソッドで違うconfirmでアトリビュートされるため、一度読み込みしてみる
        Object objj = RequestContextHolder.getRequestAttributes().getAttribute("kanbanAdjustUploadForm", RequestAttributes.SCOPE_SESSION);


        return kanbanAdjustUploadRefresh(pageable, model, form);
     }

    /**
     *  かんばん増減情報 アップロード確認画面再表示
     * @param pageable
     * @param model
     * @param form
     * @return
     */
//    @SuppressWarnings("unchecked")
    @RequestMapping(value="/kanbanAdjust/upload/list", params="refresh", method=RequestMethod.POST)
    public String kanbanAdjustUploadRefresh(@PageableDefault(page = 0, size = 20) Pageable pageable, Model model,@ModelAttribute("kanbanAdjustUploadForm") KanbanAdjustUploadForm form) {
        UserSession userSession = getUserSession();
        if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "かんばん増減情報　アップロード内容の確認");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            getWarnings().add("", new Message("twg_edi.warn.confirm", "かんばん増減情報", "登録"));
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
        } else {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        // ここからはおまじないと思って記述してください。m(_ _)m
        if(form.getPageSize() == null) {
            // 1ページに表示する件数はシスパラから取得
            form.setPageSize(systemConfigService.getDefaultSizePerPage(userSession.getMyPlace()).longValue());
            // シスパラから取得したページサイズでpage=0のPageableを生成する
            pageable = PageRequest.of(pageable.getPageNumber(), form.getPageSize().intValue(), pageable.getSort());
        }
        // パラメータのPageableのpageSizeがデフォルトに戻る？
        if(form.getPageSize().intValue() != pageable.getPageSize()) {
            // セッションからまたは新規のconditionに持つpageSizeとPageableのpageSizeが異なる場合は
            // conditionの値でPageableを生成しなおす。ちょっと納得いかないが。。。
            pageable = PageRequest.of(pageable.getPageNumber(), form.getPageSize().intValue(), pageable.getSort());
        }
        // ここまではおまじないと思って記述してください。m(_ _)m

        // CSVをページャー表示する分だけ取り出す
        Page<KanbanAdjustCsvDto> pageList = new PageImpl<>(form.getCsvList().subList(pageable.getPageNumber() * pageable.getPageSize(),
                                                                                     (pageable.getPageNumber() + 1) * pageable.getPageSize()),
                                                            pageable,
                                                            form.getCsvList().size());

        // 属性名はpageList固定とする
        model.addAttribute("pageList", pageList);

        // ページサイズ変更用（Pagerを使用する画面は必須）
        model.addAttribute("pageSizeList", getPageSizeList());
        // ページ番号変更用（Pagerを使用する画面は必須）
        form.setPageNumber(pageable.getPageNumber());

        model.addAttribute("kanbanAdjustUploadForm", form);

        clearErrors();
        clearMessages();
        clearWarnings();

        return "master/kanbanAdjustUploadConfirm";
   }

    /**
     *  かんばん増減情報 CSV登録
     *
     * @param model
     * @return
     */
    @RequestMapping({"/kanbanAdjust/upload/file/add"})
    public String kanbanAdjustCsvAdd(Model model) {
        UserSession userSession = getUserSession();
        if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "かんばん増減情報　アップロード");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
        } else {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        // POST以外の検索はセッションからformを取得する
        Object obj = RequestContextHolder.getRequestAttributes().getAttribute("kanbanAdjustUploadForm", RequestAttributes.SCOPE_SESSION);
        KanbanAdjustUploadForm form = (KanbanAdjustUploadForm)obj;

        // 保存処理
        kanbanAdjustService.csvInsert(form, userSession);

//        model.addAttribute("pageTitle", "かんばん増減情報登録　登録確認");


        clearErrors();
        clearMessages();
        clearWarnings();
        return kanbanAdjustInit(null, model);
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

    // 区分変換用（マップの値からキーを取得する）
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /**
     * 実行権限取得（ユーザのロールタイプ）
     *
     * @param form
     * @param userSession
     * @param pageable
     * @return
     */
    private boolean isRoleType(String roleType) {
        // 実行権限取得（ユーザのロールタイプ）
        if(RoleType.ADMINISTRATOR.getId().equals(roleType)
                || RoleType.MAINTENANCE.getId().equals(roleType)
                || RoleType.OPERATOR.getId().equals(roleType)
                || RoleType.OPTUSER.getId().equals(roleType)
                || RoleType.WORKER.getId().equals(roleType)) {
            return(true);
        } else {
            return(false);
        }
    }

}

