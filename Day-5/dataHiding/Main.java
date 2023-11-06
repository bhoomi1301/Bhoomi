package com.dataHiding;

public class Main {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccNo(234590876);
		acc.setIFSCcode(20231106);
		acc.Location = "Bidadi";
		acc.amount = 50000;
		acc.info();
		
		System.out.println("The Account Number is: " + acc.getAccNo());
		System.out.println("The IFSC Code is: " + acc.getIFSCcode());
		System.out.println("The Location is: " + acc.Location);
		System.out.println("The Amount is: " + acc.amount);
	}

}
