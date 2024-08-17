package org.jsp.setterinjection;

public class College {
private int clgId;
private String clgName;
public College(int clgId, String clgName) {
	super();
	this.clgId = clgId;
	this.clgName = clgName;
	System.out.println("constructor with 2 arguments of college class");
}
@Override
public String toString() {
	return "College [clgId=" + clgId + ", clgName=" + clgName + "]";
}


}
