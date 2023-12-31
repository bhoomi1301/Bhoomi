package com.LibraryInterfaceDemo;

public class KidUsers implements LibraryUser {

	int age;
	String bookType;
	
	@Override
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		
		else if(age>12){
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}
	@Override
	public void requestBook() {
		if(bookType == "Kids") {
			System.out.println("Book issued successfully, please return the book within 10 days");
		}
		
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getbookType() {
		return bookType;
	}
	
	public void setbookType(String bookType) {
		this.bookType = bookType;
	}
}
