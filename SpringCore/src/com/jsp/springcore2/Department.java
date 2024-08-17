package com.jsp.springcore2;

public class Department 
{
private int deptno;
private String dname;
public Department(int deptno, String dname) {
	super();
	this.deptno = deptno;
	this.dname = dname;
}
public void getDept()
{
	System.out.println("deptno : "+deptno +" ,dname : "+dname);
}
}
