package com.app.model;

public class Bank {
	
	private long accNumber;
	private String accHolderName;
	private double balance = 0.00;
	private long mobile;
	private String gender;
	private long adharNumber;
	
	
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	
	
}
