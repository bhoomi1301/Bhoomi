package com.java8and9;

public class Main implements Math {

	@Override
	public void trianglePerimeter(int i, int j) {
		System.out.println("Inside the abstract method...");
		System.out.println("Perimeter of cube is: " + (i+j+i));
		
	}
	
	public static void main(String[] args) {
		Math m = new Main();
		m.squarePerimeter(2, 8, 9);
		m.trianglePerimeter(4, 6);
	    Math.cubeArea(7);
	}

}
