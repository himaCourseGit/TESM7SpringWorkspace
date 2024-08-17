package com.acintyo.emp.customexceptions;

public class EmployeeAlreadyPresent extends RuntimeException {
	public EmployeeAlreadyPresent(String message) {
		super(message);
	}

}
