package com.sujata.producer;

import org.springframework.stereotype.Component;

//if we are not giving the name of the component, default name will be picked as class name in camelCase
@Component
public class Drum implements Instrument {

	@Override
	public void play() {
		System.out.println("DUM DUM DUM!!!");

	}

}
