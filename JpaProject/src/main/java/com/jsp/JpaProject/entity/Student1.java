package com.jsp.JpaProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
//Entity class or model class
@Entity
public class Student1 {
 /* to represent Primary key*/
	@Id
	private int rollNo;
	private String sname;
	private String stream;
	private double percentage;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", sname=" + sname + ", stream=" + stream + ", percentage=" + percentage
				+ "]";
	}
	
}
