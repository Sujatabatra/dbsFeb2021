package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.demo.GoodEvening;
import com.sujata.demo.GoodMorning;
/*
 * Configuration file will help Spring container to run the life cycle of all the components
 * components are getting created with methods annotated with @Bean annotation and we are giving the name of the component with name attribute inside @Bean
 */
@Configuration
public class GreetConfiguration {

	
	@Bean(name="gm")
	public GoodMorning getMorning(){
		return new GoodMorning();
	}
	
	@Bean(name="eve")
	public GoodEvening getEvening(){
		return new GoodEvening();
	}
}
