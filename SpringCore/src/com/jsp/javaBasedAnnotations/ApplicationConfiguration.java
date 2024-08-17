package com.jsp.javaBasedAnnotations;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//to replace xml file
//to enable configuration by java
@Configurable
@ComponentScan(basePackages="com.jsp.javaBasedAnnotations")//enable autoscanning we are not specifying any method
public class ApplicationConfiguration {
//to replace bean tag-method
//to inform springFramework related to object
//id of object is same as method name
/*@Bean
public Department getObject()
{
//create object
	Department dept=new Department();
	return dept;
}
@Bean("user1")
public User getObjectofUser() {
	User u= new User();
	return u;
}*/
}
