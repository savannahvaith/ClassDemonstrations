package com.qa.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person sav = new Person("Savannah", 22, "Technical Learning Specialist");
		Person vin = new Person("Vinesh", 25, "Technical Learning Specialist");
		Person jh = new Person("JH", 25, "Senior Technical Learning Specialist"); 
		
		
		// Create a list implementation and store those objects inside 
		PersonManager manager = new PersonManager(); 
		manager.addHuman(sav);
		manager.addHuman(vin);
		manager.addHuman(jh);

		// pring all to the screen
		manager.getAll();
				
		// Create a method that can search for a specific person by their name:
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the name of the user you want to find: ");
			String person = sc.nextLine();
			manager.findByName(person);
			System.out.println("To exit type 'exit' else type 'continue'");
		}while(!sc.nextLine().equals("exit"));
		
		System.out.println("Goodbye!");
		sc.close(); 
	}


}
