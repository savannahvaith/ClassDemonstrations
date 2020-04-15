package com.qa.testdrivendevelopment;

public class Answers {

	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string, return a string where for every char in the original string,
	 * there are three chars.<br>
	 * <br>
	 * 
	 * For Example:<br>
	 * multChar("The") → "TTThhheee"<br>
	 * multChar("AAbb") → "AAAAAAbbbbbb"<br>
	 * multChar("Hi-There") → "HHHiii---TTThhheeerrreee"
	 */
	public String multiChar(String input) {
		StringBuilder stringBuilder = new StringBuilder();
		String s = ""; 
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < 3; j++) {
				s = s + input.substring(i,i+1);
//				stringBuilder.append(input.substring(i, i + 1));
			}
		}
//		return stringBuilder.toString();
		return s;
	}

	/**
	 * Return the string (backwards) that is between the first and last appearance
	 * of "bread" in the given string, or return the empty string "" if there is not
	 * 2 occurances of "bread". Ignore Case<br>
	 * <br>
	 * For Example: sandwichFilling("breadclivebread") → "evilc"<br>
	 * sandwichFilling("xxbreadfridgebreadyy") → "egdirf"<br>
	 * sandwichFilling("xxBreadfridgeBReAdyy") → "egdirf"<br>
	 * sandwichFilling("xxbreadyy") → "" sandwichFilling("xxbreADyy") → ""<br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */

	public String sandwichFilling(String sandwich) {
		int start = -1;
		int end = -1;
		sandwich = sandwich.toLowerCase();
		for (int i = 0; i < sandwich.length() - 4; i++) {
			String section = sandwich.substring(i, i + 5);
			if (start == -1 && section.equals("bread")) {
				start = i + 5;
				i += 4;
				continue;
			} else if (start != -1 && end == -1 && section.equals("bread")) {
				end = i;
				break;
			}
		}
		if (end == -1) {
			return "";
		}
		return new StringBuilder(sandwich.substring(start, end)).reverse().toString();
//		return "";
	}

	/**
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large. Do not assume the ints will come to you in a reasonable order.<br>
	 * <br>
	 * For Example:<br>
	 * evenlySpaced(2, 4, 6) → true<br>
	 * evenlySpaced(4, 6, 2) → true<br>
	 * evenlySpaced(4, 6, 3) → false<br>
	 * evenlySpaced(4, 60, 9) → false
	 */
	public boolean evenlySpaced(int a, int b, int c) {
		if (a > b && b > c) {
			return a - b == b - c;
		} else if (a > c && c > b) {
			return a - c == c - b;
		} else if (b > a && a > c) {
			return b - a == a - c;
		} else if (b > c && c > a) {
			return b - c == c - a;
		} else if (c > b && b > a) {
			return c - b == b - a;
		} else {
			return c - a == a - b;
		}

//		return false;
	}

	/**
	 * Given a string and an int n, return a string that removes n letters from
	 * the'middle' of the string. The string length will be at least n. The input
	 * string will have an odd number of letters. n will always be an odd
	 * number.<br>
	 * <br>
	 * For Example:<br>
	 * nMid("Hello", 3) → "Ho"<br>
	 * nMid("Chocolate", 3) → "Choate"<br>
	 * nMid("Chocolate", 1) → "Choclate"<br>
	 */
	public String nMid(String input, int n) {
		int startMid = (input.length() / 2) - (n / 2);
		int endMid = (input.length() / 2) + (n / 2) + 1;
		return input.substring(0, startMid) + input.substring(endMid);
//    	return "";
	}

	/**
	 * Given a string, return the boolean True if it ends in "java" and False if
	 * does not end in "java". Ignore Case.<br>
	 * <br>
	 * For Example: <br>
	 * endsJava("ilovejava") → true <br>
	 * endsJava("iloveJaVa") → true <br>
	 * endsJava("welovejava") → true <br>
	 * endsJava("welovejavamoreeveryday") → false <br>
	 * endsJava("javaiscool") → false <br>
	 * endsJava("pythoniscool") → false <br>
	 */
	public boolean endsJava(String input) {
		return input.toLowerCase().endsWith("java");
//    	return false;
	}

	/**
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same, do not ignore case.<br>
	 * <br>
	 * For Example: superBlock("hooopplla") → 3 <br>
	 * superBlock("abbCCCddDDDDeeEEE") → 4 <br>
	 * superBlock("abbCCCCC")) → 5 <br>
	 * superBlock("") → 0 <br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */
	public int superBlock(String input) {
		if (input.equals("")) {
			return 0;
		}
		int max = -1;
		String lastLetter = "";
		int temp = 1;
		for (int i = 0; i < input.length(); i++) {
			String letter = input.substring(i, i + 1);
			if (lastLetter.equals(letter)) {
				temp++;
			} else {
				if (temp > max) {
					max = temp;
				}
				temp = 1;
			}
			if (i == input.length() - 1) {
				if (temp > max) {
					max = temp;
				}
				temp = 1;
			}
			lastLetter = letter;
		}
		return max;
//    	return -1;
	}

	/**
	 * Given a string - return the number of times "am" appears in the String
	 * ignoring case - BUT ONLY WHEN the word "am" appears without being followed or
	 * preceded by other letters <br>
	 * <br>
	 * For Example: <br>
	 * amISearch("Am I in Amsterdam") → 1 <br>
	 * amISearch("I am in Amsterdam am I?") → 2 <br>
	 * amISearch("I have been in Amsterdam") → 0 <br>
	 * <br>
	 * HINT: String.toLowerCase
	 */
	public int amISearch(String sentence) {
		int count = 0;
		if (sentence.substring(0, 3).toLowerCase().equals("am ")) {
			count++;
		}
		if (sentence.substring(sentence.length() - 3).toLowerCase().equals(" am")) {
			count++;
		}
		for (int i = 0; i < sentence.length() - 3; i++) {
			if (sentence.substring(i, i + 4).toLowerCase().equals(" am ")) {
				count++;
			}
		}
		System.out.println("***************" + count);
		return count;
//    	return -1;
	}

	/**
	 * Given a number if this number is divisible by 3 return "fizz" if this number
	 * is divisible by 5 return "buzz" if this number is divisible by both 3 and 5
	 * return "fizzbuzz" if this number is not divisible by 3 or 5 return null<br>
	 * <br>
	 * For Example: <br>
	 * fizzBuzz(3) → "fizz" <br>
	 * fizzBuzz(10) → "buzz" <br>
	 * fizzBuzz(15) → "fizzbuzz" <br>
	 * fizzBuzz(8) → null
	 */
	public String fizzBuzz(int number) {
		if (number % 5 == 0 && number % 3 == 0) {
			return "fizzbuzz";
		} else if (number % 5 == 0) {
			return "buzz";
		} else if (number % 3 == 0) {
			return "fizz";
		} else {
			return null;
		}
//    	return "";
	}

	/**
	 * Given a string, split the string into the individual numbers present then add
	 * each digit of each number to get a final value for each number <br>
	 * <br>
	 * String example = "55 72 86"<br>
	 * <br>
	 * "55" will = the integer 10 <br>
	 * "72" will = the integer 9 <br>
	 * "86" will = the integer 14 <br>
	 * <br>
	 * You then need to return the highest vale <br>
	 * <br>
	 * For Example: <br>
	 * largest("55 72 86") → 14 <br>
	 * largest("15 72 80 164") → 11 <br>
	 * largest("555 72 86 45 10") → 15 <br>
	 * <br>
	 * HINT: Integer.parseInt
	 */

	public int largest(String input) {
		String[] nums = input.split(" ");
		int max = 0;
		for (String num : nums) {
			int temp = 0;
			for (int i = 0; i < num.length(); i++) {
				String number = num.substring(i, i + 1);
				temp += Integer.parseInt(number);
			}
			if (temp > max) {
				max = temp;
			}
		}
		return max;
//    	return -1;
	}

	/**
	 * Given a string, int and a char, return a boolean value if the 'nth'
	 * (represented by the int provided) char of the String supplied is the same as
	 * the char supplied. The int provided will NOT always be less than than the
	 * length of the String. Ignore case and Whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * compares("The",2,'h') → true <br>
	 * compares("AAbb",1,'b') → false <br>
	 * compares("Hi-There",10,'e') → false <br>
	 * <br>
	 * HINT: String.charAt
	 */
	public boolean compares(String word, int index, char letter) {
		if (index > word.length()) {
			return false;
		}
		return word.charAt(index - 1) == letter;
//    	return false;
	}
}
