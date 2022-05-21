



package com.di.ex05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DateTest {

		public static void main(String[] args) {
			
			GenericXmlApplicationContext context= new GenericXmlApplicationContext("com/di/ex05/applicationContext.xml");
		
			DateVO userA = (DateVO)context.getBean("userA");
			System.out.println(userA);
			
			System.out.println();
			
			DateVO userB = (DateVO)context.getBean("userB");
			System.out.println(userB);
			
			System.out.println();
			
			
		}
}
