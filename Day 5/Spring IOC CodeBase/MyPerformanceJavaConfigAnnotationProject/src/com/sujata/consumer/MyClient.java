package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.producer.Performer;

public class MyClient {

	public static void main(String[] args) {
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(PerformerConfiguration.class);
		
		Performer firstPerformer=(Performer)springContainer.getBean("Radha");
		firstPerformer.perform();


		Performer secondPerformer=(Performer)springContainer.getBean("Varun");
		secondPerformer.perform();

		
		Stage st=(Stage)springContainer.getBean("stage");
		st.performance();
	}

}
