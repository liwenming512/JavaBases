package com.zhangguo.bookstore.action;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CtxUtil implements ApplicationContextAware {
	
	public static ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		ctx = applicationContext;
	}
	
	public static <T> T getBean(Class<T> clazz){
		return ctx.getBean(clazz);
	}

	public static Object getBean(String name){
		return ctx.getBean(name);
	}
}
