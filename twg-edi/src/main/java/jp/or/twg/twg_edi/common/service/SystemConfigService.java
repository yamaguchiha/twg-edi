package jp.or.twg.twg_edi.common.service;

import java.util.Optional;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.difinition.IConfigCategory;
import jp.or.twg.twg_edi.common.difinition.SystemConfigCategory;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.SystemConfig;
import jp.or.twg.twg_edi.common.mapper.SystemConfigDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.SystemConfigMapper;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.NumberUtil;
import lombok.RequiredArgsConstructor;

/**
 * SystemConfigテーブルに対する値取得のサービスクラス
 *
 * @author yamaguchiha
 *
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class SystemConfigService {

	private final SystemConfigMapper systemConfigMapper;

	/**
	 * システムパラメータ要素取得
	 *
	 * @param systemConfigCategory システムパラメーターカテゴリー
	 * @param place 場所
	 * @param getDefault デフォルト値を取得する：true
	 * @return システムパラメータ要素
	 */
	public SystemConfig getEntityBySystemConfigCategory(IConfigCategory systemConfigCategory, Place place, boolean getDefault) {
		if (systemConfigCategory == null) {
			return null;
		}

		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = SqlBuilder.select(SystemConfigMapper.selectList)
				  .from(SystemConfigDynamicSqlSupport.systemConfig)
				  .where(SystemConfigDynamicSqlSupport.category, SqlBuilder.isEqualTo(systemConfigCategory.name()));

		if(place == null) {
			builder.and(SystemConfigDynamicSqlSupport.ownPlaceOid, SqlBuilder.isNull());
		} else {
			builder.and(SystemConfigDynamicSqlSupport.ownPlaceOid, SqlBuilder.isEqualTo(place.getOid()));
		}

		SelectStatementProvider selectStatement = builder.build().render(RenderingStrategies.MYBATIS3);
		Optional<SystemConfig> systemConfig = systemConfigMapper.selectOne(selectStatement);
		if(systemConfig.isEmpty() && place != null && getDefault) {
			//取得できない場合はデフォルトを返す
			return getEntityBySystemConfigCategory(systemConfigCategory, null, false);
		}

		return systemConfig.isEmpty() ? null : systemConfig.get();
	}

	/**
	 * システムパラメータ取得
	 *
	 * @param systemConfigCategory システムパラメーターカテゴリー
	 * @param place 場所
	 * @param getDefault デフォルト値を取得する：true
	 * @return システムパラメータ
	 */
	public String getParameterBySystemConfigCategory(IConfigCategory systemConfigCategory, Place place, boolean getDefault) {
		if (systemConfigCategory == null) {
			return null;
		}
		SystemConfig config = getEntityBySystemConfigCategory(systemConfigCategory, place, getDefault);
		if (config == null) {
			return getDefault ? systemConfigCategory.getDefaultParameter() : null;
		}
		return config.getParameter();
	}

	/**
	 * 納品書番号自動採番を使用するかを取得
	 * @param place 場所
	 * @return true:使用する false:使用しない
	 */
	public boolean isAutoSetDocRefIdAau(Place place) {
		return CommonDataUtil.booleanCharToBoolean(getParameterBySystemConfigCategory(SystemConfigCategory.AutoSetDocRefIdAau, place, true));
	}

	/**
	 * 各種画面で１ページに表示する行数を取得
	 *
	 * @param place 場所
	 * @return 各種画面で１ページに表示する行数
	 */
	public Integer getDefaultSizePerPage(Place place) {
		return NumberUtil.tryParseInteger(getParameterBySystemConfigCategory(SystemConfigCategory.DefaultSizePerPage, place, true));
	}

	/**
	 * 出荷・納入場所セキュリティ取得
	 *
	 * @return 利用可否(true:利用する false:利用しない)
	 */
	public boolean isPlaceSecurityOption(Place place) {
		return CommonDataUtil.booleanCharToBoolean(SystemConfigCategory.PlaceSecurityOption.getParameterByPlace(place));
	}

	/**
	 * 出荷・納入場所検索オプション取得
	 *
	 * @return 利用可否(true:利用する false:利用しない)
	 */
	public boolean isDischargeSearchOption(Place place) {
		return CommonDataUtil.booleanCharToBoolean(SystemConfigCategory.DischargeSearchOption.getParameterByPlace(place));
	}

	/**
	 * 別送支給利用制限取得
	 *
	 * @return 利用制限(Y:制限する N:制限しない)
	 */
	public boolean isSupplyFuncLimited(Place place) {
		return CommonDataUtil.booleanCharToBoolean(getParameterBySystemConfigCategory(SystemConfigCategory.SupplyFuncLimited, place, true));
	}


}
