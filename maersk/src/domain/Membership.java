package maersk.src.domain;

import maersk.src.interfaces.Payment;

public class Membership implements Payment
{
	@Override
	public void paymentProcess() {
		System.out.println("Membership Activated");
		
	}
}
