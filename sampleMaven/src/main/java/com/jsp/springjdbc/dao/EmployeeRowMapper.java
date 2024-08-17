package com.jsp.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jsp.springjdbc.entity.Employee;
//implementation class of RowMapper interface
public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		//to map record of DB with java object
		//create java object of Entity class
		Employee emp=new Employee();
		//retrieve  data from DB
		//int id=rs.nextInt("empId");
		//String name=rs.getString("ename");
		//double sal=rs.getDouble("empsalary");
		//int dept=rs.getInt("deptNo");
		//store data in employee object
		//emp.setEmpId(id);
        //emp.setEname(name);
        //emp.setSalary(sal);
        //emp.setDeptno(dept);
		emp.setEmpId(rs.getInt("empid"));
		emp.setEname(rs.getString("empname"));
		emp.setSalary(rs.getDouble("empsalary"));
		emp.setDeptno(rs.getInt("empdeptno"));
		return emp;
	}

}
