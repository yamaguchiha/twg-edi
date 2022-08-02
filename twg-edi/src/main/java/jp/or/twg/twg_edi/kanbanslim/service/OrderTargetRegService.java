package jp.or.twg.twg_edi.kanbanslim.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import jp.or.twg.twg_edi.common.entity.OptionOrderTargetManager;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.mapper.OptPlaceMapper;
import jp.or.twg.twg_edi.common.mapper.PlaceMapper;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.service.NumberingService;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import jp.or.twg.twg_edi.common.utility.CipherUtil;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.kanbanslim.mapper.OrderTargetRegMapper;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegDto;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegForm;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegSaveDto;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegSrhCond;
import lombok.RequiredArgsConstructor;

/**
 * 発注対象登録処理　サービスクラス
 *
 * @author kawadet
 *
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class OrderTargetRegService {

    @Autowired
    protected PartyPlaceService partyPlaceService;

    private final PlaceMapper placeMapper;
    private final OptPlaceMapper optPlaceMapper;
    private final NumberingService numberingService;
    private final OrderTargetRegMapper orderTargetRegMapper;


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
     * 条件に一致する発注対象登録処理一覧を取得する(Pageer版)
     *   セッションからログイン情報を取得して企業を特定し、その企業の事業所一覧を取得
     *   その事業所に所属する発注対象登録処理を取得する
     *     発注対象登録処理条件設定して検索結果を返す
     *
     * @param pageable ページクラス
     * @param condition 検索条件
     *
     * @return Page<OrderTargetRegDto>
     */
    public Page<OrderTargetRegDto> getListByCondition(Pageable pageable, OrderTargetRegSrhCond condition) {

        // 検索用conditionを作成
        OrderTargetRegSrhCond sqlCond = new OrderTargetRegSrhCond();

        // 納入先事業所情報OID
        sqlCond.setSrhPlaceStOid(condition.getSrhPlaceStOid());

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

        // pager用
        sqlCond.setSrhLimit(pageable.getPageSize());
        sqlCond.setSrhOffset(pageable.getOffset());

        // 検索条件を元にcount結果を格納
        long count = orderTargetRegMapper.selectOrderTargetRegListCount(sqlCond);

        // 検索条件を元に検索結果をDtoに格納
        List<OrderTargetRegDto> orderTargetRegDto = new ArrayList<>();
        orderTargetRegDto = orderTargetRegMapper.selectOrderTargetRegList(sqlCond);

        return new PageImpl<>(orderTargetRegDto, pageable, count);
    }

    /**
     * 対象選択リスト取得
     * @return
     */
    public Map<String, String> getTargetTypeHTMLList() {

        // TODO orderTargetType:発注対象区分
        Map<String, String> targetTypeList = new LinkedHashMap<String, String>();
        targetTypeList.put("0", "");
        targetTypeList.put("1", "発注対象");

        return targetTypeList;
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
     * 発注対象管理情報のDB保存
     *
     * @param OrderTargetRegForm
     */
    public void save(OrderTargetRegForm orderTargetRegForm, UserSession userSession) {

        Users users = userSession.getMyUsers();
        long userOid = users.getOid();
        Place place = userSession.getMyPlace();
        long userPlaceOid = place.getOid();

        List<OrderTargetRegSaveDto> saveList = orderTargetRegForm.getSaveList();
        for(OrderTargetRegSaveDto data : saveList) {
            // 更新前後を比較して不一致の場合は更新する
            if(data.getOrderTargetType().equals(data.getIptOrderTargetType()) == false) {
                // DB保存用にdtoを作成
                OrderTargetRegSaveDto saveData = new OrderTargetRegSaveDto();
                // 登録か更新か判別してデータを詰める
                OptionOrderTargetManager dto = orderTargetRegMapper.selectOrderTargetRegOne(data.getItemPartOid());
                   if(dto == null) {
                        // 新規にOIDを取得する
                       saveData.setOotmOid(numberingService.getOid(OrderTargetRegForm.class.getName()));
                       saveData.setPlaceStOid(data.getPlaceStOid());
                       saveData.setItemPartOid(data.getItemPartOid());
                       saveData.setIptOrderTargetType(data.getIptOrderTargetType());
                       saveData.setUserOid(userOid);
                       saveData.setUserPlaceOid(userPlaceOid);
                        // INSERT
                       orderTargetRegMapper.insert(saveData);
                   }
                   else {
                       // 更新情報を設定する
                       saveData.setOotmOid(dto.getOid());
                       saveData.setIptOrderTargetType(data.getIptOrderTargetType());
                       saveData.setUserOid(userOid);
                       saveData.setUserPlaceOid(userPlaceOid);
                        // UPDATE
                       orderTargetRegMapper.update(saveData);
                   }
            }
        }
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
