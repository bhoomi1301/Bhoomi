package com.Multilevel.Inheritance;

public class Circle extends Triangle {
	int r;
	int d;
	
	public void calcRadius(int d) {
		r = d / 2;
		System.out.println("The radius of the number is: " +r);
	}
}
