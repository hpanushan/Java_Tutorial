package com.hpanushan.JavaTutorial;

public class App 
{
    public static void main( String[] args )
    {
    	// Polymorphism array
        Food[] arr = new Food[2];
        
        //Assigning values to array
        arr[0] = new Cake();
        arr[1] = new Pizza();
        
        for(int i=0;i<arr.length;i++) {
        	arr[i].eat();
        }
        
    }
}
