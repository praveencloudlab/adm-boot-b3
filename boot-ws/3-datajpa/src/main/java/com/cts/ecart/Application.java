package com.cts.ecart;

import com.cts.ecart.entity.Category;
import com.cts.ecart.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication // auto configuration
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		ProductRepository catRepo= context.getBean(ProductRepository.class);

		// find all categories
		catRepo.findAll().forEach(System.out::println);
		/*
		Category catObj= catRepo.findById(100).orElse(null);
		if(catObj!=null){
			System.out.println(catObj);
		}else{
			System.out.println("Id Not found");
		}

		 */



	}

}
