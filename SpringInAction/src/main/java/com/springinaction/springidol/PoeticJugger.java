package com.springinaction.springidol;

public class PoeticJugger extends Juggler {
	
	private Poem poem;
	
	public PoeticJugger(Poem poem){
		super();
		this.poem = poem;
	}
	
	public PoeticJugger(int beanBags, Poem poem){
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform(){
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}

}
