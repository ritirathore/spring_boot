package com.wiley.sbconcept.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("Welcome to Wiley Edge")
	private String msg;

	@GetMapping("/")
	public String helloWorld() {
		return "Welcome to Spring Boot";
	}
}
