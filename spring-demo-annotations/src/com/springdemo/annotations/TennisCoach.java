package com.springdemo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("myCoach")
@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	// private field for fortuneService
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default Constructor 
	public TennisCoach() {
		
		System.out.println(">>TennisCoach: inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		
		System.out.println(">>TennisCoach: inside doMyStartupStuff() method");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
			
			System.out.println(">>TennisCoach: inside doMyCleanupStuff() method");
		}
	
	// define a Constructor injection
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
	*/
	
	// define setter autowired method injection
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}
	*/
	
	// define customize  autowired method injection
	/*
		@Autowired
		public void doSomeCrazyStuff(FortuneService fortuneService) {
			System.out.println(">>TennisCoach: inside doSomeCrazyStuff() method");
			this.fortuneService = fortuneService;
		}
		*/
	@Override
	public String getDailyWorkOut() {
		
		return "Pratice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
