package com.jsp.javaBasedAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//Description of object
@Component //Object is created
public class Department {
@Value("10")
private int deptNo;
private  String location;
@Value("HYD")
public void setlocation(String location) {
	this.location=location;
}
@Override
public String toString() {
	return "Department [deptNo=" + deptNo + ", location=" + location + "]";
}
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
public String getLocation() {
	return location;
}
//public void setLocation(String location) {
	//this.location = location;
//}
}
