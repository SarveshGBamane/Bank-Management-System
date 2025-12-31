package com.serviceImp;

import java.util.Scanner;

import com.app.model.Bank;
import com.app.service.BankServices;

public class BankServiceImp implements BankServices {
	
	Scanner sc = new Scanner(System.in);
	
	Bank b = new Bank();
	
	
//	long accNum = 1_000_000_000L +
//            (long)(Math.random() * 9_000_000_000L);
	
	double amt ;
	double finalBalance;

	boolean isAccCreated = false;
	

	@Override
	public void createAccount() {
		
		System.out.println("Enter your name: ");
		b.setAccHolderName(sc.nextLine());
		
		System.out.println("Enter your mobile: ");
		b.setMobile(sc.nextLong());
		
		sc.nextLine();
		System.out.println("Enter your Gender: ");
		b.setGender(sc.nextLine());
		
		
		
		System.out.println("Enter your adhar number: ");
		b.setAdharNumber(sc.nextLong());
		
		long accNum = 1_000_000_000L + (long)(Math.random() * 9_000_000_000L);
		b.setAccNumber(accNum);
		
		
		isAccCreated = true;
		
		
		
	}

	@Override
	public void accountDetails() {
		
		if(isAccCreated) {
			System.out.println("******* Bank Details *******");
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			System.out.println("Name : "+b.getAccHolderName());
			System.out.println("Account Number : "+b.getAccNumber());
			System.out.println("Account Balance : "+b.getBalance());
			System.out.println("Gender : "+b.getGender());
			System.out.println("Mobile : "+b.getMobile());
			System.out.println("Adhar Number : "+b.getAdharNumber());
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		else {
			System.out.println("Please create account ");
		}
	}

	@Override
	public void depositAmount() {
		
		if(isAccCreated) {
			System.out.println("Enter the Amount : ");
			amt = sc.nextDouble();
			

			
			if(amt>0) {
				b.setBalance(b.getBalance()+amt);
				System.out.println("Amount Deposited Successfully");
			}
		}
		else {
			System.out.println("Please create account ");
		}
		
	}

	@Override
	public void withdrawAmount() {
		
		
		if(isAccCreated) {
			System.out.println("Enter the Amount : ");
			amt = sc.nextDouble();
			

			
			if(amt>0) {
				if (amt <= b.getBalance()) {
		            b.setBalance(b.getBalance() - amt);
		            System.out.println("Withdrawal Successful");
		        } else {
		            System.out.println("Insufficient Balance");
		        }
			}
			else {
				System.out.println("Please create account ");
			}
			
		}
	}

	@Override
	public void viewBalance() {
		
		if(isAccCreated) {
			System.out.println("******* Your Balance *******");
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			System.out.println("Available Balance : "+ b.getBalance());
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		else {
			System.out.println("Please create account ");
		}
		
	}

}
