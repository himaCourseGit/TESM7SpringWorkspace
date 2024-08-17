package com.jsp.JpaProject.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the teacher database table.
 * 
 */
@Entity
@NamedQuery(name="Teacher.findAll", query="SELECT t FROM Teacher t")
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;

	private String teadept;
@Id
	private int teaid;

	private String teaname;

	private String teasal;

	public Teacher() {
	}

	public String getTeadept() {
		return this.teadept;
	}

	public void setTeadept(String teadept) {
		this.teadept = teadept;
	}

	public int getTeaid() {
		return this.teaid;
	}

	public void setTeaid(int teaid) {
		this.teaid = teaid;
	}

	public String getTeaname() {
		return this.teaname;
	}

	public void setTeaname(String teaname) {
		this.teaname = teaname;
	}

	public String getTeasal() {
		return this.teasal;
	}

	public void setTeasal(String teasal) {
		this.teasal = teasal;
	}

}