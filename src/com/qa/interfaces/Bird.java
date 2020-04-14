package com.qa.interfaces;

public class Bird extends Animal implements FlyingCreature,Hairy {

	@Override
	public void eat() {
		System.out.println("peck peck ");
	}

	@Override
	public void fly() {
		System.out.println("flap");
	}

	@Override
	public void preen() {
		System.out.println("peck");
	}

	@Override
	public void swim() {
		
	}
	
}
