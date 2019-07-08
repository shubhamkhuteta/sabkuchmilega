package instancestaticexample;

import java.util.Scanner;

public class Test {

 
	
	
	public void method1()
	{
		System.out.println("Instance Method of test class");
	}
	
	public static void method2()
	{
		System.out.println("Ststic Method of test class");
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
	

	
	public static void main(String[] args) {
		
		Test.method2();
		Test test =new Test();
		test.method1();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=sc.nextInt();
		System.out.println("Enter second number");
		int second=sc.nextInt();
		
		
		int sum=test.add(first, second);
		int sub=test.sub(first, second);
		System.out.println(sum+"  "+sub);
	
	}


}
