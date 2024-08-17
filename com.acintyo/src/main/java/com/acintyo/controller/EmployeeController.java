package com.acintyo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acintyo.dto.RequestDto;
import com.acintyo.dto.Response;
import com.acintyo.entity.Employee;
import com.acintyo.service.IEmployeeservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private IEmployeeservice employeeservice;

	@PostMapping("/insert")
	public ResponseEntity<?> insertEmployeeData(@RequestBody @Valid RequestDto dto) {

		Response employee = employeeservice.insertEmployeeData(dto);
		return new ResponseEntity<Response>(employee, HttpStatus.CREATED);
	}

	/*
	 * @PostMapping("/get") public ResponseEntity<Optional<Employee>>
	 * findByName(String name)throws Exception{ Optional<Employee>
	 * get=employeeservice.findByName(name); return new
	 * ResponseEntity<Optional<Employee>>(get,HttpStatus.OK);
	 * 
	 * }
	 */
	@GetMapping("/get")
	public ResponseEntity<Employee> getEmployeeByName(@RequestParam String name) {
		Employee employee = employeeservice.findByName(name);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

}
