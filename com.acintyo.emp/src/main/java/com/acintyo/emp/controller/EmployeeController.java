package com.acintyo.emp.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.acintyo.emp.dto.RequestDto;
import com.acintyo.emp.dto.Response;
import com.acintyo.emp.entity.Employee;
import com.acintyo.emp.service.IEmployeeservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	public IEmployeeservice employeeservice;
	
	@PostMapping("/insertemp")
	public ResponseEntity<?> insertEmployeeData(@RequestBody @Valid RequestDto dto){
		Response employee=employeeservice.insertEmployeeData(dto);
		return new ResponseEntity<Response>(employee,HttpStatus.CREATED);
		
	}
	@GetMapping("/getEmployeedata")
	public ResponseEntity<?> getEmployeeData(){
		List<Employee> employeedata=employeeservice.getEmployeeData();
		return new ResponseEntity<List<Employee>>(employeedata,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteEmployeeDataById/{id}")
	public ResponseEntity<?> deleteEmployeeDataById(@PathVariable Integer id){
		String del=employeeservice.deleteEmployeeDataById(id);
		return new ResponseEntity<String>(del,HttpStatus.OK);
		
	}
	
	@PutMapping("/updateEmployeeDataById/{id}")
	public ResponseEntity<Response> updateEmployeeByIdint(@PathVariable Integer id,@RequestBody RequestDto dto){
		Response employee=employeeservice.updateEmployeeDataByIdint(id,dto);
		return new ResponseEntity<Response>(employee,HttpStatus.OK);
		
		
	}
}
