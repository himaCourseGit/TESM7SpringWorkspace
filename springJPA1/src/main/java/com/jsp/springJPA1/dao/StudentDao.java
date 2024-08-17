package com.jsp.springJPA1.dao;

import java.util.List;

import com.jsp.springJPA1.entity.Student;

public interface StudentDao {
	Student addStudent(Student s1);

	Student fetchDataById(int rollNo);

	List<Student> fetchAllStudentDetails();

	Student updatePercentageByRollNo(int rollNo, double percentage);

	int deleteByRollNo(int rollNo);

	List<Student> fetchStudentDataByStream(String stream);

	List<Student> fetchDataByPercentage(int percentage);

	boolean deleteBystudentstream(String stream);

	Student fetchDataByRollNoandName(int rollNo, String name);

	
}
