package com.qa.interfaces;

public class App_Runner {

	public static void main(String[] args) {
		
		Bird tweety = new Bird(); 
		
		// can only access fly & swim
		FlyingCreature flyBoy = (FlyingCreature) tweety; 
		flyBoy.fly();
		flyBoy.swim();
		
		//cannot access other methods other than preen
		Hairy hair = (Hairy) tweety; 
		hair.preen();
				
	}
	
	
	
}
