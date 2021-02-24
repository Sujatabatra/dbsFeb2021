package com.sujata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/first")
	public String getMessage() {
		return "Welcome to Rest API from Spring Boot";
	}
}
