package com.qa.Exercise;

public class Person {
	
	private String name; 
	private int age; 
	private String job; 
	
	public Person() {
		
	}
	
	public Person(String name, int age, String job) {
		this.name=name; 
		this.age = age; 
		this.job = job; 
		
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name; 
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Human:" + name + ", Age: " + age + ", Job:" + job;
	}
	
	
	
	
}
