package com.jsp.sampleMaven;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertRecord {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
	JdbcTemplate template=context.getBean(JdbcTemplate.class);
	
	String query="Insert into employee values(?,?,?,?)";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee id:");
	int id=sc.nextInt();
	System.out.println("Enter Employee name:");
	String name=sc.next();
	System.out.println("Enter Salary:");
	Double salary =sc.nextDouble();
	System.out.println("Enter DeptNo:");
	int deptNo=sc.nextInt();
	
	int status=template.update(query,id,name,salary,deptNo);
	System.out.println("No.of record inserted:" +status);
	
}
}
