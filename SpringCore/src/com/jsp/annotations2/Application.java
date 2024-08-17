package com.jsp.annotations2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("AnnotationsApproach.xml");
	BankAccount acc=context.getBean("b1",BankAccount.class);
	System.out.println(acc);
	acc.getBalance();
	System.out.println("___________________________");
	//BankAccount acc=context.getBean("b1",BankAccount.class);
	//System.out.println("acc");
	customer c1=context.getBean("customer",customer.class);
	System.out.println("customer details....");
	System.out.println("Name="+c1.getName());
	System.out.println("Id="+c1.getUserId());
	System.out.println("AccountDetails="+c1.getAccount());
	
}
}
