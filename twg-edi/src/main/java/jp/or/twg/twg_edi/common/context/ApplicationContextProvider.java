package jp.or.twg.twg_edi.common.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * このクラスはBeanを取得するためのツールクラスであり、SpringManagementにも渡されます。
 * プログラムのコンテキストを通じて取得されます。
 * 必要なクラスでBeanに注入するには、コンストラクターを使用して、
 * 必要に応じてBeanを取得する対応するメソッドを呼び出します。
 *
 * @author yamaguchiha
 *
 */
@Component
public class ApplicationContextProvider implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ApplicationContextProvider.applicationContext = applicationContext;
	}

	/**
	 * ApplicationContext取得
	 * @return
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * nameで指定したBeanを取得
	 * @param name
	 * @return
	 */
	public static Object getBean(String name) {
		return getApplicationContext().getBean(name);
	}

	/**
	 * classで指定したBeanを取得
	 * @param <T>
	 * @param clazz
	 * @return
	 */
	public static <T> T getBean(Class<T> clazz) {
		return getApplicationContext().getBean(clazz);
	}

	/**
	 * nameとclassで指定したBeanを取得
	 * @param <T>
	 * @param name
	 * @param clazz
	 * @return
	 */
	public static <T> T getBean(String name, Class<T> clazz) {
		return getApplicationContext().getBean(name, clazz);
	}}
