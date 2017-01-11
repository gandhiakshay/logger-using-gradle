package com.axelor.app;

public class Trainee {

	public String name;
	public String uname;
	
	public Trainee(String name,String uname) {
		this.name = name;
		this.uname = uname;
	}
	
	public void assign(Task t) {
		System.out.println(name);
		System.out.println("=============");
		System.out.println(t.tname);
		System.out.println("   -"+t.desc);
	}
}
