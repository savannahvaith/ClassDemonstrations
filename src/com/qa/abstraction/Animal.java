package com.qa.abstraction;

public abstract class Animal {

	abstract public void speak();
	abstract public void eat(); 
	
	public void hungry(){
		System.out.println("I am hungry ");
	}
	
}

class Cat extends Animal{

	// Abstract methods from Parent class Animal!!
	@Override
	public void speak() {
		System.out.println("meowwwwww");
	}

	@Override
	public void eat() {
		System.out.println("nommmmm");
	}
}

class Dog extends Animal{

	// Abstract methods from parent class Animal
	@Override
	public void speak() {
		System.out.println("woooof");
		
	}

	@Override
	public void eat() {
		
	}
	
}