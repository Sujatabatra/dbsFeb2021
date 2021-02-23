package com.sujata.producer;

public class Instrumentalist implements Performer {

	private Instrument instrument;

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instumentalist is playing ");
		instrument.play();
	}

}
