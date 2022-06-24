package jp.or.twg.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;

import jp.or.twg.loader.XlsDataSetLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration //コンテキスト使う準備
@ContextConfiguration(locations = { "classpath:META-INF/spring/test-context.xml" })
@TestExecutionListeners({
    DirtiesContextBeforeModesTestExecutionListener.class,
    DependencyInjectionTestExecutionListener.class,
    DirtiesContextTestExecutionListener.class,
    TransactionDbUnitTestExecutionListener.class})
@Transactional
@DbUnitConfiguration(dataSetLoader = XlsDataSetLoader.class)
public abstract class AbstractDbunitTest {

}
