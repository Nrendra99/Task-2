package com.Banking;

import java.util.Scanner;

public class BankAccount {
	
	String name;    //Create Instance Variable name
	double balance; //Create Instance Variable balance
	
	public BankAccount() { //default constructor since we have another parameterized constructor 
		
	}
	
	public BankAccount(String name ,double balance) {  //Parameterized constructor with attributes to initialize object BankAccount 
		this.name=name;
		this.balance=balance;
		
	}

	public double getBalance() {  //getters and setters method for each instance variable
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
	
	public void display(){        //method for printing Name and Balance
		System.out.println("Name:"+this.getName());
		 System.out.println("Balance: "+this.getBalance());
	}
	
	public double deposit(){      //method to add balance
		Scanner scanner=new Scanner(System.in); //scanner object to take input from user 
		 System.out.println("Enter the amount to deposit:");
	        double deposit = scanner.nextDouble(); // Read the deposit amount from the user 
	        
	        if (deposit > 0) {      // makes sure deposit amount is a positive number 
	            balance += deposit; // Adding deposit amount to the balance
	            System.out.println("Deposit successful. New balance: " + balance);
	        } 
	        else {                  //in case amount entered is negative 
	            System.out.println("Deposit amount must be greater than zero.");
	            scanner.close();    
	        }
	        return this.getBalance(); //updating new balance 
	    }
	
	public double withdrawal(){    //method to withdraw 
		Scanner scanner=new Scanner(System.in);  //scanner object to take input from user 
		 System.out.println("Enter the amount to Withdraw:");
	        double withdrawal = scanner.nextDouble(); // Read the withdrawal amount from the user
	        
	        if (withdrawal < balance) {//makes sure withdrawal amount is greater than balance 
	            balance -= withdrawal; // Deduct amount from the balance
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        } 
	        else {                  //in case withdrawal amount greater than balance 
	            System.out.println("Withdrawal amount must be less than Bank Balance.");
	            scanner.close();  
	        }
	        return this.getBalance();//updating new balance
	    }
	
	public static void main(String[]args) {
		
		BankAccount bankAcc1=new BankAccount("Narendra Kumar",50000); // creating object with name and age attributes 
		 
		 bankAcc1.display();    // Implementing method to print 
		 bankAcc1.deposit();    // Implementing method to add balance 
	     bankAcc1.withdrawal(); // Implementing method to withdraw balance 
	}

}
