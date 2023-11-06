package com.dataHiding.extension;

import com.dataHiding.Account;

public class Customer extends Account{
	public static void main(String[] args) {
		Customer c2 = new Customer();
		c2.Location = "Bengaluru";
		c2.info();
		System.out.println("The location is: " + c2.Location);
	}
}
