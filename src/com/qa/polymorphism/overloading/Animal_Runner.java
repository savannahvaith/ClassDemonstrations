package com.qa.polymorphism.overloading;

public class Animal_Runner {

	
	public static void main(String[] args) {
		
		Animal a = new Animal(); 
		
		Animal a2 = new Animal("Milo", 21);
		a2.run();
		
		
		Animal a3 = new Animal(16);
		
		
		System.out.println(a3.run());
		System.out.println(a3.run(45));
		
		
	}
}
