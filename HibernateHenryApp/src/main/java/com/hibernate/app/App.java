package com.hibernate.app;


import org.hibernate.Session;
import model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	User user =	session.get(User.class, 1);
    	System.out.println(user.getId());
    	System.out.println(user.getName());
    	System.out.println(user.getAge());
    	System.out.println(user.getCity());
    	session.close();
    }
}
