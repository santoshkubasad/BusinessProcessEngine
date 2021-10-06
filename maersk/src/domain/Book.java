package maersk.src.domain;

import maersk.src.interfaces.Payment;

public class Book implements Payment{

	@Override
	public void paymentProcess() {
		System.out.println("Creating Duplicate Packing slip for the royalty department");
		
	}

}
