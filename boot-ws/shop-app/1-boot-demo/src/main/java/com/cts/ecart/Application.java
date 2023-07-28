package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication // auto discovery
public class Application {
	public static void main(String[] args) {
	ConfigurableApplicationContext context=	 SpringApplication.run(Application.class, args);
	C1 c1Obj = context.getBean(C1.class);
	c1Obj.f1();
	}

}
