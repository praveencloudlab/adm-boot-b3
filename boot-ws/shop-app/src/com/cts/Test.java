package com.cts;

public class Test {

	public static void main(String[] args) {
		
		String[] cart1= {"P001","P002","P003"};
		String[] cart2= {"P001","P002"};
		
		//===============================================
		PriceMatrixImpl price=new PriceMatrixImpl(); // dependency object
		BillingImpl biller=new BillingImpl(); // dependent object
		//===============================================

		biller.setPrice(price); //passing/injecting dependency obj(price) to the dependent object (biller) is called DI
		
		double total = biller.getCartTotal(cart1);
		System.out.println("Cart1 Total: "+total);
		
		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 Total: "+total);


	}

}
