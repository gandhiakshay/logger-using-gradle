package com.axelor.app;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Team {

	Logger logger = LoggerFactory.getLogger(Team.class);
	
	List<Trainee> trainee;
	
	public Team(String msg) {
		System.out.println(msg);
		trainee = new ArrayList<Trainee>();
	}
	
	public void addMember(Trainee t) {
		trainee.add(t);
	}
	
	public void logReports() {
		for(int i=0;i < trainee.size();i++) {
			MDC.put("usr", trainee.get(i).getUserName());
			logger.info("==========================");
			logger.info(trainee.get(i).getName());
			logger.info("==========================");
			logger.info("Task List");
			logger.info("==========================");
			trainee.get(i).TaskDetails();
			logger.info("");
		}
	}
}
