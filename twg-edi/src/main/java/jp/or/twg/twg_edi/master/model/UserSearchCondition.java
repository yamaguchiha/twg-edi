package jp.or.twg.twg_edi.master.model;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * ユーザ登録　検索条件
 *
 * @author yamaguchiha
 *
 */
@Setter
@Getter
public class UserSearchCondition {


	@Size(max = 32)
	private String srhUserId;

	private String srhUserIdType;

	@Size(max = 128)
	private String srhName;

	private String srhNameType;

	private String srhInMaintenance;

	private Long pageSize;
}
