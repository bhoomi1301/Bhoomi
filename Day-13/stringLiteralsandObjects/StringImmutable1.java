package com.stringLiteralsandObjects;

public class StringImmutable1 {

	public static void main(String[] args) {
		String s1 = "Java";
		char ch1 = s1.charAt(0);
		char ch2 = s1.charAt(1);
		char ch3 = s1.charAt(2);
		char ch4 = s1.charAt(3);
		System.out.println("The character at the index position 0 is: " +ch1);
		System.out.println("The character at the index position 1 is: " +ch2);
		System.out.println("The character at the index position 2 is: " +ch3);
		System.out.println("The character at the index position 2 is: " +ch4);
		System.out.println("The length of the string is: " +s1.length());
		
	}
}
