package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@Configuration
//@ComponentScan(basePackages={"com.sujata.producer","com.sujata.consumer"})
@ComponentScan(basePackages="com.sujata")
public class PerformerConfiguration {
	
	
	
}
