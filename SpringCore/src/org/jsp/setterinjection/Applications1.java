package org.jsp.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Applications1 {
public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("/org/jsp/setterinjection/Setterinjection.xml");
	Student s1=context.getBean("s1",Student.class);
	System.out.println(s1);
	System.out.println("__________________________________________________________");
	
	Student s2=context.getBean("s2",Student.class);
	System.out.println(s2);
	Student s3=context.getBean("Student1",Student.class);
	System.out.println(s3);
	
	
}
}
