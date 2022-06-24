package jp.or.twg.twg_edi.common.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 品番選択の検索条件Model
 *
 * @author yamaguchiha
 *
 */
@Setter
@Getter
public class SelectItemCondition {

	private String srhItemAbbrName;
	private String srhItemCode;
	private String srhItemE18;
	private String srhSelectPartyCodeSf;
	private String srhSelectPlaceCodeSf;
	private Long srhPlaceByOid;
}
