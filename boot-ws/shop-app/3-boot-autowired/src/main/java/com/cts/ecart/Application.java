package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.repository.MySQLProductRepository;
import com.cts.ecart.repository.ProductRepository;
import com.cts.ecart.service.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//ProductRepository mySqlObj = context.getBean(ProductRepository.class);
		//mySqlObj.save();
		ProductServiceImpl ps = context.getBean(ProductServiceImpl.class);
		ps.saveProduct();
	}

}
