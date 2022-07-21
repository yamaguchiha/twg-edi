package jp.or.twg.twg_edi.common.service;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 納入日・便データ
**/
@Setter
@Getter
public class ShipmentDateNo {


    /**
     * 納入日
    **/
    private  Date   shipmentDate;

    /**
     * 納入便
    **/
    private  Integer   shipmentNo;

	/**
	 * コンストラクタ
	 */
	public ShipmentDateNo() {
		super();
	}

	/**
	 * コンストラクタ
	 * @param date 納入日
	 * @param no 納入便
	 */
	public ShipmentDateNo(Date date, int no) {
		setShipmentDate(date);
		setShipmentNo(no);
	}
}
