package com.linkedList;
import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<Integer>();
		
		HashSet<Integer> set2=new HashSet<Integer>();
		
		//adding elements in set 1
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		System.out.println("Set 1 = "+set1);
		
		//adding elements in set 2
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(9);
		System.out.println("Set 2 = "+set2);
		
		//union
		set1.addAll(set2);
		System.out.println("Union of two set = "+set1);
		
		//intersection
		set1.retainAll(set2);
		System.out.println("Intersection of set = "+set1);


	}

}
