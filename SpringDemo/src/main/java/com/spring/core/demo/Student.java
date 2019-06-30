package com.spring.core.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name ="Jason";
	private String course ="Math";
	
	@Autowired
	public Address address;
	/*public void init() {
		System.out.println("Student intances is created at "+ new Date());
	}*/
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	/*public void destroy() {
		System.out.println("Student intances is destroyed at "+ new Date());
	}*/
}
