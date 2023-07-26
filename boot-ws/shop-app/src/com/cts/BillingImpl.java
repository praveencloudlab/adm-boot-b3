package com.cts;
//Dependent
public class BillingImpl {
	/**
	 *  Design Issues
	 *  =====================
	 *  -> too many dependency object creations
	 *  		-> memory management is difficult
	 *  		-> Performance of application goes down
	 *  
	 *  Why this issue happened?
	 *  ============================
	 *  -> dependent class itself creating dependency class object directly.
	 *  
	 *  what is the solution?
	 *  ======================
	 *  -> do not create dependency object in the dependent class directly
	 *  -> instead use techniques like JNDI . etc.
	 *  -> JNDI location is tightly coupled with dependent class
	 *  
	 *  What is the best solution?
	 *  =============================
	 *  => do not create or get from JNDI, 
	 *     instead ask some one (container) to inject/pass 
	 *     the dependency object. this is called IoC 
	 *     (Inversion of control)
	 *  
	 *  How to implement IoC?
	 *  ========================
	 *  => by using dependency injection technique (DI)
	 *  
	 *  What is DI (Dependency Injection)
	 *  ====================================
	 *  => Injecting/passing dependency object to the dependent object
	 *  
	 *  How to implement DI?: 2 ways
	 *  =======================================
	 *  1.using setter based injection
	 *  2.using constructor based injection
	 *  
	 *  1.using setter based injection
	 *  =======================================
	 *  1.create/define dependency class object reference at dependent class level
	 * 	2.generate setter method for the above defined reference 
	 * 
	 * 
	 */
	
	private PriceMatrixImpl price;
	
	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}

	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl(); // dependency object

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}
		return total;

	}

}
