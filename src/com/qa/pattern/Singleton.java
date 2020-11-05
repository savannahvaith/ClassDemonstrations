package com.qa.pattern;

public class Singleton {
	
	private Singleton() {
		super();
	}

	public static final Singleton INSTANCE = new Singleton(); // only creates one instance of the class which can be used across the application
}
