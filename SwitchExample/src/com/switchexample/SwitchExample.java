package com.switchexample;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number below 2");
		int numone = sc.nextInt();
		
		System.out.println("Enter second number below 2");
		int numsecond = sc.nextInt();
		
		int sum = numone + numsecond;
		
		switch(sum){
		case 0: System.out.println("sum is 0");
			break;
		case 1: System.out.println("sum is 0");
		break;
		case 2: System.out.println("sum is 0");
		break;
		case 3: System.out.println("sum is 0");
		break;
		case 4: System.out.println("sum is 0");
		break;
		default: System.out.println("sum is 0");
		break;
		
		}
	}

}
