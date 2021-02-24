package com.sujata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//with @ Rest Controller , we are exposing our components as URI
@RestController
public class MyController {

//	@GetMapping("/first")
	@RequestMapping(path="/first",method=RequestMethod.GET)
	public String myFirstRestApi(){
		return "Welcome to the world of Rest API";
	}
	
	@GetMapping("/second/{na}")
	public String greet(@PathVariable("na")String name){
		return "Welcome "+name+" to Rest API World";
	}
}
