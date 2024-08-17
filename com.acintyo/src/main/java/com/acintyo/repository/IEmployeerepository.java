package com.acintyo.repository;

import java.util.Optional;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acintyo.entity.Employee;

public interface IEmployeerepository extends JpaRepository<Employee,Integer> {
	
	Optional<Employee> findByName(String name);
	
	

}
