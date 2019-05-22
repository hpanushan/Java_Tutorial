package com.hpanushan.JavaTutorial;

public class App 
{
    public static void main( String[] args )
    {
    	
    	AnimalList alo = new AnimalList();
    	
    	// Creating objects
    	Fish obj1 = new Fish();
    	Dog obj2 = new Dog();
    	
    	// Adding different objects to same array
    	alo.add(obj1);
    	alo.add(obj2);
    	
    }
    
}
