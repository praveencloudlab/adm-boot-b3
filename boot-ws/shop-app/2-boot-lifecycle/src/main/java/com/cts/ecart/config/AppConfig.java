package com.cts.ecart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
@Lazy(value = false)
//@Scope("prototype")
@Scope // default is singleton
public class AppConfig {
	
	public AppConfig() {
		System.out.println(">> 1.AppConfig object created on "+System.identityHashCode(this));
	}
	
	@PostConstruct
	public void s1() {
		System.out.println(">> 2.@PostConstruct :: s1 on "+System.identityHashCode(this));
	}
	
	@PostConstruct
	public void s2() {
		System.out.println(">> 2.@PostConstruct :: s2 on "+System.identityHashCode(this));
	}
	
	@Bean // @Bean never works on lazy init
	  void s3() {
		System.out.println(">> 3.@Bean :: s3 method on "+System.identityHashCode(this));
	}
	
	@Bean // @Bean never works on lazy init
	 void s4() {
		System.out.println(">> 3.@Bean :: s4 method on "+System.identityHashCode(this));
	}
	
	@PreDestroy // it never works if scope is prototype
	public void s5() {
		System.out.println(">> 4.@PreDestroy :: s5 method on "+System.identityHashCode(this));
	}
	
	
	
	
	
	
	public void f1() {
		System.out.println("f1 method on "+System.identityHashCode(this));
	}
	

}
