package com.constructor;

public class BankAccount {
	int acc_num;
	String acc_holder;
	double balance;
	
	public BankAccount(int acc_num,String acc_holder,double balance) {
		this.acc_num=acc_num;
		this.acc_holder=acc_holder;
		this.balance=balance;
		
	}

	public int getAcc_num() {
		return acc_num;
	}

	public String getAcc_holder() {
		return acc_holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposite(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Current balance atfer Deposite:"+ balance);
		}
	}
	public void withdraw(double amount) {
		if(balance>amount) {
			balance-=amount;
			System.out.println("Current Balance After withdraw:"+ balance);
		}
	}
	

}
