package com.ExceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Started...");
		System.out.println("Enter 2 numbers");
		
		try {
			int no1=Integer.parseInt(args[0]);
			int no2=Integer.parseInt(args[1]);
			int result = no1/no2;
			System.out.println("Result="+result);
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
		finally {
			System.out.println("Terminated");
		}
	}
}
