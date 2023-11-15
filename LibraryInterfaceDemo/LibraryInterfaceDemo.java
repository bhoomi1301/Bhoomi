package com.LibraryInterfaceDemo;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers ku = new KidUsers();
		ku.setAge(10);
        ku.setbookType("Kids");

		ku.registerAccount();
		ku.requestBook();
		
		AdultUsers au = new AdultUsers();
		au.setAge(23);
		au.setbookType("Fiction");
		
		au.registerAccount();
		au.requestBook();
	}
}
