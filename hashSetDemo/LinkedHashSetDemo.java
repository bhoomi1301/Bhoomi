package com.hashSetDemo;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		
		//ordered and sorted
		set1.add(null);
		set1.add(2);
		set1.add(7);
		set1.add(4);
		set1.add(8);
		//System.out.println(set1);
		
		set2.add(1);
		set2.add(5);
		set2.add(9);
		set2.add(null);
		set2.add(3);
		//System.out.println(set2);
		
		set1.containsAll(set2);
		System.out.println(set1);
		
		

	}

}
