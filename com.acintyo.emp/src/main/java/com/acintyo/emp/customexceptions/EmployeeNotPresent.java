package com.acintyo.emp.customexceptions;

public class EmployeeNotPresent extends RuntimeException {
	public EmployeeNotPresent(String message) {
		super(message);
	}

}
