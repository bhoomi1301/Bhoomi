package com.EmployeeClass.methodOverloading;


class Employee{
	String name;
	int age;
	String dept;
	double salary;
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(dept);
		System.out.println(salary);
		
	}
}

public class EmployeeClass {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Bhoomika";
		e.age = 22;
		e.dept = "Manager";
		e.salary = 50000;
		e.printInfo();
	}
}
