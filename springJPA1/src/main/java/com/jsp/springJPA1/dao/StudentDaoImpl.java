package com.jsp.springJPA1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springJPA1.entity.Student;
import com.jsp.springJPA1.repository.StudentRepository;

@Service
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private StudentRepository repo;

	public Student addStudent(Student s1) {
		Student student=repo.save(s1);
		return s1;
	}

	public Student fetchDataById(int rollNo) {
	Optional<Student> optional=repo.findById(rollNo);
	Student s1=optional.get();
	try {
		Student student=repo.findById(rollNo).get();
		return student;
	}
		catch(Exception e) {
			return null;
		}
		
	}

	public List<Student> fetchAllStudentDetails() {
		List<Student> result=repo.findAll();
		return result;
	}

	public Student updatePercentageByRollNo(int rollNo, double percentage) {
		try {
			Student s1=repo.findById(rollNo).get();
			s1.setStudentpercentage(percentage);
			Student updateStudent=repo.save(s1);
			return s1;
			
		}
		catch(Exception e)
		{
			
			return null;
			
		}
		
		//return repo.updatePercentageByRollNo(rollNo, percentage);
		
	
	}

	public int deleteByRollNo(int rollNo) {
		if(repo.existsById(rollNo))
		{
		repo.deleteById(rollNo);
		}
		return 0;
	}

	public List<Student> fetchStudentDataByStream(String stream) {
		List<Student> s1=repo.fetchStudentDataByStream(stream);
		return s1;
	}

	public List<Student> fetchDataByPercentage(int percentage) {
		List<Student> s1=repo.fetchDataByPercentage(percentage);
		return s1;
	}

	public boolean deleteBystudentstream(String stream) {
	List<Student> studentlist=	repo.fetchStudentDataByStream(stream);
	if(studentlist.size()>0)
	{
		repo.deleteAll(studentlist);
		return true;
	}
	else {
		return false;
	}
	}

	public Student fetchDataByRollNoandName(int rollNo, String name) {
		Student std=repo.fetchDataByRollNoandName(rollNo, name);
		return std;
	}

}
