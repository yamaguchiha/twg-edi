package jp.or.twg.twg_edi.common.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.springtestdbunit.annotation.DatabaseSetup;

import jp.or.twg.base.AbstractDbunitTest;
import jp.or.twg.twg_edi.common.entity.Party;
import jp.or.twg.twg_edi.common.entity.PartySetting;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.PlaceSetting;
import jp.or.twg.twg_edi.common.mapper.PartySettingMapper;

@DatabaseSetup("classpath:META-INF/dbunit/testdata.xlsx")
public class PartyPlaceServiceTest extends AbstractDbunitTest {

	@Autowired
	PartyPlaceService partyPlaceService;

    @Autowired
	PartySettingMapper psMapper;

	@Test
	public void test_getPartyByTdbPartyCode() {
		final String testTdbCode = "T00000001";

		Party party = partyPlaceService.getPartyByTdbCode(testTdbCode);
		System.out.println("TDBコード:" + party.getTdbPartyCode());
		System.out.println("企業名:" + party.getName());
		assertEquals("企業コード（TDBコード）が異なります。", testTdbCode, party.getTdbPartyCode());
		assertEquals("企業名が異なります。", "企業１", party.getName());

		final String testTdbCode2 = "T00000002";

		party = partyPlaceService.getPartyByTdbCode(testTdbCode2);
		System.out.println("TDBコード:" + party.getTdbPartyCode());
		System.out.println("企業名:" + party.getName());
		assertEquals("企業コード（TDBコード）が異なります。", testTdbCode2, party.getTdbPartyCode());
		assertEquals("企業名が異なります。", "企業２", party.getName());

	}

	@Test
	public void test_getPlaceByTdbCodeAndPlaceCode() {
		final String testTdbCode = "T00000001";
		final String testPlaceCode = "2";

		Place place = partyPlaceService.getPlaceByTdbCodeAndPlaceCode(testTdbCode, testPlaceCode);
		System.out.println("工区コード:" + place.getTdbPlaceCode());
		System.out.println("工区名:" + place.getName());
		assertEquals("工区コードが異なります。", testPlaceCode, place.getTdbPlaceCode());
		assertEquals("工区名が異なります。", "工区１－２", place.getName());

	}

	@Test
	public void test_getPlaceByPartyAndPlaceCode() {
		final String testTdbCode = "T00000002";
		final String testPlaceCode = "1";

		Party party = partyPlaceService.getPartyByTdbCode(testTdbCode);
		Place place = partyPlaceService.getPlaceByPartyAndPlaceCode(party, testPlaceCode);
		System.out.println("TDBコード:" + party.getTdbPartyCode());
		System.out.println("企業名:" + party.getName());
		System.out.println("工区コード:" + place.getTdbPlaceCode());
		System.out.println("工区名:" + place.getName());
		assertEquals("企業コード（TDBコード）が異なります。", testTdbCode, party.getTdbPartyCode());
		assertEquals("企業名が異なります。", "企業２", party.getName());
		assertEquals("工区コードが異なります。", testPlaceCode, place.getTdbPlaceCode());
		assertEquals("工区名が異なります。", "工区２－１", place.getName());
	}

	@Test
	public void test_getAllPlaceByTdbPartyCode() {
		final String testTdbCode = "T00000005";

		List<Place> placeList = partyPlaceService.getAllPlaceByTdbPartyCode(testTdbCode);
		System.out.println("placeList.size=" + placeList.size());
		assertEquals("placeの取得件数が異なります。", 5, placeList.size());
		for(Place wkPlace : placeList) {
			System.out.println("tdbPlaceCode=" + wkPlace.getTdbPlaceCode() + ":" + wkPlace.getName());
		}
	}

	@Test
	public void test_getAllPlaceByParty() {
		final String testTdbCode = "T00000005";

		Party party = partyPlaceService.getPartyByTdbCode(testTdbCode);
		List<Place> placeList = partyPlaceService.getAllPlaceByParty(party);
		System.out.println("placeList.size=" + placeList.size());
		assertEquals("placeの取得件数が異なります。", 5, placeList.size());
		for(Place wkPlace : placeList) {
			System.out.println("tdbPlaceCode=" + wkPlace.getTdbPlaceCode() + ":" + wkPlace.getName());
		}
	}

	@Test
	public void test_getPartySetting() {
		final String myTdbCode = "T00000002";
		final String myPlaceCode = "1";
		partyPlaceService.initialize(myTdbCode, myPlaceCode);

		// PartySettingあり
		final String testTdbCode = "T00000003";
		PartySetting setting = partyPlaceService.getPartySetting(testTdbCode);
		assertNotNull("PartySettingが存在しません", setting);
		Party party = partyPlaceService.getPartyByTdbCode(testTdbCode);
		System.out.println("TDBコード:" + party.getTdbPartyCode());
		System.out.println("社内用コード:" + setting.getAbbrCode());

		// PartySettingなし
		final String testTdbCodeNasi = "T00000004";
		setting = partyPlaceService.getPartySetting(testTdbCodeNasi);
		assertNull("PartySettingが存在します", setting);
	}

	@Test
	public void test_getPlaceSetting() {
		final String myTdbCode = "T00000002";
		final String myPlaceCode = "2";
		partyPlaceService.initialize(myTdbCode, myPlaceCode);

		// PlaceSettingあり
		final String testTdbCode = "T00000002";
		final String testPlaceCode = "3";
		PlaceSetting setting = partyPlaceService.getPlaceSetting(testTdbCode, testPlaceCode);
		assertNotNull("PlaceSettingが存在しません", setting);
		System.out.println("DocRefIdP02:" + setting.getDocRefIdP02());
		System.out.println("BeforeProcessFlag:" + setting.getBeforeProcessFlag());

		// PlaceSettingなし
		final String testTdbCodeNasi = "T00000002";
		final String testPlaceCodeNasi = "4";
		setting = partyPlaceService.getPlaceSetting(testTdbCodeNasi, testPlaceCodeNasi);
		assertNull("PlaceSettingが存在します", setting);

		// PlaceSettingなし2
		final String testTdbCodeNasi2 = "T00000002";
		final String testPlaceCodeNasi2 = "1";
		setting = partyPlaceService.getPlaceSetting(testTdbCodeNasi2, testPlaceCodeNasi2);
		assertNull("PlaceSettingが存在します", setting);

		// PlaceSettingなし3
		final String testTdbCodeNasi3 = "T00000001";
		final String testPlaceCodeNasi3 = "1";
		setting = partyPlaceService.getPlaceSetting(testTdbCodeNasi3, testPlaceCodeNasi3);
		assertNull("PlaceSettingが存在します", setting);
	}
}
