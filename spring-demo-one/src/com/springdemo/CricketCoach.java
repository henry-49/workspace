package com.springdemo;

public class CricketCoach implements Coach {
 // define private field for fortuneService dependency
	private FortuneService fortuneService;
	
	private String email;
	private String team;
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	// our setter method that will be called by spring dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside the setter method -setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Pratice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}

}
