package com.java8and9;

public interface Math {
	
	public abstract void trianglePerimeter(int i,int j);

	public default void squarePerimeter(int a, int x, int y) {
		System.out.println("Inside the default method...");
		System.out.println("Perimeter of square is: " + (4*a));
		
//		Private Method Calling
		cubeRoot(x);
		
//		Private static Method calling
		squareRoot(y);
		
	}
	
	public static void cubeArea(int a) {
		System.out.println("Inside the static method...");
		System.out.println("Area of cube is: " + (6*a*a));
	}
	
	private void cubeRoot(int x) {
		System.out.println("Inside the private method...");
		System.out.println("Cube root of the number " + x + " is: " + (x*x*x));
	}
	
	private static void squareRoot(int y) {
		System.out.println("Inside the private static method...");
		System.out.println("Square root of the number " + y + " is: " + (y*y));
	}
	
}
