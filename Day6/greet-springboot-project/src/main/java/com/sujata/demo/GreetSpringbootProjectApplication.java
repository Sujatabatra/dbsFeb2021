package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
//@Configuration+@ComponentScan=@SpringBootapplication
@SpringBootApplication 
public class GreetSpringbootProjectApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("eve")
	private Greet greet;
	
	@Bean
	public GoodEvening eve() {
		GoodEvening ge=new GoodEvening();
		ge.setName("Sujata");
		return ge;
	}
	public static void main(String[] args) {
		SpringApplication.run(GreetSpringbootProjectApplication.class, args);
//		ApplicationContext springContainer= SpringApplication.run(GreetSpringbootProjectApplication.class, args);
//		
//		Greet g=(Greet)springContainer.getBean("eve");
//		g.wish();
	}
	@Override
	public void run(String... args) throws Exception {
		greet.wish();
		
	}

}
