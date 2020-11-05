package com.qa.enums;

import java.time.LocalDate;
import java.time.Month;

public class App {

	public static void main(String[] xyz) {
		
		LocalDate.of(1995, 01, 17);
		// using an enum instead of a specific number 
		LocalDate.of(1995, Month.JANUARY, 17);
		
		App.printDay(Day.TUESDAY);
	}
	
	private static void printDay(Day day) {
		System.out.println(day);
	}
}
