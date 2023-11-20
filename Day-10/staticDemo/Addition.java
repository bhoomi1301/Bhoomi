package com.staticDemo;

public class Addition {

	int a;
	int b;
	
	public Addition() {
		System.out.println("Inside the constructor");
	}
	
	public static void add(int a, int b) {
		System.out.println("Inside the static method");
		System.out.println("Addition of two integers a and b is: " +(a+b));
	}
	
//	Static block always executes first
	static {
		System.out.println("Inside the static block");
	}
	
	public static void main(String[] args) {
		Addition a = new Addition();
		System.out.println("Inside the main method");
		a.add(3, 4);
	}
}
