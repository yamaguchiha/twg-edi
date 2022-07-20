package jp.or.twg.twg_edi.common.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.or.twg.twg_edi.common.context.ApplicationContextProvider;
import jp.or.twg.twg_edi.common.difinition.MessageTypeCode5Type;
import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.entity.Users;
import jp.or.twg.twg_edi.common.model.UserSession;
import jp.or.twg.twg_edi.common.resource.Messages;
import jp.or.twg.twg_edi.common.service.ItemService;
import jp.or.twg.twg_edi.common.service.PartyPlaceService;
import jp.or.twg.twg_edi.common.utility.CommonDataUtil;
import jp.or.twg.twg_edi.common.utility.StringUtility;

public class BaseController {

	@Autowired
	protected PartyPlaceService partyPlaceService;

	/**
	 * メッセージ
	 **/
	private Messages messages;

	public Messages getMessages() {
		if(messages == null) {
			messages = new Messages();
		}
		return this.messages;
	}

	public void setMessages(Messages messages) {
		this.messages = messages;
	}

	public void clearMessages() {
		this.messages = new Messages();
	}

	/**
	 * エラーメッセージ
	 **/
	private Messages errors;

	public Messages getErrors() {
		if(errors == null) {
			errors = new Messages();
		}
		return this.errors;
	}

	public void setErrors(Messages errors) {
		this.errors = errors;
	}

	public void clearErrors() {
		this.errors = new Messages();
	}

	/**
	 * 警告メッセージ
	 **/
	private Messages warnings;

	public Messages getWarnings() {
		if(warnings == null) {
			warnings = new Messages();
		}
		return this.warnings;
	}

	public void setWarnings(Messages warnings) {
		this.warnings = warnings;
	}

	public void clearWarnings() {
		this.warnings = new Messages();
	}

	/**
	 * ユーザセッション情報を返す
	 *
	 * @return
	 */
	public UserSession getUserSession() {
    	Object obj = RequestContextHolder.getRequestAttributes().getAttribute("session", RequestAttributes.SCOPE_SESSION);
    	if(obj instanceof UserSession) {
    		return (UserSession)obj;
    	} else {
    		return null;
    	}

	}

	/**
	 * Ajax 企業工区選択　一覧取得
	 *
	 * @param jsondata
	 * @return
	 */
	public Map<String, String>[] setSelectPlaceBox(String jsondata) {
		return setSelectPlaceBoxLimit(false, jsondata);
	}


	/**
	 * 場所マップ配列キー
	 */
	public static interface PlaceListByJsonMapKey {
		/** 企業コード */		public static final String partyCode		= "partyCode";
		/** 社内用企業コード */	public static final String partyAbbrCode	= "partyAbbrCode";
		/** 企業名 */			public static final String partyName		= "partyName";
		/** 場所コード */		public static final String placeCdInfo		= "placeCdInfo";
		/** 場所名 */			public static final String placeName		= "placeName";
	}

	/**
	 * Ajax 企業工区選択　一覧取得（期限あり:現在日で終了していないもの）
	 *
	 * @param isLimit
	 * @param jsondata
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Map<String, String>[] setSelectPlaceBoxLimit(boolean isLimit, String jsondata) {
		ObjectMapper mapper = new ObjectMapper();
		String srhSelectPartyCode = null;
		String srhSelectPartyAbbrCode = null;
		String srhSelectPartyName = null;

		try {
			JsonNode root = mapper.readTree(jsondata);
			srhSelectPartyCode = root.get("srhSelectPartyCode") != null ? root.get("srhSelectPartyCode").textValue() : null;
			srhSelectPartyAbbrCode = root.get("srhSelectPartyAbbrCode") != null ? root.get("srhSelectPartyAbbrCode").textValue() : null;
			srhSelectPartyName = root.get("srhSelectPartyName") != null ? root.get("srhSelectPartyName").textValue() : null;

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

    	PartyPlaceService service = ApplicationContextProvider.getBean(PartyPlaceService.class);
    	List<Place> searchPlaces = service.getSelectPlaceList(isLimit, getUserSession().getMyPlace().getOid(), srhSelectPartyCode, srhSelectPartyAbbrCode, srhSelectPartyName);

		List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
		for (Place place : searchPlaces) {
			Map<String, String> map = new HashMap<String, String>();

			map.put(PlaceListByJsonMapKey.partyCode, CommonDataUtil.nz(place.getParty().getTdbPartyCode()));
			map.put(PlaceListByJsonMapKey.partyAbbrCode, CommonDataUtil.nz(place.getPartySetting() != null ? place.getPartySetting().getAbbrCode() : null));
			map.put(PlaceListByJsonMapKey.partyName, CommonDataUtil.nz(place.getParty().getName()));
			map.put(PlaceListByJsonMapKey.placeCdInfo, CommonDataUtil.nz(place.getTdbPlaceCode()));
			map.put(PlaceListByJsonMapKey.placeName, CommonDataUtil.nz(place.getName()));
			mapList.add(map);
		}
		return mapList.toArray(new Map[0]);
	}

	/**
	 * 部品・製品マップ配列キー
	 */
	static interface ItemListByJsonMapKey {
		/** ID */					public static final String itemOid				= "itemOid";
		/** 背番号 */				public static final String itemAbbrName			= "itemAbbrName";
		/** 品番 */					public static final String ItemCode				= "itemCode";
		/** 出荷元 */				public static final String partyCodeSf			= "partyCodeSf";
		/** 出荷元工区 */			public static final String placeCodeSf			= "placeCodeSf";
		/** 部品取扱識別 */			public static final String itemE18				= "itemE18";
		/** 有効期限開始日*/		public static final String startDate			= "startDate";
		/** 有効期限終了日*/		public static final String endDate				= "endDate";
		/** 情報区分コード5桁目*/	public static final String messageTypeCode5	= "messageTypeCode5";
	}

	/**
	 * 品番選択
	 *   使用箇所
	 *     かんばん増減追加
	 * @param jsondata
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String setSelectItemBox(String jsondata) {
		ObjectMapper mapper = new ObjectMapper();
		String srhSelectitemAbbrName = null;
		String srhSelectitemCode = null;
		String srhSelectPartyCodeSf = null;
		String srhSelectPlaceCodeSf = null;
		String srhSelectitemE18   = null;

		try {
			JsonNode root = mapper.readTree(jsondata);
			srhSelectitemAbbrName = root.get("srhSelectitemAbbrName") != null ? root.get("srhSelectitemAbbrName").textValue() : null;
			srhSelectitemCode = root.get("srhSelectitemCode") != null ? root.get("srhSelectitemCode").textValue() : null;
			srhSelectPartyCodeSf = root.get("srhSelectPartyCodeSf") != null ? root.get("srhSelectPartyCodeSf").textValue() : null;
			srhSelectPlaceCodeSf = root.get("srhSelectPlaceCodeSf") != null ? root.get("srhSelectPlaceCodeSf").textValue() : null;
			srhSelectitemE18 = root.get("srhSelectitemE18") != null ? root.get("srhSelectitemE18").textValue() : null;

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		// 発注者（自社工区）
		UserSession userSession = getUserSession();
		if(userSession == null) {
			return null;
		}
		Place myPlace = userSession.getMyPlace();

		// 品番サービスから該当データを取得
		ItemService itemService = ApplicationContextProvider.getBean(ItemService.class);
		List<Item> searchItems = itemService.getSelectItemList(srhSelectitemAbbrName, srhSelectitemCode, srhSelectitemE18, srhSelectPartyCodeSf, srhSelectPlaceCodeSf, myPlace.getOid());

		List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
		for (Item item : searchItems) {
			Map<String, String> map = new HashMap<String, String>();

			map.put(ItemListByJsonMapKey.itemOid, CommonDataUtil.nz(item.getOid()));
			map.put(ItemListByJsonMapKey.itemAbbrName, CommonDataUtil.nz(item.getItemE04()));
			map.put(ItemListByJsonMapKey.ItemCode, CommonDataUtil.nz(item.getItemIdIn()));
			map.put(ItemListByJsonMapKey.itemE18, CommonDataUtil.nz(item.getItemE18()));
			map.put(ItemListByJsonMapKey.startDate, StringUtility.formatDateYYYYMMDD(CommonDataUtil.nz(item.getValidStartStringDate())));
			map.put(ItemListByJsonMapKey.endDate, StringUtility.formatDateYYYYMMDDOrINFINITY(CommonDataUtil.nz(item.getValidEndStringDate())));
			map.put(ItemListByJsonMapKey.messageTypeCode5, MessageTypeCode5Type.getType(CommonDataUtil.nz(item.getMessageTypeCode5())).getShortName());

			String partyCdoe = CommonDataUtil.nz(item.getParty() != null ? item.getParty().getTdbPartyCode() : null);
			String abbrCdoe = CommonDataUtil.nz(item.getPartySetting() != null ? item.getPartySetting().getAbbrCode() : null);
			if(CommonDataUtil.isNullOrEmpty(abbrCdoe)) {
				map.put(ItemListByJsonMapKey.partyCodeSf, partyCdoe);
			} else {
				map.put(ItemListByJsonMapKey.partyCodeSf, abbrCdoe);
			}
			map.put(ItemListByJsonMapKey.placeCodeSf, CommonDataUtil.nz(item.getPlace() != null ? item.getPlace().getTdbPlaceCode() : null));
			mapList.add(map);
		}
		Map<String, String>[] mapArray = mapList.toArray(new Map[0]);

		// 件数データを追加
		Map<String, String> countmap = new HashMap<String, String>();
		countmap.put("count", String.valueOf(searchItems.size()));

		Map<String, String>[] mapArrayWithCount = new Map[mapArray.length + 1];
		mapArrayWithCount[0] = countmap; // 先頭に追加
		System.arraycopy(mapArray, 0, mapArrayWithCount, 1, mapArray.length);

		try {
			// JSON形式に変換
			return mapper.writeValueAsString(mapArrayWithCount);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ページサイズ変更用リスト
	 *
	 * @return
	 */
	protected Map<String,String> getPageSizeList() {
		Map<String, String> pageSizeList = new LinkedHashMap<String, String>();
//		pageSizeList.put("1", "1");		// test
//		pageSizeList.put("2", "2");		// test
//		pageSizeList.put("3", "3");		// test
		pageSizeList.put("5", "5");
		pageSizeList.put("10", "10");
		pageSizeList.put("20", "20");
		pageSizeList.put("50", "50");
		pageSizeList.put("100", "100");

		return pageSizeList;
	}

	/**
	 * 利用可能事象所をコードから名称に変更
	 * @param list
	 */
	protected void editEnabledPlaceForPager(Page<Users> list) {
		for(Users users : list) {
			StringBuffer sb = new StringBuffer();
			Long defaultOid = users.getDefaultPlaceOid();
			int all = users.getEnabledPlaceOidValues().split(",").length;
			int cnt = 0;
			for(String placeOidVal : users.getEnabledPlaceOidValues().split(",")) {
				Place place = partyPlaceService.getPlace(Long.valueOf(placeOidVal));
				cnt++;
				if(defaultOid.longValue() == Long.valueOf(placeOidVal).longValue()) {
					sb.append("<B>");
					sb.append(place.getName());
					sb.append("</B>");
				} else {
					sb.append(place.getName());
				}
				if(cnt < all) {
					sb.append(",");
				}
			}
			users.setEnabledPlaceOidValues(sb.toString());
		}
	}

}
