package com.qa.polymorphism.override;

public class Runner {

	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.speak(); // // I am speaking
		
		Kitty garfield = new Kitty(); 
		garfield.speak(); // Meow
		
		Kit k = new Kit(); 
		k.speak(); // something else 
		
	}
}
