package com.jsp.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.airline.dto.UserDTO;
import com.jsp.airline.service.UserService;

@RestController
@RequestMapping("api/v1")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody UserDTO dto){
		System.out.println(dto);
		
		int id=userservice.addUser(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Id is:"+id);
	}
}
