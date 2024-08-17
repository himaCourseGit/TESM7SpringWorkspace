package com.ac.service;

import java.util.List;
import java.util.Optional;

import com.ac.entity.Student;

public interface IStudentservice {
	
	public Student insertStudentData(Student std);

	public List<Student> getStudentData();

	public  Student updateStudentDataById(Student std);
	
	//public void deleteStudentDataById(Student std);

	//public Student deleteStudentDataById( Student std);

	public String deleteStudentDataById(Integer id);
	
	public List<Student> getStudentsByCourseAndFee(String course,Double fee);
	
}
