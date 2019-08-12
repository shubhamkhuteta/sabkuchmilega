package com.recharge.ui;

import java.util.Scanner;

import com.recharge.services.RechargeService;
import com.recharge.services.RechargeServiceI;

public class MainUI {
	
	private static RechargeService rs=new RechargeService();
	
	static RechargeService getService() {
		return rs;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Mobile no. : ");
		String mobNo=sc.next();
		System.out.println("Enter your Name : ");
		String name=sc.next();
		RechargeServiceI rsI= (RechargeServiceI) getService();
		
		
		
	}
	
}
