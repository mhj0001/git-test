package com.example.test.aa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Start {
	
	@Bean
	public Test test(){
		Test test = new Test();
		return test;
	}

}
