package com.exc;

public class AThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		AThrow.sum(0, 10);
		}catch(ArithmeticException ar){
			System.out.println("First Parameter can not be zero");
		}
	}
	static int sum(int num1, int num2){
		if(num1 == 0)
			throw new ArithmeticException("First Parameter is not Valid");
		else
			System.out.println("All Parameters are correct");
		return num1 + num2;
	}
}
