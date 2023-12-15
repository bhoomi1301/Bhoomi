package com.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	private static HashMap<Integer, String> map;

	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		
		//put() method-(for adding key and value pair)
		h1.put(101, "Bidadi");
		h1.put(102, "Hassan");
		h1.put(103, "Bengaluru");
		h1.put(104, null);
		h1.put(105, null);
		h1.put(null, "Belur");
		System.out.println(h1);
		
		//get method
		System.out.println(h1.get(102));
		
		//remove method
		System.out.println(h1.remove(104));
		System.out.println(h1);
		
		System.out.println(h1.remove(103, "Bengaluru"));
		System.out.println(h1);
		
		//contains(key)(value)-returns true or false if the specific key or value is present
		System.out.println(h1.containsKey(103));
		System.out.println(h1.containsValue(null));
		
		//entrySet() method
		System.out.println(h1.entrySet());
		
		
		

	}

}
