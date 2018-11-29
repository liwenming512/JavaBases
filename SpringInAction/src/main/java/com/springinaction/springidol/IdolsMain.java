package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdolsMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springinaction/springidol/idols.xml");
		Performer performer = (Performer) context.getBean("duke");
		performer.perform();
		Performer performer2 = (Performer) context.getBean("duke2");
		performer2.perform();
		Performer performer3 = (Performer) context.getBean("duke3");
		performer3.perform();
	}

}
