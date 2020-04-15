package com.qa.passby;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Alex");
		System.out.println("Before name swap - P1: " + p1.name);
		modify(p1);
		System.out.println("After name swap - P1: " + p1.name);
	}

	public static void modify(Person person) {
		person.name = "Bash";
	}

}
