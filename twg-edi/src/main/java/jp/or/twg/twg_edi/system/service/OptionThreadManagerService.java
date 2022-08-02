package jp.or.twg.twg_edi.system.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.entity.OptPlace;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.mapper.OptPlaceMapper;
import jp.or.twg.twg_edi.common.mapper.UsersDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.UsersMapper;
import jp.or.twg.twg_edi.common.service.NumberingService;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.system.mapper.OptionThreadManagerDataMapper;
import jp.or.twg.twg_edi.system.model.OptionThreadManagerDetailDto;
import jp.or.twg.twg_edi.system.model.OptionThreadManagerDto;
import jp.or.twg.twg_edi.system.model.OptionThreadManagerSrhCond;
import lombok.RequiredArgsConstructor;

/**
 * 処理一覧情報　サービスクラス
 *
 * @author kawadet
 *
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class OptionThreadManagerService {

    private final UsersMapper usersMapper;
    private final OptPlaceMapper optPlaceMapper;
    private final NumberingService numberingService;
    private final OptionThreadManagerDataMapper optionThreadManagerDataMapper;

    /**
     * 条件に一致する処理一覧を取得する(Pageer版)
     *   セッションからログイン情報を取得して企業を特定し、その企業の事業所一覧を取得
     *   その事業所に所属する発注対象登録処理を取得する
     *     発注対象登録処理条件設定して検索結果を返す
     *
     * @param pageable ページクラス
     * @param condition 検索条件
     *
     * @return Page<OptionThreadManagerDto>
     */
    public Page<OptionThreadManagerDto> getListByCondition(Pageable pageable, OptionThreadManagerSrhCond condition) {

        // 検索用conditionを作成
        OptionThreadManagerSrhCond sqlCond = new OptionThreadManagerSrhCond();

        // 処理番号
        sqlCond.setSrhId(CommonDataUtil.isNullOrEmpty(condition.getSrhId()) ? null : condition.getSrhId());

        // 処理種別
        if(CommonDataUtil.isNullOrEmpty(condition.getSrhThreadCategory())) {
            sqlCond.setSrhThreadCategory(null);
        }
        // TODO 選択してくださいのままはnull扱い
        else if(condition.getSrhThreadCategory().equals("0")) {
            sqlCond.setSrhThreadCategory(null);
        }
        else {
            sqlCond.setSrhThreadCategory(condition.getSrhThreadCategory());
        }

        // 日付条件の編集
        sqlCond.setSrhStartUpTime(CommonDataUtil.isNullOrEmpty(condition.getSrhStartUpTime()) ? null : condition.getSrhStartUpTime().replaceAll("/", ""));
        sqlCond.setSrhCloseOutTime(CommonDataUtil.isNullOrEmpty(condition.getSrhCloseOutTime()) ? null : condition.getSrhCloseOutTime().replaceAll("/", ""));

        // 状態（選択したチェックボックスリスト）
        sqlCond.setSrhThreadStatus(CommonDataUtil.isNullOrEmpty(condition.getSrhThreadStatus()) ? null : condition.getSrhThreadStatus().clone());


        // TODO 事業所工区　追加条件として必要か確認中


        // pager用
        sqlCond.setSrhLimit(pageable.getPageSize());
        sqlCond.setSrhOffset(pageable.getOffset());

        // 検索条件を元にcount結果を格納
        long count = optionThreadManagerDataMapper.selectOptionThreadManagerListCount(sqlCond);

        // 検索条件を元に検索結果をDtoに格納
        List<OptionThreadManagerDto> optionThreadManagerDto = new ArrayList<>();
        optionThreadManagerDto = optionThreadManagerDataMapper.selectOptionThreadManagerList(sqlCond);

        return new PageImpl<>(optionThreadManagerDto, pageable, count);
    }

    /**
     * 選択された処理の情報詳細を取得する
     *
     * @return
     */
    public OptionThreadManagerDetailDto getDetailData(String id) {

        // 検索条件を元に検索結果をDtoに格納
        OptionThreadManagerDetailDto dto = new OptionThreadManagerDetailDto();
        dto = optionThreadManagerDataMapper.selectOptionThreadManagerDetail(id);

        return dto;
    }
    /**
     * 状態(スレッドステータス)チェックボックスリスト取得
     * @return
     */
    public Map<String, String> getThreadStatusHTMLCheckBox() {

        // TODO srhthreadStatus:状態  OptionThreadStatus.name
        Map<String, String> threadStatusCheckBox = new LinkedHashMap<String , String>();
//        threadStatusCheckBox.put("実行中", "1");
//        threadStatusCheckBox.put("正常終了", "2");
//        threadStatusCheckBox.put("正常終了（警告あり）", "3");
//        threadStatusCheckBox.put("異常終了", "4");
//        threadStatusCheckBox.put("例外発生", "5");
//        threadStatusCheckBox.put("EDIエラー", "6");
//        threadStatusCheckBox.put("データ入力中", "7");
//        threadStatusCheckBox.put("データ入力済", "8");
        threadStatusCheckBox.put("実行中", "実行中");
        threadStatusCheckBox.put("正常終了", "正常終了");
        threadStatusCheckBox.put("正常終了（警告あり）", "正常終了（警告あり）");
        threadStatusCheckBox.put("異常終了", "異常終了");
        threadStatusCheckBox.put("例外発生", "例外発生");
        threadStatusCheckBox.put("EDIエラー", "EDIエラー");
        threadStatusCheckBox.put("データ入力中", "データ入力中");
        threadStatusCheckBox.put("データ入力済", "データ入力済");

        return threadStatusCheckBox;
    }

    /**
     * 処理種別(スレッドカテゴリー)プルダウンリスト取得
     * @return
     */
    public Map<String, String> getThreadCategoryHTMLList() {

        // TODO srhThreadCategory:処理種別  OptionThreadCategory.name
        Map<String, String> threadCategoryList = new LinkedHashMap<String , String>();
        // TODO (ロックID,ロック名)
//        threadCategoryList.put("1", "かんばん納入指示");
//        threadCategoryList.put("2", "かんばん増減枚数計算");
//        threadCategoryList.put("3", "かんばん設定枚数計算");
//        threadCategoryList.put("4", "かんばん増減情報作成");
//        threadCategoryList.put("5", "追加納入指示");
//        threadCategoryList.put("6", "追加納入指示(出荷数変更なし)");
//        threadCategoryList.put("7", "追加納入指示(出荷数変更あり)");
//        threadCategoryList.put("8", "追加納入指示(仕入先工区設定に従う)");
//        threadCategoryList.put("9", "追加納入指示(後工程)");
//        threadCategoryList.put("10", "追加納入指示(出荷数変更なし、かつ仕入先工区設定に従う)");
//        threadCategoryList.put("11", "追加納入指示(出荷数変更なし、かつ後工程)");
//        threadCategoryList.put("12", "追加納入指示(出荷数変更あり、かつ仕入先工区設定に従う)");
//        threadCategoryList.put("13", "追加納入指示(出荷数変更あり、かつ後工程)");
//        threadCategoryList.put("14", "かんばん増減情報アップロード");
//        threadCategoryList.put("15", "差換かんばん作成");
//        threadCategoryList.put("16", "予備かんばん作成");
//        threadCategoryList.put("17", "簡易かんばん納入指示");
        threadCategoryList.put("かんばん納入指示", "かんばん納入指示");
        threadCategoryList.put("かんばん増減枚数計算", "かんばん増減枚数計算");
        threadCategoryList.put("かんばん設定枚数計算", "かんばん設定枚数計算");
        threadCategoryList.put("かんばん増減情報作成", "かんばん増減情報作成");
        threadCategoryList.put("追加納入指示", "追加納入指示");
        threadCategoryList.put("追加納入指示(出荷数変更なし)", "追加納入指示(出荷数変更なし)");
        threadCategoryList.put("追加納入指示(出荷数変更あり)", "追加納入指示(出荷数変更あり)");
        threadCategoryList.put("追加納入指示(仕入先工区設定に従う)", "追加納入指示(仕入先工区設定に従う)");
        threadCategoryList.put("追加納入指示(後工程)", "追加納入指示(後工程)");
        threadCategoryList.put("追加納入指示(出荷数変更なし、かつ仕入先工区設定に従う)", "追加納入指示(出荷数変更なし、かつ仕入先工区設定に従う)");
        threadCategoryList.put("追加納入指示(出荷数変更なし、かつ後工程)", "追加納入指示(出荷数変更なし、かつ後工程)");
        threadCategoryList.put("追加納入指示(出荷数変更あり、かつ仕入先工区設定に従う)", "追加納入指示(出荷数変更あり、かつ仕入先工区設定に従う)");
        threadCategoryList.put("追加納入指示(出荷数変更あり、かつ後工程)", "追加納入指示(出荷数変更あり、かつ後工程)");
        threadCategoryList.put("かんばん増減情報アップロード", "かんばん増減情報アップロード");
        threadCategoryList.put("差換かんばん作成", "差換かんばん作成");
        threadCategoryList.put("予備かんばん作成", "予備かんばん作成");
        threadCategoryList.put("簡易かんばん納入指示", "簡易かんばん納入指示");

        return threadCategoryList;
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
     * 指定したOIDでユーザー情報を返す
     * @param userOid
     * @return
     */
    public Optional<Users> getUserInfo(long usersOId) {
        // Usersテーブルからユーザ情報取得
        SelectStatementProvider selectStatementUsers = SqlBuilder.select(UsersMapper.selectList)
                .from(UsersDynamicSqlSupport.users)
                .where(UsersDynamicSqlSupport.oid, SqlBuilder.isEqualTo(usersOId))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        Optional<Users> users = usersMapper.selectOne(selectStatementUsers);
        return users;
    }

}
