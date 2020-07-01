package com.demo2;


class Runner implements Runnable{
	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println("Printing "+ i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Runner());
		t1.start();
		//r.run();
		System.out.println("Hello Henry");
		
		Thread t2 = new Thread(new Runner());
		t2.start();
	}

}