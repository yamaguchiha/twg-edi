package jp.or.twg.twg_edi.master.model;

import lombok.Getter;
import lombok.Setter;

/**
 * ユーザform
 *
 * @author yamaguchiha
 *
 */
@Setter
@Getter
public class UserForm {

	private String mode;

	// userOid hidden項目
	private String userOid;

	private String iptUserId;

	private String iptPassword;

	private String iptPasswordReconfirm;

	private String iptName;

	private String roleTypeId;

	// roleTypeの名称 confirmで使用
	private String roleTypeName;

	private String defaultPlace;

	// defaultPlaceOid hidden項目
	private String defaultPlaceOid;

	private String[] selectPlaces;
	private String selectPlacesString;

	private String selectShipment;

	// 出荷場所の名称 confirmで使用
	private String selectShipmentName;

	private String selectDelivery;

	// 納入場所の名称 confirmで使用
	private String selectDeliveryName;
}
