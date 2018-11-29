package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AuditoriumMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springinaction/springidol/auditorium.xml");
		Auditorium aud = (Auditorium) context.getBean("auditorium");
	}

}
