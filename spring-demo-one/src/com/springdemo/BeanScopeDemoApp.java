package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the bean configuration file
			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
			
		//retrieve bean from spring container
			Coach theCoach = context.getBean("myCoach2", Coach.class);
			
			Coach alphaCoach = context.getBean("myCoach2", Coach.class);
			
			// check if they are tha same object
			Boolean result = (theCoach == alphaCoach);
			
			// print out result
			System.out.println("\nPointing to the same object: "+result);
			
			System.out.println("\nMemory location for theCoach: "+theCoach);
			
			System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
		
		// call the method
		//System.out.println(theCoach.getDailyWorkOut());
			
		//close the context
			context.close();

	}

}
