package com.stringLiteralsandObjects;

public class StringClassMethods2 {

	public static void main(String[] args) {
		String s1 = "Hello World";
		if(s1=="Hello World") {
			s1 = s1.replace("o", "a");
			System.out.println(s1);
			
			String s2 = "Java string split method";
			String[] words = s2.split(" ");
			for(String a : words)
			System.out.println(a);
			
			String s3 = "Java IndexOf Method";
			int a = s3.indexOf("e", 15);
			int b = s3.indexOf("v");
			System.out.println(a);
			System.out.println(b);
			
			String s4 = "     Welcome to Java World  ";
			s4 = s4.trim();
			System.out.println(s4);
			
		}
	}
}
