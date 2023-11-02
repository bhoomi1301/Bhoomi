package com.Heirarchial.inheritance;

public class Main {
	public static void main(String[] args) {
		DerivedClassSBI sbi = new DerivedClassSBI();
		DerivedClassHDFC hdfc = new DerivedClassHDFC();
		
		sbi.printRBI();
		sbi.printSBI();
		hdfc.printRBI();
		hdfc.printHDFC();
 }
}
