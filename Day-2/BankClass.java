package com.BankInfo;

    class Bank {
	String reg;
	String location;
	
	Bank(String reg, String location) {
		this.reg = reg;
		this.location = location;
	}
	
	public void bankInfo(){
		System.out.println(reg);
		System.out.println(location);
	}
}

public class BankClass{
	public static void main(String[] args) {
	Bank b = new Bank("CNBC20231311","Bidadi");
	b.bankInfo();
	}
}

