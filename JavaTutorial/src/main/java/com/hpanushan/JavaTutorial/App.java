package com.hpanushan.JavaTutorial;

public class App 
{
    public static void main( String[] args )
    {
    	// Object decleration
    	TimeClass tc = new TimeClass();
    	tc.setTime(2, 23, 56);
    	System.out.println(tc.toMilitaryTime());
    	
    }
    
}
