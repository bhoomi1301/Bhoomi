package com.arrayDemo;

public class ArrayDeclaration {

	public static void main(String[] args) {
		int arr[];
		
		arr = new int[3];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Element at index " + i + " is " + arr[i]);
		}
	}
}