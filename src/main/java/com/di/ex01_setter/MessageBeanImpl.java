



package com.di.ex01_setter;

public class MessageBeanImpl implements MessageBean{

		private String fruit;
		private int cost;
		
		public MessageBeanImpl() {}
		
		public MessageBeanImpl(String fruit) {
			this.fruit = fruit;
			System.out.println("MessageBeanImple(String fruit) 생성자 실행");
		}
		
		public void setCost(int cost) {
			this.cost = cost;
			System.out.println("setCost(int cost) 실행");
		}

		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println(fruit + "\t" + cost);
		}

		@Override
		public void sayHellow(String a, int b) {
			// TODO Auto-generated method stub
			System.out.println(a + "\t" + b);
		}

		
		
		
	
}
