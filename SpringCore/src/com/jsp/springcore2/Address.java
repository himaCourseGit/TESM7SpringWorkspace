package com.jsp.springcore2;

public class Address {
              private int plotNo;
              private String area;
			public Address(int plotNo, String area) {
				super();
				this.plotNo = plotNo;
				this.area = area;
				System.out.println("Address object created by constructorwith argument");
			}
			public void getAddress()
			{
				System.out.println("plot No="+ plotNo +",Area=" + area);
			}
			
}
