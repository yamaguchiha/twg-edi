package jp.or.twg.twg_edi.master.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.difinition.SqlStatement;
import jp.or.twg.twg_edi.common.entity.OptPlace;
import jp.or.twg.twg_edi.common.entity.OptionKanbanAdjust;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.mapper.OptPlaceMapper;
import jp.or.twg.twg_edi.common.mapper.UsersMapper;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.service.NumberingService;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import jp.or.twg.twg_edi.common.utility.CipherUtil;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.master.mapper.KanbanAdjustMapper;
import jp.or.twg.twg_edi.master.model.KanbanAdjustCsvDto;
import jp.or.twg.twg_edi.master.model.KanbanAdjustDetailDto;
import jp.or.twg.twg_edi.master.model.KanbanAdjustDetailForm;
import jp.or.twg.twg_edi.master.model.KanbanAdjustDto;
import jp.or.twg.twg_edi.master.model.KanbanAdjustForm;
import jp.or.twg.twg_edi.master.model.KanbanAdjustSearchCondition;
import jp.or.twg.twg_edi.master.model.KanbanAdjustUploadForm;
import lombok.RequiredArgsConstructor;

/**
 * かんばん増減情報　サービスクラス
 *
 * @author koukit
 *
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class KanbanAdjustService {

    @Autowired
    protected PartyPlaceService partyPlaceService;

    private final UsersMapper usersMapper;
    private final OptPlaceMapper optPlaceMapper;
    private final NumberingService numberingService;
    private final KanbanAdjustMapper kanbanAdjustMapper;

    /** 暗号化パラメータ */
    public static interface CIPHER_PARAM {
        /** アルゴリズム */
        public static final String ALGORITHM = "AES";

        /** キー 16文字 */
        public static final String KEY = "Kazura Jama User";
    }

    /**
     * 暗号化
     *
     * @param clearText 平文
     * @return 暗号文
     */
    public static String encrypt(String clearText) {
        return new CipherUtil(CIPHER_PARAM.ALGORITHM, CIPHER_PARAM.KEY).encrypt(clearText);
    }

    /**
     * 復号化
     *
     * @param cipherText 暗号文
     * @return 平文
     */
    public static String decrypt(String cipherText) {
        return new CipherUtil(CIPHER_PARAM.ALGORITHM, CIPHER_PARAM.KEY).decrypt(cipherText);
    }

    /**
     * 条件に一致するかんばん増減情報一覧を取得する(Pageer版)
     *   セッションからログイン情報を取得して企業を特定し、その企業の事業所一覧を取得
     *   その事業所に所属するかんばん増減情報を取得する
     *
     * @return
     */
    public Page<KanbanAdjustDto> getListByCondition(Pageable pageable, KanbanAdjustSearchCondition condition) {

        // 検索用conditionを作成
        KanbanAdjustSearchCondition sqlCond = new KanbanAdjustSearchCondition();

       // 納入先事業所情報OID
        sqlCond.setSrhPlaceByOid(condition.getSrhPlaceByOid());

       // 前方一致・部分一致の処理Typeを見て判別
       if(!CommonDataUtil.isNullOrEmpty(condition.getSrhItemE04())) {
           sqlCond.setSrhItemE04(condition.getSrhItemE04Type().equals(SqlStatement.PREFIX_MATCH) ? condition.getSrhItemE04().concat(SqlStatement.WILDCARD) : SqlStatement.WILDCARD.concat(condition.getSrhItemE04()).concat(SqlStatement.WILDCARD));
       }

       if(!CommonDataUtil.isNullOrEmpty(condition.getSrhItemIdIn())) {
           sqlCond.setSrhItemIdIn(condition.getSrhItemIdInType().equals(SqlStatement.PREFIX_MATCH) ? condition.getSrhItemIdIn().concat(SqlStatement.WILDCARD) : SqlStatement.WILDCARD.concat(condition.getSrhItemIdIn()).concat(SqlStatement.WILDCARD));
       }
       sqlCond.setSrhItemE18(CommonDataUtil.isNullOrEmpty(condition.getSrhItemE18()) ? null : condition.getSrhItemE18());
       sqlCond.setSrhPlaceOfDischargeId(CommonDataUtil.isNullOrEmpty(condition.getSrhPlaceOfDischargeId()) ? null : condition.getSrhPlaceOfDischargeId());

       // 出荷元事業所工区OID
       if(!CommonDataUtil.isNullOrEmpty(condition.getSrhPartyAbbrCode()) && !CommonDataUtil.isNullOrEmpty(condition.getSrhPlaceCode())) {
           sqlCond.setSrhPlaceSfOid(getPlaceCode(condition.getSrhPartyAbbrCode(), condition.getSrhPlaceCode()));
       }
       sqlCond.setSrhPartyAbbrCode(CommonDataUtil.isNullOrEmpty(condition.getSrhPartyAbbrCode()) ? null : condition.getSrhPartyAbbrCode());
       sqlCond.setSrhPlaceCode(CommonDataUtil.isNullOrEmpty(condition.getSrhPlaceCode()) ? null : condition.getSrhPlaceCode());

       sqlCond.setSrhPlaceOfLoadingId(CommonDataUtil.isNullOrEmpty(condition.getSrhPlaceOfLoadingId()) ? null : condition.getSrhPlaceOfLoadingId());

       // 日付条件の編集
       sqlCond.setSrhStartDate(CommonDataUtil.isNullOrEmpty(condition.getSrhStartDate()) ? null : condition.getSrhStartDate().replaceAll("/", ""));
       sqlCond.setSrhEndDate(CommonDataUtil.isNullOrEmpty(condition.getSrhEndDate()) ? null : condition.getSrhEndDate().replaceAll("/", ""));

       // 状態（選択したチェックボックスリスト）
       sqlCond.setSrhAdjustTypes(CommonDataUtil.isNullOrEmpty(condition.getSrhAdjustTypes()) ? null : condition.getSrhAdjustTypes().clone());
       sqlCond.setSrhAdjustStatus(CommonDataUtil.isNullOrEmpty(condition.getSrhAdjustStatus()) ? null : condition.getSrhAdjustStatus().clone());


       // pager用
       sqlCond.setSrhLimit(pageable.getPageSize());
       sqlCond.setSrhOffset(pageable.getOffset());


       // 検索条件を元にcount結果を格納
       long count = kanbanAdjustMapper.selectKanbanAdjustListCount(sqlCond);

       // 検索条件を元に検索結果をDtoに格納
       List<KanbanAdjustDto> kanbanAdjustDto = kanbanAdjustMapper.selectKanbanAdjustList(sqlCond);

       return new PageImpl<>(kanbanAdjustDto, pageable, count);
   }

    /**
     * 選択されたかんばん増減情報詳細を取得する
     *
     * @return
     */
    public KanbanAdjustDetailDto getDetailData(long oid) {

        // 検索条件を元に検索結果をDtoに格納
        KanbanAdjustDetailDto dto = new KanbanAdjustDetailDto();
        dto = kanbanAdjustMapper.selectKanbanAdjustDetail(oid);

        return dto;
    }

    /**
     * 品番検索を取得する
     *
     * @return
     */
    public KanbanAdjustDetailDto getItemData(String itemIdIn, String itemE18) {

        // 検索条件を元に検索結果をDtoに格納
        Map<String, Object> param = new HashMap<>();
        param.put("itemIdIn", itemIdIn);
        param.put("itemE18", itemE18);
        KanbanAdjustDetailDto dto = new KanbanAdjustDetailDto();
        dto = kanbanAdjustMapper.selectItemDetail(param);

        return dto;
    }

    /**
     * 増減区分プルダウンリスト取得
     * @return
     */
    public Map<String, String> getAdjustTypeHTMLList() {

        // TODO srhAdjustType:増減区分
        Map<String, String> adjustTypeList = new LinkedHashMap<String , String>();
        adjustTypeList.put("0", "増");
        adjustTypeList.put("1", "減");

        return adjustTypeList;
    }

    /**
     * 増減状況プルダウンリスト取得
     * @return
     */
    public Map<String, String> getAdjustStatusHTMLList() {

        // TODO srhAdjustStatus:増減状況
        Map<String, String> adjustStatusList = new LinkedHashMap<String , String>();
        adjustStatusList.put("0", "無効");
        adjustStatusList.put("1", "予約");
        adjustStatusList.put("2", "増減中");
        adjustStatusList.put("3", "増減済");

        return adjustStatusList;
    }

    /**
     * 増減区分チェックボックスリスト取得
     * @return
     */
    public Map<String, Integer> getAdjustTypeHTMLCheckBox() {

        // TODO srhAdjustType:増減区分
        Map<String, Integer> adjustTypeCheckBox = new LinkedHashMap<String , Integer>();
        adjustTypeCheckBox.put("増", 0);
        adjustTypeCheckBox.put("減", 1 );

        return adjustTypeCheckBox;
    }

    /**
     * 増減状況チェックボックスリスト取得
     * @return
     */
    public Map<String, Integer> getAdjustStatusHTMLCheckBox() {

        // TODO srhAdjustStatus:増減状況
        Map<String, Integer> adjustStatusCheckBox = new LinkedHashMap<String , Integer>();
        adjustStatusCheckBox.put("無効", 0);
        adjustStatusCheckBox.put("予約", 1);
        adjustStatusCheckBox.put("増減中", 2);
        adjustStatusCheckBox.put("増減済", 3);

        return adjustStatusCheckBox;
    }
    /**
     * 指定したOIDでOPT_PLACEのCODEを返す
     * @param deliveryOid
     * @return
     */
    public String getOptPlaceCode(Long oid) {
        Optional<OptPlace> obj = optPlaceMapper.selectByPrimaryKey(oid);
        if(obj.isEmpty()) {
            return null;
        } else {
            return obj.get().getCode();
        }
    }

    /**
     * かんばん増減情報のDB保存（新規）
     *
     * @param kanbanAdjustForm
     */
    public void insert(KanbanAdjustDetailForm form, UserSession userSession) {
        // 新規にOIDを取得する
        form.setOkaOid(numberingService.getOid(KanbanAdjustForm.class.getName()));

        // 品番情報とかんばん増減情報を結合する
        form.setItemPartOid(form.getOid());

        // 更新情報の設定
        Users users = userSession.getMyUsers();
        long userOid = users.getOid();
        Place place = userSession.getMyPlace();
        long userPlaceOid = place.getOid();

        form.setUserOid(userOid);
        form.setUserPlaceOid(userPlaceOid);

        // 日付条件の編集
        form.setPlanDateStringDate(CommonDataUtil.isNullOrEmpty(form.getPlanDateStringDate()) ? null : form.getPlanDateStringDate().replaceAll("/", ""));
        form.setStartDeliveryDateStringDate(CommonDataUtil.isNullOrEmpty(form.getStartDeliveryDateStringDate()) ? null : form.getStartDeliveryDateStringDate().replaceAll("/", ""));

        // INSERT
        kanbanAdjustMapper.insert(form);
    }

    /**
     * かんばん増減情報のDB保存（CSVからの新規）
     *
     * @param kanbanAdjustForm
     */
    public void csvInsert(KanbanAdjustUploadForm form, UserSession userSession) {

        for(KanbanAdjustCsvDto csvDto : form.getCsvList()){
            KanbanAdjustDetailForm csvForm = new KanbanAdjustDetailForm();

//            if (isCsvIoPartyAbbrCode) {
//                // 社内企業コード⇒TDBコード変換
//                bean.partyAbbrCodeToTdbCode();
//            }

            // INSERT用formにcsvデータをコピー＆初期化
            csvForm.setOkaOid(null);
            csvForm.setItemPartOid(null);

            csvForm.setPlanDateStringDate(csvDto.getPlanDate());
            csvForm.setStartDeliveryDateStringDate(csvDto.getStartDeliveryDate());
            csvForm.setStartShipmentNo(Integer.valueOf(csvDto.getStartShipmentNo()));
            csvForm.setAdjustStatus(null);
            csvForm.setAdjustType(Integer.valueOf(csvDto.getAdjustType()));
            csvForm.setQuantity(Long.valueOf(csvDto.getQuantity()));
            csvForm.setParQuantity(CommonDataUtil.isNullOrEmpty(csvDto.getParQuantity()) ? BigDecimal.ZERO : new BigDecimal(csvDto.getParQuantity()));
            csvForm.setTotalQuantity(0L);
            csvForm.setCarryForwardFractionQuantity(BigDecimal.ZERO);
            csvForm.setUserOid(0);
            csvForm.setUserPlaceOid(0);


            // 新規にOIDを取得する
            csvForm.setOkaOid(numberingService.getOid(KanbanAdjustForm.class.getName()));

            // 品番情報とかんばん増減情報を結合する
            csvForm.setItemPartOid(csvForm.getOid());

            // 更新情報の設定
            Users users = userSession.getMyUsers();
            long userOid = users.getOid();
            Place place = userSession.getMyPlace();
            long userPlaceOid = place.getOid();

            csvForm.setUserOid(userOid);
            csvForm.setUserPlaceOid(userPlaceOid);

            // 日付条件の編集
            csvForm.setPlanDateStringDate(CommonDataUtil.isNullOrEmpty(csvForm.getPlanDateStringDate()) ? null : csvForm.getPlanDateStringDate().replaceAll("/", ""));
            csvForm.setStartDeliveryDateStringDate(CommonDataUtil.isNullOrEmpty(csvForm.getStartDeliveryDateStringDate()) ? null : csvForm.getStartDeliveryDateStringDate().replaceAll("/", ""));

            // INSERT
            kanbanAdjustMapper.insert(csvForm);
        }

    }

    /**
     * かんばん増減情報のDB保存（更新）
     *
     * @param kanbanAdjustForm
     */
    public void update(KanbanAdjustDetailForm form, UserSession userSession) {

        Users users = userSession.getMyUsers();
        long userOid = users.getOid();
        Place place = userSession.getMyPlace();
        long userPlaceOid = place.getOid();

        form.setUserOid(userOid);
        form.setUserPlaceOid(userPlaceOid);

        // 日付条件の編集
        form.setPlanDateStringDate(CommonDataUtil.isNullOrEmpty(form.getPlanDateStringDate()) ? null : form.getPlanDateStringDate().replaceAll("/", ""));
        form.setStartDeliveryDateStringDate(CommonDataUtil.isNullOrEmpty(form.getStartDeliveryDateStringDate()) ? null : form.getStartDeliveryDateStringDate().replaceAll("/", ""));

        // UPDATE
        kanbanAdjustMapper.update(form);
    }

    /**
     * かんばん増減情報のDB削除
     *
     * @param userForm
     */
    public void delete(KanbanAdjustDetailForm form) {

        // DELETE
        kanbanAdjustMapper.delete(Long.valueOf(form.getOid()));
    }

    /**
     * 品番ID重複確認(存在しないならtrue、存在するならfalse）
     *
     * @param userForm
     */
    public boolean checkItemPartOid(long itemPartOid) {
        OptionKanbanAdjust obj = kanbanAdjustMapper.selectKanbanAdjustOne(itemPartOid);
        return Objects.isNull(obj);
    }

    /**
     * 検索条件の事業所コード、工区コードから事業所工区OIDを返す
     *
     * @param String
     * @param String
     */
    private long getPlaceCode(String srhPartyAbbrCode, String srhPlaceCode) {

        long ret;

        Place placeSf = partyPlaceService.getPlaceByTdbCodeAndPlaceCode(srhPartyAbbrCode, srhPlaceCode);
        if(placeSf != null) {
            ret = placeSf.getOid();
        }
        else {
            // 存在しない場合、0を入れて検索できないようにする
            ret = 0L;
        }
        return ret;
    }
}
