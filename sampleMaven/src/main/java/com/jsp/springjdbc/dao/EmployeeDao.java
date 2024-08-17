package com.jsp.springjdbc.dao;

import java.util.List;

import com.jsp.springjdbc.entity.Employee;

public interface EmployeeDao {
//void insertRecord();
	//In employee object-->store user data
	int insertRecord(Employee emp);
	int deleteById(int id);
	int updateSalary(int id,double salary);
	//to retrieve data
	Employee findByEmployeeId(int id);
	//to retrieve records byusing deptno
	List<Employee> findByDeptNo(int deptno);
}
