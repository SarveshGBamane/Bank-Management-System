package com.app.ui;

import java.util.Scanner;

import com.serviceImp.BankServiceImp;

public class BankUI {
	
	public static void main(String[] args) {
		BankServiceImp bsi = new BankServiceImp();
		
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		while(true) {
			System.out.println("******Bank Managment System******");
			
			System.out.println("1.Create your Account");
			System.out.println("2.View Account Details");
			System.out.println("3.View Balance");
			System.out.println("4.Deposit");
			System.out.println("5.Withdrawal");
			System.out.println("6.Exit");

			System.out.println("Enter your Choice :");
			
			try {
				ch = sc.nextInt();
				
				
				switch(ch) {
					
				case 1:
				{
					bsi.createAccount();
					break;
				}
				case 2:
				{
					bsi.accountDetails();
					break;
				}
				
				case 3:
				{
					bsi.viewBalance();
					break;
				}
				
				case 4:
				{
					bsi.depositAmount();
					break;
				}
				
				case 5:
				{
					bsi.withdrawAmount();
					break;
				}
				
				case 6:
				{
					
					System.out.println("Thank you for using Bank Management System!");
				    
				    System.exit(0);
				}
				
				default :{
					System.out.println("Invalid Choice");
				}
				}
			}
			catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine(); 
                continue;
            }

		}
	}
	
}
