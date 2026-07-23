package com.constructor;

public class BankProcessor {
	
	public static void main (String[] args) {
		BankAccount b=new BankAccount(1023,"Danny",100000);
		System.out.println("Account Number:"+b.getAcc_num());
		System.out.println("Account HolderName:"+ b.getAcc_holder());
		System.out.println("Current Balance:"+ b.getBalance());
		b.deposite(100000);
		b.withdraw(100000);
		
	}

}
