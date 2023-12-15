package com.hashSetDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		set1.add(10);
		set1.add(null);
		System.out.println("Set1 = " + set1);
		
		set2.add(1);
		set2.add(3);
		set2.add(5);
		set2.add(7);
		set2.add(9);
		set2.add(null);
		
		System.out.println("Set2 = " + set2);
		
		//Union
		//set1.addAll(set2);
		//System.out.println("Union of two set = " + set1);
		
		//Intersection
		set1.retainAll(set2);
		System.out.println("Intersection of two set = " + set1);
		

	}

}
