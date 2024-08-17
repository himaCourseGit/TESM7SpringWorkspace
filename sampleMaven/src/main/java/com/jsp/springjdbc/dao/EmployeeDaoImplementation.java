package com.jsp.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.springjdbc.entity.Employee;
@Component
public class EmployeeDaoImplementation implements EmployeeDao {
	@Autowired
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int insertRecord(Employee emp) {
		String query="insert into employee values(?,?,?,?)";
		int record=template.update(query,emp.getEmpId(),emp.getEname(),emp.getSalary(),emp.getDeptno());
		return record;
	}

	public int deleteById(int id) {
		String query="delete from employee where empid=?";
		int record=template.update(query,id);
		return record;
	}
	public int updateSalary(int id,double salary) {
		String query="update employee set empsalary=? where empid=?";
		int record=template.update(query,salary,id);
		return record;
	}

	public Employee findByEmployeeId(int id) {
		//To do Auto-Generated methpd stub
		String query="select * from Employee where empid=?";
		//Access RowMapper
		RowMapper<Employee> rm=new EmployeeRowMapper();
		//execute query (queryForObject method return type is same as mapRow method)
		try {
	//throw exceptiopn if use enters invalid data
			Employee emp=template.queryForObject(query,rm,id);
		return emp;
		}
		catch(Exception e) {
			//to handle exception
			return null;
			
		}
	}
public List<Employee> findByDeptNo(int deptNo){
	String  query="select * from employee where empdeptno=?";
	RowMapper<Employee>rm=new EmployeeRowMapper();
	List<Employee>list=template.query(query,rm,deptNo);
	return list;
	
	
}
	
	
	/*public void insertRecord() {
		//code to insert record in db
		String query="insert into employee values(1009,'ABC',40000,20)";
		int record=template.update(query);
	System.out.println("no.of records inserted:"+record);
		
	}*/
	
	

	
	

}
