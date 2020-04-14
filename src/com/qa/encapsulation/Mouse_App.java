package com.qa.encapsulation;

public class Mouse_App {

	public static void main(String[] args) {
		
		Mouse juliusCheeser = new Mouse(); 

		// if datamember was public:
//		System.out.println(juliusCheeser.belly);
//		
//		juliusCheeser.belly = "Full";
//		System.out.println(juliusCheeser.belly);
		
		
		System.out.println(juliusCheeser.getBelly()); // original value
		juliusCheeser.eat();
		System.out.println(juliusCheeser.getBelly()); // stuffed
		
		juliusCheeser.setBelly("huge"); 
		System.out.println(juliusCheeser.getBelly()); // huge
		
	}
	
}
