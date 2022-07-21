package jp.or.twg.twg_edi.common.service;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * スレッド管理（オプション）のXMLアクセス用パラメータクラス
 * @author nishidat
 */
@Setter
@Getter
public class OptionThreadManagerMapperParam {
	private Long srhUsersOid;
	private Long srhUserPlaceOid;
	private String srhThreadCategory;
	private String srhThreadStatus;
	private Date srhCloseOutTimeToday;
	private Date srhCloseOutTimeNext;
}
