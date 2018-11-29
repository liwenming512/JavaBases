package com.springinaction.springidol;

import java.util.Map;

public class OneManBand2 implements Performer {
	
	private Map<String, Instrument> instruments;
	
	public OneManBand2(){};

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	public void perform() {
		for(String key:instruments.keySet()){
			System.out.print(key + ":");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

}
