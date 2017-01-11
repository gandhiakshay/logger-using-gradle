package com.axelor.app;

public class TestMain {
	
	public static void main(String[] args) {
		
		Trainee agaAxelor = new Trainee("Akshay", "aga");
		Trainee jsoAxelor = new Trainee("Jai", "jso");
		Trainee ugoAxelor = new Trainee("Umesh", "ugo");
		Trainee tboAxelor = new Trainee("Tushar", "tbo");
		Trainee mmahAxelor = new Trainee("Mayank", "mmah");

		agaAxelor.assign(new Task("JUnit", "Create one demo java Application for jUnit Testing"));
		agaAxelor.assign(new Task("Slf4j", "Create one demo java Application to make custom logging system"));
		agaAxelor.assign(new Task("Git", "Create single app, maintain different programs in different branch"));

		jsoAxelor.assign(new Task("Eclipse", "Kindly check all custom settings for eclipse project"));

		ugoAxelor.assign(new Task("Project Report", "Kindly submit all project reports to college"));

		tboAxelor.assign(new Task("Gradle", "Create java app using gradle [Hint: apply dependency]"));

		mmahAxelor.assign(new Task("Training", "Teaching to axelor team"));

		Team axelor= new Team("Axelor Trainees");
		axelor.addMember(agaAxelor);
		axelor.addMember(jsoAxelor);
		axelor.addMember(ugoAxelor);
		axelor.addMember(tboAxelor);
		axelor.addMember(mmahAxelor);

		axelor.logReports();
	}
}
