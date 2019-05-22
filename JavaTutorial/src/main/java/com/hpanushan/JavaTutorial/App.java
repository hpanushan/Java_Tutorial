package com.hpanushan.JavaTutorial;

public class App 
{
    public static void main( String[] args )
    {
    	// Reading static variable
    	System.out.println(Employee.getMember());
    	
    	// Craeting first object
    	Employee member1 = new Employee("Anushan","Ramesh");
    	// Creating second object
    	Employee member2 = new Employee("Nimesh","Buwenaka");
    	
    	System.out.println(member1.getFname());
    	System.out.println(member1.getLname());
    	// Using static method
    	System.out.println(Employee.getMember());
    }
    
}
