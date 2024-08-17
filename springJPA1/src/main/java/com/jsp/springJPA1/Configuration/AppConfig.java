package com.jsp.springJPA1.Configuration;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configurable
@ComponentScan(basePackages="com.jsp.springJPA1")
//to get object of JpaRepository interface Implementation class
@EnableJpaRepositories(basePackages="com.jsp.springJPA1")
public class AppConfig {
	//to get Object of EntityManagerFactory
	@Bean("entityManagerFactory")
public LocalEntityManagerFactoryBean getEntityManagerFactory() 
	{
		LocalEntityManagerFactoryBean emf=new LocalEntityManagerFactoryBean();
	emf.setPersistenceUnitName("springJPA1");
	return emf;
	}
	//to manage Transaction -start and save
	@Bean("transactionManager") 
	public JpaTransactionManager getTransactionManager(EntityManagerFactory factory)
	{
		JpaTransactionManager tm=new JpaTransactionManager();
		tm.setEntityManagerFactory(factory);
		return tm;
	}
}
