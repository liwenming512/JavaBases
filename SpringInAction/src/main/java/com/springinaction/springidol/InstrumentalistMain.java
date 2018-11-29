package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstrumentalistMain {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/springinaction/springidol/instrument.xml");
		Performer kenny = (Performer) ctx.getBean("kenny");
		kenny.perform();
		Performer kenny2 = (Performer) ctx.getBean("kenny2");
		kenny2.perform();
		Performer kenny3 = (Performer) ctx.getBean("kenny3");
		kenny3.perform();
		Performer hank = (Performer) ctx.getBean("hank");
		hank.perform();
		Performer hank2 = (Performer) ctx.getBean("hank2");
		hank2.perform();
		Performer hank3 = (Performer) ctx.getBean("hank3");
		hank3.perform();
	}

}
