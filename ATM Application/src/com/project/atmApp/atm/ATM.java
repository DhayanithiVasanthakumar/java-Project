package com.project.atmApp.atm;

public class ATM {
	private double amount;
	private double withdrawAmount;
	private double depositAmount;
	private double balance;
	
	/*
	 * default constructor
	 */
	public ATM() {
		
	}
	
	
	/*
	 * getter and setter
	 */
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount=depositAmount;
	}
	
	
	public double getWithDrawAmount() {
		return withdrawAmount;
	}
	public void setWithDrawAmount(double withdrawAmount) {
		this.withdrawAmount=withdrawAmount;
	}
	
	
}