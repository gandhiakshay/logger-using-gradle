package com.axelor.app;

public class Trainee {

	private String name;
	private String uname;
	
	public Trainee(String name,String uname) {
		this.name = name;
		this.uname = uname;
	}
	
	public void assign(Task t) {
		System.out.println(name);
		System.out.println(t);
	}
}
