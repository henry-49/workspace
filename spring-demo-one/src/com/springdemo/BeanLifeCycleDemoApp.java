package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the bean configuration file
			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
			
		//retrieve bean from spring container
			Coach theCoach = context.getBean("myCoach2", Coach.class);
			
			Coach theCoach2 = context.getBean("myCoach", Coach.class);
			
			//Coach alphaCoach = context.getBean("myCoach2", Coach.class);
			
			// call the method
			System.out.println("TrackCoach: "+theCoach.getDailyWorkOut());
			System.out.println("================================================\n");
			System.out.println("BaseballCoach: "+theCoach2.getDailyWorkOut());
			
			// check if they are the same object
			//Boolean result = (theCoach == alphaCoach);
			
			// print out result
			//System.out.println("\nPointing to the same object: "+result);
			
			System.out.println("\nMemory location for theCoach: "+theCoach);
			
		
		// call the method
		//System.out.println(theCoach.getDailyWorkOut());
			
		//close the context
			context.close();

	}

}
