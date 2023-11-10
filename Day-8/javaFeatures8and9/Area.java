package com.javaFeatures8and9;

public interface Area {

	public default void circleArea(int r,int l, int w, int b, int h) {
		System.out.println("Inside default method...");
		System.out.println("Area of circle is: " +(3.14*r*r));
		
		rectArea(l,w);
		
		triArea(b,h);
	}
	
	private void rectArea(int l, int w) {
		System.out.println("Inside private method...");
		System.out.println("Area of rectangle is: " +(l*w));
	}
	
	private static void triArea(int b, int h) {
		System.out.println("Inside private static method...");
		System.out.println("Area of triangle is: "+ (0.5*(b*h)));
	}
}
