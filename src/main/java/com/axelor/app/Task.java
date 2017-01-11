package com.axelor.app;

import java.util.ArrayList;

public class Task {
	
	ArrayList<String> title = new ArrayList<>();
	ArrayList<String> description = new ArrayList<>();
	
	public Task() {
	}
	
	public Task(String tname,String desc) {
		title.add(tname);
		description.add(desc);
	}

	public ArrayList<String> getTitle() {
		return title;
	}

	public void setTitle(ArrayList<String> title) {
		this.title = title;
	}

	public ArrayList<String> getDescription() {
		return description;
	}

	public void setDescription(ArrayList<String> description) {
		this.description = description;
	}
}
