package com.SingleLevel.inheritance;

	public class Triangle extends Shape {
		double breadth;
		double height;
		double area;
		
		public void calculateArea() {
			area=0.5*(breadth*height);
			System.out.println("The area of the triangle is: " +area);
		}
	}


