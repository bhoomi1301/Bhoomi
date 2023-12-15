package com.interfaceDemo;

public class Loan implements Bank {

	public void customerLoan() {
		System.out.println("The Loan percentage is 10%");
	}

	@Override
	public void credit() {
		System.out.println("1000 rupees is credited to your account");
		
	}

	@Override
	public void debit() {
		System.out.println("The Loan percentage is 10%");
	}
	
}
