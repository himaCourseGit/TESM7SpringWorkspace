package com.jsp.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application1 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Configuration2.xml");
	/*
	 * Employee emp=new Employee();
	 */
	Employee emp=context.getBean("emp1",Employee.class);
	System.out.println(emp);
	System.out.println("______________________________________");
	Employee emp2=context.getBean("emp2",Employee.class);
	System.out.println(emp2);
	System.out.println("______________________________________");
	Employee emp3=context.getBean("emp3",Employee.class);
	System.out.println(emp3);
	System.out.println("______________________________________");
	Employee emp4 = context.getBean("emp4",Employee.class);
	System.out.println(emp4);
	System.out.println("______________________________________");
	Employee emp5=context.getBean("employee1",Employee.class);
	System.out.println(emp5);
	emp5.displayAddress();
	System.out.println("______________________________________");
	Employee dpt=context.getBean("department",Employee.class);
	System.out.println(dpt);
	dpt.displayDept();
	dpt.displayAddress();
	
	
	
	
}
}
