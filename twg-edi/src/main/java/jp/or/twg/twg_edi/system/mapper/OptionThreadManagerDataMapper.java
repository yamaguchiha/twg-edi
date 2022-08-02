package jp.or.twg.twg_edi.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.or.twg.twg_edi.system.model.OptionThreadManagerDetailDto;
import jp.or.twg.twg_edi.system.model.OptionThreadManagerDto;
import jp.or.twg.twg_edi.system.model.OptionThreadManagerSrhCond;



@Mapper
public interface OptionThreadManagerDataMapper {
/**
 * 処理一覧の一覧xml用
 *
 * @param condition
 * @return
 */
public List<OptionThreadManagerDto> selectOptionThreadManagerList(OptionThreadManagerSrhCond condition);

/**
 * 処理一覧count xml用
 *
 * @param condition
 * @return
 */
public Long selectOptionThreadManagerListCount(OptionThreadManagerSrhCond condition);

/**処理一覧の詳細用
 *
 * @param srhId
 * @return
 */
public OptionThreadManagerDetailDto selectOptionThreadManagerDetail(String srhId);

}