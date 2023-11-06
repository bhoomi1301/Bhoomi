package com.encapsulation.accessModifiers;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Bhoomika";
		e1.dptName = "IT";
		e1.Location = "Bidadi";
		e1.setEid(20230611);
		
		System.out.println("Name of the person is: " + e1.name);
		System.out.println("Department of the person is: " + e1.dptName);
		System.out.println("Location of the person is: " + e1.Location);
		System.out.println("Employee ID of the person is: " + e1.getEid());
			
		}
	}


