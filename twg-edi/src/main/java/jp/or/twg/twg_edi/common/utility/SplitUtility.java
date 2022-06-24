package jp.or.twg.twg_edi.common.utility;

import java.util.ArrayList;
import java.util.List;


/**
 * 文字分割ユーティリティ
 *
 * @author g-wise
 * @version 1.0
 */
public class SplitUtility {

	/** 分割用文字(1つ以上の全角スペースまたは空白文字) */
	static String SPLIT_CODE = "[　|\\s]+";

	/** 空文字 */
	static String OLENGTH_CODE = "";

	/**
	 * 最初の文字群取得
	 * @param str 分割する文字
	 * @return 分割した最初の文字群
	 */
	public static String splitFirst(String str){
		return splitStr(str, 1);
	}

	/**
	 * 2番目の文字群取得
	 * @param str 分割する文字
	 * @return 分割した2番目の文字群
	 */
	public static String splitSecond(String str){
		return splitStr(str, 2);
	}

	/**
	 * 文字分割
	 * @param str 分割する文字
	 * @param idx 必要な文字群の順番
	 * @return 分割した文字群
	 */
	public static String splitStr(String str, int idx) {
		if (str != null) {
			String st[] = str.split(SPLIT_CODE, -1);
			if (st.length >= idx ){
				return st[idx -1];
			}
		}
		return OLENGTH_CODE;
	}

	/**
	 * ヘッダ情報と中身情報を分割して返す
	 * @param str 分割する文字
	 * @param head ヘッダの文字数
	 * @param body ヘッダ以降の文字数
	 * @param count bodyの繰り返し数
	 * @return 分割した文字群
	 */
	public static String[] splitStrs(String str, int head, int body, int count) {
		if (str == null) {
			return new String[0];
		}
		int currentPoint = 0;
		List<String> list = new ArrayList<String>();
		list.add(substring(str, currentPoint, head));
		currentPoint = currentPoint + head;
		for (int idx = 0; idx < count; idx++){
			list.add(substring(str, currentPoint, currentPoint + body));
			currentPoint = currentPoint + body;
		}

		return list.toArray(new String[0]);
	}

	/**
	 * ヘッダ情報と詳細情報と中身情報を分割して返す
	 * @param str 分割する文字
	 * @param head ヘッダの文字数
	 * @param detail 途中の文字数
	 * @param body ヘッダ以降の文字数
	 * @param count bodyの繰り返し数
	 * @return 分割した文字群
	 */
	public static String[] splitStrs(String str, int head, int detail, int body, int count) {
		if (str == null) {
			return new String[0];
		}
		int currentPoint = 0;
		List<String> list = new ArrayList<String>();
		list.add(substring(str, currentPoint, head));
		currentPoint = currentPoint + head;
		list.add(substring(str, currentPoint, currentPoint + detail));
		currentPoint = currentPoint + detail;
		for (int idx = 0; idx < count; idx++){
			list.add(substring(str, currentPoint, currentPoint + body));
			currentPoint = currentPoint + body;
		}

		return list.toArray(new String[0]);
	}

	/**
	 * substringのラップメソッド
	 * 文字列が足りない場合は途中まで、超えている場合は長さ０を返す。
	 * @param str 分割する文字
	 * @param start 初めの位置
	 * @param end 終わりの位置
	 * @return 切り出した文字
	 */
	public static String substring(String str, int start, int end) {
		if (str == null || str.length() < start) {
			return OLENGTH_CODE;
		} else if ( str.length() < end ){
			return str.substring(start);
		}
		return str.substring(start, end);
	}
}
