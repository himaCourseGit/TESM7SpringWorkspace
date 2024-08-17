package com.jsp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.springboot.dao.DepartmentDao;
import com.jsp.springboot.dao.DepartmentDaoImplementation;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootJdbcApplication.class,args);
		DepartmentDao dao=context.getBean(DepartmentDaoImplementation.class);
		dao.insertRecord();		
		
	}

}
