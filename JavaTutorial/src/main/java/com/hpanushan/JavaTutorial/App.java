package com.hpanushan.JavaTutorial;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println(average(1,45,7,69)); 
    }
    
    public static float average(int... x) {
    	float total = 0;
    	
    	for (int i:x) {
    		total = total + i;
    	}
    	
    	return total/x.length;
    }
}
