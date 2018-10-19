package Config;

import javax.sql.DataSource;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.springframework.boot.jdbc.DataSourceBuilder;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "metisimportEntityManagerFactory", transactionManagerRef = "metisimportTransactionManager", 
basePackages = {"metisimport"})
public class metisimportConfig {

	@Bean(name = "metisimportDataSource")
	@ConfigurationProperties(prefix = "metisimport.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "metisimportEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean metisimportEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("metisimportDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("metisimport","metisimportmodel").persistenceUnit("import").build();
	}

	@Bean(name = "metisimportTransactionManager")
	public PlatformTransactionManager metisimportTransactionManager(
			@Qualifier("metisimportEntityManagerFactory") EntityManagerFactory metisimportEntityManagerFactory) {
		return new JpaTransactionManager(metisimportEntityManagerFactory);
	}
}
