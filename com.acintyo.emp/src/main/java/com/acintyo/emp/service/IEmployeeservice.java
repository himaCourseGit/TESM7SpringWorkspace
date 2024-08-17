package com.acintyo.emp.service;

import java.util.List;

import com.acintyo.emp.dto.RequestDto;
import com.acintyo.emp.dto.Response;
import com.acintyo.emp.entity.Employee;

public interface IEmployeeservice {
 public Response insertEmployeeData(RequestDto dto);
 public List<Employee> getEmployeeData();
 public Response updateEmployeeDataByIdint(Integer id,RequestDto dto);
 public String deleteEmployeeDataById(Integer id);

}
