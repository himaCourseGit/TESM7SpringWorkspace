package com.ac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ac.entity.Student;
import com.ac.service.IStudentservice;
@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	private IStudentservice studentservice;

	@PostMapping("/insert")
	public ResponseEntity<Student> insertStudentData(@RequestBody Student std) {
		Student student = studentservice.insertStudentData(std);
		return new ResponseEntity<Student>(student, HttpStatus.OK);

	}

	@GetMapping("/getstudentData")
	public ResponseEntity<?> getStudetnData() {
		List<Student> studentData = studentservice.getStudentData();
		return new ResponseEntity<List<Student>>(studentData, HttpStatus.OK);

	}

	@PutMapping("/updateStudentDataById")
	public ResponseEntity<?> updateStudentDataById(@RequestBody Student std) {
		Student student = studentservice.updateStudentDataById(std);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}

	@DeleteMapping("/deleteStudentDataById/{id}")
	public ResponseEntity<String> deleteStudentDataById(@PathVariable Integer id) {
		String data = studentservice.deleteStudentDataById(id);
		 return new ResponseEntity<String>(data,HttpStatus.OK);
		

	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Student>> getStudentsByCourceAndFee(
			@RequestParam String course,
			@RequestParam Double fee){
		List<Student> student=studentservice.getStudentsByCourseAndFee(course, fee);
		return new ResponseEntity<List<Student>>(student,HttpStatus.OK);
		
	}

}
