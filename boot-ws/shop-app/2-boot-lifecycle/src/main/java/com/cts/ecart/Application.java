package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.config.AppConfig;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	    AppConfig ac1 = context.getBean(AppConfig.class);
	    //AppConfig ac2 = context.getBean(AppConfig.class);
	    
	   // ac1.f1();
	    //ac2.f1();
	    
	   // ac1=null;
	   // System.gc();
	   
	   // context.registerShutdownHook();
	    context.close(); // call the @PreDestroy

	}

}
