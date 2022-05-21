



package com.di.ex08;

public class Engineer{
	
	private Emp emp;
	private String dept;
	
	public Engineer() {
		super();
	}
	
	public Engineer(Emp name) {
		super();
		this.emp = emp;
	}
	
	public Engineer(Emp name, String dept) {
		super();
		this.emp = emp;
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	public String toString() {
		return "이름 : " + emp.getName() +"- 급여: " + emp.getSalary() + "- 부서 : " + dept + "(기술부)";
	
	}
	
}
