package com.jsp.JpaProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DepartmentApp {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("JpaProject");
	EntityManager manager=factory.createEntityManager();
	manager.getTransaction().begin();
	
	Department d1=new Department();
	d1.setDeptNo(10);
	d1.setDname("Account");
	d1.setLocation("HYD");
	
	manager.persist(d1);
	System.out.println("Record inserted");
	
	manager.getTransaction().commit();
	manager.close();
	factory.close();
}
}
