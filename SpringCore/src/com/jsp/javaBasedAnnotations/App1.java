package com.jsp.javaBasedAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	Department d1=context.getBean("department",Department.class);
	System.out.println(d1);
	System.out.println("________________________________");
	User u1=context.getBean("user",User.class);
	System.out.println(u1);
}
}
