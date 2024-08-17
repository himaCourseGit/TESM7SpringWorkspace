package com.jsp.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.springboot.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{
	/*
	 * Customize find method
	 * List<Employee> findByEmpName(String name);
	 */
	//to write query
	@Query(" SELECT e1 FROM Employee e1 " + " WHERE e1.empName =: en ")
	List<Employee> findByEmployeeName(@Param("en") String name);

}
