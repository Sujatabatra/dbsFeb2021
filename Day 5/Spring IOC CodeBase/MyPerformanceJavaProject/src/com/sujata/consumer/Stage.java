package com.sujata.consumer;

import com.sujata.producer.Performer;

public class Stage {

	private Performer performer;
	
	public Stage(Performer performer) {
		super();
		this.performer = performer;
	}


	public void performance(){
		performer.perform();
	}
}
