package com.qa.scanners;

import java.util.Scanner;

public class ScannerInputs {

	public static void main(String[] args) {
		
		System.out.println("writing to terminal");
		
		//System in - Allows us to get terminal input
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please enter your name: ");
		String name = sc.next(); // returns the first word
//		System.out.println(name);
		
//		System.out.println("Please enter your age:");
//		int age = sc.nextInt();
		
//		// nextInt() doesn't cosume '\n' 
//		sc.nextLine();
		
//		System.out.println("Say something interesting:");
//		String fact = sc.nextLine();
		
//		System.out.println("hello" + name + "age: "+ age);
		
		boolean wenttocatch = false; 
		Scanner scan = new Scanner(System.in); 
		int enterdvalue = 0; 
		do {
			System.out.println("Enter your age:");
			if(scan.hasNextInt()) {
				enterdvalue = scan.nextInt();
				wenttocatch = true;
			}else {
				scan.nextLine();
				System.out.println("That's not a number...");
			}
		}while(!wenttocatch);
		
	}
	
}
