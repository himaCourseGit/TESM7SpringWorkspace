package com.le.springdatajpamappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.le.springdatajpamappings.Entity.Employeeee;
import com.le.springdatajpamappings.repository.EmployeeRepository;
@RestController

public class EmployeeController {
	@Autowired
	private EmployeeRepository repo;
	
	@PostMapping("saveEmployee")
	public ResponseEntity<String> saveEmployees(@RequestBody List<Employeeee> empdata){
		repo.saveAll(empdata);
		return ResponseEntity.ok("Datasaved");
		
	}
	

}
