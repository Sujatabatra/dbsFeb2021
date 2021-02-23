package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Niharika")
public class Juggler implements Performer {

	private int balls;
	
	public Juggler(@Value("6")int balls) {
		super();
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println("Juggler is juggling "+balls+" balls");

	}

}
