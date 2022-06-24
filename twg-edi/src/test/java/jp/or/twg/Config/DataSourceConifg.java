package jp.or.twg.Config;

import javax.sql.DataSource;

import org.dbunit.database.DefaultMetadataHandler;
import org.dbunit.ext.postgresql.PostgresqlDataTypeFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.springtestdbunit.bean.DatabaseConfigBean;
import com.github.springtestdbunit.bean.DatabaseDataSourceConnectionFactoryBean;

@Configuration
public class DataSourceConifg {

	@Bean
	public DatabaseConfigBean dbUnitDatabaseConfig() {
		DatabaseConfigBean bean = new DatabaseConfigBean();

		bean.setAllowEmptyFields(true); // ここ空文字対策

		// PostgreSQLを使用した場合
		bean.setDatatypeFactory(new PostgresqlDataTypeFactory());
		// H2を使用した場合
		//bean.setDatatypeFactory(new H2DataTypeFactory());

		bean.setMetadataHandler(new DefaultMetadataHandler());

		return bean;
	}

	@Bean
	public DatabaseDataSourceConnectionFactoryBean dbUnitDatabaseConnection(DatabaseConfigBean dbUnitDatabaseConfig,
			DataSource dataSource) {
		DatabaseDataSourceConnectionFactoryBean bean = new DatabaseDataSourceConnectionFactoryBean(dataSource);
		bean.setDatabaseConfig(dbUnitDatabaseConfig);
		return bean;
	}
}
