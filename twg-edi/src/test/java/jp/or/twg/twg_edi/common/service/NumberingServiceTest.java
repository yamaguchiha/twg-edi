package jp.or.twg.twg_edi.common.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import jp.or.twg.base.AbstractDbunitTest;
import jp.or.twg.twg_edi.common.context.ApplicationContextProvider;
import jp.or.twg.twg_edi.common.entity.Item;
import jp.or.twg.twg_edi.common.entity.Numbering;
import jp.or.twg.twg_edi.common.mapper.NumberingMapper;

@Component
@EnableAsync
public class NumberingServiceTest extends AbstractDbunitTest {

	//private MockMvc mockMvc;

	//@Autowired
    //private WebApplicationContext wac;

    @Autowired
    ApplicationContext context;

    @Autowired
	private NumberingMapper numMapper;

	@Autowired
	NumberingService numberingService;

	@Before
	public void Setup() {
		//mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void test_getOid() {

		// クリア
		numMapper.deleteByPrimaryKey(Item.class.getName());

		// 初回Insertされて１が返る
		System.out.println("Item.class.getName()=" + Item.class.getName());
		long testOid = numberingService.getOid(Item.class.getName());
		System.out.println("1回目:testOid=" + testOid);
		assertEquals("1回目の取得したOIDが異なります。", 1L, testOid);

		// 2回目Updateされて２が返る
		testOid = numberingService.getOid(Item.class.getName());
		System.out.println("2回目:testOid=" + testOid);
		assertEquals("2回目の取得したOIDが異なります。", 2L, testOid);

		// 最大値の1個手前の場合
		Numbering num = new Numbering();
		num.setId(Item.class.getName());
		num.setNextNumber(Long.MAX_VALUE - 1L);
		numMapper.updateByPrimaryKey(num);
		testOid = numberingService.getOid(Item.class.getName());
		System.out.println("最大値:testOid=" + testOid);
		assertEquals("最大値時の1個手前のOIDが異なります。", Long.MAX_VALUE, testOid);

		// 最大値まで到達した場合は１が返る
		testOid = numberingService.getOid(Item.class.getName());
		System.out.println("最大値超:testOid=" + testOid);
		assertEquals("最大値時の取得したOIDが異なります。", 1L, testOid);

		// 無理やり同じ主キーのデータをinsert
		Numbering numError = new Numbering();
		numError.setId(Item.class.getName());
		numError.setNextNumber(1L);
		try {
			numMapper.insert(numError);
		} catch (DuplicateKeyException e) {
			System.out.println("-------------Cause-----------------------------------");
			System.out.println(e.getCause());
			System.out.println("-------------LocalizedMessage------------------------");
			System.out.println(e.getLocalizedMessage());
			System.out.println("-------------Message---------------------------------");
			System.out.println(e.getMessage());
			System.out.println("----------------------------------------------------");
		}
	}

	@Test
	@Async
	public void test_getOidWithThread() {
		ThreadTest testThread1 = new ThreadTest();
		ThreadTest testThread2 = new ThreadTest();
		ThreadTest testThread3 = new ThreadTest();
		testThread1.threadName = "スレッド1";
		testThread2.threadName = "スレッド2";
		testThread3.threadName = "スレッド3";
		testThread1.start();
		testThread2.start();
		testThread3.start();
		System.out.println("スレッドテスト開始");

		try {
			testThread1.join();
			testThread2.join();
			testThread3.join();
		} catch (InterruptedException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println("スレッドテスト終了");

	}

	class ThreadTest extends Thread {

		public String threadName = null;

		public void run() {
			NumberingService service = ApplicationContextProvider.getBean(NumberingService.class);
			long testOid = 0;
			int i = 0;
			while(i < 20) {
				testOid = service.getOid(Item.class.getName());
				System.out.println(threadName + ":testOid=" + testOid);
				i++;
			}
		}
	}

}
