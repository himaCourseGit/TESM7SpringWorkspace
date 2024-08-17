package com.jsp.JpaProject;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.JpaProject.entity.Student1;

public class App 
{
    public static void main( String[] args )
    {
        //Access connection in java program
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("JpaProject");
    	System.out.println("Connection established...");
    	//Create a platform - carry states of an objet from java app to DB
    	EntityManager manager=factory.createEntityManager();
    	System.out.println("Platform created..");
    	//get transaction-perform operation on database
    	//EntityTransaction transaction=manager.getTransaction();
    //	//start transaction
    	//transaction.begin();
    	manager.getTransaction().begin();
    	System.out.println("Transaction started...");
    	Scanner sc=new Scanner(System.in);
    	//insert operation
    	Student1 s1=new Student1();
    	System.out.println("Enter Roll No : ");
    	s1.setRollNo(sc.nextInt());
    	System.out.println("Enter Name : ");
    	s1.setSname(sc.next());
    	System.out.println("Enter percentage : ");
    	s1.setPercentage(sc.nextDouble());
    	System.out.println("Enter Stream : ");
    	s1.setStream(sc.next());
    	//s1.setRollNo(101);
    	//s1.setSname("XYZ");
    	//s1.setPercentage(89.99);
    	//s1.setStream("CSE");
    	//store state of an object in DB or insert data in DB
    	manager.persist(s1);
    	System.out.println("Record Inserted");
    	
    	//save transaction
    	//transaction.commit();
    	manager.getTransaction().commit();
    	System.out.println("Transaction saved..");
    	manager.close();
    	factory.close();
    	System.out.println("closed...");
    }
}
