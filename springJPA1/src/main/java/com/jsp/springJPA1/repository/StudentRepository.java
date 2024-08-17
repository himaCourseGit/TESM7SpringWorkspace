package com.jsp.springJPA1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springJPA1.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
//JPArepository - methods-save,find,findall
	//	Customized find methods
	List<Student> fetchStudentDataByStream(String stream);
	List<Student> fetchDataByPercentage(int percentage);
	//Create a method to display student records if student name contains given letter
	//create a method to display student records if percentage is less then or equal to given number
	//create a method to dispaly student records if given name and roll no are present in db
	Student fetchDataByRollNoandName(int rollNo,String name);
	Student updatePercentageByRollNo(int rollNo, double percentage);
	boolean deleteBystudentstream(String stream);
	
}
