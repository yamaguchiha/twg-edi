package jp.or.twg.twg_edi.common.service;

import java.util.Date;
import java.util.Optional;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.entity.OptionCalendar;
import jp.or.twg.twg_edi.common.entity.OptionCalendarSetting;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.mapper.OptionCalendarDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionCalendarMapper;
import jp.or.twg.twg_edi.common.mapper.OptionCalendarSettingDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionCalendarSettingMapper;
import jp.or.twg.twg_edi.common.utility.NumberUtil;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class OptionCalendarService {

    private final OptionCalendarMapper optionCalendarMapper; 
    private final OptionCalendarSettingMapper optionCalendarSettingMapper; 

// entity.OptionCalendar.java

	/**
	 * カレンダーマスタ情報取得
	 * 
	 * @param oid
	 *            OID
	 * @return カレンダーマスタ情報
	 */
	public OptionCalendar getEntityByOid(Long oid) {
		OptionCalendar entity = null;
		if(NumberUtil.isNullOrNotNaturalNumber(oid)) return entity;
		
		Optional<OptionCalendar> optionCalendar = optionCalendarMapper.selectByPrimaryKey(oid);
		entity = optionCalendar.isEmpty() ? null : optionCalendar.get();
		return entity;
	}
	
	/**
	 * カレンダーマスタ情報取得
	 * 
	 * @param placeSt  納入先事業所
	 * @param calendarNo カレンダーNo
	 * @return カレンダーマスタ情報
	 */
	public OptionCalendar getEntityByCalendarNo(Place placeSt, Integer calendarNo) {
		
		if(calendarNo == null || placeSt == null){
			return null;
		}

		SelectStatementProvider selectStatement = 
				SqlBuilder.select(OptionCalendarMapper.selectList)
						  .from(OptionCalendarDynamicSqlSupport.optionCalendar)
						  .where(OptionCalendarDynamicSqlSupport.placeStOid, SqlBuilder.isEqualTo(placeSt.getOid()))
						  .and(OptionCalendarDynamicSqlSupport.calendarNo, SqlBuilder.isEqualTo(calendarNo))
						  .build()
						  .render(RenderingStrategies.MYBATIS3);
		Optional<OptionCalendar> optionCalendar = this.optionCalendarMapper.selectOne(selectStatement);
		return optionCalendar.isEmpty() ? null : optionCalendar.get();
	}

//	/**
//	 * 指定された年月のカレンダーマスタ（子）情報のリストを取得する
//	 * @param year 指定年
//	 * @param month 指定月
//	 * @return カレンダーマスタ（子）情報のリスト
//	 */
//	public List<OptionCalendarSetting> getCalendarSetting(
//			Integer year, Integer month) {
//
//		Calendar startDate = Calendar.getInstance();
//		startDate.clear();
//		startDate.set(year, month-1, 1);
//		Calendar endDate = (Calendar)startDate.clone();
//		endDate.add(Calendar.MONTH, 1);
//		
//		Extractor ex = new Extractor(OptionCalendarSetting.class);
//		ex.add(Condition.eq(new Property(OptionCalendarSetting.OPTIONCALENDAR + "." + OptionCalendar.OID), getOid()));
//		ex.add(Condition.ge(new Property(OptionCalendarSetting.DATE), startDate.getTime()));
//		ex.add(Condition.lt(new Property(OptionCalendarSetting.DATE), endDate.getTime()));
//		FindResult<OptionCalendarSetting> fr = BasicService.getService().findByExtractorWithCount(ex);
//		
//		return fr.getList();
//	}
//	
//	/**
//	 * カレンダーNoリストを返す<br>
//	 * 納入先事業所情報で絞り込んだカレンダーNoを返す。
//	 * @param loadUserPlace 納入先事業所
//	 * @return カレンダーNoリスト
//	 */
//	public static List<HtmlListItem> getCalendarNoList(Place loadUserPlace) {
//		List<HtmlListItem> calendarNoList = new ArrayList<HtmlListItem>();
//		
//		if(loadUserPlace == null) {
//			return calendarNoList;
//		}
//		
//		Extractor ex = new Extractor(OptionCalendar.class);
//		ex.setDistinct(true);
//
//		// 取得条件
//		// 事業所=自拠点
//		ex.add(Condition.eq(new Property(OptionCalendar.PLACEST), loadUserPlace));
//
//		// 取得対象はカレンダーNoのみ
//		ex.addExtractValue(new ExtractValue(null, new Property(OptionCalendar.class, null, OptionCalendar.CALENDAR_NO)));
//		ex.addOrder(Order.asc(new Property(OptionCalendar.class, null, OptionCalendar.CALENDAR_NO)));
//		// 戻り値１つのため、Entityの指定は不要。
//		ex.setReturnType(Integer.class);
//		List<Integer> ret = BasicService.getService().findByExtractor(ex);
//		for(int calendarNo : ret ) {
//			calendarNoList.add(new HtmlListItem(String.valueOf(calendarNo), String.valueOf(calendarNo)));
//		}
//	    return calendarNoList;
//	}
//	
//	/**
//	 * YYYYMM形式の文字列を作成
//	 *
//	 * @param year 年
//	 * @param month 月
//	 * @return YYYYMMの文字列
//	 */
//	public static String createTargetCalendarMont(Integer year, Integer month) {
//		return String.valueOf(year) + String.format("%02d", month);
//	}
//	
//    /**
//     * カレンダー情報
//    **/
//    private  java.util.Map<java.util.Date,jp.co.gwise.kazura.jama.option.entity.OptionCalendarSetting>   calendarMap;
//    /**
//     * カレンダー情報を取得する
//     * @return カレンダー情報
//    **/
//    public java.util.Map<java.util.Date,jp.co.gwise.kazura.jama.option.entity.OptionCalendarSetting> getCalendarMap() {
//        return this.calendarMap;
//    }
//    /**
//     * カレンダー情報を設定する
//     * @param calenderMap カレンダー情報
//    **/
//    public void setCalendarMap(java.util.Map<java.util.Date,jp.co.gwise.kazura.jama.option.entity.OptionCalendarSetting> calenderMap) {
//        this.calendarMap = calenderMap;
//    }
//    
//    /**
//     *  指定された年月の処理用カレンダーを生成する。<br>
//     *  指定年月の子マスタ情報が存在しない場合は、土日非稼働のカレンダーを生成する。
//     *  
//     * @param calendarOid カレンダーマスタ（親）OID<br>※カレンダーマスタ（親）が存在しない場合は新規に作成
//     * @param targetCalendarMonth YYYYMM形式の文字列
//     * @return 稼働日カレンダー（このクラスのインスタンス）
//     */
//    public static OptionCalendar makeOpCalendar(Long calendarOid, String targetCalendarMonth) {
//    	
//		//カレンダーマスタ情報を生成する。
//		OptionCalendar calendar = getEntityByOid(calendarOid);
//		// 新規で作成する場合
//		if (calendar == null) {
//			calendar = new OptionCalendar();
//		}
//		// データ取得
//		List<OptionCalendarSetting> list = getOptionCalendarSettingList(calendarOid, targetCalendarMonth);
//		
//		// データなし（＝登録なし）の場合は土日非稼働の稼働日カレンダーを作成する。
//		if(list.size() == 0 ) {
//			list = createDefaultCalendarSetting(calendar, targetCalendarMonth);
//		}
//		
//		// 日付とマッピングする
//		for (OptionCalendarSetting entry : list) {
//			calendar.getCalendarMap().put(entry.getDate(), entry);
//		}
//		return calendar;
//    }
//    
//    /**
//     *  指定された年月の処理用カレンダーを生成する。<br>
//     *  指定年月の子マスタ情報が存在しない場合はMapが空で返却される。
//     *  
//     * @param calendarOid カレンダーマスタ（親）OID
//     * @param targetCalendarMonth YYYYMM形式の文字列
//     * @return 稼働日カレンダー（このクラスのインスタンス）
//     */
//    public static OptionCalendar makeOpCalendarNotDefault(Long calendarOid, String targetCalendarMonth) {
//    	
//		//カレンダーマスタ情報を生成する。
//		OptionCalendar calendar = getEntityByOid(calendarOid);
//		if(calendar != null) {
//			// データ取得
//			List<OptionCalendarSetting> list = getOptionCalendarSettingList(calendarOid, targetCalendarMonth);
//			
//			// 日付とマッピングする
//			for (OptionCalendarSetting entry : list) {
//				calendar.getCalendarMap().put(entry.getDate(), entry);
//			}
//		}else{
//			calendar = new OptionCalendar();
//		}
//		return calendar;
//    }
//    
//    /**
//     *  指定年月の稼働日情報リストを取得。
//     *  
//     * @param calendarOid カレンダーマスタ（親）OID
//     * @param targetCalendarMonth YYYYMM形式の文字列
//     * @return 稼働日情報リスト（稼働日カレンダー）
//     */
//    public static List<OptionCalendarSetting> getOptionCalendarSettingList(Long calendarOid, String targetCalendarMonth) {
//    	
//    	Extractor extractor = new Extractor(OptionCalendarSetting.class);
//    	extractor.setDistinct(true);
//    	
//    	// カレンダーマスタ（子）⇔カレンダーマスタ（親）との紐付け
//    	extractor.addInnerJoin(new InnerJoin(new Property(OptionCalendarSetting.class, null, OptionCalendarSetting.OPTIONCALENDAR), new Property(OptionCalendar.class, null, OptionCalendar.OID)));
//    	// 検索条件：カレンダーマスタ（親）OID
//    	extractor.add(Condition.eq(new Property(OptionCalendarSetting.OPTIONCALENDAR + "." + OptionCalendar.OID), calendarOid));
//    	// 検索条件：範囲開始
//    	extractor.add(Condition.ge(new Property(OptionCalendarSetting.DATE), DateUtility.getBeginDate(targetCalendarMonth)));
//    	// 検索条件：範囲終了
//		extractor.add(Condition.lt(new Property(OptionCalendarSetting.DATE), DateUtility.getBeginDate(DateUtility.getNextPeriod(targetCalendarMonth))));
//    	// ソート順
//		extractor.addOrder(Order.asc(new Property(OptionCalendarSetting.DATE)));
//		// データ取得
//		return BasicService.getService().findByExtractor(extractor);
//    }
//    
//    /**
//     * 標準カレンダーの稼働日情報を参照する
//     * @param calendar 親カレンダー （稼働日情報クラスの親カレンダーに設定する）
//     * @param targetCalendarMonth 指定年月（YYYYMM形式）
//     * @return
//     */
//    static List<OptionCalendarSetting> refDefaultCalendarSetting(OptionCalendar calendar,String targetCalendarMonth) {
//    	List<OptionCalendarSetting> calendarList = new ArrayList<OptionCalendarSetting>();
//    	
//    	// 標準カレンダー取得
//    	OptionCalendar defaultCalendar = getEntityByCalendarNo(calendar.getPlaceSt(), DEFAULT_CALENDAR_NO);
//    	// 標準カレンダーが未作成の場合はデフォルト（土日休み）の稼働日カレンダーを返す
//    	if(defaultCalendar == null) {
//    		calendarList = createDefaultCalendarSetting(null, targetCalendarMonth);
//    	}else{
//    		calendarList = OptionCalendar.getOptionCalendarSettingList(defaultCalendar.getOid(), targetCalendarMonth);
//    		/* 指定年月の標準カレンダーの稼働日カレンダーが作成されていない場合は、
//    		 * デフォルト（土日休み）の稼働日カレンダーを返す */
//    		if(calendarList.size() != 0) {
//    			// 参照するだけのため、不要な情報は上書きするする
//    			for(OptionCalendarSetting calendarData : calendarList ) {
//    				calendarData.setOid(null);
//    				calendarData.setOptionCalendar(calendar);
//    			}
//    		}else{
//        		calendarList = createDefaultCalendarSetting(calendar, targetCalendarMonth);
//    		}
//    	}
//    	
//    	return calendarList;
//    }
//    
//    /**
//     *  デフォルト（土日非稼働）の稼働日カレンダーを作成する。
//     *  
//     * @param optionCalendar カレンダーマスタ（親）
//     * @param targetCalendarMonth 対象月（YYYYMM形式の文字列）
//     * @return デフォルトの稼働日カレンダー
//     */
//    public static List<OptionCalendarSetting> createDefaultCalendarSetting(OptionCalendar optionCalendar, String targetCalendarMonth){
//    	List<OptionCalendarSetting> calendarList = new ArrayList<OptionCalendarSetting>();
//    	Calendar cal = Calendar.getInstance();
//    	cal.setTime(DateUtility.getBeginDate(targetCalendarMonth));
//    	int targetMonth = cal.get(Calendar.MONTH);
//    	// 対象月分のデータを設定
//    	do{
//    		OptionCalendarSetting calendar = new OptionCalendarSetting();
//        	calendar.setOptionCalendar(optionCalendar);
//        	calendar.setDate(cal.getTime());
//        	switch(cal.get(Calendar.DAY_OF_WEEK)) {
//        	case Calendar.SATURDAY :
//        	case Calendar.SUNDAY :
//        		calendar.setOperatingInfo(1);
//        		break;
//    		default :
//        		calendar.setOperatingInfo(0);
//        	}
//        	// リストに追加
//        	calendarList.add(calendar);
//        	// 日付をカウントアップ
//        	cal.add(Calendar.DATE, 1);
//    	}while(cal.get(Calendar.MONTH) == targetMonth);
//    	
//    	return calendarList;
//    }
//    
//    /**
//     * 
//     * @param day
//     * @return
//     */
//	public Integer isOperatingKbn(Date day) {
//		return getEntry(day).getOperatingInfo();
//	}
//	
//	/**
//	 * 指定した日付に対する稼働日情報を取得する。<br> 
//	 * このカレンダーに稼働日が存在しない場合、空のOptionCalendarSettingを返す。
//	 * @param day 日付
//	 * @return 指定された日付に対する稼働日情報
//	 */
//	public OptionCalendarSetting getEntry(final Date day) {
//		OptionCalendarSetting op = getCalendarMap().get(day);
//		if(op == null) {
//			op = new OptionCalendarSetting();
//		}
//		return op;
//	}

	// entity.OptionCalendarSetting.java

    /**
     * 指定したユニーク項目に該当するレコードを取得する。<br>
     * もし、指定した情報が存在しない場合は、標準の情報を取得する。<br>
     * ※標準の情報も存在しない場合はあります。
     * 
     * @param calendarOid カレンダマスタ（親）OID
     * @param date 日付
     * @return 該当するレコード
     */
    public OptionCalendarSetting findByUniqueOrStandard(Long calendarOid, Date date) {
     	OptionCalendarSetting entity = findByUnique(calendarOid, date);
    	if (entity == null) {
    		SelectStatementProvider selectStatement = 
    				SqlBuilder.selectDistinct(OptionCalendarSettingMapper.selectList)
    						  .from(OptionCalendarSettingDynamicSqlSupport.optionCalendarSetting)
    						  .join(OptionCalendarDynamicSqlSupport.optionCalendar)
    						  .on(OptionCalendarSettingDynamicSqlSupport.optionCalendarOid, SqlBuilder.equalTo(OptionCalendarDynamicSqlSupport.oid))
    						  .where(OptionCalendarDynamicSqlSupport.calendarNo, SqlBuilder.isEqualTo(OptionCalendar.DEFAULT_CALENDAR_NO))
    						  .and(OptionCalendarSettingDynamicSqlSupport.date, SqlBuilder.isEqualTo(date))
    						  .build()
    						  .render(RenderingStrategies.MYBATIS3);
    		Optional<OptionCalendarSetting> optionCalendarSetting = this.optionCalendarSettingMapper.selectOne(selectStatement);
    		entity = optionCalendarSetting != null ? optionCalendarSetting.get() : null;
		}
    	return entity;
    }
    
    /**
     * 指定したユニーク項目に該当するレコードを取得する。
     * 
     * @param calendarOid カレンダマスタ（親）OID
     * @param date 日付
     * @return 該当するレコード
     */
    public OptionCalendarSetting findByUnique(Long calendarOid, Date date) {
		SelectStatementProvider selectStatement = 
				SqlBuilder.selectDistinct(OptionCalendarSettingMapper.selectList)
						  .from(OptionCalendarSettingDynamicSqlSupport.optionCalendarSetting)
						  .where(OptionCalendarSettingDynamicSqlSupport.optionCalendarOid, SqlBuilder.isEqualTo(calendarOid))
						  .and(OptionCalendarSettingDynamicSqlSupport.date, SqlBuilder.isEqualTo(date))
						  .build()
						  .render(RenderingStrategies.MYBATIS3);
		Optional<OptionCalendarSetting> optionCalendarSetting = this.optionCalendarSettingMapper.selectOne(selectStatement);
    	return optionCalendarSetting != null ? optionCalendarSetting.get() : null;
    }
}
