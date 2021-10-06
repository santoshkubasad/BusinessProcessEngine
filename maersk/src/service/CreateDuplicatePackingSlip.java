package maersk.src.service;

import maersk.src.interfaces.Payment;

public class CreateDuplicatePackingSlip extends GeneratePackingSlip 
{

	public CreateDuplicatePackingSlip(Payment payment) 
	{
		super(payment);
	}
	
	public void createDuplicatePacking()
	{
		payment.paymentProcess();
		generateCommision();
	}
}
