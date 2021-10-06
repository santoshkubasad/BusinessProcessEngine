package maersk.src;

import maersk.src.domain.Book;
import maersk.src.domain.Membership;
import maersk.src.domain.PhysicalProduct;
import maersk.src.interfaces.Payment;
import maersk.src.service.ActivateMembership;
import maersk.src.service.CreateDuplicatePackingSlip;
import maersk.src.service.GeneratePackingSlip;

public class OrderProcessing {

	public static void main(String[] args) {
		
		Payment PhysicalProduct = new PhysicalProduct();
		GeneratePackingSlip packingSlip = new GeneratePackingSlip(PhysicalProduct);
		packingSlip.generatePackingSlip();
		
		Payment Book = new Book();
		CreateDuplicatePackingSlip book1 = new CreateDuplicatePackingSlip(Book);
		book1.createDuplicatePacking();

		Payment Membership = new Membership();
		ActivateMembership member = new ActivateMembership(Membership);
		member.activateMembership();

	}

}
