package com.jsp.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.springboot.dto.EmployeeDTO;
import com.jsp.springboot.service.EmployeeService;
import com.jsp.springboot.service.EmployeeServiceImpl;
@SpringBootApplication
public class FetchDataOfEmployee {
public static void main(String[] args) {
	ConfigurableApplicationContext context=SpringApplication.run(FetchDataOfEmployee.class, args);
	EmployeeService service=context.getBean(EmployeeServiceImpl.class);
	List<EmployeeDTO> employees=service.searchEmployeeByName("QWERTY");
	if(employees.isEmpty()) {
		System.err.println("No records found");
	}
	else {
		//fetch employee
		employees.forEach(t->{
			System.out.println("Employee name="+t.getEname());
			System.out.println("salary="+t.getSalary());
			//fetch address list
			if(t.getAddresses().isEmpty()) {
				System.out.println("no addresses list out for employee.");
			}
			else {
				t.getAddresses().forEach(a->{
					System.out.println("Address={area="+a.getArea()+",city="+a.getCity()+")");
				});
			}
			System.out.println("____________________________-");
			
		});
	}
}
}
