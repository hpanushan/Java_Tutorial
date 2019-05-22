package com.hpanushan.JavaTutorial;

public class AnimalList {
	
	private Animal[] al = new Animal[5];
	private int i = 0;
	
	public void add(Animal a) {
		if (i<al.length) {
			al[i] = a;
			System.out.println("Object is added at index of " + i);
			i++;
		}
	}

}
