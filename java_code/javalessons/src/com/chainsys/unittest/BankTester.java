package com.chainsys.unittest;

import com.chainsys.variables.Bank;

public class BankTester {
	
	public static void testDeposit() {
		System.out.println("Balance of before deposit: "+ Bank.currentBalance);
		int deposit=Bank.deposit(10000);
		System.out.println("The deposit amount: " + deposit);
		
		System.out.println("Balance of after deposit: "+ Bank.currentBalance);
	
		
	}
	public static void testWithdraw() {
		System.out.println("Balance of before withdraw: "+Bank.currentBalance);
		int withdraw=Bank.withdraw(5000);
		System.out.println("The withdraw amount: "+ withdraw);
		System.out.println("Balance of after withdraw: "+ Bank.currentBalance);
	}
	
	public static void testOpenAccount() {
		Bank.openAccount("kowsi",12798798);
		System.out.println("Account Holder Name: " + Bank.accountHolderName);
		System.out.println("Account Number: " + Bank.accountNumber);
		
		
	}}
	

