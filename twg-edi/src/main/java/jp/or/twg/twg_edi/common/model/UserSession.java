package jp.or.twg.twg_edi.common.model;

import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.PartySetting;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.PlaceSetting;
import jp.or.twg.twg_edi.common.entity.Users;
import lombok.Getter;
import lombok.Setter;

/**
 * ログイン情報(セッション格納情報)
 *
 * @author yamaguchiha
 *
 */
@Setter
@Getter
public class UserSession {

	private Users myUsers = null;
	private Party myParty = null;
	private PartySetting myPartySetting = null;
	private Place myPlace = null;
	private PlaceSetting myPlaceSetting = null;

	// 発注管理メニューバー表示制御
	private boolean functionLimited = false;

	// 支給管理メニューバー表示制御
	private boolean supplyfuncLimited = false;

	// マスタ管理メニューバー表示制御（運用者、検索者は非表示）
	private boolean notOperatorOrSearcher = false;

	// システム管理メニューバー表示制御（運用者、検索者、出荷場セキュリティ担当者は非表示）
	private boolean notOperatorOrSearcherOrOptUser = false;

	// かんばん納入指示オプションメニュー表示制御（契約ありでtrue）
	private boolean kanbanDeljitContracted = false;

	// かんばん納入指示Slimオプションメニュー表示制御（契約ありでtrue）
	private boolean kanbanDeljitSlimContracted = false;
}
