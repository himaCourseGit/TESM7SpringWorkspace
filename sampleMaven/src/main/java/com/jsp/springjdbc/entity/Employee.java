package com.jsp.springjdbc.entity;
//Entity class/Model class
public class Employee {
private int empId;
private String ename;
private double salary;
private int deptno;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", ename=" + ename + ", salary=" + salary + ", deptno=" + deptno + "]";
}

}
