package jp.or.twg.twg_edi.kanban.service;


import java.text.MessageFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.entity.OptionCalendar;
import jp.or.twg.twg_edi.common.entity.OptionCalendarSetting;
import jp.or.twg.twg_edi.common.entity.Place;
import jp.or.twg.twg_edi.common.mapper.OptionCalendarDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionCalendarSettingDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionCalendarSettingMapper;
import jp.or.twg.twg_edi.common.model.FixDate;
import jp.or.twg.twg_edi.common.resource.Message;
import jp.or.twg.twg_edi.common.service.OptionCalendarService;
import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.common.utility.DateUtility.PeriodBeginAndLastDate;
import jp.or.twg.twg_edi.kanban.model.OpCalendarForm;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class OpCalendar{

	private final OptionCalendarSettingMapper optionCalendarSettingMapper;

	private final OptionCalendarService optionCalendarService;

	/**
	 * カレンダーを生成する。
	 *
	 * @param toPlace 納入場所
	 * @param fromPlace 出荷場所
	 * @param startDate 開始日付(nullの場合は最初の日付まで取得)
	 * @param endDate 終了日付(nullの場合は最後の日付まで取得)
	 * @param optionCalendar カレンダーマスタ（親）
	 * @param ifOptionThread オプションスレッド
	 * @return 指定された場所に対する稼働日カレンダー（このクラスのインスタンス）
	 */
	public OpCalendarForm makeOpCalender(Place toPlace, Place fromPlace, Date startDate, Date endDate, OptionCalendar optionCalendar) {

		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = 
			SqlBuilder.selectDistinct(OptionCalendarSettingMapper.selectList)
					  .from(OptionCalendarSettingDynamicSqlSupport.optionCalendarSetting)
					  .join(OptionCalendarDynamicSqlSupport.optionCalendar)
					  .on(OptionCalendarSettingDynamicSqlSupport.optionCalendarOid, SqlBuilder.equalTo(OptionCalendarDynamicSqlSupport.oid))
					  .where(OptionCalendarDynamicSqlSupport.oid, SqlBuilder.isEqualTo(optionCalendar.getOid()));
		// 処理日
		if(startDate != null) {
			builder.and(OptionCalendarSettingDynamicSqlSupport.date, SqlBuilder.isGreaterThanOrEqualTo(DateUtility.getDateWith0Oclock(startDate)));
		}
		if(endDate != null) {
			builder.and(OptionCalendarSettingDynamicSqlSupport.date, SqlBuilder.isLessThan(DateUtility.getDateWith0Oclock(DateUtility.getDateForward(endDate, 1))));
		}

		builder.orderBy(SqlBuilder.sortColumn(OptionCalendarSettingDynamicSqlSupport.date.name()));

		SelectStatementProvider selectStatement = builder.build().render(RenderingStrategies.MYBATIS3);
		List<OptionCalendarSetting> list = this.optionCalendarSettingMapper.selectMany(selectStatement);

		// カレンダーマスタ情報（子）より取得した日付にて、計算用のカレンダーを生成する。
		OpCalendarForm calendar = new OpCalendarForm(toPlace, fromPlace);
		
		for (OptionCalendarSetting entity : list) {
			//calendar.addEntity(entity,fromPlace);
			calendar.getCalendarMap().put(entity.getDate(), entity);
		}
		return calendar;
	}

	/**
	 * 指定した日付に対する稼働日カレンダーを取得する。
	 *
	 * このカレンダーに稼働日設定が存在しない場合、親カレンダーの稼働日設定をさかのぼって調べ、
	 * デフォルトカレンダーまでさかのぼっても稼働日設定がない場合はnullを返す。
	 * @param day 日付
	 * @return 指定された日付に対する稼働日カレンダー（このクラスのインスタンス）
	 */
	public OptionCalendarSetting getEntry(OpCalendarForm form, final Date day) {
		OptionCalendarSetting op = form.getCalendarMap().get(day);
		if(op == null) {
			// デフォルトカレンダーまで遡る
			OptionCalendar defaultCalendar = this.optionCalendarService.getEntityByCalendarNo(form.getToPlace(), OptionCalendar.DEFAULT_CALENDAR_NO);
			if(defaultCalendar != null){
				op = makeOpCalender(form.getToPlace(), form.getFromPlace(), day, day, defaultCalendar).getCalendarMap().get(day);
			}
		}
		return op;
	}

	/**
	 * カレンダー情報の再帰構造生成
	 *
	 * 取得した全親のカレンダー情報を再帰的にデータセットする。
	 * @param entity カレンダー情報
	 */
    void addEntity(OpCalendarForm form, OptionCalendarSetting entity, Place fromPlace) {
		if (entity != null) {
			form.getCalendarMap().put(entity.getDate(), entity);
		} else {// デフォルトカレンダーまでさかのぼっても関係のないエントリーの場合->無関係なEntry
			throw new IllegalArgumentException(
					MessageFormat.format("{0}とは関係のない場所:{1}に対する休日設定は登録できません", form.getToPlace(), fromPlace));
		}
	}

	/**
	 * 稼働日かどうかを判定する。(稼動以外は全て非稼動とする）
	 *
	 * 存在しない場合は親カレンダーの設定を引き継ぐ。
	 * どこまでさかのぼっても設定が存在しない場合、その日は稼働日となる。
	 * @param day 判定する日付
	 * @return 判定結果
	 */
	public boolean isOperating(OpCalendarForm form, Date day) {
		return getEntry(form, day).isOperating();
	}

	/**
	 * 稼働日かどうかを判定する。(稼動 OR 非稼動 OR 半稼動 OR 臨時稼動)
	 * 
	 * @param day
	 *            日付
	 * @return 稼動フラグ
	 */
	public String getOperatingKbn(OpCalendarForm form, Date day) {
		if (getEntry(form, day) != null) {
			// 稼働日カレンダーに存在する日付の場合
			return getEntry(form, day).getOperatingInfo().toString();
		} else {
			// 稼働日カレンダーに存在しない日付の場合
			return null;
		}
	}

	/**
	 * 稼働日かどうかを判定する。(稼動 OR 非稼動 OR 半稼動 OR 臨時稼動)
	 *
	 * @param date 文字列型の日付(YYYY/MM/DD)
	 * @return 稼動フラグ
	 * @throws ParseException
	 */
	public String getOperatingKbn(OpCalendarForm form, String date) throws ParseException {
		return getOperatingKbn(form, DateUtility.getDateFromString(date));
	}

	/**
	 * 稼働日日数を取得する。
	 *
	 * @param targetMonth 対象月
	 * @return count 稼働日数
	 */
	public int getOperatingDaysCount(OpCalendarForm form, String targetMonth) {
		PeriodBeginAndLastDate periodDate = new DateUtility.PeriodBeginAndLastDate(targetMonth);
		if (periodDate.hasError()) {
			return 0;
		}
		return getOperatingDaysCount(form, periodDate.getBeginDate(), periodDate.getLastDate());
	}

	/**
	 * 指定期間の稼働日日数を取得する。
	 *
	 * @param fromDate 指定開始日
	 * @param toDate 指定終了日
	 * @return count 稼働日数
	 */
	public int getOperatingDaysCount(OpCalendarForm form, Date fromDate, Date toDate) {
		int count = 0;
		if (fromDate == null || toDate == null) {
			return 0;
		} else if (fromDate.compareTo(toDate) >= 0) {
			return 0;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(fromDate);
		while (cal.getTime().compareTo(toDate) <= 0) {
			if (isOperating(form, cal.getTime())) {
				count++;
			}
			cal.add(Calendar.DATE, 1);
		}
		return count;
	}

	/**
	 * 指定月の稼働割合から求めた稼働日日数を取得する
	 * @throws Exception 
	 */
	public double getOperatingRateSum(OpCalendarForm form, String targetMonth) throws Exception {
		PeriodBeginAndLastDate periodDate = new DateUtility.PeriodBeginAndLastDate(targetMonth);
		if (periodDate.hasError()) {
			return 0;
		}
		return getOperatingRateSum(form, periodDate.getBeginDate(), periodDate.getLastDate());
	}

	/**
	 * 指定期間の稼働割合から求めた稼働日日数を取得する
	 * @param fromDate
	 * @param toDate
	 * @return
	 * @throws Exception 
	 */
	public double getOperatingRateSum(OpCalendarForm form, Date fromDate, Date toDate) throws Exception {
		double count = 0;

		if (fromDate == null || toDate == null || fromDate.compareTo(toDate) >= 0) {
			return 0;
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(fromDate);
		while (cal.getTime().compareTo(toDate) <= 0) {
			count += getOperatingKbnForEnum(form, cal.getTime()).getOperatingRate();
			cal.add(Calendar.DATE, 1);
		}
		return count;
	}

	/**
	 * 指定された日付以降で最も近い稼働日を取得する。
	 * 指定された日付が稼働日の場合、その日付を返す。
	 *
	 * @param day 対象日
	 * @return 以降に稼働日となった日付
	 */
	public Date getNextWorkingDay(OpCalendarForm form, Date day) {
		Date targetday = day;
		while (!isOperating(form, targetday)) {
			targetday = DateUtility.getDateForward(targetday, 1);
		}
		return targetday;
	}

	/**
	 * 指定された日付以前で最も近い稼働日を取得する。
	 * 指定された日付が稼働日の場合、その日付を返す。
	 *
	 * @param day 対象日
	 * @return 以前に稼働日となった日付
	 */
	public Date getBeforeWorkingDay(OpCalendarForm form, Date day) {
		Date targetday = day;
		while (!isOperating(form, targetday)) {
			targetday = DateUtility.getDateBack(targetday, 1);
		}
		return targetday;
	}

	/**
	 * 対象日付をリードタイムの稼動日分戻す
	 * @param targetDate 対象日
	 * @param leadTime リードタイム
	 * @return リードタイム分稼働日を戻った日付
	 */
	public Date getBackOperationDay(OpCalendarForm form, Date targetDate, int leadTime){
		Date retDate = targetDate;
		for (int i=0; i<leadTime; i++){
			retDate = this.getBeforeWorkingDay(form, DateUtility.getDateBack(retDate, 1));
		}
		return retDate;
	}

	/**
	 * 対象日付をリードタイムの稼動日分進める
	 * @param targetDate 対象日
	 * @param leadTime リードタイム
	 * @return リードタイム分稼働日を進んだ日付
	 */
	public Date getNextOperationDay(OpCalendarForm form, Date targetDate, int leadTime){
		Date retDate = targetDate;
		for (int i=0; i<leadTime; i++){
			retDate = this.getNextWorkingDay(form, DateUtility.getDateForward(retDate, 1));
		}
		return retDate;
	}

	/**
	 * 稼働日かどうかを判定する。
	 * 但し、臨時は含まない
	 * 存在しない場合は親カレンダーの設定を引き継ぐ。
	 * どこまでさかのぼっても設定が存在しない場合、その日は稼働日となる。
	 * @param day 判定する日付
	 * @return 判定結果
	 */
	public boolean isOmitTmpOperating(OpCalendarForm form, Date day) {
		if (getEntry(form, day) != null) {
			// 稼働日カレンダーに存在する日付の場合
			return getEntry(form, day).getOperatingKbnForEnum().isOmitTmpOperating();
		} else {
			// 稼働日カレンダーに存在しない日付の場合、稼働日とする。
			return true;
		}
	}

	/**
	 * 指定された日付以降で最も近い稼働日を取得する。
	 * 但し、臨時は含まない
	 *
	 * @param day 対象日
	 * @return 以降に稼働日となった日付
	 */
	public Date getNextOmitTmpWorkingDay(OpCalendarForm form, Date day) {
		Date targetday = day;
		while (!isOmitTmpOperating(form, targetday)) {
			targetday = DateUtility.getDateForward(targetday, 1);
		}
		return targetday;
	}

	/**
	 * 稼動区分を取得
	 *
	 * @param day 日付
	 * @return 稼動区分
	 * @throws Exception 
	 * @throws MessagesIncludingException
	 */
	public OperatingKbn getOperatingKbnForEnum(OpCalendarForm form, Date day) throws Exception {
		OperatingKbn operatingKbn;
		try{
			operatingKbn = getEntry(form, day).getOperatingKbnForEnum();
		}catch(NullPointerException ex){
			//TODO:
			FixDate fixDate = new FixDate(day);
//			ifOptionThread.getErrors().add("",
//					new Message("kazura.jama.option.error.OperatingKbn", "日付："
//							+ fixDate.getStringDate()));
//			throw new MessagesIncludingException(ifOptionThread.getErrors());

			throw new Exception((new Message("twg_edi.option.error.OperatingKbn", "日付：" + fixDate.getStringDate())).toString());
		}catch(Exception ex){
		    throw ex;
		}
		return operatingKbn;
	}

	/**
	 * 指定年月の稼働区分のリストを取得する
	 * @throws Exception 
	 */
	public List<OperatingKbn> getOperatingKbnList(OpCalendarForm form, String targetMonth) throws Exception {
		Date startDate = DateUtility.getBeginDate(targetMonth);
		Date endDate = null;
		if (startDate != null) {
			endDate = DateUtility.getLastDate(startDate);
		}
		return getOperatingKbnList(form, startDate, endDate);
	}

	/**
	 * 指定期間の稼働区分のリストを取得する
	 * @param fromDate
	 * @param toDate
	 * @return
	 * @throws Exception 
	 */
	public List<OperatingKbn> getOperatingKbnList(OpCalendarForm form, Date fromDate, Date toDate) throws Exception {
		List<OperatingKbn> operatingKbnList = new ArrayList<OperatingKbn>();
		if (fromDate == null || toDate == null || fromDate.compareTo(toDate) >= 0) {
			return operatingKbnList;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(fromDate);
		while (cal.getTime().compareTo(toDate) <= 0) {
			operatingKbnList.add(getOperatingKbnForEnum(form, cal.getTime()));
			cal.add(Calendar.DATE, 1);
		}
		return operatingKbnList;
	}
}