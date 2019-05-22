package com.hpanushan.JavaTutorial;

public class Employee {
	
	private int sum;
	private final int NUMBER;
	
	public Employee(int num) {
		this.NUMBER = num;
	}
	
	public void add(int n) {
		for (int i=1; i<=n; i++) {
			sum += NUMBER;
			System.out.println("Summation = " + sum);
		}
	}
	
}
