package com.cts;

//Dependency
public class PriceMatrixImpl {
	
	public PriceMatrixImpl() {
		System.out.println("PriceMatrixImpl object created...");
	}
	
	/*
	 * Types of Java Objects
	 * =========================
	 * 1.dependency object: never depends on any other objects. works independently
	 * 2.dependent object: always depends on dependency objects
	 * 
	 */

	public double getItemPrice(String itemCode) {
		// code to fetch price of a given product id from db
		return 100.0;
	}

}
