package com.jsp.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userinfo")
public class UserInfo1 {
	@Column(name="firstname")
private String firstname;
	@Column(name="lastname")
	private String lasttname;
@Id
@Column(name="email")
private String email;
@Column(name="mobileno")
private String mobileno;
@Column(name="password")
private String password;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLasttname() {
	return lasttname;
}
public void setLasttname(String lasttname) {
	this.lasttname = lasttname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "UserInfo1 [firstname=" + firstname + ", lasttname=" + lasttname + ", email=" + email + ", mobileno="
			+ mobileno + ", password=" + password + "]";
}


}
