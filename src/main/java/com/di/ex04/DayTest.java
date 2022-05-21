



package com.di.ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DayTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("com/di/ex04/applicationContext.xml");
		
		AbstractDay test = (AbstractDay)context.getBean("test");
		
		System.out.println("오늘은 " + test.dayInfo() + "입니다");
		System.out.println("test : "+ test);
		
		AbstractDay test2 = (AbstractDay)context.getBean("test");
		System.out.println("test2 : "+ test2);
		
		context.close();
	}
}
