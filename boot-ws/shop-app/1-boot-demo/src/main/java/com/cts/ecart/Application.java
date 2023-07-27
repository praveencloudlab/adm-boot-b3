package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication // auto discovery
public class Application {
	public static void main(String[] args) {
	AbstractApplicationContext context=	 (AbstractApplicationContext) SpringApplication.run(Application.class, args);
	C1 c1Obj = context.getBean(C1.class);
	c1Obj.f1();
	
	}

}
