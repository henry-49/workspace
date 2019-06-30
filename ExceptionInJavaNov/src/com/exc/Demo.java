package com.exc;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample obj = new ThrowsExample();
		try {
			obj.mymethod(1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
 class ThrowsExample{
	 void mymethod(int num)throws IOException, ClassNotFoundException{
		 if(num==1)
			 throw new IOException("Exception Message1");
		 else
			 throw new ClassNotFoundException("Exception Message2");
	 }
}