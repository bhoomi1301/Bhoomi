package com.superDemo;

public class Person {
	int uniqueId = 494623033;
	String city = "Bengaluru";
	
	Person(){
		System.out.println("The unique ID of a person is: " +uniqueId);
	}
	
	public void display(){
		System.out.println("The unique ID of a person is: " +uniqueId);
		System.out.println("The city of a person is: " +city);
	}
}
