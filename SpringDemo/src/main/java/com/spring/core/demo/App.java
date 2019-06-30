package com.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
       // Student st = context.getBean(Student.class);
        Student st = (Student) context.getBean("student");
        System.out.println("Name: "+ st.getName());
        System.out.println("Course: "+ st.getCourse());
   
        System.out.println("Line1: "+ st.getAddress().getLine1());
        System.out.println("Line2: "+ st.getAddress().getLine2());
        System.out.println("Line3: "+ st.getAddress().getLine3());
        
        // To shut down context
        // ((ConfigurableApplicationContext) context).registerShutdownHook();
       // DbConnection db = context.getBean(DbConnection.class, "dbConnection");
       // System.out.println("Username: "+ db.getUserName());
        
        
        
    }
}
