package com.axelor.app;

public class Task {
	
	private String tname;
	private String desc;
	
	public Task() {
		
	}
	
	public Task(String tname,String desc) {
		this.tname = tname;
		this.desc = desc;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
