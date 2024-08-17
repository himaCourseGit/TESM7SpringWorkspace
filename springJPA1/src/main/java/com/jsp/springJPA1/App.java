package com.jsp.springJPA1;


import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.springJPA1.Configuration.AppConfig;
import com.jsp.springJPA1.dao.StudentDao;
import com.jsp.springJPA1.dao.StudentDaoImpl;
import com.jsp.springJPA1.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       StudentDao dao=context.getBean(StudentDaoImpl.class);
       	Scanner sc=new Scanner(System.in);
       	System.out.println("Enter 1 for student registration");
       	System.out.println("Enter 2 for search student by id");
       	System.out.println("Enter 3 for display all student details");
       	System.out.println(("Enter 4 for update percentage"));
       	System.out.println("Enter 5 for delete by rollno");
       	System.out.println("Enter 6 for display student based on stream..");
       	System.out.println(("Enter 7 for display student based on percentage.."));
       	System.out.println("Enter 8 for delete student based on stream");
       	System.out.println("Enter 9 for display student by rollno and name");
       	System.out.println("Enter valid option");
       	int option=sc.nextInt();
       	switch (option) {
       	case 1:
       	Student s1=new Student();
       	System.out.println("Enter Roll no:");
       	s1.setStudentid(sc.nextInt());
       	System.out.println("Enter name:");
       	s1.setStudentname(sc.next());
       	System.out.println("Enter stream:");
       	s1.setStudentstream(sc.next());
       	System.out.println("Enter percentage:");
       	s1.setStudentpercentage(sc.nextDouble());
       	
       	Student output=dao.addStudent(s1);
       	System.out.println("record inserted");
       	System.out.println(s1);
       break;
       	case 2:
       		System.out.println("Enter Roll no:");
       		Student student=dao.fetchDataById(sc.nextInt());
       		if(student!=null) {
       			System.out.println(student);
       		}
       		else {
       			System.out.println("No records found");
       		}
       		break;
       	case 3:
        		List<Student> studentList=dao.fetchAllStudentDetails();
        		for (Student student2 : studentList) {
					System.out.println(student2);
					System.out.println("_________________________________________");
				}
       	case 4:
       		System.out.println("Enter rollno:");
       		int rn=sc.nextInt();
       		System.out.println("Enter percentage");
       		double marks=sc.nextDouble();
       		Student s2=dao.updatePercentageByRollNo(rn, marks);
       		System.out.println(s2);
       		System.out.println("Percentage updated");
       		break;
       	case 5:
       		System.out.println("Enter Roll No");
       	int status=dao.deleteByRollNo(sc.nextInt());
       	if(status!=0) {
       		System.out.println("Deleted...");
       	}
       	else {
       		System.err.println("No records found...");
       	}
       	break;
       	case 6:
       		System.out.println("Enter stream...");
       		List<Student> studentList1=dao.fetchStudentDataByStream(sc.next());
       		if(studentList1.size()!=0) {
       			for (Student student2 : studentList1) {
       				System.out.println(student2);
       				System.out.println("______________________________________________________");
					
				}
       		}
       		else {
       			System.err.println("No records found....");
       		}
       		break;
       	case 7:
       		System.out.println("Enter percentage..");
       		List<Student> studentList3=dao.fetchDataByPercentage(sc.nextInt());
       		if(studentList3.size()!=0) {
       			for (Student student2: studentList3) {
					System.out.println(student2);
					System.out.println("______________________________");
				}
       		}
       		else {
       			System.out.println("no RECORDS found.....");
       		}
       		break;
       	case 8:
       		System.out.println("Enter stream");
       		boolean status1=dao.deleteBystudentstream(sc.next());
       		if(status1) {
       			System.out.println("Records are deleted..");
       		}else {
       			System.out.println("No records found....");
       		}
       		break;
       	case 9:
       		System.out.println("Enter Roll No..");
       		int rollNo=sc.nextInt();
       		System.out.println("Enter Name");
       		String name=sc.next();
       		Student student1=dao.fetchDataByRollNoandName(rollNo, name);
       		if(student1!=null) {
       			System.out.println(student1);
       		}else {
       			System.err.println("Invalid credentials");
       		}
       		break;
       		
       	
       		default:
       			System.err.println("please enter valid option");
       			break;
       	}
    }
}
