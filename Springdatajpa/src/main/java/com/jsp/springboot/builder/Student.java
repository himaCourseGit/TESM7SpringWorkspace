package com.jsp.springboot.builder;
//Entity class
public class Student {
private int rollNo;
private String name;
private double percentage;
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
}
public Student(int rollNo, String name, double percentage) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.percentage = percentage;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
//inner class
static class StudentBuilder
{
	private int rollNo;
	private String name;
	private double percentage;
	//These are the setter method which are useful to store the data in variables.
	public StudentBuilder setRollNo(int RollNo)
	{
		this.rollNo=rollNo;
		return this;
	}
	public StudentBuilder setName(String name) {
		this.name=name;
		return this;
	}
	public StudentBuilder setPercentage(double percentage) {
		this.percentage=percentage;
		return this;
	}
	//This is a method which will create object of student
	public Student build()
	{
		return new Student (rollNo,name,percentage);
	}
	public StudentBuilder() {
		super();
		//To do Auto generated constructor stub
	}
	public StudentBuilder(int rollNo,String name,double percentage) {
		super();
		this.rollNo=rollNo;
		this.name=name;
		this.percentage=percentage;
	}
}
//To get object of Builder class
public static StudentBuilder builder(){
	return new StudentBuilder();//innner class object
}

}
