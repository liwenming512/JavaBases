package com.zhangguo.bookstore.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangguo.bookstore.service.BookService;

public class TestBookService {

	static BookService bookService;
	
	@BeforeClass
	public static void before(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		bookService = ctx.getBean(BookService.class);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
