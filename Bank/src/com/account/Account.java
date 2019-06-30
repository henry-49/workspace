package com.account;

public class Account {
	private String name;
	private String number;
	//private double amount;
	private double balance;
	private String email;
	private String phone;
	
	public void DepositAmount(double damount) {
		this.balance += damount;
		System.out.println(" Your current balance is: "+ balance);
	}
	
	public void WithdrawAmount(double wamount) {
		//this.balance = balance - wamount;
		if(balance <=0 ||  balance < wamount) {
			System.out.print("Sorry!! you can not make withdraw due to insuficent fund");
			System.out.println("your current balance is: "+this.balance);
		}else {
			this.balance -= wamount;
			System.out.println("Amount withdraw is: "+wamount+" and your current balance is: "+this.balance);
		}
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
