package com.inheritance.overriding;

public class Main3 {
	public static void main(String[] args) {
		Bank b = new Bank();
		Bank b1 = new SBI();
		Bank b2 = new HDFC();
		Bank b3 = new ICICI();
		b.loanPercentage();
		b1.loanPercentage();
		b2.loanPercentage();
		b3.loanPercentage();
	}
	
}
