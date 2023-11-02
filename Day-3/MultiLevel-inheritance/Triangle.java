package com.Multilevel.Inheritance;

public class Triangle extends Shape {
	double breadth1;
	double height1;
	double area1;
	
	public void calculateArea(double breadth1, double height1) {
		area1 = 0.5*(breadth1*height1);
		System.out.println("The area of triangle-2 is: " +area1);
	}
}
