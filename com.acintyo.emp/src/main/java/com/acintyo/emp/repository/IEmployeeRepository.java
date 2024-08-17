package com.acintyo.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acintyo.emp.entity.Employee;

public interface IEmployeeRepository  extends JpaRepository<Employee, Integer> {

}
