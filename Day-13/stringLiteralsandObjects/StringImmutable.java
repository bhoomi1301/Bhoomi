package com.stringLiteralsandObjects;

public class StringImmutable {

	public static void main(String[] args) {
		String s1 = "Bhoomika";
		
//		The String literal value will only change explicitly, but internally the value of String literal will remain same
		s1 = s1.concat(" Gowda");
		System.out.println(s1);
	}

}