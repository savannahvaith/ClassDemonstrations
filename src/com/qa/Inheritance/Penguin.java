package com.qa.Inheritance;

public class Penguin extends Bird {

	private int flippers; 
	
	public Penguin(String feather, int flippers) {
		super(feather);
		this.flippers = flippers; 
	}
	
	
	public void swim() {
		System.out.println("Splash");
	}
	
	public void dance() {
		System.out.println("tap tap tap ");
	}

	
	
}
