package com.demo1;

class Runner extends Thread{
	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println("Printing "+ i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Runner r = new Runner();
		r.start();
		//r.run();
		System.out.println("Hello Henry");
		
		Runner r2 = new Runner ();
		r2.start();
		r2.run();
	}

}
