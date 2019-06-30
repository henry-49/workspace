package com.demo3;
class Runner1 implements Runnable{
	public void run(){
		
			
			try{
				System.out.println("Hey ");
				Thread.sleep(2000);
				Thread t2 = new Thread(new Runner2());
				t2.start();
				
				System.out.println("Hey ");
				Thread.sleep(2000);
				Thread t3 = new Thread(new Runner2());
				t3.start();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		
	}
}
class Runner2 implements Runnable{
	
	public void run(){
		try{
			System.out.println("Hello ");
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runner1());
		t1.start();
		
		
		
	}

}
