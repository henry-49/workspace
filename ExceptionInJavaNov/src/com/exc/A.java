package com.exc;

import java.util.Scanner;

public class A {
	static int res;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int no1 = sc.nextInt();
		System.out.println("Enter secornd number");
		int no2 = sc.nextInt();
	
		A  ac = new A();
		try{
			res = ac.divide(no1, no2);
			
			System.out.println(res);
		}catch(ArithmeticException e){
			System.out.println("Number can not be divid by zero");
		}
		
		
	}
	public  int divide(int a, int b){
		return a/b;
	}
}
