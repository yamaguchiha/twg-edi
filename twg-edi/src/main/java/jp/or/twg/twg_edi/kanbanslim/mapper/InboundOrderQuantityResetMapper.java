package jp.or.twg.twg_edi.kanbanslim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.or.twg.twg_edi.kanbanslim.model.InboundOrderQuantityResetDto;
import jp.or.twg.twg_edi.kanbanslim.model.InboundOrderQuantityResetSaveDto;
import jp.or.twg.twg_edi.kanbanslim.model.InboundOrderQuantityResetSrhCond;

@Mapper
public interface InboundOrderQuantityResetMapper {
    /**
     * 発注対象登録処理一覧count xml用
     *
     * @param condition
     * @return
     */
    public Long selectOrderQuantityResetListCount(InboundOrderQuantityResetSrhCond condition);

    /**
     * 発注枚数リセット処理一覧xml用
     *
     * @param condition
     * @return
     */
    public List<InboundOrderQuantityResetDto> selectOrderQuantityResetList(InboundOrderQuantityResetSrhCond condition);

    /**
     * 発注枚数更新(リセット)用
     *
     * @param InboundOrderQuantityResetDto
     * @return none
     */
    public void update(InboundOrderQuantityResetSaveDto updateData);

}