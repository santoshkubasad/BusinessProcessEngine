package maersk.src.domain;

import maersk.src.interfaces.Payment;

public class UpgradeMembership implements Payment
{
	@Override
	public void paymentProcess() {
		System.out.println("Membership Activated");
		
	}
}
