package com.Multilevel.Inheritance;

public class Shape {
	double breadth;
	double height;
	double area;
	
	public void calcArea(){
		area = 0.5*(breadth*height);
		System.out.println("The area of triangle is: " +area);
		
	}

}
