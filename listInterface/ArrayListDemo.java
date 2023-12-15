package com.listInterface;
import java.util.ArrayList;
import java.util.Collections;


  public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(100);
		a1.add(500);
		a1.add(300);
		a1.add(10);
		a1.add(80);
		System.out.println("A1="+a1);
		
		Collections.sort(a1);
		System.out.println("After sorting="+a1);
		//descending method
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println("List after using reverse order method="+a1);
		Collections.shuffle(a1);
		System.out.println("After Shuffling="+a1);
		
		int minElement=Collections.min(a1);
		System.out.println("Minimum element in list="+minElement);
		
		int maxElement=Collections.max(a1);
		System.out.println("Maximum elements in list="+maxElement);
		
		
		ArrayList<Integer> a1_dup=new ArrayList<Integer>();
		a1_dup.addAll(a1);
		
		System.out.println("a1_dup"+a1_dup);
		
		a1_dup.removeAll(a1);
		System.out.println(a1_dup);
		System.out.println(a1);

	}

}
