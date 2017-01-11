package com.axelor.app;

public class Task {
	
	private String tname;
	private String desc;
	
	public Task(String tname,String desc) {
		System.out.println(tname);
		System.out.println("	-"+desc);
	}
}
