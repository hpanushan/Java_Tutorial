package com.hpanushan.JavaTutorial;

public class Employee {
	
	private String fname;
	private String lname;
	private static int member = 0;		// The memory element
	
	public Employee(String fn, String ln) {
		this.fname = fn;
		this.lname = ln;
		member++;
	}
	
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}
	
	public static int getMember() {
		return member;
	}
}
