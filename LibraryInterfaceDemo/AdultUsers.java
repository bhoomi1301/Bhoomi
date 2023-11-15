package com.LibraryInterfaceDemo;

public class AdultUsers implements LibraryUser {

	int age;
	String bookType;
	
	@Override
	public void registerAccount() {
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		
		else if(age<12){
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}
	@Override
	public void requestBook() {
		if(bookType == "Fiction") {
			System.out.println("Book issued successfully, please return the book within 7 days");
		}
		
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
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

