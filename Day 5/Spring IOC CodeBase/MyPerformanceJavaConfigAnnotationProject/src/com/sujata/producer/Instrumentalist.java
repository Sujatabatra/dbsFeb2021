package com.sujata.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Radha")
public class Instrumentalist implements Performer {

	//if @Autowired leads to multiple candidates which can be autowired, then to pick a specific candidate we need to use @Qualifier
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;

	

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instumentalist is playing ");
		instrument.play();
	}

}
