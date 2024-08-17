package com.jsp.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
