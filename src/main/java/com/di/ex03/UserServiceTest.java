



package com.di.ex03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context=  new GenericXmlApplicationContext("com/di/ex03/applicationContext.xml");

		UserService userA = (UserService)context.getBean("userService");
							//객체를 생성하라는 뜻이 아니다 | userA랑 userC가 사용하는 객체는 한개의 객체이다 (1430)
		UserVO vo = new UserVO("유재석");
		userA.addUser(vo);
		
		System.out.println("userA : " + userA);
		System.out.println();
	
		UserService userB = new UserServiceImpl();
		System.out.println("userB : " + userB);
		System.out.println();
		
		UserService userC = context.getBean("userService", UserService.class); //반환타입이 object타입이므로 
		System.out.println("userC : " + userC);;
		
		context.close();
		
		
	}
}
