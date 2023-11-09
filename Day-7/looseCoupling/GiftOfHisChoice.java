package com.looseCoupling;

public class GiftOfHisChoice implements ChoosingHisGift {

	private Person person;
	
	GiftOfHisChoice(Person person){
		this.person = person;
	}

	@Override
	public void gift() {
		person.gift();
		
	}
	
	
}
