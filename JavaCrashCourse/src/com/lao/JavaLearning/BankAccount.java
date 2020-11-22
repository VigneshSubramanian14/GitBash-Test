package com.lao.JavaLearning;

public class BankAccount {

	long AccountNumber = 2345678l;
	
	int AccountBalance = 650;
	
	String AccountName = "Balavignesh";
	
	char Initial = 'A';
	
	
	public void accountBalance() {
		
		System.out.println("The Account Balance is" +AccountBalance);
	}
	
	public void accountName() {
		System.out.println("The AccountName is" +AccountName);
	}
	
	public void accountInitial() {
		
		System.out.println("The Initial for the Account is " +Initial);
	}
	
	
	public static void main(String[] args) {
		
		
		BankAccount account = new BankAccount(); //call the methods using object.
		
		//This is the reason we call Java as Object Oriented Programming Language
		
		
		account.accountBalance(); // Only void can be Printed because we gave System.Out.println there
		
		account.accountName();
		
		// account.AccountName(); // Incase of int Float we cannot print it because it is an object for that Datatype
		
		

	}

}
