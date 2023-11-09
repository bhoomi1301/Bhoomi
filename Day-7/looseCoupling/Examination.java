package com.looseCoupling;

public class Examination {
	public static void main(String[] args) {
		Person gift1=new Bike();
		Person gift2=new Cycle();
		
		ChoosingHisGift GiftOfHisChoice = new GiftOfHisChoice(gift1);
		GiftOfHisChoice.gift();
	}
}
