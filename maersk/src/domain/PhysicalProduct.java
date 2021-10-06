package maersk.src.domain;

import maersk.src.interfaces.Payment;

public class PhysicalProduct implements Payment{

	@Override
	public void paymentProcess() {
		System.out.println("Generating Packing Slip for Shipping");
		
	}

}
