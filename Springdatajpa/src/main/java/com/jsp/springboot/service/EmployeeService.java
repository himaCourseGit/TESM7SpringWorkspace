package com.jsp.springboot.service;

import java.util.List;

import com.jsp.springboot.dto.EmployeeDTO;

public interface EmployeeService {
int addEmployee(EmployeeDTO e1);

EmployeeDTO searchEmployeeId(int empId);

List<EmployeeDTO> searchEmployeeByName(String ename);

} 
