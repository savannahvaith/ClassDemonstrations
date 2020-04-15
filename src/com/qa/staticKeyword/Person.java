package com.qa.staticKeyword;


// A static variable is common to all the instances/ objects of the classs
// BECAUSE it is a class level variable.
// I.e. only a single copy of the static variable is created and shared amongst all the instances
// of the class.
public class Person {

	public static int age = 20;
	public String name;
	
	
	public void increment() {
		age++;
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}
	
	public static void main(String[] args) {
		Person sav = new Person(); 
		
		Person bob = new Person(); 
		
		sav.increment();
		sav.setName("Savannah");
		bob.setName("Bob");
		
		System.out.println(sav.age + " " + sav.name); // 21 (we share age) name is what we set it to be
		System.out.println(bob.age + " "+  bob.name); // 

	}
	// Static shares the same copy of the variable
}
