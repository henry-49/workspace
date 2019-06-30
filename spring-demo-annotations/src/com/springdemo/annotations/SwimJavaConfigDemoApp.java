package com.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read the spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		//Coach theCoach = context.getBean("myCoach", Coach.class);
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean 
		System.out.println(theCoach.getDailyWorkOut());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods ... has the property value injection
		System.out.println("Email: "+ theCoach.getEmail());
		System.out.println("Team: "+ theCoach.getTeam());
		
		//close the context
		context.close();

	}

}
