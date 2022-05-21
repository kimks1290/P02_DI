
//수정


package com.di.ex07;

public class Emp {

	private String name;
	private int salary;
	
	public Emp() {}
		
	public Emp(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	
	public String toString(){
		return "이름  : " + name + " - 급여 : " + salary;
	}
	
	
	
}

