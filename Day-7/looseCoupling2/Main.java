package com.looseCoupling2;

public class Main {
	public static void main(String[] args) {

	Transport b1=new Bus();
	Transport t1=new Train();
	
	Travel t = new Itravel(b1);
	t.journey();
	}
}
