package com.qa.Inheritance;

public class Bird extends Animal{

	private String feathers; 
	
	public Bird(String feathers) {
		this.feathers = feathers; 
	}
	
	public void layEggs() {
		System.out.println("Laying eggs");
	}
	
	
}
