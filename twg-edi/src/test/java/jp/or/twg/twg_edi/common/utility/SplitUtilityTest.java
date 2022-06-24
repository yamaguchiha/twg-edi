package jp.or.twg.twg_edi.common.utility;

import junit.framework.TestCase;

/**
 * 文字分割ユーティリティのテスト
 *
 * @author g-wise
 * @version 1.0
 */
public class SplitUtilityTest extends TestCase {

	String TEST1 = "";
	String TEST2 = "TEST ";
	String TEST3 = "TEST テスト";
	String TEST4 = "TEST   テスト   ";
	String TEST5 = "TEST　テスト　test";
	String TEST6 = "   TEST テスト test";

	String RES0 = "";
	String RES1 = "TEST";
	String RES2 = "テスト";
	String RES3 = "test";

	String STR_TEST1 = "00TEST1TEST2TEST3";
	String STR_TEST2 = "00てすとTEST1TEST2TEST3";
	String STR_TEST3 = "00TEST1TEST2TEST33";

	String STR_TEST_RES1 = "00";
	String STR_TEST_RES2 = "TEST1";
	String STR_TEST_RES3 = "TEST2";
	String STR_TEST_RES4 = "TEST3";
	String STR_TEST_RES5 = "てすと";
	String STR_TEST_RES6 = "3";

	/**
	 * 最初の文字を取得
	 */
	public void test_splitFirst() {
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitFirst(TEST1));
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitFirst(null));
		assertEquals("戻り値が異なります", RES1, SplitUtility.splitFirst(TEST2));
		assertEquals("戻り値が異なります", RES1, SplitUtility.splitFirst(TEST3));
		assertEquals("戻り値が異なります", RES1, SplitUtility.splitFirst(TEST4));
		assertEquals("戻り値が異なります", RES1, SplitUtility.splitFirst(TEST5));
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitFirst(TEST6));
	}

	/**
	 * 2番目の文字を取得
	 */
	public void test_splitSecond() {
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitSecond(TEST1));
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitSecond(null));
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitSecond(TEST2));
		assertEquals("戻り値が異なります", RES2, SplitUtility.splitSecond(TEST3));
		assertEquals("戻り値が異なります", RES2, SplitUtility.splitSecond(TEST4));
		assertEquals("戻り値が異なります", RES2, SplitUtility.splitSecond(TEST5));
		assertEquals("戻り値が異なります", RES1, SplitUtility.splitSecond(TEST6));
	}


	/**
	 * 文字分割
	 */
	public void test_splitStr() {
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitStr(TEST1,1));
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitStr(null,2));
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitStr(TEST2,3));
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitStr(TEST3,4));
		assertEquals("戻り値が異なります", RES0, SplitUtility.splitStr(TEST4,4));
		assertEquals("戻り値が異なります", RES3, SplitUtility.splitStr(TEST5,3));
		assertEquals("戻り値が異なります", RES3, SplitUtility.splitStr(TEST6,4));
	}

	/**
	 * substringのラップメソッド
	 */
	public void test_substrintg() {
		assertEquals("戻り値が異なります", RES0, SplitUtility.substring(TEST1,0,0));
		assertEquals("戻り値が異なります", RES0, SplitUtility.substring(null,0,0));
		assertEquals("戻り値が異なります", STR_TEST_RES1, SplitUtility.substring(STR_TEST2,0,2));
		assertEquals("戻り値が異なります", STR_TEST_RES5, SplitUtility.substring(STR_TEST2,2,5));
		assertEquals("戻り値が異なります", STR_TEST_RES6, SplitUtility.substring(STR_TEST1,16,18));
		assertEquals("戻り値が異なります", RES0, SplitUtility.substring(STR_TEST_RES1,18,19));
		assertEquals("戻り値が異なります", STR_TEST_RES1, SplitUtility.substring(STR_TEST_RES1,0,19));
	}

	/**
	 * ヘッダ情報と中身情報を分割して返す
	 */
	public void test_splitStrs_str_head_body_count() {
		String [] res =  SplitUtility.splitStrs(TEST1,0,0,0);
		assertEquals("戻り値が異なります",1, res.length);
		assertEquals("戻り値が異なります",RES0, res[0]);
		res =  SplitUtility.splitStrs(null,0,0,0);
		assertEquals("戻り値が異なります",0, res.length);

		res =  SplitUtility.splitStrs(STR_TEST1,2,5,4);
		assertEquals("戻り値が異なります",5, res.length);
		assertEquals("戻り値が異なります",STR_TEST_RES1, res[0]);
		assertEquals("戻り値が異なります",STR_TEST_RES2, res[1]);
		assertEquals("戻り値が異なります",STR_TEST_RES3, res[2]);
		assertEquals("戻り値が異なります",STR_TEST_RES4, res[3]);
		assertEquals("戻り値が異なります",RES0, res[4]);

		res =  SplitUtility.splitStrs(STR_TEST3,2,5,4);
		assertEquals("戻り値が異なります",5, res.length);
		assertEquals("戻り値が異なります",STR_TEST_RES1, res[0]);
		assertEquals("戻り値が異なります",STR_TEST_RES2, res[1]);
		assertEquals("戻り値が異なります",STR_TEST_RES3, res[2]);
		assertEquals("戻り値が異なります",STR_TEST_RES4, res[3]);
		assertEquals("戻り値が異なります",STR_TEST_RES6, res[4]);

	}

	/**
	 * ヘッダ情報と中身情報を分割して返す
	 */
	public void test_splitStrs_str_head_detail_body_count() {
		String [] res =  SplitUtility.splitStrs(TEST1,0,0,0,0);
		assertEquals("戻り値が異なります",2, res.length);
		assertEquals("戻り値が異なります",RES0, res[0]);

		res =  SplitUtility.splitStrs(null,0,0,0,0);
		assertEquals("戻り値が異なります",0, res.length);

		res =  SplitUtility.splitStrs(STR_TEST1,2,5,5,3);
		assertEquals("戻り値が異なります",5, res.length);
		assertEquals("戻り値が異なります",STR_TEST_RES1, res[0]);
		assertEquals("戻り値が異なります",STR_TEST_RES2, res[1]);
		assertEquals("戻り値が異なります",STR_TEST_RES3, res[2]);
		assertEquals("戻り値が異なります",STR_TEST_RES4, res[3]);
		assertEquals("戻り値が異なります",RES0, res[4]);

		res =  SplitUtility.splitStrs(STR_TEST2,2,3,5,3);
		assertEquals("戻り値が異なります",5, res.length);
		assertEquals("戻り値が異なります",STR_TEST_RES1, res[0]);
		assertEquals("戻り値が異なります",STR_TEST_RES5, res[1]);
		assertEquals("戻り値が異なります",STR_TEST_RES2, res[2]);
		assertEquals("戻り値が異なります",STR_TEST_RES3, res[3]);
		assertEquals("戻り値が異なります",STR_TEST_RES4, res[4]);


		res =  SplitUtility.splitStrs(STR_TEST3,2,5,5,3);
		assertEquals("戻り値が異なります",5, res.length);
		assertEquals("戻り値が異なります",STR_TEST_RES1, res[0]);
		assertEquals("戻り値が異なります",STR_TEST_RES2, res[1]);
		assertEquals("戻り値が異なります",STR_TEST_RES3, res[2]);
		assertEquals("戻り値が異なります",STR_TEST_RES4, res[3]);
		assertEquals("戻り値が異なります",STR_TEST_RES6, res[4]);

	}
}
