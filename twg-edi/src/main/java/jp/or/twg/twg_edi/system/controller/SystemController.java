package jp.or.twg.twg_edi.system.controller;

import java.util.Date;
import java.util.Map;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import jp.or.twg.twg_edi.common.controller.BaseController;
import jp.or.twg.twg_edi.common.difinition.RoleType;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.service.SystemConfigService;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.system.model.OptionThreadManagerDetailDto;
import jp.or.twg.twg_edi.system.model.OptionThreadManagerDto;
import jp.or.twg.twg_edi.system.model.OptionThreadManagerForm;
import jp.or.twg.twg_edi.system.model.OptionThreadManagerSrhCond;
import jp.or.twg.twg_edi.system.service.OptionThreadManagerService;

/**
 * 処理一覧（オプション）　コントロールクラス
 *
 *   処理一覧（オプション）メニュー内にある各画面のコントロールはすべてここに記述する
 *
 * @author yamaguchiha
 */
@Controller
public class SystemController extends BaseController {


    @Autowired
    OptionThreadManagerService optionThreadManagerService;

    @Autowired
    SystemConfigService systemConfigService;

    /**
     * 処理一覧（オプション） 初期画面表示(GET)
     *
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/optionThreadManager/list", params="refresh", method=RequestMethod.GET)
    public String optionThreadManagerInit(@PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
        OptionThreadManagerForm form = new OptionThreadManagerForm();
        return optionThreadManagerRefresh(form, pageable, model);
     }

    /**
     * 処理一覧（オプション） キャンセル(POST)
     *
     * @param form
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/optionThreadManager/list", params="cancel", method=RequestMethod.POST)
    public String optionThreadManagerCancel(@Valid @ModelAttribute("optionThreadManagerForm") OptionThreadManagerForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
        // 初期検索に戻す
        form = new OptionThreadManagerForm();
        // セッションの検索条件を削除
        RequestContextHolder.getRequestAttributes().removeAttribute("optionThreadManagerSrhCond", RequestAttributes.SCOPE_SESSION);
        return optionThreadManagerRefresh(form, pageable, model);
     }

    /**
     * 処理一覧（オプション） 検索(POST)
     *
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/optionThreadManager/list", params="search", method=RequestMethod.POST)
    public String optionThreadManagerSearch(@Valid @ModelAttribute("optionThreadManagerForm") OptionThreadManagerForm form, @PageableDefault(page = 0, size = 20) Pageable pageable, Model model) {
        // セッションに検索条件を格納
        RequestContextHolder.getRequestAttributes().setAttribute("optionThreadManagerSrhCond", form.getCondition(), RequestAttributes.SCOPE_SESSION);
        return optionThreadManagerRefresh(form, pageable, model);
     }

    /**
     * 処理一覧（オプション） 再表示(POST)
     *
     * @param form
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value="/optionThreadManager/list", params="refresh", method=RequestMethod.POST)
    public String optionThreadManagerRefresh(@Valid @ModelAttribute("optionThreadManagerForm") OptionThreadManagerForm form, Pageable pageable, Model model) {

        UserSession userSession = getUserSession();
        if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "処理一覧（オプション）");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
        } else {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        // 必要な初期処理を記述

        // 各メソッド共通処理
        pageable = optionThreadManagerCommonLogic(form, userSession, pageable);


        // POST以外の検索はページングなどであるためセッションから検索条件を取得する
        if(form.getCondition() == null) {
            Object obj = RequestContextHolder.getRequestAttributes().getAttribute("optionThreadManagerSrhCond", RequestAttributes.SCOPE_SESSION);
            if(obj != null && obj instanceof OptionThreadManagerSrhCond) {
                // セッションに検索条件がある場合
                form.setCondition((OptionThreadManagerSrhCond)obj);
            } else {
                // セッションにない場合はありえないのでエラー
            }
        }

        // 再表示
        Boolean boo = optionThreadManagerRefreshDataSet(pageable, form, model);
        if(boo == false) {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        // Controllerが持っているメッセージをクリア（次以降の動作でメッセージがクリアされている）
        clearErrors();
        clearMessages();
        clearWarnings();

        return "system/optionThreadManager";
    }

    /**
     *  処理一覧（オプション） 詳細画面
     * @param model
     * @return
     */
    @GetMapping({"/optionThreadManager/detail/{id}"})
    public String optionThreadManagerDetail(@PathVariable("id") String id, Model model) {
        UserSession userSession = getUserSession();
        if(userSession != null) {
            model.addAttribute("loginInfo", userSession);
            model.addAttribute("currentTimeStamp", DateUtility.getStringFromDate(new Date(), "yyyy/MM/dd HH:mm:ss"));
            model.addAttribute("pageTitle", "処理詳細（オプション）");
            model.addAttribute("messages", getMessages());
            model.addAttribute("errors", getErrors());
            model.addAttribute("warnings", getWarnings());
            model.addAttribute("optionflg", systemConfigService.isPlaceSecurityOption(userSession.getMyPlace()));
        } else {
            // SCMのログイン画面に戻す。
            return "redirect:/timeout";
        }

        // 必要な初期処理を記述


        // 対象データを取得
        OptionThreadManagerDetailDto dto = optionThreadManagerService.getDetailData(id);

        // 処理種別・ステータス・エラーメッセージはそのまま表示
        // 開始日時・終了日時・所要時間（秒）はSQLで取得時に変換

        // 処理番号
        dto.setId(dto.getId());

        Place place = partyPlaceService.getPlace(dto.getUserPlaceOid());
        // 事業所工区
        dto.setUserPlaceCode(place.getTdbPlaceCode());
        dto.setUserPlaceName(place.getName());

        // 処理担当者
        Optional<Users> users = optionThreadManagerService.getUserInfo(dto.getUsersOid());
        if(!users.isEmpty()) {
            Users myUsers = users.get();
            dto.setUsersOidName(myUsers.getName());
        }

        // 処理種別
        dto.setThreadCategory(dto.getThreadCategory());

        model.addAttribute("optionThreadManagerDetailDto", dto);

        clearErrors();
        clearMessages();
        clearWarnings();
        return "system/optionThreadManagerDetail";
    }
      /**
      * 処理一覧（オプション）処理 再表示
      *
      * @param form
      * @param modelt
      */
     public boolean optionThreadManagerRefreshDataSet(Pageable pageable, OptionThreadManagerForm form, Model model) {

         // ""はnullに置換する
         form.getCondition().setSrhId(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhId()) ? null : form.getCondition().getSrhId());
         form.getCondition().setSrhThreadCategory(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhThreadCategory()) ? null : form.getCondition().getSrhThreadCategory());
         form.getCondition().setSrhStartUpTime(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhStartUpTime()) ? null : form.getCondition().getSrhStartUpTime());
         form.getCondition().setSrhCloseOutTime(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhCloseOutTime()) ? null : form.getCondition().getSrhCloseOutTime());

         // 検索条件に一致するデータを取得
         Page<OptionThreadManagerDto> pageList = optionThreadManagerService.getListByCondition(pageable, form.getCondition());

         // 処理種別選択プルダウンの作成
         Map<String, String> threadCategoryList = optionThreadManagerService.getThreadCategoryHTMLList();
         model.addAttribute("threadCategoryList", threadCategoryList);

         // srhThreadStatus:状態チェックボックス
         Map<String, String> threadStatusMap = optionThreadManagerService.getThreadStatusHTMLCheckBox();
         model.addAttribute("threadStatusCheckBox", threadStatusMap);
//         if(CommonDataUtil.isNullOrEmpty(form.getCondition().getSrhThreadStatus())){
//             // 初期値をセット
//             form.getCondition().setSrhThreadStatus(new String[] {});
//         }

         //表示用にデータを編集
         for(OptionThreadManagerDto dto : pageList) {
             // 処理種別・ステータスはそのまま表示
             // 開始日時・終了日時・所要時間（秒）はSQLで取得時に変換

             // 処理番号
             dto.setId(dto.getId());

             Place place = partyPlaceService.getPlace(dto.getUserPlaceOid());
             // 事業所工区
             dto.setUserPlaceCode(place.getTdbPlaceCode());
             dto.setUserPlaceName(place.getName());

             // 処理担当者
             Optional<Users> users = optionThreadManagerService.getUserInfo(dto.getUsersOid());
             if(!users.isEmpty()) {
                 Users myUsers = users.get();
                 dto.setUsersOidName(myUsers.getName());
             }

             // 処理種別
             dto.setThreadCategory(dto.getThreadCategory());
         }

         // 属性名はpageList固定とする
         model.addAttribute("pageList", pageList);

         // ページサイズ変更用（Pagerを使用する画面は必須）
         model.addAttribute("pageSizeList", getPageSizeList());
         // ページ番号変更用（Pagerを使用する画面は必須）
         form.setPageNumber(pageable.getPageNumber());

         model.addAttribute("optionThreadManagerForm", form);

         return true;
     }

        /**
         * 処理一覧（オプション）処理 各メソッドでの共通処理
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
        private Pageable optionThreadManagerCommonLogic(OptionThreadManagerForm form, UserSession userSession, Pageable pageable) {
            // 出荷場セキュリティの使用（自分の工区情報から取得）
            form.setUserDischargePlaceCode(false);

            // 実行権限取得（ユーザのロールタイプ）
            String roleType = userSession.getMyUsers().getRoleType();
            form.setAuthorized(isRoleType(roleType));

            OptionThreadManagerSrhCond condition = null;
            Object obj = RequestContextHolder.getRequestAttributes().getAttribute("optionThreadManagerSrhCond", RequestAttributes.SCOPE_SESSION);
            if(obj != null && obj instanceof OptionThreadManagerSrhCond) {
                // セッションに検索条件がある場合
                condition = (OptionThreadManagerSrhCond)obj;
                if(form.getPageSize() == null) {
                    form.setPageSize(condition.getPageSize());
                } else {
                    condition.setPageSize(form.getPageSize());
                }
            } else {
                // セッションにない場合は検索条件を保存
                condition = new OptionThreadManagerSrhCond();
                condition.setPageSize(form.getPageSize());
            }
            // 自事業所
//            condition.setSrhPlaceStOid(userSession.getMyPlace().getOid());

            // セッションに検索条件を格納
            RequestContextHolder.getRequestAttributes().setAttribute("optionThreadManagerSrhCond", condition, RequestAttributes.SCOPE_SESSION);
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
