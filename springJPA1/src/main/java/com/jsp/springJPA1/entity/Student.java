package com.jsp.springJPA1.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@Table(name="Student")
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer studentid;

	private String studentMail;

	private String studentname;

	private double studentpercentage;

	private String studentstream;

	public Student() {
	}

	public int getStudentid() {
		return this.studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentMail() {
		return this.studentMail;
	}

	public void setStudentMail(String studentMail) {
		this.studentMail = studentMail;
	}

	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public double getStudentpercentage() {
		return this.studentpercentage;
	}

	public void setStudentpercentage(double studentpercentage) {
		this.studentpercentage = studentpercentage;
	}

	public String getStudentstream() {
		return this.studentstream;
	}

	public void setStudentstream(String studentstream) {
		this.studentstream = studentstream;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentMail=" + studentMail + ", studentname=" + studentname
				+ ", studentpercentage=" + studentpercentage + ", studentstream=" + studentstream + "]";
	}
	

}