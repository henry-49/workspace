package com.iluv2code.servletdemo.mvctwo;

import java.util.*;

public class StudentDataUtil {
	public static List<Student> getStudents(){
		
		//create an empty list
		List<Student> students =new ArrayList();
		
		// add sample data
		students.add(new Student("Henry", "Smith", "henry@web.de"));
		students.add(new Student("Jason", "Hans", "jason@web.de"));
		students.add(new Student("Tom", "Yunk", "tom@web.de"));
		students.add(new Student("Wilson", "Kelly", "wilson@web.de"));
		
		// return the list
		return students;
	}
}
