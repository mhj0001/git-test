package com.example.test.aa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Start {
	
	@Bean
	public Test test(){
		Test test = new Test();
		
		// master branch 의 테스트용 변경사항입니다.
		return test;
	}

}
