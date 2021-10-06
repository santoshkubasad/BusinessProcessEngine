package maersk.src.service;

import maersk.src.interfaces.Payment;

public class GeneratePackingSlip 
{
	protected Payment payment;
	
	
	public GeneratePackingSlip(Payment payment) {
		this.payment = payment;
	}
	
	public void generateCommision()
	{
		System.out.println("Generating commision Payment to the agent");
	}

	public void generatePackingSlip()
	{
		payment.paymentProcess();
		generateCommision();
	}
}
