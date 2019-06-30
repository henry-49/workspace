package com.myfirstsession;

public class MyFirstApp {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		MyFirstApp fa = new MyFirstApp();
		fa.print();
		
		Cars c = new Cars();
		c.speeds();
		

	}
	
	public void print(){
		String name = "Henry";
		System.out.println("Hello World, my name is "+name);

	}

}
