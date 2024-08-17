package com.le.springdataquerymodify.service;

import java.util.List;
import java.util.Optional;

import com.le.springdataquerymodify.Entity.EmployeeQuery;

public interface employeequeryservice {
	 
public EmployeeQuery insertEmployee(EmployeeQuery empq);
public List<EmployeeQuery>  getemployeedata();
public List<EmployeeQuery> getemployeedatabyactivestatusandDesignation(Boolean activestate,List<String> designationlist);
public int updateemployeeById(Boolean activestate,List<Long> empidlist);
}
