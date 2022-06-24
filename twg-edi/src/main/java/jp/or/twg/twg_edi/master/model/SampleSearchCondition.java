package jp.or.twg.twg_edi.master.model;

import lombok.Getter;
import lombok.Setter;

/**
 * サンプル　検索条件
 *
 * @author yamaguchiha
 *
 */
@Setter
@Getter
public class SampleSearchCondition {


	private String srhDateFrom;

	private String srhDateTo;

	private String srhPartyAbbrCode;

	private String srhPlaceCode;

	private String iptShipmentDate;

	private String iptItemIdIn;

	private String iptItemE18;

	private String iptItemAbbrName;
	
	private String[] multiChecks;
}
