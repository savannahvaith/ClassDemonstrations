package com.qa.Inheritance;

public class Animal {
	
	private String color = "black"; 
	
	
	public void eat() {
		System.out.println("yum");
	}
	
	public void sleep() {
		System.out.println("catching some zzzz's");
	}
	
	public String changeColour(String colour) {
		this.color = colour; 
		return colour;  
	}
	

}
