package com.qa.staticKeyword;

public class StaticKey {
	
	private static int count=0; 
	
	
	public void increment(){
		count = count + 1; 
	}
	
	
	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		StaticKey.count = count;
	}


	public static void main(String[] args) {
		
		StaticKey sk1 = new StaticKey(); 
		StaticKey sk2 = new StaticKey();
		
		sk1.increment(); //1
		sk1.increment(); //2
		sk1.increment(); //3
		sk1.increment(); //4
		sk1.increment(); //5
		sk1.increment(); //6
		
		// value of count = 6 
		sk2.increment(); // count: 7 
		
		System.out.println("SK1 value: " + sk1.getCount()); // 7	
		System.out.println("SK2 value: " + sk2.getCount()); // 7
			

	}
	// Static shares the same copy of the variable 
}
