package com.interfaceDemo;

public class Account implements Bank {
	
	public void credit() {
		System.out.println("1000 rupees is credited to your account");
	}
	
	public void debit() {
		System.out.println("500 rupees is debited from your account");
	}
	
	public void customerLoan() {
		System.out.println("The Loan percentage is 10%");
	}
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.credit();
		a1.debit();
		a1.customerLoan();
	}
	
}
