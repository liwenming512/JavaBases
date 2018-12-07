package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VolunteerMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springinaction/springidol/volunteer.xml");
		Thinker volunteer = (Thinker) context.getBean("volunteer");
		volunteer.thinkOfSomething("Queen of Hearts");
	}

}
