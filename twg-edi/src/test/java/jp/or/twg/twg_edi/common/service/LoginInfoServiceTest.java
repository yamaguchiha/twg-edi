package jp.or.twg.twg_edi.common.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.springtestdbunit.annotation.DatabaseSetup;

import jp.or.twg.base.AbstractDbunitTest;

@DatabaseSetup("classpath:META-INF/dbunit/testdata.xlsx")
public class LoginInfoServiceTest extends AbstractDbunitTest {

	@Autowired
	LoginInfoService service;

	@Test
	public void test_LoginCheck() {

		// OTからシングルサインオンで遷移してきた情報でUsersを作成
		String testUserId1 = "sd07";
		String testPartyCd1 = "T00000001";
		String testPassword = "pmm945hy";

		boolean result = service.chkUserPasswd(testUserId1 + "_" + testPartyCd1, testPassword);

		assertTrue("ログイン情報が間違っています。", result);
	}


// セッションに登録しているためJUnitテストはできなくなった。
//	@Test
//	public void test_LoginInfoExistSetting0() {
//
//		// OTからシングルサインオンで遷移してきた情報でUsersを作成
//		// 自企業設定なし、自工区設定なし
//		String testUserId1 = "sd07";
//		String testPartyCd1 = "T00000001";
//		String testPlaceCd1 = "1";
//
//		service.initialize(testUserId1, testPartyCd1, testPlaceCd1);
//		Users myUsers = service.getMyUsers();
//		assertNotNull("ユーザ情報がNullです", myUsers);
//		System.out.println("ログインユーザ:" + myUsers.getName());
//
//		Party myParty = service.getMyParty();
//		assertNotNull("自企業がNullです", myParty);
//		System.out.println("自企業コード:" + myParty.getTdbPartyCode());
//		System.out.println("自企業名:" + myParty.getName());
//
//		Place myPlace = service.getMyPlace();
//		assertNotNull("自工区がNullです", myPlace);
//		System.out.println("自工区コード:" + myPlace.getTdbPlaceCode());
//		System.out.println("自工区名:" + myPlace.getName());
//
//		PartySetting myPartySetting = service.getMyPartySetting();
//		assertNull("自企業設定が存在します", myPartySetting);
//
//		PlaceSetting myPlaceSetting = service.getMyPlaceSetting();
//		assertNull("自工区設定が存在します", myPlaceSetting);
//	}
//
//
//	@Test
//	public void test_LoginInfoExistSetting1() {
//
//		// OTからシングルサインオンで遷移してきた情報でUsersを作成
//		// 自企業設定あり、自工区設定なし
//		String testUserId1 = "sd07";
//		String testPartyCd1 = "T00000002";
//		String testPlaceCd1 = "1";
//
//		service.initialize(testUserId1, testPartyCd1, testPlaceCd1);
//		Users myUsers = service.getMyUsers();
//		assertNotNull("ユーザ情報がNullです", myUsers);
//		System.out.println("ログインユーザ:" + myUsers.getName());
//
//		Party myParty = service.getMyParty();
//		assertNotNull("自企業がNullです", myParty);
//		System.out.println("自企業コード:" + myParty.getTdbPartyCode());
//		System.out.println("自企業名:" + myParty.getName());
//
//		Place myPlace = service.getMyPlace();
//		assertNotNull("自工区がNullです", myPlace);
//		System.out.println("自工区コード:" + myPlace.getTdbPlaceCode());
//		System.out.println("自工区名:" + myPlace.getName());
//
//		PartySetting myPartySetting = service.getMyPartySetting();
//		assertNotNull("自企業設定がNullです", myPartySetting);
//		System.out.println("自企業>社内用コード:" + myPartySetting.getAbbrCode());
//
//		PlaceSetting myPlaceSetting = service.getMyPlaceSetting();
//		assertNull("自工区設定が存在します", myPlaceSetting);
//	}
//
//	@Test
//	public void test_LoginInfoExistSetting2() {
//
//		// OTからシングルサインオンで遷移してきた情報でUsersを作成
//		// 自企業設定あり、自工区設定あり
//		String testUserId1 = "sd07";
//		String testPartyCd1 = "T00000002";
//		String testPlaceCd1 = "2";
//
//		service.initialize(testUserId1, testPartyCd1, testPlaceCd1);
//		Users myUsers = service.getMyUsers();
//		assertNotNull("ユーザ情報がNullです", myUsers);
//		System.out.println("ログインユーザ:" + myUsers.getName());
//
//		Party myParty = service.getMyParty();
//		assertNotNull("自企業がNullです", myParty);
//		System.out.println("自企業コード:" + myParty.getTdbPartyCode());
//		System.out.println("自企業名:" + myParty.getName());
//
//		Place myPlace = service.getMyPlace();
//		assertNotNull("自工区がNullです", myPlace);
//		System.out.println("自工区コード:" + myPlace.getTdbPlaceCode());
//		System.out.println("自工区名:" + myPlace.getName());
//
//		PartySetting myPartySetting = service.getMyPartySetting();
//		assertNotNull("自企業設定がNullです", myPartySetting);
//		System.out.println("自企業>社内用コード:" + myPartySetting.getAbbrCode());
//
//		PlaceSetting myPlaceSetting = service.getMyPlaceSetting();
//		assertNotNull("自工区設定がNullです", myPlaceSetting);
//		System.out.println("自工区>:対象工区" + myPlaceSetting.getPlaceOid());
//		System.out.println("自工区>かんばん発行有無:" + myPlaceSetting.getDocRefIdP02());
//		System.out.println("自工区>帳票発行指示区分:" + myPlaceSetting.getItemP07());
//		System.out.println("自工区>前工程発行パターン:" + myPlaceSetting.getItemBefPattern());
//		System.out.println("自工区>前工程フラグ:" + myPlaceSetting.getBeforeProcessFlag());
//	}
}
