package jp.or.twg.twg_edi.common.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * 数値ユーティリティ
 *
 * @author twg
 * @version 1.0
 */
public class NumberUtil {

	/**
	 * 未入力および０判定
	 *
	 * @param <T> クラス Number
	 * @param value 値
	 * @return true:Null値または0 / false:0以外
	 */
	public static <T extends Number> boolean isNullOrZero(T value) {
		if (value == null) {
			return true;
		}
		return (value.doubleValue() == 0);
	}

	/**
	 * 未入力および自然数以外判定
	 *
	 * @param <T> クラス Number
	 * @param value 値
	 * @return true:Null値または自然数以外 / false:自然数
	 */
	public static <T extends Number> boolean isNullOrNotNaturalNumber(T value) {
		if (value == null) {
			return true;
		}
		return (value.doubleValue() <= 0);
	}

	/**
	 * 正数判定
	 *
	 * @param <T> クラス Number
	 * @param value 値
	 * @return true:正数, false:Nullまたは負数
	 */
	public static <T extends Number> boolean isPositiveNumber(T value) {
		return isPositiveNumber(value, false);
	}

	/**
	 * 正数判定
	 *
	 * @param <T> クラス Number
	 * @param value 値
	 * @param allowNull nullを認めるかどうか
	 * @return true:正数, false:負数
	 */
	public static <T extends Number> boolean isPositiveNumber(T value, boolean allowNull) {
		return value == null ? allowNull : value.doubleValue() >= 0;
	}

	/**
	 * 正数判定
	 *
	 * @param numberString 数値文字列
	 * @return true:正数, false:Nullまたは負数
	 */
	public static boolean isPositiveNumberByString(String numberString) {
		return isPositiveNumberByString(numberString, false);
	}

	/**
	 * 正数判定
	 *
	 * @param numberString 数値文字列
	 * @return true:正数, false:負数または数値以外
	 */
	public static boolean isPositiveNumberByString(String numberString, boolean allowNull) {
		if (CommonDataUtil.isNullOrEmpty(numberString)) {
			return allowNull;
		}

		try {
			return isPositiveNumber(Double.valueOf(numberString));
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 整数判定
	 *
	 * @param <T> クラス Number
	 * @param value 値
	 * @return true:整数, false:Nullまたは小数
	 */
	public static <T extends Number> boolean isWholeNumber(T value) {
		return (value != null) && value.doubleValue() == value.longValue();
	}

	/**
	 * 整数判定
	 *
	 * @param <T> クラス Number
	 * @param value 値
	 * @param allowNull nullを認めるかどうか
	 * @return true:整数, false:小数
	 */
	public static <T extends Number> boolean isWholeNumber(T value, boolean allowNull) {
		return value == null ? allowNull : value.doubleValue() == value.longValue();
	}

	/**
	 * 整数判定
	 *
	 * @param numberString 数値文字列
	 * @return true:整数, false:Nullまたは小数または数値以外
	 */
	public static boolean isWholeNumberByString(String numberString) {
		return isWholeNumberByString(numberString, false);
	}

	/**
	 * 整数判定
	 *
	 * @param numberString 数値文字列
	 * @param allowNull nullを認めるかどうか
	 * @return true:整数, false:小数または数値以外
	 */
	public static boolean isWholeNumberByString(String numberString, boolean allowNull) {
		if (CommonDataUtil.isNullOrEmpty(numberString)) {
			return allowNull;
		}

		try {
			return isWholeNumber(Double.valueOf(numberString));
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 正数整数判定
	 *
	 * @param <T> クラス Number
	 * @param value 値
	 * @return true:正数整数, false:Nullまたは小数または負数
	 */
	public static <T extends Number> boolean isWholePositiveNumber(T value) {
		return isWholePositiveNumber(value, false);
	}

	/**
	 * 正数整数判定
	 *
	 * @param <T> クラス Number
	 * @param value 値
	 * @return true:正数整数, false:小数または負数
	 */
	public static <T extends Number> boolean isWholePositiveNumber(T value, boolean allowNull) {
		if (!isPositiveNumber(value, allowNull)) {
			return false;
		}
		return isWholeNumber(value, allowNull);
	}

	/**
	 * 正数整数判定
	 *
	 * @param numberString 数値文字列
	 * @return true:正数整数, false:Nullまたは小数または負数または数値以外
	 */
	public static boolean isWholePositiveNumberByString(String numberString) {
		return isWholePositiveNumberByString(numberString, false);
	}

	/**
	 * 正数整数判定
	 *
	 * @param numberString 数値文字列
	 * @return true:正数整数, false:小数または負数または数値以外
	 */
	public static boolean isWholePositiveNumberByString(String numberString, boolean allowNull) {
		if (CommonDataUtil.isNullOrEmpty(numberString)) {
			return allowNull;
		}
		try {
			return isWholePositiveNumber(Double.valueOf(numberString));
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 数値判定
	 *
	 * @param numberString 数値文字列
	 * @return true:数値文字列 / false:Null値または数値文字列 以外
	 */
	public static boolean isNumber(String numberString) {
		if (numberString == null) {
			return false;
		}
		try {
			Long.valueOf(numberString);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	/**
	 * 数値変換(Integer)
	 *
	 * @param numberString 数値文字列
	 * @return 数値
	 */
	public static Integer tryParseInteger(String numberString) {
		return tryParseInteger(numberString, 0);
	}

	/**
	 * 数値変換(Integer)
	 *
	 * @param numberString 数値文字列
	 * @param detaultNumber 規定値
	 * @return 数値
	 */
	public static Integer tryParseInteger(String numberString, Integer detaultNumber) {
		try {
			return Integer.valueOf(numberString);
		} catch (NumberFormatException e) {
			// 処理なし
		}
		return detaultNumber;
	}

	/**
	 * 数値変換(Long)
	 *
	 * @param numberString 数値文字列
	 * @return 数値
	 */
	public static Long tryParseLong(String numberString) {
		return tryParseLong(numberString, 0L);
	}

	/**
	 * 数値変換(Long)
	 *
	 * @param numberString 数値文字列
	 * @param detaultNumber 規定値
	 * @return 数値
	 */
	public static Long tryParseLong(String numberString, Long detaultNumber) {
		try {
			return Long.valueOf(numberString);
		} catch (NumberFormatException e) {
			// 処理なし
		}
		return detaultNumber;
	}

	/**
	 * 箱数算出
	 *
	 * @param quantity 数量
	 * @param orderLot 収容数
	 * @return 箱数
	 */
	public static long calcUnitQuantity(Number quantity, Number orderLot) {
		if (isNullOrZero(orderLot) || isNullOrZero(quantity)) {
			return 0L;
		}

		long unitQuantity = (long)Math.ceil(quantity.doubleValue() / orderLot.doubleValue());

		if (quantity.doubleValue() < 0 && isUnitFraction(quantity, orderLot)){
			//0以下で端数がある場合は-1する
			unitQuantity--;
		}

		return unitQuantity;
	}

	/**
	 * 数量と収容数から箱数を算出する
	 * 収容数がない場合は箱数1とする。
	 * 注意：数量が0、収容数が0の場合も戻り値が1となります。
	 * かずら専用で使用してください。
	 *
	 * @param amount 数量
	 * @param lot    収容数
	 * @return 箱数
	 */
	public static Long calcUnitQuantityDefaultOne(Long amount, Long lot) {
		if (!isNullOrZero(lot)) {
			return calcUnitQuantity(amount,lot);
		}
		return 1L;
	}

	/**
	 * 端数箱数判定
	 *
	 * @param quantity 数量
	 * @param orderLot 収容数
	 * @return true:端数, false:端数以外
	 */
	public static boolean isUnitFraction(Number quantity, Number orderLot) {
		if (isNullOrZero(orderLot) || isNullOrZero(quantity)) {
			return false;
		}
		return quantity.longValue() % orderLot.longValue() != 0;
	}

	/**
	 * 箱数まとめ
	 * @param quantity 必要数
	 * @param orderLot 収容数
	 * @return 計算結果
	 */
	public static Long calcOrderLotQuantity(Number quantity, Number orderLot) {
		if (isNullOrZero(orderLot) || isNullOrZero(quantity)) {
			return 0L;
		}
		return new BigDecimal(	Math.abs(quantity.doubleValue())).divide(new BigDecimal(orderLot.intValue()),
								0,
								RoundingMode.UP).longValue() * orderLot.intValue();
	}

	/**
	 * 小数丸め処理
	 *
	 * @param scale
	 * @param quantity 必要数
	 * @return 計算結果
	 */
	public static Double getQuantityRoundHalfUp(Number scale, Number quantity) {
		return new BigDecimal(quantity.doubleValue()).setScale(scale.intValue(), RoundingMode.HALF_UP).doubleValue();
	}

	/**
	 * 数値範囲チェック
	 *
	 * @param value 数値
	 * @param required 必須入力可否
	 * @param min 下限値
	 * @param max 上限値
	 * @return 結果(true:正常, false:異常)
	 */
	public static boolean isNumberLimit(Number value, boolean required, Number min, Number max) {

		// 必須入力チェック
		if(value == null) {
			return !required;
		}

		// 下限値チェック
		if(min != null) {
			if(value.doubleValue() < min.doubleValue()) {
				return false;
			}
		}

		// 上限値チェック
		if(max != null) {
			if(value.doubleValue() > max.doubleValue()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 補正数値算出
	 *
	 * @param totalValue 合計数
	 * @param doubleValues 小数を含む数値配列
	 * @return 整数化された数値配列
	 */
	public static Long[] calcCorrectValue(Long totalValue, Double... doubleValues) {
		if(CommonDataUtil.isNullOrEmpty(doubleValues)) {
			return null;
		}

		Long correctTotalValue = 0L;
		List<Long> resutlList = new ArrayList<Long>();
		double correct = 0;
		for (double doubleValue : doubleValues) {
			doubleValue -= correct;
			long correctValue = (long)Math.ceil(doubleValue);
			correctTotalValue += correctValue;
			resutlList.add(correctValue);
			correct = correctValue - doubleValue;
		}

		if(correctTotalValue < totalValue) {
			// 不足
			resutlList.set(0, resutlList.get(0) + totalValue - correctTotalValue);
		} else if (correctTotalValue > totalValue) {
			// 過剰
			Long overValue = correctTotalValue - totalValue;
			for (int idx = resutlList.size() - 1; idx >= 0; idx--) {
				Long thisValue = resutlList.get(idx);
				if(thisValue > 0) {
					if(thisValue - overValue <= 0) {
						resutlList.set(idx, 0L);
						overValue -= thisValue;
					} else {
						resutlList.set(idx, thisValue - overValue);
						overValue = 0L;
					}

					if(overValue == 0) {
						break;
					}
				}
			}
		}
		return resutlList.toArray(new Long[0]);
	}
}
