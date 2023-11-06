 package com.accessModifier.protect;

 import com.encapsulation.accessModifiers.Employee;

public class Customer extends Employee {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.dptName = "Manager";
		c1.display();
		System.out.println("Department of the person is: "+ c1.dptName);
	}

}
