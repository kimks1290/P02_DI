package com.di.ex06;

public class MessageBeanImpl implements MessageBean{

		private String name;
		private String phone;
		private Output op;
		
		public MessageBeanImpl(String name) {
			this.name= name;
			System.out.println(" - MessageBeanImpl() 생성자 - ");
		}
		
		public void setPhone(String phone) {
			this.phone = phone;
			System.out.println("- phone 설정 - ");
		}
		
		public void setOp(Output op) {
			this.op= op;
			System.out.println("- Output 연결 -");
		}
		
		public void call() {
			
			String message = name + " - " + phone;
			System.out.println(message);
			try {
				op.output(message);
				System.out.println(" - end - ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
