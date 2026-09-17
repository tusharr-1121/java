package com.app.geometry;

import java.util.Scanner;

class Customer
{
	long accountNumber;
	double beginBalance;
	double charges;
	double credits;
	double  creditLimit;
	double newBalance;
	
	public Customer() {}
	
	public Customer(long accountNumber, double beginBalance, double charges, double credits, double creditLimit) {
		super();
		this.accountNumber = accountNumber;
		this.beginBalance = beginBalance;
		this.charges = charges;
		this.credits = credits;
		this.creditLimit = creditLimit;
	}
	
	void accept() {

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter Account Number:");
	    this.accountNumber = sc.nextLong();

	    System.out.println("Enter Beginning Balance:");
	    this.beginBalance = sc.nextDouble();

	    System.out.println("Enter Total Charges:");
	    this.charges = sc.nextDouble();

	    System.out.println("Enter Total Credits:");
	    this.credits = sc.nextDouble();

	    System.out.println("Enter Credit Limit:");
	    this.creditLimit = sc.nextDouble();
	}
	



	void calaculateNewBalance()
	{
		newBalance = beginBalance+charges-credits;
		
		if(newBalance >creditLimit)
		{
			System.out.println("credit limit exceeded");
		}
		else
		{
			System.out.println("credit limit exceeded");
		}
	}
	
	void displayDetails()
	{
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Beginning Balance: " + beginBalance);
		System.out.println("Charges: " + charges);
		System.out.println("Credits: " + credits);
		System.out.println("Credit Limit: " + creditLimit);
		System.out.println("New Balance: " + newBalance);
	}
	
	
	
}



public class Program {

	
public static void main(String[] args) {
	Customer c = new Customer();
	c.accept();
	c.calaculateNewBalance();
	c.displayDetails();
}
	
}
