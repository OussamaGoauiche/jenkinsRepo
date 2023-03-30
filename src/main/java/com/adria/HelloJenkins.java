package com.adria;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class HelloJenkins {

	@PostConstruct
	public void hello(){
		System.err.println("Hello Jenkins :)");
	}
	
	public int sum(int a,int b){
		return a+b;
	}
}
