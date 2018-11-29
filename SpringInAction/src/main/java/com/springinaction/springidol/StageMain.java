package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StageMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springinaction/springidol/idols.xml");
		Stage stage = (Stage) context.getBean("theStage");
		System.out.println(stage.getInstance());
	}

}
