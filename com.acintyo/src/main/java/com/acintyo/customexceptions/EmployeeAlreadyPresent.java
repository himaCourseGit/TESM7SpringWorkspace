package com.acintyo.customexceptions;

public class EmployeeAlreadyPresent extends RuntimeException {
	public EmployeeAlreadyPresent() {
		super();
	}
	public EmployeeAlreadyPresent( String message) {
		super(message);
	}

}
