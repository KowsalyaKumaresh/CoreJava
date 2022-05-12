package com.chainsys.variables;

public class Bank {

	public static int currentBalance;
	public static String accountHolderName;
	public static int accountNumber;
	
	public static int  deposit(int amount) {
		currentBalance=currentBalance + amount;
		return amount;
	
		
	}
	public static int withdraw(int amount) {
		currentBalance=currentBalance - amount;
		
		return amount;
	}
	
	public static void openAccount(String name,int number) {
		accountHolderName=name;
		accountNumber=number;
		
		
		
	
		
		
		
	}

}
