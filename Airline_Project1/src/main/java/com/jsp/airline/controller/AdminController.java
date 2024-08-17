package com.jsp.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.airline.dto.PassengerDTO;
import com.jsp.airline.service.AdminService;

@RestController
@RequestMapping("api/v1")
public class AdminController {
	@Autowired
	private AdminService adminservice;
	@PostMapping("/passenger")
	public ResponseEntity<String> addPassenger(@RequestBody PassengerDTO dto){
		System.out.println(dto);
		int id=adminservice.addPassenger(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("id is"+id);
}
}
