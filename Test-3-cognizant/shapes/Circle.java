package com.cognizant.shapes;

public class Circle {
 
    private float radius;
	protected float pi;
	
	public  Circle() {
		this.radius = 1.5f;
	}
	
	protected Circle(float radius) {
		this.radius = radius;
	}
	
    public Circle(float radius, float pi) {
    	this(radius);
    	this.pi = 3.5f;
	}
    
    public float getRadius() {
		return radius;
	}
    
    public Circle(float radius, float pi, boolean chaining) {
    	this(radius, pi);
    }
    
    public float calculateArea(float radius) {
    	return pi*radius*radius;
    }
    
    public float calculateCircumference(float radius) {
    	return 2*pi*radius;
    }
    
    public static void main(String[] args) {
    	Circle cir = new Circle();
    	float area = cir.calculateArea(cir.getRadius());
    	float circumference = cir.calculateCircumference(cir.getRadius());
    	System.out.println("Circumference of the circle is: " + circumference);
    	System.out.println("Area of the circle is: " + area);
    }
    
	
}
