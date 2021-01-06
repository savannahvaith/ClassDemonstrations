package com.qa.Exercise;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	
	private List<Person> people = new ArrayList<Person>(); 
	
	public void addHuman(Person p) {
		this.people.add(p); 
	}
	
	public void getAll() {
		people.forEach(e -> System.out.println(e));
	}
	
	// find by name 
		public Person findByName(String name) {
			for(Person p : people) {
				if(p.getName().equals(name)) {
					System.out.println("Human found\n "+ p.toString());
					
					return p; 
				}
			}
			System.out.println("Human not found");
			return null; 
		}

}
