package com.jsp.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application2 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Autowiring.xml");
	
	Employee e1=context.getBean(Employee.class);
	System.out.println(e1);
	e1.displayAddress();
	
}
}
