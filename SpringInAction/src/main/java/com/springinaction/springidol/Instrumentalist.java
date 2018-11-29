package com.springinaction.springidol;

public class Instrumentalist implements Performer {
	
	public Instrumentalist(){};
	
	private String song;
	
	private Instrument instrument;

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void perform() {
		System.out.print("Playing " + song + ":");
		instrument.play();
	}

}
