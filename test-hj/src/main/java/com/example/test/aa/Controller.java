package com.example.test.aa;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private Test test;
	
	@RequestMapping(value="/", method=GET)
	public void push(){
		System.out.println("-- Request Accept !!");
		test.push();
		System.out.println("-- Request Finish !!");
	}
	

}
