package jp.or.twg.twg_edi.common.service;

import java.util.List;
import java.util.Optional;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.difinition.SqlStatement;
import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.PartySetting;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.PlaceSetting;
import jp.or.twg.twg_edi.common.mapper.PartyDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.PartyMapper;
import jp.or.twg.twg_edi.common.mapper.PartySettingDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.PartySettingMapper;
import jp.or.twg.twg_edi.common.mapper.PlaceDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.PlaceMapper;
import jp.or.twg.twg_edi.common.mapper.PlaceSettingDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.PlaceSettingMapper;
import jp.or.twg.twg_edi.common.model.SelectPlaceCondition;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class PartyPlaceService {

    private final PartyMapper partyMapper;
    private final PartySettingMapper partySettingMapper;
    private final PlaceMapper placeMapper;
    private final PlaceSettingMapper placeSettingMapper;

    private String myPartyCode = null;
    private String myPlaceCode = null;

    public void initialize(String tdbPartyCode, String tdbPlaceCode) {
    	this.myPartyCode = tdbPartyCode;
    	this.myPlaceCode = tdbPlaceCode;
    }

    /**
     * Placeの企業情報OidからPartyを取得する
     *
     * @param partyOid
     * @return
     */
    public Party getParty(Long partyOid) {
        SelectStatementProvider selectStatement = SqlBuilder.select(PartyMapper.selectList)
                  .from(PartyDynamicSqlSupport.party)
                  .where(PartyDynamicSqlSupport.oid, SqlBuilder.isEqualTo(partyOid))
                  .build()
                  .render(RenderingStrategies.MYBATIS3);
        Optional<Party> partyList = partyMapper.selectOne(selectStatement);
        if(partyList.isEmpty()) {
            return null;
        } else {
            return partyList.get();
        }
    }

    /**
     * TDBコードからPartyを取得する
     *
     * @param partyCd
     * @return
     */
	public Party getPartyByTdbCode(String partyCd) {
		SelectStatementProvider selectStatement = SqlBuilder.select(PartyMapper.selectList)
				  .from(PartyDynamicSqlSupport.party)
				  .where(PartyDynamicSqlSupport.tdbPartyCode, SqlBuilder.isEqualTo(partyCd))
				  .build()
				  .render(RenderingStrategies.MYBATIS3);
		Optional<Party> partyList = partyMapper.selectOne(selectStatement);
		if(partyList.isEmpty()) {
			return null;
		} else {
			return partyList.get();
		}
	}

    /**
     * 企業コード、工区コードからPlaceを取得する
     *
     * @param partyCd
     * @param tdbPlaceCd
     * @return
     */
	public Place getPlaceByTdbCodeAndPlaceCode(String partyCd, String placeCd) {

		SelectStatementProvider selectStatement = SqlBuilder.select(PlaceMapper.selectList)
				  .from(PlaceDynamicSqlSupport.place)
				  .join(PartyDynamicSqlSupport.party).on(PlaceDynamicSqlSupport.partyOid, SqlBuilder.equalTo(PartyDynamicSqlSupport.oid))
				  .where(PlaceDynamicSqlSupport.tdbPlaceCode, SqlBuilder.isEqualTo(placeCd))
				  .and(PartyDynamicSqlSupport.tdbPartyCode, SqlBuilder.isEqualTo(partyCd))
				  .build()
				  .render(RenderingStrategies.MYBATIS3);
		Optional<Place> placeList = placeMapper.selectOne(selectStatement);
		if(placeList.isEmpty()) {
			return null;
		} else {
			return placeList.get();
		}
	}

    /**
     * 企業(Party)、工区コードからPlaceを取得する
     *
     * @param party
     * @param tdbPlaceCd
     * @return
     */
	public Place getPlaceByPartyAndPlaceCode(Party party, String tdbPlaceCd) {
		SelectStatementProvider selectStatement = SqlBuilder.select(PlaceMapper.selectList)
				  .from(PlaceDynamicSqlSupport.place)
				  .join(PartyDynamicSqlSupport.party).on(PlaceDynamicSqlSupport.partyOid, SqlBuilder.equalTo(PartyDynamicSqlSupport.oid))
				  .where(PlaceDynamicSqlSupport.tdbPlaceCode, SqlBuilder.isEqualTo(tdbPlaceCd))
				  .and(PartyDynamicSqlSupport.tdbPartyCode, SqlBuilder.isEqualTo(party.getTdbPartyCode()))
				  .build()
				  .render(RenderingStrategies.MYBATIS3);
		Optional<Place> placeList = placeMapper.selectOne(selectStatement);
		if(placeList.isEmpty()) {
			return null;
		} else {
			return placeList.get();
		}
	}

    /**
     * 企業コードから配下のPlaceを取得する
     *
     * @param tdbPartyCd
     * @return
     */
	public List<Place> getAllPlaceByTdbPartyCode(String tdbPartyCd) {
		SelectStatementProvider selectStatement = SqlBuilder.select(PlaceMapper.selectList)
				  .from(PlaceDynamicSqlSupport.place)
				  .join(PartyDynamicSqlSupport.party).on(PlaceDynamicSqlSupport.partyOid, SqlBuilder.equalTo(PartyDynamicSqlSupport.oid))
				  .where(PartyDynamicSqlSupport.tdbPartyCode, SqlBuilder.isEqualTo(tdbPartyCd))
				  .orderBy(PlaceDynamicSqlSupport.tdbPlaceCode)
				  .build()
				  .render(RenderingStrategies.MYBATIS3);
		List<Place> placeList = placeMapper.selectMany(selectStatement);
		if(placeList.isEmpty()) {
			return null;
		} else {
			return placeList;
		}
	}

    /**
     * 企業(Party)から配下のPlaceを取得する
     *
     * @param party
     * @return
     */
	public List<Place> getAllPlaceByParty(Party party) {
		SelectStatementProvider selectStatement = SqlBuilder.select(PlaceMapper.selectList)
				  .from(PlaceDynamicSqlSupport.place)
				  .join(PartyDynamicSqlSupport.party).on(PlaceDynamicSqlSupport.partyOid, SqlBuilder.equalTo(PartyDynamicSqlSupport.oid))
				  .where(PartyDynamicSqlSupport.tdbPartyCode, SqlBuilder.isEqualTo(party.getTdbPartyCode()))
				  .orderBy(PlaceDynamicSqlSupport.tdbPlaceCode)
				  .build()
				  .render(RenderingStrategies.MYBATIS3);
		List<Place> placeList = placeMapper.selectMany(selectStatement);
		if(placeList.isEmpty()) {
			return null;
		} else {
			return placeList;
		}
	}

	/**
	 * 企業コードからpartySettingを取得
	 * 事前に自工区の情報はinitializeで設定を行っておくこと！
	 *
	 * @param tdbPartyCd
	 * @return
	 */
	public PartySetting getPartySetting(String tdbPartyCd) {
		// 自工区を取得
		Place myPlace = getPlaceByTdbCodeAndPlaceCode(this.myPartyCode, this.myPlaceCode);
		if(myPlace == null) {
			return null;
		}

		SelectStatementProvider selectStatement = SqlBuilder.select(PartySettingMapper.selectList)
				  .from(PartySettingDynamicSqlSupport.partySetting)
				  .join(PartyDynamicSqlSupport.party).on(PartySettingDynamicSqlSupport.partyOid, SqlBuilder.equalTo(PartyDynamicSqlSupport.oid))
				  .where(PartyDynamicSqlSupport.tdbPartyCode, SqlBuilder.isEqualTo(tdbPartyCd))
				  .and(PartySettingDynamicSqlSupport.ownPlaceOid, SqlBuilder.isEqualTo(myPlace.getOid()))
				  .build()
				  .render(RenderingStrategies.MYBATIS3);
		Optional<PartySetting> setting = partySettingMapper.selectOne(selectStatement);
		if(setting.isEmpty()) {
			return null;
		} else {
			return setting.get();
		}
	}

	/**
	 * 企業コード、工区コードからplaceSettingを取得
	 * 事前に自工区の情報はinitializeで設定を行っておくこと！
	 *
	 * @param tdbPartyCd
	 * @param tdbPlaceCd
	 * @return
	 */
	public PlaceSetting getPlaceSetting(String tdbPartyCd, String tdbPlaceCd) {
		// 自工区を取得
		Place myPlace = getPlaceByTdbCodeAndPlaceCode(this.myPartyCode, this.myPlaceCode);
		if(myPlace == null) {
			return null;
		}
		// 設定取得対象の工区を取得
		Place targetPlace = getPlaceByTdbCodeAndPlaceCode(tdbPartyCd, tdbPlaceCd);
		if(targetPlace == null) {
			return null;
		}

		SelectStatementProvider selectStatement = SqlBuilder.select(PlaceSettingMapper.selectList)
				  .from(PlaceSettingDynamicSqlSupport.placeSetting)
				  .where(PlaceSettingDynamicSqlSupport.placeOid, SqlBuilder.isEqualTo(targetPlace.getOid()))
				  .and(PlaceSettingDynamicSqlSupport.ownPlaceOid, SqlBuilder.isEqualTo(myPlace.getOid()))
				  .build()
				  .render(RenderingStrategies.MYBATIS3);
		Optional<PlaceSetting> setting = placeSettingMapper.selectOne(selectStatement);
		if(setting.isEmpty()) {
			return null;
		} else {
			return setting.get();
		}
	}

	/**
	 * 工区のOIDからPlaceを取得
	 * @param placeOid
	 * @return
	 */
	public Place getPlace(Long placeOid) {
		Optional<Place> obj = placeMapper.selectByPrimaryKey(placeOid);
		if(obj.isEmpty()) {
			return null;
		} else {
			return obj.get();
		}
	}

	/**
	 * 企業工区選択Ajax用のデータ取得
	 *
	 * @param tdbPartyCode
	 * @param abbrCode
	 * @param partyName
	 * @return
	 */
	public List<Place> getSelectPlaceList(boolean isLimit, Long ownPlaceOid, String tdbPartyCode, String abbrCode, String partyName) {
		SelectPlaceCondition condition = new SelectPlaceCondition();

		condition.setLimit(isLimit);
		condition.setOwnPlaceOid(ownPlaceOid);
		condition.setTdbPartyCode(CommonDataUtil.isNullOrEmpty(tdbPartyCode) ? null : tdbPartyCode);
		condition.setPartyName(CommonDataUtil.isNullOrEmpty(partyName) ? null : SqlStatement.WILDCARD + partyName + SqlStatement.WILDCARD);
		condition.setAbbrCode(CommonDataUtil.isNullOrEmpty(abbrCode) ? null : abbrCode);

		return placeMapper.selectPlaceList(condition);
	}

}
