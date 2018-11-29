package com.springinaction.knights;

public class DasmelRescuingKnight extends Knight {

	private RescueDasmelQuest quest;
	
	public DasmelRescuingKnight(){
		quest = new RescueDasmelQuest();
	}
	
	public void embarkOnQuest() {
		quest.embark();
	}
}
