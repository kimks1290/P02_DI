
//수정


package com.di.ex08;

public class Emp {

	private String name;
	private int salary;
	
	public Emp() {}
		
	public Emp(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public String toString(){
		return "이름  : " + name + " - 급여 : " + salary;
	}
	
	
	
}

