package com.hpanushan.JavaTutorial;

public class App 
{
    public static void main( String[] args )
    {
    	Fatty ob = new Fatty();
    	
    	Cake c = new Cake();
    	ob.digest(c);		// This method can get any sub class object as argument
    	Pizza p = new Pizza();
    	ob.digest(p);		// This method can get any sub class object as argument
        
    }
}
