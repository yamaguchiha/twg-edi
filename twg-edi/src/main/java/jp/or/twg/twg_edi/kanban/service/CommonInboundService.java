package jp.or.twg.twg_edi.kanban.service;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.common.entity.OptionKanbanBranch;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.mapper.ItemDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.ItemMapper;
import jp.or.twg.twg_edi.common.mapper.OptionKanbanBranchDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionKanbanBranchMapper;
import jp.or.twg.twg_edi.common.mapper.OptionKanbanBranchPermanentDynamicSqlSupport;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import lombok.RequiredArgsConstructor;

/**
 * かんばん納入指示 共通処理
 * @author nishidat
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CommonInboundService {

	private final PartyPlaceService partyPlaceService;
	//private OptionSystemConfigService optionSystemConfigMapper;
	private final ItemMapper itemMapper;
	private final OptionKanbanBranchMapper optionKanbanBranchMapper;

	/* inboundKanbanDeljitPager.java */
	public List<Item> getAllItem(InboundKanbanDeljitBean bean, Place userPlace) throws Exception {
		Place placeSf = this.partyPlaceService.getPlace(bean.getOptionKanbanCycle().getPlaceSfOid());
		return getAllItem(bean, userPlace, placeSf);
	}
	/**
	 * 納入指示候補となる全品番の抜き出し(打切済を除く)
	 *
	 * @param bean      納入指示情報
	 * @param userPlace 自工区
	 * @return 納入指示候補となる全品番リスト
	 * @throws Exception
	 */
	public List<Item> getAllItem(InboundKanbanDeljitBean bean, Place userPlace, Place placeSf) throws Exception {

		// 取引期限が有効な品番（納入指示日、便でチェック）を検索
		List<Item> itemSpecList = this.getItemList(userPlace, placeSf);

		List<Item> itemOrderList = new ArrayList<Item>();
		String baseItemM01Desc;
		//TODO:保留
		String optionItemTypeM01List = "1";
		//String optionItemTypeM01List = optionSystemConfigMapper.getParameterBySystemConfigCategory(OptionSystemConfigCategory.ItemTypeM01, userPlace, false);
		for (Item itemSpec : itemSpecList) {
			// 受入品番マスタの納入方式を取得
			baseItemM01Desc = itemSpec.getItemM01Desc();

			// 納入方式場対象である場合に、納入指示データの作成対象に含める。
			if (baseItemM01Desc != null
			 && optionItemTypeM01List != null) {
				if (optionItemTypeM01List.contains(baseItemM01Desc)) {
					// 最新以外の品番についても、表示したいがため、重複チェックは行わず、品番すべて返却する
					itemOrderList.add(itemSpec);
				}
			}
		}
		return itemOrderList;
	}

	/**
	 * 製品または部品の品目属性リストを取得
	 *   納入指示作成対象に紐付く品番情報を全て抽出する。<BR>
	 *   下記品番を対象とし、以降の処理はその品番を対象として処理する。
	 * @param ownPlace ログイン事業所
	 * @param placeSf 納入先 or 納入者
	 * @return 品目属性リスト
	 */
	public List<Item> getItemList(Place ownPlace, Place placeSf) {
		return getItemList(ownPlace.getOid(), placeSf.getOid());
	}

	/**
	 * 製品または部品の品目属性リストを取得
	 *   納入指示作成対象に紐付く品番情報を全て抽出する。<BR>
	 *   下記品番を対象とし、以降の処理はその品番を対象として処理する。
	 * @param ownPlaceOid ログイン事業所
	 * @param placeSfOid 納入先 or 納入者
	 * @return 品目属性リスト
	 */
	public List<Item> getItemList(Long ownPlaceOid, Long placeSfOid) {
		SelectStatementProvider selectStatement = 
				SqlBuilder.select(ItemMapper.selectList)
						  .from(ItemDynamicSqlSupport.item)
						  .where(ItemDynamicSqlSupport.placeByOid, SqlBuilder.isEqualTo(ownPlaceOid))
						  .and(ItemDynamicSqlSupport.placeSfOid, SqlBuilder.isEqualTo(placeSfOid))
						  .and(ItemDynamicSqlSupport.buyable, SqlBuilder.isEqualTo("Y"))
						  .orderBy(SqlBuilder.sortColumn(ItemDynamicSqlSupport.item8.name()),
						           SqlBuilder.sortColumn(ItemDynamicSqlSupport.itemE18.name()),
						           SqlBuilder.sortColumn(ItemDynamicSqlSupport.validStartStringDate.name()))
						  .build()
						  .render(RenderingStrategies.MYBATIS3);
		List<Item> itemList = this.itemMapper.selectMany(selectStatement);
		return itemList;
	}

	/**
	 * 外れかんばん枚数抜き出し
	 * @param itemSpecList 品番List
	 * @return 納入指示日・便算出結果
	 * @throws Exception
	 */
	public List<Item> getRollKanban(List<Item> itemSpecList) throws Exception {
		List<Item> itemRollList = new ArrayList<Item>();

		// かんばん枚数情報を作成
		for (Item itemSpec : itemSpecList) {
			// 納入指示作成対象と判断した場合、かんばん回転情報の状況が"外れ"になっているものを抜き出しし、枚数を集計する。
			List<OptionKanbanBranch> kanbanBranchList = this.getKanbanStatusList(itemSpec, 1); 
					//KanbanStatusType.OFF_KANBAN.getId());
			// かんばん増減情報が存在する時の処理
			if (kanbanBranchList.size() > 0) {
				itemRollList.add(itemSpec);
			}
		}
		return itemRollList;
	}
	
	/**
	 * 品目属性から指定のステータスのかんばん回転情報を取得
	 * @param itemSpec 品目属性
	 * @param status かんばんステータス
	 * @return かんばん回転情報リスト
	 */
	public List<OptionKanbanBranch> getKanbanStatusList(Item itemSpec, int status) {
		SelectStatementProvider selectStatement = 
				SqlBuilder.select(OptionKanbanBranchMapper.selectList)
						  .from(OptionKanbanBranchDynamicSqlSupport.optionKanbanBranch)
						  .join(OptionKanbanBranchPermanentDynamicSqlSupport.optionKanbanBranchPermanent)
						  .on(OptionKanbanBranchDynamicSqlSupport.oid, SqlBuilder.equalTo(OptionKanbanBranchPermanentDynamicSqlSupport.oid))
						  .join(ItemDynamicSqlSupport.item)
						  .on(OptionKanbanBranchDynamicSqlSupport.itemPartOid, SqlBuilder.equalTo(ItemDynamicSqlSupport.oid))
						  .where(OptionKanbanBranchDynamicSqlSupport.itemPartOid, SqlBuilder.isEqualTo(itemSpec.getOid()))
						  .and(OptionKanbanBranchDynamicSqlSupport.branchStatus, SqlBuilder.isEqualTo(status))
						  .orderBy(SqlBuilder.sortColumn(OptionKanbanBranchPermanentDynamicSqlSupport.oid.name()))
						  .build()
						  .render(RenderingStrategies.MYBATIS3);
		List<OptionKanbanBranch> optionKanbanBranch = this.optionKanbanBranchMapper.selectMany(selectStatement);
		return optionKanbanBranch;
	}

	//TODO:いらんかも
	/**
	 * 品目属性から指定のステータスのかんばん回転情報を取得
	 * @param itemSpec 品番マスタ
	 * @param status かんばんステータス
	 * @return かんばん回転情報リスト
	 */
	public List<OptionKanbanBranch> getKanbanNotStatusList(Item itemSpec, int status) {
		SelectStatementProvider selectStatement = 
				SqlBuilder.select(OptionKanbanBranchMapper.selectList)
						  .from(OptionKanbanBranchDynamicSqlSupport.optionKanbanBranch)
						  .join(OptionKanbanBranchPermanentDynamicSqlSupport.optionKanbanBranchPermanent)
						  .on(OptionKanbanBranchDynamicSqlSupport.oid, SqlBuilder.equalTo(OptionKanbanBranchPermanentDynamicSqlSupport.oid))
						  .join(ItemDynamicSqlSupport.item)
						  .on(OptionKanbanBranchDynamicSqlSupport.itemPartOid, SqlBuilder.equalTo(ItemDynamicSqlSupport.oid))
						  .where(OptionKanbanBranchDynamicSqlSupport.itemPartOid, SqlBuilder.isEqualTo(itemSpec.getOid()))
						  .and(OptionKanbanBranchDynamicSqlSupport.branchStatus, SqlBuilder.isNotEqualTo(status))
						  .orderBy(SqlBuilder.sortColumn(OptionKanbanBranchPermanentDynamicSqlSupport.oid.name()))
						  .build()
						  .render(RenderingStrategies.MYBATIS3);
		List<OptionKanbanBranch> optionKanbanBranch = this.optionKanbanBranchMapper.selectMany(selectStatement);
		return optionKanbanBranch;
	}
	
	/* OpCalender.makeOpCalender */

}
