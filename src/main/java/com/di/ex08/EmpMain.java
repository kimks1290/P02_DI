



package com.di.ex08;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("com/di/ex08/applicationContext.xml");
		GenericXmlApplicationContext context2 = new GenericXmlApplicationContext("com/di/ex08/applicationContext2.xml");

		Developer empA = (Developer)context.getBean("developerA");
		System.out.println(empA);
		
		System.out.println();
		
		Engineer empB = (Engineer)context.getBean("engineerB");
		System.out.println("empB");
		
		
		Developer emp1 = (Developer)context2.getBean("developerB");
		System.out.println("emp1");
	}
}
