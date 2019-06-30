package com.springdemo.annotations;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
	// define private field FortuneService injection
	private FortuneService fortuneService;
	
	// define field level injection
	@Value("${foo.team}")
	private String team;
	
	@Value("${foo.email}")
	private String email;	
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Swim 1000 meters as a warm up!!";
	}

	@Override
	public String getDailyFortune() {
		String theFortune = fortuneService.getFortune();
		return theFortune;
	}

	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}

	/*
	 private String[] data;
	    
	    @PostConstruct
	    public void setupMyData() {
	        
	        data = new String[5];
	        
	        String a;
			data[0] = a;
	        data[1] = b;
	        data[2] = c;
	        data[3] = d;
	        data[4] = e;
	        
	    }
*/
		
}
