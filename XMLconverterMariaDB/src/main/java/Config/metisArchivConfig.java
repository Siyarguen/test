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
@EnableJpaRepositories(entityManagerFactoryRef = "metisarchivEntityManagerFactory", transactionManagerRef = "metisarchivTransactionManager", 
basePackages = {"metisarchiv"})
public class metisArchivConfig {

	@Bean(name = "metisarchivDataSource")
	@ConfigurationProperties(prefix = "metisarchiv.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "metisarchivEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean metisarchivEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("metisarchivDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("metisarchiv","metisarchivmodel").persistenceUnit("archiv").build();
	}

	@Bean(name = "metisarchivTransactionManager")
	public PlatformTransactionManager metisarchivTransactionManager(
			@Qualifier("metisarchivEntityManagerFactory") EntityManagerFactory metisarchivEntityManagerFactory) {
		return new JpaTransactionManager(metisarchivEntityManagerFactory);
	}
}