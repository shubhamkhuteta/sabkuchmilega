package collectionexample;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
	public static void main(String[] args) 
	{
		
		int i=200;
		System.out.println("Hash Map Values : \n");
		AccountInfo ai1=new AccountInfo("Airtel", "Shubham",i);
		AccountInfo ai2=new AccountInfo("Idea", "Raghav",i);
		AccountInfo ai3=new AccountInfo("Vodafone", "Pankaj",i);
		AccountInfo ai4=new AccountInfo("Idea", "Sanskar",i);
		AccountInfo ai5=new AccountInfo("Airtel", "Bhushan",i);
		AccountInfo ai6=new AccountInfo("Vodafone", "Manish",i);
		AccountInfo ai7=new AccountInfo("BSNL", "Gopal",i);
	
		
		HashMap<String, AccountInfo> hm = new HashMap<String, AccountInfo>();
		hm.put("9876541231",ai1);
		hm.put("8795462156",ai2);
		hm.put("8979246247",ai3);
		hm.put("9752375645",ai4);
		hm.put("9577178247",ai5);
		hm.put("9876598521",ai6);
		hm.put("9876599311",ai7);
		
		
		//asking for choice
		System.out.println("Enter your choice : \n1. Account Balance\n2. Recharge my account\n3. Remove your account\n4. Update Account Info");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		if(input==1) 
		{
			NumberOne(hm);
		}
		else if(input==2)
		{
			NumberTwo(hm);
		}
		else if(input==3) 
		{
			NumberThree(hm);
		}else if(input==4) 
		{
			NumberFour(hm);
		}
	}

	static void NumberOne(HashMap hm) {
		System.out.println("Enter your phone no. : ");
		Scanner pn=new Scanner(System.in);
		String phoneno=pn.nextLine();
		
		if(hm.containsKey(phoneno)) 
		{
			System.out.println("--------Account Info-------\n");
			AccountInfo ai_1=(AccountInfo) hm.get(phoneno);
			System.out.println("Name : "+ai_1.sp);
			System.out.println("Service Provider : "+ai_1.name);
			System.out.println("Balance : "+ai_1.balance);
		}	
		else 
		{
			System.out.println("Phone no not exist!");
		}
	}
	
	static void NumberTwo(HashMap hm) {
		System.out.println("Enter your phone no. : ");
		Scanner pn=new Scanner(System.in);
		String phoneno=pn.nextLine();
		
		if(hm.containsKey(phoneno)) 
		{
			System.out.println("Exist!!");
			AccountInfo ai_1=(AccountInfo) hm.get(phoneno);
			System.out.println("Enter amount : ");
			Scanner am=new Scanner(System.in);
			int amt=am.nextInt();
			amt+=ai_1.balance;
			ai_1.balance=amt;
			System.out.println("Name : "+ai_1.sp);
			System.out.println("Service Provider : "+ai_1.name);
			System.out.println("Balance : "+ai_1.balance);
			System.out.println(hm);
		}else 
			{
			System.out.println("No not fount!");
			}
	}
	
	static void NumberThree(HashMap hm){
		System.out.println("Enter your phone no. : ");
		Scanner pn=new Scanner(System.in);
		String phoneno=pn.nextLine();
		
		if(hm.containsKey(phoneno)) 
		{
	
			AccountInfo ai_1=(AccountInfo) hm.get(phoneno);
			AccountInfo ai_2=(AccountInfo) hm.get(ai_1);
		
			hm.remove(ai_1);
			//System.out.println(hm);
			//hm.remove(phoneno,ai_1);
			//System.out.println(hm.remove(phoneno, ai_2));
			
			 AccountInfo returned_value = (AccountInfo)hm.remove(phoneno); 
			 //System.out.println(returned_value);
		     // Verifying the returned value 
		     //System.out.println("Returned value is: "+ returned_value);
			 System.out.println("New records are : "+hm);
		   
			if(hm.get(phoneno)==null) 
			{
				System.out.println("Account successfully deleted!");
			}
			
			System.out.println("Name : "+ai_1.sp);
			System.out.println("Balance : "+ai_1.balance);
			System.out.println("Service Provider : "+ai_1.name);
			
		}
		else
		{
			System.out.println("No not fount!");	
		}
	}			
	
	static void NumberFour(HashMap hm) {
		System.out.println("Enter your phone no. : ");
		Scanner pn=new Scanner(System.in);
		String phoneno=pn.nextLine();
		
		if(hm.containsKey(phoneno)) 
		{
	
			AccountInfo ai_1=(AccountInfo) hm.get(phoneno);
		
		
			hm.put(phoneno,ai_1);
			
			
			
			//System.out.println(hm);
			//hm.remove(phoneno,ai_1);
			//System.out.println(hm.remove(phoneno, ai_2));
			
			 AccountInfo returned_value = (AccountInfo)hm.remove(phoneno); 
			 //System.out.println(returned_value);
		     // Verifying the returned value 
		     //System.out.println("Returned value is: "+ returned_value);
			 System.out.println("New records are : "+hm);
		   
			if(hm.get(phoneno)==null) 
			{
				System.out.println("Account successfully deleted!");
			}
			
			System.out.println("Name : "+ai_1.sp);
			System.out.println("Balance : "+ai_1.balance);
			System.out.println("Service Provider : "+ai_1.name);
			
		}
		else
		{
			System.out.println("No not fount!");	
		}
	}
}

class AccountInfo{
	int balance;
	String name,sp;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSp() {
		return sp;
	}

	public void setSp(String sp) {
		this.sp = sp;
	}

	public AccountInfo(String name, String sp, int balance) 
	{
	this.name=name;
	this.sp=sp;
	this.balance=balance;
	}

	@Override
	public String toString() 
	{
		return "AccountInfo [balance=" + balance + ", name=" + name + ", sp=" + sp + "]";
	}
}