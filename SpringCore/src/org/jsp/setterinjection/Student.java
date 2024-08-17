package org.jsp.setterinjection;

public class Student {
private int rollNo;
private String name;
//ref var of college
private College college;




public College getCollege() {
	return college;
}

public void setCollege(College college) {
	this.college = college;
	System.out.println("setter method of college");
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", college=" + college + "]";
}

public Student() {
	super();
	System.out.println("Default constructor of student class..");
}
public int getRollNo() {
	return rollNo;
	
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
	System.out.println("Setter METHOD OF Rollno...");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println("Setter method of name");
}

}
