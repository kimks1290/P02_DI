



package com.di.ex07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context= new GenericXmlApplicationContext("com/di/ex07/applicationContext.xml");
		
		Emp empA = (Emp)context.getBean("developer");
		System.out.println(empA);
		
		System.out.println();
		
		Emp empB = (Emp)context.getBean("engineer");
		System.out.println(empB);
	}
}
