package com.jsp.springcore2;

public class Employee {
private int empId;
private String ename;
private double salary;
/* ref var of Address(UserDefined non Primitive Datatype)*/
private Address address;
private Department dept;


public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
	System.out.println("Setter method of Address");
}
public Employee(int empId, String ename, double salary, Address address, Department dept) {
	super();
	this.empId = empId;
	this.ename = ename;
	this.salary = salary;
	this.address = address;
	this.dept = dept;
	System.out.println("constructor object is created with 5 arguments");
}
public void displayAddress()
{
	address.getAddress();
}
public Employee(int empId, String ename, double salary, Address address) {
	super();
	this.empId = empId;
	this.ename = ename;
	this.salary = salary;
	this.address = address;
}
public Employee(int empId, String ename, double salary) {
	super();
	this.empId = empId;
	this.ename = ename;
	this.salary = salary;
}
public void displayDept()
{
	dept.getDept();	
}

public Employee() {
	System.out.println("Default Constructor of Employee...");
	System.out.println("object created");
}

public Employee(int empId) {
	super();
	this.empId = empId;
	System.out.println("Constructor with 1 argument");
	System.out.println("Object created....");
}
@Override
public String toString() {
	return "Employee [empId="+empId +"ename="+ename +"salary="+salary +"]";
}
}




