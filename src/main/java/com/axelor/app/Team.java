package com.axelor.app;

import java.util.ArrayList;

public class Team {

	ArrayList<Trainee> trainee;
	
	public Team(String msg) {
		System.out.println(msg);
		trainee = new ArrayList<>();
	}
	
	public void addMember(Trainee t) {
		trainee.add(t);
	}
	
	public void logReports() {
		int cnt=0;
		for(int i=1;i < trainee.size();i++) {
			System.out.println(trainee.get(i).getName());
			System.out.println("==========================");
			System.out.println(cnt+"."+ trainee.get(i).getTsk().getTitle());
			System.out.println("  -"+ trainee.get(i).getTsk().getDescription());
		}
	}
}
