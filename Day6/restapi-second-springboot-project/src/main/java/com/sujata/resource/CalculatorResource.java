package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.service.Calculator;

@RestController
public class CalculatorResource {

	@Autowired
	private Calculator calculator;
	
	@GetMapping("/addition/{num1}/{num2}")
	public int sumResource(@PathVariable("num1")int no1,@PathVariable("num2")int no2) {
		return calculator.sum(no1, no2);
	}
	
	@GetMapping("/Subtract/{no1}/{no2}")
	public int minusResource(@PathVariable("no1")int no1,@PathVariable("no2")int no2) {
		return calculator.difference(no1, no2);
	}
	
	@GetMapping("/Product/{no1}/{no2}")
	public int multiplyResource(@PathVariable("no1")int n1,@PathVariable("no2")int n2) {
		return calculator.multiply(n1, n2);
	}
	
	@GetMapping("/Divide/{no1}/{no2}")
	public int divideResource(@PathVariable("no1")int n1,@PathVariable("no2")int n2) {
		return calculator.divide(n1, n2);
	}
	
}
