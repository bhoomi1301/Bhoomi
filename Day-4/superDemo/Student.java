package com.superDemo;

public class Student extends Person {
	String name = "Bhoomika";
	String course = "BCA";
	
	Student(){
		super();
		System.out.println("The name of the student is: " +name);
		System.out.println("The course of the student is: " +course);
		System.out.println("The city of a person is: " +super.city);
	}
	
	public void display(){
		super.display();
		System.out.println("The name of the student is: " +name);
		System.out.println("The course of the student is: " +course);
	}
	
	
}
