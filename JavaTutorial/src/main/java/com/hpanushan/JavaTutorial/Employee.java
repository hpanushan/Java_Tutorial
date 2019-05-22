package com.hpanushan.JavaTutorial;

public class Employee {
	
	private String fname;
	private String lname;
	private static int member = 0;		// The memory element
	
	public Employee(String fn, String ln) {
		this.fname = fn;
		this.lname = ln;
		member++;
		System.out.printf("%s %s is the %s member.\n", fname,lname,member);
	}

}
