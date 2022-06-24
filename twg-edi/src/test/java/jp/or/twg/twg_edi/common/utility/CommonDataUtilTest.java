package jp.or.twg.twg_edi.common.utility;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

/**
 * データ操作ユーティリティ
 *
 * @author g-wise
 * @version 1.0
 */
public class CommonDataUtilTest extends TestCase {

	/**
	 * コンストラクタ
	 * このクラスはすべて静的メソッドだが、Coverage Reportで未テストクラスとして扱われるため、生成できることも確認する。
	 */
	public void test_CommonDataUtil() {
		CommonDataUtil cls = null;
		cls = new CommonDataUtil();
		assertNotNull("クラスが生成されていません", cls);
	}

	/**
	 * Null値変換(String)
	 */
	public void testNzString() {
		String defaultvalue = "";
		Object value;
		String ret;

		value = "12345";
		ret = CommonDataUtil.nz(value, defaultvalue);
		assertNotNull("戻り値が設定されていません", ret);
		assertEquals("戻り値が違います", ret, value.toString());

		value = null;
		ret = CommonDataUtil.nz(value, defaultvalue);
		assertNotNull("戻り値が設定されていません", ret);
		assertEquals("戻り値が違います", ret, defaultvalue);
	}

	/**
	 * Null値変換(Integer)
	 */
	public void testNzInteger() {
		Integer defaultvalue = Integer.valueOf(0);
		Object value;
		Integer ret;
		String retStr;

		value = Integer.valueOf(12345);
		ret = CommonDataUtil.nz(value, defaultvalue);
		assertNotNull("戻り値が設定されていません", ret);
		assertEquals("戻り値が違います", ret, value);

		retStr = CommonDataUtil.nz(value);
		assertNotNull("戻り値が設定されていません", ret);
		assertEquals("戻り値が違います", retStr, value.toString());

		value = null;
		ret = CommonDataUtil.nz(value, defaultvalue);
		assertNotNull("戻り値が設定されていません", ret);
		assertEquals("戻り値が違います", ret, defaultvalue);

		retStr = CommonDataUtil.nz(value);
		assertNotNull("戻り値が設定されていません", ret);
		assertEquals("戻り値が違います", retStr, "");
	}

	/**
	 * Null値変換(int)
	 */
	public void testNzInt() {
		int defaultvalue = 0;
		Object value;
		int ret;
		String retStr;

		value = 12345;
		ret = CommonDataUtil.nz(value, defaultvalue);
		assertNotNull("戻り値が設定されていません", ret);
		assertEquals("戻り値が違います", ret, value);

		retStr = CommonDataUtil.nz(value);
		assertNotNull("戻り値が設定されていません", ret);
		assertEquals("戻り値が違います", retStr, value.toString());

		value = null;
		ret = CommonDataUtil.nz(value, defaultvalue);
		assertNotNull("戻り値が設定されていません", ret);
		assertEquals("戻り値が違います", ret, defaultvalue);

		retStr = CommonDataUtil.nz(value);
		assertNotNull("戻り値が設定されていません", ret);
		assertEquals("戻り値が違います", retStr, "");
	}

	/**
	 * 未入力判定(文字列)
	 */
	public void testIsNullOrEmpty_文字列() {
		String value = null;
		assertTrue("処理結果がtrueではありません", CommonDataUtil.isNullOrEmpty(value));
		value = "";
		assertTrue("処理結果がtrueではありません", CommonDataUtil.isNullOrEmpty(value));
		value = "12345";
		assertFalse("処理結果がfalseではありません", CommonDataUtil.isNullOrEmpty("12345"));
	}

    /**
     * 全て未入力判定(Microsoft .net の IsNullOrEmpty関数相当)
     */
	public void test_isAllNullOrEmptyArray() {
    	assertTrue("処理結果がtrueではありません", CommonDataUtil.isAllNullOrEmptyArray((String[])null));
    	assertTrue("処理結果がtrueではありません", CommonDataUtil.isAllNullOrEmptyArray("", null, ""));
		assertFalse("処理結果がfalseではありません", CommonDataUtil.isAllNullOrEmptyArray("", null, "1"));
		assertFalse("処理結果がfalseではありません", CommonDataUtil.isAllNullOrEmptyArray("1", "2", "3"));

		String[] valueArray;
		valueArray = null;
    	assertTrue("処理結果がtrueではありません", CommonDataUtil.isAllNullOrEmptyArray(valueArray));

    	valueArray = new String[]{"", null, ""};
    	assertTrue("処理結果がtrueではありません", CommonDataUtil.isAllNullOrEmptyArray(valueArray));

    	valueArray = new String[]{"", null, "1"};
		assertFalse("処理結果がfalseではありません", CommonDataUtil.isAllNullOrEmptyArray(valueArray));

		valueArray = new String[]{"1", "2", "3"};
		assertFalse("処理結果がfalseではありません", CommonDataUtil.isAllNullOrEmptyArray(valueArray));
    }

	/**
	 * 未入力判定(コレクション)
	 */
	public void testIsNullOrEmpty_コレクション() {
		List<String> value = null;
		assertTrue("処理結果がtrueではありません", CommonDataUtil.isNullOrEmpty(value));
		value = new ArrayList<String>();
		assertTrue("処理結果がtrueではありません", CommonDataUtil.isNullOrEmpty(new ArrayList<String>()));
		value.add("12345");
		assertFalse("処理結果がfalseではありません", CommonDataUtil.isNullOrEmpty(value));
	}

	/**
	 * 未入力判定(マップ)
	 */
	public void testIsNullOrEmpty_マップ() {
		Map<String, String> value = null;
		assertTrue("処理結果がtrueではありません", CommonDataUtil.isNullOrEmpty(value));
		value = new HashMap<String, String>();
		assertTrue("処理結果がtrueではありません", CommonDataUtil.isNullOrEmpty(new ArrayList<String>()));
		value.put("key", "value");
		assertFalse("処理結果がfalseではありません", CommonDataUtil.isNullOrEmpty(value));
	}

	/**
	 * 未入力判定(配列)
	 */
	public void testIsNullOrEmpty_配列() {
		String[] value = null;
		assertTrue("処理結果がtrueではありません", CommonDataUtil.isNullOrEmpty(value));
		value = new String[0];
		assertTrue("処理結果がtrueではありません", CommonDataUtil.isNullOrEmpty(value));
		value = new String[1];
		assertTrue("処理結果がtrueではありません", CommonDataUtil.isNullOrEmpty(value));
		assertTrue("処理結果がtrueではありません", CommonDataUtil.isNullOrEmpty((Object[])null));
		value[0] = "12345";
		assertFalse("処理結果がfalseではありません", CommonDataUtil.isNullOrEmpty(value));
	}

    /**
     * リストの最初の要素を取得します
     */
	public void test_getListFirstElement() {
		assertNull("Null時の処理結果が違います", CommonDataUtil.getListFirstElement(null));

		List<Integer> list = new ArrayList<Integer>();
		assertNull("リストデータ無し時の処理結果が違います", CommonDataUtil.getListFirstElement(list));

		list.add(1);
		assertEquals("データ1件あり時の処理結果が違います", Integer.valueOf(1), CommonDataUtil.getListFirstElement(list));

		list.add(2);
		list.add(3);
		assertEquals("データ複数あり時の処理結果が違います", Integer.valueOf(1), CommonDataUtil.getListFirstElement(list));
	}

	/**
	 * リスト縮小
	 */
	public void test_reducedList() {
		final Integer TEST_VALUE_1 = 1;
		final Integer TEST_VALUE_2 = 2;
		final Integer TEST_VALUE_3 = 3;

		List<Integer> TEST_LIST;
		List<Integer> resultList;

		// null
		resultList = CommonDataUtil.reducedList(null, 3);
		assertNull("処理結果が違います", resultList);

		// 未満
		TEST_LIST = Arrays.asList(TEST_VALUE_1, TEST_VALUE_2);
		resultList = CommonDataUtil.reducedList(TEST_LIST, 3);
		assertEquals("件数が違います", 2, resultList.size());
		assertEquals("1件目の値が違います", TEST_VALUE_1, resultList.get(0));
		assertEquals("2件目の値が違います", TEST_VALUE_2, resultList.get(1));

		// 一致
		TEST_LIST = Arrays.asList(TEST_VALUE_1, TEST_VALUE_2, TEST_VALUE_3);
		resultList = CommonDataUtil.reducedList(TEST_LIST, 3);
		assertEquals("件数が違います", 3, resultList.size());
		assertEquals("1件目の値が違います", TEST_VALUE_1, resultList.get(0));
		assertEquals("2件目の値が違います", TEST_VALUE_2, resultList.get(1));
		assertEquals("3件目の値が違います", TEST_VALUE_3, resultList.get(2));

		// 超過
		TEST_LIST = Arrays.asList(TEST_VALUE_1, TEST_VALUE_2, TEST_VALUE_3, 4, 5);
		resultList = CommonDataUtil.reducedList(TEST_LIST, 3);
		assertEquals("件数が違います", 3, resultList.size());
		assertEquals("1件目の値が違います", TEST_VALUE_1, resultList.get(0));
		assertEquals("2件目の値が違います", TEST_VALUE_2, resultList.get(1));
		assertEquals("3件目の値が違います", TEST_VALUE_3, resultList.get(2));
	}

	/**
	 * LPAD
	 */
	public void testlpad() {
		String result;
		String str;

		str = "123";
		result = CommonDataUtil.lpad(str, 10, null);
		assertNull("結果が違います", result);
		assertEquals("元の値が変更されています", "123", str);

		str = "123";
		result = CommonDataUtil.lpad(str, 10, "");
		assertNull("結果が違います", result);
		assertEquals("元の値が変更されています", "123", str);

		str = "123";
		result = CommonDataUtil.lpad(str, 0, "x");
		assertNull("結果が違います", result);
		assertEquals("元の値が変更されています", "123", str);

		str = "123";
		result = CommonDataUtil.lpad(str, 10, "x");
		assertEquals("結果が違います", "xxxxxxx123", result);
		assertEquals("元の値が変更されています", "123", str);

		str = "123456789012345";
		result = CommonDataUtil.lpad(str, 10, "x");
		assertEquals("結果が違います", "1234567890", result);
		assertEquals("元の値が変更されています", "123456789012345", str);

		str = null;
		result = CommonDataUtil.lpad(str, 10, "x");
		assertEquals("結果が違います", "xxxxxxxxxx", result);
		assertNull("元の値が変更されています", str);
	}

	/**
	 * RPAD
	 */
	public void testrpad() {
		String result;
		String str;

		str = "123";
		result = CommonDataUtil.rpad(str, 10, null);
		assertNull("結果が違います", result);
		assertEquals("元の値が変更されています", "123", str);

		str = "123";
		result = CommonDataUtil.rpad(str, 10, "");
		assertNull("結果が違います", result);
		assertEquals("元の値が変更されています", "123", str);

		str = "123";
		result = CommonDataUtil.rpad(str, 0, "x");
		assertNull("結果が違います", result);
		assertEquals("元の値が変更されています", "123", str);

		str = "123";
		result = CommonDataUtil.rpad(str, 10, "x");
		assertEquals("結果が違います", "123xxxxxxx", result);
		assertEquals("元の値が変更されています", "123", str);

		str = "123456789012345";
		result = CommonDataUtil.rpad(str, 10, "x");
		assertEquals("結果が違います", "1234567890", result);
		assertEquals("元の値が変更されています", "123456789012345", str);

		str = null;
		result = CommonDataUtil.rpad(str, 10, "x");
		assertEquals("結果が違います", "xxxxxxxxxx", result);
		assertNull("元の値が変更されています", str);
	}

	/**
	 * BOOLEAN_CHAR -> booleanの変換を行う
	 */
	public void test_booleanCharToBoolean() {
		assertTrue("結果が違います", CommonDataUtil.booleanCharToBoolean(CommonDataUtil.BOOLEAN_CHAR_T));
		assertFalse("結果が違います", CommonDataUtil.booleanCharToBoolean(CommonDataUtil.BOOLEAN_CHAR_F));
		assertFalse("結果が違います", CommonDataUtil.booleanCharToBoolean(""));
		assertFalse("結果が違います", CommonDataUtil.booleanCharToBoolean(null));
	}

	/**
	 * boolean -> BOOLEAN_CHARの変換を行う
	 */
	public void test_booleanToBooleanCharTo() {
		assertEquals("結果が違います", CommonDataUtil.BOOLEAN_CHAR_T, CommonDataUtil.booleanToBooleanCharTo(true));
		assertEquals("結果が違います", CommonDataUtil.BOOLEAN_CHAR_F, CommonDataUtil.booleanToBooleanCharTo(false));
	}

	/**
	 * String -> List<Byte>の変換を行う
	 * @throws UnsupportedEncodingException
	 */
	public void test_stringToByteClassList() throws UnsupportedEncodingException {

		String before = "0123456789";
		int size = before.length();

		List<Byte> afterList = CommonDataUtil.stringToByteClassList(before);
		assertNotNull("実行後の値がNullです", afterList);
		assertEquals("リスト数が違います", size, afterList.size());
		for (int idx = 0; idx < size; idx++) {
			assertEquals("[" + idx + "]の値が違います", (byte)before.charAt(idx), afterList.get(idx).byteValue());
		}
	}

	/**
	 * byte[] -> Byte[]の変換を行う(正常値)
	 */
	public void test_byteDataArrayToByteClassArray_正常値() {
		byte[] beforeArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Byte[] afterArray = CommonDataUtil.byteDataArrayToByteClassArray(beforeArray);

		assertNotNull("実行後の値がNullです", afterArray);
		assertEquals("配列数が違います", beforeArray.length, afterArray.length);
		for (int idx = 0; idx < beforeArray.length; idx++) {
			assertEquals("[" + idx + "]の値が違います", beforeArray[idx], afterArray[idx].byteValue());
		}
	}

	/**
	 * byte[] -> Byte[]の変換を行う(NULL値)
	 */
	public void test_byteDataArrayToByteClassArray_NULL値() {
		Byte[] afterArray = CommonDataUtil.byteDataArrayToByteClassArray(null);
		assertNull("実行後の値がNull以外です", afterArray);
	}

	/**
	 * Byte[] -> byte[]の変換を行う(正常値)
	 */
	public void test_byteClassArrayToByteDataArray_正常値() {
		Byte[] beforeArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		byte[] afterArray = CommonDataUtil.byteClassArrayToByteDataArray(beforeArray);

		assertNotNull("実行後の値がNullです", afterArray);
		assertEquals("配列数が違います", beforeArray.length, afterArray.length);
		for (int idx = 0; idx < beforeArray.length; idx++) {
			assertEquals("[" + idx + "]の値が違います", beforeArray[idx].byteValue(), afterArray[idx]);
		}

	}

	/**
	 * Byte[] -> byte[]の変換を行う(NULL値)
	 */
	public void test_byteClassArrayToByteDataArray_NULL値() {
		byte[] afterArray = CommonDataUtil.byteClassArrayToByteDataArray(null);
		assertNull("実行後の値がNull以外です", afterArray);
	}

	/**
	 * 文字列結合
	 */
	public void test_catString() {
		String[] beforeStringArray = { "A", "B", "C", null, "D", "E" };
		String afterString = CommonDataUtil.catString(beforeStringArray);
		assertNotNull("実行後の値がNullです", afterString);
		assertEquals("実行後の値が違います", "ABCDE", afterString);
	}

	/**
	 * 対象文字列削除
	 */
	public void test_eraseString() {
		final String CHAR_CR = "\r";
		final String CHAR_LF = "\n";
		final String CHAR_CRLF = CHAR_CR + CHAR_LF;

		final String TEST_STRING_1 ="ABC";
		final String TEST_STRING_2 ="abc";
		final String TEST_STRING_3 ="123";
		final String TEST_STRING_4 =" ";
		final String TEST_STRING_5 ="あいう";
		final String TEST_STRING = TEST_STRING_1 + CHAR_LF + TEST_STRING_2 + CHAR_CRLF + TEST_STRING_3 + CHAR_CR + TEST_STRING_4 + CHAR_CRLF + TEST_STRING_5;

		String result;

		// 元文字列null
		result = CommonDataUtil.eraseString(null, "\n", "\r\n", "\r");
		assertNull("処理結果が違います", result);

		// 元文字列空文字
		result = CommonDataUtil.eraseString("", "\n", "\r\n", "\r");
		assertEquals("処理結果が違います", "", result);

		// 削除文字列なし
		result = CommonDataUtil.eraseString(TEST_STRING);
		assertEquals("処理結果が違います", TEST_STRING, result);

		// その１
		result = CommonDataUtil.eraseString(TEST_STRING, CHAR_CR, CHAR_LF, CHAR_CRLF);
		assertEquals("処理結果が違います", TEST_STRING_1 + TEST_STRING_2 + TEST_STRING_3 + TEST_STRING_4 + TEST_STRING_5, result);

		// その２
		result = CommonDataUtil.eraseString(TEST_STRING, CHAR_LF, CHAR_CRLF);
		assertEquals("処理結果が違います", TEST_STRING_1 + TEST_STRING_2 + TEST_STRING_3 + CHAR_CR + TEST_STRING_4 + TEST_STRING_5, result);

		// その３
		result = CommonDataUtil.eraseString(TEST_STRING, CHAR_CRLF);
		assertEquals("処理結果が違います", TEST_STRING_1 + CHAR_LF + TEST_STRING_2 + TEST_STRING_3 + CHAR_CR + TEST_STRING_4 + TEST_STRING_5, result);
	}

	/**
	 * 文字列分解
	 */
	public void test_splitString() {
		String beforeString = "ABCDE";
		String[] afterStringArray = CommonDataUtil.splitString(beforeString);
		assertNotNull("実行後の値がNullです", afterStringArray);
		assertEquals("実行後の長さが違います", beforeString.length(), afterStringArray.length);
		for (int idx = 0; idx < afterStringArray.length; idx++) {
			assertEquals((idx + 1) + "文字目の値が異なります", beforeString.substring(idx, idx + 1), afterStringArray[idx]);
		}
	}

	/**
	 * 内容の比較(数値)
	 */
	public void test_compareValue_Number() {
		final Integer TEST_THIS = 123;
		final Integer TEST_FOREIGN = 123;
		final Integer TEST_FOREIGN_OTHER = 999;

		// process=null, spec=null
		assertTrue("処理結果が違います", CommonDataUtil.compareValue(null, null));

		// process=null, spec=非null
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(null, TEST_FOREIGN));

		// process=非null, spec=null
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, null));

		// process=非null, spec=非null, 不一致
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, TEST_FOREIGN_OTHER));

		// process=非null, spec=非null, 一致
		assertTrue("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, TEST_FOREIGN));
	}

	/**
	 * 内容の比較(文字列)
	 */
	public void test_compareValue_String() {
		final String TEST_THIS = "TEST";
		final String TEST_FOREIGN = "TEST";
		final String TEST_FOREIGN_OTHER = "OTHER";

		// process=null, spec=null
		assertTrue("処理結果が違います", CommonDataUtil.compareValue(null, null));

		// process=null, spec=非null
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(null, TEST_FOREIGN));

		// process=非null, spec=null
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, null));

		// process=非null, spec=非null, 不一致
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, TEST_FOREIGN_OTHER));

		// process=非null, spec=非null, 一致
		assertTrue("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, TEST_FOREIGN));
	}

	/**
	 * 内容の比較(日付)
	 */
	public void test_compareValue_Date() {
		final Date TEST_THIS = new Date();
		final Date TEST_FOREIGN = (Date)TEST_THIS.clone();
		final Date TEST_FOREIGN_OTHER = DateUtility.getDateForward(TEST_FOREIGN, 1);

		// process=null, spec=null
		assertTrue("処理結果が違います", CommonDataUtil.compareValue(null, null));

		// process=null, spec=非null
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(null, TEST_FOREIGN));

		// process=非null, spec=null
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, null));

		// process=非null, spec=非null, 不一致
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, TEST_FOREIGN_OTHER));

		// process=非null, spec=非null, 一致
		assertTrue("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, TEST_FOREIGN));
	}

	/**
	 * 内容の比較(オブジェクト)
	 */
	public void test_compareValue_Object() {
		final CompareValueTestObjectClass TEST_THIS = new CompareValueTestObjectClass(1);
		final CompareValueTestObjectClass TEST_FOREIGN = new CompareValueTestObjectClass(1);
		final CompareValueTestObjectClass TEST_FOREIGN_OTHER = new CompareValueTestObjectClass(2);

		// process=null, spec=null
		assertTrue("処理結果が違います", CommonDataUtil.compareValue(null, null));

		// process=null, spec=非null
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(null, TEST_FOREIGN));

		// process=非null, spec=null
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, null));

		// process=非null, spec=非null, 不一致
		assertFalse("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, TEST_FOREIGN_OTHER));

		// process=非null, spec=非null, 一致
		assertTrue("処理結果が違います", CommonDataUtil.compareValue(TEST_THIS, TEST_FOREIGN));
	}
	/**
	 * 内容の比較(オブジェクト)用 テストクラス
	 * テスト専用のクラスです。他の用途で使用しないでください
	 */
	@Deprecated
	static class CompareValueTestObjectClass {

		/** ID */
		int id;

		/**
		 * コンストラクタ
		 *
		 * @param id ID
		 */
		public CompareValueTestObjectClass(int id) {
			this.id= id;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CompareValueTestObjectClass other = (CompareValueTestObjectClass) obj;
			if (id != other.id)
				return false;
			return true;
		}
	}

	/**
	 * 文字列の長い順にソート
	 */
	public void test_stringListSortByLongLength() {
		final String TEST_1 = "abcdefg";
		final String TEST_2 = "Def";
		final String TEST_3 = "abc";
		final String TEST_4 = "def";

		List<String> list;
		List<String>resultList;

		// null
		resultList = CommonDataUtil.stringListSortByLongLength(null);
		assertNull("処理結果が違います", resultList);

		// リストなし
		list = new ArrayList<String>();
		resultList = CommonDataUtil.stringListSortByLongLength(list);
		assertTrue("件数が違います", resultList.isEmpty());

		// リストあり
		list = Arrays.asList(TEST_3, TEST_2, TEST_4, TEST_1);
		final int before = list.size();
		resultList = CommonDataUtil.stringListSortByLongLength(list);
		assertEquals("件数が違います", before, resultList.size());
		assertEquals("1件目の文字列が違います", TEST_1, resultList.get(0));
		assertEquals("2件目の文字列が違います", TEST_2, resultList.get(1));
		assertEquals("3件目の文字列が違います", TEST_3, resultList.get(2));
		assertEquals("4件目の文字列が違います", TEST_4, resultList.get(3));
	}

}
