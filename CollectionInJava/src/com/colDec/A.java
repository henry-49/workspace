package com.colDec;

import java.util.*;
import java.util.Collection;

import javax.swing.SpringLayout.Constraints;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> l = new ArrayList();
		Collection c = new ArrayList();
		Random r = new Random();
		l.add(10);
		c.add(10);
		c.add("Henry");
		c.add(29.5f);
		
		System.out.println(c);
		for(int i= 1; i<100; i++){
			l.add(r.nextInt(1000));
		}
		Collections.sort(l);
		for(Integer i: l){
			System.out.println(i);
		}
		
	}

}
