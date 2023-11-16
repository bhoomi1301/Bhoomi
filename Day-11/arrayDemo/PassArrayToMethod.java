package com.arrayDemo;

public class PassArrayToMethod {

	static void add(int arr[]) {
		int add=0;
		for(int i:arr) {
			add+=i;
		}
		
		System.out.println("Addition of Elements : " +add);
	}
	
	public static void main(String[] args) {
		int arr[] = {176,52,22,13,11};
		add(arr);
	}
}
