package com.jsp.springjdbc.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configurable
@ComponentScan(basePackages ="com.jsp.springjdbc")
public class AppConfig {
	@Bean
	public DriverManagerDataSource getDriverManagerDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://loacalhost:3306/teca41");
		ds.setPassword("12345");
		ds.setUsername("root");
		return ds;
		
	}
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template=new JdbcTemplate();
		/*
		 * DataSource ds=getDriverManagerDataSource(); template.setDataSource(ds);
		 */
		template.setDataSource(getDriverManagerDataSource());
		return template;
	}
}
