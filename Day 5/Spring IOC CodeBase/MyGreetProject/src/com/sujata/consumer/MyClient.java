package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.producer.Greet;
/*
 * Spring is giving us the benefit of Inversion of Control
 * IOC : Seperating the dependency logic from the actual business logic of application to make system loosely couples
 * Two ways to achive IOC : Setter Injection and Constructor Injection
 */
public class MyClient {

	public static void main(String args[]){
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(GreetConfig.class);
		
		Greet g1=(Greet)springContainer.getBean("eve");
		g1.wish();
	}
}
