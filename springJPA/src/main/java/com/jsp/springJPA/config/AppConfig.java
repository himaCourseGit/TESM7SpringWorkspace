package com.jsp.springJPA.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages="com.jsp.SpringJPA")
public class AppConfig {
//to get object of EntityManagerFactory
	@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactory()
	{
		LocalEntityManagerFactory emf=new LocalEntityManagerFactoryBean();
		emf.setPersistenceUnitName("springJPA");
		return emf;
	}
	//to manage transaction and save
	
	
}
