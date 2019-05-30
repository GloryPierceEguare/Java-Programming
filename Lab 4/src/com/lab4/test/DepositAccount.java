package com.lab4.test;

public class DepositAccount extends Account implements ValidatedAccount
{
	//Attributes
	double interestRate;
	
	//Constructor: Set attributes with values
	public DepositAccount(String accountName, String sortCode, String branchName, boolean inCredit, double acctBalance, double interestRate)
	{
		super(accountName,sortCode,branchName,inCredit,acctBalance);
		this.interestRate = interestRate;
	}
	
	//Method: Withdraw
	public void withdraw(double takeAmount, double acctBalance)
	{
		System.out.println("\nYou cannot withdraw from a deposit account");
	}
	
	public double getIntrestRate() 
	{
		return interestRate;
	}

	public void setIntrestRate(double intrestRate) 
	{
		this.interestRate = intrestRate;
	}
	
	public void getDetails(String accountName, double acctBalance)
	{
		System.out.println("Account type Deposit");
		System.out.println(accountName);
		System.out.println(acctBalance);
		
	}
	
	public void valuableAccount(double acctBalance)
	{
		System.out.println("Account balance is "+acctBalance);
	
	}
}
