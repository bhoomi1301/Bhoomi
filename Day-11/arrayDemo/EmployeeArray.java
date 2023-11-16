package com.arrayDemo;

class Employee{
	int emp_Id;
	String emp_name;
	String emp_location;
	
	Employee(int emp_Id, String emp_name, String emp_location){
		this.emp_Id = emp_Id;
		this.emp_name = emp_name;
		this.emp_location = emp_location;
	}
}
public class EmployeeArray {

	public static void main(String[] args) {
		Employee[] arr;
		
		arr = new Employee[3];
		
		arr[0] = new Employee(101, "abc", "Bengaluru");
		arr[1] = new Employee(102, "pqr", "Mysore");
		arr[2] = new Employee(103, "xyz", "Ramanagara");
		
		for(Employee i: arr) {
			System.out.println(i.emp_Id + " " + i.emp_name + " " + i.emp_location);
		}
	}
}
