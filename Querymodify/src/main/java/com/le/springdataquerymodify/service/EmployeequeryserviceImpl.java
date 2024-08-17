package com.le.springdataquerymodify.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.le.springdataquerymodify.Entity.EmployeeQuery;
import com.le.springdataquerymodify.repository.EmployeeQueryrepository;

import jakarta.transaction.Transactional;
@Transactional
@Service
public class EmployeequeryserviceImpl implements employeequeryservice {
	
	@Autowired
	 private EmployeeQueryrepository repo;

	@Override
	public EmployeeQuery insertEmployee(EmployeeQuery empq) {
		EmployeeQuery save=repo.save(empq);
		return save ;
	}

	@Override
	public List<EmployeeQuery> getemployeedata() {
	return repo.findallempoyeequery();
	}

	@Override
	public List<EmployeeQuery> getemployeedatabyactivestatusandDesignation(Boolean activestate,List<String> designationlist) {
		return repo.findallEmployeeQuerybyactivestatusanddesignation(activestate,designationlist,Sort.by("name"));
	}

	@Override
	public int updateemployeeById(Boolean activestate, List<Long> empidlist) {
		return repo.updateemployeestateByEmployeeId(activestate, empidlist);
	}

	
	
}
