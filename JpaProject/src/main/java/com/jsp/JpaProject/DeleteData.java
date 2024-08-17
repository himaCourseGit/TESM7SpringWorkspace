package com.jsp.JpaProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.JpaProject.entity.Student1;


public class DeleteData {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaProject");
	EntityManager manager=factory.createEntityManager();
	manager.getTransaction().begin();
	//delete record by using id
	//find it
	Student1 s2=manager.find(Student1.class, 101);
	if(s2!=null) {
		
		//delete it
		manager.remove(s2);
		System.out.println("record deleted");
	}else {
		System.err.println("no records found");
	}
	manager.getTransaction().commit();
	manager.close();
	factory.close();
	
	
}
}
