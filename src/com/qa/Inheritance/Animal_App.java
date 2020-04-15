package com.qa.Inheritance;

public class Animal_App {

	public static void main(String[] args) {
		
		Animal a = new Animal(); 
		a.eat();
		a.sleep();
		
		System.out.println("________ ");
		
		Bird flappyBird = new Bird("fluffy"); 
		flappyBird.sleep(); // Animal Class
		flappyBird.layEggs(); // Bird class
		
		
		System.out.println("Penguin:");
		Penguin pingu = new Penguin("short", 2);
		pingu.eat(); // Animal class
		
					
		
		pingu.sleep(); // Animal class
		
		pingu.layEggs(); // Bird class
		
		pingu.dance(); // Penguin class
		
		
//		Animal a = new Bird("Fluffy"); 
		
		
		
		
	
		
		
//		
		
		
	}
	
	
	
}
