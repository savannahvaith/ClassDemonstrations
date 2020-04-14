package com.qa.polymorphism.overloading;

public class Animal {

	//Polymorphism using Overloading 
	//Overloading the constructor method - having two methods with the same name 
	//but act differently 
	private String name; 
	private int age;
	private int speed; 
	
	public Animal() {};
	
	public Animal(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	public Animal(int speed) {
		this.speed = speed; 
	}
	
	public int run() {
		return speed * 400; 
	}
	
	public int run(int speed3) {
		return speed3 * speed;
	}
	
	
}
