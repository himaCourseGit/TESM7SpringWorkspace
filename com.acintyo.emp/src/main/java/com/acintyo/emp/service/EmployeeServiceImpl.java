package com.acintyo.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acintyo.emp.customexceptions.EmployeeAlreadyPresent;
import com.acintyo.emp.customexceptions.EmployeeIdNotExist;
import com.acintyo.emp.customexceptions.EmployeeNotPresent;
import com.acintyo.emp.customexceptions.EmployeesDataNotFound;
import com.acintyo.emp.dto.RequestDto;
import com.acintyo.emp.dto.Response;
import com.acintyo.emp.dto.ResponseDto;
import com.acintyo.emp.entity.Employee;
import com.acintyo.emp.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeservice {
	@Autowired
	private IEmployeeRepository repository;

	@Override
	public Response insertEmployeeData(RequestDto dto) {
		if(repository.existsById(dto.getId()))
		{
			throw new EmployeeAlreadyPresent("Employee already exists with this id"+dto.getId());
		}
		else{
			Employee emp=new Employee();
			emp.setId(dto.getId());
			emp.setName(dto.getName());
			emp.setDepartment(dto.getDepartment());
			emp.setSalary(dto.getSalary());
			emp=repository.save(emp);
			ResponseDto responsedto=new ResponseDto();
			responsedto.setId(emp.getId());
			responsedto.setName(emp.getName());
			responsedto.setSalary(emp.getSalary());
			responsedto.setDepartment(emp.getDepartment());
			Response response=new Response();
			response.setStatus(true);
			response.setMessage("Emp Registered and saved the data");
			response.setData(responsedto);
			return response;		
		}
			
	}

	@Override
	public List<Employee> getEmployeeData() {
		List<Employee> findall=repository.findAll();
		if(findall.isEmpty())
		{
			throw new EmployeesDataNotFound("Employees data is not exist");
		}
		else {
			return findall;
		}
	}

	@Override
	public String deleteEmployeeDataById(Integer id) {
		if(repository.existsById(id))
		{
			repository.deleteById(id);
			return "Employee deleted sucessfully";
		}
		//return id+"is not present please provide valid id";
		throw new EmployeeNotPresent("employeeid is not exists");
	}

	@Override
	public Response updateEmployeeDataByIdint(Integer id,RequestDto dto) {
		Optional<Employee> findById=repository.findById(id);
		if(findById.isPresent()) {
			Employee emp1=findById.get();
			emp1.setName(dto.getName());
			emp1.setSalary(dto.getSalary());
			emp1.setDepartment(dto.getDepartment());
			emp1=repository.save(emp1);
			ResponseDto responsedto1=new ResponseDto();
			responsedto1.setId(emp1.getId());
			responsedto1.setName(emp1.getName());
			responsedto1.setDepartment(emp1.getDepartment());
			responsedto1.setSalary(emp1.getSalary());
			Response response=new Response();
			response.setStatus(true);
			response.setMessage("Employee data updated and saved the data");
			response.setData(responsedto1);
			return response;
		}
		else {
			throw new EmployeeIdNotExist("Employee id is not exists");
	}
		
	
}
}
