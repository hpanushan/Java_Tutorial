package com.hpanushan.JavaTutorial;

public class DogList {

	// Creating an array to store objects
	private Dog[] dl = new Dog[5];
	int i = 0;
	
	public void add(Dog d) {
		if (i<dl.length) {
			dl[i] = d;
			System.out.println("Object is added at index of " + i);
			i++;
		}
	}
	
	
}
