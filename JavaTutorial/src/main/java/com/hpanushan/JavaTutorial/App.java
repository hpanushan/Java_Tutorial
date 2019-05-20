package com.hpanushan.JavaTutorial;

public class App 
{
    public static void main( String[] args )
    {
    	// Object decleration
    	TimeClass tc = new TimeClass();
    	tc.setTime(36, 59, 56);
    	System.out.println(tc.toNormlaTime());
    	
    }
    
}
