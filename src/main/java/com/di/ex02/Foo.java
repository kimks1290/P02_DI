



package com.di.ex02;

public class Foo implements InterFoo{

		public Foo() {
			System.out.println("- Foo()- ");
			System.out.println("this : " + this);
			System.out.println("----------------------------");
		}
		
		public Foo(String stn) {
			System.out.println("- Foo(String stn)- ");
			System.out.println("this : " + this);
			System.out.println("stn : " + stn);
			System.out.println("----------------------------");
		}
		
		public Foo(int num, String stn) {
			System.out.println("- Foo(int num, String stn)- ");
			System.out.println("this : " + this);
			System.out.println("num : " + num);
			System.out.println("stn : " + stn);
			System.out.println("----------------------------");
		}
		
		public Foo(int num, String stn, boolean flag) {
			System.out.println("- Foo(int num, String stn, boolean flag)- ");
			System.out.println("this : " + this);
			System.out.println("num : " + num);
			System.out.println("stn : " + stn);
			System.out.println("flag : " + flag);
			System.out.println("----------------------------");
		}
		
		public Foo(Bar bar) {
			System.out.println("- Foo(Bar bar)- ");
			System.out.println("this : " + this);
			System.out.println("bar : " + bar);
			System.out.println("----------------------------");
		}
		
}
