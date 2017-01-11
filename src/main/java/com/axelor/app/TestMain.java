package com.axelor.app;

public class TestMain {

	public static void main(String[] args) {
		
		Trainee agaAxelor = new Trainee("Akshay", "aga");

		agaAxelor.assign(new Task("JUnit", "Create one demo java Application for jUnit Testing"));
		
		Team axelor= new Team("Axelor Trainees");
		
		axelor.addMember(agaAxelor);
	}
}
