package com.testing;

import java.util.Scanner;

public class AssertionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		
		int value = scan.nextInt();
		assert value >=18:"Not elegible to vote";
		System.out.println("value is "+ value);
	}

}
