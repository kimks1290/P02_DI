package com.di.ex08;

public class Developer{

	private Emp emp;
	private String dept;
	
	public Developer() {
		super();
	}
	
	public Developer(Emp emp) {
		super();
		this.emp = emp;
	}
	
	public Developer(Emp emp, String dept) {
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
		return "이름 : " + emp.getName() +"- 급여: " + emp.getSalary() + "- 부서 : " + dept + "(개발부)";
	}
	
}
