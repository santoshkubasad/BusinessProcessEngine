package maersk.src.service;

import maersk.src.interfaces.Payment;

public class ActivateMembership
{

		protected Payment payment;
	
			
		public ActivateMembership(Payment payment) {
			this.payment = payment;
		}

		public void activateMembership()
		{
			payment.paymentProcess();
			emailOwner();
		}
		
		public void emailOwner()
		{
			System.out.println("Email Owner");
		}

}
