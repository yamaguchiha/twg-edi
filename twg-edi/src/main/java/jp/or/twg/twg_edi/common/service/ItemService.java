package jp.or.twg.twg_edi.common.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.difinition.SqlStatement;
import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.common.mapper.ItemMapper;
import jp.or.twg.twg_edi.common.model.SelectItemCondition;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ItemService {

	private final ItemMapper itemMapper;


	/**
	 * 品番選択Ajax用
	 *   かんばん増減のみ？
	 *
	 * @param srhItemAbbrName
	 * @param srhItemCode
	 * @param srhItemE18
	 * @param srhSelectPartyCodeSf
	 * @param srhSelectPlaceCodeSf
	 * @param placeByOid
	 * @return
	 */
	public List<Item> getSelectItemList(String srhItemAbbrName, String srhItemCode, String srhItemE18, String srhSelectPartyCodeSf, String srhSelectPlaceCodeSf, Long placeByOid) {
		SelectItemCondition condition = new SelectItemCondition();

		condition.setSrhItemAbbrName(CommonDataUtil.isNullOrEmpty(srhItemAbbrName) ? null : SqlStatement.WILDCARD + srhItemAbbrName + SqlStatement.WILDCARD);
		condition.setSrhItemCode(CommonDataUtil.isNullOrEmpty(srhItemCode) ? null : SqlStatement.WILDCARD + srhItemCode + SqlStatement.WILDCARD);
		condition.setSrhItemE18(CommonDataUtil.isNullOrEmpty(srhItemE18) ? null : SqlStatement.WILDCARD + srhItemE18 + SqlStatement.WILDCARD);
		condition.setSrhSelectPartyCodeSf(CommonDataUtil.isNullOrEmpty(srhSelectPartyCodeSf) ? null : srhSelectPartyCodeSf);
		condition.setSrhSelectPlaceCodeSf(CommonDataUtil.isNullOrEmpty(srhSelectPlaceCodeSf) ? null : srhSelectPlaceCodeSf);
		condition.setSrhPlaceByOid(placeByOid);

		return itemMapper.selectItemList(condition);
	}

}
