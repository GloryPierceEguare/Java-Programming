package com.lab4.test;

public class CurrentAccount extends Account
{
	//Attributes
	double penaltyAmount;
	
	//Constructor: Set attributes with values
	public CurrentAccount(String accountName, String sortCode, String branchName, boolean inCredit, double acctBalance, double penaltyAmount)
	{
		super(accountName,sortCode,branchName,inCredit,acctBalance);
		this.penaltyAmount = penaltyAmount;
	}
	
	//Method: Withdraw
	public void withdraw(double takeAmount, double acctBalance)
	{
		if(acctBalance < takeAmount)
		{
			System.out.println("Insufficient funds!");
		}
		else
		{
			acctBalance = acctBalance - takeAmount;
			System.out.println("Your new Account Balance is: €"+acctBalance);
		}
	}
		
	//Method: Check Credit
	public void checkCredit()
	{
		if(getAcctBalance() <= 0)
		{
			setInCredit(false);
		}
		if(isInCredit() == false)
		{
			System.out.println("Your account is not in credit");
		}
		else
		{
			System.out.println("Your account is in credit");
		}
		if(getAcctBalance() < 100 && getAcctBalance() > 0)
		{
			String warningMessage;
			warningMessage = "WARNING your balance is going low ";
			checkCredit(warningMessage);
		}
	}
	
	public void checkCredit(String Message)
	{
		System.out.println(Message);
	}
	
	public void getDetails()
	{
		System.out.println("Account type Current");
		System.out.println(getAccountName());
		System.out.println(getAcctBalance());
	}
	public void valuableAccount(double acctBalance)
	{
		System.out.println("Account balance is "+acctBalance);
	
	}
}
