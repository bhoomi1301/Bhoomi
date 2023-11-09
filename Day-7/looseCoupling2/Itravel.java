package com.looseCoupling2;

public class Itravel implements Travel {

	private Transport transport;
	
	Itravel(Transport transport){
		this.transport = transport;
	}
	
	@Override
	public void journey() {
		transport.journey();
		
	}

}
