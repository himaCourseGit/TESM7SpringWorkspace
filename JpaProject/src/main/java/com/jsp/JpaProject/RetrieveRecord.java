package com.jsp.JpaProject;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.JpaProject.entity.Student1;

public class RetrieveRecord {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("JpaProject");
	EntityManager manager=factory.createEntityManager();
	manager.getTransaction().begin();

	//retrieve data of student Based on Roll NO
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Roll No : ");
	Student1 s1=manager.find(Student1.class,sc.nextInt());
	if(s1!=null) {
		System.out.println(s1);
	//update data
	System.out.println("Enter percentage : ");
	s1.setPercentage(sc.nextDouble());
	System.out.println("PERCENATGE UPDATED");
	}else{
		System.out.println("nO RECORDS FOUND");
	}
	manager.getTransaction().commit();
	manager.close();
	factory.close();
}
}