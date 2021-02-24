package com.sujata.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

	public int sum(int firstNumber,int secondNumber) {
		return firstNumber+secondNumber;
	}
	public int difference(int firstNumber,int secondNumber) {
		return firstNumber-secondNumber;
	}
	public int multiply(int firstNumber,int secondNumber) {
		return firstNumber*secondNumber;
	}
	public int divide(int firstNumber,int secondNumber) {
		return firstNumber/secondNumber;
	}
}
