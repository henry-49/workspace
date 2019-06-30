package com.springdemo;

public class BaseballCoach implements Coach{
	// define private field for the Dependency
	private FortuneService fortuneService;
	
	
	// define a constructor for dependency injection 
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
	
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}

	// add an init method
	
		public void doMyStartupStuff() {
			System.out.println("BaseballCoach: inside method doMyStartupStuff");
		}
		
		// add destroy method
		public void doMyCleanupStuff() {
			System.out.println("BaseballCoach: inside method doMyCleanupStuff");
		}
		
	
}
