package com.demo3;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Thread t1 = new Thread(new Runnable(){
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
 });
 
 t1.start();
	}

}
