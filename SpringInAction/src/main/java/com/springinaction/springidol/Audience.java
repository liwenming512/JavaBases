package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	
	public void takeSeats(){
		System.out.println("The audience is taking their seats.");
	}
	
	public void turnOffCellPhones(){
		System.out.println("The audience is turning their cellphones");
	}
	
	public void applaud(){
		System.out.println("clap clap clap clap clap");
	}
	
	public void demandRefund(){
		System.out.println("Boo! We want our menony back!");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinPoint){
		try{
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning their cellphones");
			long start = System.currentTimeMillis();
			joinPoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println("clap clap clap clap clap");
			System.out.println("The performance took " + (end - start) + " milliseconds");
		}catch(Throwable t){
			System.out.println("Boo! We want our menony back!");
		}
	}
}
