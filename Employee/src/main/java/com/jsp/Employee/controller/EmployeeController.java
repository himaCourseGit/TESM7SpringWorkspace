package com.jsp.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Employee.dto.EmployeeDTO;
import com.jsp.Employee.service.EmployeeService;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;

	@PostMapping("/Employee")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDTO dto) {
		System.out.println(dto);
		int id = EmployeeService.addEmployee(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Id is" + id);

	}
}