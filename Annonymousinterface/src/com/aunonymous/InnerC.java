package com.aunonymous;

public class InnerC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnonymousInter an = new AnnonymousInter(){
			public void test(){
				System.out.println("Annonymous calsss");
			}
		};
		an.test();
	}

}
