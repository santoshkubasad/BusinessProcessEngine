package maersk.src.service;

import maersk.src.interfaces.Payment;

public class MembershipUpgrade extends ActivateMembership
{

	public MembershipUpgrade(Payment payment) 
	{
		super(payment);
	}
	
	public void UpgradeMembership()
	{
		payment.paymentProcess();
		emailOwner();
	}
	
	
}
