package com.jsp.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.springboot.dto.AddressDTO;
import com.jsp.springboot.dto.EmployeeDTO;
import com.jsp.springboot.service.EmployeeService;
import com.jsp.springboot.service.EmployeeServiceImpl;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringdatajpaApplication.class, args);
		EmployeeService service=context.getBean(EmployeeServiceImpl.class);
		EmployeeDTO dto=service.searchEmployeeId(1);
		if(dto!=null) {
			System.out.println(dto.getEname());
			System.out.println(dto.getSalary());
			List<AddressDTO> addresses=dto.getAddresses();
			if(addresses.isEmpty()) {
				System.err.println("no records found...");
			}else {
				addresses.forEach(t ->{
					System.out.println("Area-"+t.getArea());
					System.out.println("City-"+t.getCity());
				});
			}
			
		}
		else {
			System.out.println("NO RECORDS FOUND........");
		}
		AddressDTO a1=new AddressDTO();
		a1.setArea("demo");
		a1.setCity("ktdm");
		
		AddressDTO a2=new AddressDTO();
		a1.setArea("sample");
		a1.setCity("pvc");
		
		List<AddressDTO> addressDTOs=new ArrayList<>();
		addressDTOs.add(a1);
		addressDTOs.add(a2);
		
		EmployeeDTO dto1=new EmployeeDTO();
		dto1.setEname("QWERTY");
		dto1.setSalary(50000);
		dto1.setAddresses(addressDTOs);

		int id=service.addEmployee(dto1);
		System.out.println("Employee id="+id);
	}

}
