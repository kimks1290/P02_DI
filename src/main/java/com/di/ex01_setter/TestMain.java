



package com.di.ex01_setter;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("com/di/ex01_setter/bean.xml");
	
		MessageBean bean = (MessageBean)context.getBean("messageBean");
		
		bean.sayHello();
		bean.sayHello();
		context.close();
	}
	
}
