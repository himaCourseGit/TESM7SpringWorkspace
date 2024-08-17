package com.jsp.springjdbc.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.springjdbc.entity.Employee;

public class Application {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
	EmployeeDao dao=context.getBean(EmployeeDaoImplementation.class);
	//dao.insertRecord();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for Registration");
	System.out.println("Enter 2 for Delete Record");
	System.out.println("Enter 3 for update salary");
	System.out.println("Enter 4 for search query");
	System.out.println("Enter 5 for search employee by DeptNo");
	int option=sc.nextInt();
	switch(option) {
	case 1:
		Employee emp=new Employee();
		System.out.println("Enter Employee Id:");
		/*
		 * int id=sc.nextInt();emp.setEmpId(id);
		 */
		emp.setEmpId(sc.nextInt());
		System.out.println("Enter Employee Name:");
		emp.setEname(sc.next());
		System.out.println("Enter Salary");
		emp.setSalary(sc.nextDouble());
		System.out.println("Enter Dept No:");
		emp.setDeptno(sc.nextInt());
		int record=dao.insertRecord(emp);
		if(record!=0) {
			System.out.println("Registration successfull!!!");
	}
		break;
	case 2:
		System.out.println("Enter Employee Id:");
		//int id=sc.nextInt();
		int record1=dao.deleteById(sc.nextInt());
		if(record1>0) {
			System.out.println("Record Deleted..");
		}
			else {
				System.err.println("no record found");
			}
		break;
	case 3:
		System.out.println("Enter Employee Id:");
		int id=sc.nextInt();
		System.out.println("Enter updated salary");
		double salary=sc.nextDouble();
		int record3=dao.updateSalary(id,salary);
		if(record3 !=0) {
			System.out.println("Salary updated..");
		}
		else {
			System.out.println("Please enter valid details...");
		}
		break;
	case 4:
		System.out.println("Enter Employee Id:");
		Employee employee1=dao.findByEmployeeId(sc.nextInt());
		if(employee1!=null) {
		System.out.println(employee1);}
		else {
			System.out.println("Please enter valid employee id");
		}
		break;
	case 5:
		System.out.println("enter Dept No");
		List<Employee> list=dao.findByDeptNo(sc.nextInt());
		if(list.size()!=0) 
		for(Employee employee:list) {
			System.out.println(employee);
			System.out.println("_______________________________________");
		}
		else {
			System.out.println("No records found...");
		}
		break;
		default:
			System.out.println("please enter valid option... ");
			break;
	}
}
}
