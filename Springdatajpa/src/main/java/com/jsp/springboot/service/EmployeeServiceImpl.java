package com.jsp.springboot.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.dialect.Oracle10gDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot.dto.AddressDTO;
import com.jsp.springboot.dto.EmployeeDTO;
import com.jsp.springboot.entity.Address;
import com.jsp.springboot.entity.Employee;
import com.jsp.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
private EmployeeRepository repo;
@Override
public int addEmployee(EmployeeDTO e1) {
	//by using stream api
	//convert list of addressDto to list address entity
	//t represents reference variable of addressdto
	List<Address> listofAddresses=e1.getAddresses().stream().map(t-> Address.builder().area(t.getArea()).city(t.getCity()).build()).collect(Collectors.toList());

	Employee employee=Employee.builder().empName(e1.getEname()).salary(e1.getSalary()).addresses(null).build();
	
	//by using foreach loop
	/*for(Address assress:ListofAddress);
	 * {
	 * add employee object in address
	 * object address.setEmployee(employee);
	 * }
	 */
	listofAddresses.forEach(t->t.setEmployee(employee));
	return repo.save(employee).getEmpId();
	
}
@Override
public EmployeeDTO searchEmployeeId(int empId) {
	// TODO Auto-generated method stub
	//to fetch data
	Optional<Employee> optional=repo.findById(empId);
	//to check whether data is present or not
	if(optional.isPresent()) {
		Employee employeedb=optional.get();
		EmployeeDTO empDto=EmployeeDTO.builder().ename(employeedb.getEmpName()).salary(employeedb.getSalary()).addresses(employeedb.getAddresses().stream()
				.map(t->AddressDTO.builder().area(t.getArea()).city(t.getCity()).build()).collect(Collectors.toList())).build();
		return empDto;
	}
	else
	{
		return null;
	}
}
@Override
public List<EmployeeDTO> searchEmployeeByName(String ename) {
	// TODO Auto-generated method stub
	List<Employee> employeeFromDb=repo.findByEmployeeName(ename);
	List<EmployeeDTO> employees=employeeFromDb.stream().map(t-> EmployeeDTO.builder()
			.ename(t.getEmpName())
			.salary(t.getSalary())
			.addresses(t.getAddresses().stream().map(a -> AddressDTO.builder()
					.area(a.getArea())
					.city(a.getCity())
					.build()).collect(Collectors.toList()))
			.build()).collect(Collectors.toList());
			
			
	return employees;
}
}
