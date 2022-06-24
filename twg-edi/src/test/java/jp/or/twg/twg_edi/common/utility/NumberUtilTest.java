package jp.or.twg.twg_edi.common.utility;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;

/**
 * 数値操作ユーティリティ
 *
 * @author twg
 * @version 1.0
 */
public class NumberUtilTest extends TestCase {

	/**
	 * コンストラクタ
	 * このクラスはすべて静的メソッドだが、Coverage Reportで未テストクラスとして扱われるため、生成できることも確認する。
	 */
	public void test_NumberUtil() {
		NumberUtil cls = null;
		cls = new NumberUtil();
		assertNotNull("クラスが生成されていません", cls);
	}

	/**
	 * 未入力および０判定
	 */
	public void test_isNullOrZero() {
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrZero(null));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrZero(0));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrZero(0L));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrZero(0.0f));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrZero(0.0d));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrZero(new BigInteger("0")));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrZero(new BigDecimal("0")));

		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(1));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(1L));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(1.0f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(0.1f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(1.0d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(0.1d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(new BigInteger("1")));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(new BigDecimal(1.0)));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(new BigDecimal(0.1)));

		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(-1));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(-1L));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(-1.0f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(-0.1f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(-1.0d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(-0.1d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(new BigInteger("-1")));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(new BigDecimal(-1.0)));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrZero(new BigDecimal(-0.1)));
	}

	/**
	 * 未入力および自然数以外判定
	 */
	public void test_isNullOrNotNaturalNumber() {
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(null));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(0));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(0L));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(0.0f));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(0.0d));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(new BigInteger("0")));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(new BigDecimal("0")));

		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrNotNaturalNumber(1));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrNotNaturalNumber(1L));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrNotNaturalNumber(1.0f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrNotNaturalNumber(0.1f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrNotNaturalNumber(1.0d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrNotNaturalNumber(0.1d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrNotNaturalNumber(new BigInteger("1")));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrNotNaturalNumber(new BigDecimal(1.0)));
		assertFalse("処理結果がfalseではありません", NumberUtil.isNullOrNotNaturalNumber(new BigDecimal(0.1)));

		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(-1));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(-1L));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(-1.0f));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(-0.1f));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(-1.0d));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(-0.1d));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(new BigInteger("-1")));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(new BigDecimal(-1.0)));
		assertTrue("処理結果がtrueではありません", NumberUtil.isNullOrNotNaturalNumber(new BigDecimal(-0.1)));
	}

	/**
	 * 正数判定
	 */
	public void test_isPositiveNumber() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(null));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(0));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(0L));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(0.0f));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(0.0d));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(new BigInteger("0")));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(new BigDecimal("0")));

		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(1));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(1L));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(1.0f));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(0.1f));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(1.0d));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(0.1d));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigInteger("1")));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigDecimal(1.0)));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigDecimal(0.1)));

		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-1));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-1L));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-1.0f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-0.1f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-1.0d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-0.1d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigInteger("-1")));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigDecimal(-1.0)));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigDecimal(-0.1)));
	}

	/**
	 * 正数判定
	 */
	public void test_isPositiveNumber_allowNull() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(null, false));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(null, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(0, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(0L, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(0.0f, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(0.0d, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(new BigInteger("0"), true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumber(new BigDecimal("0"), true));

		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(1, true));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(1L, true));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(1.0f, true));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(0.1f, true));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(1.0d, true));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(0.1d, true));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigInteger("1"), true));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigDecimal(1.0), true));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigDecimal(0.1), true));

		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-1, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-1L, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-1.0f, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-0.1f, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-1.0d, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(-0.1d, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigInteger("-1"), true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigDecimal(-1.0), true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumber(new BigDecimal(-0.1), true));
	}

	/**
	 * 正数判定
	 */
	public void test_isPositiveNumberByString() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString(null));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString(""));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("1.2.3"));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("ERROR"));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumberByString("0"));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumberByString("0.0"));

		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("1"));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("1.0"));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("0.1"));

		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("-1"));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("-1.0"));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("-0.1"));
	}

	/**
	 * 正数判定
	 */
	public void test_isPositiveNumberByString_allowNull() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString(null, false));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumberByString(null, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("", false));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumberByString("", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("1.2.3", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("ERROR", true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumberByString("0", true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isPositiveNumberByString("0.0", true));

		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("1", true));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("1.0", true));
		assertTrue("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("0.1", true));

		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("-1", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("-1.0", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isPositiveNumberByString("-0.1", true));
	}

	/**
	 * 整数判定
	 */
	public void test_isWholeNumber() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(null));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(0));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(0L));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(0.0f));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(0.0d));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigInteger("0")));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigDecimal("0")));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(1));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(1L));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(1.0f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(0.1f));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(1.0d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(0.1d));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigInteger("1")));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigDecimal(1.0)));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(new BigDecimal(0.1)));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(-1));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(-1L));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(-1.0f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(-0.1f));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(-1.0d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(-0.1d));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigInteger("-1")));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigDecimal(-1.0)));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(new BigDecimal(-0.1)));
	}

	/**
	 * 整数判定
	 */
	public void test_isWholeNumber_allowNull() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(null, false));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(null, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(0, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(0L, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(0.0f, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(0.0d, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigInteger("0"), true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigDecimal("0"), true));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(1, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(1L, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(1.0f, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(0.1f, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(1.0d, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(0.1d, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigInteger("1"), true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigDecimal(1.0), true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(new BigDecimal(0.1), true));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(-1, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(-1L, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(-1.0f, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(-0.1f, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(-1.0d, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(-0.1d, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigInteger("-1"), true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumber(new BigDecimal(-1.0), true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumber(new BigDecimal(-0.1), true));
	}

	/**
	 * 整数判定
	 */
	public void test_isWholeNumberByString() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString(null));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString(""));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString("1.2.3"));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString("ERROR"));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("0"));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("0.0"));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("1"));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("1.0"));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString("0.1"));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("-1"));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("-1.0"));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString("-0.1"));
	}

	/**
	 * 整数判定
	 */
	public void test_isWholeNumberByString_allowNull() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString(null, false));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString(null, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString("", false));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString("1.2.3", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString("ERROR", true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("0", true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("0.0", true));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("1", true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("1.0", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString("0.1", true));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("-1", true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholeNumberByString("-1.0", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholeNumberByString("-0.1", true));
	}

	/**
	 * 正数整数判定
	 */
	public void test_isWholePositiveNumber() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(null));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(0));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(0L));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(0.0f));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(0.0d));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigInteger("0")));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigDecimal("0")));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(1));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(1L));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(1.0f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(0.1f));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(1.0d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(0.1d));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigInteger("1")));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigDecimal(1.0)));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(new BigDecimal(0.1)));

		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(-1));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(-1L));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(-1.0f));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(-0.1f));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(-1.0d));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(-0.1d));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigInteger("-1")));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigDecimal(-1.0)));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(new BigDecimal(-0.1)));
	}

	/**
	 * 正数整数判定
	 */
	public void test_isWholePositiveNumber_allowNull() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(null, false));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(null, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(0, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(0L, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(0.0f, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(0.0d, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigInteger("0"), true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigDecimal("0"), true));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(1, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(1L, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(1.0f, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(0.1f, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(1.0d, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(0.1d, true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigInteger("1"), true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigDecimal(1.0), true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(new BigDecimal(0.1), true));

		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(-1, true));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(-1L, true));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(-1.0f, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(-0.1f, true));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(-1.0d, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(-0.1d, true));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigInteger("-1"), true));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumber(new BigDecimal(-1.0), true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumber(new BigDecimal(-0.1), true));
	}

	/**
	 * 正数整数判定
	 */
	public void test_isWholePositiveNumberByString() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString(null));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString(""));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString("1.2.3"));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString("ERROR"));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("0"));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("0.0"));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("1"));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("1.0"));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString("0.1"));

		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("-1"));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("-1.0"));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString("-0.1"));
	}

	/**
	 * 正数整数判定
	 */
	public void test_isWholePositiveNumberByString_allowNull() {
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString(null, false));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString(null, true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString("", false));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString("1.2.3", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString("ERROR", true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("0", true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("0.0", true));

		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("1", true));
		assertTrue("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("1.0", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString("0.1", true));

		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("-1", true));
		assertFalse("処理結果がtrueではありません", NumberUtil.isWholePositiveNumberByString("-1.0", true));
		assertFalse("処理結果がfalseではありません", NumberUtil.isWholePositiveNumberByString("-0.1", true));
	}

	/**
	 * 数値判定
	 */
	public void test_isNumber() {
		assertFalse("処理結果が違います", NumberUtil.isNumber(null));
		assertFalse("処理結果が違います", NumberUtil.isNumber(""));
		assertFalse("処理結果が違います", NumberUtil.isNumber(" "));
		assertTrue("処理結果が違います", NumberUtil.isNumber("0"));
		assertTrue("処理結果が違います", NumberUtil.isNumber("01"));
		assertTrue("処理結果が違います", NumberUtil.isNumber("-1"));
		assertFalse("処理結果が違います", NumberUtil.isNumber("0a"));
		assertFalse("処理結果が違います", NumberUtil.isNumber("1a"));
		assertFalse("処理結果が違います", NumberUtil.isNumber("1.1"));
		assertFalse("処理結果が違います", NumberUtil.isNumber("1a2"));
	}

	/**
	 * 数値変換(Integer)
	 */
	public void test_tryParseInteger_既定値なし() {
		assertEquals("nullの処理結果が違います", Integer.valueOf(0), NumberUtil.tryParseInteger(null));
		assertEquals("数値以外の処理結果が違います", Integer.valueOf(0), NumberUtil.tryParseInteger("12345a"));
		assertEquals("数値の処理結果が違います", Integer.valueOf(12345), NumberUtil.tryParseInteger("12345"));
	}

	/**
	 * 数値変換(Integer)
	 */
	public void test_tryParseInteger_既定値あり() {
		assertEquals("nullの処理結果が違います", Integer.valueOf(1), NumberUtil.tryParseInteger(null, 1));
		assertEquals("数値以外の処理結果が違います", Integer.valueOf(1), NumberUtil.tryParseInteger("12345a", 1));
		assertEquals("数値の処理結果が違います", Integer.valueOf(12345), NumberUtil.tryParseInteger("12345", 1));
	}

	/**
	 * 数値変換(Long)
	 */
	public void test_tryParseLong_既定値なし() {
		assertEquals("nullの処理結果が違います", Long.valueOf(0), NumberUtil.tryParseLong(null));
		assertEquals("数値以外の処理結果が違います", Long.valueOf(0), NumberUtil.tryParseLong("12345a"));
		assertEquals("数値の処理結果が違います", Long.valueOf(12345), NumberUtil.tryParseLong("12345"));
	}

	/**
	 * 数値変換(Long)
	 */
	public void test_tryParseLong_既定値あり() {
		assertEquals("nullの処理結果が違います", Long.valueOf(1), NumberUtil.tryParseLong(null, 1L));
		assertEquals("数値以外の処理結果が違います", Long.valueOf(1), NumberUtil.tryParseLong("12345a", 1L));
		assertEquals("数値の処理結果が違います", Long.valueOf(12345), NumberUtil.tryParseLong("12345", 1L));
	}

	/**
	 * 箱数算出
	 */
	public void test_calcUnitQuantity() {

		assertEquals("数量がnullの場合の箱数が違います", 0L, NumberUtil.calcUnitQuantity(null, 100));
		assertEquals("数量が0の場合の箱数が違います", 0L, NumberUtil.calcUnitQuantity(0, 100));

		assertEquals("収容数がnullの場合の箱数が違います", 0L, NumberUtil.calcUnitQuantity(11, null));
		assertEquals("収容数が0の場合の箱数が違います", 0L, NumberUtil.calcUnitQuantity(11, 0));

		assertEquals("数量int収容数intの箱数が違います", 6L, NumberUtil.calcUnitQuantity(11, 2));
		assertEquals("数量long収容数intの箱数が違います", 6L, NumberUtil.calcUnitQuantity(11L, 2));
		assertEquals("数量double収容数intの箱数が違います", 6L, NumberUtil.calcUnitQuantity(11.0d, 2));

		assertEquals("数量int収容数longの箱数が違います", 6L, NumberUtil.calcUnitQuantity(11L, 2L));
		assertEquals("数量long収容数longの箱数が違います", 6L, NumberUtil.calcUnitQuantity(11L, 2L));
		assertEquals("数量double収容数longの箱数が違います", 6L, NumberUtil.calcUnitQuantity(11.0d, 2L));

		assertEquals("数量int収容数doubleの箱数が違います", 6L, NumberUtil.calcUnitQuantity(11, 2d));
		assertEquals("数量long収容数doubleの箱数が違います", 6L, NumberUtil.calcUnitQuantity(11L, 2d));
		assertEquals("数量double収容数doubleの箱数が違います", 6L, NumberUtil.calcUnitQuantity(11.0d, 2d));

		assertEquals("割り切れた場合の箱数が違います", 5L, NumberUtil.calcUnitQuantity(10, 2));


		//数量がマイナスの場合
		assertEquals("数量がnullの場合の箱数が違います", 0L, NumberUtil.calcUnitQuantity(null, 100));
		assertEquals("数量が0の場合の箱数が違います", 0L, NumberUtil.calcUnitQuantity(0, 100));

		assertEquals("収容数がnullの場合の箱数が違います", 0L, NumberUtil.calcUnitQuantity(-11, null));
		assertEquals("収容数が0の場合の箱数が違います", 0L, NumberUtil.calcUnitQuantity(-11, 0));

		assertEquals("数量int収容数intの箱数が違います", -6L, NumberUtil.calcUnitQuantity(-11, 2));
		assertEquals("数量long収容数intの箱数が違います", -6L, NumberUtil.calcUnitQuantity(-11L, 2));
		assertEquals("数量double収容数intの箱数が違います", -6L, NumberUtil.calcUnitQuantity(-11.0d, 2));

		assertEquals("数量int収容数longの箱数が違います", -6L, NumberUtil.calcUnitQuantity(-11L, 2L));
		assertEquals("数量long収容数longの箱数が違います", -6L, NumberUtil.calcUnitQuantity(-11L, 2L));
		assertEquals("数量double収容数longの箱数が違います", -6L, NumberUtil.calcUnitQuantity(-11.0d, 2L));

		assertEquals("数量int収容数doubleの箱数が違います", -6L, NumberUtil.calcUnitQuantity(-11, 2d));
		assertEquals("数量long収容数doubleの箱数が違います", -6L, NumberUtil.calcUnitQuantity(-11L, 2d));
		assertEquals("数量double収容数doubleの箱数が違います", -6L, NumberUtil.calcUnitQuantity(-11.0d, 2d));

		assertEquals("割り切れた場合の箱数が違います", -5L, NumberUtil.calcUnitQuantity(-10, 2));
	}
	/**
	 * 数量と収容数から箱数を算出する
	 */
	public void test_calcUnitQuantityDefaultOne() {
		Long box;

		// 端数なし
		box = NumberUtil.calcUnitQuantityDefaultOne(100L, 10L);
		assertEquals("箱数に誤りがあります", Long.valueOf(10), box);

		// 端数あり
		box = NumberUtil.calcUnitQuantityDefaultOne(100L, 30L);
		assertEquals("箱数に誤りがあります", Long.valueOf(4), box);

		// マイナス 端数なし
		box = NumberUtil.calcUnitQuantityDefaultOne(-30L, 10L);
		assertEquals("箱数に誤りがあります", Long.valueOf(-3), box);

		// マイナス 端数あり
		box = NumberUtil.calcUnitQuantityDefaultOne(-40L, 10L);
		assertEquals("箱数に誤りがあります", Long.valueOf(-4), box);

		// 数量0
		box = NumberUtil.calcUnitQuantityDefaultOne(0L, 100L);
		assertEquals("箱数に誤りがあります", Long.valueOf(0), box);

		// 収容数0
		box = NumberUtil.calcUnitQuantityDefaultOne(100L, 0L);
		assertEquals("箱数に誤りがあります", Long.valueOf(1), box);

		// 数量null
		box = NumberUtil.calcUnitQuantityDefaultOne(null, 100L);
		assertEquals("箱数に誤りがあります", Long.valueOf(0), box);

		// 収容数null
		box = NumberUtil.calcUnitQuantityDefaultOne(100L, null);
		assertEquals("箱数に誤りがあります", Long.valueOf(1), box);
	}

	/**
	 * 端数箱数判定
	 */
	public void test_isUnitFraction() {
		assertFalse("数量がnullの場合の端数箱数判定が違います", NumberUtil.isUnitFraction(null, 100));
		assertFalse("収容数がnullの場合の端数箱数判定が違います", NumberUtil.isUnitFraction(1, null));
		assertFalse("数量が0の場合の端数箱数判定が違います", NumberUtil.isUnitFraction(0, 100));
		assertTrue("割り切れない場合の端数箱数判定が違います", NumberUtil.isUnitFraction(1, 3));
		assertTrue("割り切れない場合の端数箱数判定が違います", NumberUtil.isUnitFraction(10, 3));
		assertFalse("割り切れた場合の端数箱数判定が違います", NumberUtil.isUnitFraction(2, 2));
		assertFalse("割り切れた場合の端数箱数判定が違います", NumberUtil.isUnitFraction(10, 2));

		//数量がマイナスの場合
		assertTrue("割り切れない場合の端数箱数判定が違います", NumberUtil.isUnitFraction(-1, 3));
		assertTrue("割り切れない場合の端数箱数判定が違います", NumberUtil.isUnitFraction(-10, 3));
		assertFalse("割り切れた場合の端数箱数判定が違います", NumberUtil.isUnitFraction(-2, 2));
		assertFalse("割り切れた場合の端数箱数判定が違います", NumberUtil.isUnitFraction(-10, 2));
	}

	/**
	 * 箱数まとめ
	 */
	public void test_calcOrderLotQuantity() {
		assertEquals("数量がnullの場合の数量が違います", 0L, NumberUtil.calcOrderLotQuantity(null, 100).longValue());
		assertEquals("数量が0の場合の数量が違います", 0L, NumberUtil.calcOrderLotQuantity(0, 100).longValue());

		assertEquals("収容数がnullの場合の数量が違います", 0L, NumberUtil.calcOrderLotQuantity(11, null).longValue());
		assertEquals("収容数が0の場合の数量が違います", 0L, NumberUtil.calcOrderLotQuantity(11, 0).longValue());

		assertEquals("箱数にまとめた数量が違います", 15L, NumberUtil.calcOrderLotQuantity(11, 5).longValue());
	}

	/**
	 * 小数丸め処理
	 */
	public void test_getQuantityRoundHalfUp() {
		assertEquals("丸め処理結果が違います", 0.33d, NumberUtil.getQuantityRoundHalfUp(2, 0.33333333).doubleValue());
		assertEquals("丸め処理結果が違います", 0.67d, NumberUtil.getQuantityRoundHalfUp(2, 0.66666666).doubleValue());
	}

	/**
	 * 数値範囲チェック
	 */
	public void test_isNumberLimit() {

		final Long TEST_MIN_VALUE = 0L;
		final Long TEST_MAX_VALUE = 100L;

		// 未入力
		assertFalse("必須入力 未入力の処理結果が違います", NumberUtil.isNumberLimit(null, true, TEST_MIN_VALUE, TEST_MAX_VALUE));
		assertTrue("任意入力 未入力の処理結果が違います", NumberUtil.isNumberLimit(null, false, TEST_MIN_VALUE, TEST_MAX_VALUE));

		// 下限値のみチェック
		assertFalse("必須入力 下限値のみチェックで下限値未満の処理結果が違います", NumberUtil.isNumberLimit(TEST_MIN_VALUE - 0.1, true, TEST_MIN_VALUE, null));
		assertFalse("任意入力 下限値のみチェックで下限値未満の処理結果が違います", NumberUtil.isNumberLimit(TEST_MIN_VALUE - 0.1, false, TEST_MIN_VALUE, null));
		assertTrue("必須入力 下限値のみチェックで下限値の処理結果が違います", NumberUtil.isNumberLimit(TEST_MIN_VALUE, true, TEST_MIN_VALUE, null));
		assertTrue("任意入力 下限値のみチェックで下限値の処理結果が違います", NumberUtil.isNumberLimit(TEST_MIN_VALUE, false, TEST_MIN_VALUE, null));
		assertTrue("必須入力 下限値のみチェックで下限値超えの処理結果が違います", NumberUtil.isNumberLimit(TEST_MIN_VALUE + 0.1, true, TEST_MIN_VALUE, null));
		assertTrue("任意入力 下限値のみチェックで下限値超えの処理結果が違います", NumberUtil.isNumberLimit(TEST_MIN_VALUE + 0.1, false, TEST_MIN_VALUE, null));

		// 上限値のみチェック
		assertTrue("必須入力 下限値のみチェックで上限値未満の処理結果が違います", NumberUtil.isNumberLimit(TEST_MAX_VALUE - 0.1, true, null, TEST_MAX_VALUE));
		assertTrue("任意入力 下限値のみチェックで上限値未満の処理結果が違います", NumberUtil.isNumberLimit(TEST_MAX_VALUE - 0.1, false, null, TEST_MAX_VALUE));
		assertTrue("必須入力 下限値のみチェックで上限値の処理結果が違います", NumberUtil.isNumberLimit(TEST_MAX_VALUE, true, null, TEST_MAX_VALUE));
		assertTrue("任意入力 下限値のみチェックで上限値の処理結果が違います", NumberUtil.isNumberLimit(TEST_MAX_VALUE, false, null, TEST_MAX_VALUE));
		assertFalse("必須入力 下限値のみチェックで上限値超えの処理結果が違います", NumberUtil.isNumberLimit(TEST_MAX_VALUE + 0.1, true, null, TEST_MAX_VALUE));
		assertFalse("任意入力 下限値のみチェックで上限値超えの処理結果が違います", NumberUtil.isNumberLimit(TEST_MAX_VALUE + 0.1, false, null, TEST_MAX_VALUE));

		// 両方チェックチェック
		assertFalse("必須入力 両方チェックで下限値未満の処理結果が違います", NumberUtil.isNumberLimit(TEST_MIN_VALUE - 0.1, true, TEST_MIN_VALUE, TEST_MAX_VALUE));
		assertFalse("任意入力 両方チェックで下限値未満の処理結果が違います", NumberUtil.isNumberLimit(TEST_MIN_VALUE - 0.1, false, TEST_MIN_VALUE, TEST_MAX_VALUE));
		assertTrue("必須入力 両方チェックで下限値の処理結果が違います", NumberUtil.isNumberLimit(TEST_MIN_VALUE, true, TEST_MIN_VALUE, TEST_MAX_VALUE));
		assertTrue("任意入力 両方チェックで下限値の処理結果が違います", NumberUtil.isNumberLimit(TEST_MIN_VALUE, false, TEST_MIN_VALUE, TEST_MAX_VALUE));
		assertTrue("必須入力 両方チェックで上限値の処理結果が違います", NumberUtil.isNumberLimit(TEST_MAX_VALUE, true, TEST_MIN_VALUE, TEST_MAX_VALUE));
		assertTrue("任意入力 両方チェックで上限値の処理結果が違います", NumberUtil.isNumberLimit(TEST_MAX_VALUE, false, TEST_MIN_VALUE, TEST_MAX_VALUE));
		assertFalse("必須入力 両方チェックで上限値超えの処理結果が違います", NumberUtil.isNumberLimit(TEST_MAX_VALUE + 0.1, true, TEST_MIN_VALUE, TEST_MAX_VALUE));
		assertFalse("任意入力 両方チェックで上限値超えの処理結果が違います", NumberUtil.isNumberLimit(TEST_MAX_VALUE + 0.1, false, TEST_MIN_VALUE, TEST_MAX_VALUE));
	}

	/**
	 * 補正数値算出
	 */
	public void test_calcCorrectValue() {
		assertNull("数量がnullの場合の数量が違います", NumberUtil.calcCorrectValue(100L, (Double[])null));

		Long[] resultValues;
		Long totalValue;

		final Long TEST_TOTAL_VALUE_1 = 100L;
		resultValues =  NumberUtil.calcCorrectValue(TEST_TOTAL_VALUE_1, 33.33d, 33.33d, 33.33d);
		assertEquals("件数違います", 3, resultValues.length);
		assertEquals("1件目の数量が違います", Long.valueOf(34), resultValues[0]);
		assertEquals("2件目の数量が違います", Long.valueOf(33), resultValues[1]);
		assertEquals("3件目の数量が違います", Long.valueOf(33), resultValues[2]);

		totalValue = 0L;
		for (Long value : resultValues) {
			totalValue += value;
		}
		assertEquals("合計数が違います", TEST_TOTAL_VALUE_1, totalValue);

		// 不足
		final Long TEST_TOTAL_VALUE_2 = 100000L;
		resultValues =  NumberUtil.calcCorrectValue(100000L, 14285.71428d, 14285.71428d, 14285.71428d, 14285.71428d, 14285.71428d, 14285.71428d, 1.71427d);
		assertEquals("件数違います", 7, resultValues.length);
		assertEquals("1件目の数量が違います", Long.valueOf(28570), resultValues[0]);
		assertEquals("2件目の数量が違います", Long.valueOf(14286), resultValues[1]);
		assertEquals("3件目の数量が違います", Long.valueOf(14286), resultValues[2]);
		assertEquals("4件目の数量が違います", Long.valueOf(14285), resultValues[3]);
		assertEquals("5件目の数量が違います", Long.valueOf(14286), resultValues[4]);
		assertEquals("6件目の数量が違います", Long.valueOf(14286), resultValues[5]);
		assertEquals("7件目の数量が違います", Long.valueOf(1), resultValues[6]);
		totalValue = 0L;
		for (Long value : resultValues) {
			totalValue += value;
		}
		assertEquals("合計数が違います", TEST_TOTAL_VALUE_2, totalValue);

		// 過剰
		resultValues =  NumberUtil.calcCorrectValue(100000L, 14285.71428d, 14285.71428d, 14285.71428d, 14285.71428d, 60000.71428d, 0.0d, 0.0d);
		assertEquals("件数違います", 7, resultValues.length);
		assertEquals("1件目の数量が違います", Long.valueOf(14286), resultValues[0]);
		assertEquals("2件目の数量が違います", Long.valueOf(14286), resultValues[1]);
		assertEquals("3件目の数量が違います", Long.valueOf(14286), resultValues[2]);
		assertEquals("4件目の数量が違います", Long.valueOf(14285), resultValues[3]);
		assertEquals("5件目の数量が違います", Long.valueOf(42857), resultValues[4]);
		assertEquals("6件目の数量が違います", Long.valueOf(0), resultValues[5]);
		assertEquals("7件目の数量が違います", Long.valueOf(0), resultValues[6]);
		totalValue = 0L;
		for (Long value : resultValues) {
			totalValue += value;
		}
		assertEquals("合計数が違います", TEST_TOTAL_VALUE_2, totalValue);
	}
}
