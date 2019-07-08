package exceptionexample;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		int num1;
		int num2;
		//int num3;
		int ans;
		int array_1[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
	
		//try block (the code which may be contain exception)
		try
		{
			ans=num1/num2;
			System.out.println("Answer is : "+ans);
			
			try 
			{
				array_1[2]=1000000000;
				int a=10;
				int b=1000000000;
				int c=a*b;
				//num3=sc.nextInt();
				//ans=num3/0;
				System.out.println("Value of C is \n(As per the predefined value) :"+c);
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("\n\nPlease change the value!"+e);
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("\n\nPlease don't input zero!");
			}
			
		}
		
		//catch block (handling code)
		catch (Exception e) 
		{
			// TODO: handle exception
			//System.out.println("\n\nUser Defined/User Edited : \n\n\nPlease don't input 0!\n\nOR\n");
			//System.out.println("\n"+e);
			//e.printStackTrace();
			try {
				
			}
			catch(Exception e1)
			{
				
			}
		}
		
		//the block which will be executed always
		finally 
		{
			//System.out.println("\n\n\nSystem Defined : \n");
			//int ans=num1/num2;
			//System.out.println("Answer is : "+ans);
			//sc.close();
		}
	}
}

