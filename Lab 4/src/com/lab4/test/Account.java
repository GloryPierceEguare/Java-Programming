/*******************************************
 * Account:...............................................
 * Author: Glory Pierce Eguare
 * Date: 20/02/19
 */

package com.lab4.test;

public class Account implements ValidatedAccount
{
	//Attributes
	private String accountName;
	private int accountNumber;
	private String sortCode;
	private String branchName;
	private boolean inCredit;
	private double acctBalance;
	private static int currentNumber = 0;
	
	//Constructor: Set attributes with values
	Account(String accountName, String sortCode, String branchName, boolean inCredit, double acctBalance)
	{
		this.accountName = accountName;
		//this.accountNumber = accountNumber;
		this.sortCode = sortCode;
		this.branchName = branchName;
		this.inCredit = inCredit;
		this.acctBalance = acctBalance;
		currentNumber = currentNumber + 1;
		this.accountNumber = currentNumber;
		System.out.println(accountNumber);
	}
	
	//Method: Deposit
	public void deposit(double depAmount)
	{
		acctBalance = acctBalance + depAmount;
		System.out.println("Deposit\nYour new balance: €"+acctBalance);
	}
	
	//Method: Withdraw
	public void withdraw(double takeAmount)
	{
		acctBalance =  acctBalance - takeAmount;
		
		if(acctBalance < 0)
		{
			inCredit = false;
		}
		System.out.println("Withdraw\nYour new balance: €"+acctBalance);
	}
	
	//Getter and Setter accountName
	public String getAccountName() 
	{
		return accountName;
	}
	public void setAccountName(String accountName) 
	{
		this.accountName = accountName;
	}
	
	//Getter and Setter accountNumber
	public int getAccountNumber() 
	{
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	
	//Getter and Setter sortCode
	public String getSortCode() 
	{
		return sortCode;
	}
	public void setSortCode(String sortCode) 
	{
		this.sortCode = sortCode;
	}
	
	//Getter and Setter branchName
	public String getBranchName() 
	{
		return branchName;
	}
	public void setBranchName(String branchName) 
	{
		this.branchName = branchName;
	}
	
	//Getter and Setter inCredit
	public boolean isInCredit() 
	{
		return inCredit;
	}
	public void setInCredit(boolean inCredit) 
	{
		this.inCredit = inCredit;
	}
	
	//Getter and Setter acctBalance
	public double getAcctBalance() 
	{
		return acctBalance;
	}
	public void setAcctBalance(double acctBalance) 
	{
		this.acctBalance = acctBalance;
	}
	
	public void getDetails()
	{
		System.out.println("Account type Account");
		System.out.println(getAccountName());
		System.out.println(getAcctBalance());
		
	}
	
	public void valuableAccount()
	{
		System.out.println("Accunt balance is "+getAcctBalance());
	
	}
}
