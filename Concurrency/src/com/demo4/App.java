package com.demo4;

import java.util.Scanner;

class Processor extends Thread{
		 private volatile boolean running = true;
		 
		 public void run(){
			 while(running){
				 System.out.println("Hello World");
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			 }
		 }
		 public void shotdown(){
			 running = false;
		 }
	 }
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor p = new Processor();
		p.start();
		System.out.println("press any key to stop....");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		p.shotdown();
		
		
	}

}
