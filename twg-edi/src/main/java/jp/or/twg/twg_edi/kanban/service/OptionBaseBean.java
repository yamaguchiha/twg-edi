package jp.or.twg.twg_edi.kanban.service;

import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.PartySetting;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.PlaceSetting;
import jp.or.twg.twg_edi.common.entity.TransportHeader;
import jp.or.twg.twg_edi.common.entity.TransportProcess;
import jp.or.twg.twg_edi.common.entity.Users;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OptionBaseBean {

	//base
	/**
     * チェックボックス値	TODO:おそらく不要
    **/
    private  String   checkboxValue;

    /**
     * チェックボックス表示	TODO:おそらく不要
    **/
    private  String   checkboxView;

    /**
     * データNo
    **/
    private  Integer   dataNo;

    /**
     * データ件数
    **/
    private  Integer   dataNum;

    /**
     * データ件数2
    **/
    private  Integer   dataNum2;

    /**
     * EDIステータス
    **/
    private  String   eDIStatus;

    /**
     * 企業情報
    **/
    private  Party   party;

    /**
     * 事業所情報
    **/
    private  Place   place;

    /**
     * 企業設定情報
     */
    private PartySetting partySetting;

    /**
     * 事業所設定情報
     */
    private PlaceSetting placeSetting;

    /**
     * ヘッダー情報
    **/
    private  TransportHeader   header;

    /**
     * プロセス情報
    **/
    private  TransportProcess   process;

    /**
     * ユーザー情報
    **/
    private  Users   users;
}