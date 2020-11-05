package com.qa.exceptions;

import java.io.IOException;

public class Exceptions {

	public static void main(String[] xyz) {
		throw new NullPointerException();
		throw new IOException();
		throw new ThreadDeath();
		
		/*
		 * There are checked and unchecked exceptions
		 * Checked ones being thrown will complain at you 
		 * Unchecked exceptions is a runtime exception
		 * 
		 * Anything that EXTENDS RUNTIME EXCEPTION - you don't need to handle
		 * You shouldn't be able to know you're getting a NullPointerException - where as with an IO if you're reading from a file, then expect an IOException
		 * 
		 * Exception - something that has gone wrong with your code - they may or may not happen. 
		 * For example: You need to prepare for the possibility that your printer runs out of paper 14 day after buying it.
		 * There's nothing wrong with the program, it's just the possbility.
		 * 
		 * Error - your code has exploded. You never catch errors - if they happen they happen. 
		 * 
		 */
	}
	
}
