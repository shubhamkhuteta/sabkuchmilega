package com.recharge.bean;

public class Recharge {
	private int mobNo;
	private int balance;
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Recharge(int mobNo, int balance) {
		super();
		this.mobNo = mobNo;
		this.balance = balance;
	}
	
	
}
