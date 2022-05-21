



package com.di.ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FileTest {

		public static void main(String[] args) {
			
			GenericXmlApplicationContext context = new GenericXmlApplicationContext("com/di/ex06/applicationContext.xml");
			
			MessageBean bean = (MessageBean)context.getBean("messageBean");
			bean.call();
			
			context.close();
		}
}
