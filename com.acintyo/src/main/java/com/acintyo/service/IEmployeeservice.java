package com.acintyo.service;

import com.acintyo.dto.RequestDto;
import com.acintyo.dto.Response;
import com.acintyo.entity.Employee;

public interface IEmployeeservice {
       public Response insertEmployeeData(RequestDto dto);
       public Employee findByName(String name);
       
       
}
