package com.multipleInheritance;

public class Object implements Color{

	@Override
	public void objectShape() {
		System.out.println("Shape of the object is Circle");
		
	}

	@Override
	public void objectColor() {
		System.out.println("Color of the object is black");
		
	}
	
	public static void main(String[] args) {
		Object obj = new Object();
		obj.objectShape();
		obj.objectColor();
	}

}
