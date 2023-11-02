package com.Addition.methodOverloading;

    class Addition{
	int a;
	int b;
	int c;
	double d;
	double e;
	double f;
	int sum;
	
	
	public void addInfo() {
		System.out.println("Method without Parameters");
		sum = a + b;
		System.out.println("The addition of a and b is: " +sum);
	}
	
	public void addInfo(int a, int b) {
		System.out.println("Method with two Parameters of same datatype");
		System.out.println("The addition of " + a + " and " + b + " is: " + (a + b));
		
	}
	
	public void addInfo(int a, int b, int c) {
		System.out.println("Method with three Parameters of same datatype");
		System.out.println("The addition of " + a + "," + b + " and " + c + " is: " + (a + b + c));
		
	}
	
	public void addInfo(double d, double e, double f) {
		System.out.println("Method with three Parameters of same datatype");
		System.out.println("The addition of " + d + "," + e + " and " + f + " is: " + (d + e + f));
		
	}
	
	public void addInfo(double d, double e, int a) {
		System.out.println("Method with three Parameters of different datatype");
		System.out.println("The addition of " + d + "," + e + " and " + a + " is: " + ((d + e + a)));
		
	}
}

public class AdditionClass {
	public static void main(String[] args) {
		Addition add = new Addition();
		add.a = 10;
		add.b = 20;
		add.addInfo();
		add.addInfo(1,2);
		add.addInfo(13,11,27);
		add.addInfo(12.4,15.9,24.3);
		add.addInfo(43.3,54.4,62);
		
	}
}
