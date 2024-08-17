package com.jsp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application2 {
public static void main(String[] args) {
	System.out.println("IoC");
	ApplicationContext context=new ClassPathXmlApplicationContext("Configuration.xml");
	Employee e1=context.getBean(Employee.class);
	System.out.println(e1);
	System.out.println("_________________________________");
	Employee e2=context.getBean(Employee.class);
	System.out.println(e2);
	System.out.println("__________________________________");
	Employee e3=context.getBean(Employee.class);
	System.out.println(e3);
	System.out.println("___________________________________");
	
}
}
