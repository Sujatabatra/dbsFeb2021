package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.demo.Greet;
import com.sujata.demo.GreetConfig;

public class MyClient {

	public static void main(String[] args) {
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(GreetConfig.class);
		
		Greet g=(Greet)springContainer.getBean("eve");
		g.wish();

	}

}
