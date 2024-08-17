package org.jsp.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Applicationannotaion {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("org/jsp/annotations/AnnotationApproach.xml");
	BankAccount acc=context.getBean("b1",BankAccount.class);
	System.out.println(acc);
	acc.getBalnace();
	System.out.println("___________________________________________");
	
	BankAccount acc2=context.getBean("b1",BankAccount.class);
	System.out.println(acc2);
}
}
