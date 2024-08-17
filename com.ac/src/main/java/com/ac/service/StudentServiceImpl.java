package com.ac.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ac.entity.Student;
import com.ac.repository.IStudentrepository;
@Service
public class StudentServiceImpl implements IStudentservice {
	@Autowired
private IStudentrepository studentrepository;
	
	@Override
	public Student insertStudentData(Student std) {
		Student save=studentrepository.save(std);
		return save;
	}
	@Override
	public List<Student> getStudentData() {
		List<Student> findAll = studentrepository.findAll();
		//Optional<Student> findById = studentrepository.findById(null);
		if(findAll.isEmpty())
		{
			return List.of();
		}
		return findAll;
		
		//public List<Student> getStudentById(){
			//List<Student> findById=studentrepository.findById(null);
			//return findById;
			
			
			
		}
	@Override
	public  Student updateStudentDataById(Student std) {
		
		Optional<Student> findById = studentrepository.findById(std.getId());
		
		if(findById.isPresent())
		{ 
		 
				return findById.get();
				
		}
		else {
			return new Student();
		}		
	}

	//public Student deleteStudentDataById(Student std) {
		// TODO Auto-generated method stub
		//Optional<Student> findById=studentrepository.findById(std.getId());
		//studentrepository.deleteById(id);
		//return null;
	
	//}
	@Override
	public String deleteStudentDataById(Integer  id) {
		if(studentrepository.existsById(id))
		{
			studentrepository.deleteById(id);
			return "student deleted sucessfully";
		}
		return id+" not prasent please provide valid id";
	}
	@Override
	public List<Student> getStudentsByCourseAndFee(String course, Double fee) {
		//List<Student> findByCourseAndFee=studentrepository.findBy(course,fee);
		//if(studentrepository.exists(null))
		return studentrepository.findAll()
			.stream().filter(std->
			std.getCourse().equals("EEE")).collect(Collectors.toList());
		
//		return studentrepository.getStudentsByCourseAndFee(course,fee);
	}
}
