package com.stringLiteralsandObjects;

public class StringClassMethods {

	public static void main(String[] args) {
		String s1 = "Object Oriented Programming";
		System.out.println("The substring of String literal s1 at the index position 7 is: " + s1.substring(7));
		
		System.out.println("The substring of String literal s1 from the index position 7 to index position 15 is: " + s1.substring(7, 15));
		
		String str = "Hello World";
		boolean contains = str.contains("World");
		System.out.println(contains);
		
		String str1 = String.join("-", "welcome", "to", "java");
		System.out.println(str1);
		
		String date = String.join("/", "20", "11", "2023");
		System.out.println(" " +date);
	}
}
