package com.panditg.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
public class AppConfig {
	
	@Value("${spring.datasource.url}")
	private String databaseUrl;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	
	@Bean
	DataSource dataSource() {
		final DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(this.databaseUrl);
		driverManagerDataSource.setUsername(this.username);
		driverManagerDataSource.setPassword(this.password);
		driverManagerDataSource.setDriverClassName(this.driverClassName);
		return driverManagerDataSource;
	}
}

