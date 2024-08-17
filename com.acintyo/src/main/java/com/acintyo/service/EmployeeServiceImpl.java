package com.acintyo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acintyo.customexceptions.EmployeeAlreadyPresent;
import com.acintyo.customexceptions.EmployeeNotFoundException;
import com.acintyo.customexceptions.Insertedemployeedata;
import com.acintyo.dto.RequestDto;
import com.acintyo.dto.Response;
import com.acintyo.entity.Employee;
import com.acintyo.repository.IEmployeerepository;

@Service
public class EmployeeServiceImpl implements IEmployeeservice {
	@Autowired
	private IEmployeerepository employeerepo;

	@Override
	public Response insertEmployeeData(RequestDto dto) {
		//Employee emp=employeerepo.save(e);
		//Employee e=new Employee();
		//e.setId(rdo.getId());
		//e.setName(rdo.getName());
		//e.setSalary(rdo.getSalary());
		//e.setDepartment(rdo.getDepartment());	
		if(employeerepo.existsById(dto.getId()))
		{
			throw new EmployeeAlreadyPresent("Employee Already Exists with this id"+dto.getId());
		}
		else {
			Employee e=new Employee();
		//Employee employee=employeerepo.save();
			e.setId(dto.getId());
			e.setName(dto.getName());
			e.setSalary(dto.getSalary());
			e.setDepartment(dto.getDepartment());
		 e=employeerepo.save(e);
		 Response response=new Response();
		 response.setStatus(true);
		 response.setMessage("emp registerd ");
		 return response;
		//System.out.println("employee data inserted");
		 
		//throw new Insertedemployeedata("employee data inserted");
		 
	}
	}
	@Override
	public Employee findByName(String name) {
	 Optional<Employee> optional = employeerepo.findByName(name);
	 if(optional.isPresent())
	 {
		 Employee employee = optional.get();
		 return employee;
	 }
	 else
	 {
		 throw new EmployeeNotFoundException("Employee not found");
	 }
	}
	}
	


