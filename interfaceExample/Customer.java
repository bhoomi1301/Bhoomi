package com.interfaceExample;

public class Customer implements Bike, Car {

	public void bikeSpeed() {
		System.out.println("Average speed of Bike is 120ms");
	}
	
	public void carSpeed() {
		System.out.println("Average speed of Car is 150ms");
	}
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.bikeSpeed();
		c1.carSpeed();
	}
}
