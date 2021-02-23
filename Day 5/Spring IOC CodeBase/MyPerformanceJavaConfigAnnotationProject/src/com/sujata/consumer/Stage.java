package com.sujata.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sujata.producer.Performer;

@Component
public class Stage {

	@Autowired
	@Qualifier("Anju")
	private Performer performer;
	
	

	public void performance(){
		performer.perform();
	}
}
