package com.jsp.springjdbc.configuration;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.support.DaoSupport;

import com.jsp.springjdbc.dao.EmployeeDao;
import com.jsp.springjdbc.dao.EmployeeDaoImplementation;
import com.jsp.springjdbc.entity.Employee;

public class EmployeeAnnotation {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	EmployeeDao dao=context.getBean(EmployeeDaoImplementation.class);
    List<Employee> list=dao.findByDeptNo(40);
    System.out.println(list);
    

}
}
