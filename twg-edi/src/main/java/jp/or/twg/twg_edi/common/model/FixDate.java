
package jp.or.twg.twg_edi.common.model;

import java.text.ParseException;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.or.twg.twg_edi.common.utility.DateUtility;
import jp.or.twg.twg_edi.common.utility.NumberUtil;

/**
 * 固定長日付のHibernateマッピングクラス
**/
public class FixDate  {

	/** Log4Jインスタンス */
	private static final Log log = LogFactory.getLog(FixDate.class);

	/** 固定長日付有効範囲 */
	public static interface STRING_DATE_RANGE {
		/** 最小値 */		public static final String MIN = "00000000";
		/** 最大値 */		public static final String MAX = "99999999";
	}

	/**
	 * コンストラクタ
	 */
	public FixDate() {
		super();
	}

	/**
	 * コンストラクタ
	 *
	 * @param stringDate 固定長日付
	 */
	public FixDate(String stringDate) {
		this();
		setStringDate(stringDate);
	}

	/**
	 * コンストラクタ
	 *
	 * @param date 日付
	 */
	public FixDate(Date date) {
		this();
		setDate(date);
	}

    /**
     * 固定長日付
    **/
    private String stringDate;
    public final static String STRING_DATE = "stringDate";
    /**
     * 固定長日付を取得する
    **/
	@NotBlank
	@Size(max = 8)
    public String getStringDate() {
        return stringDate;
    }

    /**
     * 固定長日付を設定する
     * @param stringDate  固定長日付
    **/
    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

	/**
	 * 日付取得
	 *
	 * @return 日付
	 */
	public Date getDate() {
		try {
			if (!STRING_DATE_RANGE.MAX.equals(getStringDate()) && !STRING_DATE_RANGE.MIN.equals(getStringDate())) {
				return DateUtility.getDateFromStringYYYYMMDD(getStringDate());
			}
		} catch (ParseException e) {
			log.error(e);
		}
		return null;
	}

	/**
	 * 日付設定
	 *
	 * @param date 日付
	 */
	public void setDate(Date date) {
		setStringDate(date == null ? null : DateUtility.getStringFromDateYYYYMMDD(date));
	}

	/**
	 * 日付文字列が有効かどうか
	 *
	 * @param stringDate 固定長日付
	 * @return true:有効, false:無効(異常)
	 */
	public static boolean isValidDateString(String stringDate) {
		return stringDate != null && stringDate.length() == 8 && NumberUtil.isNumber(stringDate);
	}
}
