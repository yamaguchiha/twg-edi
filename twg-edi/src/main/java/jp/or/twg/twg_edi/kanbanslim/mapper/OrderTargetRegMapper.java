package jp.or.twg.twg_edi.kanbanslim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.or.twg.twg_edi.common.entity.OptionOrderTargetManager;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegDto;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegSaveDto;
import jp.or.twg.twg_edi.kanbanslim.model.OrderTargetRegSrhCond;

@Mapper
public interface OrderTargetRegMapper {
    /**
     * 発注対象登録処理一覧count xml用
     *
     * @param condition
     * @return
     */
    public Long selectOrderTargetRegListCount(OrderTargetRegSrhCond condition);

    /**
     * 発注対象登録処理一覧xml用
     *
     * @param condition
     * @return
     */
    public List<OrderTargetRegDto> selectOrderTargetRegList(OrderTargetRegSrhCond condition);

    /**
    * 発注対象情報取得
    *
    * @param itemPartOid
    * @return
    */
    public OptionOrderTargetManager selectOrderTargetRegOne(long itemPartOid);

    /**
     * 発注対象登録用
     *
     * @param insertData
     * @return none
     */
    public void insert(OrderTargetRegSaveDto insertData);

    /**
     * 発注対象更新用
     *
     * @param updateData
     * @return none
     */
    public void update(OrderTargetRegSaveDto updateData);

}