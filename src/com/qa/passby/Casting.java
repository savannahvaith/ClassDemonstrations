package com.qa.passby;

public class Casting {

	public static void main(String[] args) {
		
		// Casting double to integer
		double dbl = 104.4;
		int i = (int)dbl;
		System.out.println(i);
		
		// Casting to 
		String number = "34"; 
		int num = Integer.parseInt(number);
		System.out.println(number + 500);
		System.out.println(num + 500);

		// Alternative way
		int num2 = Integer.valueOf(number);
		System.out.println(num2 + 600);
	}

}
