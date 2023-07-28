package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.ecart.repository.ProductRepository;

@Service
public class ProductServiceImpl {
	
	@Autowired
	//@Qualifier(value = "oracleProductRepository")
	//@Qualifier(value = "mySQLProductRepository")

	private ProductRepository prodRepo;
	
	public void saveProduct() {
		System.out.println("Service :: saveProduct");
		prodRepo.save();
	}

}
