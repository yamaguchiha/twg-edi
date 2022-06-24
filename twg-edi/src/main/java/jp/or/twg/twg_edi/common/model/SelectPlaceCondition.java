package jp.or.twg.twg_edi.common.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 企業事業所選択の検索条件Model
 *
 * @author yamaguchiha
 *
 */
@Setter
@Getter
public class SelectPlaceCondition {

	private boolean isLimit;
	private Long ownPlaceOid;
	private String tdbPartyCode;
	private String abbrCode;
	private String partyName;
}
