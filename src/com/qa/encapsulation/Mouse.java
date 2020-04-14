package com.qa.encapsulation;

public class Mouse {

	private String belly = "Empty";

	
	// Getters & setters
	public String getBelly() {
		return belly;
	}

	public void setBelly(String belly) {
		this.belly = belly;
	}

	// Methods
	public void eat() {
		belly = "stuffed";
	}

	public void empty() {
		belly = "empty";
	}

}
