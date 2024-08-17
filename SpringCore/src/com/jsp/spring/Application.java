package com.jsp.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;
public class Application {
	public static void main(String[] args) {
		//Ioc container
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		//to access Object by using id and downcasting
		//Mobile mobile=(Mobile)context.getBean("m1");
		//Mobile mobile=(Mobile)context.getBean("m1");
		/*
		 Mobile mobile=context.getBean(Mobile.class);
		 access object without down-casting by using class name only for one bean tag
		 */
		/*access object by class name and id without down-casting
		 for multiple bean tags
		 */
		Mobile mobile=context.getBean("m1",Mobile.class);
		//Mobile mobile=context.getBean(Mobile.class);
		mobile.network();
	}

}
