package jp.or.twg.twg_edi.common.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/**
 * 日付操作ユーテリティ
 *
 */
public class DateUtility {

	/**
	 * [指定日付]から[指定日分]だけ戻った[日付]を返す
	 * @param tergetDay 指定日付
	 * @param backDays 戻る日数
	 * @return 算出した日付
	 */
	public static Date getDateBack(Date tergetDay, int backDays) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(tergetDay);
		cal.add(Calendar.DAY_OF_MONTH, -1 * backDays);
		return cal.getTime();
	}

	/**
	 * [指定日付]から[指定日分]だけ進んだ[日付]を返す
	 * @param tergetDay 指定日付
	 * @param forwardDays 進む日数
	 * @return 算出した日付
	 */
	public static Date getDateForward(Date tergetDay, int forwardDays) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(tergetDay);
		cal.add(Calendar.DAY_OF_MONTH, 1 * forwardDays);
		return cal.getTime();
	}

	/**
	 * [指定日付]から[指定月分]だけ戻った[日付]を返す
	 * @param tergetDay 指定日付
	 * @param backMonth 戻る月数
	 * @return 算出した日付
	 */
	public static Date getBackMonth(Date tergetDay, int backMonth) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(tergetDay);
		cal.add(Calendar.MONTH, -1 * backMonth);
	    return cal.getTime();
	}

	/**
	 * [指定日付]から[指定月分]だけ進んだ[日付]を返す
	 * @param tergetDay 指定日付
	 * @param forwardMonth 進む月数
	 * @return 算出した日付
	 */
	public static Date getForwardMonth(Date tergetDay, int forwardMonth) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(tergetDay);
		cal.add(Calendar.MONTH, 1 * forwardMonth);
	    return cal.getTime();
	}

	/**
	 * [指定日付]の月の最初の[日付]を返す
	 * @param tergetDay 指定日付
	 * @return 指定日付の月の最初の日付
	 */
	public static Date getFirstDate(Date tergetDay) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(tergetDay);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.getActualMinimum(Calendar.DATE));
	    return cal.getTime();
	}

	/**
	 * [指定日付]の月の最後の[日付]を返す
	 * @param tergetDay 指定日付
	 * @return 指定日付の月の最後の日付
	 */
	public static Date getLastDate(Date tergetDay) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(tergetDay);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.getActualMaximum(Calendar.DATE));
	    return cal.getTime();
	}

	/**
	 * [指定日付]の旬を返す
	 *
	 * @param tergetDay 指定日付
	 * @return 指定日付の旬
	 */
	public static Integer getThreeTimesMonth(Date tergetDay) {
		Integer day = getDay(tergetDay);
		if (day <= 10) {
			return 1;
		}
		if (day <= 20) {
			return 2;
		}
		return 3;
	}

	/**
	 * [指定日付]の旬の最初の[日付]を返す
	 *
	 * @param tergetDay 指定日付
	 * @return 指定日付の旬の最初の日付
	 */
	public static Date getThreeTimesMonthFirstDate(Date tergetDay) {
		Integer firstDay = (getThreeTimesMonth(tergetDay) - 1) * 10 + 1;
		try {
			return getDateFromStringYYYYMMDD(getStringFromDateYYYYMM(tergetDay) + String.format("%02d", firstDay));
		} catch (ParseException e) {
			// ありえない
			return null;
		}
	}

	/**
	 * [指定日付]の旬の最後の[日付]を返す
	 *
	 * @param tergetDay 指定日付
	 * @return 指定日付の旬の最後の日付
	 */
	public static Date getThreeTimesMonthLastDate(Date tergetDay) {
		Integer threeTimesMonth = getThreeTimesMonth(tergetDay);
		if (threeTimesMonth == 3) {
			return getLastDate(tergetDay);
		}
		Integer lastDay = (getThreeTimesMonth(tergetDay) - 1) * 10 + 10;
		try {
			return getDateFromStringYYYYMMDD(getStringFromDateYYYYMM(tergetDay) + String.format("%02d", lastDay));
		} catch (ParseException e) {
			// ありえない
			return null;
		}
	}

	/**
	 * "YYYY/MM/DD"から日付型を返す
	 *
	 * @param YYYYtMMtDD YYYY/MM/DD型の日付文字列
	 * @return 日付
	 * @throws ParseException
	 */
	public static Date getDateFromString(String YYYYtMMtDD) throws ParseException {
		Date resultDate = new SimpleDateFormat("yyyy/MM/dd", Locale.JAPAN).parse(YYYYtMMtDD);

		Calendar cal = Calendar.getInstance();
		cal.setTime(resultDate);

		// 年月日へ分割
		String[] resultDateString = YYYYtMMtDD.split("/", -1);
		if(resultDateString.length != 3) {
			throw new ParseException("", 0);
		}

		try{
			// 年チェック
			if(cal.get(Calendar.YEAR) != Integer.valueOf(resultDateString[0])) {
				throw new ParseException("", 0);
			}

			// 月チェック
			if((cal.get(Calendar.MONTH) + 1) != Integer.valueOf(resultDateString[1])) {
				throw new ParseException("", 0);
			}

			// 日チェック
			if(cal.get(Calendar.DATE) != Integer.valueOf(resultDateString[2])) {
				throw new ParseException("", 0);
			}
		} catch (NumberFormatException e) {
			throw new ParseException("", 0);
		}

		return resultDate;
	}

	/**
	 * "YYYYMMDD"から日付型を返す
	 *
	 * @param YYYYMMDD YYYYMMDD型の日付文字列
	 * @return 日付
	 * @throws ParseException
	 */
	public static Date getDateFromStringYYYYMMDD(String YYYYMMDD) throws ParseException	{
		if (YYYYMMDD == null || YYYYMMDD.length() < 6) {
			return null;
		}

		String dateString = ""
    		+ YYYYMMDD.substring(0,4) +  "/"
    		+ YYYYMMDD.substring(4,6) + "/"
    		+ YYYYMMDD.substring(6)
    		;

		return getDateFromString(dateString);
	}

	/**
	 * 日付型からフォーマットで指定した日付文字列変換する
	 *
	 * @param date 日付
	 * @param format フォーマット
	 * @return 日付文字列
	 */
	public static String getStringFromDate(Date date, String format) {
		if (date == null || CommonDataUtil.isNullOrEmpty(format)) {
			return "";
		}
		return new SimpleDateFormat(format).format(date);
	}

	/**
	 * 日付型から"YYYY/MM/DD"を返す
	 *
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String getStringFromDate(Date date) {
		return getStringFromDate(date, "yyyy/MM/dd");
	}

	/**
	 * 日付型から"MM月DD日"を返す
	 *
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String getStringFromDateMMDDjp(Date date) {
		return getStringFromDate(date, "MM月dd日");
	}

	/**
	 * 日付型から"MM/DD hh:mm"を返す
	 *
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String getStringFromDateMMtDDs00c00jp(Date date) {
		return getStringFromDate(date, "MM/dd hh:mm");
	}

	/**
	 * 日付型から"MMDD"を返す
	 *
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String getStringFromDateMMDD(Date date) {
		return getStringFromDate(date, "MMdd");
	}

	/**
	 * 日付型から"YYYY年MM月DD日"を返す
	 *
	 * @param date
	 * @return 日付文字列
	 */
	public static String getStringFromDateYYYYMMDDjp(Date date) {
		return getStringFromDate(date, "yyyy年MM月dd日");
	}

	/**
	 * 日付型から"YYYYMMDD"を返す
	 *
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String getStringFromDateYYYYMMDD(Date date) {
		return getStringFromDate(date, "yyyyMMdd");
	}

	/**
	 * 日付文字列から"YYYYMMDD"を返す
	 *
	 * @param stringDate 日付文字列
	 * @return 日付文字列
	 */
	public static String getStringFromDateYYYYMMDDByStringDate(String stringDate) {
		final int TARGET_LENGTH = 8;
		if (stringDate != null && stringDate.length() >= TARGET_LENGTH) {
			return stringDate.substring(0, TARGET_LENGTH);
		}
		return null;
	}

	/**
	 * 日付型から"YYYYMM"を返す
	 *
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String getStringFromDateYYYYMM(Date date) {
		return getStringFromDate(date, "yyyyMM");
	}

	/**
	 * 日付文字列から"YYYYMM"を返す
	 *
	 * @param stringDate 日付文字列
	 * @return 日付文字列
	 */
	public static String getStringFromDateYYYYMMByStringDate(String stringDate) {
		final int TARGET_LENGTH = 6;
		if (stringDate != null && stringDate.length() >= TARGET_LENGTH) {
			return stringDate.substring(0, TARGET_LENGTH);
		}
		return null;
	}

	/**
	 * 日付型から"YYYY-MM-DDTHH:MM:SS"を返す
	 *
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String getStringFromDateJamaDocumentDateTime(Date date) {
		String resultDate = getStringFromDate(date, "yyyy-MM-dd");
		return CommonDataUtil.isNullOrEmpty(resultDate) ? null : resultDate + "T" + getStringFromDate(date, "HH:mm:ss");
	}

	/**
	 * 日付型から"YYYYMMDDHHMM"を返す
	 *
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String getStringFromDateYYYYMMDDHHMM(Date date) {
		return getStringFromDate(date, "yyyyMMddHHmm");
	}

	/**
	 * 日付型から"YYYYMMDDHHMMSS"を返す
	 *
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String getStringFromDateYYYYMMDDHHMMSS(Date date) {
		return getStringFromDate(date, "yyyyMMddHHmmss");
	}

	/**
	 * "hhmm"から日付型を返す
	 *
	 * @param hhmm 時分
	 * @return 日付
	 * @throws ParseException
	 */
	public static Date getTimeFromString(String hhmm) throws ParseException {

		if (CommonDataUtil.isNullOrEmpty(hhmm)) {
			return null;
		}

		// 桁数チェック
		if(hhmm.length() != 4) {
			throw new ParseException("", 0);
		}

		// 数値変換チェック
		int hour;
		int minute;
		try {
			hour = Integer.parseInt(hhmm.substring(0, 2));
			minute = Integer.parseInt(hhmm.substring(2, 4));
		} catch(NumberFormatException e) {
			throw new ParseException("", 0);
		}

		SimpleDateFormat df = new SimpleDateFormat("HHmm");
		Date date = df.parse(hhmm);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		// 時チェック
		if(cal.get(Calendar.HOUR_OF_DAY) != hour) {
			throw new ParseException("", 0);
		}

		// 分チェック
		if(cal.get(Calendar.MINUTE) != minute) {
			throw new ParseException("", 0);
		}

		return cal.getTime();
	}

	/**
	 * 指定された日付を00:00:00.000にして返す
	 * @param date
	 * @return 時分秒をリセットした日付
	 */
	public static Date getDateWith0Oclock(Date date)
	{
		try {
			return getDateFromString(getStringFromDate(date));
		} catch (ParseException e) {
			// ありえない
			return null;
		}
	}

	/**
	 * 対象月の開始終了日付クラス
	 */
	public static class PeriodBeginAndLastDate {
		/** 開始日付 */
		private Date beginDate = null;

		/** 終了日付 */
		private Date lastDate = null;

		/**
		 * コンストラクタ
		 *
		 * @param period 年月
		 */
		public PeriodBeginAndLastDate(String period) {

			Date beginDate = DateUtility.getBeginDate(period);
			if(beginDate == null) {
				return;
			}

			this.beginDate = beginDate;
			this.lastDate = DateUtility.getLastDate(beginDate);
		}

		/**
		 * 開始日付取得
		 *
		 * @return 開始日付
		 */
		public Date getBeginDate() {
			if (beginDate == null) {
				return null;
			}
			return (Date)beginDate.clone();
		}

		/**
		 * 終了日付取得
		 *
		 * @return 終了日付
		 */
		public Date getLastDate() {
			if (lastDate == null) {
				return null;
			}
			return (Date)lastDate.clone();
		}

		/**
		 * エラー判定
		 *
		 * @return true : エラー, false : 正常
		 */
		public boolean hasError() {
			return (beginDate == null || lastDate == null);
		}
	}

	/**
	 * 対象月の開始日付取得
	 *
	 * @param period 対象月
	 * @return 開始日付
	 */
	public static Date getBeginDate(String period) {
		try {
			return DateUtility.getDateFromStringYYYYMMDD(period + "01");
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 対象月の次月取得
	 *
	 * @param period 対象月
	 * @return 次月
	 */
	public static String getNextPeriod(String period) {
		Date beginDate = getBeginDate(period);
		if (beginDate == null) {
			return "";
		}
		return DateUtility.getStringFromDateYYYYMM(DateUtility.getForwardMonth(beginDate, 1));
	}

	/**
	 * システム日付の翌月を取得する
	 * @return 次月（yyyyMM）
	 */
	public static String getNextMonthPeriod() {
		return DateUtility.getStringFromDateYYYYMM(DateUtility.getForwardMonth(new Date(), 1));
	}

	/**
	 * 年取得
	 *
	 * @param date 日付・時刻
	 * @return 年
	 */
	public static Integer getYear(Date date) {
		return getDateValue(date, "yyyy");
	}

	/**
	 * 月取得
	 *
	 * @param date 日付・時刻
	 * @return 月
	 */
	public static Integer getMonth(Date date) {
		return getDateValue(date, "MM");
	}

	/**
	 * 日取得
	 *
	 * @param date 日付・時刻
	 * @return 日
	 */
	public static Integer getDay(Date date) {
		return getDateValue(date, "dd");
	}

	/**
	 * 時取得
	 *
	 * @param date 日付・時刻
	 * @return 時
	 */
	public static Integer getHour(Date date) {
		return getDateValue(date, "HH");
	}

	/**
	 * 分取得
	 *
	 * @param date 日付・時刻
	 * @return 分
	 */
	public static Integer getMinute(Date date) {
		return getDateValue(date, "mm");
	}

	/**
	 * 秒取得
	 *
	 * @param date 日付・時刻
	 * @return 秒
	 */
	public static Integer getSecond(Date date) {
		return getDateValue(date, "ss");
	}

	/**
	 * ミリ秒取得
	 *
	 * @param date 日付・時刻
	 * @return ミリ秒
	 */
	public static Integer getMilliSecond(Date date) {
		return getDateValue(date, "SSS");
	}

	/**
	 * 日付時刻数値取得
	 *
	 * @param date 日付・時刻
	 * @param format フォーマット
	 * @return 日付時刻数値
	 */
	public static Integer getDateValue(Date date, String format) {
		if(CommonDataUtil.isNullOrEmpty(format)) {
			throw new RuntimeException("フォーマットが指定されていません");
		}

		if(date == null) {
			return null;
		}
		return Integer.parseInt(new SimpleDateFormat(format).format(date));
	}
}
