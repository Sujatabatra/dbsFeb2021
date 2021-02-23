package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.GoodEvening;
import com.sujata.producer.GoodMorning;

@Configuration
public class GreetConfig {

	//Constructor Injection
	@Bean(name="mrng")
	public GoodMorning getMrng(){
		return new GoodMorning("Anju");
	}
	
	
	//Setter Injection
	@Bean(name="eve")
	public GoodEvening getEve(){
		GoodEvening goodEvening=new GoodEvening();
		goodEvening.setName("Pavan");
		return goodEvening;
	}
}
