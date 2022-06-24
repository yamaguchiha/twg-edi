package jp.or.twg.twg_edi.common.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jp.or.twg.twg_edi.common.utility.DateUtility.PeriodBeginAndLastDate;
import junit.framework.TestCase;

public class DateUtilityTest extends TestCase {

	/**
	 * コンストラクタ
	 * このクラスはすべて静的メソッドだが、Coverage Reportで未テストクラスとして扱われるため、生成できることも確認する。
	 */
	public void test_DateUtility() {
		DateUtility cls = null;
		cls = new DateUtility();
		assertNotNull("クラスが生成されていません", cls);
	}

	/**
	 * [指定日付]から[指定日分]だけ戻った[日付]を返す
	 * @throws ParseException
	 */
	public void test_getDateBack() throws ParseException {
		Date testDate;

		testDate = DateUtility.getDateFromStringYYYYMMDD("20100301");
		assertEquals("処理結果が違います", "20100228", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateBack(testDate, 1)));
		assertEquals("処理結果が違います", "20100227", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateBack(testDate, 2)));

		testDate = DateUtility.getDateFromStringYYYYMMDD("20120301");
		assertEquals("処理結果が違います", "20120229", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateBack(testDate, 1)));
		assertEquals("処理結果が違います", "20120228", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateBack(testDate, 2)));

		testDate = DateUtility.getDateFromStringYYYYMMDD("20000101");
		assertEquals("処理結果が違います", "19991231", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateBack(testDate, 1)));
		assertEquals("処理結果が違います", "19991230", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateBack(testDate, 2)));
	}

	/**
	 * [指定日付]から[指定日分]だけ進んだ[日付]を返す
	 * @throws ParseException
	 */
	public void test_getDateForward() throws ParseException {
		Date testDate;

		testDate = DateUtility.getDateFromStringYYYYMMDD("20100228");
		assertEquals("処理結果が違います", "20100301", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateForward(testDate, 1)));
		assertEquals("処理結果が違います", "20100302", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateForward(testDate, 2)));

		testDate = DateUtility.getDateFromStringYYYYMMDD("20120228");
		assertEquals("処理結果が違います", "20120229", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateForward(testDate, 1)));
		assertEquals("処理結果が違います", "20120301", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateForward(testDate, 2)));

		testDate = DateUtility.getDateFromStringYYYYMMDD("19991231");
		assertEquals("処理結果が違います", "20000101", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateForward(testDate, 1)));
		assertEquals("処理結果が違います", "20000102", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getDateForward(testDate, 2)));
	}

	/**
	 * [指定日付]から[指定月分]だけ戻った[日付]を返す
	 * @throws ParseException
	 */
	public void test_getBackMonth() throws ParseException {
		Date testDate;

		testDate = DateUtility.getDateFromStringYYYYMMDD("20100301");
		assertEquals("処理結果が違います", "20100201", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getBackMonth(testDate, 1)));
		assertEquals("処理結果が違います", "20100101", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getBackMonth(testDate, 2)));

		testDate = DateUtility.getDateFromStringYYYYMMDD("20120301");
		assertEquals("処理結果が違います", "20120201", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getBackMonth(testDate, 1)));
		assertEquals("処理結果が違います", "20120101", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getBackMonth(testDate, 2)));

		testDate = DateUtility.getDateFromStringYYYYMMDD("20000101");
		assertEquals("処理結果が違います", "19991201", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getBackMonth(testDate, 1)));
		assertEquals("処理結果が違います", "19991101", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getBackMonth(testDate, 2)));

	}

	/**
	 * [指定日付]から[指定月分]だけ進んだ[日付]を返す
	 * @throws ParseException
	 */
	public void test_getForwardMonth() throws ParseException {
		Date testDate;

		testDate = DateUtility.getDateFromStringYYYYMMDD("20100228");
		assertEquals("処理結果が違います", "20100328", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getForwardMonth(testDate, 1)));
		assertEquals("処理結果が違います", "20100428", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getForwardMonth(testDate, 2)));

		testDate = DateUtility.getDateFromStringYYYYMMDD("20120228");
		assertEquals("処理結果が違います", "20120328", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getForwardMonth(testDate, 1)));
		assertEquals("処理結果が違います", "20120428", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getForwardMonth(testDate, 2)));

		testDate = DateUtility.getDateFromStringYYYYMMDD("19991231");
		assertEquals("処理結果が違います", "20000131", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getForwardMonth(testDate, 1)));
		assertEquals("処理結果が違います", "20000229", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getForwardMonth(testDate, 2)));
	}

	/**
	 * [指定日付]の月の最後の[日付]を返す
	 * @throws ParseException
	 */
	public void test_getFirstDate() throws ParseException {
		assertEquals("処理結果が違います", "20000201", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getFirstDate(DateUtility.getDateFromStringYYYYMMDD("20000201"))));
		assertEquals("処理結果が違います", "20000201", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getFirstDate(DateUtility.getDateFromStringYYYYMMDD("20000229"))));
	}

	/**
	 * [指定日付]の月の最後の[日付]を返す
	 * @throws ParseException
	 */
	public void test_getLastDate() throws ParseException {
		assertEquals("処理結果が違います", "20000229", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20000201"))));

		assertEquals("処理結果が違います", "20100131", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20100101"))));
		assertEquals("処理結果が違います", "20100228", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20100201"))));
		assertEquals("処理結果が違います", "20100331", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20100301"))));
		assertEquals("処理結果が違います", "20100430", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20100401"))));
		assertEquals("処理結果が違います", "20100531", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20100501"))));
		assertEquals("処理結果が違います", "20100630", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20100601"))));
		assertEquals("処理結果が違います", "20100731", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20100701"))));
		assertEquals("処理結果が違います", "20100831", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20100801"))));
		assertEquals("処理結果が違います", "20100930", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20100901"))));
		assertEquals("処理結果が違います", "20101031", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20101001"))));
		assertEquals("処理結果が違います", "20101130", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20101101"))));
		assertEquals("処理結果が違います", "20101231", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20101201"))));

		assertEquals("処理結果が違います", "20120229", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getLastDate(DateUtility.getDateFromStringYYYYMMDD("20120201"))));
	}

	/**
	 * [指定日付]の旬を返す
	 * @throws ParseException
	 */
	public void test_getThreeTimesMonth() throws ParseException {
		for (int day = 1; day < 10; day++) {
			assertEquals("上旬となっていません", Integer.valueOf(1), DateUtility.getThreeTimesMonth(DateUtility.getDateFromStringYYYYMMDD("201112" + String.format("%02d", day))));
		}
		for (int day = 11; day < 20; day++) {
			assertEquals("中旬となっていません", Integer.valueOf(2), DateUtility.getThreeTimesMonth(DateUtility.getDateFromStringYYYYMMDD("201112" + String.format("%02d", day))));
		}
		for (int day = 21; day < 31; day++) {
			assertEquals("下旬となっていません", Integer.valueOf(3), DateUtility.getThreeTimesMonth(DateUtility.getDateFromStringYYYYMMDD("201112" + String.format("%02d", day))));
		}
	}

	/**
	 * [指定日付]の旬の最初の[日付]を返す
	 * @throws ParseException
	 */
	public void test_getThreeTimesMonthFirstDate() throws ParseException {
		for (int day = 1; day < 10; day++) {
			assertEquals("上旬の最初の日となっていません", "20111201", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getThreeTimesMonthFirstDate(DateUtility.getDateFromStringYYYYMMDD("201112" + String.format("%02d", day)))));
		}
		for (int day = 11; day < 20; day++) {
			assertEquals("中旬の最初の日となっていません", "20111211", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getThreeTimesMonthFirstDate(DateUtility.getDateFromStringYYYYMMDD("201112" + String.format("%02d", day)))));
		}
		for (int day = 21; day < 31; day++) {
			assertEquals("下旬の最初の日となっていません", "20111221", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getThreeTimesMonthFirstDate(DateUtility.getDateFromStringYYYYMMDD("201112" + String.format("%02d", day)))));
		}
	}

	/**
	 * [指定日付]の旬の最後の[日付]を返す
	 * @throws ParseException
	 */
	public void test_getThreeTimesMonthLastDate() throws ParseException {
		for (int day = 1; day < 10; day++) {
			assertEquals("上旬の最後の日となっていません", "20111210", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getThreeTimesMonthLastDate(DateUtility.getDateFromStringYYYYMMDD("201112" + String.format("%02d", day)))));
		}
		for (int day = 11; day < 20; day++) {
			assertEquals("中旬の最後の日となっていません", "20111220", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getThreeTimesMonthLastDate(DateUtility.getDateFromStringYYYYMMDD("201112" + String.format("%02d", day)))));
		}
		for (int day = 21; day < 31; day++) {
			assertEquals("下旬の最後の日となっていません", "20111231", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getThreeTimesMonthLastDate(DateUtility.getDateFromStringYYYYMMDD("201112" + String.format("%02d", day)))));
		}

		for (int day = 21; day < 28; day++) {
			assertEquals("下旬の最後の日となっていません", "20110228", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getThreeTimesMonthLastDate(DateUtility.getDateFromStringYYYYMMDD("201102" + String.format("%02d", day)))));
		}

		for (int day = 21; day < 30; day++) {
			assertEquals("下旬の最後の日となっていません", "20110430", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getThreeTimesMonthLastDate(DateUtility.getDateFromStringYYYYMMDD("201104" + String.format("%02d", day)))));
		}

		for (int day = 21; day < 29; day++) {
			assertEquals("下旬の最後の日となっていません", "20120229", DateUtility.getStringFromDateYYYYMMDD(DateUtility.getThreeTimesMonthLastDate(DateUtility.getDateFromStringYYYYMMDD("201202" + String.format("%02d", day)))));
		}
	}

	/**
	 * "YYYY/MM/DD"から日付型を返す(フォーマット異常)
	 */
	public void test_getDateFromString_フォーマット異常() {
		// フォーマット異常
		try {
			DateUtility.getDateFromString("2009/00/01/");
			fail("例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}
	}

	/**
	 * "YYYY/MM/DD"から日付型を返す(年異常)
	 */
	public void test_getDateFromString_年異常() {
		// 年異常
		try {
			DateUtility.getDateFromString("200a/00/01");
			fail("例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}
	}

	/**
	 * "YYYY/MM/DD"から日付型を返す(月異常)
	 */
	public void test_getDateFromString_月異常() {
		// 月異常(数値以外)
		try {
			DateUtility.getDateFromString("2009/0a/01");
			fail("例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 月異常(範囲外(未満))
		try {
			DateUtility.getDateFromString("2009/00/01");
			fail("例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 月異常(範囲外(過剰))
		try {
			DateUtility.getDateFromString("2009/13/01");
			fail("例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}
	}

	/**
	 * "YYYY/MM/DD"から日付型を返す(日異常)
	 */
	public void test_getDateFromString_日異常() {
		// 日異常(数値以外)
		try {
			DateUtility.getDateFromString("2009/01/0a");
			fail("例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 日異常(数値以外)
		try {
			DateUtility.getDateFromString("2010/11/19a");
			fail("例外が発生しませんでした [NumberFormatException]");
		} catch (ParseException e) {
			// 正常
		}

		// 日異常(範囲外(未満))
		try {
			DateUtility.getDateFromString("2009/01/00");
			fail("例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 日異常(範囲外(過剰))
		try {
			DateUtility.getDateFromString("2009/01/32");
			fail("例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}
	}

	/**
	 * "YYYY/MM/DD"から日付型を返す(日付範囲異常)
	 */
	public void test_getDateFromString_日付範囲異常() {

		// 日付範囲異常
		try {
			DateUtility.getDateFromString("2009/02/29");
			fail("例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}
	}

	/**
	 * "YYYY/MM/DD"から日付型を返す(正常)
	 */
	public void test_getDateFromString_正常() {

		Date result;

		// 正常
		try {
			result = DateUtility.getDateFromString("2009/01/31");
			assertEquals("日付が違います", "20090131", DateUtility.getStringFromDateYYYYMMDD(result));
		} catch (ParseException e) {
			fail("例外が発生しました");
		}

		// 正常
		try {
			result = DateUtility.getDateFromString("2009/1/3");
			assertEquals("日付が違います", "20090103", DateUtility.getStringFromDateYYYYMMDD(result));
		} catch (ParseException e) {
			fail("例外が発生しました");
		}
	}

	/**
	 * "YYYYMMDD"から日付型を返す
	 * @throws ParseException
	 */
	public void test_getDateFromStringYYYYMMDD() throws ParseException {

		Date result;

		// null
		result = DateUtility.getDateFromStringYYYYMMDD(null);
		assertNull("日付が取得されています", result);

		// 6桁未満
		result = DateUtility.getDateFromStringYYYYMMDD("20100");
		assertNull("日付が取得されています", result);

		// 日付異常
		try {
			result = DateUtility.getDateFromStringYYYYMMDD("20101301");
			fail("例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 正常
		result = DateUtility.getDateFromStringYYYYMMDD("20100526");
		assertEquals("日付が違います", "20100526", DateUtility.getStringFromDateYYYYMMDD(result));
	}

	/**
	 * 日付型からフォーマットで指定した日付文字列変換する
	 */
	public void test_getStringFromDate_フォーマット() throws ParseException {

		Date testData = DateUtility.getDateFromString("2009/07/01");

		// 日付null値
		assertEquals("日付null値の処理結果が違います", "", DateUtility.getStringFromDate(null, "yyyy/MM/dd"));

		// フォーマットnull値
		assertEquals("フォーマットnull値の処理結果が違います", "", DateUtility.getStringFromDate(testData, null));

		// 正常
		assertEquals("正常時の処理結果が違います", "2009/07/01", DateUtility.getStringFromDate(testData, "yyyy/MM/dd"));
	}

	/**
	 * 日付型から"YYYY/MM/DD"を返す
	 */
	public void test_getStringFromDate() throws ParseException {

		// 日付null値
		assertEquals("日付null値の処理結果が違います", "", DateUtility.getStringFromDate(null));

		// 正常
		Date testData = DateUtility.getDateFromString("2009/07/01");
		assertEquals("正常時の処理結果が違います", "2009/07/01", DateUtility.getStringFromDate(testData));
	}

	/**
	 * 日付型から"MM月DD日"を返す
	 * @throws ParseException
	 */
	public void test_getStringFromDateMMDDjp() throws ParseException {
		// 日付null値
		assertEquals("日付null値の処理結果が違います", "", DateUtility.getStringFromDateMMDDjp(null));

		// 正常
		Date testData = DateUtility.getDateFromString("2009/07/01");
		assertEquals("正常時の処理結果が違います", "07月01日", DateUtility.getStringFromDateMMDDjp(testData));
	}

	/**
	 * 日付型から"MM/DD hh:mm"を返す
	 */
	public void test_getStringFromDateMMtDDs00c00jp() throws ParseException {
		// 日付null値
		assertEquals("日付null値の処理結果が違います", "", DateUtility.getStringFromDateMMtDDs00c00jp(null));

		// 正常
		Date testData = DateUtility.getDateFromString("2009/07/01");
		assertEquals("正常時の処理結果が違います", "07/01 12:00", DateUtility.getStringFromDateMMtDDs00c00jp(testData));
	}

	/**
	 * 日付型から"MMDD"を返す
	 */
	public void test_getStringFromDateMMDD() throws ParseException {
		// 日付null値
		assertEquals("日付null値の処理結果が違います", "", DateUtility.getStringFromDateMMDD(null));

		// 正常
		Date testData = DateUtility.getDateFromString("2009/07/01");
		assertEquals("正常時の処理結果が違います", "0701", DateUtility.getStringFromDateMMDD(testData));
	}

	/**
	 * 日付型から"YYYY年MM月DD日"を返す
	 */
	public void test_getStringFromDateYYYYMMDDjp() throws ParseException {
		// 日付null値
		assertEquals("日付null値の処理結果が違います", "", DateUtility.getStringFromDateYYYYMMDDjp(null));

		// 正常
		Date testData = DateUtility.getDateFromString("2009/07/01");
		assertEquals("正常時の処理結果が違います", "2009年07月01日", DateUtility.getStringFromDateYYYYMMDDjp(testData));
	}

	/**
	 * 日付型から"YYYYMMDD"を返す
	 */
	public void test_getStringFromDateYYYYMMDD() throws ParseException {
		// 日付null値
		assertEquals("日付null値の処理結果が違います", "", DateUtility.getStringFromDateYYYYMMDD(null));

		// 正常
		Date testData = DateUtility.getDateFromString("2009/07/01");
		assertEquals("正常時の処理結果が違います", "20090701", DateUtility.getStringFromDateYYYYMMDD(testData));
	}

	/**
	 * 日付文字列から"YYYYMMDD"を返す
	 */
	public void test_getStringFromDateYYYYMMDDByStringDate() {
		final String TEST_STRING_DATE = "20120612";

		// null
		assertNull("値が取得されています", DateUtility.getStringFromDateYYYYMMDDByStringDate(null));

		// 桁数不足
		assertNull("値が取得されています", DateUtility.getStringFromDateYYYYMMDDByStringDate(TEST_STRING_DATE.substring(1)));

		// 桁数一致
		assertEquals("値が違います", TEST_STRING_DATE, DateUtility.getStringFromDateYYYYMMDDByStringDate(TEST_STRING_DATE));

		// 桁数超過
		assertEquals("値が違います", TEST_STRING_DATE, DateUtility.getStringFromDateYYYYMMDDByStringDate(TEST_STRING_DATE + "1"));
	}

	/**
	 * 日付型から"YYYYMM"を返す
	 */
	public void test_getStringFromDateYYYYMM() throws ParseException {

		// null値
		assertEquals("日付null値の処理結果が違います", "", DateUtility.getStringFromDateYYYYMM(null));

		// 正常
		Date testData = DateUtility.getDateFromString("2009/07/01");
		assertEquals("正常時の処理結果が違います", "200907", DateUtility.getStringFromDateYYYYMM(testData));
	}

	/**
	 * 日付文字列から"YYYYMM"を返す
	 */
	public void test_getStringFromDateYYYYMMByStringDate() {
		final String TEST_STRING_DATE = "201206";

		// null
		assertNull("値が取得されています", DateUtility.getStringFromDateYYYYMMByStringDate(null));

		// 桁数不足
		assertNull("値が取得されています", DateUtility.getStringFromDateYYYYMMByStringDate(TEST_STRING_DATE.substring(1)));

		// 桁数一致
		assertEquals("値が違います", TEST_STRING_DATE, DateUtility.getStringFromDateYYYYMMByStringDate(TEST_STRING_DATE));

		// 桁数超過
		assertEquals("値が違います", TEST_STRING_DATE, DateUtility.getStringFromDateYYYYMMByStringDate(TEST_STRING_DATE + "1"));
	}

	/**
	 * 日付型から"YYYY-MM-DDTHH:MM:SS"を返す
	 */
	public void test_getStringFromDateJamaDocumentDateTime() {

		// null値
		assertNull("日付null値の処理結果が違います", DateUtility.getStringFromDateJamaDocumentDateTime(null));

		// 正常
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2012);
		cal.set(Calendar.MONTH, 4 - 1);
		cal.set(Calendar.DATE, 1);
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.MINUTE, 12);
		cal.set(Calendar.SECOND, 34);
		cal.set(Calendar.MILLISECOND, 56);
		assertEquals("正常時の処理結果が違います", "2012-04-01T18:12:34", DateUtility.getStringFromDateJamaDocumentDateTime(cal.getTime()));
	}

	/**
	 * 日付型から"YYYYMMDDHHMM"を返す
	 */
	public void test_getStringFromDateYYYYMMDDHHMM() {

		// null値
		assertEquals("日付null値の処理結果が違います", "", DateUtility.getStringFromDateYYYYMMDDHHMM(null));

		// 正常
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2012);
		cal.set(Calendar.MONTH, 4 - 1);
		cal.set(Calendar.DATE, 1);
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.MINUTE, 12);
		cal.set(Calendar.SECOND, 34);
		cal.set(Calendar.MILLISECOND, 56);
		assertEquals("正常時の処理結果が違います", "201204011812", DateUtility.getStringFromDateYYYYMMDDHHMM(cal.getTime()));
	}

	/**
	 * 日付型から"YYYYMMDDHHMMSS"を返す
	 */
	public void test_getStringFromDateYYYYMMDDHHMMSS() {

		// null値
		assertEquals("日付null値の処理結果が違います", "", DateUtility.getStringFromDateYYYYMMDDHHMMSS(null));

		// 正常
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2012);
		cal.set(Calendar.MONTH, 4 - 1);
		cal.set(Calendar.DATE, 1);
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.MINUTE, 12);
		cal.set(Calendar.SECOND, 34);
		cal.set(Calendar.MILLISECOND, 56);
		assertEquals("正常時の処理結果が違います", "201204011812", DateUtility.getStringFromDateYYYYMMDDHHMM(cal.getTime()));
	}

	/**
	 * "hhmm"から日付型を返す
	 * @throws ParseException
	 */
	public void test_getTimeFromString() throws ParseException {

		// null値
		assertNull("null値の処理結果が違います", DateUtility.getTimeFromString(null));

		// 空文字
		assertNull("空文字の処理結果が違います", DateUtility.getTimeFromString(""));

		// 桁数不足
		try {
			DateUtility.getTimeFromString("123");
			fail("桁数不足で例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 桁数超過
		try {
			DateUtility.getTimeFromString("12345");
			fail("桁数超過で例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 桁数超過
		try {
			DateUtility.getTimeFromString("12345");
			fail("桁数超過で例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 時変換エラー
		try {
			DateUtility.getTimeFromString("0A01");
			fail("時変換エラーで例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 分変換エラー
		try {
			DateUtility.getTimeFromString("010A");
			fail("分変換エラーで例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 時がありえない
		try {
			DateUtility.getTimeFromString("2501");
			fail("時がありえないで例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 分がありえない
		try {
			DateUtility.getTimeFromString("0160");
			fail("分がありえないで例外が発生しませんでした");
		} catch (ParseException e) {
			// 正常
		}

		// 正常
		Date result = DateUtility.getTimeFromString("1234");
		assertNotNull("処理結果が違います", result);

		Calendar cal = Calendar.getInstance();
		cal.setTime(result);
		assertEquals("時が違います", cal.get(Calendar.HOUR_OF_DAY), 12);
		assertEquals("分が違います", cal.get(Calendar.MINUTE), 34);
	}

	/**
	 * 対象月の開始終了日付取得
	 */
	public void test_Class_PeriodBeginAndLastDate() {

		PeriodBeginAndLastDate resultdate;

		resultdate = new DateUtility.PeriodBeginAndLastDate(null);
		assertTrue("値がエラーではありません", resultdate.hasError());
		assertNull("開始日付が違います", resultdate.getBeginDate());
		assertNull("終了日付が違います", resultdate.getLastDate());

		resultdate = new DateUtility.PeriodBeginAndLastDate("");
		assertTrue("値がエラーではありません", resultdate.hasError());
		assertNull("開始日付が違います", resultdate.getBeginDate());
		assertNull("終了日付が違います", resultdate.getLastDate());

		resultdate = new DateUtility.PeriodBeginAndLastDate("200909");
		assertFalse("エラーがセットされています", resultdate.hasError());
		assertEquals("開始日付が違います", "20090901", DateUtility.getStringFromDateYYYYMMDD(resultdate.getBeginDate()));
		assertEquals("終了日付が違います", "20090930", DateUtility.getStringFromDateYYYYMMDD(resultdate.getLastDate()));

		resultdate = new DateUtility.PeriodBeginAndLastDate("200902");
		assertFalse("エラーがセットされています", resultdate.hasError());
		assertEquals("開始日付が違います", "20090201", DateUtility.getStringFromDateYYYYMMDD(resultdate.getBeginDate()));
		assertEquals("終了日付が違います", "20090228", DateUtility.getStringFromDateYYYYMMDD(resultdate.getLastDate()));

		resultdate = new DateUtility.PeriodBeginAndLastDate("200802");
		assertFalse("エラーがセットされています", resultdate.hasError());
		assertEquals("開始日付が違います", "20080201", DateUtility.getStringFromDateYYYYMMDD(resultdate.getBeginDate()));
		assertEquals("終了日付が違います", "20080229", DateUtility.getStringFromDateYYYYMMDD(resultdate.getLastDate()));
	}

	/**
	 * 対象月の開始日付取得
	 */
	public void test_getBeginDate() {

		Date resultdate;

		resultdate = DateUtility.getBeginDate(null);
		assertNull("値がNullではありません", resultdate);

		resultdate = DateUtility.getBeginDate("");
		assertNull("値がNullではありません", resultdate);

		resultdate = DateUtility.getBeginDate("200912");
		assertEquals("値が違います", "20091201", DateUtility.getStringFromDateYYYYMMDD(resultdate));

	}

	/**
	 * 対象月の開始日付取得
	 */
	public void test_getNextPeriod() {

		String resultdate;

		resultdate = DateUtility.getNextPeriod(null);
		assertEquals("値が違います", "", resultdate);

		resultdate = DateUtility.getNextPeriod("");
		assertEquals("値が違います", "", resultdate);

		resultdate = DateUtility.getNextPeriod("200912");
		assertEquals("値が違います", "201001", resultdate);

	}

	/**
	 * システム日付の翌月を取得する
	 */
	public void test_getNextMonthPeriod() {
		// テスト実行中に月が替わった場合は失敗します。そのときはごめんなさい。
		String nextMonth = DateUtility.getStringFromDateYYYYMM(DateUtility.getForwardMonth(new Date(), 1));
		assertEquals("システム日付の翌月が違います", nextMonth, DateUtility.getNextMonthPeriod());
	}

	/**
	 * 年取得
	 * @throws ParseException
	 */
	public void test_getYear() throws ParseException {
		Date date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").parse("2010/05/13 12:34:56.789");
		assertEquals("年が違います", Integer.valueOf(2010), DateUtility.getYear(date));
	}

	/**
	 * 月取得
	 * @throws ParseException
	 */
	public void test_getMonth() throws ParseException {
		Date date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").parse("2010/05/13 12:34:56.789");
		assertEquals("月が違います", Integer.valueOf(5), DateUtility.getMonth(date));
	}

	/**
	 * 日取得
	 * @throws ParseException
	 */
	public void test_getDay() throws ParseException {
		Date date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").parse("2010/05/13 12:34:56.789");
		assertEquals("日が違います", Integer.valueOf(13), DateUtility.getDay(date));
	}

	/**
	 * 時取得
	 * @throws ParseException
	 */
	public void test_getHour() throws ParseException {
		Date date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").parse("2010/05/13 12:34:56.789");
		assertEquals("時が違います", Integer.valueOf(12), DateUtility.getHour(date));
	}

	/**
	 * 分取得
	 * @throws ParseException
	 */
	public void test_getMinute() throws ParseException {
		Date date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").parse("2010/05/13 12:34:56.789");
		assertEquals("分が違います", Integer.valueOf(34), DateUtility.getMinute(date));
	}

	/**
	 * 秒取得
	 * @throws ParseException
	 */
	public void test_getSecond() throws ParseException {
		Date date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").parse("2010/05/13 12:34:56.789");
		assertEquals("秒が違います", Integer.valueOf(56), DateUtility.getSecond(date));
	}

	/**
	 * ミリ秒取得
	 * @throws ParseException
	 */
	public void test_getMilliSecond() throws ParseException {
		Date date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").parse("2010/05/13 12:34:56.789");
		assertEquals("ミリ秒が違います", Integer.valueOf(789), DateUtility.getMilliSecond(date));
	}

	/**
	 * 日付時刻数値取得
	 * @throws ParseException
	 */
	public void test_getDateValue() throws ParseException {
		Date date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").parse("2010/05/13 12:34:56.789");

		// フォーマット未設定
		try {
			DateUtility.getDateValue(date, null);
			fail("例外が発生しませんでした");
		} catch (RuntimeException e) {
			// 正常
		} catch (Exception e) {
			fail("予期せぬ例外が発生しました");
		}

		// 日付・時刻null
		assertNull("日付時刻数値が取得されています", DateUtility.getDateValue(null, "HHmm"));

		// 正常
		assertEquals("日付時刻数値が違います", Integer.valueOf(1234), DateUtility.getDateValue(date, "HHmm"));
	}
}
