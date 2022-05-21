



package com.di.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain2 {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("com/di/ex02/applicationContext.xml");
		
		context.close();
		
	}
}
