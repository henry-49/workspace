package com.account;

public class Acc {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.setName("Henry");
		a1.setNumber("0182930189");
		a1.setEmail("h@web.de");
		a1.setPhone("018730292");
		a1.setBalance(0);
		
		a1.DepositAmount(100);
		a1.WithdrawAmount(30);
	}

}
