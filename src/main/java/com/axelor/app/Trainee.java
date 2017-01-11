package com.axelor.app;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Trainee {

	Logger logger = LoggerFactory.getLogger(Team.class);
	
	private String name;
	private String userName;

	ArrayList<Task> list = new ArrayList<>();
	
	public Trainee(String name,String userName) {
		this.name = name;
		this.userName = userName+".axelor@gmail.com";
	}
	
	public void assign(Task t) {
		list.add(t);
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

	public void TaskDetails() {
		int cnt=1;
		for(int j=0;j < list.size();j++) {
			logger.info(cnt+"."+list.get(j).getTname());
			logger.info("  -"+list.get(j).getDesc());
			cnt = cnt + 1;
		}
	}
}
