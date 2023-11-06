package com.encapsulation.accessModifiers;

public class Employee {
	private int Eid;
	String name;
	protected String dptName;
	String Location;
	
	protected void display() {
		System.out.println("Inside the protected method...");
	}
	
	public int getEid() {
		return Eid;
	}
	
	public void setEid(int Eid) {
		this.Eid = Eid;
	}
}
