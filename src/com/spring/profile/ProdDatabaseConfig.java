package com.spring.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("production")
@Configuration
public class ProdDatabaseConfig implements DatabaseConfig{

	@Override
	@Bean
	public DataSource createDataSource() {
		System.out.println("creating production database");
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		return datasource;
	}

}
