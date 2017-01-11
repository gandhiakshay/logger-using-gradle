package com.axelor.app;

public class Trainee {

	private String name;
	private String userName;
	private Task tsk;
	
	public Trainee(String name,String userName) {
		this.name = name;
		this.userName = userName;
		tsk = new Task();
	}
	
	public void assign(Task t) {
		//tsk.setTname(t.getTname());
		//tsk.setDesc(t.getDesc());
		System.out.println(t.getTitle().size());
		for(int i=1;i < t.getTitle().size();i++) {
			tsk.setTitle(t.getTitle());
			tsk.setDescription(t.getDescription());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUname(String userName) {
		this.userName = userName;
	}

	public Task getTsk() {
		return tsk;
	}

	public void setTsk(Task tsk) {
		this.tsk = tsk;
	}
}
