package jp.or.twg.twg_edi.kanbanslim.controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.difinition.RoleType;
import jp.or.twg.twg_edi.common.difinition.SqlStatement;
import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.resource.Message;
import jp.or.twg.twg_edi.common.service.SystemConfigService;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.common.utility.StringUtility;
import jp.or.twg.twg_edi.kanbanslim.model.InboundOrderQuantityResetDto;
import jp.or.twg.twg_edi.kanbanslim.model.InboundOrderQuantityResetForm;
import jp.or.twg.twg_edi.kanbanslim.model.InboundOrderQuantityResetSaveDto;
import jp.or.twg.twg_edi.kanbanslim.model.InboundOrderQuantityResetSrhCond;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegDto;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegForm;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegSaveDto;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegSrhCond;
import jp.or.twg.twg_edi.kanbanslim.service.InboundOrderQuantityResetService;
import jp.or.twg.twg_edi.kanbanslim.service.OrderTargetRegService;

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

       @Autowired
       OrderTargetRegService orderTargetRegService;

       @Autowired
       InboundOrderQuantityResetService orderQuantityResetService;

       @Autowired
       SystemConfigService systemConfigService;


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
     * 発注枚数リセット 初期画面表示(GET)
     *
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/inboundOrderQuantityReset/list", params="refresh", method=RequestMethod.GET)
    public String inboundOrderQuantityResetInit(@PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
        InboundOrderQuantityResetForm form = new InboundOrderQuantityResetForm();
        return inboundOrderQuantityResetRefresh(form, pageable, model);
     }

    /**
     * 発注枚数リセット キャンセル(POST)
     *
     * @param form
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/inboundOrderQuantityReset/list", params="cancel", method=RequestMethod.POST)
    public String inboundOrderQuantityResetCancel(@Valid @ModelAttribute("orderQuantityResetForm") InboundOrderQuantityResetForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
        // 初期検索に戻す
        form = new InboundOrderQuantityResetForm();
        // セッションの検索条件を削除
        RequestContextHolder.getRequestAttributes().removeAttribute("orderQuantityResetSrhCond", RequestAttributes.SCOPE_SESSION);
        return inboundOrderQuantityResetRefresh(form, pageable, model);
     }

    /**
     * 発注枚数リセット 検索(POST)
     *
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/inboundOrderQuantityReset/list", params="search", method=RequestMethod.POST)
    public String inboundOrderQuantityResetSearch(@Valid @ModelAttribute("orderQuantityResetForm") InboundOrderQuantityResetForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
        // セッションに検索条件を格納
        RequestContextHolder.getRequestAttributes().setAttribute("orderQuantityResetSrhCond", form.getCondition(), RequestAttributes.SCOPE_SESSION);
        return inboundOrderQuantityResetRefresh(form, pageable, model);
     }

     /**
      * 発注枚数リセット 再表示(POST)
      *
      * @param form
      * @param pageable
      * @param model
      * @return
      */
     @RequestMapping(value="/inboundOrderQuantityReset/list", params="refresh", method=RequestMethod.POST)
     public String inboundOrderQuantityResetRefresh(@Valid @ModelAttribute("orderQuantityResetForm") InboundOrderQuantityResetForm form, Pageable pageable, Model model) {

         UserSession userSession = getUserSession();
         if(userSession != null) {
             model.addAttribute("loginInfo", userSession);
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

         // 各メソッド共通処理
         pageable = inboundOrderQuantityResetCommonLogic(form, userSession, pageable);


         // POST以外の検索はページングなどであるためセッションから検索条件を取得する
         if(form.getCondition() == null) {
             Object obj = RequestContextHolder.getRequestAttributes().getAttribute("orderQuantityResetSrhCond", RequestAttributes.SCOPE_SESSION);
             if(obj != null && obj instanceof InboundOrderQuantityResetSrhCond) {
                 // セッションに検索条件がある場合
                 form.setCondition((InboundOrderQuantityResetSrhCond)obj);
             } else {
                 // セッションにない場合はありえないのでエラー
             }
         }

         // 再表示
         Boolean boo = inboundOrderQuantityResetRefreshDataSet(pageable, form, model);
         if(boo == false) {
             // SCMのログイン画面に戻す。
             return "redirect:/timeout";
         }

         // Controllerが持っているメッセージをクリア（次以降の動作でメッセージがクリアされている）
         clearErrors();
         clearMessages();
         clearWarnings();

         return "kanbanslim/inboundOrderQuantityReset";
     }

    /**
      * 発注枚数リセット更新
      *
      * @param pageable
      * @param form
      * @param model
      * @return
      */
     @RequestMapping(value = "/inboundOrderQuantityReset/list",  params = "add", method = RequestMethod.POST)
     public String inboundOrderQuantityResetPost(@Valid Pageable pageable, @ModelAttribute("orderQuantityResetForm") InboundOrderQuantityResetForm form, Model model) {

         UserSession userSession = getUserSession();
         if(userSession != null) {
             model.addAttribute("loginInfo", userSession);
             model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
             model.addAttribute("pageTitle", "発注枚数リセット");
             model.addAttribute("messages", getMessages());
             model.addAttribute("errors", getErrors());
             model.addAttribute("warnings", getWarnings());
         } else {
             // SCMのログイン画面に戻す。
             return "redirect:/timeout";
         }

         // 各メソッド共通処理
         pageable = inboundOrderQuantityResetCommonLogic(form, userSession, pageable);

         // 保存処理
         orderQuantityResetService.save(form, userSession);

         // セッションから検索条件を取得する
         Object obj = RequestContextHolder.getRequestAttributes().getAttribute("orderQuantityResetSrhCond", RequestAttributes.SCOPE_SESSION);
         form.setCondition((InboundOrderQuantityResetSrhCond)obj);

         // 保存後に同一ページを表示するためformのpageNumberからPageableを生成しなおす。
         pageable = PageRequest.of(form.getPageNumber(), pageable.getPageSize(), pageable.getSort());

         // 再表示
         Boolean boo = inboundOrderQuantityResetRefreshDataSet(pageable, form, model);
         if(boo == false) {
             // SCMのログイン画面に戻す。
             return "redirect:/timeout";
         }

         getMessages().add("", new Message("twg_edi.info.finish", "読取・発注枚数管理テーブルデータ", "更新"));


         clearErrors();
         clearMessages();
         clearWarnings();

         return "kanbanslim/inboundOrderQuantityReset";
    }

   /**
   * 発注枚数リセット 再表示
   *
   * @param form
   * @param modelt
   */
  public boolean inboundOrderQuantityResetRefreshDataSet(Pageable pageable, InboundOrderQuantityResetForm form, Model model) {

      // ""はnullに置換する
      form.getCondition().setSrhItemE04(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhItemE04()) ? null : form.getCondition().getSrhItemE04());
      form.getCondition().setSrhItemE18(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhItemE18()) ? null : form.getCondition().getSrhItemE18());
      form.getCondition().setSrhItemIdIn(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhItemIdIn()) ? null : form.getCondition().getSrhItemIdIn());
      form.getCondition().setSrhPartyAbbrCode(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPartyAbbrCode()) ? null : form.getCondition().getSrhPartyAbbrCode());
      form.getCondition().setSrhPlaceCode(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPlaceCode()) ? null : form.getCondition().getSrhPlaceCode());
      form.getCondition().setSrhPlaceOfDischargeId(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPlaceOfDischargeId()) ? null : form.getCondition().getSrhPlaceOfDischargeId());
      form.getCondition().setSrhPlaceOfLoadingId(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPlaceOfLoadingId()) ? null : form.getCondition().getSrhPlaceOfLoadingId());

      // 検索条件に一致するデータを取得
      Page<InboundOrderQuantityResetDto> pageList = orderQuantityResetService.getListByCondition(pageable, form.getCondition());

      //更新用にデータを移送
      List<InboundOrderQuantityResetSaveDto> saveList = new ArrayList<InboundOrderQuantityResetSaveDto>();
      for(InboundOrderQuantityResetDto dto : pageList) {
          InboundOrderQuantityResetSaveDto saveDto = new InboundOrderQuantityResetSaveDto();
          saveDto.setOrderQuantity(dto.getOrderQuantity());
          saveDto.setOroqmOid(dto.getOroqmOid());
          saveDto.setResetOrderQuantity(true);
          saveList.add(saveDto);
      }

      // RESPONSE時に必要なリストをセット
      form.setSaveList(saveList);

      //表示用にデータを編集
      for(InboundOrderQuantityResetDto dto : pageList) {
          // 出荷元工区から出荷元を呼び出す
          Place place = partyPlaceService.getPlace(dto.getPlaceSfOid());
          Party party = partyPlaceService.getParty(place.getPartyOid());

          // 出荷元
          dto.setPartySfCode(party.getTdbPartyCode());
          dto.setPartySfName(party.getName());

          // 出荷元工区
          dto.setPlaceSfCode(place.getTdbPlaceCode());
          dto.setPlaceSfName(place.getName());
      }

      // 属性名はpageList固定とする
      model.addAttribute("pageList", pageList);

      // ページサイズ変更用（Pagerを使用する画面は必須）
      model.addAttribute("pageSizeList", getPageSizeList());
      // ページ番号変更用（Pagerを使用する画面は必須）
      form.setPageNumber(pageable.getPageNumber());

      model.addAttribute("orderQuantityResetForm", form);

      return true;
  }

     /**
      * 発注枚数リセット 各メソッドでの共通処理
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
     private Pageable inboundOrderQuantityResetCommonLogic(InboundOrderQuantityResetForm form, UserSession userSession, Pageable pageable) {
         // 出荷場セキュリティの使用（自分の工区情報から取得）
         form.setUserDischargePlaceCode(false);

         // 実行権限取得（ユーザのロールタイプ）
         String roleType = userSession.getMyUsers().getRoleType();
         form.setAuthorized(isRoleType(roleType));

         InboundOrderQuantityResetSrhCond condition = null;
         Object obj = RequestContextHolder.getRequestAttributes().getAttribute("orderQuantityResetSrhCond", RequestAttributes.SCOPE_SESSION);
         if(obj != null && obj instanceof InboundOrderQuantityResetSrhCond) {
             // セッションに検索条件がある場合
             condition = (InboundOrderQuantityResetSrhCond)obj;
             if(form.getPageSize() == null) {
                 form.setPageSize(condition.getPageSize());
             } else {
                 condition.setPageSize(form.getPageSize());
             }
         } else {
             // セッションにない場合は検索条件を保存
             condition = new InboundOrderQuantityResetSrhCond();
             condition.setPageSize(form.getPageSize());
             // 背番号 デフォルト：部分
             condition.setSrhItemE04Type(CommonDataUtil.isNullOrEmpty(condition.getSrhItemE04Type()) ?  SqlStatement.PARTIAL_MATCH : condition.getSrhItemE04Type());
             // 品番 デフォルト：部分
             condition.setSrhItemIdInType(CommonDataUtil.isNullOrEmpty(condition.getSrhItemIdInType()) ? SqlStatement.PARTIAL_MATCH : condition.getSrhItemIdInType());
         }
         // 自事業所
         condition.setSrhPlaceByOid(userSession.getMyPlace().getOid());

         // セッションに検索条件を格納
         RequestContextHolder.getRequestAttributes().setAttribute("orderQuantityResetSrhCond", condition, RequestAttributes.SCOPE_SESSION);
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
    * 発注対象登録処理 初期画面表示(GET)
    *
    * @param pageable
    * @param model
    * @return
    */
   @RequestMapping(value="/inboundOrderTargetRegistration/list", params="refresh", method=RequestMethod.GET)
   public String inboundOrderTargetRegistrationInit(@PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
       OrderTargetRegForm form = new OrderTargetRegForm();
       return inboundOrderTargetRegistrationRefresh(form, pageable, model);
    }

   /**
    * 発注対象登録処理 キャンセル(POST)
    *
    * @param form
    * @param pageable
    * @param model
    * @return
    */
   @RequestMapping(value="/inboundOrderTargetRegistration/list", params="cancel", method=RequestMethod.POST)
   public String inboundOrderTargetRegistrationCancel(@Valid @ModelAttribute("orderTargetRegForm") OrderTargetRegForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
       // 初期検索に戻す
       form = new OrderTargetRegForm();
       // セッションの検索条件を削除
       RequestContextHolder.getRequestAttributes().removeAttribute("orderTargetRegSrhCond", RequestAttributes.SCOPE_SESSION);
       return inboundOrderTargetRegistrationRefresh(form, pageable, model);
    }

   /**
    * 発注対象登録処理 検索(POST)
    *
    * @param pageable
    * @param model
    * @return
    */
   @RequestMapping(value="/inboundOrderTargetRegistration/list", params="search", method=RequestMethod.POST)
   public String inboundOrderTargetRegistrationSearch(@Valid @ModelAttribute("orderTargetRegForm") OrderTargetRegForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
       // セッションに検索条件を格納
       RequestContextHolder.getRequestAttributes().setAttribute("orderTargetRegSrhCond", form.getCondition(), RequestAttributes.SCOPE_SESSION);
       return inboundOrderTargetRegistrationRefresh(form, pageable, model);
    }

    /**
     * 発注対象登録処理 再表示(POST)
     *
     * @param form
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/inboundOrderTargetRegistration/list", params="refresh", method=RequestMethod.POST)
    public String inboundOrderTargetRegistrationRefresh(@Valid @ModelAttribute("orderTargetRegForm") OrderTargetRegForm form, Pageable pageable, Model model) {

        UserSession userSession = getUserSession();
        if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
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

        // 各メソッド共通処理
        pageable = inboundOrderTargetRegistrationCommonLogic(form, userSession, pageable);


        // POST以外の検索はページングなどであるためセッションから検索条件を取得する
        if(form.getCondition() == null) {
            Object obj = RequestContextHolder.getRequestAttributes().getAttribute("orderTargetRegSrhCond", RequestAttributes.SCOPE_SESSION);
            if(obj != null && obj instanceof OrderTargetRegSrhCond) {
                // セッションに検索条件がある場合
                form.setCondition((OrderTargetRegSrhCond)obj);
            } else {
                // セッションにない場合はありえないのでエラー
            }
        }

        // 再表示
        Boolean boo = inboundOrderTargetRegistrationRefreshDataSet(pageable, form, model);
        if(boo == false) {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        // Controllerが持っているメッセージをクリア（次以降の動作でメッセージがクリアされている）
        clearErrors();
        clearMessages();
        clearWarnings();

        return "kanbanslim/inboundOrderTargetRegistration";
    }

   /**
     * 発注対象登録・更新
     *
     * @param pageable
     * @param form
     * @param model
     * @return
     */
    @RequestMapping(value = "/inboundOrderTargetRegistration/list",  params = "add", method = RequestMethod.POST)
    public String inboundOrderTargetRegPost(@Valid Pageable pageable, @ModelAttribute("orderTargetRegForm") OrderTargetRegForm form, Model model) {

        UserSession userSession = getUserSession();
        if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "発注対象登録処理");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
        } else {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        // 各メソッド共通処理
        pageable = inboundOrderTargetRegistrationCommonLogic(form, userSession, pageable);

        // 保存処理
        orderTargetRegService.save(form, userSession);

        // セッションから検索条件を取得する
        Object obj = RequestContextHolder.getRequestAttributes().getAttribute("orderTargetRegSrhCond", RequestAttributes.SCOPE_SESSION);
        form.setCondition((OrderTargetRegSrhCond)obj);

        // 保存後に同一ページを表示するためformのpageNumberからPageableを生成しなおす。
        pageable = PageRequest.of(form.getPageNumber(), pageable.getPageSize(), pageable.getSort());

        // 再表示
        Boolean boo = inboundOrderTargetRegistrationRefreshDataSet(pageable, form, model);
        if(boo == false) {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        getMessages().add("", new Message("twg_edi.info.finish", "一覧表示中の", "状況更新"));

        clearErrors();
        clearMessages();
        clearWarnings();

        return "kanbanslim/inboundOrderTargetRegistration";
   }

  /**
  * 発注対象処理 再表示
  *
  * @param form
  * @param modelt
  */
 public boolean inboundOrderTargetRegistrationRefreshDataSet(Pageable pageable, OrderTargetRegForm form, Model model) {

     // ""はnullに置換する
     form.getCondition().setSrhItemE04(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhItemE04()) ? null : form.getCondition().getSrhItemE04());
     form.getCondition().setSrhItemE18(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhItemE18()) ? null : form.getCondition().getSrhItemE18());
     form.getCondition().setSrhItemIdIn(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhItemIdIn()) ? null : form.getCondition().getSrhItemIdIn());
     form.getCondition().setSrhPartyAbbrCode(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPartyAbbrCode()) ? null : form.getCondition().getSrhPartyAbbrCode());
     form.getCondition().setSrhPlaceCode(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPlaceCode()) ? null : form.getCondition().getSrhPlaceCode());
     form.getCondition().setSrhPlaceOfDischargeId(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPlaceOfDischargeId()) ? null : form.getCondition().getSrhPlaceOfDischargeId());
     form.getCondition().setSrhPlaceOfLoadingId(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhPlaceOfLoadingId()) ? null : form.getCondition().getSrhPlaceOfLoadingId());

     // 検索条件に一致するデータを取得
     Page<OrderTargetRegDto> pageList = orderTargetRegService.getListByCondition(pageable, form.getCondition());

     // 登録対象選択プルダウンの作成
     Map<String, String> targetTypeList = orderTargetRegService.getTargetTypeHTMLList();
     model.addAttribute("targetTypeList", targetTypeList);

     //更新用にデータを移送
     List<OrderTargetRegSaveDto> saveList = new ArrayList<OrderTargetRegSaveDto>();
     for(OrderTargetRegDto dto : pageList) {
         OrderTargetRegSaveDto saveDto = new OrderTargetRegSaveDto();
         saveDto.setItemPartOid(dto.getOid());
         saveDto.setPlaceStOid(dto.getOid());
         saveDto.setOotmOid(dto.getOotmOid());
         saveDto.setOrderTargetType(dto.getOrderTargetType() == null ? 0 : dto.getOrderTargetType());
         saveDto.setIptOrderTargetType(dto.getOrderTargetType() == null ? 0 : dto.getOrderTargetType());
         saveList.add(saveDto);
     }

     // RESPONSE時に必要なリストをセット
     form.setSaveList(saveList);

     //表示用にデータを編集
     for(OrderTargetRegDto dto : pageList) {
         // 出荷元工区から出荷元を呼び出す
         Place place = partyPlaceService.getPlace(dto.getPlaceSfOid());
         Party party = partyPlaceService.getParty(place.getPartyOid());

         // 出荷元
         dto.setPartySfCode(party.getTdbPartyCode());
         dto.setPartySfName(party.getName());

         // 出荷元工区
         dto.setPlaceSfCode(place.getTdbPlaceCode());
         dto.setPlaceSfName(place.getName());

         // 最終処理日
         dto.setLastProcessingDate(StringUtility.formatDateYYYYMMDD(dto.getLastProcessingDate()));
         // 納入指示日
         dto.setLastDeliveryDate(StringUtility.formatDateYYYYMMDD(dto.getLastDeliveryDate()));
     }

     // 属性名はpageList固定とする
     model.addAttribute("pageList", pageList);

     // ページサイズ変更用（Pagerを使用する画面は必須）
     model.addAttribute("pageSizeList", getPageSizeList());
     // ページ番号変更用（Pagerを使用する画面は必須）
     form.setPageNumber(pageable.getPageNumber());

     model.addAttribute("orderTargetRegForm", form);

     return true;
 }

    /**
     * 発注対象処理 各メソッドでの共通処理
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
    private Pageable inboundOrderTargetRegistrationCommonLogic(OrderTargetRegForm form, UserSession userSession, Pageable pageable) {
        // 出荷場セキュリティの使用（自分の工区情報から取得）
        form.setUserDischargePlaceCode(false);

        // 実行権限取得（ユーザのロールタイプ）
        String roleType = userSession.getMyUsers().getRoleType();
        form.setAuthorized(isRoleType(roleType));

        OrderTargetRegSrhCond condition = null;
        Object obj = RequestContextHolder.getRequestAttributes().getAttribute("orderTargetRegSrhCond", RequestAttributes.SCOPE_SESSION);
        if(obj != null && obj instanceof OrderTargetRegSrhCond) {
            // セッションに検索条件がある場合
            condition = (OrderTargetRegSrhCond)obj;
            if(form.getPageSize() == null) {
                form.setPageSize(condition.getPageSize());
            } else {
                condition.setPageSize(form.getPageSize());
            }
        } else {
            // セッションにない場合は検索条件を保存
            condition = new OrderTargetRegSrhCond();
            condition.setPageSize(form.getPageSize());
            // 背番号 デフォルト：部分
            condition.setSrhItemE04Type(CommonDataUtil.isNullOrEmpty(condition.getSrhItemE04Type()) ?  SqlStatement.PARTIAL_MATCH : condition.getSrhItemE04Type());
            // 品番 デフォルト：部分
            condition.setSrhItemIdInType(CommonDataUtil.isNullOrEmpty(condition.getSrhItemIdInType()) ? SqlStatement.PARTIAL_MATCH : condition.getSrhItemIdInType());
        }
        // 自事業所
        condition.setSrhPlaceStOid(userSession.getMyPlace().getOid());

        // セッションに検索条件を格納
        RequestContextHolder.getRequestAttributes().setAttribute("orderTargetRegSrhCond", condition, RequestAttributes.SCOPE_SESSION);
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
