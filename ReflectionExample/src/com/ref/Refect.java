package com.ref;

import java.lang.reflect.Method;

public class Refect {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Test t = new Test();
		Class c = Class.forName("com.ref.Test");
		Test tnew = (Test) c.newInstance();
		Method m = c.getDeclaredMethod("myName");
		m.setAccessible(true);
		m.invoke(tnew, null);
		
	}

}
